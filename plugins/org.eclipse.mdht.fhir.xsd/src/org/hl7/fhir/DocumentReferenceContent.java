/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContent#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContent#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent()
 * @model extendedMetaData="name='DocumentReference.Content' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document or url to the document along with critical metadata to prove content has integrity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent_Attachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContent#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContent_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getFormat();

} // DocumentReferenceContent
