/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MSignature;

import org.gravity.typegraph.basic.TMethodSignature;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSignature To TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMSignatureToTMethodSignature()
 * @model
 * @generated
 */
public interface MSignatureToTMethodSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethodSignature)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMSignatureToTMethodSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MSignature)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMSignatureToTMethodSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	MSignature getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MSignatureToTMethodSignature
