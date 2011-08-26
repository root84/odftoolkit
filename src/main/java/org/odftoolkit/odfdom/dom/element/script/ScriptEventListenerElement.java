/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.script;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.script.ScriptEventNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.script.ScriptLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.script.ScriptMacroNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element script:event-listener}.
 *
 */
public class ScriptEventListenerElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.SCRIPT, "event-listener" );

	/**
	 * The value set of {@odf.attribute xlink:actuate}.
	 */
	 public enum XlinkActuateAttributeValue {
	 
	 ONREQUEST( XlinkActuateAttribute.Value.ONREQUEST.toString() );
              
		private String mValue;
	 	
		XlinkActuateAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkActuateAttributeValue enumValueOf( String value )
	    {
	        for( XlinkActuateAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	public static final String  DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE = XlinkActuateAttribute.Value.ONREQUEST.toString();

	/**
	 * Create the instance of <code>ScriptEventListenerElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ScriptEventListenerElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element script:event-listener}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  ScriptEventListenerElement}
	 *
     * @param scriptEventNameAttributeValue  The mandatory attribute {@odf.attribute  script:event-name}"
     * @param scriptLanguageAttributeValue  The mandatory attribute {@odf.attribute  script:language}"
     * @param scriptMacroNameAttributeValue  The mandatory attribute {@odf.attribute  script:macro-name}"
     * @param xlinkTypeAttributeValue  The mandatory attribute {@odf.attribute  xlink:type}"
     * @param xlinkHrefAttributeValue  The mandatory attribute {@odf.attribute  xlink:href}"
     *
	 */
	public void init(String scriptEventNameAttributeValue, String scriptLanguageAttributeValue, String scriptMacroNameAttributeValue, String xlinkTypeAttributeValue, String xlinkHrefAttributeValue)
	{
		setScriptEventNameAttribute( scriptEventNameAttributeValue );
		setScriptLanguageAttribute( scriptLanguageAttributeValue );
		setScriptMacroNameAttribute( scriptMacroNameAttributeValue );
		setXlinkTypeAttribute( xlinkTypeAttributeValue );
		setXlinkHrefAttribute( xlinkHrefAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ScriptEventNameAttribute</code> , See {@odf.attribute script:event-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getScriptEventNameAttribute()
	{
		ScriptEventNameAttribute attr = (ScriptEventNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SCRIPT), "event-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ScriptEventNameAttribute</code> , See {@odf.attribute script:event-name}
	 *
	 * @param scriptEventNameValue   The type is <code>String</code>
	 */
	public void setScriptEventNameAttribute( String scriptEventNameValue )
	{
		ScriptEventNameAttribute attr =  new ScriptEventNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( scriptEventNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ScriptLanguageAttribute</code> , See {@odf.attribute script:language}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getScriptLanguageAttribute()
	{
		ScriptLanguageAttribute attr = (ScriptLanguageAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SCRIPT), "language" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ScriptLanguageAttribute</code> , See {@odf.attribute script:language}
	 *
	 * @param scriptLanguageValue   The type is <code>String</code>
	 */
	public void setScriptLanguageAttribute( String scriptLanguageValue )
	{
		ScriptLanguageAttribute attr =  new ScriptLanguageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( scriptLanguageValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ScriptMacroNameAttribute</code> , See {@odf.attribute script:macro-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getScriptMacroNameAttribute()
	{
		ScriptMacroNameAttribute attr = (ScriptMacroNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SCRIPT), "macro-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ScriptMacroNameAttribute</code> , See {@odf.attribute script:macro-name}
	 *
	 * @param scriptMacroNameValue   The type is <code>String</code>
	 */
	public void setScriptMacroNameAttribute( String scriptMacroNameValue )
	{
		ScriptMacroNameAttribute attr =  new ScriptMacroNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( scriptMacroNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute()
	{
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute( String xlinkTypeValue )
	{
		XlinkTypeAttribute attr =  new XlinkTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute()
	{
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "href" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute( String xlinkHrefValue )
	{
		XlinkHrefAttribute attr =  new XlinkHrefAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkHrefValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute()
	{
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "actuate" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute( String xlinkActuateValue )
	{
		XlinkActuateAttribute attr =  new XlinkActuateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkActuateValue );
	}

}