/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.notation;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ShortDescription;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.transform.FhirModelUtil;
import org.eclipse.mdht.uml.fhir.transform.ModelConstants;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.common.notation.IExtendedNotationProvider;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class FHIRAnnotationProvider implements IExtendedNotationProvider, IExecutableExtension {

	public final static int PROPERTY_ANNOTATION = INotationConstants.DISP_VOCABULARY |
			INotationConstants.DISP_MOFIFIERS | INotationConstants.DISP_TYPE_CHOICE;
	
	@Override
	public String getDescription(Element element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getShortDescription(Element element) {
		String text = null;

		// For associations, use the navigable end.
		if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null) {
				element = navigableEnd;
			}
		}
		
		for (Comment comment : element.getOwnedComments()) {
			ShortDescription shortDescription = (ShortDescription) ProfileUtil.getStereotypeApplication(comment, FHIRPackage.eINSTANCE.getShortDescription());
			if (shortDescription != null && shortDescription.getBase_Comment() != null) {
				text = shortDescription.getBase_Comment().getBody();
				break;
			}
		}
		return text;
	}

	public String getAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Class) {
			annotation = getMetadata((Class) element);
		} else if (element instanceof Enumeration) {
			annotation = getMetadata((Enumeration) element);
		} else if (element instanceof EnumerationLiteral) {
			annotation = getMetadata((EnumerationLiteral) element);
		} else if (element instanceof Property) {
			annotation = FHIRPropertyNotation.getCustomLabel((Property) element, PROPERTY_ANNOTATION);
		} else if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null) {
				annotation = FHIRPropertyNotation.getCustomLabel(navigableEnd, PROPERTY_ANNOTATION);
			}
		}

		return annotation;
	}

	public String getShortAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Property) {
			annotation = FHIRPropertyNotation.getCustomLabel((Property) element, INotationConstants.DISP_MOFIFIERS);
		}
		else {
			annotation = getAnnotation(element);
		}
		
		return annotation;
	}

	public Object getAnnotationImage(Element element) {
		Image image = null;
		// For associations, use image for the navigable end.
		if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null) {
				element = navigableEnd;
			}
		}
		
		if (element instanceof Property) {
			Property property = (Property) element;
			if (getTypeChoice(property).size() > 0) {
				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_choice.gif");
			}
			else if (FhirModelUtil.isSliced(property)) {
				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_slice.png");
			}
		}
		
		return (image != null) ? image : getStereotypeImage(element);
	}

	public Object getElementImage(Element element) {
//		if (element instanceof Class) {
//			return getModelImage((Class) element);
//		}

		Image image = null;
		// For associations, use image for the navigable end.
//		if (element instanceof Association) {
//			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
//			if (navigableEnd != null) {
//				element = navigableEnd;
//			}
//		}
//		if (element instanceof Property) {
//			Property property = (Property) element;
//			if (property.getType() instanceof Classifier) {
//				element = property.getType();
//			}
//		}
		
		if (element instanceof Class) {
			Class umlClass = (Class) element;

			if (FhirModelUtil.isKindOf(umlClass, ModelConstants.BACKBONE_ELEMENT_CLASS_NAME)) {
				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_element.gif");
			}
			else if (FhirModelUtil.isExtension(umlClass)) {
				if (FhirModelUtil.isComplexExtension(umlClass)) {
					image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_extension_complex.png");
				}
				else {
					image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_extension_simple.png");
				}
			}
//			else if (FhirModelUtil.isKindOf(umlClass, ModelConstants.RESOURCE_CLASS_NAME)) {
//				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_reference.png");
//			}
			else if (FhirModelUtil.isKindOf(umlClass, ModelConstants.DATATYPE_CLASS_NAME)) {
				// Is primitive type if DataType has a 'value' attribute
				boolean isPrimitive = umlClass.getAttribute("value", null) != null || umlClass.getInheritedMember("value") != null;
				if (isPrimitive) {
					image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_primitive.png");
				}
				else {
					image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_datatype.gif");
				}
			}

			else if (FhirModelUtil.getStructureDefinition(umlClass) != null) {
				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_profile.png");
			}
			
		}
		
//		else if (element instanceof Property) {
//			Property property = (Property) element;
//			if (property.getType() != null && FhirModelUtil.isExtension((Classifier) property.getType())) {
//				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_extension.png");
//			}
//			else if (property.getType() != null && FhirModelUtil.isKindOf((Classifier)property.getType(), ModelConstants.RESOURCE_CLASS_NAME)) {
//				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_reference.png");
//			}
//			else {
//				// Is primitive type if subclass of type from XML library
//				image = Activator.getDefault().getBundledImage("icons/fhir-type/icon_primitive.png");
//			}
//		}
		
		return (image != null) ? image : null;
	}

	public List<Classifier> getTypeChoice(Property property) {
		List<Classifier> types = new ArrayList<Classifier>();
		
		TypeChoice typeChoice = (TypeChoice) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null) {
			types.addAll(typeChoice.getTypes());
		}
		
		return types;
	}

	protected Object getStereotypeImage(Element element) {
		Object image = null;

		if (element instanceof Class) {
//			Class umlClass = (Class) element;

//			if (MDRProfileUtil.getConcept(umlClass) != null) {
//				image = Activator.getDefault().getBundledImage("icons/full/obj16/Concept.gif");
//			}

		} else if (element instanceof Property) {
			Property property = (Property) element;

			if (property.getType() != null) {
				Type type = property.getType();
				image = getStereotypeImage(type);
			}

		} else if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null && navigableEnd.getType() != null) {
				Type type = navigableEnd.getType();
				image = getStereotypeImage(type);
			}
		}

		return image;
	}

	protected Object getModelImage(NamedElement element) {
		Object image = getIcon(element);

		if (image == null && element instanceof Classifier) {
			for (Classifier general : ((Classifier) element).getGenerals()) {
				// fix bug with infinite cyclic loop
				if (general != element) {
//					image = getModelImage(general);
					if (image != null) {
						break;
					}
				}
			}
		}

		return image;
	}

	protected Object getIcon(NamedElement element) {
		Object image = null;
		String location = "icons/" + element.getName() + ".gif";

		Resource eResource = element.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				URIConverter uriConverter = resourceSet.getURIConverter();
				URI normalizedURI = uriConverter.normalize(eResource.getURI());

				URI uri = URI.createURI(location).resolve(normalizedURI);

				try {
					URL url = new URL(uriConverter.normalize(uri).toString());
					url.openStream().close();
					image = url;
				} catch (Exception e1) {
					try {
						// try .png extension
						uri = uri.trimFileExtension().appendFileExtension("png");
						URL url = new URL(uriConverter.normalize(uri).toString());
						url.openStream().close();
						image = url;
					} catch (Exception e2) {
						// ignore
					}
				}
			}
		}

		return image;
	}

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Property) {
			printString = FHIRPropertyNotation.getCustomLabel(
				(Property) element, INotationConstants.DEFAULT_UML_PROPERTY | INotationConstants.DISP_VOCABULARY);
		}

		return printString;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

	protected static String getMetadata(Class umlClass) {
		StringBuffer value = new StringBuffer();
		

		return value.toString();
	}

	protected static String getMetadata(Enumeration umlEnum) {
		StringBuffer value = new StringBuffer();

		return value.toString();
	}

	protected static String getMetadata(EnumerationLiteral literal) {
		StringBuffer value = new StringBuffer();


		return value.toString();
	}

}
