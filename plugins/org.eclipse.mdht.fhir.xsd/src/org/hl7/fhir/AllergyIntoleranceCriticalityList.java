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
 * A representation of the literals of the enumeration '<em><b>Allergy Intolerance Criticality List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceCriticalityList()
 * @model extendedMetaData="name='AllergyIntoleranceCriticality-list'"
 * @generated
 */
public enum AllergyIntoleranceCriticalityList implements Enumerator {
	/**
	 * The '<em><b>CRITL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITL(0, "CRITL", "CRITL"),

	/**
	 * The '<em><b>CRITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITH_VALUE
	 * @generated
	 * @ordered
	 */
	CRITH(1, "CRITH", "CRITH"),

	/**
	 * The '<em><b>CRITU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITU_VALUE
	 * @generated
	 * @ordered
	 */
	CRITU(2, "CRITU", "CRITU");

	/**
	 * The '<em><b>CRITL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The potential clinical impact of a future reaction is estimated as low risk: exposure to substance is unlikely to result in a life threatening or organ system threatening outcome. Future exposure to the Substance is considered a relative contra-indication.
	 * <!-- end-model-doc -->
	 * @see #CRITL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITL_VALUE = 0;

	/**
	 * The '<em><b>CRITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The potential clinical impact of a future reaction is estimated as high risk: exposure to substance may result in a life threatening or organ system threatening outcome. Future exposure to the Substance may be considered an absolute contra-indication.
	 * <!-- end-model-doc -->
	 * @see #CRITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITH_VALUE = 1;

	/**
	 * The '<em><b>CRITU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unable to assess the potential clinical impact with the information available.
	 * <!-- end-model-doc -->
	 * @see #CRITU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITU_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allergy Intolerance Criticality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllergyIntoleranceCriticalityList[] VALUES_ARRAY =
		new AllergyIntoleranceCriticalityList[] {
			CRITL,
			CRITH,
			CRITU,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergy Intolerance Criticality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllergyIntoleranceCriticalityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergy Intolerance Criticality List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCriticalityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCriticalityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Criticality List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCriticalityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCriticalityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Criticality List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCriticalityList get(int value) {
		switch (value) {
			case CRITL_VALUE: return CRITL;
			case CRITH_VALUE: return CRITH;
			case CRITU_VALUE: return CRITU;
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
	private AllergyIntoleranceCriticalityList(int value, String name, String literal) {
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
	
} //AllergyIntoleranceCriticalityList
