/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.Type;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getMMethodName <em>MMethod Name</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getMMethodDefinitions <em>MMethod Definitions</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getMFirstEntry <em>MFirst Entry</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getMEntrys <em>MEntrys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature()
 * @model
 * @generated
 */
public interface MMethodSignature extends MSignature {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMMethodSignatures <em>MMethod Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_Model()
	 * @see org.gravity.modisco.MGravityModel#getMMethodSignatures
	 * @model opposite="mMethodSignatures" required="true" transient="false"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodSignature#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>MMethod Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodName#getMMethodSignatures <em>MMethod Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Name</em>' reference.
	 * @see #setMMethodName(MMethodName)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_MMethodName()
	 * @see org.gravity.modisco.MMethodName#getMMethodSignatures
	 * @model opposite="mMethodSignatures" required="true"
	 * @generated
	 */
	MMethodName getMMethodName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodSignature#getMMethodName <em>MMethod Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMethod Name</em>' reference.
	 * @see #getMMethodName()
	 * @generated
	 */
	void setMMethodName(MMethodName value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodSignature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>MMethod Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_MMethodDefinitions()
	 * @see org.gravity.modisco.MMethodDefinition#getMMethodSignature
	 * @model opposite="mMethodSignature"
	 * @generated
	 */
	EList<MMethodDefinition> getMMethodDefinitions();

	/**
	 * Returns the value of the '<em><b>MFirst Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFirst Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFirst Entry</em>' reference.
	 * @see #setMFirstEntry(MEntry)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_MFirstEntry()
	 * @model
	 * @generated
	 */
	MEntry getMFirstEntry();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodSignature#getMFirstEntry <em>MFirst Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFirst Entry</em>' reference.
	 * @see #getMFirstEntry()
	 * @generated
	 */
	void setMFirstEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>MEntrys</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEntrys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEntrys</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_MEntrys()
	 * @model containment="true"
	 * @generated
	 */
	EList<MEntry> getMEntrys();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MMethodSignature
