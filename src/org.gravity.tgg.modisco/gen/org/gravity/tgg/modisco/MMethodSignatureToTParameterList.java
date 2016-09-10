/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TParameterList;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Signature To TParameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodSignatureToTParameterList()
 * @model
 * @generated
 */
public interface MMethodSignatureToTParameterList extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MMethodSignature)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodSignatureToTParameterList_Source()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TParameterList)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodSignatureToTParameterList_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameterList getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameterList value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MMethodSignatureToTParameterList
