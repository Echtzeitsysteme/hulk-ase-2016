/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;

import org.eclipse.gmt.modisco.java.emf.impl.BodyDeclarationImpl;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.ModiscoPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MDefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getAbstractMethodInvocations <em>Abstract Method Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MDefinitionImpl#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MDefinitionImpl extends BodyDeclarationImpl implements MDefinition {
	/**
	 * The cached value of the '{@link #getAbstractMethodInvocations() <em>Abstract Method Invocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation> abstractMethodInvocations;

	/**
	 * The cached value of the '{@link #getMAbstractFieldAccess() <em>MAbstract Field Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAbstractFieldAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess> mAbstractFieldAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMethodInvocation> getAbstractMethodInvocations() {
		if (abstractMethodInvocations == null) {
			abstractMethodInvocations = new EObjectResolvingEList<AbstractMethodInvocation>(
					AbstractMethodInvocation.class, this, ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS);
		}
		return abstractMethodInvocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableAccess> getMAbstractFieldAccess() {
		if (mAbstractFieldAccess == null) {
			mAbstractFieldAccess = new EObjectResolvingEList<SingleVariableAccess>(SingleVariableAccess.class, this,
					ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS);
		}
		return mAbstractFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			return getAbstractMethodInvocations();
		case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
			return getMAbstractFieldAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			getAbstractMethodInvocations().clear();
			getAbstractMethodInvocations().addAll((Collection<? extends AbstractMethodInvocation>) newValue);
			return;
		case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
			getMAbstractFieldAccess().clear();
			getMAbstractFieldAccess().addAll((Collection<? extends SingleVariableAccess>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			getAbstractMethodInvocations().clear();
			return;
		case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
			getMAbstractFieldAccess().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			return abstractMethodInvocations != null && !abstractMethodInvocations.isEmpty();
		case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
			return mAbstractFieldAccess != null && !mAbstractFieldAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MDefinitionImpl
