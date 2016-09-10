/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MName</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MName#getMSignatures <em>MSignatures</em>}</li>
 *   <li>{@link org.gravity.modisco.MName#getMName <em>MName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMName()
 * @model abstract="true"
 * @generated
 */
public interface MName extends EObject {
	/**
	 * Returns the value of the '<em><b>MSignatures</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSignatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSignatures</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMName_MSignatures()
	 * @model
	 * @generated
	 */
	EList<MSignature> getMSignatures();

	/**
	 * Returns the value of the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName</em>' attribute.
	 * @see #setMName(String)
	 * @see org.gravity.modisco.ModiscoPackage#getMName_MName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MName#getMName <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MName</em>' attribute.
	 * @see #getMName()
	 * @generated
	 */
	void setMName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MName
