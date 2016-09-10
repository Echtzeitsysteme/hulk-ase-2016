/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.modisco.MSignature#getMDefinitions <em>MDefinitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMSignature()
 * @model abstract="true"
 * @generated
 */
public interface MSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>MDefinitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MDefinitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDefinitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMSignature_MDefinitions()
	 * @model
	 * @generated
	 */
	EList<MDefinition> getMDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MSignature
