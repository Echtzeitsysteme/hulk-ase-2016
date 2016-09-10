/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MConstructorDefinition;

import org.gravity.typegraph.basic.TParameterList;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConstructor Definition To TParameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMConstructorDefinitionToTParameterList()
 * @model
 * @generated
 */
public interface MConstructorDefinitionToTParameterList extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MConstructorDefinition)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMConstructorDefinitionToTParameterList_Source()
	 * @model required="true"
	 * @generated
	 */
	MConstructorDefinition getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MConstructorDefinition value);

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
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMConstructorDefinitionToTParameterList_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameterList getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameterList value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MConstructorDefinitionToTParameterList
