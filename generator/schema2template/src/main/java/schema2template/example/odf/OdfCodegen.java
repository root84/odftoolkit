/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2009, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package schema2template.example.odf;

import com.sun.msv.grammar.Expression;
import com.sun.msv.reader.trex.ng.RELAXNGReader;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParserFactory;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import schema2template.OutputFileListEntry;
import schema2template.OutputFileListHandler;
import schema2template.model.XMLModel;

/**
 * Three ODF examples in one:
 *  1) Create an ODF Reference in HTMLl
 *  2) Create Source Code
 *  3) Create simple ODF Python source
 *
 */
public class OdfCodegen {

    private Logger mLog = Logger.getLogger(OdfCodegen.class.getName());
    public static final String ODF_RESOURCE_DIR =  "target"
			+ File.separator + "classes"
		 	+ File.separator + "examples"
			+ File.separator + "odf";
	
    public static final String ODF12_RNG_FILE = "OpenDocument-schema-v1.2-cd03.rng";
	public static final String ODF11_RNG_FILE = "OpenDocument-schema-v1.1.rng";
	public static final int ODF11_ELEMENT_NUMBER = 507;
	public static final int ODF11_ATTRIBUTE_NUMBER = 840;

    private final String OUTPUT_FILES_TEMPLATE = "output-files.vm";
    private final String OUTPUT_FILES = "output-files.xml";
    private final String CONFIG_FILE = "config.xml"; 

    private XMLModel mOdf12SchemaModel;
    private XMLModel mOdf11SchemaModel;
    private OdfModel mOdfModel;
    private SourceCodeModel mJavaModel;

    public static void main(String[] args) throws Exception {
        new OdfCodegen().start();
    }

	// todo: schema compare scenario
    public void start() throws Exception {
        // calling MSV to parse the ODF 1.2 RelaxNG, returning a tree
        Expression odf12Root = loadSchema(new File(ODF_RESOURCE_DIR + File.separator + ODF12_RNG_FILE));

        // calling MSV to parse the ODF 1.1 RelaxNG, returning a tree
        Expression odf11Root = loadSchema(new File(ODF_RESOURCE_DIR + File.separator + ODF11_RNG_FILE));

		// Read config.xml 2DO WHAT IS ODFDOM GENERATOR CONFIG FILE
		// Manual added Java specific info - Base class for inheritance
        Map<String, String> elementToBaseNameMap = new HashMap<String, String>();
		// Manual added ODF specific info - style family mapping 
        Map<String, List<String>> elementStyleFamiliesMap = new HashMap<String, List<String>>();
		// 2DO - still existent? -- Manual added Java specific info - mapping ODF datatype to Java datatype  -> {odfValueType, javaConversionClassName}
        Map<String, String[]> datatypeValueAndConversionMap = new HashMap<String, String[]>(); 
        Map<String, OdfModel.AttributeDefaults> attributeDefaultMap = new HashMap<String, OdfModel.AttributeDefaults>();
        OdfConfigFileHandler.readConfigFile(new File(ODF_RESOURCE_DIR + File.separator + CONFIG_FILE), elementToBaseNameMap, attributeDefaultMap, elementStyleFamiliesMap, datatypeValueAndConversionMap);

        mOdf12SchemaModel = new XMLModel(odf12Root);
        mOdf11SchemaModel = new XMLModel(odf11Root);
        mOdfModel = new OdfModel(elementStyleFamiliesMap, attributeDefaultMap);
		// Needed for the base classes - common attributes are being moved into the base classes
        mJavaModel = new SourceCodeModel(mOdf12SchemaModel, mOdfModel, elementToBaseNameMap, datatypeValueAndConversionMap);

        fillTemplates(ODF_RESOURCE_DIR + File.separator + "odf-reference", odf12Root);
		fillTemplates(ODF_RESOURCE_DIR + File.separator + "odfdom-java", odf12Root);
		fillTemplates(ODF_RESOURCE_DIR + File.separator + "odfdom-python", odf12Root);
    }


