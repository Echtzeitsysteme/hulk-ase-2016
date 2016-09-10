/**
 */
package org.gravity.hulk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.moflon.core.dfs.DFSGraph;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnti Pattern Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.HAntiPatternDetection#getApg <em>Apg</em>}</li>
 *   <li>{@link org.gravity.hulk.HAntiPatternDetection#getDetectors <em>Detectors</em>}</li>
 *   <li>{@link org.gravity.hulk.HAntiPatternDetection#getProgramlocation <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.HulkPackage#getHAntiPatternDetection()
 * @model
 * @generated
 */
public interface HAntiPatternDetection extends EObject {
	/**
	 * Returns the value of the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apg</em>' containment reference.
	 * @see #setApg(HAntiPatternGraph)
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternDetection_Apg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HAntiPatternGraph getApg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HAntiPatternDetection#getApg <em>Apg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apg</em>' containment reference.
	 * @see #getApg()
	 * @generated
	 */
	void setApg(HAntiPatternGraph value);

	/**
	 * Returns the value of the '<em><b>Detectors</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.HDetector}.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.HDetector#getHulk <em>Hulk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detectors</em>' reference list.
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternDetection_Detectors()
	 * @see org.gravity.hulk.HDetector#getHulk
	 * @model opposite="hulk"
	 * @generated
	 */
	EList<HDetector> getDetectors();

	/**
	 * Returns the value of the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programlocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlocation</em>' attribute.
	 * @see #setProgramlocation(String)
	 * @see org.gravity.hulk.HulkPackage#getHAntiPatternDetection_Programlocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getProgramlocation();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.HAntiPatternDetection#getProgramlocation <em>Programlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlocation</em>' attribute.
	 * @see #getProgramlocation()
	 * @generated
	 */
	void setProgramlocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createAntiPatternDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createCodeSmellDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createMetricDependencies(DFSGraph graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DFSGraph getDependencyGraph();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternDetection
