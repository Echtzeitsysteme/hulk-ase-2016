/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MDefinition#getAbstractMethodInvocations <em>Abstract Method Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.MDefinition#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMDefinition()
 * @model abstract="true"
 * @generated
 */
public interface MDefinition extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Abstract Method Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.AbstractMethodInvocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Method Invocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Method Invocations</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_AbstractMethodInvocations()
	 * @model
	 * @generated
	 */
	EList<AbstractMethodInvocation> getAbstractMethodInvocations();

	/**
	 * Returns the value of the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.SingleVariableAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAbstract Field Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAbstract Field Access</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MAbstractFieldAccess()
	 * @model
	 * @generated
	 */
	EList<SingleVariableAccess> getMAbstractFieldAccess();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MDefinition
