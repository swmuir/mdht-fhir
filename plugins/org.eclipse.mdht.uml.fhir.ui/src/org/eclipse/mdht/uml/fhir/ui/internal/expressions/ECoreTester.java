/*******************************************************************************
 * Copyright (c) 2012, 2015 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     David A Carlson (Clinical Cloud Solutions, LLC) - Add UML tester properties
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.internal.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;

/**
 * Property tester for Ecore and UML aspects of selected elements.
 */
public class ECoreTester extends PropertyTester {
	private static final String PROPERTY_ECLASS = "eclass";

	private static final String UML_TYPE = "umlType";

	private static final String UML_STRICT_TYPE = "umlStrictType";

	private static final String UML_HAS_PROFILE = "hasProfile";

	private static final String UML_HAS_STEREOTYPE = "hasStereotype";

	private static final String UML_JAVA_PACKAGE = "org.eclipse.uml2.uml.";

	public ECoreTester() {
		super();
	}

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean result = false;

		if (PROPERTY_ECLASS.equals(property)) {
			result = testEClass(receiver, ((String) expectedValue).trim());
		}
		else if (UML_TYPE.equals(property)) {
			result = testUMLProperty(receiver, property, ((String) expectedValue).trim());
		}
		else if (UML_STRICT_TYPE.equals(property)) {
			result = testUMLProperty(receiver, property, ((String) expectedValue).trim());
		}
		else if (UML_HAS_STEREOTYPE.equals(property)) {
			result = testUMLProperty(receiver, property, ((String) expectedValue).trim());
		}
		else if (UML_HAS_PROFILE.equals(property)) {
			result = testUMLProperty(receiver, property, ((String) expectedValue).trim());
		}

		return result;
	}

	private boolean testEClass(Object receiver, String eclassName) {
		boolean result = false;
		EObject eObject = getEObject(receiver);

		if (eObject != null) {
			EClass eclass = eObject.eClass();

			String epackageName = null;
			int colon = eclassName.indexOf(':');
			if (colon > 0) { // correct: don't accept an initial colon
				epackageName = eclassName.substring(0, colon);
				eclassName = eclassName.substring(colon + 1);
			}

			result = eclass.getName().equals(eclassName) &&
					((epackageName == null) || eclass.getEPackage().getName().equals(epackageName));
		}

		return result;
	}

	private boolean testUMLProperty(Object receiver, String property, String expectedValue) {
		boolean result = false;
		EObject eObject = getEObject(receiver);
		
		if (eObject instanceof Element) {
			Element element = (Element) eObject;
			
			if (UML_STRICT_TYPE.equals(property)) {
				result = element.getClass().getName().equals(UML_JAVA_PACKAGE + expectedValue);

			} else if (UML_TYPE.equals(property)) {
				try {
					Class<?> umlType = Class.forName(UML_JAVA_PACKAGE + expectedValue);
					result = umlType.isAssignableFrom(element.getClass());

				} catch (ClassNotFoundException e) {
				}

			} else if (UML_HAS_STEREOTYPE.equals(property)) {
				result = element.getAppliedStereotype(expectedValue) != null;

			} else if (UML_HAS_PROFILE.equals(property)) {
				for (Profile profile : element.getNearestPackage().getAllAppliedProfiles()) {
					if (profile.getDefinition() != null && profile.getDefinition().getNsURI() != null &&
							profile.getDefinition().getNsURI().startsWith(expectedValue)) {
						result = true;
					}
				}

			}
		}

		return result;
	}
	
	private EObject getEObject(Object receiver) {
		EObject eObject = null;

		// adapt (Eclipse-ishly)
		if (receiver instanceof IAdaptable) {
			receiver = ((IAdaptable) receiver).getAdapter(EObject.class);
		}

		// unwrap (EMF-ishly)
		receiver = AdapterFactoryEditingDomain.unwrap(receiver);

		// unview (GMF-ishly)
		if (receiver instanceof View) {
			receiver = ((View) receiver).getElement();
		}

		if (receiver instanceof EObject) {
			eObject = (EObject) receiver;
		}
		
		return eObject;
	}
}
