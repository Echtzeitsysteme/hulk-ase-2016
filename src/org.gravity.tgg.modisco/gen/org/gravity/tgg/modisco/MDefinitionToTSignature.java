/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TSignature;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition To TSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMDefinitionToTSignature()
 * @model
 * @generated
 */
public interface MDefinitionToTSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TSignature)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMDefinitionToTSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TSignature getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TSignature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MDefinition)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMDefinitionToTSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	MDefinition getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MDefinitionToTSignature