	private void fillTemplates(String sourceDir, Expression root) throws Exception {
        // intialising template engine (ie. Velocity)
        Properties props = new Properties();
        props.setProperty("file.resource.loader.path", sourceDir);
        VelocityEngine ve = new VelocityEngine(props);
        ve.init();

        // Create output-files.xml
		createOutputFileList(ve, sourceDir, root);
		mLog.info("DONE.\n");


        // Process output-files.xml, create output files
        mLog.fine("Processing output files... ");
        processFileList(ve, sourceDir, root);
        mLog.fine("DONE.\n");
	}

    /**
     * Load and parse a Schema from File.
     *
     * @param rngFile
     * @return MSV Expression Tree (more specific: The tree's MSV root expression)
     * @throws Exception
     */
    public Expression loadSchema(File rngFile) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);

        Expression root = RELAXNGReader.parse(
                rngFile.getAbsolutePath(),
                factory,
                new com.sun.msv.reader.util.IgnoreController()).getTopLevel();
        

        if (root == null) {
            throw new Exception("Schema could not be parsed.");
        }
        return root;
    }

    private VelocityContext getContext(String contextStr, String param) {
        VelocityContext context = new VelocityContext();
        context.put("model", mOdf12SchemaModel);
        context.put("oldmodel", mOdf11SchemaModel);
        context.put("odfmodel", mOdfModel);
        context.put("javamodel", mJavaModel);
        context.put("context", contextStr);
        context.put("param", param);
        return context;
    }

    private void createOutputFileList(VelocityEngine ve, String sourceDir, Expression root) throws Exception {
        VelocityContext context = getContext(null, null);

        FileWriter listout = new FileWriter(new File(sourceDir + File.separator + OUTPUT_FILES));
        String encoding = "utf-8";
        ve.mergeTemplate(OUTPUT_FILES_TEMPLATE, encoding, context, listout);
        listout.close();
    }


    private String generateFilename(String rawName) {
        File retfile = new File(".");
        StringTokenizer toktok = new StringTokenizer(rawName.replaceAll(":", "_"), "/");
        while (toktok.hasMoreTokens()) {
            retfile = new File(retfile, toktok.nextToken());
        }
        return retfile.getPath();
    }

    private void ensureParentFolders(File newFile) {
        File parent = newFile.getParentFile();
        if (parent != null && !parent.exists()) {
            try {
                parent.mkdirs();
            } catch (Exception e) {
                mLog.warning("Could not create parent directory " + parent.getAbsolutePath());
            }
        }
    }

    public void processFileList(VelocityEngine ve, String sourceDir, Expression root) throws Exception {
		File outputFiles = new File(sourceDir + File.separator +  OUTPUT_FILES);
        List<OutputFileListEntry> fl = OutputFileListHandler.readFileListFile(outputFiles);

        for (OutputFileListEntry f : fl) {
            switch (f.getType()) {
                case PATH:
                    break;
                case FILE:
                    mLog.info("Processing line" + f.getLineNumber() + ": Generating file " + generateFilename(f.getAttribute("path")) + "\n");
                    String odfContextStr = f.getAttribute("context");
                    String param = f.getAttribute("param");
                    VelocityContext context = getContext(odfContextStr, param);
                    if (context == null) {
                        throw new RuntimeException("Error in output-files.xml, line " + f.getLineNumber() + ": no or invalid odf-scope");
                    }

                    File out = new File(sourceDir + generateFilename(f.getAttribute("path"))).getCanonicalFile();
                    ensureParentFolders(out);
                    FileWriter fileout = new FileWriter(out);
                    String encoding = "utf-8";

                    ve.mergeTemplate(f.getAttribute("template"), encoding, context, fileout);
                    fileout.close();

                    break;
            }
        }
    }
}