/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.mdht.uml.fhir.ui.internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Property page sections
	// ==============================================================================


	// ==============================================================================
	// Preference pages
	// ==============================================================================


	// ==============================================================================
	// Dialogs
	// ==============================================================================



	// ==============================================================================
	// Wizards
	// ==============================================================================


	
	// ==============================================================================
	// Actions
	// ==============================================================================

	public static String GenerateProject_name;
	public static String GenerateFolder_name;
	public static String GenerateModel_name;
	public static String GenerateModel_file_name;

	public static String CreateModel_operation_title;
	public static String ExportFHIR_operation_title;
	public static String ImportFHIR_operation_title;
	public static String ImportFHIR_error_message;

	// ==============================================================================
	// Add FHIR default element names
	// ==============================================================================

	public static String AddFHIRStructureDefinition_operation_title;
	public static String AddFHIRStructureDefinition_default_name;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
