/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a medication that is being consumed by a patient.   A medication statements may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patients’ memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains.
 * 
 * The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Statement information may come from the patient’s memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication Administration is more formal and is not missing detailed information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getSiteCodeableConcept <em>Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getSiteReference <em>Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getQuantityQuantity <em>Quantity Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getQuantityRange <em>Quantity Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationStatementDosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage()
 * @model extendedMetaData="name='MedicationStatement.Dosage' kind='elementOnly'"
 * @generated
 */
public interface MedicationStatementDosage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions, for example.  "Every  8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:";  "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference.
	 * @see #setTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_Timing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timing' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getTiming <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' containment reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Needed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #setAsNeededBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_AsNeededBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeededBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getAsNeededBoolean <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #getAsNeededBoolean()
	 * @generated
	 */
	void setAsNeededBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #setAsNeededCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_AsNeededCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 */
	void setAsNeededCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #setSiteCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_SiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSiteCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getSiteCodeableConcept <em>Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Codeable Concept</em>' containment reference.
	 * @see #getSiteCodeableConcept()
	 * @generated
	 */
	void setSiteCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Reference</em>' containment reference.
	 * @see #setSiteReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_SiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='siteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSiteReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getSiteReference <em>Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Reference</em>' containment reference.
	 * @see #getSiteReference()
	 * @generated
	 */
	void setSiteReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  Examples: Slow Push, Deep IV.  One of the reasons this attribute is not used often, is that the method is often pre-coordinated with the route and/or form of administration.  This means the codes used in route or form may pre-coordinate the method in the route code or the form code.  The implementation decision about what coding system to use for route or form code will determine how frequently the method code will be populated e.g. if route or form code pre-coordinate method code, then this attribute will not be populated often; if there is no pre-coordination then method code may  be used frequently.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Quantity</em>' containment reference.
	 * @see #setQuantityQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_QuantityQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantityQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantityQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getQuantityQuantity <em>Quantity Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Quantity</em>' containment reference.
	 * @see #getQuantityQuantity()
	 * @generated
	 */
	void setQuantityQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Quantity Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Range</em>' containment reference.
	 * @see #setQuantityRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_QuantityRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantityRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getQuantityRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getQuantityRange <em>Quantity Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Range</em>' containment reference.
	 * @see #getQuantityRange()
	 * @generated
	 */
	void setQuantityRange(Range value);

	/**
	 * Returns the value of the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #setRateRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Range</em>' containment reference.
	 * @see #setRateRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_RateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRateRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getRateRange <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Range</em>' containment reference.
	 * @see #getRateRange()
	 * @generated
	 */
	void setRateRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time; e.g. 1000mg in 24 hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationStatementDosage_MaxDosePerPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationStatementDosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

} // MedicationStatementDosage
