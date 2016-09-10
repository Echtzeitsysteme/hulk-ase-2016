/**
 */
package org.gravity.tgg.modisco.preprocessing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gravity.tgg.modisco.preprocessing.PreprocessingFactory
 * @model kind="package"
 * @generated
 */
public interface PreprocessingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "preprocessing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore#//preprocessing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "preprocessing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PreprocessingPackage eINSTANCE = org.gravity.tgg.modisco.preprocessing.impl.PreprocessingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.modisco.preprocessing.impl.MoDiscoTGGPreprocessingImpl <em>Mo Disco TGG Preprocessing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.modisco.preprocessing.impl.MoDiscoTGGPreprocessingImpl
	 * @see org.gravity.tgg.modisco.preprocessing.impl.PreprocessingPackageImpl#getMoDiscoTGGPreprocessing()
	 * @generated
	 */
	int MO_DISCO_TGG_PREPROCESSING = 0;

	/**
	 * The number of structural features of the '<em>Mo Disco TGG Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Param List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___CREATE_PARAM_LIST__MMETHODDEFINITION_MMETHODSIGNATURE = 0;

	/**
	 * The operation id for the '<em>Fix Static Method Call On Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___FIX_STATIC_METHOD_CALL_ON_FIELD__MGRAVITYMODEL = 1;

	/**
	 * The operation id for the '<em>Get Most Generic Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___GET_MOST_GENERIC_RETURN_TYPE__MMETHODDEFINITION = 2;

	/**
	 * The operation id for the '<em>Is Param List Equal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___IS_PARAM_LIST_EQUAL__MMETHODDEFINITION_MMETHODSIGNATURE = 3;

	/**
	 * The operation id for the '<em>Is Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___IS_SUPER_TYPE__TYPE_TYPE = 4;

	/**
	 * The operation id for the '<em>Preprocess</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___PREPROCESS__MGRAVITYMODEL = 5;

	/**
	 * The operation id for the '<em>Preprocess Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___PREPROCESS_FIELDS__MGRAVITYMODEL = 6;

	/**
	 * The operation id for the '<em>Preprocess Inv</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___PREPROCESS_INV__MGRAVITYMODEL = 7;

	/**
	 * The operation id for the '<em>Preprocess Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___PREPROCESS_METHODS__MGRAVITYMODEL = 8;

	/**
	 * The operation id for the '<em>Update Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___UPDATE_NAME__MNAME_MDEFINITION = 9;

	/**
	 * The operation id for the '<em>Preprocess Accesses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING___PREPROCESS_ACCESSES__MGRAVITYMODEL = 10;

	/**
	 * The number of operations of the '<em>Mo Disco TGG Preprocessing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_TGG_PREPROCESSING_OPERATION_COUNT = 11;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing <em>Mo Disco TGG Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo Disco TGG Preprocessing</em>'.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing
	 * @generated
	 */
	EClass getMoDiscoTGGPreprocessing();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#createParamList(org.gravity.modisco.MMethodDefinition, org.gravity.modisco.MMethodSignature) <em>Create Param List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Param List</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#createParamList(org.gravity.modisco.MMethodDefinition, org.gravity.modisco.MMethodSignature)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__CreateParamList__MMethodDefinition_MMethodSignature();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#fixStaticMethodCallOnField(org.gravity.modisco.MGravityModel) <em>Fix Static Method Call On Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fix Static Method Call On Field</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#fixStaticMethodCallOnField(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__FixStaticMethodCallOnField__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#getMostGenericReturnType(org.gravity.modisco.MMethodDefinition) <em>Get Most Generic Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Most Generic Return Type</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#getMostGenericReturnType(org.gravity.modisco.MMethodDefinition)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__GetMostGenericReturnType__MMethodDefinition();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#isParamListEqual(org.gravity.modisco.MMethodDefinition, org.gravity.modisco.MMethodSignature) <em>Is Param List Equal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Param List Equal</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#isParamListEqual(org.gravity.modisco.MMethodDefinition, org.gravity.modisco.MMethodSignature)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__IsParamListEqual__MMethodDefinition_MMethodSignature();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#isSuperType(org.eclipse.gmt.modisco.java.Type, org.eclipse.gmt.modisco.java.Type) <em>Is Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#isSuperType(org.eclipse.gmt.modisco.java.Type, org.eclipse.gmt.modisco.java.Type)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__IsSuperType__Type_Type();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocess(org.gravity.modisco.MGravityModel) <em>Preprocess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preprocess</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocess(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__Preprocess__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessFields(org.gravity.modisco.MGravityModel) <em>Preprocess Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preprocess Fields</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessFields(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__PreprocessFields__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessInv(org.gravity.modisco.MGravityModel) <em>Preprocess Inv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preprocess Inv</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessInv(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__PreprocessInv__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessMethods(org.gravity.modisco.MGravityModel) <em>Preprocess Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preprocess Methods</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessMethods(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__PreprocessMethods__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#updateName(org.gravity.modisco.MName, org.gravity.modisco.MDefinition) <em>Update Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Name</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#updateName(org.gravity.modisco.MName, org.gravity.modisco.MDefinition)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__UpdateName__MName_MDefinition();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessAccesses(org.gravity.modisco.MGravityModel) <em>Preprocess Accesses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preprocess Accesses</em>' operation.
	 * @see org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing#preprocessAccesses(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getMoDiscoTGGPreprocessing__PreprocessAccesses__MGravityModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PreprocessingFactory getPreprocessingFactory();

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
		 * The meta object literal for the '{@link org.gravity.tgg.modisco.preprocessing.impl.MoDiscoTGGPreprocessingImpl <em>Mo Disco TGG Preprocessing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.modisco.preprocessing.impl.MoDiscoTGGPreprocessingImpl
		 * @see org.gravity.tgg.modisco.preprocessing.impl.PreprocessingPackageImpl#getMoDiscoTGGPreprocessing()
		 * @generated
		 */
		EClass MO_DISCO_TGG_PREPROCESSING = eINSTANCE.getMoDiscoTGGPreprocessing();

		/**
		 * The meta object literal for the '<em><b>Create Param List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___CREATE_PARAM_LIST__MMETHODDEFINITION_MMETHODSIGNATURE = eINSTANCE
				.getMoDiscoTGGPreprocessing__CreateParamList__MMethodDefinition_MMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Fix Static Method Call On Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___FIX_STATIC_METHOD_CALL_ON_FIELD__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__FixStaticMethodCallOnField__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Get Most Generic Return Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___GET_MOST_GENERIC_RETURN_TYPE__MMETHODDEFINITION = eINSTANCE
				.getMoDiscoTGGPreprocessing__GetMostGenericReturnType__MMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Param List Equal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___IS_PARAM_LIST_EQUAL__MMETHODDEFINITION_MMETHODSIGNATURE = eINSTANCE
				.getMoDiscoTGGPreprocessing__IsParamListEqual__MMethodDefinition_MMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Is Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___IS_SUPER_TYPE__TYPE_TYPE = eINSTANCE
				.getMoDiscoTGGPreprocessing__IsSuperType__Type_Type();

		/**
		 * The meta object literal for the '<em><b>Preprocess</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___PREPROCESS__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__Preprocess__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Preprocess Fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___PREPROCESS_FIELDS__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__PreprocessFields__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Preprocess Inv</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___PREPROCESS_INV__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__PreprocessInv__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Preprocess Methods</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___PREPROCESS_METHODS__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__PreprocessMethods__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Update Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___UPDATE_NAME__MNAME_MDEFINITION = eINSTANCE
				.getMoDiscoTGGPreprocessing__UpdateName__MName_MDefinition();

		/**
		 * The meta object literal for the '<em><b>Preprocess Accesses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MO_DISCO_TGG_PREPROCESSING___PREPROCESS_ACCESSES__MGRAVITYMODEL = eINSTANCE
				.getMoDiscoTGGPreprocessing__PreprocessAccesses__MGravityModel();

	}

} //PreprocessingPackage
