/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Care Plan Relationship List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCarePlanRelationshipList()
 * @model extendedMetaData="name='CarePlanRelationship-list'"
 * @generated
 */
public enum CarePlanRelationshipList implements Enumerator {
	/**
	 * The '<em><b>Includes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDES(0, "includes", "includes"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(1, "replaces", "replaces"),

	/**
	 * The '<em><b>Fulfills</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLS_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLS(2, "fulfills", "fulfills");

	/**
	 * The '<em><b>Includes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced plan is considered to be part of this plan.
	 * <!-- end-model-doc -->
	 * @see #INCLUDES
	 * @model name="includes"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES_VALUE = 0;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This plan takes the places of the referenced plan.
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 1;

	/**
	 * The '<em><b>Fulfills</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This plan provides details about how to perform activities defined at a higher level by the referenced plan.
	 * <!-- end-model-doc -->
	 * @see #FULFILLS
	 * @model name="fulfills"
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Care Plan Relationship List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CarePlanRelationshipList[] VALUES_ARRAY =
		new CarePlanRelationshipList[] {
			INCLUDES,
			REPLACES,
			FULFILLS,
		};

	/**
	 * A public read-only list of all the '<em><b>Care Plan Relationship List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CarePlanRelationshipList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Care Plan Relationship List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePlanRelationshipList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarePlanRelationshipList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Care Plan Relationship List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePlanRelationshipList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarePlanRelationshipList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Care Plan Relationship List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePlanRelationshipList get(int value) {
		switch (value) {
			case INCLUDES_VALUE: return INCLUDES;
			case REPLACES_VALUE: return REPLACES;
			case FULFILLS_VALUE: return FULFILLS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CarePlanRelationshipList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CarePlanRelationshipList
