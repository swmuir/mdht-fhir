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
 * A representation of the literals of the enumeration '<em><b>Specimen Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSpecimenStatusList()
 * @model extendedMetaData="name='SpecimenStatus-list'"
 * @generated
 */
public enum SpecimenStatusList implements Enumerator {
	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABLE(0, "available", "available"),

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(1, "unavailable", "unavailable"),

	/**
	 * The '<em><b>Unsatisfactory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSATISFACTORY_VALUE
	 * @generated
	 * @ordered
	 */
	UNSATISFACTORY(2, "unsatisfactory", "unsatisfactory"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(3, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical specimen is present and in good condition.
	 * <!-- end-model-doc -->
	 * @see #AVAILABLE
	 * @model name="available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE_VALUE = 0;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is no physical specimen because it is either lost, destroyed or consumed.
	 * <!-- end-model-doc -->
	 * @see #UNAVAILABLE
	 * @model name="unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 1;

	/**
	 * The '<em><b>Unsatisfactory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
	 * <!-- end-model-doc -->
	 * @see #UNSATISFACTORY
	 * @model name="unsatisfactory"
	 * @generated
	 * @ordered
	 */
	public static final int UNSATISFACTORY_VALUE = 2;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen was entered in error and therefore nullified.
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Specimen Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecimenStatusList[] VALUES_ARRAY =
		new SpecimenStatusList[] {
			AVAILABLE,
			UNAVAILABLE,
			UNSATISFACTORY,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Specimen Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecimenStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Specimen Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenStatusList get(int value) {
		switch (value) {
			case AVAILABLE_VALUE: return AVAILABLE;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
			case UNSATISFACTORY_VALUE: return UNSATISFACTORY;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
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
	private SpecimenStatusList(int value, String name, String literal) {
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
	
} //SpecimenStatusList
