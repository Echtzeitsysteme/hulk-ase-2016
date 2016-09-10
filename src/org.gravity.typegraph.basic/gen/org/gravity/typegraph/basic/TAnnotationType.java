/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAnnotationType#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotationType()
 * @model
 * @generated
 */
public interface TAnnotationType extends TAbstractType {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotationType_Annotations()
	 * @see org.gravity.typegraph.basic.TAnnotation#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<TAnnotation> getAnnotations();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAnnotationType
