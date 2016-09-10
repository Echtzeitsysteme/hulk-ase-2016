/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.Rules.RulesFactory;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.impl.ModiscoPackageImpl;

import org.gravity.tgg.modisco.preprocessing.PreprocessingPackage;

import org.gravity.tgg.modisco.preprocessing.impl.PreprocessingPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.tgg.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToPgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToPGPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPackageToPGPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedInterfaceInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeToClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedClassInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureReturnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypesToClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceExtendsInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExtendsClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classImplementsInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerMethodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDefinitionToClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeWithValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLinkFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeToClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypesIsVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkSignatureToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclarationEClass = null;

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
	 * @see org.gravity.tgg.modisco.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();
		ModiscoPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModiscoPackageImpl theModiscoPackage_1 = (ModiscoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.tgg.modisco.ModiscoPackage.eNS_URI) instanceof ModiscoPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(org.gravity.tgg.modisco.ModiscoPackage.eNS_URI)
						: org.gravity.tgg.modisco.ModiscoPackage.eINSTANCE);
		PreprocessingPackageImpl thePreprocessingPackage = (PreprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PreprocessingPackage.eNS_URI) instanceof PreprocessingPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PreprocessingPackage.eNS_URI)
						: PreprocessingPackage.eINSTANCE);

		// Load packages
		theModiscoPackage_1.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theModiscoPackage_1.fixPackageContents();
		thePreprocessingPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		if (compilationUnitEClass == null) {
			compilationUnitEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsAppropriate_FWD__Match_Model_CompilationUnit() {
		return getCompilationUnit().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__Perform_FWD__IsApplicableMatch() {
		return getCompilationUnit().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_FWD__Match() {
		return getCompilationUnit().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__RegisterObjectsToMatch_FWD__Match_Model_CompilationUnit() {
		return getCompilationUnit().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsAppropriate_solveCsp_FWD__Match_Model_CompilationUnit() {
		return getCompilationUnit().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsAppropriate_checkCsp_FWD__CSP() {
		return getCompilationUnit().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_TypeGraph_CompilationUnit_ModelToTypeGraph() {
		return getCompilationUnit().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_checkCsp_FWD__CSP() {
		return getCompilationUnit().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getCompilationUnit().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__CheckTypes_FWD__Match() {
		return getCompilationUnit().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getCompilationUnit().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__CheckAttributes_FWD__TripleMatch() {
		return getCompilationUnit().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__CheckAttributes_BWD__TripleMatch() {
		return getCompilationUnit().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_CC__Match_Match() {
		return getCompilationUnit().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_solveCsp_CC__CCMatch_Model_TypeGraph_CompilationUnit_ModelToTypeGraph_Match_Match() {
		return getCompilationUnit().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__IsApplicable_checkCsp_CC__CSP() {
		return getCompilationUnit().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__CheckDEC_FWD__Model_CompilationUnit() {
		return getCompilationUnit().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__CheckDEC_BWD__TypeGraph() {
		return getCompilationUnit().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getCompilationUnit().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getCompilationUnit().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__GenerateModel_checkCsp_BWD__CSP() {
		return getCompilationUnit().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelToPg() {
		if (modelToPgEClass == null) {
			modelToPgEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return modelToPgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__Perform_FWD__IsApplicableMatch() {
		return getModelToPg().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_FWD__Match() {
		return getModelToPg().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__RegisterObjectsToMatch_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_solveCsp_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_checkCsp_FWD__CSP() {
		return getModelToPg().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel() {
		return getModelToPg().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_checkCsp_FWD__CSP() {
		return getModelToPg().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getModelToPg().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckTypes_FWD__Match() {
		return getModelToPg().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__Perform_BWD__IsApplicableMatch() {
		return getModelToPg().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_BWD__Match() {
		return getModelToPg().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__RegisterObjectsToMatch_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_solveCsp_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph() {
		return getModelToPg().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getModelToPg().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckTypes_BWD__Match() {
		return getModelToPg().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_FWD_MGravityModel_0__MGravityModel() {
		return getModelToPg().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsAppropriate_BWD_TypeGraph_0__TypeGraph() {
		return getModelToPg().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckAttributes_FWD__TripleMatch() {
		return getModelToPg().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckAttributes_BWD__TripleMatch() {
		return getModelToPg().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_CC__Match_Match() {
		return getModelToPg().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_solveCsp_CC__CCMatch_MGravityModel_TypeGraph_Match_Match() {
		return getModelToPg().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__IsApplicable_checkCsp_CC__CSP() {
		return getModelToPg().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckDEC_FWD__MGravityModel() {
		return getModelToPg().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__CheckDEC_BWD__TypeGraph() {
		return getModelToPg().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__GenerateModel__RuleEntryContainer() {
		return getModelToPg().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getModelToPg().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelToPg__GenerateModel_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageToPGPackage() {
		if (packageToPGPackageEClass == null) {
			packageToPGPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return packageToPGPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__Perform_FWD__IsApplicableMatch() {
		return getPackageToPGPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_FWD__Match() {
		return getPackageToPGPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__RegisterObjectsToMatch_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_solveCsp_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Package_TypeGraph_ModelToTypeGraph() {
		return getPackageToPGPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageToPGPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckTypes_FWD__Match() {
		return getPackageToPGPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__Perform_BWD__IsApplicableMatch() {
		return getPackageToPGPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_BWD__Match() {
		return getPackageToPGPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__RegisterObjectsToMatch_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model_TypeGraph_TPackage_ModelToTypeGraph() {
		return getPackageToPGPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageToPGPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckTypes_BWD__Match() {
		return getPackageToPGPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getPackageToPGPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getPackageToPGPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckAttributes_FWD__TripleMatch() {
		return getPackageToPGPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckAttributes_BWD__TripleMatch() {
		return getPackageToPGPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_CC__Match_Match() {
		return getPackageToPGPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_CC__CCMatch_Model_Package_TypeGraph_TPackage_ModelToTypeGraph_Match_Match() {
		return getPackageToPGPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_CC__CSP() {
		return getPackageToPGPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckDEC_FWD__Model_Package() {
		return getPackageToPGPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__CheckDEC_BWD__TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPackageToPGPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getPackageToPGPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageToPGPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPackageToPGPackage() {
		if (subPackageToPGPackageEClass == null) {
			subPackageToPGPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return subPackageToPGPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__Perform_FWD__IsApplicableMatch() {
		return getSubPackageToPGPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_FWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__RegisterObjectsToMatch_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_solveCsp_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_TPackage_Package_PackageToTPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSubPackageToPGPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckTypes_FWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_BWD__Match_TPackage_TPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__Perform_BWD__IsApplicableMatch() {
		return getSubPackageToPGPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_BWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__RegisterObjectsToMatch_BWD__Match_TPackage_TPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_solveCsp_BWD__Match_TPackage_TPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TPackage_Package_PackageToTPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSubPackageToPGPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckTypes_BWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getSubPackageToPGPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getSubPackageToPGPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckAttributes_FWD__TripleMatch() {
		return getSubPackageToPGPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckAttributes_BWD__TripleMatch() {
		return getSubPackageToPGPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_CC__Match_Match() {
		return getSubPackageToPGPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_CC__CCMatch_Package_TPackage_TPackage_Package_PackageToTPackage_TypeGraph_Match_Match() {
		return getSubPackageToPGPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_CC__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckDEC_FWD__Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__CheckDEC_BWD__TPackage_TPackage_TypeGraph() {
		return getSubPackageToPGPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getSubPackageToPGPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_TPackage_Package_PackageToTPackage_TypeGraph_ModelgeneratorRuleResult() {
		return getSubPackageToPGPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubPackageToPGPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypes() {
		if (typesEClass == null) {
			typesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(4);
		}
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedInterfaceInType() {
		if (nestedInterfaceInTypeEClass == null) {
			nestedInterfaceInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return nestedInterfaceInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__Perform_FWD__IsApplicableMatch() {
		return getNestedInterfaceInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_FWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedInterfaceInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckTypes_FWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_BWD__Match_TPackage_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__Perform_BWD__IsApplicableMatch() {
		return getNestedInterfaceInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_BWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_TInterface_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedInterfaceInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckTypes_BWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getNestedInterfaceInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getNestedInterfaceInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckAttributes_FWD__TripleMatch() {
		return getNestedInterfaceInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckAttributes_BWD__TripleMatch() {
		return getNestedInterfaceInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_CC__Match_Match() {
		return getNestedInterfaceInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_CC__CCMatch_InterfaceDeclaration_TPackage_TypeGraph_TInterface_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedInterfaceInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedInterfaceInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckDEC_FWD__InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__CheckDEC_BWD__TPackage_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedInterfaceInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedInterfaceInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedInterfaceInType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedTypeToClass() {
		if (parameterizedTypeToClassEClass == null) {
			parameterizedTypeToClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return parameterizedTypeToClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsAppropriate_FWD__Match_Model_ParameterizedType_TypeAccess_Type() {
		return getParameterizedTypeToClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__Perform_FWD__IsApplicableMatch() {
		return getParameterizedTypeToClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_FWD__Match() {
		return getParameterizedTypeToClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__RegisterObjectsToMatch_FWD__Match_Model_ParameterizedType_TypeAccess_Type() {
		return getParameterizedTypeToClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsAppropriate_solveCsp_FWD__Match_Model_ParameterizedType_TypeAccess_Type() {
		return getParameterizedTypeToClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedTypeToClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_ModelToTypeGraph_Model_ParameterizedType_TypeAccess_Type_TypeGraph_TAbstractType_TypeToTAbstractType() {
		return getParameterizedTypeToClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedTypeToClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedTypeToClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__CheckTypes_FWD__Match() {
		return getParameterizedTypeToClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getParameterizedTypeToClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedTypeToClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedTypeToClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_CC__Match_Match() {
		return getParameterizedTypeToClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_solveCsp_CC__CCMatch_ModelToTypeGraph_Model_ParameterizedType_TypeAccess_Type_TypeGraph_TAbstractType_TypeToTAbstractType_Match_Match() {
		return getParameterizedTypeToClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedTypeToClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__CheckDEC_FWD__Model_ParameterizedType_TypeAccess_Type() {
		return getParameterizedTypeToClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__CheckDEC_BWD__TypeGraph_TAbstractType() {
		return getParameterizedTypeToClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getParameterizedTypeToClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_Model_Type_TypeGraph_TAbstractType_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getParameterizedTypeToClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterizedTypeToClass__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedTypeToClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedClassInType() {
		if (nestedClassInTypeEClass == null) {
			nestedClassInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return nestedClassInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_FWD__Match_ClassDeclaration_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__Perform_FWD__IsApplicableMatch() {
		return getNestedClassInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_FWD__Match() {
		return getNestedClassInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedClassInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedClassInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedClassInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedClassInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckTypes_FWD__Match() {
		return getNestedClassInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__Perform_BWD__IsApplicableMatch() {
		return getNestedClassInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_BWD__Match() {
		return getNestedClassInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedClassInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedClassInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckTypes_BWD__Match() {
		return getNestedClassInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getNestedClassInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getNestedClassInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckAttributes_FWD__TripleMatch() {
		return getNestedClassInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckAttributes_BWD__TripleMatch() {
		return getNestedClassInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_CC__Match_Match() {
		return getNestedClassInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_solveCsp_CC__CCMatch_ClassDeclaration_TPackage_TypeGraph_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedClassInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedClassInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckDEC_FWD__ClassDeclaration_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__CheckDEC_BWD__TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedClassInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedClassInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedClassInType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureReturnType() {
		if (signatureReturnTypeEClass == null) {
			signatureReturnTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return signatureReturnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_FWD__Match_MMethodSignature_Type() {
		return getSignatureReturnType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__Perform_FWD__IsApplicableMatch() {
		return getSignatureReturnType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_FWD__Match() {
		return getSignatureReturnType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__RegisterObjectsToMatch_FWD__Match_MMethodSignature_Type() {
		return getSignatureReturnType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_Type() {
		return getSignatureReturnType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_checkCsp_FWD__CSP() {
		return getSignatureReturnType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodSignature_TMethodSignature_MMethodSignatureToTMethodSignature_Type_TAbstractType_TypeToTAbstractType() {
		return getSignatureReturnType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_checkCsp_FWD__CSP() {
		return getSignatureReturnType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSignatureReturnType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckTypes_FWD__Match() {
		return getSignatureReturnType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_BWD__Match_TMethodSignature_TAbstractType() {
		return getSignatureReturnType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__Perform_BWD__IsApplicableMatch() {
		return getSignatureReturnType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_BWD__Match() {
		return getSignatureReturnType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TAbstractType() {
		return getSignatureReturnType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TAbstractType() {
		return getSignatureReturnType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_checkCsp_BWD__CSP() {
		return getSignatureReturnType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodSignature_TMethodSignature_MMethodSignatureToTMethodSignature_Type_TAbstractType_TypeToTAbstractType() {
		return getSignatureReturnType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_checkCsp_BWD__CSP() {
		return getSignatureReturnType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSignatureReturnType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckTypes_BWD__Match() {
		return getSignatureReturnType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getSignatureReturnType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getSignatureReturnType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckAttributes_FWD__TripleMatch() {
		return getSignatureReturnType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckAttributes_BWD__TripleMatch() {
		return getSignatureReturnType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_CC__Match_Match() {
		return getSignatureReturnType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_solveCsp_CC__CCMatch_MMethodSignature_TMethodSignature_MMethodSignatureToTMethodSignature_Type_TAbstractType_TypeToTAbstractType_Match_Match() {
		return getSignatureReturnType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__IsApplicable_checkCsp_CC__CSP() {
		return getSignatureReturnType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckDEC_FWD__MMethodSignature_Type() {
		return getSignatureReturnType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__CheckDEC_BWD__TMethodSignature_TAbstractType() {
		return getSignatureReturnType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__GenerateModel__RuleEntryContainer_MMethodSignatureToTMethodSignature_TypeToTAbstractType() {
		return getSignatureReturnType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodSignature_TMethodSignature_MMethodSignatureToTMethodSignature_Type_TAbstractType_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getSignatureReturnType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSignatureReturnType__GenerateModel_checkCsp_BWD__CSP() {
		return getSignatureReturnType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		if (interfaceEClass == null) {
			interfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(9);
		}
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_FWD__Match_Package_InterfaceDeclaration() {
		return getInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__Perform_FWD__IsApplicableMatch() {
		return getInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_FWD__Match() {
		return getInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__RegisterObjectsToMatch_FWD__Match_Package_InterfaceDeclaration() {
		return getInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_solveCsp_FWD__Match_Package_InterfaceDeclaration() {
		return getInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_InterfaceDeclaration() {
		return getInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckTypes_FWD__Match() {
		return getInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_BWD__Match_TInterface_TPackage_TypeGraph() {
		return getInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__Perform_BWD__IsApplicableMatch() {
		return getInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_BWD__Match() {
		return getInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__RegisterObjectsToMatch_BWD__Match_TInterface_TPackage_TypeGraph() {
		return getInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_solveCsp_BWD__Match_TInterface_TPackage_TypeGraph() {
		return getInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TInterface_TPackage_Package_TypeGraph() {
		return getInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckTypes_BWD__Match() {
		return getInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckAttributes_FWD__TripleMatch() {
		return getInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckAttributes_BWD__TripleMatch() {
		return getInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_CC__Match_Match() {
		return getInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_solveCsp_CC__CCMatch_PackageToTPackage_TInterface_TPackage_Package_TypeGraph_InterfaceDeclaration_Match_Match() {
		return getInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__IsApplicable_checkCsp_CC__CSP() {
		return getInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckDEC_FWD__Package_InterfaceDeclaration() {
		return getInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__CheckDEC_BWD__TInterface_TPackage_TypeGraph() {
		return getInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldSignature() {
		if (fieldSignatureEClass == null) {
			fieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return fieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_FWD__Match_MFieldName_MFieldSignature() {
		return getFieldSignature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__Perform_FWD__IsApplicableMatch() {
		return getFieldSignature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_FWD__Match() {
		return getFieldSignature().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__RegisterObjectsToMatch_FWD__Match_MFieldName_MFieldSignature() {
		return getFieldSignature().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_solveCsp_FWD__Match_MFieldName_MFieldSignature() {
		return getFieldSignature().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldSignature().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldName_TField_MFieldNameToTField_MFieldSignature() {
		return getFieldSignature().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldSignature().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldSignature().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckTypes_FWD__Match() {
		return getFieldSignature().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_BWD__Match_TField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__Perform_BWD__IsApplicableMatch() {
		return getFieldSignature().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_BWD__Match() {
		return getFieldSignature().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__RegisterObjectsToMatch_BWD__Match_TField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_solveCsp_BWD__Match_TField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_MFieldName_TField_MFieldNameToTField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldSignature().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckTypes_BWD__Match() {
		return getFieldSignature().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getFieldSignature().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getFieldSignature().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckAttributes_FWD__TripleMatch() {
		return getFieldSignature().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckAttributes_BWD__TripleMatch() {
		return getFieldSignature().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_CC__Match_Match() {
		return getFieldSignature().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_solveCsp_CC__CCMatch_MFieldName_TField_MFieldNameToTField_MFieldSignature_TFieldSignature_Match_Match() {
		return getFieldSignature().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__IsApplicable_checkCsp_CC__CSP() {
		return getFieldSignature().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckDEC_FWD__MFieldName_MFieldSignature() {
		return getFieldSignature().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__CheckDEC_BWD__TField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__GenerateModel__RuleEntryContainer_MFieldNameToTField() {
		return getFieldSignature().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldName_TField_MFieldNameToTField_ModelgeneratorRuleResult() {
		return getFieldSignature().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldSignature__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMethodInvocationSource() {
		if (abstractMethodInvocationSourceEClass == null) {
			abstractMethodInvocationSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return abstractMethodInvocationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypesToClass() {
		if (primitiveTypesToClassEClass == null) {
			primitiveTypesToClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return primitiveTypesToClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameterType() {
		if (methodParameterTypeEClass == null) {
			methodParameterTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return methodParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_FWD__Match_MMethodSignature_MEntry_Type() {
		return getMethodParameterType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__Perform_FWD__IsApplicableMatch() {
		return getMethodParameterType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_FWD__Match() {
		return getMethodParameterType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__RegisterObjectsToMatch_FWD__Match_MMethodSignature_MEntry_Type() {
		return getMethodParameterType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_MEntry_Type() {
		return getMethodParameterType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameterType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodSignatureToTParameterList_TAbstractType_TypeToTAbstractType_MMethodSignature_MEntry_TParameterList_Type() {
		return getMethodParameterType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameterType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckTypes_FWD__Match() {
		return getMethodParameterType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_BWD__Match_TAbstractType_TParameter_TParameterList() {
		return getMethodParameterType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__Perform_BWD__IsApplicableMatch() {
		return getMethodParameterType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_BWD__Match() {
		return getMethodParameterType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__RegisterObjectsToMatch_BWD__Match_TAbstractType_TParameter_TParameterList() {
		return getMethodParameterType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TParameter_TParameterList() {
		return getMethodParameterType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameterType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodSignatureToTParameterList_TAbstractType_TypeToTAbstractType_MMethodSignature_TParameter_TParameterList_Type() {
		return getMethodParameterType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameterType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckTypes_BWD__Match() {
		return getMethodParameterType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getMethodParameterType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getMethodParameterType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameterType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameterType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_CC__Match_Match() {
		return getMethodParameterType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_solveCsp_CC__CCMatch_MMethodSignatureToTParameterList_TAbstractType_TypeToTAbstractType_MMethodSignature_MEntry_TParameter_TParameterList_Type_Match_Match() {
		return getMethodParameterType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameterType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckDEC_FWD__MMethodSignature_MEntry_Type() {
		return getMethodParameterType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__CheckDEC_BWD__TAbstractType_TParameter_TParameterList() {
		return getMethodParameterType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__GenerateModel__RuleEntryContainer_MMethodSignatureToTParameterList_TypeToTAbstractType() {
		return getMethodParameterType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodSignatureToTParameterList_TAbstractType_TypeToTAbstractType_MMethodSignature_TParameterList_Type_ModelgeneratorRuleResult() {
		return getMethodParameterType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterType__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameterType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedTypes() {
		if (nestedTypesEClass == null) {
			nestedTypesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return nestedTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		if (annotationTypeEClass == null) {
			annotationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__Perform_FWD__IsApplicableMatch() {
		return getAnnotationType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_FWD__Match() {
		return getAnnotationType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__RegisterObjectsToMatch_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_solveCsp_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_Package_TPackage_TypeGraph_AnnotationTypeDeclaration() {
		return getAnnotationType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckTypes_FWD__Match() {
		return getAnnotationType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__Perform_BWD__IsApplicableMatch() {
		return getAnnotationType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_BWD__Match() {
		return getAnnotationType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__RegisterObjectsToMatch_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_solveCsp_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TAnnotationType_Package_TPackage_TypeGraph() {
		return getAnnotationType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckTypes_BWD__Match() {
		return getAnnotationType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getAnnotationType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getAnnotationType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_CC__Match_Match() {
		return getAnnotationType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_solveCsp_CC__CCMatch_PackageToTPackage_TAnnotationType_Package_TPackage_TypeGraph_AnnotationTypeDeclaration_Match_Match() {
		return getAnnotationType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckDEC_FWD__Package_AnnotationTypeDeclaration() {
		return getAnnotationType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__CheckDEC_BWD__TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getAnnotationType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_Package_TPackage_TypeGraph_ModelgeneratorRuleResult() {
		return getAnnotationType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationType__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAccessSource() {
		if (fieldAccessSourceEClass == null) {
			fieldAccessSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return fieldAccessSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_FWD__Match_SingleVariableAccess_MDefinition() {
		return getFieldAccessSource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__Perform_FWD__IsApplicableMatch() {
		return getFieldAccessSource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_FWD__Match() {
		return getFieldAccessSource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__RegisterObjectsToMatch_FWD__Match_SingleVariableAccess_MDefinition() {
		return getFieldAccessSource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_solveCsp_FWD__Match_SingleVariableAccess_MDefinition() {
		return getFieldAccessSource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldAccessSource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_solveCsp_FWD__IsApplicableMatch_SingleVariableAccess_TMember_MDefinition_MDefinitionToTMember() {
		return getFieldAccessSource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldAccessSource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessSource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckTypes_FWD__Match() {
		return getFieldAccessSource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_BWD__Match_TAccess_TMember() {
		return getFieldAccessSource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__Perform_BWD__IsApplicableMatch() {
		return getFieldAccessSource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_BWD__Match() {
		return getFieldAccessSource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__RegisterObjectsToMatch_BWD__Match_TAccess_TMember() {
		return getFieldAccessSource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_solveCsp_BWD__Match_TAccess_TMember() {
		return getFieldAccessSource().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldAccessSource().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAccess_TMember_MDefinition_MDefinitionToTMember() {
		return getFieldAccessSource().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldAccessSource().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessSource().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckTypes_BWD__Match() {
		return getFieldAccessSource().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getFieldAccessSource().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getFieldAccessSource().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckAttributes_FWD__TripleMatch() {
		return getFieldAccessSource().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckAttributes_BWD__TripleMatch() {
		return getFieldAccessSource().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_CC__Match_Match() {
		return getFieldAccessSource().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_solveCsp_CC__CCMatch_TAccess_SingleVariableAccess_TMember_MDefinition_MDefinitionToTMember_Match_Match() {
		return getFieldAccessSource().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__IsApplicable_checkCsp_CC__CSP() {
		return getFieldAccessSource().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckDEC_FWD__SingleVariableAccess_MDefinition() {
		return getFieldAccessSource().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__CheckDEC_BWD__TAccess_TMember() {
		return getFieldAccessSource().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getFieldAccessSource().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMember_MDefinition_MDefinitionToTMember_ModelgeneratorRuleResult() {
		return getFieldAccessSource().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessSource__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldAccessSource().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceExtendsInterface() {
		if (interfaceExtendsInterfaceEClass == null) {
			interfaceExtendsInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return interfaceExtendsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__Perform_FWD__IsApplicableMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_FWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__RegisterObjectsToMatch_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_solveCsp_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TInterface_TInterface_TypeAccess_InterfaceDeclaration_InterfaceDeclaration_TypeToTAbstractType() {
		return getInterfaceExtendsInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceExtendsInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckTypes_FWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__Perform_BWD__IsApplicableMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_BWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__RegisterObjectsToMatch_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_solveCsp_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TInterface_TInterface_InterfaceDeclaration_InterfaceDeclaration_TypeToTAbstractType() {
		return getInterfaceExtendsInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceExtendsInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckTypes_BWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getInterfaceExtendsInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getInterfaceExtendsInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_CC__Match_Match() {
		return getInterfaceExtendsInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_CC__CCMatch_TypeToTAbstractType_TInterface_TInterface_TypeAccess_InterfaceDeclaration_InterfaceDeclaration_TypeToTAbstractType_Match_Match() {
		return getInterfaceExtendsInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckDEC_FWD__TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__CheckDEC_BWD__TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getInterfaceExtendsInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TInterface_TInterface_InterfaceDeclaration_InterfaceDeclaration_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getInterfaceExtendsInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceExtendsInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExtendsClass() {
		if (classExtendsClassEClass == null) {
			classExtendsClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return classExtendsClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_FWD__Match_TypeAccess_ClassDeclaration_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__Perform_FWD__IsApplicableMatch() {
		return getClassExtendsClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_FWD__Match() {
		return getClassExtendsClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__RegisterObjectsToMatch_FWD__Match_TypeAccess_ClassDeclaration_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_solveCsp_FWD__Match_TypeAccess_ClassDeclaration_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassExtendsClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeAccess_ClassDeclaration_ClassDeclaration_TClass_TClass_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_FWD__CSP() {
		return getClassExtendsClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassExtendsClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckTypes_FWD__Match() {
		return getClassExtendsClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__Perform_BWD__IsApplicableMatch() {
		return getClassExtendsClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_BWD__Match() {
		return getClassExtendsClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__RegisterObjectsToMatch_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_solveCsp_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_ClassDeclaration_TClass_TClass_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassExtendsClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckTypes_BWD__Match() {
		return getClassExtendsClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getClassExtendsClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getClassExtendsClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckAttributes_FWD__TripleMatch() {
		return getClassExtendsClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckAttributes_BWD__TripleMatch() {
		return getClassExtendsClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_CC__Match_Match() {
		return getClassExtendsClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_CC__CCMatch_TypeAccess_ClassDeclaration_ClassDeclaration_TClass_TClass_TypeToTAbstractType_TypeToTAbstractType_Match_Match() {
		return getClassExtendsClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_CC__CSP() {
		return getClassExtendsClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckDEC_FWD__TypeAccess_ClassDeclaration_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__CheckDEC_BWD__TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_ClassDeclaration_TClass_TClass_TypeToTAbstractType_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getClassExtendsClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassExtendsClass__GenerateModel_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassImplementsInterface() {
		if (classImplementsInterfaceEClass == null) {
			classImplementsInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return classImplementsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_FWD__Match_TypeAccess_InterfaceDeclaration_ClassDeclaration() {
		return getClassImplementsInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__Perform_FWD__IsApplicableMatch() {
		return getClassImplementsInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_FWD__Match() {
		return getClassImplementsInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__RegisterObjectsToMatch_FWD__Match_TypeAccess_InterfaceDeclaration_ClassDeclaration() {
		return getClassImplementsInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_solveCsp_FWD__Match_TypeAccess_InterfaceDeclaration_ClassDeclaration() {
		return getClassImplementsInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TypeToTAbstractType_TypeAccess_InterfaceDeclaration_ClassDeclaration_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckTypes_FWD__Match() {
		return getClassImplementsInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__Perform_BWD__IsApplicableMatch() {
		return getClassImplementsInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_BWD__Match() {
		return getClassImplementsInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__RegisterObjectsToMatch_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_solveCsp_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TypeToTAbstractType_InterfaceDeclaration_ClassDeclaration_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckTypes_BWD__Match() {
		return getClassImplementsInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getClassImplementsInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getClassImplementsInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckAttributes_FWD__TripleMatch() {
		return getClassImplementsInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckAttributes_BWD__TripleMatch() {
		return getClassImplementsInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_CC__Match_Match() {
		return getClassImplementsInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_CC__CCMatch_TypeToTAbstractType_TypeToTAbstractType_TypeAccess_InterfaceDeclaration_ClassDeclaration_TClass_TInterface_Match_Match() {
		return getClassImplementsInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_CC__CSP() {
		return getClassImplementsInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckDEC_FWD__TypeAccess_InterfaceDeclaration_ClassDeclaration() {
		return getClassImplementsInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__CheckDEC_BWD__TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassImplementsInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TypeToTAbstractType_InterfaceDeclaration_ClassDeclaration_TClass_TInterface_ModelgeneratorRuleResult() {
		return getClassImplementsInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassImplementsInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassInnerMethode() {
		if (classInnerMethodeEClass == null) {
			classInnerMethodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return classInnerMethodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_FWD__Match_ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__Perform_FWD__IsApplicableMatch() {
		return getClassInnerMethode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_FWD__Match() {
		return getClassInnerMethode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInnerMethode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TPackage_TypeGraph_TClass_ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInnerMethode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerMethode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckTypes_FWD__Match() {
		return getClassInnerMethode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_BWD__Match_TClass_TPackage_TPackage_TypeGraph_TClass() {
		return getClassInnerMethode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__Perform_BWD__IsApplicableMatch() {
		return getClassInnerMethode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_BWD__Match() {
		return getClassInnerMethode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TPackage_TypeGraph_TClass() {
		return getClassInnerMethode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TPackage_TypeGraph_TClass() {
		return getClassInnerMethode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInnerMethode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TClass_TPackage_TPackage_TypeGraph_TClass_Block_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInnerMethode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerMethode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckTypes_BWD__Match() {
		return getClassInnerMethode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getClassInnerMethode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getClassInnerMethode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckAttributes_FWD__TripleMatch() {
		return getClassInnerMethode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckAttributes_BWD__TripleMatch() {
		return getClassInnerMethode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_CC__Match_Match() {
		return getClassInnerMethode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_solveCsp_CC__CCMatch_TypeToTAbstractType_TClass_TPackage_TPackage_TypeGraph_TClass_ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration_Match_Match() {
		return getClassInnerMethode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__IsApplicable_checkCsp_CC__CSP() {
		return getClassInnerMethode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckDEC_FWD__ClassDeclaration_Block_TypeDeclarationStatement_MethodDeclaration_ClassDeclaration() {
		return getClassInnerMethode().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__CheckDEC_BWD__TClass_TPackage_TPackage_TypeGraph_TClass() {
		return getClassInnerMethode().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getClassInnerMethode().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TPackage_TypeGraph_TClass_Block_MethodDeclaration_ClassDeclaration_ModelgeneratorRuleResult() {
		return getClassInnerMethode().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerMethode__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInnerMethode().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassInnerConstructor() {
		if (classInnerConstructorEClass == null) {
			classInnerConstructorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return classInnerConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_FWD__Match_ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration() {
		return getClassInnerConstructor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__Perform_FWD__IsApplicableMatch() {
		return getClassInnerConstructor().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_FWD__Match() {
		return getClassInnerConstructor().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration() {
		return getClassInnerConstructor().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration() {
		return getClassInnerConstructor().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInnerConstructor().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration_TClass_TypeGraph_TPackage() {
		return getClassInnerConstructor().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInnerConstructor().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerConstructor().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckTypes_FWD__Match() {
		return getClassInnerConstructor().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_BWD__Match_TClass_TypeGraph_TPackage_TPackage_TClass() {
		return getClassInnerConstructor().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__Perform_BWD__IsApplicableMatch() {
		return getClassInnerConstructor().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_BWD__Match() {
		return getClassInnerConstructor().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph_TPackage_TPackage_TClass() {
		return getClassInnerConstructor().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph_TPackage_TPackage_TClass() {
		return getClassInnerConstructor().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInnerConstructor().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_ClassDeclaration_ConstructorDeclaration_Block_TClass_TypeGraph_TPackage_TPackage_TClass() {
		return getClassInnerConstructor().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInnerConstructor().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerConstructor().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckTypes_BWD__Match() {
		return getClassInnerConstructor().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getClassInnerConstructor().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getClassInnerConstructor().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckAttributes_FWD__TripleMatch() {
		return getClassInnerConstructor().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckAttributes_BWD__TripleMatch() {
		return getClassInnerConstructor().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_CC__Match_Match() {
		return getClassInnerConstructor().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_solveCsp_CC__CCMatch_TypeToTAbstractType_ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration_TClass_TypeGraph_TPackage_TPackage_TClass_Match_Match() {
		return getClassInnerConstructor().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__IsApplicable_checkCsp_CC__CSP() {
		return getClassInnerConstructor().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckDEC_FWD__ClassDeclaration_ConstructorDeclaration_TypeDeclarationStatement_Block_ClassDeclaration() {
		return getClassInnerConstructor().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__CheckDEC_BWD__TClass_TypeGraph_TPackage_TPackage_TClass() {
		return getClassInnerConstructor().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getClassInnerConstructor().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_ClassDeclaration_ConstructorDeclaration_Block_TClass_TypeGraph_TPackage_ModelgeneratorRuleResult() {
		return getClassInnerConstructor().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassInnerConstructor__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInnerConstructor().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocationTarget() {
		if (methodInvocationTargetEClass == null) {
			methodInvocationTargetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return methodInvocationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_FWD__Match_MMethodDefinition_AbstractMethodInvocation_MDefinition() {
		return getMethodInvocationTarget().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__Perform_FWD__IsApplicableMatch() {
		return getMethodInvocationTarget().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_FWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__RegisterObjectsToMatch_FWD__Match_MMethodDefinition_AbstractMethodInvocation_MDefinition() {
		return getMethodInvocationTarget().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_solveCsp_FWD__Match_MMethodDefinition_AbstractMethodInvocation_MDefinition() {
		return getMethodInvocationTarget().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAccess_TMethodDefinition_MMethodDefinition_AbstractMethodInvocation_MDefinitionToTMember_AbstractMethodInvocationToTAccess_MDefinition_TMember_MDefinitionToTMember() {
		return getMethodInvocationTarget().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationTarget().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckTypes_FWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_BWD__Match_TAccess_TMethodDefinition_TMember() {
		return getMethodInvocationTarget().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__Perform_BWD__IsApplicableMatch() {
		return getMethodInvocationTarget().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_BWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__RegisterObjectsToMatch_BWD__Match_TAccess_TMethodDefinition_TMember() {
		return getMethodInvocationTarget().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_solveCsp_BWD__Match_TAccess_TMethodDefinition_TMember() {
		return getMethodInvocationTarget().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAccess_TMethodDefinition_MMethodDefinition_AbstractMethodInvocation_MDefinitionToTMember_AbstractMethodInvocationToTAccess_MDefinition_TMember_MDefinitionToTMember() {
		return getMethodInvocationTarget().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationTarget().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckTypes_BWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getMethodInvocationTarget().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getMethodInvocationTarget().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckAttributes_FWD__TripleMatch() {
		return getMethodInvocationTarget().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckAttributes_BWD__TripleMatch() {
		return getMethodInvocationTarget().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_CC__Match_Match() {
		return getMethodInvocationTarget().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_CC__CCMatch_TAccess_TMethodDefinition_MMethodDefinition_AbstractMethodInvocation_MDefinitionToTMember_AbstractMethodInvocationToTAccess_MDefinition_TMember_MDefinitionToTMember_Match_Match() {
		return getMethodInvocationTarget().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_CC__CSP() {
		return getMethodInvocationTarget().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckDEC_FWD__MMethodDefinition_AbstractMethodInvocation_MDefinition() {
		return getMethodInvocationTarget().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__CheckDEC_BWD__TAccess_TMethodDefinition_TMember() {
		return getMethodInvocationTarget().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__GenerateModel__RuleEntryContainer_AbstractMethodInvocationToTAccess_MDefinitionToTMember() {
		return getMethodInvocationTarget().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAccess_TMethodDefinition_MMethodDefinition_AbstractMethodInvocation_MDefinitionToTMember_AbstractMethodInvocationToTAccess_MDefinition_TMember_MDefinitionToTMember_ModelgeneratorRuleResult() {
		return getMethodInvocationTarget().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationTarget__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldName() {
		if (fieldNameEClass == null) {
			fieldNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(23);
		}
		return fieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_FWD__Match_MFieldName_MGravityModel() {
		return getFieldName().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__Perform_FWD__IsApplicableMatch() {
		return getFieldName().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_FWD__Match() {
		return getFieldName().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__RegisterObjectsToMatch_FWD__Match_MFieldName_MGravityModel() {
		return getFieldName().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_solveCsp_FWD__Match_MFieldName_MGravityModel() {
		return getFieldName().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldName().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldName_MGravityModel_TypeGraph_ModelToTypeGraph() {
		return getFieldName().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldName().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldName().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckTypes_FWD__Match() {
		return getFieldName().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__Perform_BWD__IsApplicableMatch() {
		return getFieldName().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_BWD__Match() {
		return getFieldName().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__RegisterObjectsToMatch_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_TField_ModelToTypeGraph() {
		return getFieldName().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldName().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckTypes_BWD__Match() {
		return getFieldName().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getFieldName().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getFieldName().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckAttributes_FWD__TripleMatch() {
		return getFieldName().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckAttributes_BWD__TripleMatch() {
		return getFieldName().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_CC__Match_Match() {
		return getFieldName().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_solveCsp_CC__CCMatch_MFieldName_MGravityModel_TypeGraph_TField_ModelToTypeGraph_Match_Match() {
		return getFieldName().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__IsApplicable_checkCsp_CC__CSP() {
		return getFieldName().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckDEC_FWD__MFieldName_MGravityModel() {
		return getFieldName().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__CheckDEC_BWD__TypeGraph_TField() {
		return getFieldName().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getFieldName().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__GenerateModel_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getFieldName().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldName__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDefinition() {
		if (fieldDefinitionEClass == null) {
			fieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return fieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_FWD__Match_MFieldSignature_MFieldDefinition_MFieldName_VariableDeclarationFragment() {
		return getFieldDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__Perform_FWD__IsApplicableMatch() {
		return getFieldDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_FWD__Match() {
		return getFieldDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__RegisterObjectsToMatch_FWD__Match_MFieldSignature_MFieldDefinition_MFieldName_VariableDeclarationFragment() {
		return getFieldDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_solveCsp_FWD__Match_MFieldSignature_MFieldDefinition_MFieldName_VariableDeclarationFragment() {
		return getFieldDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldSignature_MFieldDefinition_TField_MSignatureToTSignature_MFieldName_TFieldSignature_MFieldNameToTField_VariableDeclarationFragment() {
		return getFieldDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckTypes_FWD__Match() {
		return getFieldDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_BWD__Match_TField_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__Perform_BWD__IsApplicableMatch() {
		return getFieldDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_BWD__Match() {
		return getFieldDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__RegisterObjectsToMatch_BWD__Match_TField_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_solveCsp_BWD__Match_TField_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_MFieldSignature_TField_MSignatureToTSignature_MFieldName_TFieldDefinition_TFieldSignature_MFieldNameToTField() {
		return getFieldDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckTypes_BWD__Match() {
		return getFieldDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getFieldDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getFieldDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckAttributes_FWD__TripleMatch() {
		return getFieldDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckAttributes_BWD__TripleMatch() {
		return getFieldDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_CC__Match_Match() {
		return getFieldDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_solveCsp_CC__CCMatch_MFieldSignature_MFieldDefinition_TField_MSignatureToTSignature_MFieldName_TFieldDefinition_TFieldSignature_MFieldNameToTField_VariableDeclarationFragment_Match_Match() {
		return getFieldDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDefinition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckDEC_FWD__MFieldSignature_MFieldDefinition_MFieldName_VariableDeclarationFragment() {
		return getFieldDefinition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__CheckDEC_BWD__TField_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__GenerateModel__RuleEntryContainer_MFieldNameToTField() {
		return getFieldDefinition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldSignature_TField_MSignatureToTSignature_MFieldName_TFieldSignature_MFieldNameToTField_ModelgeneratorRuleResult() {
		return getFieldDefinition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldDefinition__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDefinitionToClass() {
		if (linkDefinitionToClassEClass == null) {
			linkDefinitionToClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return linkDefinitionToClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_FWD__Match_MDefinition_AbstractTypeDeclaration() {
		return getLinkDefinitionToClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__Perform_FWD__IsApplicableMatch() {
		return getLinkDefinitionToClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_FWD__Match() {
		return getLinkDefinitionToClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__RegisterObjectsToMatch_FWD__Match_MDefinition_AbstractTypeDeclaration() {
		return getLinkDefinitionToClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_solveCsp_FWD__Match_MDefinition_AbstractTypeDeclaration() {
		return getLinkDefinitionToClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinition_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType_TMember_MDefinitionToTMember() {
		return getLinkDefinitionToClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_checkCsp_FWD__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckTypes_FWD__Match() {
		return getLinkDefinitionToClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_BWD__Match_TAbstractType_TMember() {
		return getLinkDefinitionToClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__Perform_BWD__IsApplicableMatch() {
		return getLinkDefinitionToClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_BWD__Match() {
		return getLinkDefinitionToClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__RegisterObjectsToMatch_BWD__Match_TAbstractType_TMember() {
		return getLinkDefinitionToClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TMember() {
		return getLinkDefinitionToClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinition_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType_TMember_MDefinitionToTMember() {
		return getLinkDefinitionToClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_checkCsp_BWD__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckTypes_BWD__Match() {
		return getLinkDefinitionToClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getLinkDefinitionToClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge() {
		return getLinkDefinitionToClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckAttributes_FWD__TripleMatch() {
		return getLinkDefinitionToClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckAttributes_BWD__TripleMatch() {
		return getLinkDefinitionToClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_CC__Match_Match() {
		return getLinkDefinitionToClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_solveCsp_CC__CCMatch_MDefinition_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType_TMember_MDefinitionToTMember_Match_Match() {
		return getLinkDefinitionToClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__IsApplicable_checkCsp_CC__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckDEC_FWD__MDefinition_AbstractTypeDeclaration() {
		return getLinkDefinitionToClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__CheckDEC_BWD__TAbstractType_TMember() {
		return getLinkDefinitionToClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__GenerateModel__RuleEntryContainer_MDefinitionToTMember_TypeToTAbstractType() {
		return getLinkDefinitionToClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinition_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType_TMember_MDefinitionToTMember_ModelgeneratorRuleResult() {
		return getLinkDefinitionToClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkDefinitionToClass__GenerateModel_checkCsp_BWD__CSP() {
		return getLinkDefinitionToClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (classEClass == null) {
			classEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(26);
		}
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_FWD__Match_Package_ClassDeclaration() {
		return getClass_().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__Perform_FWD__IsApplicableMatch() {
		return getClass_().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_FWD__Match() {
		return getClass_().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__RegisterObjectsToMatch_FWD__Match_Package_ClassDeclaration() {
		return getClass_().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_solveCsp_FWD__Match_Package_ClassDeclaration() {
		return getClass_().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getClass_().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ClassDeclaration() {
		return getClass_().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_checkCsp_FWD__CSP() {
		return getClass_().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClass_().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckTypes_FWD__Match() {
		return getClass_().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClass_().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__Perform_BWD__IsApplicableMatch() {
		return getClass_().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_BWD__Match() {
		return getClass_().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClass_().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClass_().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getClass_().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TClass_TPackage_Package_TypeGraph() {
		return getClass_().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_checkCsp_BWD__CSP() {
		return getClass_().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClass_().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckTypes_BWD__Match() {
		return getClass_().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getClass_().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge() {
		return getClass_().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckAttributes_FWD__TripleMatch() {
		return getClass_().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckAttributes_BWD__TripleMatch() {
		return getClass_().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_CC__Match_Match() {
		return getClass_().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_solveCsp_CC__CCMatch_PackageToTPackage_TClass_TPackage_Package_TypeGraph_ClassDeclaration_Match_Match() {
		return getClass_().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsApplicable_checkCsp_CC__CSP() {
		return getClass_().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckDEC_FWD__Package_ClassDeclaration() {
		return getClass_().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CheckDEC_BWD__TClass_TPackage_TypeGraph() {
		return getClass_().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getClass_().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getClass_().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GenerateModel_checkCsp_BWD__CSP() {
		return getClass_().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		if (fieldTypeEClass == null) {
			fieldTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(27);
		}
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_FWD__Match_Type_MFieldSignature() {
		return getFieldType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__Perform_FWD__IsApplicableMatch() {
		return getFieldType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_FWD__Match() {
		return getFieldType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__RegisterObjectsToMatch_FWD__Match_Type_MFieldSignature() {
		return getFieldType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_solveCsp_FWD__Match_Type_MFieldSignature() {
		return getFieldType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_solveCsp_FWD__IsApplicableMatch_TFieldSignature_Type_TAbstractType_TypeToTAbstractType_MSignatureToTSignature_MFieldSignature() {
		return getFieldType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckTypes_FWD__Match() {
		return getFieldType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_BWD__Match_TFieldSignature_TAbstractType() {
		return getFieldType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__Perform_BWD__IsApplicableMatch() {
		return getFieldType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_BWD__Match() {
		return getFieldType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__RegisterObjectsToMatch_BWD__Match_TFieldSignature_TAbstractType() {
		return getFieldType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_solveCsp_BWD__Match_TFieldSignature_TAbstractType() {
		return getFieldType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TFieldSignature_Type_TAbstractType_TypeToTAbstractType_MSignatureToTSignature_MFieldSignature() {
		return getFieldType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckTypes_BWD__Match() {
		return getFieldType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getFieldType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge() {
		return getFieldType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckAttributes_FWD__TripleMatch() {
		return getFieldType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckAttributes_BWD__TripleMatch() {
		return getFieldType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_CC__Match_Match() {
		return getFieldType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_solveCsp_CC__CCMatch_TFieldSignature_Type_TAbstractType_TypeToTAbstractType_MSignatureToTSignature_MFieldSignature_Match_Match() {
		return getFieldType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__IsApplicable_checkCsp_CC__CSP() {
		return getFieldType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckDEC_FWD__Type_MFieldSignature() {
		return getFieldType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__CheckDEC_BWD__TFieldSignature_TAbstractType() {
		return getFieldType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__GenerateModel__RuleEntryContainer_MSignatureToTSignature_TypeToTAbstractType() {
		return getFieldType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TFieldSignature_Type_TAbstractType_TypeToTAbstractType_MSignatureToTSignature_MFieldSignature_ModelgeneratorRuleResult() {
		return getFieldType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldType__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedAnnotationType() {
		if (nestedAnnotationTypeEClass == null) {
			nestedAnnotationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return nestedAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getNestedAnnotationType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__Perform_FWD__IsApplicableMatch() {
		return getNestedAnnotationType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_FWD__Match() {
		return getNestedAnnotationType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getNestedAnnotationType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getNestedAnnotationType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedAnnotationType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnnotationTypeDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedAnnotationType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedAnnotationType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedAnnotationType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckTypes_FWD__Match() {
		return getNestedAnnotationType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_BWD__Match_TPackage_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getNestedAnnotationType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__Perform_BWD__IsApplicableMatch() {
		return getNestedAnnotationType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_BWD__Match() {
		return getNestedAnnotationType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getNestedAnnotationType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getNestedAnnotationType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedAnnotationType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_TAnnotationType_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedAnnotationType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedAnnotationType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedAnnotationType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckTypes_BWD__Match() {
		return getNestedAnnotationType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getNestedAnnotationType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge() {
		return getNestedAnnotationType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckAttributes_FWD__TripleMatch() {
		return getNestedAnnotationType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckAttributes_BWD__TripleMatch() {
		return getNestedAnnotationType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_CC__Match_Match() {
		return getNestedAnnotationType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_solveCsp_CC__CCMatch_AnnotationTypeDeclaration_TPackage_TypeGraph_TAnnotationType_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedAnnotationType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedAnnotationType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckDEC_FWD__AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getNestedAnnotationType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__CheckDEC_BWD__TPackage_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getNestedAnnotationType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedAnnotationType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedAnnotationType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedAnnotationType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedAnnotationType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationTypeWithValue() {
		if (annotationTypeWithValueEClass == null) {
			annotationTypeWithValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(29);
		}
		return annotationTypeWithValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_FWD__Match_TypeAccess_Package_Type_AnnotationTypeDeclaration_AnnotationTypeMemberDeclaration() {
		return getAnnotationTypeWithValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeWithValue().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_FWD__Match() {
		return getAnnotationTypeWithValue().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__RegisterObjectsToMatch_FWD__Match_TypeAccess_Package_Type_AnnotationTypeDeclaration_AnnotationTypeMemberDeclaration() {
		return getAnnotationTypeWithValue().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_solveCsp_FWD__Match_TypeAccess_Package_Type_AnnotationTypeDeclaration_AnnotationTypeMemberDeclaration() {
		return getAnnotationTypeWithValue().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TypeAccess_Package_TAbstractType_Type_AnnotationTypeDeclaration_TPackage_TypeGraph_AnnotationTypeMemberDeclaration_TypeToTAbstractType() {
		return getAnnotationTypeWithValue().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeWithValue().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckTypes_FWD__Match() {
		return getAnnotationTypeWithValue().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_BWD__Match_TAnnotationType_TAbstractType_TPackage_TypeGraph() {
		return getAnnotationTypeWithValue().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeWithValue().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_BWD__Match() {
		return getAnnotationTypeWithValue().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__RegisterObjectsToMatch_BWD__Match_TAnnotationType_TAbstractType_TPackage_TypeGraph() {
		return getAnnotationTypeWithValue().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_solveCsp_BWD__Match_TAnnotationType_TAbstractType_TPackage_TypeGraph() {
		return getAnnotationTypeWithValue().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TAnnotationType_Package_TAbstractType_Type_TPackage_TypeGraph_TypeToTAbstractType() {
		return getAnnotationTypeWithValue().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeWithValue().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckTypes_BWD__Match() {
		return getAnnotationTypeWithValue().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getAnnotationTypeWithValue().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge() {
		return getAnnotationTypeWithValue().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeWithValue().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeWithValue().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeWithValue().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_solveCsp_CC__CCMatch_PackageToTPackage_TypeAccess_TAnnotationType_Package_TAbstractType_Type_AnnotationTypeDeclaration_TPackage_TypeGraph_AnnotationTypeMemberDeclaration_TypeToTAbstractType_Match_Match() {
		return getAnnotationTypeWithValue().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckDEC_FWD__TypeAccess_Package_Type_AnnotationTypeDeclaration_AnnotationTypeMemberDeclaration() {
		return getAnnotationTypeWithValue().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__CheckDEC_BWD__TAnnotationType_TAbstractType_TPackage_TypeGraph() {
		return getAnnotationTypeWithValue().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getAnnotationTypeWithValue().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_Package_TAbstractType_Type_TPackage_TypeGraph_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getAnnotationTypeWithValue().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationTypeWithValue__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeWithValue().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsInt() {
		if (primitiveTypeIsIntEClass == null) {
			primitiveTypeIsIntEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(30);
		}
		return primitiveTypeIsIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeInt_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsInt().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsInt().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getPrimitiveTypeIsInt().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge() {
		return getPrimitiveTypeIsInt().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeInt_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckDEC_FWD__PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsInt().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsInt().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsInt__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClass() {
		if (anonymousClassEClass == null) {
			anonymousClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_FWD__Match_MGravityModel_AnonymousClassDeclaration() {
		return getAnonymousClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_FWD__Match() {
		return getAnonymousClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__RegisterObjectsToMatch_FWD__Match_MGravityModel_AnonymousClassDeclaration() {
		return getAnonymousClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_solveCsp_FWD__Match_MGravityModel_AnonymousClassDeclaration() {
		return getAnonymousClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel_ModelToTypeGraph_AnonymousClassDeclaration_TypeGraph() {
		return getAnonymousClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckTypes_FWD__Match() {
		return getAnonymousClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_BWD__Match_TClass_TypeGraph() {
		return getAnonymousClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_BWD__Match() {
		return getAnonymousClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__RegisterObjectsToMatch_BWD__Match_TClass_TypeGraph() {
		return getAnonymousClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_solveCsp_BWD__Match_TClass_TypeGraph() {
		return getAnonymousClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_MGravityModel_ModelToTypeGraph_TClass_TypeGraph() {
		return getAnonymousClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckTypes_BWD__Match() {
		return getAnonymousClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge() {
		return getAnonymousClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge() {
		return getAnonymousClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_CC__Match_Match() {
		return getAnonymousClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_solveCsp_CC__CCMatch_MGravityModel_ModelToTypeGraph_AnonymousClassDeclaration_TClass_TypeGraph_Match_Match() {
		return getAnonymousClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckDEC_FWD__MGravityModel_AnonymousClassDeclaration() {
		return getAnonymousClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__CheckDEC_BWD__TClass_TypeGraph() {
		return getAnonymousClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getAnonymousClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_MGravityModel_ModelToTypeGraph_TypeGraph_ModelgeneratorRuleResult() {
		return getAnonymousClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameterLinkFirst() {
		if (methodParameterLinkFirstEClass == null) {
			methodParameterLinkFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(32);
		}
		return methodParameterLinkFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameterLinkFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__Perform_FWD__IsApplicableMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_FWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__RegisterObjectsToMatch_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameterLinkFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameterLinkFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodSignature_TParameter_MEntry_TParameterList_MEntryToTParameter_MMethodSignatureToTParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLinkFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckTypes_FWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_BWD__Match_TParameter_TParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__Perform_BWD__IsApplicableMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_BWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__RegisterObjectsToMatch_BWD__Match_TParameter_TParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodSignature_TParameter_MEntry_TParameterList_MEntryToTParameter_MMethodSignatureToTParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLinkFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckTypes_BWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge() {
		return getMethodParameterLinkFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge() {
		return getMethodParameterLinkFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_CC__Match_Match() {
		return getMethodParameterLinkFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_CC__CCMatch_MMethodSignature_TParameter_MEntry_TParameterList_MEntryToTParameter_MMethodSignatureToTParameterList_Match_Match() {
		return getMethodParameterLinkFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckDEC_FWD__MMethodSignature_MEntry() {
		return getMethodParameterLinkFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__CheckDEC_BWD__TParameter_TParameterList() {
		return getMethodParameterLinkFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__GenerateModel__RuleEntryContainer_MMethodSignatureToTParameterList_MEntryToTParameter() {
		return getMethodParameterLinkFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodSignature_TParameter_MEntry_TParameterList_MEntryToTParameter_MMethodSignatureToTParameterList_ModelgeneratorRuleResult() {
		return getMethodParameterLinkFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLinkFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSignature() {
		if (methodSignatureEClass == null) {
			methodSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(33);
		}
		return methodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_FWD__Match_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__Perform_FWD__IsApplicableMatch() {
		return getMethodSignature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_FWD__Match() {
		return getMethodSignature().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__RegisterObjectsToMatch_FWD__Match_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodSignature().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodSignature_MMethodName_MMethodNameToTMethod_TMethod() {
		return getMethodSignature().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodSignature().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignature().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckTypes_FWD__Match() {
		return getMethodSignature().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_BWD__Match_TMethodSignature_TParameterList_TMethod() {
		return getMethodSignature().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__Perform_BWD__IsApplicableMatch() {
		return getMethodSignature().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_BWD__Match() {
		return getMethodSignature().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TParameterList_TMethod() {
		return getMethodSignature().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TParameterList_TMethod() {
		return getMethodSignature().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodSignature_MMethodName_MMethodNameToTMethod_TParameterList_TMethod() {
		return getMethodSignature().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignature().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckTypes_BWD__Match() {
		return getMethodSignature().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge() {
		return getMethodSignature().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge() {
		return getMethodSignature().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckAttributes_FWD__TripleMatch() {
		return getMethodSignature().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckAttributes_BWD__TripleMatch() {
		return getMethodSignature().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_CC__Match_Match() {
		return getMethodSignature().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_solveCsp_CC__CCMatch_MMethodSignature_TMethodSignature_MMethodName_MMethodNameToTMethod_TParameterList_TMethod_Match_Match() {
		return getMethodSignature().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__IsApplicable_checkCsp_CC__CSP() {
		return getMethodSignature().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckDEC_FWD__MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__CheckDEC_BWD__TMethodSignature_TParameterList_TMethod() {
		return getMethodSignature().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__GenerateModel__RuleEntryContainer_MMethodNameToTMethod() {
		return getMethodSignature().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodName_MMethodNameToTMethod_TMethod_ModelgeneratorRuleResult() {
		return getMethodSignature().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodSignature__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeToClass() {
		if (arrayTypeToClassEClass == null) {
			arrayTypeToClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(34);
		}
		return arrayTypeToClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsAppropriate_FWD__Match_TypeAccess_Type_ArrayType_Model() {
		return getArrayTypeToClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__Perform_FWD__IsApplicableMatch() {
		return getArrayTypeToClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_FWD__Match() {
		return getArrayTypeToClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__RegisterObjectsToMatch_FWD__Match_TypeAccess_Type_ArrayType_Model() {
		return getArrayTypeToClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsAppropriate_solveCsp_FWD__Match_TypeAccess_Type_ArrayType_Model() {
		return getArrayTypeToClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getArrayTypeToClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeAccess_Type_TypeToTAbstractType_ArrayType_TypeGraph_ModelToTypeGraph_TAbstractType_Model() {
		return getArrayTypeToClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_checkCsp_FWD__CSP() {
		return getArrayTypeToClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getArrayTypeToClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__CheckTypes_FWD__Match() {
		return getArrayTypeToClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge() {
		return getArrayTypeToClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__CheckAttributes_FWD__TripleMatch() {
		return getArrayTypeToClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__CheckAttributes_BWD__TripleMatch() {
		return getArrayTypeToClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_CC__Match_Match() {
		return getArrayTypeToClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_solveCsp_CC__CCMatch_TypeAccess_Type_TypeToTAbstractType_ArrayType_TypeGraph_ModelToTypeGraph_TAbstractType_Model_Match_Match() {
		return getArrayTypeToClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__IsApplicable_checkCsp_CC__CSP() {
		return getArrayTypeToClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__CheckDEC_FWD__TypeAccess_Type_ArrayType_Model() {
		return getArrayTypeToClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__CheckDEC_BWD__TypeGraph_TAbstractType() {
		return getArrayTypeToClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getArrayTypeToClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Type_TypeToTAbstractType_TypeGraph_ModelToTypeGraph_TAbstractType_Model_ModelgeneratorRuleResult() {
		return getArrayTypeToClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeToClass__GenerateModel_checkCsp_BWD__CSP() {
		return getArrayTypeToClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsBoolean() {
		if (primitiveTypeIsBooleanEClass == null) {
			primitiveTypeIsBooleanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(35);
		}
		return primitiveTypeIsBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeBoolean_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeBoolean_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckDEC_FWD__PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsChar() {
		if (primitiveTypeIsCharEClass == null) {
			primitiveTypeIsCharEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(36);
		}
		return primitiveTypeIsCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeChar_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsChar().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsChar().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge() {
		return getPrimitiveTypeIsChar().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return getPrimitiveTypeIsChar().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeChar_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckDEC_FWD__PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsChar().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsChar().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsChar__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsByte() {
		if (primitiveTypeIsByteEClass == null) {
			primitiveTypeIsByteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(37);
		}
		return primitiveTypeIsByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeByte_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsByte().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsByte().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge() {
		return getPrimitiveTypeIsByte().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return getPrimitiveTypeIsByte().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeByte_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckDEC_FWD__PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsByte().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsByte().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsByte__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsShort() {
		if (primitiveTypeIsShortEClass == null) {
			primitiveTypeIsShortEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(38);
		}
		return primitiveTypeIsShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeShort_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsShort().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsShort().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge() {
		return getPrimitiveTypeIsShort().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return getPrimitiveTypeIsShort().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeShort_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckDEC_FWD__PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsShort().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsShort().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsShort__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsLong() {
		if (primitiveTypeIsLongEClass == null) {
			primitiveTypeIsLongEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(39);
		}
		return primitiveTypeIsLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeLong_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsLong().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsLong().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge() {
		return getPrimitiveTypeIsLong().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return getPrimitiveTypeIsLong().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeLong_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckDEC_FWD__PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsLong().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsLong().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsLong__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsFloat() {
		if (primitiveTypeIsFloatEClass == null) {
			primitiveTypeIsFloatEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(40);
		}
		return primitiveTypeIsFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeFloat_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsFloat().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsFloat().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge() {
		return getPrimitiveTypeIsFloat().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge() {
		return getPrimitiveTypeIsFloat().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeFloat_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckDEC_FWD__PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsFloat().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsFloat().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsFloat__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeIsDouble() {
		if (primitiveTypeIsDoubleEClass == null) {
			primitiveTypeIsDoubleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(41);
		}
		return primitiveTypeIsDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeDouble_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsDouble().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsDouble().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge() {
		return getPrimitiveTypeIsDouble().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge() {
		return getPrimitiveTypeIsDouble().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeDouble_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckDEC_FWD__PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsDouble().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsDouble().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypeIsDouble__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDefinition() {
		if (methodDefinitionEClass == null) {
			methodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(42);
		}
		return methodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_FWD__Match_MMethodSignature_MMethodDefinition() {
		return getMethodDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__Perform_FWD__IsApplicableMatch() {
		return getMethodDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_FWD__Match() {
		return getMethodDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__RegisterObjectsToMatch_FWD__Match_MMethodSignature_MMethodDefinition() {
		return getMethodDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_MMethodDefinition() {
		return getMethodDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMethodSignature_MMethodSignature_MMethodSignatureToTMethodSignature_TMethod_MMethodDefinition() {
		return getMethodDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckTypes_FWD__Match() {
		return getMethodDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_BWD__Match_TMethodSignature_TMethod_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__Perform_BWD__IsApplicableMatch() {
		return getMethodDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_BWD__Match() {
		return getMethodDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TMethod_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TMethod_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodSignature_MMethodSignature_MMethodSignatureToTMethodSignature_TMethod_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckTypes_BWD__Match() {
		return getMethodDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge() {
		return getMethodDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge() {
		return getMethodDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckAttributes_FWD__TripleMatch() {
		return getMethodDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckAttributes_BWD__TripleMatch() {
		return getMethodDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_CC__Match_Match() {
		return getMethodDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_solveCsp_CC__CCMatch_TMethodSignature_MMethodSignature_MMethodSignatureToTMethodSignature_TMethod_MMethodDefinition_TMethodDefinition_Match_Match() {
		return getMethodDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__IsApplicable_checkCsp_CC__CSP() {
		return getMethodDefinition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckDEC_FWD__MMethodSignature_MMethodDefinition() {
		return getMethodDefinition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__CheckDEC_BWD__TMethodSignature_TMethod_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__GenerateModel__RuleEntryContainer_MMethodSignatureToTMethodSignature() {
		return getMethodDefinition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMethodSignature_MMethodSignature_MMethodSignatureToTMethodSignature_TMethod_ModelgeneratorRuleResult() {
		return getMethodDefinition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodDefinition__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatio() {
		if (annotatioEClass == null) {
			annotatioEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(43);
		}
		return annotatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_FWD__Match_NumberLiteral_AnnotationTypeMemberDeclaration_BodyDeclaration_AnnotationMemberValuePair_Annotation_TypeAccess_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__Perform_FWD__IsApplicableMatch() {
		return getAnnotatio().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_FWD__Match() {
		return getAnnotatio().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__RegisterObjectsToMatch_FWD__Match_NumberLiteral_AnnotationTypeMemberDeclaration_BodyDeclaration_AnnotationMemberValuePair_Annotation_TypeAccess_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_solveCsp_FWD__Match_NumberLiteral_AnnotationTypeMemberDeclaration_BodyDeclaration_AnnotationMemberValuePair_Annotation_TypeAccess_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotatio().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_solveCsp_FWD__IsApplicableMatch_NumberLiteral_AnnotationTypeMemberDeclaration_TAnnotationType_TypeToTAbstractType_BodyDeclaration_TAnnotatable_BodyDeclarationToTAnnotatable_AnnotationMemberValuePair_Annotation_TypeAccess_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotatio().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotatio().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckTypes_FWD__Match() {
		return getAnnotatio().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_BWD__Match_TAnnotationType_TAnnotatable_TAnnotation() {
		return getAnnotatio().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__Perform_BWD__IsApplicableMatch() {
		return getAnnotatio().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_BWD__Match() {
		return getAnnotatio().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__RegisterObjectsToMatch_BWD__Match_TAnnotationType_TAnnotatable_TAnnotation() {
		return getAnnotatio().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_solveCsp_BWD__Match_TAnnotationType_TAnnotatable_TAnnotation() {
		return getAnnotatio().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotatio().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_solveCsp_BWD__IsApplicableMatch_AnnotationTypeMemberDeclaration_TAnnotationType_TypeToTAbstractType_BodyDeclaration_TAnnotatable_BodyDeclarationToTAnnotatable_TAnnotation_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotatio().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotatio().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckTypes_BWD__Match() {
		return getAnnotatio().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge() {
		return getAnnotatio().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge() {
		return getAnnotatio().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckAttributes_FWD__TripleMatch() {
		return getAnnotatio().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckAttributes_BWD__TripleMatch() {
		return getAnnotatio().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_CC__Match_Match() {
		return getAnnotatio().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_solveCsp_CC__CCMatch_NumberLiteral_AnnotationTypeMemberDeclaration_TAnnotationType_TypeToTAbstractType_BodyDeclaration_TAnnotatable_BodyDeclarationToTAnnotatable_AnnotationMemberValuePair_Annotation_TAnnotation_TypeAccess_AnnotationTypeDeclaration_Match_Match() {
		return getAnnotatio().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotatio().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckDEC_FWD__NumberLiteral_AnnotationTypeMemberDeclaration_BodyDeclaration_AnnotationMemberValuePair_Annotation_TypeAccess_AnnotationTypeDeclaration() {
		return getAnnotatio().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__CheckDEC_BWD__TAnnotationType_TAnnotatable_TAnnotation() {
		return getAnnotatio().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__GenerateModel__RuleEntryContainer_TypeToTAbstractType_BodyDeclarationToTAnnotatable() {
		return getAnnotatio().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__GenerateModel_solveCsp_BWD__IsApplicableMatch_AnnotationTypeMemberDeclaration_TAnnotationType_TypeToTAbstractType_BodyDeclaration_TAnnotatable_BodyDeclarationToTAnnotatable_AnnotationTypeDeclaration_ModelgeneratorRuleResult() {
		return getAnnotatio().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotatio__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotatio().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedEnum() {
		if (nestedEnumEClass == null) {
			nestedEnumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(44);
		}
		return nestedEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__Perform_FWD__IsApplicableMatch() {
		return getNestedEnum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_FWD__Match() {
		return getNestedEnum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__RegisterObjectsToMatch_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_solveCsp_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedEnum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnumDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedEnum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedEnum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedEnum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckTypes_FWD__Match() {
		return getNestedEnum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedEnum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__Perform_BWD__IsApplicableMatch() {
		return getNestedEnum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_BWD__Match() {
		return getNestedEnum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedEnum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedEnum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedEnum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedEnum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedEnum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedEnum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckTypes_BWD__Match() {
		return getNestedEnum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_FWD_EMoflonEdge_39__EMoflonEdge() {
		return getNestedEnum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge() {
		return getNestedEnum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckAttributes_FWD__TripleMatch() {
		return getNestedEnum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckAttributes_BWD__TripleMatch() {
		return getNestedEnum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_CC__Match_Match() {
		return getNestedEnum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_solveCsp_CC__CCMatch_EnumDeclaration_TPackage_TypeGraph_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedEnum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__IsApplicable_checkCsp_CC__CSP() {
		return getNestedEnum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckDEC_FWD__EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__CheckDEC_BWD__TPackage_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedEnum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedEnum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedEnum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedEnum__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedEnum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypesIsVoid() {
		if (primitiveTypesIsVoidEClass == null) {
			primitiveTypesIsVoidEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(45);
		}
		return primitiveTypesIsVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_FWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeVoid_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypesIsVoid().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckTypes_FWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_BWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypesIsVoid().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckTypes_BWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_FWD_EMoflonEdge_40__EMoflonEdge() {
		return getPrimitiveTypesIsVoid().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge() {
		return getPrimitiveTypesIsVoid().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_CC__CCMatch_PrimitiveTypeVoid_ModelToTypeGraph_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckDEC_FWD__PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypesIsVoid().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypesIsVoid().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveTypesIsVoid__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnType() {
		if (returnTypeEClass == null) {
			returnTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(46);
		}
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_FWD__Match_MMethodDefinition_TypeAccess_Type() {
		return getReturnType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__Perform_FWD__IsApplicableMatch() {
		return getReturnType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_FWD__Match() {
		return getReturnType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__RegisterObjectsToMatch_FWD__Match_MMethodDefinition_TypeAccess_Type() {
		return getReturnType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_solveCsp_FWD__Match_MMethodDefinition_TypeAccess_Type() {
		return getReturnType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_checkCsp_FWD__CSP() {
		return getReturnType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodDefinition_TypeAccess_Type_TAbstractType_TMethodDefinition_TypeToTAbstractType_MethodDeclarationToTMethodDefinition() {
		return getReturnType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_checkCsp_FWD__CSP() {
		return getReturnType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckTypes_FWD__Match() {
		return getReturnType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_BWD__Match_TAbstractType_TMethodDefinition() {
		return getReturnType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__Perform_BWD__IsApplicableMatch() {
		return getReturnType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_BWD__Match() {
		return getReturnType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__RegisterObjectsToMatch_BWD__Match_TAbstractType_TMethodDefinition() {
		return getReturnType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TMethodDefinition() {
		return getReturnType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_checkCsp_BWD__CSP() {
		return getReturnType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodDefinition_Type_TAbstractType_TMethodDefinition_TypeToTAbstractType_MethodDeclarationToTMethodDefinition() {
		return getReturnType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_checkCsp_BWD__CSP() {
		return getReturnType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReturnType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckTypes_BWD__Match() {
		return getReturnType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_FWD_EMoflonEdge_41__EMoflonEdge() {
		return getReturnType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge() {
		return getReturnType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckAttributes_FWD__TripleMatch() {
		return getReturnType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckAttributes_BWD__TripleMatch() {
		return getReturnType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_CC__Match_Match() {
		return getReturnType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_solveCsp_CC__CCMatch_MMethodDefinition_TypeAccess_Type_TAbstractType_TMethodDefinition_TypeToTAbstractType_MethodDeclarationToTMethodDefinition_Match_Match() {
		return getReturnType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__IsApplicable_checkCsp_CC__CSP() {
		return getReturnType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckDEC_FWD__MMethodDefinition_TypeAccess_Type() {
		return getReturnType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__CheckDEC_BWD__TAbstractType_TMethodDefinition() {
		return getReturnType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__GenerateModel__RuleEntryContainer_MethodDeclarationToTMethodDefinition_TypeToTAbstractType() {
		return getReturnType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodDefinition_Type_TAbstractType_TMethodDefinition_TypeToTAbstractType_MethodDeclarationToTMethodDefinition_ModelgeneratorRuleResult() {
		return getReturnType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnType__GenerateModel_checkCsp_BWD__CSP() {
		return getReturnType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameterLink() {
		if (methodParameterLinkEClass == null) {
			methodParameterLinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(47);
		}
		return methodParameterLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__Perform_FWD__IsApplicableMatch() {
		return getMethodParameterLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_FWD__Match() {
		return getMethodParameterLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__RegisterObjectsToMatch_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_solveCsp_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameterLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_MEntry_MEntryToTParameter_TParameter_MEntry_TParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameterLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckTypes_FWD__Match() {
		return getMethodParameterLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__Perform_BWD__IsApplicableMatch() {
		return getMethodParameterLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_BWD__Match() {
		return getMethodParameterLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__RegisterObjectsToMatch_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_MEntry_MEntryToTParameter_TParameter_MEntry_TParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLink().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckTypes_BWD__Match() {
		return getMethodParameterLink().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge() {
		return getMethodParameterLink().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge() {
		return getMethodParameterLink().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameterLink().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameterLink().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_CC__Match_Match() {
		return getMethodParameterLink().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_CC__CCMatch_MEntry_MEntryToTParameter_TParameter_MEntry_TParameter_MEntryToTParameter_Match_Match() {
		return getMethodParameterLink().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameterLink().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckDEC_FWD__MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__CheckDEC_BWD__TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__GenerateModel__RuleEntryContainer_MEntryToTParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__GenerateModel_solveCsp_BWD__IsApplicableMatch_MEntry_MEntryToTParameter_TParameter_MEntry_TParameter_MEntryToTParameter_ModelgeneratorRuleResult() {
		return getMethodParameterLink().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameterLink__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodName() {
		if (methodNameEClass == null) {
			methodNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(48);
		}
		return methodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_FWD__Match_MGravityModel_MMethodName() {
		return getMethodName().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__Perform_FWD__IsApplicableMatch() {
		return getMethodName().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_FWD__Match() {
		return getMethodName().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__RegisterObjectsToMatch_FWD__Match_MGravityModel_MMethodName() {
		return getMethodName().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_solveCsp_FWD__Match_MGravityModel_MMethodName() {
		return getMethodName().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodName().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_MMethodName() {
		return getMethodName().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodName().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodName().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckTypes_FWD__Match() {
		return getMethodName().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_BWD__Match_TypeGraph_TMethod() {
		return getMethodName().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__Perform_BWD__IsApplicableMatch() {
		return getMethodName().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_BWD__Match() {
		return getMethodName().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__RegisterObjectsToMatch_BWD__Match_TypeGraph_TMethod() {
		return getMethodName().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TMethod() {
		return getMethodName().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_TMethod() {
		return getMethodName().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodName().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckTypes_BWD__Match() {
		return getMethodName().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge() {
		return getMethodName().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge() {
		return getMethodName().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckAttributes_FWD__TripleMatch() {
		return getMethodName().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckAttributes_BWD__TripleMatch() {
		return getMethodName().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_CC__Match_Match() {
		return getMethodName().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_solveCsp_CC__CCMatch_MGravityModel_TypeGraph_ModelToTypeGraph_MMethodName_TMethod_Match_Match() {
		return getMethodName().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__IsApplicable_checkCsp_CC__CSP() {
		return getMethodName().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckDEC_FWD__MGravityModel_MMethodName() {
		return getMethodName().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__CheckDEC_BWD__TypeGraph_TMethod() {
		return getMethodName().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getMethodName().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__GenerateModel_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getMethodName().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodName__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkSignatureToType() {
		if (linkSignatureToTypeEClass == null) {
			linkSignatureToTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(49);
		}
		return linkSignatureToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_FWD__Match_MSignature_MDefinition_AbstractTypeDeclaration() {
		return getLinkSignatureToType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__Perform_FWD__IsApplicableMatch() {
		return getLinkSignatureToType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_FWD__Match() {
		return getLinkSignatureToType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__RegisterObjectsToMatch_FWD__Match_MSignature_MDefinition_AbstractTypeDeclaration() {
		return getLinkSignatureToType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_solveCsp_FWD__Match_MSignature_MDefinition_AbstractTypeDeclaration() {
		return getLinkSignatureToType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_checkCsp_FWD__CSP() {
		return getLinkSignatureToType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_solveCsp_FWD__IsApplicableMatch_TSignature_TAbstractType_MSignature_MDefinition_MSignatureToTSignature_AbstractTypeDeclaration_TypeToTAbstractType() {
		return getLinkSignatureToType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_checkCsp_FWD__CSP() {
		return getLinkSignatureToType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkSignatureToType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckTypes_FWD__Match() {
		return getLinkSignatureToType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_BWD__Match_TSignature_TAbstractType() {
		return getLinkSignatureToType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__Perform_BWD__IsApplicableMatch() {
		return getLinkSignatureToType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_BWD__Match() {
		return getLinkSignatureToType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__RegisterObjectsToMatch_BWD__Match_TSignature_TAbstractType() {
		return getLinkSignatureToType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_solveCsp_BWD__Match_TSignature_TAbstractType() {
		return getLinkSignatureToType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_checkCsp_BWD__CSP() {
		return getLinkSignatureToType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TSignature_TAbstractType_MSignature_MDefinition_MSignatureToTSignature_AbstractTypeDeclaration_TypeToTAbstractType() {
		return getLinkSignatureToType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_checkCsp_BWD__CSP() {
		return getLinkSignatureToType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkSignatureToType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckTypes_BWD__Match() {
		return getLinkSignatureToType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_FWD_EMoflonEdge_44__EMoflonEdge() {
		return getLinkSignatureToType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge() {
		return getLinkSignatureToType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckAttributes_FWD__TripleMatch() {
		return getLinkSignatureToType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckAttributes_BWD__TripleMatch() {
		return getLinkSignatureToType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_CC__Match_Match() {
		return getLinkSignatureToType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_solveCsp_CC__CCMatch_TSignature_TAbstractType_MSignature_MDefinition_MSignatureToTSignature_AbstractTypeDeclaration_TypeToTAbstractType_Match_Match() {
		return getLinkSignatureToType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__IsApplicable_checkCsp_CC__CSP() {
		return getLinkSignatureToType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckDEC_FWD__MSignature_MDefinition_AbstractTypeDeclaration() {
		return getLinkSignatureToType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__CheckDEC_BWD__TSignature_TAbstractType() {
		return getLinkSignatureToType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__GenerateModel__RuleEntryContainer_MSignatureToTSignature_TypeToTAbstractType() {
		return getLinkSignatureToType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TSignature_TAbstractType_MSignature_MDefinition_MSignatureToTSignature_AbstractTypeDeclaration_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getLinkSignatureToType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkSignatureToType__GenerateModel_checkCsp_BWD__CSP() {
		return getLinkSignatureToType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameter() {
		if (methodParameterEClass == null) {
			methodParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(50);
		}
		return methodParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__Perform_FWD__IsApplicableMatch() {
		return getMethodParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_FWD__Match() {
		return getMethodParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__RegisterObjectsToMatch_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_MEntry() {
		return getMethodParameter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodSignatureToTParameterList_TParameterList_MMethodSignature_MEntry() {
		return getMethodParameter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckTypes_FWD__Match() {
		return getMethodParameter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_BWD__Match_TParameterList_TParameter() {
		return getMethodParameter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__Perform_BWD__IsApplicableMatch() {
		return getMethodParameter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_BWD__Match() {
		return getMethodParameter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__RegisterObjectsToMatch_BWD__Match_TParameterList_TParameter() {
		return getMethodParameter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_solveCsp_BWD__Match_TParameterList_TParameter() {
		return getMethodParameter().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodSignatureToTParameterList_TParameterList_MMethodSignature_TParameter() {
		return getMethodParameter().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameter().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckTypes_BWD__Match() {
		return getMethodParameter().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_FWD_EMoflonEdge_45__EMoflonEdge() {
		return getMethodParameter().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge() {
		return getMethodParameter().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameter().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameter().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_CC__Match_Match() {
		return getMethodParameter().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_solveCsp_CC__CCMatch_MMethodSignatureToTParameterList_TParameterList_MMethodSignature_MEntry_TParameter_Match_Match() {
		return getMethodParameter().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameter().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckDEC_FWD__MMethodSignature_MEntry() {
		return getMethodParameter().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__CheckDEC_BWD__TParameterList_TParameter() {
		return getMethodParameter().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__GenerateModel__RuleEntryContainer_MMethodSignatureToTParameterList() {
		return getMethodParameter().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodSignatureToTParameterList_TParameterList_MMethodSignature_ModelgeneratorRuleResult() {
		return getMethodParameter().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodParameter__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAccessTarget() {
		if (fieldAccessTargetEClass == null) {
			fieldAccessTargetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(51);
		}
		return fieldAccessTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_FWD__Match_MDefinition_MFieldDefinition_SingleVariableAccess_VariableDeclarationFragment() {
		return getFieldAccessTarget().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__Perform_FWD__IsApplicableMatch() {
		return getFieldAccessTarget().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_FWD__Match() {
		return getFieldAccessTarget().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__RegisterObjectsToMatch_FWD__Match_MDefinition_MFieldDefinition_SingleVariableAccess_VariableDeclarationFragment() {
		return getFieldAccessTarget().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_solveCsp_FWD__Match_MDefinition_MFieldDefinition_SingleVariableAccess_VariableDeclarationFragment() {
		return getFieldAccessTarget().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldAccessTarget().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinition_TMember_TAccess_TFieldDefinition_MDefinitionToTMember_MFieldDefinition_MDefinitionToTMember_SingleVariableAccess_VariableDeclarationFragment_VariableDeclarationFragmentToTFieldDefinition_SingleVariableAccessToTAccess() {
		return getFieldAccessTarget().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldAccessTarget().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessTarget().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckTypes_FWD__Match() {
		return getFieldAccessTarget().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_BWD__Match_TMember_TAccess_TFieldDefinition() {
		return getFieldAccessTarget().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__Perform_BWD__IsApplicableMatch() {
		return getFieldAccessTarget().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_BWD__Match() {
		return getFieldAccessTarget().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__RegisterObjectsToMatch_BWD__Match_TMember_TAccess_TFieldDefinition() {
		return getFieldAccessTarget().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_solveCsp_BWD__Match_TMember_TAccess_TFieldDefinition() {
		return getFieldAccessTarget().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldAccessTarget().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinition_TMember_TAccess_TFieldDefinition_MDefinitionToTMember_MFieldDefinition_MDefinitionToTMember_SingleVariableAccess_VariableDeclarationFragment_VariableDeclarationFragmentToTFieldDefinition_SingleVariableAccessToTAccess() {
		return getFieldAccessTarget().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldAccessTarget().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessTarget().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckTypes_BWD__Match() {
		return getFieldAccessTarget().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_FWD_EMoflonEdge_46__EMoflonEdge() {
		return getFieldAccessTarget().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge() {
		return getFieldAccessTarget().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckAttributes_FWD__TripleMatch() {
		return getFieldAccessTarget().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckAttributes_BWD__TripleMatch() {
		return getFieldAccessTarget().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_CC__Match_Match() {
		return getFieldAccessTarget().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_solveCsp_CC__CCMatch_MDefinition_TMember_TAccess_TFieldDefinition_MDefinitionToTMember_MFieldDefinition_MDefinitionToTMember_SingleVariableAccess_VariableDeclarationFragment_VariableDeclarationFragmentToTFieldDefinition_SingleVariableAccessToTAccess_Match_Match() {
		return getFieldAccessTarget().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__IsApplicable_checkCsp_CC__CSP() {
		return getFieldAccessTarget().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckDEC_FWD__MDefinition_MFieldDefinition_SingleVariableAccess_VariableDeclarationFragment() {
		return getFieldAccessTarget().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__CheckDEC_BWD__TMember_TAccess_TFieldDefinition() {
		return getFieldAccessTarget().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__GenerateModel__RuleEntryContainer_SingleVariableAccessToTAccess_MDefinitionToTMember() {
		return getFieldAccessTarget().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinition_TMember_TAccess_TFieldDefinition_MDefinitionToTMember_MFieldDefinition_MDefinitionToTMember_SingleVariableAccess_VariableDeclarationFragment_VariableDeclarationFragmentToTFieldDefinition_SingleVariableAccessToTAccess_ModelgeneratorRuleResult() {
		return getFieldAccessTarget().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldAccessTarget__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldAccessTarget().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		if (enumEClass == null) {
			enumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(52);
		}
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_FWD__Match_Package_EnumDeclaration() {
		return getEnum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__Perform_FWD__IsApplicableMatch() {
		return getEnum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_FWD__Match() {
		return getEnum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__RegisterObjectsToMatch_FWD__Match_Package_EnumDeclaration() {
		return getEnum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_solveCsp_FWD__Match_Package_EnumDeclaration() {
		return getEnum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_EnumDeclaration() {
		return getEnum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_checkCsp_FWD__CSP() {
		return getEnum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckTypes_FWD__Match() {
		return getEnum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph() {
		return getEnum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__Perform_BWD__IsApplicableMatch() {
		return getEnum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_BWD__Match() {
		return getEnum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph() {
		return getEnum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph() {
		return getEnum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TClass_TPackage_Package_TypeGraph() {
		return getEnum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_checkCsp_BWD__CSP() {
		return getEnum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckTypes_BWD__Match() {
		return getEnum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_FWD_EMoflonEdge_47__EMoflonEdge() {
		return getEnum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge() {
		return getEnum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckAttributes_FWD__TripleMatch() {
		return getEnum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckAttributes_BWD__TripleMatch() {
		return getEnum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_CC__Match_Match() {
		return getEnum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_solveCsp_CC__CCMatch_PackageToTPackage_TClass_TPackage_Package_TypeGraph_EnumDeclaration_Match_Match() {
		return getEnum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__IsApplicable_checkCsp_CC__CSP() {
		return getEnum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckDEC_FWD__Package_EnumDeclaration() {
		return getEnum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__CheckDEC_BWD__TClass_TPackage_TypeGraph() {
		return getEnum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getEnum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getEnum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnum__GenerateModel_checkCsp_BWD__CSP() {
		return getEnum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocationSource() {
		if (methodInvocationSourceEClass == null) {
			methodInvocationSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(53);
		}
		return methodInvocationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_FWD__Match_MethodInvocation_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__Perform_FWD__IsApplicableMatch() {
		return getMethodInvocationSource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_FWD__Match() {
		return getMethodInvocationSource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__RegisterObjectsToMatch_FWD__Match_MethodInvocation_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_solveCsp_FWD__Match_MethodInvocation_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodInvocationSource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_solveCsp_FWD__IsApplicableMatch_MethodInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodInvocationSource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationSource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckTypes_FWD__Match() {
		return getMethodInvocationSource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_BWD__Match_TMember_TAccess() {
		return getMethodInvocationSource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__Perform_BWD__IsApplicableMatch() {
		return getMethodInvocationSource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_BWD__Match() {
		return getMethodInvocationSource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__RegisterObjectsToMatch_BWD__Match_TMember_TAccess() {
		return getMethodInvocationSource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_solveCsp_BWD__Match_TMember_TAccess() {
		return getMethodInvocationSource().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodInvocationSource().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TAccess_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodInvocationSource().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationSource().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckTypes_BWD__Match() {
		return getMethodInvocationSource().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_FWD_EMoflonEdge_48__EMoflonEdge() {
		return getMethodInvocationSource().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge() {
		return getMethodInvocationSource().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckAttributes_FWD__TripleMatch() {
		return getMethodInvocationSource().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckAttributes_BWD__TripleMatch() {
		return getMethodInvocationSource().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_CC__Match_Match() {
		return getMethodInvocationSource().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_solveCsp_CC__CCMatch_MethodInvocation_MDefinitionToTMember_TMember_TAccess_MDefinition_Match_Match() {
		return getMethodInvocationSource().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__IsApplicable_checkCsp_CC__CSP() {
		return getMethodInvocationSource().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckDEC_FWD__MethodInvocation_MDefinition() {
		return getMethodInvocationSource().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__CheckDEC_BWD__TMember_TAccess() {
		return getMethodInvocationSource().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getMethodInvocationSource().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getMethodInvocationSource().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethodInvocationSource__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodInvocationSource().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperMethodInvocationSource() {
		if (superMethodInvocationSourceEClass == null) {
			superMethodInvocationSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(54);
		}
		return superMethodInvocationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_FWD__Match_SuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__Perform_FWD__IsApplicableMatch() {
		return getSuperMethodInvocationSource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_FWD__Match() {
		return getSuperMethodInvocationSource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__RegisterObjectsToMatch_FWD__Match_SuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_solveCsp_FWD__Match_SuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_checkCsp_FWD__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_solveCsp_FWD__IsApplicableMatch_SuperMethodInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_checkCsp_FWD__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperMethodInvocationSource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckTypes_FWD__Match() {
		return getSuperMethodInvocationSource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_BWD__Match_TMember_TAccess() {
		return getSuperMethodInvocationSource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__Perform_BWD__IsApplicableMatch() {
		return getSuperMethodInvocationSource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_BWD__Match() {
		return getSuperMethodInvocationSource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__RegisterObjectsToMatch_BWD__Match_TMember_TAccess() {
		return getSuperMethodInvocationSource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_solveCsp_BWD__Match_TMember_TAccess() {
		return getSuperMethodInvocationSource().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_checkCsp_BWD__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TAccess_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_checkCsp_BWD__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperMethodInvocationSource().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckTypes_BWD__Match() {
		return getSuperMethodInvocationSource().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_FWD_EMoflonEdge_49__EMoflonEdge() {
		return getSuperMethodInvocationSource().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge() {
		return getSuperMethodInvocationSource().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckAttributes_FWD__TripleMatch() {
		return getSuperMethodInvocationSource().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckAttributes_BWD__TripleMatch() {
		return getSuperMethodInvocationSource().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_CC__Match_Match() {
		return getSuperMethodInvocationSource().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_solveCsp_CC__CCMatch_SuperMethodInvocation_MDefinitionToTMember_TMember_TAccess_MDefinition_Match_Match() {
		return getSuperMethodInvocationSource().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__IsApplicable_checkCsp_CC__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckDEC_FWD__SuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocationSource().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__CheckDEC_BWD__TMember_TAccess() {
		return getSuperMethodInvocationSource().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getSuperMethodInvocationSource().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getSuperMethodInvocationSource().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperMethodInvocationSource__GenerateModel_checkCsp_BWD__CSP() {
		return getSuperMethodInvocationSource().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorInvocationSource() {
		if (constructorInvocationSourceEClass == null) {
			constructorInvocationSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(55);
		}
		return constructorInvocationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_FWD__Match_ConstructorInvocation_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__Perform_FWD__IsApplicableMatch() {
		return getConstructorInvocationSource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_FWD__Match() {
		return getConstructorInvocationSource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__RegisterObjectsToMatch_FWD__Match_ConstructorInvocation_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_solveCsp_FWD__Match_ConstructorInvocation_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructorInvocationSource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_solveCsp_FWD__IsApplicableMatch_ConstructorInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructorInvocationSource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorInvocationSource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckTypes_FWD__Match() {
		return getConstructorInvocationSource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_BWD__Match_TMember_TAccess() {
		return getConstructorInvocationSource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__Perform_BWD__IsApplicableMatch() {
		return getConstructorInvocationSource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_BWD__Match() {
		return getConstructorInvocationSource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__RegisterObjectsToMatch_BWD__Match_TMember_TAccess() {
		return getConstructorInvocationSource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_solveCsp_BWD__Match_TMember_TAccess() {
		return getConstructorInvocationSource().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructorInvocationSource().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TAccess_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructorInvocationSource().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorInvocationSource().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckTypes_BWD__Match() {
		return getConstructorInvocationSource().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_FWD_EMoflonEdge_50__EMoflonEdge() {
		return getConstructorInvocationSource().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge() {
		return getConstructorInvocationSource().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckAttributes_FWD__TripleMatch() {
		return getConstructorInvocationSource().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckAttributes_BWD__TripleMatch() {
		return getConstructorInvocationSource().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_CC__Match_Match() {
		return getConstructorInvocationSource().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_solveCsp_CC__CCMatch_ConstructorInvocation_MDefinitionToTMember_TMember_TAccess_MDefinition_Match_Match() {
		return getConstructorInvocationSource().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__IsApplicable_checkCsp_CC__CSP() {
		return getConstructorInvocationSource().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckDEC_FWD__ConstructorInvocation_MDefinition() {
		return getConstructorInvocationSource().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__CheckDEC_BWD__TMember_TAccess() {
		return getConstructorInvocationSource().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getConstructorInvocationSource().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getConstructorInvocationSource().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructorInvocationSource__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructorInvocationSource().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperConstructorInvocationSource() {
		if (superConstructorInvocationSourceEClass == null) {
			superConstructorInvocationSourceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return superConstructorInvocationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_FWD__Match_SuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__Perform_FWD__IsApplicableMatch() {
		return getSuperConstructorInvocationSource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_FWD__Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__RegisterObjectsToMatch_FWD__Match_SuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_solveCsp_FWD__Match_SuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_checkCsp_FWD__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_solveCsp_FWD__IsApplicableMatch_SuperConstructorInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_checkCsp_FWD__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperConstructorInvocationSource().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckTypes_FWD__Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_BWD__Match_TMember_TAccess() {
		return getSuperConstructorInvocationSource().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__Perform_BWD__IsApplicableMatch() {
		return getSuperConstructorInvocationSource().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_BWD__Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__RegisterObjectsToMatch_BWD__Match_TMember_TAccess() {
		return getSuperConstructorInvocationSource().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_solveCsp_BWD__Match_TMember_TAccess() {
		return getSuperConstructorInvocationSource().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TAccess_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperConstructorInvocationSource().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckTypes_BWD__Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_FWD_EMoflonEdge_51__EMoflonEdge() {
		return getSuperConstructorInvocationSource().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge() {
		return getSuperConstructorInvocationSource().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckAttributes_FWD__TripleMatch() {
		return getSuperConstructorInvocationSource().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckAttributes_BWD__TripleMatch() {
		return getSuperConstructorInvocationSource().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_CC__Match_Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_solveCsp_CC__CCMatch_SuperConstructorInvocation_MDefinitionToTMember_TMember_TAccess_MDefinition_Match_Match() {
		return getSuperConstructorInvocationSource().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__IsApplicable_checkCsp_CC__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckDEC_FWD__SuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocationSource().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__CheckDEC_BWD__TMember_TAccess() {
		return getSuperConstructorInvocationSource().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getSuperConstructorInvocationSource().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getSuperConstructorInvocationSource().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSuperConstructorInvocationSource__GenerateModel_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocationSource().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		if (typeParameterEClass == null) {
			typeParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(57);
		}
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_FWD__Match() {
		return getTypeParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__RegisterObjectsToMatch_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_solveCsp_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel_TypeGraph_TypeParameter_ModelToTypeGraph() {
		return getTypeParameter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckTypes_FWD__Match() {
		return getTypeParameter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_BWD__Match() {
		return getTypeParameter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_TClass_ModelToTypeGraph() {
		return getTypeParameter().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckTypes_BWD__Match() {
		return getTypeParameter().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_FWD_EMoflonEdge_52__EMoflonEdge() {
		return getTypeParameter().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge() {
		return getTypeParameter().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_CC__Match_Match() {
		return getTypeParameter().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_solveCsp_CC__CCMatch_MGravityModel_TypeGraph_TClass_TypeParameter_ModelToTypeGraph_Match_Match() {
		return getTypeParameter().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckDEC_FWD__MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__CheckDEC_BWD__TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getTypeParameter().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GenerateModel_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getTypeParameter().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		if (constructorEClass == null) {
			constructorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(58);
		}
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_FWD__Match_MConstructorDefinition_AbstractTypeDeclaration() {
		return getConstructor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__Perform_FWD__IsApplicableMatch() {
		return getConstructor().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_FWD__Match() {
		return getConstructor().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__RegisterObjectsToMatch_FWD__Match_MConstructorDefinition_AbstractTypeDeclaration() {
		return getConstructor().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_solveCsp_FWD__Match_MConstructorDefinition_AbstractTypeDeclaration() {
		return getConstructor().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructor().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TypeGraph_TClass_MConstructorDefinition_AbstractTypeDeclaration() {
		return getConstructor().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructor().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructor().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckTypes_FWD__Match() {
		return getConstructor().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_BWD__Match_TParameterList_TypeGraph_TClass_TMethodDefinition_TMethodSignature_TMethod() {
		return getConstructor().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__Perform_BWD__IsApplicableMatch() {
		return getConstructor().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_BWD__Match() {
		return getConstructor().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__RegisterObjectsToMatch_BWD__Match_TParameterList_TypeGraph_TClass_TMethodDefinition_TMethodSignature_TMethod() {
		return getConstructor().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_solveCsp_BWD__Match_TParameterList_TypeGraph_TClass_TMethodDefinition_TMethodSignature_TMethod() {
		return getConstructor().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructor().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_solveCsp_BWD__IsApplicableMatch_TParameterList_TypeToTAbstractType_TypeGraph_TClass_AbstractTypeDeclaration_TMethodDefinition_TMethodSignature_TMethod() {
		return getConstructor().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructor().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructor().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckTypes_BWD__Match() {
		return getConstructor().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_FWD_EMoflonEdge_53__EMoflonEdge() {
		return getConstructor().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge() {
		return getConstructor().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckAttributes_FWD__TripleMatch() {
		return getConstructor().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckAttributes_BWD__TripleMatch() {
		return getConstructor().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_CC__Match_Match() {
		return getConstructor().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_solveCsp_CC__CCMatch_TParameterList_TypeToTAbstractType_TypeGraph_TClass_MConstructorDefinition_AbstractTypeDeclaration_TMethodDefinition_TMethodSignature_TMethod_Match_Match() {
		return getConstructor().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__IsApplicable_checkCsp_CC__CSP() {
		return getConstructor().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckDEC_FWD__MConstructorDefinition_AbstractTypeDeclaration() {
		return getConstructor().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__CheckDEC_BWD__TParameterList_TypeGraph_TClass_TMethodDefinition_TMethodSignature_TMethod() {
		return getConstructor().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getConstructor().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TypeGraph_TClass_AbstractTypeDeclaration_ModelgeneratorRuleResult() {
		return getConstructor().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstructor__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructor().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedTypeDeclaration() {
		if (unresolvedTypeDeclarationEClass == null) {
			unresolvedTypeDeclarationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(59);
		}
		return unresolvedTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__Perform_FWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_FWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__RegisterObjectsToMatch_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_solveCsp_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel_TypeGraph_UnresolvedTypeDeclaration_ModelToTypeGraph() {
		return getUnresolvedTypeDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckTypes_FWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getUnresolvedTypeDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__Perform_BWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_BWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getUnresolvedTypeDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getUnresolvedTypeDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_TClass_ModelToTypeGraph() {
		return getUnresolvedTypeDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckTypes_BWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_FWD_EMoflonEdge_54__EMoflonEdge() {
		return getUnresolvedTypeDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge() {
		return getUnresolvedTypeDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckAttributes_FWD__TripleMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckAttributes_BWD__TripleMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_CC__Match_Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_CC__CCMatch_MGravityModel_TypeGraph_TClass_UnresolvedTypeDeclaration_ModelToTypeGraph_Match_Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_CC__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckDEC_FWD__MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__CheckDEC_BWD__TypeGraph_TClass() {
		return getUnresolvedTypeDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getUnresolvedTypeDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__GenerateModel_solveCsp_BWD__IsApplicableMatch_MGravityModel_TypeGraph_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getUnresolvedTypeDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnresolvedTypeDeclaration__GenerateModel_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
