/**
 */
package org.gravity.hulk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.HDetector#getHulk <em>Hulk</em>}</li>
 *   <li>{@link org.gravity.hulk.HDetector#getHAnnotation <em>HAnnotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.HulkPackage#getHDetector()
 * @model abstract="true"
 * @generated
 */
public interface HDetector extends EObject, Node {
	/**
	 * Returns the value of the '<em><b>Hulk</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.HAntiPatternDetection#getDetectors <em>Detectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hulk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hulk</em>' reference.
	 * @see #setHulk(HAntiPatternDetection)
	 * @see org.gravity.hulk.HulkPackage#getHDetector_Hulk()
	 * @see org.gravity.hulk.HAntiPatternDetection#getDetectors
	 * @model opposite="detectors" required="true"
	 * @generated
	 */
	HAntiPatternDetection getHulk();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HDetector#getHulk <em>Hulk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hulk</em>' reference.
	 * @see #getHulk()
	 * @generated
	 */
	void setHulk(HAntiPatternDetection value);

	/**
	 * Returns the value of the '<em><b>HAnnotation</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.HAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAnnotation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAnnotation</em>' reference list.
	 * @see org.gravity.hulk.HulkPackage#getHDetector_HAnnotation()
	 * @model
	 * @generated
	 */
	EList<HAnnotation> getHAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNextID();

	// <-- [user code injected with eMoflon]
	String getGuiName();
	// [user code injected with eMoflon] -->
} // HDetector
