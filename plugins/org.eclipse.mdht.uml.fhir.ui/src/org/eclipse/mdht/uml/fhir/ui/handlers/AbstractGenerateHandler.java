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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.fhir.ui.internal.l10n.Messages;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class AbstractGenerateHandler extends AbstractHandler {

	public AbstractGenerateHandler() {
		super();
	}

	/**
	 * Create or find workspace project to contain generated results. 
	 */
	protected IProject getGeneratedProject() {
		final IProject project[] = {null};
		
		try {
			/* Create project */
			ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {

				public void run(IProgressMonitor monitor) throws CoreException {
					project[0] = ResourcesPlugin.getWorkspace().getRoot().getProject(Messages.GenerateProject_name);

					if (false == project[0].exists()) {
						project[0].create(monitor);
					}

					project[0].open(monitor);
				}
			}, new NullProgressMonitor());

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}

		return project[0];
	}

	protected IProject getModelProject(EObject element) {
		URI uri = ((EObject)element).eResource().getURI();
		String filePath = URI.decode(uri.toString());
		if (filePath.startsWith("platform:/resource"))
			filePath = filePath.substring(18);

		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(filePath);
		if (resource == null)
			resource = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filePath));
		
		if (IFile.class.isInstance(resource)) {
			return ((IFile)resource).getProject();
		}

		return null;
	}

	protected IFolder getOutputFolder(EObject element) {
		IProject project = getModelProject(element);
		if (project == null) {
			project = getGeneratedProject();
		}
		
		return project.getFolder(new Path(Messages.GenerateFolder_name));
	}
	
	protected IPath getOutputPath(EObject element) {
		IFolder folder = getOutputFolder(element);
		IPath path = folder.getFullPath().addTrailingSeparator();
		return path;
	}

	protected void openDefaultEditor(URI resourceURI, IWorkbenchPart activePart) {
		//open a new default editor for this resource type
		IEditorDescriptor editorDescriptor = activePart.getSite().getWorkbenchWindow().getWorkbench().getEditorRegistry()
				.getDefaultEditor(resourceURI.toString());
		if (editorDescriptor != null) {
			IResource resource = ResourcesPlugin.getWorkspace().getRoot()
					.getFileForLocation(new Path(resourceURI.toFileString()));
			
			if (resource instanceof IFile) {
				try {
					IProject project = ((IFile)resource).getProject();
					if (!resource.exists() && project != null)
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					return;
				}
				
				IEditorInput editorInput = new FileEditorInput((IFile)resource);

				IWorkbench workbench = PlatformUI.getWorkbench();
				IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
				IWorkbenchPage activePage = workbenchWindow.getActivePage();
				try {
					activePage.openEditor(editorInput, editorDescriptor.getId());
				} catch (PartInitException e) {
					return;
				}
			}
		}
	}
	
}
