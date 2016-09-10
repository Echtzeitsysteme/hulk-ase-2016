/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.MethodDeclaration;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getMMethodName <em>MMethod Name</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}</li>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition()
 * @model
 * @generated
 */
public interface MMethodDefinition extends MethodDeclaration, MAbstractMethodDefinition {
	/**
	 * Returns the value of the '<em><b>MMethod Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodName#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Name</em>' reference.
	 * @see #setMMethodName(MMethodName)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_MMethodName()
	 * @see org.gravity.modisco.MMethodName#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions" required="true"
	 * @generated
	 */
	MMethodName getMMethodName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodDefinition#getMMethodName <em>MMethod Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMethod Name</em>' reference.
	 * @see #getMMethodName()
	 * @generated
	 */
	void setMMethodName(MMethodName value);

	/**
	 * Returns the value of the '<em><b>MMethod Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodSignature#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Signature</em>' reference.
	 * @see #setMMethodSignature(MMethodSignature)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_MMethodSignature()
	 * @see org.gravity.modisco.MMethodSignature#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions"
	 * @generated
	 */
	MMethodSignature getMMethodSignature();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMethod Signature</em>' reference.
	 * @see #getMMethodSignature()
	 * @generated
	 */
	void setMMethodSignature(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MGravityModel#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(MGravityModel)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_Model()
	 * @see org.gravity.modisco.MGravityModel#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions" required="true"
	 * @generated
	 */
	MGravityModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MGravityModel value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MMethodDefinition
