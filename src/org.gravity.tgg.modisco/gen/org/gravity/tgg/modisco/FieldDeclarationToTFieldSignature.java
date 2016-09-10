/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.FieldDeclaration;

import org.gravity.typegraph.basic.TFieldSignature;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Declaration To TField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getFieldDeclarationToTFieldSignature()
 * @model
 * @generated
 */
public interface FieldDeclarationToTFieldSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FieldDeclaration)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getFieldDeclarationToTFieldSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	FieldDeclaration getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FieldDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFieldSignature)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getFieldDeclarationToTFieldSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FieldDeclarationToTFieldSignature
