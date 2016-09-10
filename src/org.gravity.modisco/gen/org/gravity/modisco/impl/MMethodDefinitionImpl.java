/**
 */
package org.gravity.modisco.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;

import org.eclipse.gmt.modisco.java.emf.impl.MethodDeclarationImpl;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.ModiscoPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getAbstractMethodInvocations <em>Abstract Method Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMMethodName <em>MMethod Name</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getMMethodSignature <em>MMethod Signature</em>}</li>
 *   <li>{@link org.gravity.modisco.impl.MMethodDefinitionImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMethodDefinitionImpl extends MethodDeclarationImpl implements MMethodDefinition {
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
	 * The cached value of the '{@link #getMMethodName() <em>MMethod Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodName()
	 * @generated
	 * @ordered
	 */
	protected MMethodName mMethodName;

	/**
	 * The cached value of the '{@link #getMMethodSignature() <em>MMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected MMethodSignature mMethodSignature;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoPackage.Literals.MMETHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMethodInvocation> getAbstractMethodInvocations() {
		if (abstractMethodInvocations == null) {
			abstractMethodInvocations = new EObjectResolvingEList<AbstractMethodInvocation>(
					AbstractMethodInvocation.class, this,
					ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS);
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
					ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS);
		}
		return mAbstractFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName getMMethodName() {
		if (mMethodName != null && mMethodName.eIsProxy()) {
			InternalEObject oldMMethodName = (InternalEObject) mMethodName;
			mMethodName = (MMethodName) eResolveProxy(oldMMethodName);
			if (mMethodName != oldMMethodName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME, oldMMethodName, mMethodName));
			}
		}
		return mMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName basicGetMMethodName() {
		return mMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMethodName(MMethodName newMMethodName, NotificationChain msgs) {
		MMethodName oldMMethodName = mMethodName;
		mMethodName = newMMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME, oldMMethodName, newMMethodName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMMethodName(MMethodName newMMethodName) {
		if (newMMethodName != mMethodName) {
			NotificationChain msgs = null;
			if (mMethodName != null)
				msgs = ((InternalEObject) mMethodName).eInverseRemove(this,
						ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS, MMethodName.class, msgs);
			if (newMMethodName != null)
				msgs = ((InternalEObject) newMMethodName).eInverseAdd(this,
						ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS, MMethodName.class, msgs);
			msgs = basicSetMMethodName(newMMethodName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME,
					newMMethodName, newMMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignature getMMethodSignature() {
		if (mMethodSignature != null && mMethodSignature.eIsProxy()) {
			InternalEObject oldMMethodSignature = (InternalEObject) mMethodSignature;
			mMethodSignature = (MMethodSignature) eResolveProxy(oldMMethodSignature);
			if (mMethodSignature != oldMMethodSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE, oldMMethodSignature,
							mMethodSignature));
			}
		}
		return mMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignature basicGetMMethodSignature() {
		return mMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMethodSignature(MMethodSignature newMMethodSignature, NotificationChain msgs) {
		MMethodSignature oldMMethodSignature = mMethodSignature;
		mMethodSignature = newMMethodSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE, oldMMethodSignature, newMMethodSignature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMMethodSignature(MMethodSignature newMMethodSignature) {
		if (newMMethodSignature != mMethodSignature) {
			NotificationChain msgs = null;
			if (mMethodSignature != null)
				msgs = ((InternalEObject) mMethodSignature).eInverseRemove(this,
						ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS, MMethodSignature.class, msgs);
			if (newMMethodSignature != null)
				msgs = ((InternalEObject) newMMethodSignature).eInverseAdd(this,
						ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS, MMethodSignature.class, msgs);
			msgs = basicSetMMethodSignature(newMMethodSignature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE,
					newMMethodSignature, newMMethodSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (MGravityModel) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoPackage.MMETHOD_DEFINITION__MODEL,
							oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(MGravityModel newModel, NotificationChain msgs) {
		MGravityModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModiscoPackage.MMETHOD_DEFINITION__MODEL, oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(MGravityModel newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS, MGravityModel.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS, MGravityModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoPackage.MMETHOD_DEFINITION__MODEL, newModel,
					newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			if (mMethodName != null)
				msgs = ((InternalEObject) mMethodName).eInverseRemove(this,
						ModiscoPackage.MMETHOD_NAME__MMETHOD_DEFINITIONS, MMethodName.class, msgs);
			return basicSetMMethodName((MMethodName) otherEnd, msgs);
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			if (mMethodSignature != null)
				msgs = ((InternalEObject) mMethodSignature).eInverseRemove(this,
						ModiscoPackage.MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS, MMethodSignature.class, msgs);
			return basicSetMMethodSignature((MMethodSignature) otherEnd, msgs);
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						ModiscoPackage.MGRAVITY_MODEL__MMETHOD_DEFINITIONS, MGravityModel.class, msgs);
			return basicSetModel((MGravityModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			return basicSetMMethodName(null, msgs);
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			return basicSetMMethodSignature(null, msgs);
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			return getAbstractMethodInvocations();
		case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
			return getMAbstractFieldAccess();
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			if (resolve)
				return getMMethodName();
			return basicGetMMethodName();
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			if (resolve)
				return getMMethodSignature();
			return basicGetMMethodSignature();
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
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
		case ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			getAbstractMethodInvocations().clear();
			getAbstractMethodInvocations().addAll((Collection<? extends AbstractMethodInvocation>) newValue);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
			getMAbstractFieldAccess().clear();
			getMAbstractFieldAccess().addAll((Collection<? extends SingleVariableAccess>) newValue);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			setMMethodName((MMethodName) newValue);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			setMMethodSignature((MMethodSignature) newValue);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			setModel((MGravityModel) newValue);
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
		case ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			getAbstractMethodInvocations().clear();
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
			getMAbstractFieldAccess().clear();
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			setMMethodName((MMethodName) null);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			setMMethodSignature((MMethodSignature) null);
			return;
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			setModel((MGravityModel) null);
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
		case ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS:
			return abstractMethodInvocations != null && !abstractMethodInvocations.isEmpty();
		case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
			return mAbstractFieldAccess != null && !mAbstractFieldAccess.isEmpty();
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_NAME:
			return mMethodName != null;
		case ModiscoPackage.MMETHOD_DEFINITION__MMETHOD_SIGNATURE:
			return mMethodSignature != null;
		case ModiscoPackage.MMETHOD_DEFINITION__MODEL:
			return model != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MDefinition.class) {
			switch (derivedFeatureID) {
			case ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS:
				return ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS;
			case ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS:
				return ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS;
			default:
				return -1;
			}
		}
		if (baseClass == MAbstractMethodDefinition.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MDefinition.class) {
			switch (baseFeatureID) {
			case ModiscoPackage.MDEFINITION__ABSTRACT_METHOD_INVOCATIONS:
				return ModiscoPackage.MMETHOD_DEFINITION__ABSTRACT_METHOD_INVOCATIONS;
			case ModiscoPackage.MDEFINITION__MABSTRACT_FIELD_ACCESS:
				return ModiscoPackage.MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS;
			default:
				return -1;
			}
		}
		if (baseClass == MAbstractMethodDefinition.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MMethodDefinitionImpl
