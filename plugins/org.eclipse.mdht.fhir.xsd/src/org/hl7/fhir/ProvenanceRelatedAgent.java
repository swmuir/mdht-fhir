/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Related Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact Security, Privacy, and Trust policies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProvenanceRelatedAgent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceRelatedAgent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceRelatedAgent()
 * @model extendedMetaData="name='Provenance.RelatedAgent' kind='elementOnly'"
 * @generated
 */
public interface ProvenanceRelatedAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship between agents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceRelatedAgent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceRelatedAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal reference to another agent listed in this provenance by it's id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceRelatedAgent_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceRelatedAgent#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Uri value);

} // ProvenanceRelatedAgent
