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
package org.eclipse.mdht.uml.fhir.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class NotImplementedHandler extends AbstractHandler {

	public NotImplementedHandler() {
		super();
		
		setEnabled(Boolean.FALSE);
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		MessageDialog.openInformation(HandlerUtil.getActiveShell(event),
		        "Not Implemented", "This command is not yet implemented");

		return null;
	}

}
