/**
 */
package org.gravity.tgg.modisco.preprocessing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.Rules.impl.RulesPackageImpl;

import org.gravity.tgg.modisco.impl.ModiscoPackageImpl;

import org.gravity.tgg.modisco.preprocessing.PreprocessingFactory;
import org.gravity.tgg.modisco.preprocessing.PreprocessingPackage;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.tgg.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreprocessingPackageImpl extends EPackageImpl implements PreprocessingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moDiscoTGGPreprocessingEClass = null;

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
	 * @see org.gravity.tgg.modisco.preprocessing.PreprocessingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PreprocessingPackageImpl() {
		super(eNS_URI, PreprocessingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PreprocessingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PreprocessingPackage init() {
		if (isInited)
			return (PreprocessingPackage) EPackage.Registry.INSTANCE.getEPackage(PreprocessingPackage.eNS_URI);

		// Obtain or create and register package
		PreprocessingPackageImpl thePreprocessingPackage = (PreprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PreprocessingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PreprocessingPackageImpl());

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
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theModiscoPackage_1.loadPackage();

		// Fix loaded packages
		thePreprocessingPackage.fixPackageContents();
		theModiscoPackage_1.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePreprocessingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PreprocessingPackage.eNS_URI, thePreprocessingPackage);
		return thePreprocessingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoDiscoTGGPreprocessing() {
		if (moDiscoTGGPreprocessingEClass == null) {
			moDiscoTGGPreprocessingEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PreprocessingPackage.eNS_URI).getEClassifiers().get(0);
		}
		return moDiscoTGGPreprocessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__CreateParamList__MMethodDefinition_MMethodSignature() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__FixStaticMethodCallOnField__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__GetMostGenericReturnType__MMethodDefinition() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__IsParamListEqual__MMethodDefinition_MMethodSignature() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__IsSuperType__Type_Type() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__Preprocess__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__PreprocessFields__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__PreprocessInv__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__PreprocessMethods__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__UpdateName__MName_MDefinition() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMoDiscoTGGPreprocessing__PreprocessAccesses__MGravityModel() {
		return getMoDiscoTGGPreprocessing().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingFactory getPreprocessingFactory() {
		return (PreprocessingFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.preprocessing." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PreprocessingPackageImpl
