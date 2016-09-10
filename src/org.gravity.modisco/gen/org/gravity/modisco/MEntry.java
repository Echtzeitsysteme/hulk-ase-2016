/**
 */
package org.gravity.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.Type;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEntry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MEntry#getMNext <em>MNext</em>}</li>
 *   <li>{@link org.gravity.modisco.MEntry#getMPrevious <em>MPrevious</em>}</li>
 *   <li>{@link org.gravity.modisco.MEntry#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMEntry()
 * @model
 * @generated
 */
public interface MEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>MNext</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MEntry#getMPrevious <em>MPrevious</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MNext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNext</em>' reference.
	 * @see #setMNext(MEntry)
	 * @see org.gravity.modisco.ModiscoPackage#getMEntry_MNext()
	 * @see org.gravity.modisco.MEntry#getMPrevious
	 * @model opposite="mPrevious"
	 * @generated
	 */
	MEntry getMNext();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MEntry#getMNext <em>MNext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MNext</em>' reference.
	 * @see #getMNext()
	 * @generated
	 */
	void setMNext(MEntry value);

	/**
	 * Returns the value of the '<em><b>MPrevious</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MEntry#getMNext <em>MNext</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MPrevious</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPrevious</em>' reference.
	 * @see #setMPrevious(MEntry)
	 * @see org.gravity.modisco.ModiscoPackage#getMEntry_MPrevious()
	 * @see org.gravity.modisco.MEntry#getMNext
	 * @model opposite="mNext"
	 * @generated
	 */
	MEntry getMPrevious();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MEntry#getMPrevious <em>MPrevious</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPrevious</em>' reference.
	 * @see #getMPrevious()
	 * @generated
	 */
	void setMPrevious(MEntry value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMEntry_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MEntry#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MEntry
