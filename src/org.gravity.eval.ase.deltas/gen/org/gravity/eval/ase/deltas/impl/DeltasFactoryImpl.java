/**
 */
package org.gravity.eval.ase.deltas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.eval.ase.deltas.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltasFactoryImpl extends EFactoryImpl implements DeltasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeltasFactory init() {
		try {
			DeltasFactory theDeltasFactory = (DeltasFactory) EPackage.Registry.INSTANCE
					.getEFactory(DeltasPackage.eNS_URI);
			if (theDeltasFactory != null) {
				return theDeltasFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeltasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltasFactoryImpl() {
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
		case DeltasPackage.DELETE_METHOD:
			return createDeleteMethod();
		case DeltasPackage.RENAME_CLASS:
			return createRenameClass();
		case DeltasPackage.CREATE_METHOD:
			return createCreateMethod();
		case DeltasPackage.CREATE_CLASS:
			return createCreateClass();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMethod createDeleteMethod() {
		DeleteMethodImpl deleteMethod = new DeleteMethodImpl();
		return deleteMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameClass createRenameClass() {
		RenameClassImpl renameClass = new RenameClassImpl();
		return renameClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMethod createCreateMethod() {
		CreateMethodImpl createMethod = new CreateMethodImpl();
		return createMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateClass createCreateClass() {
		CreateClassImpl createClass = new CreateClassImpl();
		return createClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltasPackage getDeltasPackage() {
		return (DeltasPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeltasPackage getPackage() {
		return DeltasPackage.eINSTANCE;
	}

} //DeltasFactoryImpl
