/**
 */
package org.gravity.tgg.modisco.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoFactoryImpl extends EFactoryImpl implements ModiscoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModiscoFactory init() {
		try {
			ModiscoFactory theModiscoFactory = (ModiscoFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModiscoPackage.eNS_URI);
			if (theModiscoFactory != null) {
				return theModiscoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModiscoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModiscoPackage.COMPILATION_UNIT_TO_TINTERFACE:
			return createCompilationUnitToTInterface();
		case ModiscoPackage.EXPRESSION_TO_TFIELD_DEFINITION:
			return createExpressionToTFieldDefinition();
		case ModiscoPackage.MFIELD_DEFINITION_TO_TFIELD_DEFINITION:
			return createMFieldDefinitionToTFieldDefinition();
		case ModiscoPackage.MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST:
			return createMConstructorDefinitionToTParameterList();
		case ModiscoPackage.COMPILATION_UNIT_TO_TCLASS:
			return createCompilationUnitToTClass();
		case ModiscoPackage.COMPILATION_UNIT_TO_TYPE_GRAPH:
			return createCompilationUnitToTypeGraph();
		case ModiscoPackage.COMPILATION_UNIT_TO_TPACKAGE:
			return createCompilationUnitToTPackage();
		case ModiscoPackage.PACKAGE_TO_TPACKAGE:
			return createPackageToTPackage();
		case ModiscoPackage.MODEL_TO_TYPE_GRAPH:
			return createModelToTypeGraph();
		case ModiscoPackage.FIELD_DECLARATION_TO_TFIELD:
			return createFieldDeclarationToTField();
		case ModiscoPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION:
			return createVariableDeclarationFragmentToTFieldDefinition();
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD_SIGNATURE:
			return createMethodDeclarationToTMethodSignature();
		case ModiscoPackage.STATEMENT_TO_TMETHOD_DEFINITION:
			return createStatementToTMethodDefinition();
		case ModiscoPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS:
			return createAbstractMethodInvocationToTAccess();
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE:
			return createTypeAccessToTFieldSignature();
		case ModiscoPackage.MDEFINITION_TO_TMEMBER:
			return createMDefinitionToTMember();
		case ModiscoPackage.FIELD_ACCESS_TO_TACCESS:
			return createFieldAccessToTAccess();
		case ModiscoPackage.PRIMITIVE_TYPE_TO_TCLASS:
			return createPrimitiveTypeToTClass();
		case ModiscoPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return createAnonymousClassDeclarationToTClass();
		case ModiscoPackage.MMETHOD_NAME_TO_TMETHOD:
			return createMMethodNameToTMethod();
		case ModiscoPackage.MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE:
			return createMMethodSignatureToTMethodSignature();
		case ModiscoPackage.MMETHOD_SIGNATURE_TO_TPARAMETER_LIST:
			return createMMethodSignatureToTParameterList();
		case ModiscoPackage.MENTRY_TO_TPARAMETER:
			return createMEntryToTParameter();
		case ModiscoPackage.BLOCK_TO_TMETHOD_DEFINITION:
			return createBlockToTMethodDefinition();
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD:
			return createMethodDeclarationToTMethod();
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD_DEFINITION:
			return createMethodDeclarationToTMethodDefinition();
		case ModiscoPackage.SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER:
			return createSingleVariableDeclarationToTParameter();
		case ModiscoPackage.MSIGNATURE_TO_TSIGNATURE:
			return createMSignatureToTSignature();
		case ModiscoPackage.MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE:
			return createMFieldSignatureToTFieldSignature();
		case ModiscoPackage.BODY_DECLARATION_TO_TANNOTATABLE:
			return createBodyDeclarationToTAnnotatable();
		case ModiscoPackage.FIELD_DECLARATION_TO_TFIELD_SIGNATURE:
			return createFieldDeclarationToTFieldSignature();
		case ModiscoPackage.TYPE_TO_TABSTRACT_TYPE:
			return createTypeToTAbstractType();
		case ModiscoPackage.MFIELD_NAME_TO_TFIELD:
			return createMFieldNameToTField();
		case ModiscoPackage.STATEMENT_TO_TMEMBER:
			return createStatementToTMember();
		case ModiscoPackage.MSIGNATURE_TO_TMETHOD_SIGNATURE:
			return createMSignatureToTMethodSignature();
		case ModiscoPackage.MDEFINITION_TO_TSIGNATURE:
			return createMDefinitionToTSignature();
		case ModiscoPackage.SINGLE_VARIABLE_ACCESS_TO_TACCESS:
			return createSingleVariableAccessToTAccess();
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION:
			return createConstructorDeclarationToTMethodDefinition();
		case ModiscoPackage.ANNOTATION_TO_TANNOTATION:
			return createAnnotationToTAnnotation();
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD:
			return createConstructorDeclarationToTMethod();
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE:
			return createConstructorDeclarationToTMethodSignature();
		case ModiscoPackage.TYPE_PARAMETER_TO_TCLASS:
			return createTypeParameterToTClass();
		case ModiscoPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS:
			return createUnresolvedTypeDeclarationToTClass();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitToTInterface createCompilationUnitToTInterface() {
		CompilationUnitToTInterfaceImpl compilationUnitToTInterface = new CompilationUnitToTInterfaceImpl();
		return compilationUnitToTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionToTFieldDefinition createExpressionToTFieldDefinition() {
		ExpressionToTFieldDefinitionImpl expressionToTFieldDefinition = new ExpressionToTFieldDefinitionImpl();
		return expressionToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldDefinitionToTFieldDefinition createMFieldDefinitionToTFieldDefinition() {
		MFieldDefinitionToTFieldDefinitionImpl mFieldDefinitionToTFieldDefinition = new MFieldDefinitionToTFieldDefinitionImpl();
		return mFieldDefinitionToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MConstructorDefinitionToTParameterList createMConstructorDefinitionToTParameterList() {
		MConstructorDefinitionToTParameterListImpl mConstructorDefinitionToTParameterList = new MConstructorDefinitionToTParameterListImpl();
		return mConstructorDefinitionToTParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitToTClass createCompilationUnitToTClass() {
		CompilationUnitToTClassImpl compilationUnitToTClass = new CompilationUnitToTClassImpl();
		return compilationUnitToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitToTypeGraph createCompilationUnitToTypeGraph() {
		CompilationUnitToTypeGraphImpl compilationUnitToTypeGraph = new CompilationUnitToTypeGraphImpl();
		return compilationUnitToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnitToTPackage createCompilationUnitToTPackage() {
		CompilationUnitToTPackageImpl compilationUnitToTPackage = new CompilationUnitToTPackageImpl();
		return compilationUnitToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToTPackage createPackageToTPackage() {
		PackageToTPackageImpl packageToTPackage = new PackageToTPackageImpl();
		return packageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph createModelToTypeGraph() {
		ModelToTypeGraphImpl modelToTypeGraph = new ModelToTypeGraphImpl();
		return modelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclarationToTField createFieldDeclarationToTField() {
		FieldDeclarationToTFieldImpl fieldDeclarationToTField = new FieldDeclarationToTFieldImpl();
		return fieldDeclarationToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition() {
		VariableDeclarationFragmentToTFieldDefinitionImpl variableDeclarationFragmentToTFieldDefinition = new VariableDeclarationFragmentToTFieldDefinitionImpl();
		return variableDeclarationFragmentToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclarationToTMethodSignature createMethodDeclarationToTMethodSignature() {
		MethodDeclarationToTMethodSignatureImpl methodDeclarationToTMethodSignature = new MethodDeclarationToTMethodSignatureImpl();
		return methodDeclarationToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementToTMethodDefinition createStatementToTMethodDefinition() {
		StatementToTMethodDefinitionImpl statementToTMethodDefinition = new StatementToTMethodDefinitionImpl();
		return statementToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess() {
		AbstractMethodInvocationToTAccessImpl abstractMethodInvocationToTAccess = new AbstractMethodInvocationToTAccessImpl();
		return abstractMethodInvocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccessToTFieldSignature createTypeAccessToTFieldSignature() {
		TypeAccessToTFieldSignatureImpl typeAccessToTFieldSignature = new TypeAccessToTFieldSignatureImpl();
		return typeAccessToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember createMDefinitionToTMember() {
		MDefinitionToTMemberImpl mDefinitionToTMember = new MDefinitionToTMemberImpl();
		return mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccessToTAccess createFieldAccessToTAccess() {
		FieldAccessToTAccessImpl fieldAccessToTAccess = new FieldAccessToTAccessImpl();
		return fieldAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeToTClass createPrimitiveTypeToTClass() {
		PrimitiveTypeToTClassImpl primitiveTypeToTClass = new PrimitiveTypeToTClassImpl();
		return primitiveTypeToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass() {
		AnonymousClassDeclarationToTClassImpl anonymousClassDeclarationToTClass = new AnonymousClassDeclarationToTClassImpl();
		return anonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodNameToTMethod createMMethodNameToTMethod() {
		MMethodNameToTMethodImpl mMethodNameToTMethod = new MMethodNameToTMethodImpl();
		return mMethodNameToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignatureToTMethodSignature createMMethodSignatureToTMethodSignature() {
		MMethodSignatureToTMethodSignatureImpl mMethodSignatureToTMethodSignature = new MMethodSignatureToTMethodSignatureImpl();
		return mMethodSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignatureToTParameterList createMMethodSignatureToTParameterList() {
		MMethodSignatureToTParameterListImpl mMethodSignatureToTParameterList = new MMethodSignatureToTParameterListImpl();
		return mMethodSignatureToTParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntryToTParameter createMEntryToTParameter() {
		MEntryToTParameterImpl mEntryToTParameter = new MEntryToTParameterImpl();
		return mEntryToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockToTMethodDefinition createBlockToTMethodDefinition() {
		BlockToTMethodDefinitionImpl blockToTMethodDefinition = new BlockToTMethodDefinitionImpl();
		return blockToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclarationToTMethod createMethodDeclarationToTMethod() {
		MethodDeclarationToTMethodImpl methodDeclarationToTMethod = new MethodDeclarationToTMethodImpl();
		return methodDeclarationToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclarationToTMethodDefinition createMethodDeclarationToTMethodDefinition() {
		MethodDeclarationToTMethodDefinitionImpl methodDeclarationToTMethodDefinition = new MethodDeclarationToTMethodDefinitionImpl();
		return methodDeclarationToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclarationToTParameter createSingleVariableDeclarationToTParameter() {
		SingleVariableDeclarationToTParameterImpl singleVariableDeclarationToTParameter = new SingleVariableDeclarationToTParameterImpl();
		return singleVariableDeclarationToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature createMSignatureToTSignature() {
		MSignatureToTSignatureImpl mSignatureToTSignature = new MSignatureToTSignatureImpl();
		return mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignatureToTFieldSignature createMFieldSignatureToTFieldSignature() {
		MFieldSignatureToTFieldSignatureImpl mFieldSignatureToTFieldSignature = new MFieldSignatureToTFieldSignatureImpl();
		return mFieldSignatureToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclarationToTAnnotatable createBodyDeclarationToTAnnotatable() {
		BodyDeclarationToTAnnotatableImpl bodyDeclarationToTAnnotatable = new BodyDeclarationToTAnnotatableImpl();
		return bodyDeclarationToTAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclarationToTFieldSignature createFieldDeclarationToTFieldSignature() {
		FieldDeclarationToTFieldSignatureImpl fieldDeclarationToTFieldSignature = new FieldDeclarationToTFieldSignatureImpl();
		return fieldDeclarationToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType createTypeToTAbstractType() {
		TypeToTAbstractTypeImpl typeToTAbstractType = new TypeToTAbstractTypeImpl();
		return typeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldNameToTField createMFieldNameToTField() {
		MFieldNameToTFieldImpl mFieldNameToTField = new MFieldNameToTFieldImpl();
		return mFieldNameToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementToTMember createStatementToTMember() {
		StatementToTMemberImpl statementToTMember = new StatementToTMemberImpl();
		return statementToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTMethodSignature createMSignatureToTMethodSignature() {
		MSignatureToTMethodSignatureImpl mSignatureToTMethodSignature = new MSignatureToTMethodSignatureImpl();
		return mSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTSignature createMDefinitionToTSignature() {
		MDefinitionToTSignatureImpl mDefinitionToTSignature = new MDefinitionToTSignatureImpl();
		return mDefinitionToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableAccessToTAccess createSingleVariableAccessToTAccess() {
		SingleVariableAccessToTAccessImpl singleVariableAccessToTAccess = new SingleVariableAccessToTAccessImpl();
		return singleVariableAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorDeclarationToTMethodDefinition createConstructorDeclarationToTMethodDefinition() {
		ConstructorDeclarationToTMethodDefinitionImpl constructorDeclarationToTMethodDefinition = new ConstructorDeclarationToTMethodDefinitionImpl();
		return constructorDeclarationToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationToTAnnotation createAnnotationToTAnnotation() {
		AnnotationToTAnnotationImpl annotationToTAnnotation = new AnnotationToTAnnotationImpl();
		return annotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorDeclarationToTMethod createConstructorDeclarationToTMethod() {
		ConstructorDeclarationToTMethodImpl constructorDeclarationToTMethod = new ConstructorDeclarationToTMethodImpl();
		return constructorDeclarationToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorDeclarationToTMethodSignature createConstructorDeclarationToTMethodSignature() {
		ConstructorDeclarationToTMethodSignatureImpl constructorDeclarationToTMethodSignature = new ConstructorDeclarationToTMethodSignatureImpl();
		return constructorDeclarationToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameterToTClass createTypeParameterToTClass() {
		TypeParameterToTClassImpl typeParameterToTClass = new TypeParameterToTClassImpl();
		return typeParameterToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass() {
		UnresolvedTypeDeclarationToTClassImpl unresolvedTypeDeclarationToTClass = new UnresolvedTypeDeclarationToTClassImpl();
		return unresolvedTypeDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoPackage getModiscoPackage() {
		return (ModiscoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModiscoPackage getPackage() {
		return ModiscoPackage.eINSTANCE;
	}

} //ModiscoFactoryImpl
