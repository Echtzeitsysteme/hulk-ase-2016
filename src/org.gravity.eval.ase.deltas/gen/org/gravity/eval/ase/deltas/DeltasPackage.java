/**
 */
package org.gravity.eval.ase.deltas;

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
 * @see org.gravity.eval.ase.deltas.DeltasFactory
 * @model kind="package"
 * @generated
 */
public interface DeltasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deltas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.eval.ase.deltas/model/Deltas.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.eval.ase.deltas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeltasPackage eINSTANCE = org.gravity.eval.ase.deltas.impl.DeltasPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.eval.ase.deltas.impl.DeltaImpl <em>Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.eval.ase.deltas.impl.DeltaImpl
	 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getDelta()
	 * @generated
	 */
	int DELTA = 0;

	/**
	 * The number of structural features of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA___GET_PROJECT_NAME = 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA___PERFORM__MGRAVITYMODEL = 1;

	/**
	 * The number of operations of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gravity.eval.ase.deltas.impl.DeleteMethodImpl <em>Delete Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.eval.ase.deltas.impl.DeleteMethodImpl
	 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getDeleteMethod()
	 * @generated
	 */
	int DELETE_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Delete Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD_FEATURE_COUNT = DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD___GET_PROJECT_NAME = DELTA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD___PERFORM__MGRAVITYMODEL = DELTA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD_OPERATION_COUNT = DELTA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.eval.ase.deltas.impl.RenameClassImpl <em>Rename Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.eval.ase.deltas.impl.RenameClassImpl
	 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getRenameClass()
	 * @generated
	 */
	int RENAME_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Rename Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS_FEATURE_COUNT = DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS___GET_PROJECT_NAME = DELTA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS___PERFORM__MGRAVITYMODEL = DELTA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Rename</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS___RENAME__CLASSDECLARATION = DELTA_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_CLASS_OPERATION_COUNT = DELTA_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.eval.ase.deltas.impl.CreateMethodImpl <em>Create Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.eval.ase.deltas.impl.CreateMethodImpl
	 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getCreateMethod()
	 * @generated
	 */
	int CREATE_METHOD = 3;

	/**
	 * The number of structural features of the '<em>Create Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD_FEATURE_COUNT = DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD___GET_PROJECT_NAME = DELTA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD___PERFORM__MGRAVITYMODEL = DELTA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD_OPERATION_COUNT = DELTA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.eval.ase.deltas.impl.CreateClassImpl <em>Create Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.eval.ase.deltas.impl.CreateClassImpl
	 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getCreateClass()
	 * @generated
	 */
	int CREATE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Create Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_FEATURE_COUNT = DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS___GET_PROJECT_NAME = DELTA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS___PERFORM__MGRAVITYMODEL = DELTA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_OPERATION_COUNT = DELTA_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.gravity.eval.ase.deltas.Delta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta</em>'.
	 * @see org.gravity.eval.ase.deltas.Delta
	 * @generated
	 */
	EClass getDelta();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.Delta#getProjectName() <em>Get Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project Name</em>' operation.
	 * @see org.gravity.eval.ase.deltas.Delta#getProjectName()
	 * @generated
	 */
	EOperation getDelta__GetProjectName();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.Delta#perform(org.gravity.modisco.MGravityModel) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see org.gravity.eval.ase.deltas.Delta#perform(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getDelta__Perform__MGravityModel();

	/**
	 * Returns the meta object for class '{@link org.gravity.eval.ase.deltas.DeleteMethod <em>Delete Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Method</em>'.
	 * @see org.gravity.eval.ase.deltas.DeleteMethod
	 * @generated
	 */
	EClass getDeleteMethod();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.DeleteMethod#getProjectName() <em>Get Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project Name</em>' operation.
	 * @see org.gravity.eval.ase.deltas.DeleteMethod#getProjectName()
	 * @generated
	 */
	EOperation getDeleteMethod__GetProjectName();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.DeleteMethod#perform(org.gravity.modisco.MGravityModel) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see org.gravity.eval.ase.deltas.DeleteMethod#perform(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getDeleteMethod__Perform__MGravityModel();

	/**
	 * Returns the meta object for class '{@link org.gravity.eval.ase.deltas.RenameClass <em>Rename Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Class</em>'.
	 * @see org.gravity.eval.ase.deltas.RenameClass
	 * @generated
	 */
	EClass getRenameClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.RenameClass#getProjectName() <em>Get Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project Name</em>' operation.
	 * @see org.gravity.eval.ase.deltas.RenameClass#getProjectName()
	 * @generated
	 */
	EOperation getRenameClass__GetProjectName();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.RenameClass#perform(org.gravity.modisco.MGravityModel) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see org.gravity.eval.ase.deltas.RenameClass#perform(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getRenameClass__Perform__MGravityModel();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.RenameClass#rename(org.eclipse.gmt.modisco.java.ClassDeclaration) <em>Rename</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rename</em>' operation.
	 * @see org.gravity.eval.ase.deltas.RenameClass#rename(org.eclipse.gmt.modisco.java.ClassDeclaration)
	 * @generated
	 */
	EOperation getRenameClass__Rename__ClassDeclaration();

	/**
	 * Returns the meta object for class '{@link org.gravity.eval.ase.deltas.CreateMethod <em>Create Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Method</em>'.
	 * @see org.gravity.eval.ase.deltas.CreateMethod
	 * @generated
	 */
	EClass getCreateMethod();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.CreateMethod#getProjectName() <em>Get Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project Name</em>' operation.
	 * @see org.gravity.eval.ase.deltas.CreateMethod#getProjectName()
	 * @generated
	 */
	EOperation getCreateMethod__GetProjectName();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.CreateMethod#perform(org.gravity.modisco.MGravityModel) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see org.gravity.eval.ase.deltas.CreateMethod#perform(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getCreateMethod__Perform__MGravityModel();

	/**
	 * Returns the meta object for class '{@link org.gravity.eval.ase.deltas.CreateClass <em>Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Class</em>'.
	 * @see org.gravity.eval.ase.deltas.CreateClass
	 * @generated
	 */
	EClass getCreateClass();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.CreateClass#getProjectName() <em>Get Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project Name</em>' operation.
	 * @see org.gravity.eval.ase.deltas.CreateClass#getProjectName()
	 * @generated
	 */
	EOperation getCreateClass__GetProjectName();

	/**
	 * Returns the meta object for the '{@link org.gravity.eval.ase.deltas.CreateClass#perform(org.gravity.modisco.MGravityModel) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see org.gravity.eval.ase.deltas.CreateClass#perform(org.gravity.modisco.MGravityModel)
	 * @generated
	 */
	EOperation getCreateClass__Perform__MGravityModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeltasFactory getDeltasFactory();

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
		 * The meta object literal for the '{@link org.gravity.eval.ase.deltas.impl.DeltaImpl <em>Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.eval.ase.deltas.impl.DeltaImpl
		 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getDelta()
		 * @generated
		 */
		EClass DELTA = eINSTANCE.getDelta();

		/**
		 * The meta object literal for the '<em><b>Get Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELTA___GET_PROJECT_NAME = eINSTANCE.getDelta__GetProjectName();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELTA___PERFORM__MGRAVITYMODEL = eINSTANCE.getDelta__Perform__MGravityModel();

		/**
		 * The meta object literal for the '{@link org.gravity.eval.ase.deltas.impl.DeleteMethodImpl <em>Delete Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.eval.ase.deltas.impl.DeleteMethodImpl
		 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getDeleteMethod()
		 * @generated
		 */
		EClass DELETE_METHOD = eINSTANCE.getDeleteMethod();

		/**
		 * The meta object literal for the '<em><b>Get Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELETE_METHOD___GET_PROJECT_NAME = eINSTANCE.getDeleteMethod__GetProjectName();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELETE_METHOD___PERFORM__MGRAVITYMODEL = eINSTANCE.getDeleteMethod__Perform__MGravityModel();

		/**
		 * The meta object literal for the '{@link org.gravity.eval.ase.deltas.impl.RenameClassImpl <em>Rename Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.eval.ase.deltas.impl.RenameClassImpl
		 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getRenameClass()
		 * @generated
		 */
		EClass RENAME_CLASS = eINSTANCE.getRenameClass();

		/**
		 * The meta object literal for the '<em><b>Get Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENAME_CLASS___GET_PROJECT_NAME = eINSTANCE.getRenameClass__GetProjectName();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENAME_CLASS___PERFORM__MGRAVITYMODEL = eINSTANCE.getRenameClass__Perform__MGravityModel();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENAME_CLASS___RENAME__CLASSDECLARATION = eINSTANCE.getRenameClass__Rename__ClassDeclaration();

		/**
		 * The meta object literal for the '{@link org.gravity.eval.ase.deltas.impl.CreateMethodImpl <em>Create Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.eval.ase.deltas.impl.CreateMethodImpl
		 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getCreateMethod()
		 * @generated
		 */
		EClass CREATE_METHOD = eINSTANCE.getCreateMethod();

		/**
		 * The meta object literal for the '<em><b>Get Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_METHOD___GET_PROJECT_NAME = eINSTANCE.getCreateMethod__GetProjectName();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_METHOD___PERFORM__MGRAVITYMODEL = eINSTANCE.getCreateMethod__Perform__MGravityModel();

		/**
		 * The meta object literal for the '{@link org.gravity.eval.ase.deltas.impl.CreateClassImpl <em>Create Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.eval.ase.deltas.impl.CreateClassImpl
		 * @see org.gravity.eval.ase.deltas.impl.DeltasPackageImpl#getCreateClass()
		 * @generated
		 */
		EClass CREATE_CLASS = eINSTANCE.getCreateClass();

		/**
		 * The meta object literal for the '<em><b>Get Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_CLASS___GET_PROJECT_NAME = eINSTANCE.getCreateClass__GetProjectName();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_CLASS___PERFORM__MGRAVITYMODEL = eINSTANCE.getCreateClass__Perform__MGravityModel();

	}

} //DeltasPackage
