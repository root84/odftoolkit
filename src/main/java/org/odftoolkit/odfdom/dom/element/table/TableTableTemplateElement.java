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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.table.TableFirstRowEndColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFirstRowStartColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLastRowEndColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLastRowStartColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-template}.
 *
 */
public class TableTableTemplateElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "table-template");

	/**
	 * Create the instance of <code>TableTableTemplateElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableTemplateElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-template}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFirstRowEndColumnAttribute</code> , See {@odf.attribute table:first-row-end-column}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFirstRowEndColumnAttribute() {
		TableFirstRowEndColumnAttribute attr = (TableFirstRowEndColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "first-row-end-column");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFirstRowEndColumnAttribute</code> , See {@odf.attribute table:first-row-end-column}
	 *
	 * @param tableFirstRowEndColumnValue   The type is <code>String</code>
	 */
	public void setTableFirstRowEndColumnAttribute(String tableFirstRowEndColumnValue) {
		TableFirstRowEndColumnAttribute attr = new TableFirstRowEndColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFirstRowEndColumnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFirstRowStartColumnAttribute</code> , See {@odf.attribute table:first-row-start-column}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFirstRowStartColumnAttribute() {
		TableFirstRowStartColumnAttribute attr = (TableFirstRowStartColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "first-row-start-column");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFirstRowStartColumnAttribute</code> , See {@odf.attribute table:first-row-start-column}
	 *
	 * @param tableFirstRowStartColumnValue   The type is <code>String</code>
	 */
	public void setTableFirstRowStartColumnAttribute(String tableFirstRowStartColumnValue) {
		TableFirstRowStartColumnAttribute attr = new TableFirstRowStartColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFirstRowStartColumnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLastRowEndColumnAttribute</code> , See {@odf.attribute table:last-row-end-column}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLastRowEndColumnAttribute() {
		TableLastRowEndColumnAttribute attr = (TableLastRowEndColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "last-row-end-column");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLastRowEndColumnAttribute</code> , See {@odf.attribute table:last-row-end-column}
	 *
	 * @param tableLastRowEndColumnValue   The type is <code>String</code>
	 */
	public void setTableLastRowEndColumnAttribute(String tableLastRowEndColumnValue) {
		TableLastRowEndColumnAttribute attr = new TableLastRowEndColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableLastRowEndColumnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLastRowStartColumnAttribute</code> , See {@odf.attribute table:last-row-start-column}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLastRowStartColumnAttribute() {
		TableLastRowStartColumnAttribute attr = (TableLastRowStartColumnAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "last-row-start-column");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLastRowStartColumnAttribute</code> , See {@odf.attribute table:last-row-start-column}
	 *
	 * @param tableLastRowStartColumnValue   The type is <code>String</code>
	 */
	public void setTableLastRowStartColumnAttribute(String tableLastRowStartColumnValue) {
		TableLastRowStartColumnAttribute attr = new TableLastRowStartColumnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableLastRowStartColumnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute() {
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute(String tableNameValue) {
		TableNameAttribute attr = new TableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableNameValue);
	}

	/**
	 * Create child element {@odf.element table:background}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:background}
	 */
	 public TableBackgroundElement newTableBackgroundElement(String tableStyleNameValue) {
		TableBackgroundElement tableBackground = ((OdfFileDom) this.ownerDocument).newOdfElement(TableBackgroundElement.class);
		tableBackground.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableBackground);
		return tableBackground;
	}

	/**
	 * Create child element {@odf.element table:body}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element table:body}
	 */
	 public TableBodyElement newTableBodyElement(String tableStyleNameValue) {
		TableBodyElement tableBody = ((OdfFileDom) this.ownerDocument).newOdfElement(TableBodyElement.class);
		tableBody.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableBody);
		return tableBody;
	}

	/**
	 * Create child element {@odf.element table:even-columns}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:even-columns}
	 */
	 public TableEvenColumnsElement newTableEvenColumnsElement(String tableStyleNameValue) {
		TableEvenColumnsElement tableEvenColumns = ((OdfFileDom) this.ownerDocument).newOdfElement(TableEvenColumnsElement.class);
		tableEvenColumns.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableEvenColumns);
		return tableEvenColumns;
	}

	/**
	 * Create child element {@odf.element table:even-rows}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:even-rows}
	 */
	 public TableEvenRowsElement newTableEvenRowsElement(String tableStyleNameValue) {
		TableEvenRowsElement tableEvenRows = ((OdfFileDom) this.ownerDocument).newOdfElement(TableEvenRowsElement.class);
		tableEvenRows.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableEvenRows);
		return tableEvenRows;
	}

	/**
	 * Create child element {@odf.element table:first-column}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:first-column}
	 */
	 public TableFirstColumnElement newTableFirstColumnElement(String tableStyleNameValue) {
		TableFirstColumnElement tableFirstColumn = ((OdfFileDom) this.ownerDocument).newOdfElement(TableFirstColumnElement.class);
		tableFirstColumn.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableFirstColumn);
		return tableFirstColumn;
	}

	/**
	 * Create child element {@odf.element table:first-row}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:first-row}
	 */
	 public TableFirstRowElement newTableFirstRowElement(String tableStyleNameValue) {
		TableFirstRowElement tableFirstRow = ((OdfFileDom) this.ownerDocument).newOdfElement(TableFirstRowElement.class);
		tableFirstRow.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableFirstRow);
		return tableFirstRow;
	}

	/**
	 * Create child element {@odf.element table:last-column}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:last-column}
	 */
	 public TableLastColumnElement newTableLastColumnElement(String tableStyleNameValue) {
		TableLastColumnElement tableLastColumn = ((OdfFileDom) this.ownerDocument).newOdfElement(TableLastColumnElement.class);
		tableLastColumn.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableLastColumn);
		return tableLastColumn;
	}

	/**
	 * Create child element {@odf.element table:last-row}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:last-row}
	 */
	 public TableLastRowElement newTableLastRowElement(String tableStyleNameValue) {
		TableLastRowElement tableLastRow = ((OdfFileDom) this.ownerDocument).newOdfElement(TableLastRowElement.class);
		tableLastRow.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableLastRow);
		return tableLastRow;
	}

	/**
	 * Create child element {@odf.element table:odd-columns}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:odd-columns}
	 */
	 public TableOddColumnsElement newTableOddColumnsElement(String tableStyleNameValue) {
		TableOddColumnsElement tableOddColumns = ((OdfFileDom) this.ownerDocument).newOdfElement(TableOddColumnsElement.class);
		tableOddColumns.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableOddColumns);
		return tableOddColumns;
	}

	/**
	 * Create child element {@odf.element table:odd-rows}.
	 *
	 * @param tableStyleNameValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element table:odd-rows}
	 */
	 public TableOddRowsElement newTableOddRowsElement(String tableStyleNameValue) {
		TableOddRowsElement tableOddRows = ((OdfFileDom) this.ownerDocument).newOdfElement(TableOddRowsElement.class);
		tableOddRows.setTableStyleNameAttribute(tableStyleNameValue);
		this.appendChild(tableOddRows);
		return tableOddRows;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}