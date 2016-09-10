/**
 */
package org.gravity.eval.ase.deltas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import org.gravity.eval.ase.deltas.CreateClass;
import org.gravity.eval.ase.deltas.CreateMethod;
import org.gravity.eval.ase.deltas.DeleteMethod;
import org.gravity.eval.ase.deltas.Delta;
import org.gravity.eval.ase.deltas.DeltasFactory;
import org.gravity.eval.ase.deltas.DeltasPackage;
import org.gravity.eval.ase.deltas.RenameClass;

import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltasPackageImpl extends EPackageImpl implements DeltasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createClassEClass = null;

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
	 * @see org.gravity.eval.ase.deltas.DeltasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeltasPackageImpl() {
		super(eNS_URI, DeltasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeltasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeltasPackage init() {
		if (isInited)
			return (DeltasPackage) EPackage.Registry.INSTANCE.getEPackage(DeltasPackage.eNS_URI);

		// Obtain or create and register package
		DeltasPackageImpl theDeltasPackage = (DeltasPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DeltasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DeltasPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModiscoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDeltasPackage.createPackageContents();

		// Initialize created meta-data
		theDeltasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeltasPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeltasPackage.eNS_URI, theDeltasPackage);
		return theDeltasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelta() {
		return deltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelta__GetProjectName() {
		return deltaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelta__Perform__MGravityModel() {
		return deltaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteMethod() {
		return deleteMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeleteMethod__GetProjectName() {
		return deleteMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeleteMethod__Perform__MGravityModel() {
		return deleteMethodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameClass() {
		return renameClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRenameClass__GetProjectName() {
		return renameClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRenameClass__Perform__MGravityModel() {
		return renameClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRenameClass__Rename__ClassDeclaration() {
		return renameClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateMethod() {
		return createMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateMethod__GetProjectName() {
		return createMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateMethod__Perform__MGravityModel() {
		return createMethodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateClass() {
		return createClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateClass__GetProjectName() {
		return createClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateClass__Perform__MGravityModel() {
		return createClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltasFactory getDeltasFactory() {
		return (DeltasFactory) getEFactoryInstance();
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
		deltaEClass = createEClass(DELTA);
		createEOperation(deltaEClass, DELTA___GET_PROJECT_NAME);
		createEOperation(deltaEClass, DELTA___PERFORM__MGRAVITYMODEL);

		deleteMethodEClass = createEClass(DELETE_METHOD);
		createEOperation(deleteMethodEClass, DELETE_METHOD___GET_PROJECT_NAME);
		createEOperation(deleteMethodEClass, DELETE_METHOD___PERFORM__MGRAVITYMODEL);

		renameClassEClass = createEClass(RENAME_CLASS);
		createEOperation(renameClassEClass, RENAME_CLASS___GET_PROJECT_NAME);
		createEOperation(renameClassEClass, RENAME_CLASS___PERFORM__MGRAVITYMODEL);
		createEOperation(renameClassEClass, RENAME_CLASS___RENAME__CLASSDECLARATION);

		createMethodEClass = createEClass(CREATE_METHOD);
		createEOperation(createMethodEClass, CREATE_METHOD___GET_PROJECT_NAME);
		createEOperation(createMethodEClass, CREATE_METHOD___PERFORM__MGRAVITYMODEL);

		createClassEClass = createEClass(CREATE_CLASS);
		createEOperation(createClassEClass, CREATE_CLASS___GET_PROJECT_NAME);
		createEOperation(createClassEClass, CREATE_CLASS___PERFORM__MGRAVITYMODEL);
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
		ModiscoPackage theModiscoPackage = (ModiscoPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModiscoPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage) EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deleteMethodEClass.getESuperTypes().add(this.getDelta());
		renameClassEClass.getESuperTypes().add(this.getDelta());
		createMethodEClass.getESuperTypes().add(this.getDelta());
		createClassEClass.getESuperTypes().add(this.getDelta());

		// Initialize classes, features, and operations; add parameters
		initEClass(deltaEClass, Delta.class, "Delta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDelta__GetProjectName(), ecorePackage.getEString(), "getProjectName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		EOperation op = initEOperation(getDelta__Perform__MGravityModel(), null, "perform", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theModiscoPackage.getMGravityModel(), "modisco", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deleteMethodEClass, DeleteMethod.class, "DeleteMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDeleteMethod__GetProjectName(), ecorePackage.getEString(), "getProjectName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getDeleteMethod__Perform__MGravityModel(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModiscoPackage.getMGravityModel(), "modisco", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(renameClassEClass, RenameClass.class, "RenameClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRenameClass__GetProjectName(), ecorePackage.getEString(), "getProjectName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getRenameClass__Perform__MGravityModel(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModiscoPackage.getMGravityModel(), "modisco", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRenameClass__Rename__ClassDeclaration(), null, "rename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getClassDeclaration(), "mclass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createMethodEClass, CreateMethod.class, "CreateMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCreateMethod__GetProjectName(), ecorePackage.getEString(), "getProjectName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getCreateMethod__Perform__MGravityModel(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModiscoPackage.getMGravityModel(), "modisco", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createClassEClass, CreateClass.class, "CreateClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCreateClass__GetProjectName(), ecorePackage.getEString(), "getProjectName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getCreateClass__Perform__MGravityModel(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModiscoPackage.getMGravityModel(), "modisco", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeltasPackageImpl
