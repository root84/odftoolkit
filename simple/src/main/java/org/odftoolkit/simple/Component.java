/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2011 IBM. All rights reserved.
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

package org.odftoolkit.simple;

import java.util.IdentityHashMap;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;

/**
 * This class is the parent of classes that present all kinds of document
 * structures.
 * 
 * @since 0.5
 */
public abstract class Component {

	/**
	 * Return the instance of OdfElement which presents this structure.
	 * 
	 * @return the instance of OdfElement
	 */
	abstract public OdfElement getOdfElement();

	/**
	 * Register component to the map repository.
	 * 
	 * @param component
	 *            the component to be registered.
	 * @param element
	 *            the instance of OdfElement which presents this component.
	 * @see Document#getComponentMap()
	 */
	protected static void registerComponent(Component component, OdfElement element) {
		Document ownerDoc = component.getOwnerDocument();
		synchronized (ownerDoc) {
			IdentityHashMap<OdfElement, Component> repository = ownerDoc.getComponentMap();
			repository.put(element, component);
		}
	}

	/**
	 * Get the component instance by the element instance. Return null if there
	 * is no such element registered.
	 * 
	 * @param element
	 *            the instance of OdfElement which presents this component.
	 * @return the component instance
	 */
	protected static Component getComponentByElement(OdfElement element) {
		Document doc = (Document) ((OdfFileDom) element.getOwnerDocument()).getOwnerDocument();
		IdentityHashMap<OdfElement, Component> repository = doc.getComponentMap();
		if (repository != null)
			return repository.get(element);
		else
			return null;
	}

	/**
	 * Get the owner document of this component.
	 * 
	 * @return the owner document.
	 */
	public Document getOwnerDocument() {
		return (Document) ((OdfFileDom) getOdfElement().getOwnerDocument()).getDocument();
	}

}