/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.ModiscoPackage;

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
	private EClass mAbstractMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConstructorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGravityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldSignatureEClass = null;

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
	 * @see org.gravity.modisco.ModiscoPackage#eNS_URI
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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
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
		JavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModiscoPackage.createPackageContents();

		// Initialize created meta-data
		theModiscoPackage.initializePackageContents();

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
	public EClass getMAbstractMethodDefinition() {
		return mAbstractMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMConstructorDefinition() {
		return mConstructorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMConstructorDefinition_Model() {
		return (EReference) mConstructorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDefinition() {
		return mDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_AbstractMethodInvocations() {
		return (EReference) mDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_MAbstractFieldAccess() {
		return (EReference) mDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodSignature() {
		return mMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_Model() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_MMethodName() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_ReturnType() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_MMethodDefinitions() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_MFirstEntry() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_MEntrys() {
		return (EReference) mMethodSignatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMName() {
		return mNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMName_MSignatures() {
		return (EReference) mNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMName_MName() {
		return (EAttribute) mNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodName() {
		return mMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodName_Model() {
		return (EReference) mMethodNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodName_MMethodDefinitions() {
		return (EReference) mMethodNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodName_MMethodSignatures() {
		return (EReference) mMethodNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldName() {
		return mFieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldName_Model() {
		return (EReference) mFieldNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldName_MFieldSignatures() {
		return (EReference) mFieldNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldName_MFieldDefinitions() {
		return (EReference) mFieldNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldDefinition() {
		return mFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldDefinition_MFieldSignature() {
		return (EReference) mFieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldDefinition_MFieldName() {
		return (EReference) mFieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldDefinition_Model() {
		return (EReference) mFieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodDefinition() {
		return mMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodDefinition_MMethodName() {
		return (EReference) mMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodDefinition_MMethodSignature() {
		return (EReference) mMethodDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodDefinition_Model() {
		return (EReference) mMethodDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSignature() {
		return mSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignature_MDefinitions() {
		return (EReference) mSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEntry() {
		return mEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_MNext() {
		return (EReference) mEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_MPrevious() {
		return (EReference) mEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_Type() {
		return (EReference) mEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGravityModel() {
		return mGravityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MMethodDefinitions() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MFieldDefinitions() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MConstructorDefinitions() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_AnonymousClassDeclarations() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MMethodNames() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MNames() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MMethodSignatures() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MFieldSignatures() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MFieldNames() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MAbstractMethodDefinitions() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_TypeParameters() {
		return (EReference) mGravityModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldSignature() {
		return mFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignature_MFieldName() {
		return (EReference) mFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignature_Model() {
		return (EReference) mFieldSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignature_Type() {
		return (EReference) mFieldSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignature_MFieldDefinitions() {
		return (EReference) mFieldSignatureEClass.getEStructuralFeatures().get(3);
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
		mAbstractMethodDefinitionEClass = createEClass(MABSTRACT_METHOD_DEFINITION);

		mConstructorDefinitionEClass = createEClass(MCONSTRUCTOR_DEFINITION);
		createEReference(mConstructorDefinitionEClass, MCONSTRUCTOR_DEFINITION__MODEL);

		mDefinitionEClass = createEClass(MDEFINITION);
		createEReference(mDefinitionEClass, MDEFINITION__ABSTRACT_METHOD_INVOCATIONS);
		createEReference(mDefinitionEClass, MDEFINITION__MABSTRACT_FIELD_ACCESS);

		mMethodSignatureEClass = createEClass(MMETHOD_SIGNATURE);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__MODEL);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__MMETHOD_NAME);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__RETURN_TYPE);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__MFIRST_ENTRY);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__MENTRYS);

		mNameEClass = createEClass(MNAME);
		createEReference(mNameEClass, MNAME__MSIGNATURES);
		createEAttribute(mNameEClass, MNAME__MNAME);

		mMethodNameEClass = createEClass(MMETHOD_NAME);
		createEReference(mMethodNameEClass, MMETHOD_NAME__MODEL);
		createEReference(mMethodNameEClass, MMETHOD_NAME__MMETHOD_DEFINITIONS);
		createEReference(mMethodNameEClass, MMETHOD_NAME__MMETHOD_SIGNATURES);

		mFieldNameEClass = createEClass(MFIELD_NAME);
		createEReference(mFieldNameEClass, MFIELD_NAME__MODEL);
		createEReference(mFieldNameEClass, MFIELD_NAME__MFIELD_SIGNATURES);
		createEReference(mFieldNameEClass, MFIELD_NAME__MFIELD_DEFINITIONS);

		mFieldDefinitionEClass = createEClass(MFIELD_DEFINITION);
		createEReference(mFieldDefinitionEClass, MFIELD_DEFINITION__MFIELD_SIGNATURE);
		createEReference(mFieldDefinitionEClass, MFIELD_DEFINITION__MFIELD_NAME);
		createEReference(mFieldDefinitionEClass, MFIELD_DEFINITION__MODEL);

		mMethodDefinitionEClass = createEClass(MMETHOD_DEFINITION);
		createEReference(mMethodDefinitionEClass, MMETHOD_DEFINITION__MMETHOD_NAME);
		createEReference(mMethodDefinitionEClass, MMETHOD_DEFINITION__MMETHOD_SIGNATURE);
		createEReference(mMethodDefinitionEClass, MMETHOD_DEFINITION__MODEL);

		mSignatureEClass = createEClass(MSIGNATURE);
		createEReference(mSignatureEClass, MSIGNATURE__MDEFINITIONS);

		mEntryEClass = createEClass(MENTRY);
		createEReference(mEntryEClass, MENTRY__MNEXT);
		createEReference(mEntryEClass, MENTRY__MPREVIOUS);
		createEReference(mEntryEClass, MENTRY__TYPE);

		mGravityModelEClass = createEClass(MGRAVITY_MODEL);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MMETHOD_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MFIELD_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MMETHOD_NAMES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MNAMES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MMETHOD_SIGNATURES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MFIELD_SIGNATURES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MFIELD_NAMES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__TYPE_PARAMETERS);

		mFieldSignatureEClass = createEClass(MFIELD_SIGNATURE);
		createEReference(mFieldSignatureEClass, MFIELD_SIGNATURE__MFIELD_NAME);
		createEReference(mFieldSignatureEClass, MFIELD_SIGNATURE__MODEL);
		createEReference(mFieldSignatureEClass, MFIELD_SIGNATURE__TYPE);
		createEReference(mFieldSignatureEClass, MFIELD_SIGNATURE__MFIELD_DEFINITIONS);
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
		JavaPackage theJavaPackage = (JavaPackage) EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mAbstractMethodDefinitionEClass.getESuperTypes().add(this.getMDefinition());
		mAbstractMethodDefinitionEClass.getESuperTypes().add(theJavaPackage.getAbstractMethodDeclaration());
		mConstructorDefinitionEClass.getESuperTypes().add(this.getMAbstractMethodDefinition());
		mConstructorDefinitionEClass.getESuperTypes().add(theJavaPackage.getConstructorDeclaration());
		mDefinitionEClass.getESuperTypes().add(theJavaPackage.getBodyDeclaration());
		mMethodSignatureEClass.getESuperTypes().add(this.getMSignature());
		mMethodNameEClass.getESuperTypes().add(this.getMName());
		mFieldNameEClass.getESuperTypes().add(this.getMName());
		mFieldDefinitionEClass.getESuperTypes().add(this.getMDefinition());
		mFieldDefinitionEClass.getESuperTypes().add(theJavaPackage.getFieldDeclaration());
		mMethodDefinitionEClass.getESuperTypes().add(theJavaPackage.getMethodDeclaration());
		mMethodDefinitionEClass.getESuperTypes().add(this.getMAbstractMethodDefinition());
		mGravityModelEClass.getESuperTypes().add(theJavaPackage.getModel());
		mFieldSignatureEClass.getESuperTypes().add(this.getMSignature());

		// Initialize classes, features, and operations; add parameters
		initEClass(mAbstractMethodDefinitionEClass, MAbstractMethodDefinition.class, "MAbstractMethodDefinition",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mConstructorDefinitionEClass, MConstructorDefinition.class, "MConstructorDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConstructorDefinition_Model(), this.getMGravityModel(),
				this.getMGravityModel_MConstructorDefinitions(), "model", null, 1, 1, MConstructorDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDefinitionEClass, MDefinition.class, "MDefinition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDefinition_AbstractMethodInvocations(), theJavaPackage.getAbstractMethodInvocation(), null,
				"abstractMethodInvocations", null, 0, -1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDefinition_MAbstractFieldAccess(), theJavaPackage.getSingleVariableAccess(), null,
				"mAbstractFieldAccess", null, 0, -1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMethodSignatureEClass, MMethodSignature.class, "MMethodSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodSignature_Model(), this.getMGravityModel(), this.getMGravityModel_MMethodSignatures(),
				"model", null, 1, 1, MMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodSignature_MMethodName(), this.getMMethodName(),
				this.getMMethodName_MMethodSignatures(), "mMethodName", null, 1, 1, MMethodSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodSignature_ReturnType(), theJavaPackage.getType(), null, "returnType", null, 0, 1,
				MMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodSignature_MMethodDefinitions(), this.getMMethodDefinition(),
				this.getMMethodDefinition_MMethodSignature(), "mMethodDefinitions", null, 0, -1, MMethodSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodSignature_MFirstEntry(), this.getMEntry(), null, "mFirstEntry", null, 0, 1,
				MMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodSignature_MEntrys(), this.getMEntry(), null, "mEntrys", null, 0, -1,
				MMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mNameEClass, MName.class, "MName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMName_MSignatures(), this.getMSignature(), null, "mSignatures", null, 0, -1, MName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMName_MName(), ecorePackage.getEString(), "mName", null, 1, 1, MName.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mMethodNameEClass, MMethodName.class, "MMethodName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodName_Model(), this.getMGravityModel(), this.getMGravityModel_MMethodNames(), "model",
				null, 1, 1, MMethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodName_MMethodDefinitions(), this.getMMethodDefinition(),
				this.getMMethodDefinition_MMethodName(), "mMethodDefinitions", null, 0, -1, MMethodName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodName_MMethodSignatures(), this.getMMethodSignature(),
				this.getMMethodSignature_MMethodName(), "mMethodSignatures", null, 0, -1, MMethodName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFieldNameEClass, MFieldName.class, "MFieldName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFieldName_Model(), this.getMGravityModel(), this.getMGravityModel_MFieldNames(), "model",
				null, 1, 1, MFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldName_MFieldSignatures(), this.getMFieldSignature(),
				this.getMFieldSignature_MFieldName(), "mFieldSignatures", null, 0, -1, MFieldName.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMFieldName_MFieldDefinitions(), this.getMFieldDefinition(),
				this.getMFieldDefinition_MFieldName(), "mFieldDefinitions", null, 0, -1, MFieldName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFieldDefinitionEClass, MFieldDefinition.class, "MFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFieldDefinition_MFieldSignature(), this.getMFieldSignature(),
				this.getMFieldSignature_MFieldDefinitions(), "mFieldSignature", null, 0, 1, MFieldDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldDefinition_MFieldName(), this.getMFieldName(), this.getMFieldName_MFieldDefinitions(),
				"mFieldName", null, 1, 1, MFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldDefinition_Model(), this.getMGravityModel(), this.getMGravityModel_MFieldDefinitions(),
				"model", null, 1, 1, MFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMethodDefinitionEClass, MMethodDefinition.class, "MMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodDefinition_MMethodName(), this.getMMethodName(),
				this.getMMethodName_MMethodDefinitions(), "mMethodName", null, 1, 1, MMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodDefinition_MMethodSignature(), this.getMMethodSignature(),
				this.getMMethodSignature_MMethodDefinitions(), "mMethodSignature", null, 0, 1, MMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMethodDefinition_Model(), this.getMGravityModel(),
				this.getMGravityModel_MMethodDefinitions(), "model", null, 1, 1, MMethodDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mSignatureEClass, MSignature.class, "MSignature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSignature_MDefinitions(), this.getMDefinition(), null, "mDefinitions", null, 0, -1,
				MSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEntryEClass, MEntry.class, "MEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEntry_MNext(), this.getMEntry(), this.getMEntry_MPrevious(), "mNext", null, 0, 1,
				MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEntry_MPrevious(), this.getMEntry(), this.getMEntry_MNext(), "mPrevious", null, 0, 1,
				MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEntry_Type(), theJavaPackage.getType(), null, "type", null, 0, 1, MEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mGravityModelEClass, MGravityModel.class, "MGravityModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMGravityModel_MMethodDefinitions(), this.getMMethodDefinition(),
				this.getMMethodDefinition_Model(), "mMethodDefinitions", null, 0, -1, MGravityModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MFieldDefinitions(), this.getMFieldDefinition(),
				this.getMFieldDefinition_Model(), "mFieldDefinitions", null, 0, -1, MGravityModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMGravityModel_MConstructorDefinitions(), this.getMConstructorDefinition(),
				this.getMConstructorDefinition_Model(), "mConstructorDefinitions", null, 0, -1, MGravityModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_AnonymousClassDeclarations(), theJavaPackage.getAnonymousClassDeclaration(),
				null, "anonymousClassDeclarations", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MMethodNames(), this.getMMethodName(), this.getMMethodName_Model(),
				"mMethodNames", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MNames(), this.getMName(), null, "mNames", null, 0, -1, MGravityModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MMethodSignatures(), this.getMMethodSignature(),
				this.getMMethodSignature_Model(), "mMethodSignatures", null, 0, -1, MGravityModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMGravityModel_MFieldSignatures(), this.getMFieldSignature(), this.getMFieldSignature_Model(),
				"mFieldSignatures", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MFieldNames(), this.getMFieldName(), this.getMFieldName_Model(), "mFieldNames",
				null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MAbstractMethodDefinitions(), this.getMAbstractMethodDefinition(), null,
				"mAbstractMethodDefinitions", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_TypeParameters(), theJavaPackage.getTypeParameter(), null, "typeParameters",
				null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFieldSignatureEClass, MFieldSignature.class, "MFieldSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFieldSignature_MFieldName(), this.getMFieldName(), this.getMFieldName_MFieldSignatures(),
				"mFieldName", null, 1, 1, MFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldSignature_Model(), this.getMGravityModel(), this.getMGravityModel_MFieldSignatures(),
				"model", null, 1, 1, MFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldSignature_Type(), theJavaPackage.getType(), null, "type", null, 0, 1,
				MFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFieldSignature_MFieldDefinitions(), this.getMFieldDefinition(),
				this.getMFieldDefinition_MFieldSignature(), "mFieldDefinitions", null, 0, -1, MFieldSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModiscoPackageImpl
