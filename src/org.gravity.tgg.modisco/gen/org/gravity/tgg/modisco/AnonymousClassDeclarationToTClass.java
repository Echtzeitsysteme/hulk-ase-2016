/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Declaration To TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnonymousClassDeclarationToTClass()
 * @model
 * @generated
 */
public interface AnonymousClassDeclarationToTClass extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AnonymousClassDeclaration)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnonymousClassDeclarationToTClass_Source()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclaration getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AnonymousClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnonymousClassDeclarationToTClass_Target()
	 * @model required="true"
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AnonymousClassDeclarationToTClass
