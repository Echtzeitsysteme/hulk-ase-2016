/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TFieldDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TFieldDefinition#getHiding <em>Hiding</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldDefinition()
 * @model
 * @generated
 */
public interface TFieldDefinition extends TMember {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFieldSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TFieldSignature)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldDefinition_Signature()
	 * @see org.gravity.typegraph.basic.TFieldSignature#getDefinitions
	 * @model opposite="definitions" required="true" transient="false"
	 * @generated
	 */
	TFieldSignature getSignature();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFieldDefinition#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TFieldSignature value);

	/**
	 * Returns the value of the '<em><b>Hiding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hiding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hiding</em>' reference.
	 * @see #setHiding(TFieldDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldDefinition_Hiding()
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy
	 * @model opposite="hiddenBy"
	 * @generated
	 */
	TFieldDefinition getHiding();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiding <em>Hiding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hiding</em>' reference.
	 * @see #getHiding()
	 * @generated
	 */
	void setHiding(TFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>Hidden By</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TFieldDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiding <em>Hiding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldDefinition_HiddenBy()
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiding
	 * @model opposite="hiding"
	 * @generated
	 */
	EList<TFieldDefinition> getHiddenBy();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TFieldDefinition
