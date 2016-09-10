/**
 */
package org.gravity.tgg.modisco.preprocessing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.preprocessing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreprocessingFactoryImpl extends EFactoryImpl implements PreprocessingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PreprocessingFactory init() {
		try {
			PreprocessingFactory thePreprocessingFactory = (PreprocessingFactory) EPackage.Registry.INSTANCE
					.getEFactory(PreprocessingPackage.eNS_URI);
			if (thePreprocessingFactory != null) {
				return thePreprocessingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PreprocessingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingFactoryImpl() {
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
		case PreprocessingPackage.MO_DISCO_TGG_PREPROCESSING:
			return createMoDiscoTGGPreprocessing();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoDiscoTGGPreprocessing createMoDiscoTGGPreprocessing() {
		MoDiscoTGGPreprocessingImpl moDiscoTGGPreprocessing = new MoDiscoTGGPreprocessingImpl();
		return moDiscoTGGPreprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingPackage getPreprocessingPackage() {
		return (PreprocessingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PreprocessingPackage getPackage() {
		return PreprocessingPackage.eINSTANCE;
	}

} //PreprocessingFactoryImpl
