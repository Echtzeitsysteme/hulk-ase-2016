/**
 */
package org.gravity.tgg.modisco.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.Rules.impl.RulesPackageImpl;

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
public class ModiscoPackageImpl extends EPackageImpl implements ModiscoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "modisco.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitToTInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldDefinitionToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConstructorDefinitionToTParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitToTPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToTPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationToTFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragmentToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclarationToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccessToTFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionToTMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodNameToTMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodSignatureToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodSignatureToTParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEntryToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclarationToTMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclarationToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclarationToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureToTSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldSignatureToTFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclarationToTAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationToTFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeToTAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldNameToTFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementToTMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionToTSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDeclarationToTMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationToTAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDeclarationToTMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDeclarationToTMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclarationToTClassEClass = null;

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
	 * @see org.gravity.tgg.modisco.ModiscoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModiscoPackageImpl() {
		super(eNS_URI, ModiscoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModiscoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ModiscoPackage init() {
		if (isInited)
			return (ModiscoPackage) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI);

		// Obtain or create and register package
		ModiscoPackageImpl theModiscoPackage = (ModiscoPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ModiscoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ModiscoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();
		org.gravity.modisco.ModiscoPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		PreprocessingPackageImpl thePreprocessingPackage = (PreprocessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PreprocessingPackage.eNS_URI) instanceof PreprocessingPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PreprocessingPackage.eNS_URI)
						: PreprocessingPackage.eINSTANCE);

		// Load packages
		theModiscoPackage.loadPackage();

		// Fix loaded packages
		theModiscoPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();
		thePreprocessingPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theModiscoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModiscoPackage.eNS_URI, theModiscoPackage);
		return theModiscoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnitToTInterface() {
		if (compilationUnitToTInterfaceEClass == null) {
			compilationUnitToTInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return compilationUnitToTInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTInterface_Source() {
		return (EReference) getCompilationUnitToTInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTInterface_Target() {
		return (EReference) getCompilationUnitToTInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionToTFieldDefinition() {
		if (expressionToTFieldDefinitionEClass == null) {
			expressionToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return expressionToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionToTFieldDefinition_Source() {
		return (EReference) getExpressionToTFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionToTFieldDefinition_Target() {
		return (EReference) getExpressionToTFieldDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldDefinitionToTFieldDefinition() {
		if (mFieldDefinitionToTFieldDefinitionEClass == null) {
			mFieldDefinitionToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(2);
		}
		return mFieldDefinitionToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldDefinitionToTFieldDefinition_Source() {
		return (EReference) getMFieldDefinitionToTFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldDefinitionToTFieldDefinition_Target() {
		return (EReference) getMFieldDefinitionToTFieldDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMConstructorDefinitionToTParameterList() {
		if (mConstructorDefinitionToTParameterListEClass == null) {
			mConstructorDefinitionToTParameterListEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(3);
		}
		return mConstructorDefinitionToTParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMConstructorDefinitionToTParameterList_Source() {
		return (EReference) getMConstructorDefinitionToTParameterList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMConstructorDefinitionToTParameterList_Target() {
		return (EReference) getMConstructorDefinitionToTParameterList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnitToTClass() {
		if (compilationUnitToTClassEClass == null) {
			compilationUnitToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return compilationUnitToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTClass_Source() {
		return (EReference) getCompilationUnitToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTClass_Target() {
		return (EReference) getCompilationUnitToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnitToTypeGraph() {
		if (compilationUnitToTypeGraphEClass == null) {
			compilationUnitToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return compilationUnitToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTypeGraph_Source() {
		return (EReference) getCompilationUnitToTypeGraph().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTypeGraph_Target() {
		return (EReference) getCompilationUnitToTypeGraph().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnitToTPackage() {
		if (compilationUnitToTPackageEClass == null) {
			compilationUnitToTPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return compilationUnitToTPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTPackage_Source() {
		return (EReference) getCompilationUnitToTPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnitToTPackage_Target() {
		return (EReference) getCompilationUnitToTPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageToTPackage() {
		if (packageToTPackageEClass == null) {
			packageToTPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return packageToTPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageToTPackage_Source() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageToTPackage_Target() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelToTypeGraph() {
		if (modelToTypeGraphEClass == null) {
			modelToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return modelToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelToTypeGraph_Source() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelToTypeGraph_Target() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclarationToTField() {
		if (fieldDeclarationToTFieldEClass == null) {
			fieldDeclarationToTFieldEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return fieldDeclarationToTFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclarationToTField_Target() {
		return (EReference) getFieldDeclarationToTField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclarationToTField_Source() {
		return (EReference) getFieldDeclarationToTField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclarationFragmentToTFieldDefinition() {
		if (variableDeclarationFragmentToTFieldDefinitionEClass == null) {
			variableDeclarationFragmentToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(10);
		}
		return variableDeclarationFragmentToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Source() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Target() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDeclarationToTMethodSignature() {
		if (methodDeclarationToTMethodSignatureEClass == null) {
			methodDeclarationToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(11);
		}
		return methodDeclarationToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethodSignature_Source() {
		return (EReference) getMethodDeclarationToTMethodSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethodSignature_Target() {
		return (EReference) getMethodDeclarationToTMethodSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementToTMethodDefinition() {
		if (statementToTMethodDefinitionEClass == null) {
			statementToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return statementToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementToTMethodDefinition_Source() {
		return (EReference) getStatementToTMethodDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementToTMethodDefinition_Target() {
		return (EReference) getStatementToTMethodDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMethodInvocationToTAccess() {
		if (abstractMethodInvocationToTAccessEClass == null) {
			abstractMethodInvocationToTAccessEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(13);
		}
		return abstractMethodInvocationToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodInvocationToTAccess_Source() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMethodInvocationToTAccess_Target() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAccessToTFieldSignature() {
		if (typeAccessToTFieldSignatureEClass == null) {
			typeAccessToTFieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return typeAccessToTFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAccessToTFieldSignature_Source() {
		return (EReference) getTypeAccessToTFieldSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAccessToTFieldSignature_Target() {
		return (EReference) getTypeAccessToTFieldSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDefinitionToTMember() {
		if (mDefinitionToTMemberEClass == null) {
			mDefinitionToTMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return mDefinitionToTMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinitionToTMember_Source() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinitionToTMember_Target() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAccessToTAccess() {
		if (fieldAccessToTAccessEClass == null) {
			fieldAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return fieldAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccessToTAccess_Source() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccessToTAccess_Target() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeToTClass() {
		if (primitiveTypeToTClassEClass == null) {
			primitiveTypeToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return primitiveTypeToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveTypeToTClass_Source() {
		return (EReference) getPrimitiveTypeToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveTypeToTClass_Target() {
		return (EReference) getPrimitiveTypeToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClassDeclarationToTClass() {
		if (anonymousClassDeclarationToTClassEClass == null) {
			anonymousClassDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(18);
		}
		return anonymousClassDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousClassDeclarationToTClass_Source() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousClassDeclarationToTClass_Target() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodNameToTMethod() {
		if (mMethodNameToTMethodEClass == null) {
			mMethodNameToTMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return mMethodNameToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodNameToTMethod_Source() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodNameToTMethod_Target() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodSignatureToTMethodSignature() {
		if (mMethodSignatureToTMethodSignatureEClass == null) {
			mMethodSignatureToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(20);
		}
		return mMethodSignatureToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignatureToTMethodSignature_Source() {
		return (EReference) getMMethodSignatureToTMethodSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignatureToTMethodSignature_Target() {
		return (EReference) getMMethodSignatureToTMethodSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodSignatureToTParameterList() {
		if (mMethodSignatureToTParameterListEClass == null) {
			mMethodSignatureToTParameterListEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(21);
		}
		return mMethodSignatureToTParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignatureToTParameterList_Source() {
		return (EReference) getMMethodSignatureToTParameterList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignatureToTParameterList_Target() {
		return (EReference) getMMethodSignatureToTParameterList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEntryToTParameter() {
		if (mEntryToTParameterEClass == null) {
			mEntryToTParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return mEntryToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntryToTParameter_Source() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntryToTParameter_Target() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockToTMethodDefinition() {
		if (blockToTMethodDefinitionEClass == null) {
			blockToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return blockToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockToTMethodDefinition_Source() {
		return (EReference) getBlockToTMethodDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockToTMethodDefinition_Target() {
		return (EReference) getBlockToTMethodDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDeclarationToTMethod() {
		if (methodDeclarationToTMethodEClass == null) {
			methodDeclarationToTMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return methodDeclarationToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethod_Source() {
		return (EReference) getMethodDeclarationToTMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethod_Target() {
		return (EReference) getMethodDeclarationToTMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDeclarationToTMethodDefinition() {
		if (methodDeclarationToTMethodDefinitionEClass == null) {
			methodDeclarationToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(25);
		}
		return methodDeclarationToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethodDefinition_Source() {
		return (EReference) getMethodDeclarationToTMethodDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclarationToTMethodDefinition_Target() {
		return (EReference) getMethodDeclarationToTMethodDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVariableDeclarationToTParameter() {
		if (singleVariableDeclarationToTParameterEClass == null) {
			singleVariableDeclarationToTParameterEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(26);
		}
		return singleVariableDeclarationToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclarationToTParameter_Source() {
		return (EReference) getSingleVariableDeclarationToTParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclarationToTParameter_Target() {
		return (EReference) getSingleVariableDeclarationToTParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSignatureToTSignature() {
		if (mSignatureToTSignatureEClass == null) {
			mSignatureToTSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return mSignatureToTSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignatureToTSignature_Source() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignatureToTSignature_Target() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldSignatureToTFieldSignature() {
		if (mFieldSignatureToTFieldSignatureEClass == null) {
			mFieldSignatureToTFieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(28);
		}
		return mFieldSignatureToTFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignatureToTFieldSignature_Source() {
		return (EReference) getMFieldSignatureToTFieldSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignatureToTFieldSignature_Target() {
		return (EReference) getMFieldSignatureToTFieldSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyDeclarationToTAnnotatable() {
		if (bodyDeclarationToTAnnotatableEClass == null) {
			bodyDeclarationToTAnnotatableEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(29);
		}
		return bodyDeclarationToTAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclarationToTAnnotatable_Source() {
		return (EReference) getBodyDeclarationToTAnnotatable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclarationToTAnnotatable_Target() {
		return (EReference) getBodyDeclarationToTAnnotatable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclarationToTFieldSignature() {
		if (fieldDeclarationToTFieldSignatureEClass == null) {
			fieldDeclarationToTFieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fieldDeclarationToTFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclarationToTFieldSignature_Source() {
		return (EReference) getFieldDeclarationToTFieldSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclarationToTFieldSignature_Target() {
		return (EReference) getFieldDeclarationToTFieldSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeToTAbstractType() {
		if (typeToTAbstractTypeEClass == null) {
			typeToTAbstractTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return typeToTAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToTAbstractType_Source() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeToTAbstractType_Target() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldNameToTField() {
		if (mFieldNameToTFieldEClass == null) {
			mFieldNameToTFieldEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(32);
		}
		return mFieldNameToTFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldNameToTField_Source() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldNameToTField_Target() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementToTMember() {
		if (statementToTMemberEClass == null) {
			statementToTMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(33);
		}
		return statementToTMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementToTMember_Target() {
		return (EReference) getStatementToTMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementToTMember_Source() {
		return (EReference) getStatementToTMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSignatureToTMethodSignature() {
		if (mSignatureToTMethodSignatureEClass == null) {
			mSignatureToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(34);
		}
		return mSignatureToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignatureToTMethodSignature_Target() {
		return (EReference) getMSignatureToTMethodSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignatureToTMethodSignature_Source() {
		return (EReference) getMSignatureToTMethodSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDefinitionToTSignature() {
		if (mDefinitionToTSignatureEClass == null) {
			mDefinitionToTSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(35);
		}
		return mDefinitionToTSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinitionToTSignature_Target() {
		return (EReference) getMDefinitionToTSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinitionToTSignature_Source() {
		return (EReference) getMDefinitionToTSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVariableAccessToTAccess() {
		if (singleVariableAccessToTAccessEClass == null) {
			singleVariableAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(36);
		}
		return singleVariableAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableAccessToTAccess_Target() {
		return (EReference) getSingleVariableAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableAccessToTAccess_Source() {
		return (EReference) getSingleVariableAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorDeclarationToTMethodDefinition() {
		if (constructorDeclarationToTMethodDefinitionEClass == null) {
			constructorDeclarationToTMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(37);
		}
		return constructorDeclarationToTMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethodDefinition_Source() {
		return (EReference) getConstructorDeclarationToTMethodDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethodDefinition_Target() {
		return (EReference) getConstructorDeclarationToTMethodDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationToTAnnotation() {
		if (annotationToTAnnotationEClass == null) {
			annotationToTAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(38);
		}
		return annotationToTAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationToTAnnotation_Source() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationToTAnnotation_Target() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorDeclarationToTMethod() {
		if (constructorDeclarationToTMethodEClass == null) {
			constructorDeclarationToTMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(39);
		}
		return constructorDeclarationToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethod_Source() {
		return (EReference) getConstructorDeclarationToTMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethod_Target() {
		return (EReference) getConstructorDeclarationToTMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorDeclarationToTMethodSignature() {
		if (constructorDeclarationToTMethodSignatureEClass == null) {
			constructorDeclarationToTMethodSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(40);
		}
		return constructorDeclarationToTMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethodSignature_Source() {
		return (EReference) getConstructorDeclarationToTMethodSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorDeclarationToTMethodSignature_Target() {
		return (EReference) getConstructorDeclarationToTMethodSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameterToTClass() {
		if (typeParameterToTClassEClass == null) {
			typeParameterToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI)
					.getEClassifiers().get(41);
		}
		return typeParameterToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameterToTClass_Source() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameterToTClass_Target() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedTypeDeclarationToTClass() {
		if (unresolvedTypeDeclarationToTClassEClass == null) {
			unresolvedTypeDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoPackage.eNS_URI).getEClassifiers().get(42);
		}
		return unresolvedTypeDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnresolvedTypeDeclarationToTClass_Source() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnresolvedTypeDeclarationToTClass_Target() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoFactory getModiscoFactory() {
		return (ModiscoFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ModiscoPackageImpl
