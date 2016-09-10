/**
 */
package org.gravity.tgg.modisco.preprocessing;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mo Disco TGG Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.preprocessing.PreprocessingPackage#getMoDiscoTGGPreprocessing()
 * @model
 * @generated
 */
public interface MoDiscoTGGPreprocessing extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean createParamList(MMethodDefinition mDef, MMethodSignature mSig);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean fixStaticMethodCallOnField(MGravityModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Type getMostGenericReturnType(MMethodDefinition method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isParamListEqual(MMethodDefinition mDef, MMethodSignature mSig);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSuperType(Type type, Type supertype);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean preprocess(MGravityModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean preprocessFields(MGravityModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean preprocessInv(MGravityModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean preprocessMethods(MGravityModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean updateName(MName mName, MDefinition mDef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean preprocessAccesses(MGravityModel model);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MoDiscoTGGPreprocessing
