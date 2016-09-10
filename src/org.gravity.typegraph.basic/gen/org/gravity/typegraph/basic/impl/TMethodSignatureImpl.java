/**
 */
package org.gravity.typegraph.basic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameterList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TMethodSignatureImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMethodSignatureImpl extends TSignatureImpl implements TMethodSignature {
	/**
	 * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamList()
	 * @generated
	 * @ordered
	 */
	protected TParameterList paramList;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> definitions;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TMETHOD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod getMethod() {
		if (eContainerFeatureID() != BasicPackage.TMETHOD_SIGNATURE__METHOD)
			return null;
		return (TMethod) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(TMethod newMethod, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMethod, BasicPackage.TMETHOD_SIGNATURE__METHOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(TMethod newMethod) {
		if (newMethod != eInternalContainer()
				|| (eContainerFeatureID() != BasicPackage.TMETHOD_SIGNATURE__METHOD && newMethod != null)) {
			if (EcoreUtil.isAncestor(this, newMethod))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this, BasicPackage.TMETHOD__SIGNATURES, TMethod.class,
						msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__METHOD, newMethod,
					newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterList getParamList() {
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamList(TParameterList newParamList, NotificationChain msgs) {
		TParameterList oldParamList = paramList;
		paramList = newParamList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST, oldParamList, newParamList);
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
	public void setParamList(TParameterList newParamList) {
		if (newParamList != paramList) {
			NotificationChain msgs = null;
			if (paramList != null)
				msgs = ((InternalEObject) paramList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST, null, msgs);
			if (newParamList != null)
				msgs = ((InternalEObject) newParamList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST, null, msgs);
			msgs = basicSetParamList(newParamList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST,
					newParamList, newParamList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentWithInverseEList<TMethodDefinition>(TMethodDefinition.class, this,
					BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS, BasicPackage.TMETHOD_DEFINITION__SIGNATURE);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject) returnType;
			returnType = (TAbstractType) eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TAbstractType newReturnType) {
		TAbstractType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE,
					oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMethod((TMethod) otherEnd, msgs);
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDefinitions()).basicAdd(otherEnd, msgs);
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
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			return basicSetMethod(null, msgs);
		case BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return basicSetParamList(null, msgs);
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return ((InternalEList<?>) getDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			return eInternalContainer().eInverseRemove(this, BasicPackage.TMETHOD__SIGNATURES, TMethod.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			return getMethod();
		case BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return getParamList();
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return getDefinitions();
		case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
			if (resolve)
				return getReturnType();
			return basicGetReturnType();
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
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			setMethod((TMethod) newValue);
			return;
		case BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			setParamList((TParameterList) newValue);
			return;
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			getDefinitions().clear();
			getDefinitions().addAll((Collection<? extends TMethodDefinition>) newValue);
			return;
		case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
			setReturnType((TAbstractType) newValue);
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
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			setMethod((TMethod) null);
			return;
		case BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			setParamList((TParameterList) null);
			return;
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			getDefinitions().clear();
			return;
		case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
			setReturnType((TAbstractType) null);
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
		case BasicPackage.TMETHOD_SIGNATURE__METHOD:
			return getMethod() != null;
		case BasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return paramList != null;
		case BasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return definitions != null && !definitions.isEmpty();
		case BasicPackage.TMETHOD_SIGNATURE__RETURN_TYPE:
			return returnType != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMethodSignatureImpl
