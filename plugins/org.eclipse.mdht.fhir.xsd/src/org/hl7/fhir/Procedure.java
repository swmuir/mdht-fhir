/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Procedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getNotPerformed <em>Not Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReasonNotPerformed <em>Reason Not Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedure()
 * @model extendedMetaData="name='Procedure' kind='elementOnly'"
 * @generated
 */
public interface Procedure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person on whom the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the procedure record. Generally this will be in-progress or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ProcedureStatus)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcedureStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific procedure that is performed. Use text if the exact nature of the procedure can't be coded (e.g. "Laparoscopic Appendectomy").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Not Performed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set this to true if the record is saying that the procedure was NOT performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Performed</em>' containment reference.
	 * @see #setNotPerformed(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_NotPerformed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notPerformed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNotPerformed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getNotPerformed <em>Not Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Performed</em>' containment reference.
	 * @see #getNotPerformed()
	 * @generated
	 */
	void setNotPerformed(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reason Not Performed</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating why the procedure was not performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Not Performed</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ReasonNotPerformed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonNotPerformed' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotPerformed();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBodySite();

	/**
	 * Returns the value of the '<em><b>Reason Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #setReasonCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Codeable Concept</em>' containment reference.
	 * @see #getReasonCodeableConcept()
	 * @generated
	 */
	void setReasonCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference.
	 * @see #setReasonReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedurePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limited to 'real' people rather than equipment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedurePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Performed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #setPerformedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPerformedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #getPerformedDateTime()
	 * @generated
	 */
	void setPerformedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Period</em>' containment reference.
	 * @see #setPerformedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPerformedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Period</em>' containment reference.
	 * @see #getPerformedPeriod()
	 * @generated
	 */
	void setPerformedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter during which the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the procedure actually happened; e.g. a newborn at home, a tracheostomy at a restaurant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What was the outcome of the procedure - did it resolve reasons why the procedure was performed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This could be a histology result. There could potentially be multiple reports - e.g. if this was a procedure that made multiple biopsies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReport();

	/**
	 * Returns the value of the '<em><b>Complication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any complications that occurred during the procedure, or in the immediate post-operative period. These are generally tracked separately from the notes, which typically will describe the procedure itself rather than any 'post procedure' issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Complication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComplication();

	/**
	 * Returns the value of the '<em><b>Follow Up</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or potentially could be more complex in which case the CarePlan resource can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Follow Up</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_FollowUp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followUp' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFollowUp();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a resource that contains about this procedure's request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes about the procedure - e.g. the operative notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Focal Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureFocalDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_FocalDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focalDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureFocalDevice> getFocalDevice();

	/**
	 * Returns the value of the '<em><b>Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies medications, devices and other substance used as part of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Used()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='used' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUsed();

} // Procedure
