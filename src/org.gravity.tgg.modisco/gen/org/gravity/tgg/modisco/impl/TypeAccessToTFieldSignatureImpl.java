/**
 */
package org.gravity.tgg.modisco.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.java.TypeAccess;

import org.gravity.tgg.modisco.ModiscoPackage;
import org.gravity.tgg.modisco.TypeAccessToTFieldSignature;

import org.gravity.typegraph.basic.TFieldSignature;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Access To TField Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.impl.TypeAccessToTFieldSignatureImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAccessToTFieldSignatureImpl extends AbstractCorrespondenceImpl implements TypeAccessToTFieldSignature {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccessToTFieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.TYPE_ACCESS_TO_TFIELD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (TypeAccess) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TypeAccess newSource) {
		TypeAccess oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TFieldSignature) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TFieldSignature newTarget) {
		TFieldSignature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE:
			setSource((TypeAccess) newValue);
			return;
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET:
			setTarget((TFieldSignature) newValue);
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
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE:
			setSource((TypeAccess) null);
			return;
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET:
			setTarget((TFieldSignature) null);
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
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__SOURCE:
			return source != null;
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccessToTFieldSignatureImpl
