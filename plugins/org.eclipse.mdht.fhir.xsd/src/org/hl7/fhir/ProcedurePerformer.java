/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedurePerformer#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedurePerformer#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedurePerformer()
 * @model extendedMetaData="name='Procedure.Performer' kind='elementOnly'"
 * @generated
 */
public interface ProcedurePerformer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who was involved in the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedurePerformer_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedurePerformer#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E.g. surgeon, anaethetist, endoscopist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedurePerformer_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedurePerformer#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

} // ProcedurePerformer
