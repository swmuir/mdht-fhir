/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventNetwork#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventNetwork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventNetwork()
 * @model extendedMetaData="name='AuditEvent.Network' kind='elementOnly'"
 * @generated
 */
public interface AuditEventNetwork extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the network access point of the user device for the audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventNetwork_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventNetwork#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the type of network access point that originated the audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AuditEventParticipantNetworkType)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventNetwork_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEventParticipantNetworkType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventNetwork#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AuditEventParticipantNetworkType value);

} // AuditEventNetwork
