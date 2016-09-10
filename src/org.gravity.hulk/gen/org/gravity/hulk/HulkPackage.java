/**
 */
package org.gravity.hulk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.HulkFactory
 * @model kind="package"
 * @generated
 */
public interface HulkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hulk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk/model/Hulk.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HulkPackage eINSTANCE = org.gravity.hulk.impl.HulkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl <em>HAnti Pattern Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HAntiPatternDetectionImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternDetection()
	 * @generated
	 */
	int HANTI_PATTERN_DETECTION = 0;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__APG = 0;

	/**
	 * The feature id for the '<em><b>Detectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__DETECTORS = 1;

	/**
	 * The feature id for the '<em><b>Programlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION__PROGRAMLOCATION = 2;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Anti Pattern Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH = 0;

	/**
	 * The operation id for the '<em>Create Code Smell Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH = 1;

	/**
	 * The operation id for the '<em>Create Metric Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH = 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___DETECT = 3;

	/**
	 * The operation id for the '<em>Get Dependency Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH = 4;

	/**
	 * The number of operations of the '<em>HAnti Pattern Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_DETECTION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.impl.HDetectorImpl <em>HDetector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.impl.HDetectorImpl
	 * @see org.gravity.hulk.impl.HulkPackageImpl#getHDetector()
	 * @generated
	 */
	int HDETECTOR = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__INCOMING = DfsPackage.NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__GRAPH = DfsPackage.NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__ORIGIN = DfsPackage.NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__OUTGOING = DfsPackage.NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__POST_TRAVERSAL = DfsPackage.NODE__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__PRE_TRAVERSAL = DfsPackage.NODE__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Hulk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__HULK = DfsPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR__HANNOTATION = DfsPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HDetector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR_FEATURE_COUNT = DfsPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR___DETECT__HANTIPATTERNGRAPH = DfsPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR___GET_NEXT_ID = DfsPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HDetector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDETECTOR_OPERATION_COUNT = DfsPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HAntiPatternDetection <em>HAnti Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Detection</em>'.
	 * @see org.gravity.hulk.HAntiPatternDetection
	 * @generated
	 */
	EClass getHAntiPatternDetection();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.hulk.HAntiPatternDetection#getApg <em>Apg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apg</em>'.
	 * @see org.gravity.hulk.HAntiPatternDetection#getApg()
	 * @see #getHAntiPatternDetection()
	 * @generated
	 */
	EReference getHAntiPatternDetection_Apg();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.HAntiPatternDetection#getDetectors <em>Detectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detectors</em>'.
	 * @see org.gravity.hulk.HAntiPatternDetection#getDetectors()
	 * @see #getHAntiPatternDetection()
	 * @generated
	 */
	EReference getHAntiPatternDetection_Detectors();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.HAntiPatternDetection#getProgramlocation <em>Programlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programlocation</em>'.
	 * @see org.gravity.hulk.HAntiPatternDetection#getProgramlocation()
	 * @see #getHAntiPatternDetection()
	 * @generated
	 */
	EAttribute getHAntiPatternDetection_Programlocation();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createAntiPatternDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Anti Pattern Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Anti Pattern Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createAntiPatternDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createCodeSmellDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Code Smell Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Code Smell Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createCodeSmellDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#createMetricDependencies(org.moflon.core.dfs.DFSGraph) <em>Create Metric Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Metric Dependencies</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#createMetricDependencies(org.moflon.core.dfs.DFSGraph)
	 * @generated
	 */
	EOperation getHAntiPatternDetection__CreateMetricDependencies__DFSGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#detect() <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#detect()
	 * @generated
	 */
	EOperation getHAntiPatternDetection__Detect();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HAntiPatternDetection#getDependencyGraph() <em>Get Dependency Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dependency Graph</em>' operation.
	 * @see org.gravity.hulk.HAntiPatternDetection#getDependencyGraph()
	 * @generated
	 */
	EOperation getHAntiPatternDetection__GetDependencyGraph();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.HDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDetector</em>'.
	 * @see org.gravity.hulk.HDetector
	 * @generated
	 */
	EClass getHDetector();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.HDetector#getHulk <em>Hulk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hulk</em>'.
	 * @see org.gravity.hulk.HDetector#getHulk()
	 * @see #getHDetector()
	 * @generated
	 */
	EReference getHDetector_Hulk();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.HDetector#getHAnnotation <em>HAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HAnnotation</em>'.
	 * @see org.gravity.hulk.HDetector#getHAnnotation()
	 * @see #getHDetector()
	 * @generated
	 */
	EReference getHDetector_HAnnotation();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HDetector#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph) <em>Detect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect</em>' operation.
	 * @see org.gravity.hulk.HDetector#detect(org.gravity.hulk.antipatterngraph.HAntiPatternGraph)
	 * @generated
	 */
	EOperation getHDetector__Detect__HAntiPatternGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.HDetector#getNextID() <em>Get Next ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next ID</em>' operation.
	 * @see org.gravity.hulk.HDetector#getNextID()
	 * @generated
	 */
	EOperation getHDetector__GetNextID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HulkFactory getHulkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HAntiPatternDetectionImpl <em>HAnti Pattern Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HAntiPatternDetectionImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHAntiPatternDetection()
		 * @generated
		 */
		EClass HANTI_PATTERN_DETECTION = eINSTANCE.getHAntiPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Apg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_DETECTION__APG = eINSTANCE.getHAntiPatternDetection_Apg();

		/**
		 * The meta object literal for the '<em><b>Detectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANTI_PATTERN_DETECTION__DETECTORS = eINSTANCE.getHAntiPatternDetection_Detectors();

		/**
		 * The meta object literal for the '<em><b>Programlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANTI_PATTERN_DETECTION__PROGRAMLOCATION = eINSTANCE.getHAntiPatternDetection_Programlocation();

		/**
		 * The meta object literal for the '<em><b>Create Anti Pattern Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Create Code Smell Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Create Metric Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH = eINSTANCE
				.getHAntiPatternDetection__CreateMetricDependencies__DFSGraph();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___DETECT = eINSTANCE.getHAntiPatternDetection__Detect();

		/**
		 * The meta object literal for the '<em><b>Get Dependency Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH = eINSTANCE
				.getHAntiPatternDetection__GetDependencyGraph();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.impl.HDetectorImpl <em>HDetector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.impl.HDetectorImpl
		 * @see org.gravity.hulk.impl.HulkPackageImpl#getHDetector()
		 * @generated
		 */
		EClass HDETECTOR = eINSTANCE.getHDetector();

		/**
		 * The meta object literal for the '<em><b>Hulk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDETECTOR__HULK = eINSTANCE.getHDetector_Hulk();

		/**
		 * The meta object literal for the '<em><b>HAnnotation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDETECTOR__HANNOTATION = eINSTANCE.getHDetector_HAnnotation();

		/**
		 * The meta object literal for the '<em><b>Detect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDETECTOR___DETECT__HANTIPATTERNGRAPH = eINSTANCE.getHDetector__Detect__HAntiPatternGraph();

		/**
		 * The meta object literal for the '<em><b>Get Next ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDETECTOR___GET_NEXT_ID = eINSTANCE.getHDetector__GetNextID();

	}

} //HulkPackage
