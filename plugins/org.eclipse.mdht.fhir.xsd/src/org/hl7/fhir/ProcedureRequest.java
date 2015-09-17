/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request for a procedure to be performed. May be a proposal or an order.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getScheduledDateTime <em>Scheduled Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedureRequest()
 * @model extendedMetaData="name='ProcedureRequest' kind='elementOnly'"
 * @generated
 */
public interface ProcedureRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the order or by the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Identifier()
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
	 * The patient who will receive the procedure or a group of subjects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific procedure that is ordered. Use text if the exact nature of the procedure can't be coded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the sites on the subject's body where the procedure should be performed ( i.e. the target sites).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_BodySite()
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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_ReasonCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getReasonCodeableConcept <em>Reason Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Scheduled Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Date Time</em>' containment reference.
	 * @see #setScheduledDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_ScheduledDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getScheduledDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getScheduledDateTime <em>Scheduled Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Date Time</em>' containment reference.
	 * @see #getScheduledDateTime()
	 * @generated
	 */
	void setScheduledDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Scheduled Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Period</em>' containment reference.
	 * @see #setScheduledPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_ScheduledPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getScheduledPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getScheduledPeriod <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Period</em>' containment reference.
	 * @see #getScheduledPeriod()
	 * @generated
	 */
	void setScheduledPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Scheduled Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Timing</em>' containment reference.
	 * @see #setScheduledTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_ScheduledTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scheduledTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getScheduledTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getScheduledTiming <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Timing</em>' containment reference.
	 * @see #getScheduledTiming()
	 * @generated
	 */
	void setScheduledTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter within which the procedure proposal or request was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E.g. surgeon, anaethetist, endoscopist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ProcedureRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcedureRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes associated with this proposal or order - e.g. provider instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNotes();

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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_AsNeededBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeededBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getAsNeededBoolean <em>As Needed Boolean</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_AsNeededCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 */
	void setAsNeededCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ordered On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the request was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered On</em>' containment reference.
	 * @see #setOrderedOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_OrderedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOrderedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getOrderedOn <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered On</em>' containment reference.
	 * @see #getOrderedOn()
	 * @generated
	 */
	void setOrderedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Orderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare professional responsible for proposing or ordering the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderer</em>' containment reference.
	 * @see #setOrderer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Orderer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrderer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getOrderer <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderer</em>' containment reference.
	 * @see #getOrderer()
	 * @generated
	 */
	void setOrderer(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical priority associated with this order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(ProcedureRequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(ProcedureRequestPriority value);

} // ProcedureRequest
