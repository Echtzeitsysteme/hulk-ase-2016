/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.gravity.typegraph.basic.BasicFactory
 * @model kind="package"
 * @generated
 */
public interface BasicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.typegraph.basic/model/Basic.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.typegraph.basic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicPackage eINSTANCE = org.gravity.typegraph.basic.impl.BasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TElementWithIdImpl <em>TElement With Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TElementWithIdImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTElementWithId()
	 * @generated
	 */
	int TELEMENT_WITH_ID = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_WITH_ID__ID = 0;

	/**
	 * The number of structural features of the '<em>TElement With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_WITH_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TElement With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_WITH_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAccessImpl <em>TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAccessImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAccess()
	 * @generated
	 */
	int TACCESS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__TTARGET = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TSource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS__TSOURCE = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAnnotatableImpl <em>TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAnnotatableImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotatable()
	 * @generated
	 */
	int TANNOTATABLE = 1;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE__TANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAnnotationImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotation()
	 * @generated
	 */
	int TANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__TANNOTATED = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__TYPE = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl <em>TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAbstractTypeImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractType()
	 * @generated
	 */
	int TABSTRACT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TANNOTATION = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__PG = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__PACKAGE = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__SIGNATURE = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__DEFINES = TELEMENT_WITH_ID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TLIB = TELEMENT_WITH_ID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE__TNAME = TELEMENT_WITH_ID_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_TYPE_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TClassImpl <em>TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TClassImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTClass()
	 * @generated
	 */
	int TCLASS = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__ID = TABSTRACT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TANNOTATION = TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PG = TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PACKAGE = TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__SIGNATURE = TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__DEFINES = TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TLIB = TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__TNAME = TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>Parent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__PARENT_CLASS = TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__CHILD_CLASSES = TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS__IMPLEMENTS = TABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_FEATURE_COUNT = TABSTRACT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_OPERATION_COUNT = TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldImpl <em>TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTField()
	 * @generated
	 */
	int TFIELD = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__SIGNATURES = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__PG = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD__TNAME = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMemberImpl <em>TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMemberImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMember()
	 * @generated
	 */
	int TMEMBER = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__TANNOTATION = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__DEFINED_BY = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__ACCESSED_BY = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER__TACCESSING = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMEMBER_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldDefinitionImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldDefinition()
	 * @generated
	 */
	int TFIELD_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__ID = TMEMBER__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__TANNOTATION = TMEMBER__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__DEFINED_BY = TMEMBER__DEFINED_BY;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__ACCESSED_BY = TMEMBER__ACCESSED_BY;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__TACCESSING = TMEMBER__TACCESSING;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__SIGNATURE = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hiding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDING = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hidden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION__HIDDEN_BY = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TSignatureImpl <em>TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TSignatureImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSignature()
	 * @generated
	 */
	int TSIGNATURE = 15;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__TANNOTATION = TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE__ID = TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_FEATURE_COUNT = TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNATURE_OPERATION_COUNT = TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TFieldSignatureImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldSignature()
	 * @generated
	 */
	int TFIELD_SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__TANNOTATION = TSIGNATURE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__ID = TSIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__DEFINITIONS = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__FIELD = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE__TYPE = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFIELD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodImpl <em>TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethod()
	 * @generated
	 */
	int TMETHOD = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__PG = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__SIGNATURES = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD__TNAME = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodDefinitionImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodDefinition()
	 * @generated
	 */
	int TMETHOD_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__ID = TMEMBER__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__TANNOTATION = TMEMBER__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__DEFINED_BY = TMEMBER__DEFINED_BY;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__ACCESSED_BY = TMEMBER__ACCESSED_BY;

	/**
	 * The feature id for the '<em><b>TAccessing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__TACCESSING = TMEMBER__TACCESSING;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__SIGNATURE = TMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDING = TMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overridden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERRIDDEN_BY = TMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overloading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADING = TMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overloaded By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__OVERLOADED_BY = TMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION__RETURN_TYPE = TMEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_FEATURE_COUNT = TMEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_DEFINITION_OPERATION_COUNT = TMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TMethodSignatureImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodSignature()
	 * @generated
	 */
	int TMETHOD_SIGNATURE = 11;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__TANNOTATION = TSIGNATURE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__ID = TSIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__METHOD = TSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__PARAM_LIST = TSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__DEFINITIONS = TSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE__RETURN_TYPE = TSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_FEATURE_COUNT = TSIGNATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMETHOD_SIGNATURE_OPERATION_COUNT = TSIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TPackageImpl <em>TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TPackageImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTPackage()
	 * @generated
	 */
	int TPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TANNOTATION = TANNOTATABLE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__ID = TANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PG = TANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__SUBPACKAGE = TANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__PARENT = TANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__CLASSES = TANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__INTERFACES = TANNOTATABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__OWNED_TYPES = TANNOTATABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TYPE_GRAPH = TANNOTATABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE__TNAME = TANNOTATABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_FEATURE_COUNT = TANNOTATABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKAGE_OPERATION_COUNT = TANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TParameterImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NEXT = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__PREVIOUS = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TParameterListImpl <em>TParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TParameterListImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameterList()
	 * @generated
	 */
	int TPARAMETER_LIST = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__ENTRIES = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST__FIRST = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_LIST_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TypeGraphImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__ID = TELEMENT_WITH_ID__ID;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__PACKAGES = TELEMENT_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__METHODS = TELEMENT_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__FIELDS = TELEMENT_WITH_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__CLASSES = TELEMENT_WITH_ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__INTERFACES = TELEMENT_WITH_ID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__OWNED_TYPES = TELEMENT_WITH_ID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TAnnotation Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TANNOTATION_TYPES = TELEMENT_WITH_ID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH__TNAME = TELEMENT_WITH_ID_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_FEATURE_COUNT = TELEMENT_WITH_ID_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GRAPH_OPERATION_COUNT = TELEMENT_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TInterfaceImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__ID = TABSTRACT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TANNOTATION = TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PG = TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PACKAGE = TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__SIGNATURE = TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__DEFINES = TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TLIB = TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__TNAME = TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__IMPLEMENTED_BY = TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__PARENT_INTERFACES = TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__CHILD_INTERFACES = TABSTRACT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = TABSTRACT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.impl.TAnnotationTypeImpl <em>TAnnotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.impl.TAnnotationTypeImpl
	 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotationType()
	 * @generated
	 */
	int TANNOTATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__ID = TABSTRACT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TANNOTATION = TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__PG = TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__PACKAGE = TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__SIGNATURE = TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__DEFINES = TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TLIB = TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TNAME = TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__ANNOTATIONS = TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TAnnotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE_FEATURE_COUNT = TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TAnnotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE_OPERATION_COUNT = TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAccess <em>TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess</em>'.
	 * @see org.gravity.typegraph.basic.TAccess
	 * @generated
	 */
	EClass getTAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAccess#getTTarget <em>TTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TTarget</em>'.
	 * @see org.gravity.typegraph.basic.TAccess#getTTarget()
	 * @see #getTAccess()
	 * @generated
	 */
	EReference getTAccess_TTarget();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TAccess#getTSource <em>TSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TSource</em>'.
	 * @see org.gravity.typegraph.basic.TAccess#getTSource()
	 * @see #getTAccess()
	 * @generated
	 */
	EReference getTAccess_TSource();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAnnotatable <em>TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotatable</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotatable
	 * @generated
	 */
	EClass getTAnnotatable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TAnnotatable#getTAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TAnnotation</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotatable#getTAnnotation()
	 * @see #getTAnnotatable()
	 * @generated
	 */
	EReference getTAnnotatable_TAnnotation();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotation
	 * @generated
	 */
	EClass getTAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TAnnotation#getTAnnotated <em>TAnnotated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TAnnotated</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotation#getTAnnotated()
	 * @see #getTAnnotation()
	 * @generated
	 */
	EReference getTAnnotation_TAnnotated();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotation#getType()
	 * @see #getTAnnotation()
	 * @generated
	 */
	EReference getTAnnotation_Type();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass</em>'.
	 * @see org.gravity.typegraph.basic.TClass
	 * @generated
	 */
	EClass getTClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TClass#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getParentClass()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ParentClass();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Classes</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getChildClasses()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_ChildClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.gravity.typegraph.basic.TClass#getImplements()
	 * @see #getTClass()
	 * @generated
	 */
	EReference getTClass_Implements();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TElementWithId <em>TElement With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TElement With Id</em>'.
	 * @see org.gravity.typegraph.basic.TElementWithId
	 * @generated
	 */
	EClass getTElementWithId();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TElementWithId#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.gravity.typegraph.basic.TElementWithId#getID()
	 * @see #getTElementWithId()
	 * @generated
	 */
	EAttribute getTElementWithId_ID();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TField <em>TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField</em>'.
	 * @see org.gravity.typegraph.basic.TField
	 * @generated
	 */
	EClass getTField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TField#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see org.gravity.typegraph.basic.TField#getSignatures()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_Signatures();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TField#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TField#getPg()
	 * @see #getTField()
	 * @generated
	 */
	EReference getTField_Pg();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TField#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TField#getTName()
	 * @see #getTField()
	 * @generated
	 */
	EAttribute getTField_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TFieldDefinition <em>TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Definition</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition
	 * @generated
	 */
	EClass getTFieldDefinition();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TFieldDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Signature</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getSignature()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_Signature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiding <em>Hiding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hiding</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiding()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_Hiding();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy <em>Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden By</em>'.
	 * @see org.gravity.typegraph.basic.TFieldDefinition#getHiddenBy()
	 * @see #getTFieldDefinition()
	 * @generated
	 */
	EReference getTFieldDefinition_HiddenBy();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TFieldSignature <em>TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TField Signature</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature
	 * @generated
	 */
	EClass getTFieldSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TFieldSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getDefinitions()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Definitions();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TFieldSignature#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Field</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getField()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Field();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TFieldSignature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.TFieldSignature#getType()
	 * @see #getTFieldSignature()
	 * @generated
	 */
	EReference getTFieldSignature_Type();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMember <em>TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMember</em>'.
	 * @see org.gravity.typegraph.basic.TMember
	 * @generated
	 */
	EClass getTMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMember#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined By</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getDefinedBy()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_DefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMember#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed By</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getAccessedBy()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_AccessedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMember#getTAccessing <em>TAccessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TAccessing</em>'.
	 * @see org.gravity.typegraph.basic.TMember#getTAccessing()
	 * @see #getTMember()
	 * @generated
	 */
	EReference getTMember_TAccessing();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethod <em>TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod</em>'.
	 * @see org.gravity.typegraph.basic.TMethod
	 * @generated
	 */
	EClass getTMethod();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMethod#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TMethod#getPg()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Pg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMethod#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see org.gravity.typegraph.basic.TMethod#getSignatures()
	 * @see #getTMethod()
	 * @generated
	 */
	EReference getTMethod_Signatures();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TMethod#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TMethod#getTName()
	 * @see #getTMethod()
	 * @generated
	 */
	EAttribute getTMethod_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Definition</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition
	 * @generated
	 */
	EClass getTMethodDefinition();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMethodDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Signature</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSignature()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Signature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overriding</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriding()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overriding();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overridden By</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverriddenBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloading <em>Overloading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloading</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloading()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_Overloading();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overloaded By</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_OverloadedBy();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getReturnType()
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	EReference getTMethodDefinition_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TMethodSignature <em>TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMethod Signature</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature
	 * @generated
	 */
	EClass getTMethodSignature();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TMethodSignature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getMethod()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Method();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.typegraph.basic.TMethodSignature#getParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param List</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getParamList()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_ParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TMethodSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getDefinitions()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_Definitions();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TMethodSignature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.gravity.typegraph.basic.TMethodSignature#getReturnType()
	 * @see #getTMethodSignature()
	 * @generated
	 */
	EReference getTMethodSignature_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TPackage <em>TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPackage</em>'.
	 * @see org.gravity.typegraph.basic.TPackage
	 * @generated
	 */
	EClass getTPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TPackage#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getPg()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Pg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TPackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getSubpackage()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Subpackage();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getParent()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getClasses()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getInterfaces()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TPackage#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Types</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getOwnedTypes()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_OwnedTypes();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TPackage#getTypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Graph</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getTypeGraph()
	 * @see #getTPackage()
	 * @generated
	 */
	EReference getTPackage_TypeGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TPackage#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TPackage#getTName()
	 * @see #getTPackage()
	 * @generated
	 */
	EAttribute getTPackage_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see org.gravity.typegraph.basic.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getNext()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Next();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getPrevious()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Previous();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.TParameter#getType()
	 * @see #getTParameter()
	 * @generated
	 */
	EReference getTParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TParameterList <em>TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter List</em>'.
	 * @see org.gravity.typegraph.basic.TParameterList
	 * @generated
	 */
	EClass getTParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TParameterList#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.gravity.typegraph.basic.TParameterList#getEntries()
	 * @see #getTParameterList()
	 * @generated
	 */
	EReference getTParameterList_Entries();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TParameterList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.gravity.typegraph.basic.TParameterList#getFirst()
	 * @see #getTParameterList()
	 * @generated
	 */
	EReference getTParameterList_First();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TSignature <em>TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignature</em>'.
	 * @see org.gravity.typegraph.basic.TSignature
	 * @generated
	 */
	EClass getTSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Graph</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph
	 * @generated
	 */
	EClass getTypeGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getPackages()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getMethods()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getFields()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Fields();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getClasses()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getInterfaces()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.TypeGraph#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Types</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getOwnedTypes()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_OwnedTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TypeGraph#getTAnnotationTypes <em>TAnnotation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TAnnotation Types</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getTAnnotationTypes()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EReference getTypeGraph_TAnnotationTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TypeGraph#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TypeGraph#getTName()
	 * @see #getTypeGraph()
	 * @generated
	 */
	EAttribute getTypeGraph_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see org.gravity.typegraph.basic.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getImplementedBy()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ImplementedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getParentInterfaces <em>Parent Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getParentInterfaces()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ParentInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TInterface#getChildInterfaces <em>Child Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Interfaces</em>'.
	 * @see org.gravity.typegraph.basic.TInterface#getChildInterfaces()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_ChildInterfaces();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAbstractType <em>TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Type</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType
	 * @generated
	 */
	EClass getTAbstractType();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.TAbstractType#getPg <em>Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pg</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getPg()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Pg();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.TAbstractType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getPackage()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Package();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signature</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getSignature()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Signature();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAbstractType#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defines</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getDefines()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EReference getTAbstractType_Defines();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TAbstractType#isTLib <em>TLib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TLib</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#isTLib()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EAttribute getTAbstractType_TLib();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.TAbstractType#getTName <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TName</em>'.
	 * @see org.gravity.typegraph.basic.TAbstractType#getTName()
	 * @see #getTAbstractType()
	 * @generated
	 */
	EAttribute getTAbstractType_TName();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.TAnnotationType <em>TAnnotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation Type</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotationType
	 * @generated
	 */
	EClass getTAnnotationType();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.TAnnotationType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see org.gravity.typegraph.basic.TAnnotationType#getAnnotations()
	 * @see #getTAnnotationType()
	 * @generated
	 */
	EReference getTAnnotationType_Annotations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicFactory getBasicFactory();

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
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAccessImpl <em>TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAccessImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAccess()
		 * @generated
		 */
		EClass TACCESS = eINSTANCE.getTAccess();

		/**
		 * The meta object literal for the '<em><b>TTarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS__TTARGET = eINSTANCE.getTAccess_TTarget();

		/**
		 * The meta object literal for the '<em><b>TSource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACCESS__TSOURCE = eINSTANCE.getTAccess_TSource();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAnnotatableImpl <em>TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAnnotatableImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotatable()
		 * @generated
		 */
		EClass TANNOTATABLE = eINSTANCE.getTAnnotatable();

		/**
		 * The meta object literal for the '<em><b>TAnnotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATABLE__TANNOTATION = eINSTANCE.getTAnnotatable_TAnnotation();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAnnotationImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotation()
		 * @generated
		 */
		EClass TANNOTATION = eINSTANCE.getTAnnotation();

		/**
		 * The meta object literal for the '<em><b>TAnnotated</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION__TANNOTATED = eINSTANCE.getTAnnotation_TAnnotated();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION__TYPE = eINSTANCE.getTAnnotation_Type();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TClassImpl <em>TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TClassImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTClass()
		 * @generated
		 */
		EClass TCLASS = eINSTANCE.getTClass();

		/**
		 * The meta object literal for the '<em><b>Parent Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__PARENT_CLASS = eINSTANCE.getTClass_ParentClass();

		/**
		 * The meta object literal for the '<em><b>Child Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__CHILD_CLASSES = eINSTANCE.getTClass_ChildClasses();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS__IMPLEMENTS = eINSTANCE.getTClass_Implements();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TElementWithIdImpl <em>TElement With Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TElementWithIdImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTElementWithId()
		 * @generated
		 */
		EClass TELEMENT_WITH_ID = eINSTANCE.getTElementWithId();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEMENT_WITH_ID__ID = eINSTANCE.getTElementWithId_ID();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldImpl <em>TField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTField()
		 * @generated
		 */
		EClass TFIELD = eINSTANCE.getTField();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD__SIGNATURES = eINSTANCE.getTField_Signatures();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD__PG = eINSTANCE.getTField_Pg();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFIELD__TNAME = eINSTANCE.getTField_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldDefinitionImpl <em>TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldDefinitionImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldDefinition()
		 * @generated
		 */
		EClass TFIELD_DEFINITION = eINSTANCE.getTFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__SIGNATURE = eINSTANCE.getTFieldDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Hiding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDING = eINSTANCE.getTFieldDefinition_Hiding();

		/**
		 * The meta object literal for the '<em><b>Hidden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_DEFINITION__HIDDEN_BY = eINSTANCE.getTFieldDefinition_HiddenBy();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TFieldSignatureImpl <em>TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TFieldSignatureImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTFieldSignature()
		 * @generated
		 */
		EClass TFIELD_SIGNATURE = eINSTANCE.getTFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__DEFINITIONS = eINSTANCE.getTFieldSignature_Definitions();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__FIELD = eINSTANCE.getTFieldSignature_Field();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFIELD_SIGNATURE__TYPE = eINSTANCE.getTFieldSignature_Type();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMemberImpl <em>TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMemberImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMember()
		 * @generated
		 */
		EClass TMEMBER = eINSTANCE.getTMember();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__DEFINED_BY = eINSTANCE.getTMember_DefinedBy();

		/**
		 * The meta object literal for the '<em><b>Accessed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__ACCESSED_BY = eINSTANCE.getTMember_AccessedBy();

		/**
		 * The meta object literal for the '<em><b>TAccessing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMEMBER__TACCESSING = eINSTANCE.getTMember_TAccessing();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodImpl <em>TMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethod()
		 * @generated
		 */
		EClass TMETHOD = eINSTANCE.getTMethod();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD__PG = eINSTANCE.getTMethod_Pg();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD__SIGNATURES = eINSTANCE.getTMethod_Signatures();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMETHOD__TNAME = eINSTANCE.getTMethod_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodDefinitionImpl <em>TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodDefinitionImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodDefinition()
		 * @generated
		 */
		EClass TMETHOD_DEFINITION = eINSTANCE.getTMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__SIGNATURE = eINSTANCE.getTMethodDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Overriding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDING = eINSTANCE.getTMethodDefinition_Overriding();

		/**
		 * The meta object literal for the '<em><b>Overridden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERRIDDEN_BY = eINSTANCE.getTMethodDefinition_OverriddenBy();

		/**
		 * The meta object literal for the '<em><b>Overloading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADING = eINSTANCE.getTMethodDefinition_Overloading();

		/**
		 * The meta object literal for the '<em><b>Overloaded By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__OVERLOADED_BY = eINSTANCE.getTMethodDefinition_OverloadedBy();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_DEFINITION__RETURN_TYPE = eINSTANCE.getTMethodDefinition_ReturnType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl <em>TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TMethodSignatureImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTMethodSignature()
		 * @generated
		 */
		EClass TMETHOD_SIGNATURE = eINSTANCE.getTMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__METHOD = eINSTANCE.getTMethodSignature_Method();

		/**
		 * The meta object literal for the '<em><b>Param List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__PARAM_LIST = eINSTANCE.getTMethodSignature_ParamList();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__DEFINITIONS = eINSTANCE.getTMethodSignature_Definitions();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMETHOD_SIGNATURE__RETURN_TYPE = eINSTANCE.getTMethodSignature_ReturnType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TPackageImpl <em>TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TPackageImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTPackage()
		 * @generated
		 */
		EClass TPACKAGE = eINSTANCE.getTPackage();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__PG = eINSTANCE.getTPackage_Pg();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__SUBPACKAGE = eINSTANCE.getTPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__PARENT = eINSTANCE.getTPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__CLASSES = eINSTANCE.getTPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__INTERFACES = eINSTANCE.getTPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__OWNED_TYPES = eINSTANCE.getTPackage_OwnedTypes();

		/**
		 * The meta object literal for the '<em><b>Type Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKAGE__TYPE_GRAPH = eINSTANCE.getTPackage_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKAGE__TNAME = eINSTANCE.getTPackage_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TParameterImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__NEXT = eINSTANCE.getTParameter_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__PREVIOUS = eINSTANCE.getTParameter_Previous();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TParameterListImpl <em>TParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TParameterListImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTParameterList()
		 * @generated
		 */
		EClass TPARAMETER_LIST = eINSTANCE.getTParameterList();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER_LIST__ENTRIES = eINSTANCE.getTParameterList_Entries();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER_LIST__FIRST = eINSTANCE.getTParameterList_First();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TSignatureImpl <em>TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TSignatureImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTSignature()
		 * @generated
		 */
		EClass TSIGNATURE = eINSTANCE.getTSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TypeGraphImpl <em>Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TypeGraphImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTypeGraph()
		 * @generated
		 */
		EClass TYPE_GRAPH = eINSTANCE.getTypeGraph();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__PACKAGES = eINSTANCE.getTypeGraph_Packages();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__METHODS = eINSTANCE.getTypeGraph_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__FIELDS = eINSTANCE.getTypeGraph_Fields();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__CLASSES = eINSTANCE.getTypeGraph_Classes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__INTERFACES = eINSTANCE.getTypeGraph_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__OWNED_TYPES = eINSTANCE.getTypeGraph_OwnedTypes();

		/**
		 * The meta object literal for the '<em><b>TAnnotation Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GRAPH__TANNOTATION_TYPES = eINSTANCE.getTypeGraph_TAnnotationTypes();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GRAPH__TNAME = eINSTANCE.getTypeGraph_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TInterfaceImpl <em>TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TInterfaceImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__IMPLEMENTED_BY = eINSTANCE.getTInterface_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Parent Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__PARENT_INTERFACES = eINSTANCE.getTInterface_ParentInterfaces();

		/**
		 * The meta object literal for the '<em><b>Child Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__CHILD_INTERFACES = eINSTANCE.getTInterface_ChildInterfaces();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl <em>TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAbstractTypeImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAbstractType()
		 * @generated
		 */
		EClass TABSTRACT_TYPE = eINSTANCE.getTAbstractType();

		/**
		 * The meta object literal for the '<em><b>Pg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__PG = eINSTANCE.getTAbstractType_Pg();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__PACKAGE = eINSTANCE.getTAbstractType_Package();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__SIGNATURE = eINSTANCE.getTAbstractType_Signature();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABSTRACT_TYPE__DEFINES = eINSTANCE.getTAbstractType_Defines();

		/**
		 * The meta object literal for the '<em><b>TLib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABSTRACT_TYPE__TLIB = eINSTANCE.getTAbstractType_TLib();

		/**
		 * The meta object literal for the '<em><b>TName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABSTRACT_TYPE__TNAME = eINSTANCE.getTAbstractType_TName();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.impl.TAnnotationTypeImpl <em>TAnnotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.impl.TAnnotationTypeImpl
		 * @see org.gravity.typegraph.basic.impl.BasicPackageImpl#getTAnnotationType()
		 * @generated
		 */
		EClass TANNOTATION_TYPE = eINSTANCE.getTAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION_TYPE__ANNOTATIONS = eINSTANCE.getTAnnotationType_Annotations();

	}

} //BasicPackage
