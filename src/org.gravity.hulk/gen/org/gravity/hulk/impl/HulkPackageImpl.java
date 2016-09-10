/**
 */
package org.gravity.hulk.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.detection.impl.DetectionPackageImpl;

import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.detection.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage;

import org.gravity.hulk.detection.metrics.sourcemeter.impl.SourcemeterPackageImpl;

import org.moflon.core.dfs.DfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HulkPackageImpl extends EPackageImpl implements HulkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAntiPatternDetectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDetectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.hulk.HulkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HulkPackageImpl() {
		super(eNS_URI, HulkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HulkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HulkPackage init() {
		if (isInited)
			return (HulkPackage) EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);

		// Obtain or create and register package
		HulkPackageImpl theHulkPackage = (HulkPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof HulkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new HulkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DetectionPackageImpl theDetectionPackage = (DetectionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI) instanceof DetectionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI)
						: DetectionPackage.eINSTANCE);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AntipatternPackage.eNS_URI) instanceof AntipatternPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI)
						: AntipatternPackage.eINSTANCE);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI) instanceof CodesmellsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI)
						: CodesmellsPackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		SourcemeterPackageImpl theSourcemeterPackage = (SourcemeterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SourcemeterPackage.eNS_URI) instanceof SourcemeterPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(SourcemeterPackage.eNS_URI)
						: SourcemeterPackage.eINSTANCE);

		// Create package meta-data objects
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theSourcemeterPackage.createPackageContents();

		// Initialize created meta-data
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theSourcemeterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHulkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HulkPackage.eNS_URI, theHulkPackage);
		return theHulkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAntiPatternDetection() {
		return hAntiPatternDetectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHAntiPatternDetection_Apg() {
		return (EReference) hAntiPatternDetectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHAntiPatternDetection_Detectors() {
		return (EReference) hAntiPatternDetectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHAntiPatternDetection_Programlocation() {
		return (EAttribute) hAntiPatternDetectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__CreateMetricDependencies__DFSGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__Detect() {
		return hAntiPatternDetectionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAntiPatternDetection__GetDependencyGraph() {
		return hAntiPatternDetectionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDetector() {
		return hDetectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDetector_Hulk() {
		return (EReference) hDetectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDetector_HAnnotation() {
		return (EReference) hDetectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDetector__Detect__HAntiPatternGraph() {
		return hDetectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDetector__GetNextID() {
		return hDetectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HulkFactory getHulkFactory() {
		return (HulkFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hAntiPatternDetectionEClass = createEClass(HANTI_PATTERN_DETECTION);
		createEReference(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION__APG);
		createEReference(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION__DETECTORS);
		createEAttribute(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION__PROGRAMLOCATION);
		createEOperation(hAntiPatternDetectionEClass,
				HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass,
				HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___DETECT);
		createEOperation(hAntiPatternDetectionEClass, HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH);

		hDetectorEClass = createEClass(HDETECTOR);
		createEReference(hDetectorEClass, HDETECTOR__HULK);
		createEReference(hDetectorEClass, HDETECTOR__HANNOTATION);
		createEOperation(hDetectorEClass, HDETECTOR___DETECT__HANTIPATTERNGRAPH);
		createEOperation(hDetectorEClass, HDETECTOR___GET_NEXT_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		DfsPackage theDfsPackage = (DfsPackage) EPackage.Registry.INSTANCE.getEPackage(DfsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDetectionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hDetectorEClass.getESuperTypes().add(theDfsPackage.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(hAntiPatternDetectionEClass, HAntiPatternDetection.class, "HAntiPatternDetection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHAntiPatternDetection_Apg(), theAntipatterngraphPackage.getHAntiPatternGraph(), null, "apg",
				null, 1, 1, HAntiPatternDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAntiPatternDetection_Detectors(), this.getHDetector(), this.getHDetector_Hulk(), "detectors",
				null, 0, -1, HAntiPatternDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAntiPatternDetection_Programlocation(), ecorePackage.getEString(), "programlocation", null,
				1, 1, HAntiPatternDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getHAntiPatternDetection__CreateAntiPatternDependencies__DFSGraph(), null,
				"createAntiPatternDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAntiPatternDetection__CreateCodeSmellDependencies__DFSGraph(), null,
				"createCodeSmellDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAntiPatternDetection__CreateMetricDependencies__DFSGraph(), null,
				"createMetricDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDfsPackage.getDFSGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHAntiPatternDetection__Detect(), ecorePackage.getEBoolean(), "detect", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHAntiPatternDetection__GetDependencyGraph(), theDfsPackage.getDFSGraph(),
				"getDependencyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDetectorEClass, HDetector.class, "HDetector", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDetector_Hulk(), this.getHAntiPatternDetection(), this.getHAntiPatternDetection_Detectors(),
				"hulk", null, 1, 1, HDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDetector_HAnnotation(), theAntipatterngraphPackage.getHAnnotation(), null, "hAnnotation",
				null, 0, -1, HDetector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getHDetector__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHDetector__GetNextID(), ecorePackage.getEInt(), "getNextID", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HulkPackageImpl
