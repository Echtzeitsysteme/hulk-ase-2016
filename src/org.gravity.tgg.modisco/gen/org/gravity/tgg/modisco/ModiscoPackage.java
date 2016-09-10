/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see org.gravity.tgg.modisco.ModiscoFactory
 * @model kind="package"
 * @generated
 */
public interface ModiscoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modisco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.tgg.modisco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoPackage eINSTANCE = org.gravity.tgg.modisco.impl.ModiscoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTInterfaceImpl <em>Compilation Unit To TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTInterfaceImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTInterface()
	 * @generated
	 */
	int COMPILATION_UNIT_TO_TINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TINTERFACE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TINTERFACE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TINTERFACE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compilation Unit To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TINTERFACE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ExpressionToTFieldDefinitionImpl <em>Expression To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ExpressionToTFieldDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getExpressionToTFieldDefinition()
	 * @generated
	 */
	int EXPRESSION_TO_TFIELD_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_TFIELD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_TFIELD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_TFIELD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_TFIELD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MFieldDefinitionToTFieldDefinitionImpl <em>MField Definition To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MFieldDefinitionToTFieldDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldDefinitionToTFieldDefinition()
	 * @generated
	 */
	int MFIELD_DEFINITION_TO_TFIELD_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION_TO_TFIELD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION_TO_TFIELD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MField Definition To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION_TO_TFIELD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MField Definition To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION_TO_TFIELD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MConstructorDefinitionToTParameterListImpl <em>MConstructor Definition To TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MConstructorDefinitionToTParameterListImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMConstructorDefinitionToTParameterList()
	 * @generated
	 */
	int MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MConstructor Definition To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>MConstructor Definition To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTClassImpl <em>Compilation Unit To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTClass()
	 * @generated
	 */
	int COMPILATION_UNIT_TO_TCLASS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compilation Unit To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTypeGraphImpl <em>Compilation Unit To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTypeGraphImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTypeGraph()
	 * @generated
	 */
	int COMPILATION_UNIT_TO_TYPE_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TYPE_GRAPH__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TYPE_GRAPH__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compilation Unit To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTPackageImpl <em>Compilation Unit To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTPackageImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTPackage()
	 * @generated
	 */
	int COMPILATION_UNIT_TO_TPACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TPACKAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TPACKAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TPACKAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compilation Unit To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_TO_TPACKAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.PackageToTPackageImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPackageToTPackage()
	 * @generated
	 */
	int PACKAGE_TO_TPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModelToTypeGraph()
	 * @generated
	 */
	int MODEL_TO_TYPE_GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldImpl <em>Field Declaration To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldDeclarationToTField()
	 * @generated
	 */
	int FIELD_DECLARATION_TO_TFIELD = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Declaration To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Declaration To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodSignatureImpl <em>Method Declaration To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethodSignature()
	 * @generated
	 */
	int METHOD_DECLARATION_TO_TMETHOD_SIGNATURE = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Declaration To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Method Declaration To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.StatementToTMethodDefinitionImpl <em>Statement To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.StatementToTMethodDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStatementToTMethodDefinition()
	 * @generated
	 */
	int STATEMENT_TO_TMETHOD_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMETHOD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMETHOD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMETHOD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMETHOD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl <em>Type Access To TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeAccessToTFieldSignature()
	 * @generated
	 */
	int TYPE_ACCESS_TO_TFIELD_SIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Access To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_TO_TFIELD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Access To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_TO_TFIELD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTMember()
	 * @generated
	 */
	int MDEFINITION_TO_TMEMBER = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldAccessToTAccess()
	 * @generated
	 */
	int FIELD_ACCESS_TO_TACCESS = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl <em>Primitive Type To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPrimitiveTypeToTClass()
	 * @generated
	 */
	int PRIMITIVE_TYPE_TO_TCLASS = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodNameToTMethod()
	 * @generated
	 */
	int MMETHOD_NAME_TO_TMETHOD = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MMethodSignatureToTMethodSignatureImpl <em>MMethod Signature To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MMethodSignatureToTMethodSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodSignatureToTMethodSignature()
	 * @generated
	 */
	int MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMethod Signature To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MMethod Signature To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MMethodSignatureToTParameterListImpl <em>MMethod Signature To TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MMethodSignatureToTParameterListImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodSignatureToTParameterList()
	 * @generated
	 */
	int MMETHOD_SIGNATURE_TO_TPARAMETER_LIST = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TPARAMETER_LIST__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TPARAMETER_LIST__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMethod Signature To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TPARAMETER_LIST_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MMethod Signature To TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_TO_TPARAMETER_LIST_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MEntryToTParameterImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMEntryToTParameter()
	 * @generated
	 */
	int MENTRY_TO_TPARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.BlockToTMethodDefinitionImpl <em>Block To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.BlockToTMethodDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBlockToTMethodDefinition()
	 * @generated
	 */
	int BLOCK_TO_TMETHOD_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TO_TMETHOD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TO_TMETHOD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TO_TMETHOD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TO_TMETHOD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodImpl <em>Method Declaration To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethod()
	 * @generated
	 */
	int METHOD_DECLARATION_TO_TMETHOD = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Declaration To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method Declaration To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodDefinitionImpl <em>Method Declaration To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethodDefinition()
	 * @generated
	 */
	int METHOD_DECLARATION_TO_TMETHOD_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Declaration To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Method Declaration To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_TO_TMETHOD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.SingleVariableDeclarationToTParameterImpl <em>Single Variable Declaration To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.SingleVariableDeclarationToTParameterImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getSingleVariableDeclarationToTParameter()
	 * @generated
	 */
	int SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Variable Declaration To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Single Variable Declaration To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTSignature()
	 * @generated
	 */
	int MSIGNATURE_TO_TSIGNATURE = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MFieldSignatureToTFieldSignatureImpl <em>MField Signature To TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MFieldSignatureToTFieldSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldSignatureToTFieldSignature()
	 * @generated
	 */
	int MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE = 28;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MField Signature To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MField Signature To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.BodyDeclarationToTAnnotatableImpl <em>Body Declaration To TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.BodyDeclarationToTAnnotatableImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBodyDeclarationToTAnnotatable()
	 * @generated
	 */
	int BODY_DECLARATION_TO_TANNOTATABLE = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_TO_TANNOTATABLE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_TO_TANNOTATABLE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Body Declaration To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_TO_TANNOTATABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Body Declaration To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_TO_TANNOTATABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldSignatureImpl <em>Field Declaration To TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldDeclarationToTFieldSignature()
	 * @generated
	 */
	int FIELD_DECLARATION_TO_TFIELD_SIGNATURE = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Declaration To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Declaration To TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_TO_TFIELD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeToTAbstractType()
	 * @generated
	 */
	int TYPE_TO_TABSTRACT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldNameToTField()
	 * @generated
	 */
	int MFIELD_NAME_TO_TFIELD = 32;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.StatementToTMemberImpl <em>Statement To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.StatementToTMemberImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStatementToTMember()
	 * @generated
	 */
	int STATEMENT_TO_TMEMBER = 33;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMEMBER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMEMBER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMEMBER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_TO_TMEMBER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTMethodSignatureImpl <em>MSignature To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MSignatureToTMethodSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTMethodSignature()
	 * @generated
	 */
	int MSIGNATURE_TO_TMETHOD_SIGNATURE = 34;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TMETHOD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TMETHOD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MSignature To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MSignature To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTSignatureImpl <em>MDefinition To TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.MDefinitionToTSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTSignature()
	 * @generated
	 */
	int MDEFINITION_TO_TSIGNATURE = 35;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TSIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TSIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDefinition To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TSIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MDefinition To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TSIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.SingleVariableAccessToTAccessImpl <em>Single Variable Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.SingleVariableAccessToTAccessImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getSingleVariableAccessToTAccess()
	 * @generated
	 */
	int SINGLE_VARIABLE_ACCESS_TO_TACCESS = 36;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_TO_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_TO_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodDefinitionImpl <em>Constructor Declaration To TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodDefinitionImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethodDefinition()
	 * @generated
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Constructor Declaration To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Constructor Declaration To TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationToTAnnotation()
	 * @generated
	 */
	int ANNOTATION_TO_TANNOTATION = 38;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodImpl <em>Constructor Declaration To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethod()
	 * @generated
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD = 39;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor Declaration To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constructor Declaration To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodSignatureImpl <em>Constructor Declaration To TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodSignatureImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethodSignature()
	 * @generated
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE = 40;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor Declaration To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Constructor Declaration To TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeParameterToTClass()
	 * @generated
	 */
	int TYPE_PARAMETER_TO_TCLASS = 41;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl
	 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = 42;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.CompilationUnitToTInterface <em>Compilation Unit To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit To TInterface</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTInterface
	 * @generated
	 */
	EClass getCompilationUnitToTInterface();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTInterface#getSource()
	 * @see #getCompilationUnitToTInterface()
	 * @generated
	 */
	EReference getCompilationUnitToTInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTInterface#getTarget()
	 * @see #getCompilationUnitToTInterface()
	 * @generated
	 */
	EReference getCompilationUnitToTInterface_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ExpressionToTFieldDefinition <em>Expression To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression To TField Definition</em>'.
	 * @see org.gravity.tgg.modisco.ExpressionToTFieldDefinition
	 * @generated
	 */
	EClass getExpressionToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ExpressionToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ExpressionToTFieldDefinition#getSource()
	 * @see #getExpressionToTFieldDefinition()
	 * @generated
	 */
	EReference getExpressionToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ExpressionToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ExpressionToTFieldDefinition#getTarget()
	 * @see #getExpressionToTFieldDefinition()
	 * @generated
	 */
	EReference getExpressionToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition <em>MField Definition To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Definition To TField Definition</em>'.
	 * @see org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition
	 * @generated
	 */
	EClass getMFieldDefinitionToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition#getSource()
	 * @see #getMFieldDefinitionToTFieldDefinition()
	 * @generated
	 */
	EReference getMFieldDefinitionToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition#getTarget()
	 * @see #getMFieldDefinitionToTFieldDefinition()
	 * @generated
	 */
	EReference getMFieldDefinitionToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList <em>MConstructor Definition To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConstructor Definition To TParameter List</em>'.
	 * @see org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList
	 * @generated
	 */
	EClass getMConstructorDefinitionToTParameterList();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getSource()
	 * @see #getMConstructorDefinitionToTParameterList()
	 * @generated
	 */
	EReference getMConstructorDefinitionToTParameterList_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList#getTarget()
	 * @see #getMConstructorDefinitionToTParameterList()
	 * @generated
	 */
	EReference getMConstructorDefinitionToTParameterList_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.CompilationUnitToTClass <em>Compilation Unit To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit To TClass</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTClass
	 * @generated
	 */
	EClass getCompilationUnitToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTClass#getSource()
	 * @see #getCompilationUnitToTClass()
	 * @generated
	 */
	EReference getCompilationUnitToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTClass#getTarget()
	 * @see #getCompilationUnitToTClass()
	 * @generated
	 */
	EReference getCompilationUnitToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.CompilationUnitToTypeGraph <em>Compilation Unit To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit To Type Graph</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTypeGraph
	 * @generated
	 */
	EClass getCompilationUnitToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTypeGraph#getSource()
	 * @see #getCompilationUnitToTypeGraph()
	 * @generated
	 */
	EReference getCompilationUnitToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTypeGraph#getTarget()
	 * @see #getCompilationUnitToTypeGraph()
	 * @generated
	 */
	EReference getCompilationUnitToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.CompilationUnitToTPackage <em>Compilation Unit To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit To TPackage</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTPackage
	 * @generated
	 */
	EClass getCompilationUnitToTPackage();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTPackage#getSource()
	 * @see #getCompilationUnitToTPackage()
	 * @generated
	 */
	EReference getCompilationUnitToTPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.CompilationUnitToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTPackage#getTarget()
	 * @see #getCompilationUnitToTPackage()
	 * @generated
	 */
	EReference getCompilationUnitToTPackage_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package To TPackage</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage
	 * @generated
	 */
	EClass getPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PackageToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage#getSource()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PackageToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.PackageToTPackage#getTarget()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model To Type Graph</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph
	 * @generated
	 */
	EClass getModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModelToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph#getSource()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ModelToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph#getTarget()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.FieldDeclarationToTField <em>Field Declaration To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration To TField</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTField
	 * @generated
	 */
	EClass getFieldDeclarationToTField();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldDeclarationToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTField#getTarget()
	 * @see #getFieldDeclarationToTField()
	 * @generated
	 */
	EReference getFieldDeclarationToTField_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldDeclarationToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTField#getSource()
	 * @see #getFieldDeclarationToTField()
	 * @generated
	 */
	EReference getFieldDeclarationToTField_Source();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	EClass getVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature <em>Method Declaration To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration To TMethod Signature</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature
	 * @generated
	 */
	EClass getMethodDeclarationToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature#getSource()
	 * @see #getMethodDeclarationToTMethodSignature()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethodSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature#getTarget()
	 * @see #getMethodDeclarationToTMethodSignature()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethodSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.StatementToTMethodDefinition <em>Statement To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement To TMethod Definition</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMethodDefinition
	 * @generated
	 */
	EClass getStatementToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StatementToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMethodDefinition#getSource()
	 * @see #getStatementToTMethodDefinition()
	 * @generated
	 */
	EReference getStatementToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StatementToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMethodDefinition#getTarget()
	 * @see #getStatementToTMethodDefinition()
	 * @generated
	 */
	EReference getStatementToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	EClass getAbstractMethodInvocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getSource()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess#getTarget()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.TypeAccessToTFieldSignature <em>Type Access To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Access To TField Signature</em>'.
	 * @see org.gravity.tgg.modisco.TypeAccessToTFieldSignature
	 * @generated
	 */
	EClass getTypeAccessToTFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeAccessToTFieldSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.TypeAccessToTFieldSignature#getSource()
	 * @see #getTypeAccessToTFieldSignature()
	 * @generated
	 */
	EReference getTypeAccessToTFieldSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeAccessToTFieldSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.TypeAccessToTFieldSignature#getTarget()
	 * @see #getTypeAccessToTFieldSignature()
	 * @generated
	 */
	EReference getTypeAccessToTFieldSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition To TMember</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember
	 * @generated
	 */
	EClass getMDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember#getSource()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember#getTarget()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess
	 * @generated
	 */
	EClass getFieldAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess#getSource()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess#getTarget()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type To TClass</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass
	 * @generated
	 */
	EClass getPrimitiveTypeToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass#getSource()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass#getTarget()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	EClass getAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getSource()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass#getTarget()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Name To TMethod</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod
	 * @generated
	 */
	EClass getMMethodNameToTMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod#getSource()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature <em>MMethod Signature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Signature To TMethod Signature</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature
	 * @generated
	 */
	EClass getMMethodSignatureToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature#getSource()
	 * @see #getMMethodSignatureToTMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignatureToTMethodSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature#getTarget()
	 * @see #getMMethodSignatureToTMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignatureToTMethodSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList <em>MMethod Signature To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Signature To TParameter List</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTParameterList
	 * @generated
	 */
	EClass getMMethodSignatureToTParameterList();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getSource()
	 * @see #getMMethodSignatureToTParameterList()
	 * @generated
	 */
	EReference getMMethodSignatureToTParameterList_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTParameterList#getTarget()
	 * @see #getMMethodSignatureToTParameterList()
	 * @generated
	 */
	EReference getMMethodSignatureToTParameterList_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEntry To TParameter</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter
	 * @generated
	 */
	EClass getMEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MEntryToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter#getSource()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MEntryToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter#getTarget()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.BlockToTMethodDefinition <em>Block To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block To TMethod Definition</em>'.
	 * @see org.gravity.tgg.modisco.BlockToTMethodDefinition
	 * @generated
	 */
	EClass getBlockToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BlockToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.BlockToTMethodDefinition#getSource()
	 * @see #getBlockToTMethodDefinition()
	 * @generated
	 */
	EReference getBlockToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BlockToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.BlockToTMethodDefinition#getTarget()
	 * @see #getBlockToTMethodDefinition()
	 * @generated
	 */
	EReference getBlockToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethod <em>Method Declaration To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration To TMethod</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethod
	 * @generated
	 */
	EClass getMethodDeclarationToTMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethod#getSource()
	 * @see #getMethodDeclarationToTMethod()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethod#getTarget()
	 * @see #getMethodDeclarationToTMethod()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition <em>Method Declaration To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration To TMethod Definition</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition
	 * @generated
	 */
	EClass getMethodDeclarationToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition#getSource()
	 * @see #getMethodDeclarationToTMethodDefinition()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition#getTarget()
	 * @see #getMethodDeclarationToTMethodDefinition()
	 * @generated
	 */
	EReference getMethodDeclarationToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter <em>Single Variable Declaration To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Declaration To TParameter</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter
	 * @generated
	 */
	EClass getSingleVariableDeclarationToTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter#getSource()
	 * @see #getSingleVariableDeclarationToTParameter()
	 * @generated
	 */
	EReference getSingleVariableDeclarationToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter#getTarget()
	 * @see #getSingleVariableDeclarationToTParameter()
	 * @generated
	 */
	EReference getSingleVariableDeclarationToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature To TSignature</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature
	 * @generated
	 */
	EClass getMSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature#getSource()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature#getTarget()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature <em>MField Signature To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Signature To TField Signature</em>'.
	 * @see org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature
	 * @generated
	 */
	EClass getMFieldSignatureToTFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature#getSource()
	 * @see #getMFieldSignatureToTFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignatureToTFieldSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature#getTarget()
	 * @see #getMFieldSignatureToTFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignatureToTFieldSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable <em>Body Declaration To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Declaration To TAnnotatable</em>'.
	 * @see org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable
	 * @generated
	 */
	EClass getBodyDeclarationToTAnnotatable();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable#getSource()
	 * @see #getBodyDeclarationToTAnnotatable()
	 * @generated
	 */
	EReference getBodyDeclarationToTAnnotatable_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable#getTarget()
	 * @see #getBodyDeclarationToTAnnotatable()
	 * @generated
	 */
	EReference getBodyDeclarationToTAnnotatable_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature <em>Field Declaration To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration To TField Signature</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature
	 * @generated
	 */
	EClass getFieldDeclarationToTFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getSource()
	 * @see #getFieldDeclarationToTFieldSignature()
	 * @generated
	 */
	EReference getFieldDeclarationToTFieldSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature#getTarget()
	 * @see #getFieldDeclarationToTFieldSignature()
	 * @generated
	 */
	EReference getFieldDeclarationToTFieldSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To TAbstract Type</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType
	 * @generated
	 */
	EClass getTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeToTAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType#getSource()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeToTAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType#getTarget()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Name To TField</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField
	 * @generated
	 */
	EClass getMFieldNameToTField();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldNameToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField#getSource()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MFieldNameToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField#getTarget()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.StatementToTMember <em>Statement To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement To TMember</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMember
	 * @generated
	 */
	EClass getStatementToTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StatementToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMember#getTarget()
	 * @see #getStatementToTMember()
	 * @generated
	 */
	EReference getStatementToTMember_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.StatementToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.StatementToTMember#getSource()
	 * @see #getStatementToTMember()
	 * @generated
	 */
	EReference getStatementToTMember_Source();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature <em>MSignature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature To TMethod Signature</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTMethodSignature
	 * @generated
	 */
	EClass getMSignatureToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTMethodSignature#getTarget()
	 * @see #getMSignatureToTMethodSignature()
	 * @generated
	 */
	EReference getMSignatureToTMethodSignature_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MSignatureToTMethodSignature#getSource()
	 * @see #getMSignatureToTMethodSignature()
	 * @generated
	 */
	EReference getMSignatureToTMethodSignature_Source();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.MDefinitionToTSignature <em>MDefinition To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition To TSignature</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTSignature
	 * @generated
	 */
	EClass getMDefinitionToTSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTSignature#getTarget()
	 * @see #getMDefinitionToTSignature()
	 * @generated
	 */
	EReference getMDefinitionToTSignature_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.MDefinitionToTSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.MDefinitionToTSignature#getSource()
	 * @see #getMDefinitionToTSignature()
	 * @generated
	 */
	EReference getMDefinitionToTSignature_Source();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.SingleVariableAccessToTAccess <em>Single Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Access To TAccess</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableAccessToTAccess
	 * @generated
	 */
	EClass getSingleVariableAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.SingleVariableAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableAccessToTAccess#getTarget()
	 * @see #getSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getSingleVariableAccessToTAccess_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.SingleVariableAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.SingleVariableAccessToTAccess#getSource()
	 * @see #getSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getSingleVariableAccessToTAccess_Source();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition <em>Constructor Declaration To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Declaration To TMethod Definition</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition
	 * @generated
	 */
	EClass getConstructorDeclarationToTMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition#getSource()
	 * @see #getConstructorDeclarationToTMethodDefinition()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition#getTarget()
	 * @see #getConstructorDeclarationToTMethodDefinition()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethodDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation To TAnnotation</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation
	 * @generated
	 */
	EClass getAnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation#getSource()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation#getTarget()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethod <em>Constructor Declaration To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Declaration To TMethod</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethod
	 * @generated
	 */
	EClass getConstructorDeclarationToTMethod();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethod#getSource()
	 * @see #getConstructorDeclarationToTMethod()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethod#getTarget()
	 * @see #getConstructorDeclarationToTMethod()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature <em>Constructor Declaration To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Declaration To TMethod Signature</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature
	 * @generated
	 */
	EClass getConstructorDeclarationToTMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature#getSource()
	 * @see #getConstructorDeclarationToTMethodSignature()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethodSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature#getTarget()
	 * @see #getConstructorDeclarationToTMethodSignature()
	 * @generated
	 */
	EReference getConstructorDeclarationToTMethodSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter To TClass</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass
	 * @generated
	 */
	EClass getTypeParameterToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeParameterToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass#getSource()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.TypeParameterToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass#getTarget()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	EClass getUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getSource()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass#getTarget()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoFactory getModiscoFactory();

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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTInterfaceImpl <em>Compilation Unit To TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTInterfaceImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTInterface()
		 * @generated
		 */
		EClass COMPILATION_UNIT_TO_TINTERFACE = eINSTANCE.getCompilationUnitToTInterface();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TINTERFACE__SOURCE = eINSTANCE.getCompilationUnitToTInterface_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TINTERFACE__TARGET = eINSTANCE.getCompilationUnitToTInterface_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ExpressionToTFieldDefinitionImpl <em>Expression To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ExpressionToTFieldDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getExpressionToTFieldDefinition()
		 * @generated
		 */
		EClass EXPRESSION_TO_TFIELD_DEFINITION = eINSTANCE.getExpressionToTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TO_TFIELD_DEFINITION__SOURCE = eINSTANCE.getExpressionToTFieldDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TO_TFIELD_DEFINITION__TARGET = eINSTANCE.getExpressionToTFieldDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MFieldDefinitionToTFieldDefinitionImpl <em>MField Definition To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MFieldDefinitionToTFieldDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldDefinitionToTFieldDefinition()
		 * @generated
		 */
		EClass MFIELD_DEFINITION_TO_TFIELD_DEFINITION = eINSTANCE.getMFieldDefinitionToTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_DEFINITION_TO_TFIELD_DEFINITION__SOURCE = eINSTANCE
				.getMFieldDefinitionToTFieldDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_DEFINITION_TO_TFIELD_DEFINITION__TARGET = eINSTANCE
				.getMFieldDefinitionToTFieldDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MConstructorDefinitionToTParameterListImpl <em>MConstructor Definition To TParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MConstructorDefinitionToTParameterListImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMConstructorDefinitionToTParameterList()
		 * @generated
		 */
		EClass MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST = eINSTANCE.getMConstructorDefinitionToTParameterList();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST__SOURCE = eINSTANCE
				.getMConstructorDefinitionToTParameterList_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST__TARGET = eINSTANCE
				.getMConstructorDefinitionToTParameterList_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTClassImpl <em>Compilation Unit To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTClass()
		 * @generated
		 */
		EClass COMPILATION_UNIT_TO_TCLASS = eINSTANCE.getCompilationUnitToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TCLASS__SOURCE = eINSTANCE.getCompilationUnitToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TCLASS__TARGET = eINSTANCE.getCompilationUnitToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTypeGraphImpl <em>Compilation Unit To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTypeGraphImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTypeGraph()
		 * @generated
		 */
		EClass COMPILATION_UNIT_TO_TYPE_GRAPH = eINSTANCE.getCompilationUnitToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TYPE_GRAPH__SOURCE = eINSTANCE.getCompilationUnitToTypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TYPE_GRAPH__TARGET = eINSTANCE.getCompilationUnitToTypeGraph_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.CompilationUnitToTPackageImpl <em>Compilation Unit To TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.CompilationUnitToTPackageImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getCompilationUnitToTPackage()
		 * @generated
		 */
		EClass COMPILATION_UNIT_TO_TPACKAGE = eINSTANCE.getCompilationUnitToTPackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TPACKAGE__SOURCE = eINSTANCE.getCompilationUnitToTPackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT_TO_TPACKAGE__TARGET = eINSTANCE.getCompilationUnitToTPackage_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.PackageToTPackageImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPackageToTPackage()
		 * @generated
		 */
		EClass PACKAGE_TO_TPACKAGE = eINSTANCE.getPackageToTPackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TO_TPACKAGE__SOURCE = eINSTANCE.getPackageToTPackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TO_TPACKAGE__TARGET = eINSTANCE.getPackageToTPackage_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ModelToTypeGraphImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getModelToTypeGraph()
		 * @generated
		 */
		EClass MODEL_TO_TYPE_GRAPH = eINSTANCE.getModelToTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TO_TYPE_GRAPH__SOURCE = eINSTANCE.getModelToTypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TO_TYPE_GRAPH__TARGET = eINSTANCE.getModelToTypeGraph_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldImpl <em>Field Declaration To TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldDeclarationToTField()
		 * @generated
		 */
		EClass FIELD_DECLARATION_TO_TFIELD = eINSTANCE.getFieldDeclarationToTField();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION_TO_TFIELD__TARGET = eINSTANCE.getFieldDeclarationToTField_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION_TO_TFIELD__SOURCE = eINSTANCE.getFieldDeclarationToTField_Source();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET = eINSTANCE
				.getVariableDeclarationFragmentToTFieldDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodSignatureImpl <em>Method Declaration To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethodSignature()
		 * @generated
		 */
		EClass METHOD_DECLARATION_TO_TMETHOD_SIGNATURE = eINSTANCE.getMethodDeclarationToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE
				.getMethodDeclarationToTMethodSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE
				.getMethodDeclarationToTMethodSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.StatementToTMethodDefinitionImpl <em>Statement To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.StatementToTMethodDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStatementToTMethodDefinition()
		 * @generated
		 */
		EClass STATEMENT_TO_TMETHOD_DEFINITION = eINSTANCE.getStatementToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE.getStatementToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE.getStatementToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AbstractMethodInvocationToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAbstractMethodInvocationToTAccess()
		 * @generated
		 */
		EClass ABSTRACT_METHOD_INVOCATION_TO_TACCESS = eINSTANCE.getAbstractMethodInvocationToTAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION_TO_TACCESS__SOURCE = eINSTANCE
				.getAbstractMethodInvocationToTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METHOD_INVOCATION_TO_TACCESS__TARGET = eINSTANCE
				.getAbstractMethodInvocationToTAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl <em>Type Access To TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeAccessToTFieldSignature()
		 * @generated
		 */
		EClass TYPE_ACCESS_TO_TFIELD_SIGNATURE = eINSTANCE.getTypeAccessToTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE = eINSTANCE.getTypeAccessToTFieldSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET = eINSTANCE.getTypeAccessToTFieldSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MDefinitionToTMemberImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTMember()
		 * @generated
		 */
		EClass MDEFINITION_TO_TMEMBER = eINSTANCE.getMDefinitionToTMember();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TMEMBER__SOURCE = eINSTANCE.getMDefinitionToTMember_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TMEMBER__TARGET = eINSTANCE.getMDefinitionToTMember_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.FieldAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldAccessToTAccess()
		 * @generated
		 */
		EClass FIELD_ACCESS_TO_TACCESS = eINSTANCE.getFieldAccessToTAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_TO_TACCESS__SOURCE = eINSTANCE.getFieldAccessToTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_TO_TACCESS__TARGET = eINSTANCE.getFieldAccessToTAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl <em>Primitive Type To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.PrimitiveTypeToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getPrimitiveTypeToTClass()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_TO_TCLASS = eINSTANCE.getPrimitiveTypeToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE_TO_TCLASS__SOURCE = eINSTANCE.getPrimitiveTypeToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE_TO_TCLASS__TARGET = eINSTANCE.getPrimitiveTypeToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AnonymousClassDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnonymousClassDeclarationToTClass()
		 * @generated
		 */
		EClass ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = eINSTANCE.getAnonymousClassDeclarationToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__SOURCE = eINSTANCE
				.getAnonymousClassDeclarationToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__TARGET = eINSTANCE
				.getAnonymousClassDeclarationToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MMethodNameToTMethodImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodNameToTMethod()
		 * @generated
		 */
		EClass MMETHOD_NAME_TO_TMETHOD = eINSTANCE.getMMethodNameToTMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME_TO_TMETHOD__SOURCE = eINSTANCE.getMMethodNameToTMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME_TO_TMETHOD__TARGET = eINSTANCE.getMMethodNameToTMethod_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MMethodSignatureToTMethodSignatureImpl <em>MMethod Signature To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MMethodSignatureToTMethodSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodSignatureToTMethodSignature()
		 * @generated
		 */
		EClass MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE = eINSTANCE.getMMethodSignatureToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE
				.getMMethodSignatureToTMethodSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE
				.getMMethodSignatureToTMethodSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MMethodSignatureToTParameterListImpl <em>MMethod Signature To TParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MMethodSignatureToTParameterListImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMMethodSignatureToTParameterList()
		 * @generated
		 */
		EClass MMETHOD_SIGNATURE_TO_TPARAMETER_LIST = eINSTANCE.getMMethodSignatureToTParameterList();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE_TO_TPARAMETER_LIST__SOURCE = eINSTANCE
				.getMMethodSignatureToTParameterList_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE_TO_TPARAMETER_LIST__TARGET = eINSTANCE
				.getMMethodSignatureToTParameterList_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MEntryToTParameterImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMEntryToTParameter()
		 * @generated
		 */
		EClass MENTRY_TO_TPARAMETER = eINSTANCE.getMEntryToTParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY_TO_TPARAMETER__SOURCE = eINSTANCE.getMEntryToTParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY_TO_TPARAMETER__TARGET = eINSTANCE.getMEntryToTParameter_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.BlockToTMethodDefinitionImpl <em>Block To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.BlockToTMethodDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBlockToTMethodDefinition()
		 * @generated
		 */
		EClass BLOCK_TO_TMETHOD_DEFINITION = eINSTANCE.getBlockToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE.getBlockToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE.getBlockToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodImpl <em>Method Declaration To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethod()
		 * @generated
		 */
		EClass METHOD_DECLARATION_TO_TMETHOD = eINSTANCE.getMethodDeclarationToTMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD__SOURCE = eINSTANCE.getMethodDeclarationToTMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD__TARGET = eINSTANCE.getMethodDeclarationToTMethod_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodDefinitionImpl <em>Method Declaration To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MethodDeclarationToTMethodDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMethodDeclarationToTMethodDefinition()
		 * @generated
		 */
		EClass METHOD_DECLARATION_TO_TMETHOD_DEFINITION = eINSTANCE.getMethodDeclarationToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE
				.getMethodDeclarationToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE
				.getMethodDeclarationToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.SingleVariableDeclarationToTParameterImpl <em>Single Variable Declaration To TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.SingleVariableDeclarationToTParameterImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getSingleVariableDeclarationToTParameter()
		 * @generated
		 */
		EClass SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER = eINSTANCE.getSingleVariableDeclarationToTParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER__SOURCE = eINSTANCE
				.getSingleVariableDeclarationToTParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER__TARGET = eINSTANCE
				.getSingleVariableDeclarationToTParameter_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MSignatureToTSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTSignature()
		 * @generated
		 */
		EClass MSIGNATURE_TO_TSIGNATURE = eINSTANCE.getMSignatureToTSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TSIGNATURE__SOURCE = eINSTANCE.getMSignatureToTSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TSIGNATURE__TARGET = eINSTANCE.getMSignatureToTSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MFieldSignatureToTFieldSignatureImpl <em>MField Signature To TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MFieldSignatureToTFieldSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldSignatureToTFieldSignature()
		 * @generated
		 */
		EClass MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE = eINSTANCE.getMFieldSignatureToTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE__SOURCE = eINSTANCE
				.getMFieldSignatureToTFieldSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE__TARGET = eINSTANCE
				.getMFieldSignatureToTFieldSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.BodyDeclarationToTAnnotatableImpl <em>Body Declaration To TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.BodyDeclarationToTAnnotatableImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getBodyDeclarationToTAnnotatable()
		 * @generated
		 */
		EClass BODY_DECLARATION_TO_TANNOTATABLE = eINSTANCE.getBodyDeclarationToTAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION_TO_TANNOTATABLE__SOURCE = eINSTANCE.getBodyDeclarationToTAnnotatable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION_TO_TANNOTATABLE__TARGET = eINSTANCE.getBodyDeclarationToTAnnotatable_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldSignatureImpl <em>Field Declaration To TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.FieldDeclarationToTFieldSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getFieldDeclarationToTFieldSignature()
		 * @generated
		 */
		EClass FIELD_DECLARATION_TO_TFIELD_SIGNATURE = eINSTANCE.getFieldDeclarationToTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION_TO_TFIELD_SIGNATURE__SOURCE = eINSTANCE
				.getFieldDeclarationToTFieldSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION_TO_TFIELD_SIGNATURE__TARGET = eINSTANCE
				.getFieldDeclarationToTFieldSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.TypeToTAbstractTypeImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeToTAbstractType()
		 * @generated
		 */
		EClass TYPE_TO_TABSTRACT_TYPE = eINSTANCE.getTypeToTAbstractType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TABSTRACT_TYPE__SOURCE = eINSTANCE.getTypeToTAbstractType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TO_TABSTRACT_TYPE__TARGET = eINSTANCE.getTypeToTAbstractType_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MFieldNameToTFieldImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMFieldNameToTField()
		 * @generated
		 */
		EClass MFIELD_NAME_TO_TFIELD = eINSTANCE.getMFieldNameToTField();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME_TO_TFIELD__SOURCE = eINSTANCE.getMFieldNameToTField_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME_TO_TFIELD__TARGET = eINSTANCE.getMFieldNameToTField_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.StatementToTMemberImpl <em>Statement To TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.StatementToTMemberImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getStatementToTMember()
		 * @generated
		 */
		EClass STATEMENT_TO_TMEMBER = eINSTANCE.getStatementToTMember();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TO_TMEMBER__TARGET = eINSTANCE.getStatementToTMember_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_TO_TMEMBER__SOURCE = eINSTANCE.getStatementToTMember_Source();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MSignatureToTMethodSignatureImpl <em>MSignature To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MSignatureToTMethodSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMSignatureToTMethodSignature()
		 * @generated
		 */
		EClass MSIGNATURE_TO_TMETHOD_SIGNATURE = eINSTANCE.getMSignatureToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE.getMSignatureToTMethodSignature_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE.getMSignatureToTMethodSignature_Source();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.MDefinitionToTSignatureImpl <em>MDefinition To TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.MDefinitionToTSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getMDefinitionToTSignature()
		 * @generated
		 */
		EClass MDEFINITION_TO_TSIGNATURE = eINSTANCE.getMDefinitionToTSignature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TSIGNATURE__TARGET = eINSTANCE.getMDefinitionToTSignature_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION_TO_TSIGNATURE__SOURCE = eINSTANCE.getMDefinitionToTSignature_Source();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.SingleVariableAccessToTAccessImpl <em>Single Variable Access To TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.SingleVariableAccessToTAccessImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getSingleVariableAccessToTAccess()
		 * @generated
		 */
		EClass SINGLE_VARIABLE_ACCESS_TO_TACCESS = eINSTANCE.getSingleVariableAccessToTAccess();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET = eINSTANCE.getSingleVariableAccessToTAccess_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE = eINSTANCE.getSingleVariableAccessToTAccess_Source();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodDefinitionImpl <em>Constructor Declaration To TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodDefinitionImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethodDefinition()
		 * @generated
		 */
		EClass CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION = eINSTANCE.getConstructorDeclarationToTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION__SOURCE = eINSTANCE
				.getConstructorDeclarationToTMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION__TARGET = eINSTANCE
				.getConstructorDeclarationToTMethodDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.AnnotationToTAnnotationImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getAnnotationToTAnnotation()
		 * @generated
		 */
		EClass ANNOTATION_TO_TANNOTATION = eINSTANCE.getAnnotationToTAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TO_TANNOTATION__SOURCE = eINSTANCE.getAnnotationToTAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TO_TANNOTATION__TARGET = eINSTANCE.getAnnotationToTAnnotation_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodImpl <em>Constructor Declaration To TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethod()
		 * @generated
		 */
		EClass CONSTRUCTOR_DECLARATION_TO_TMETHOD = eINSTANCE.getConstructorDeclarationToTMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD__SOURCE = eINSTANCE.getConstructorDeclarationToTMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD__TARGET = eINSTANCE.getConstructorDeclarationToTMethod_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodSignatureImpl <em>Constructor Declaration To TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.ConstructorDeclarationToTMethodSignatureImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getConstructorDeclarationToTMethodSignature()
		 * @generated
		 */
		EClass CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE = eINSTANCE.getConstructorDeclarationToTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE__SOURCE = eINSTANCE
				.getConstructorDeclarationToTMethodSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE__TARGET = eINSTANCE
				.getConstructorDeclarationToTMethodSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.TypeParameterToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getTypeParameterToTClass()
		 * @generated
		 */
		EClass TYPE_PARAMETER_TO_TCLASS = eINSTANCE.getTypeParameterToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER_TO_TCLASS__SOURCE = eINSTANCE.getTypeParameterToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER_TO_TCLASS__TARGET = eINSTANCE.getTypeParameterToTClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.impl.UnresolvedTypeDeclarationToTClassImpl
		 * @see org.gravity.tgg.modisco.impl.ModiscoPackageImpl#getUnresolvedTypeDeclarationToTClass()
		 * @generated
		 */
		EClass UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = eINSTANCE.getUnresolvedTypeDeclarationToTClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE = eINSTANCE
				.getUnresolvedTypeDeclarationToTClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET = eINSTANCE
				.getUnresolvedTypeDeclarationToTClass_Target();

	}

} //ModiscoPackage
