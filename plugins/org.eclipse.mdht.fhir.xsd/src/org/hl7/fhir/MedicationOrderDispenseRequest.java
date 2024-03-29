/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Order Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationOrderDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest()
 * @model extendedMetaData="name='MedicationOrder.DispenseRequest' kind='elementOnly'"
 * @generated
 */
public interface MedicationOrderDispenseRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Medication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #setMedicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 */
	void setMedicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Reference</em>' containment reference.
	 * @see #setMedicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Design Comments: This indicates the validity period of a prescription (stale dating the Prescription)  It reflects the prescriber perspective for the validity of the prescription. Dispenses must not be made against the prescription outside of this period. The lower-bound of the Dispensing Window signifies the earliest date that the prescription can be filled for the first time. If an upper-bound is not specified then the Prescription is open-ended or will default to a stale-date based on regulations.  Rationale: Indicates when the Prescription becomes valid, and when it ceases to be a dispensable Prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #setNumberOfRepeatsAllowed(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_NumberOfRepeatsAllowed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRepeatsAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getNumberOfRepeatsAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 */
	void setNumberOfRepeatsAllowed(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount that is to be dispensed for one fill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Expected Supply Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.  In some situations, this attribute may be used instead of quantity to identify the amount supplied by how long it is expected to last, rather than the physical quantity issued, e.g. 90 days supply of medication (based on an ordered dosage) When possible, it is always better to specify quantity, as this tends to be more precise. expectedSupplyDuration will always be an estimate that can be influenced by external factors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #setExpectedSupplyDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationOrderDispenseRequest_ExpectedSupplyDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expectedSupplyDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getExpectedSupplyDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationOrderDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 */
	void setExpectedSupplyDuration(Duration value);

} // MedicationOrderDispenseRequest
