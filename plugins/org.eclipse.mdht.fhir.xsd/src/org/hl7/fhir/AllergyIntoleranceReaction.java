/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction()
 * @model extendedMetaData="name='AllergyIntolerance.Reaction' kind='elementOnly'"
 * @generated
 */
public interface AllergyIntoleranceReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certainty</em>' containment reference.
	 * @see #setCertainty(AllergyIntoleranceCertainty)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Certainty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certainty' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCertainty getCertainty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getCertainty <em>Certainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' containment reference.
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(AllergyIntoleranceCertainty value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Manifestation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manifestation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getManifestation();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text description about the reaction as a whole, including details of the manifestation if required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Onset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of the date and/or time of the onset of the Reaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset</em>' containment reference.
	 * @see #setOnset(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Onset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onset' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getOnset <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' containment reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(AllergyIntoleranceSeverity)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(AllergyIntoleranceSeverity value);

	/**
	 * Returns the value of the '<em><b>Exposure Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the route by which the subject was exposed to the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Route</em>' containment reference.
	 * @see #setExposureRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_ExposureRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exposureRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getExposureRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Route</em>' containment reference.
	 * @see #getExposureRoute()
	 * @generated
	 */
	void setExposureRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional text about the adverse reaction event not captured in other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceReaction_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getNote();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Annotation value);

} // AllergyIntoleranceReaction
