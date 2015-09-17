/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Related Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlanRelatedPlan#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanRelatedPlan#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlanRelatedPlan()
 * @model extendedMetaData="name='CarePlan.RelatedPlan' kind='elementOnly'"
 * @generated
 */
public interface CarePlanRelatedPlan extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of relationship this plan has to the target plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CarePlanRelationship)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanRelatedPlan_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanRelationship getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanRelatedPlan#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CarePlanRelationship value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the plan to which a relationship is asserted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanRelatedPlan_Plan()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanRelatedPlan#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Reference value);

} // CarePlanRelatedPlan
