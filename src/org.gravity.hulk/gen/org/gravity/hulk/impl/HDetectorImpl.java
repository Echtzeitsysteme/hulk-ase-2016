/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.moflon.core.dfs.impl.NodeImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.impl.HDetectorImpl#getHulk <em>Hulk</em>}</li>
 *   <li>{@link org.gravity.hulk.impl.HDetectorImpl#getHAnnotation <em>HAnnotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HDetectorImpl extends NodeImpl implements HDetector {
	/**
	 * The cached value of the '{@link #getHulk() <em>Hulk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHulk()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternDetection hulk;

	/**
	 * The cached value of the '{@link #getHAnnotation() <em>HAnnotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<HAnnotation> hAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HDETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternDetection getHulk() {
		if (hulk != null && hulk.eIsProxy()) {
			InternalEObject oldHulk = (InternalEObject) hulk;
			hulk = (HAntiPatternDetection) eResolveProxy(oldHulk);
			if (hulk != oldHulk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HulkPackage.HDETECTOR__HULK, oldHulk,
							hulk));
			}
		}
		return hulk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternDetection basicGetHulk() {
		return hulk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHulk(HAntiPatternDetection newHulk, NotificationChain msgs) {
		HAntiPatternDetection oldHulk = hulk;
		hulk = newHulk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HulkPackage.HDETECTOR__HULK,
					oldHulk, newHulk);
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
	public void setHulk(HAntiPatternDetection newHulk) {
		if (newHulk != hulk) {
			NotificationChain msgs = null;
			if (hulk != null)
				msgs = ((InternalEObject) hulk).eInverseRemove(this, HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS,
						HAntiPatternDetection.class, msgs);
			if (newHulk != null)
				msgs = ((InternalEObject) newHulk).eInverseAdd(this, HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS,
						HAntiPatternDetection.class, msgs);
			msgs = basicSetHulk(newHulk, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HulkPackage.HDETECTOR__HULK, newHulk, newHulk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HAnnotation> getHAnnotation() {
		if (hAnnotation == null) {
			hAnnotation = new EObjectResolvingEList<HAnnotation>(HAnnotation.class, this,
					HulkPackage.HDETECTOR__HANNOTATION);
		}
		return hAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {
		// [user code injected with eMoflon]
		// TODO: implement this method here but do not remove the injection
		// marker
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextID() {
		// [user code injected with eMoflon]
		return hulk.getApg().getNextID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HulkPackage.HDETECTOR__HULK:
			if (hulk != null)
				msgs = ((InternalEObject) hulk).eInverseRemove(this, HulkPackage.HANTI_PATTERN_DETECTION__DETECTORS,
						HAntiPatternDetection.class, msgs);
			return basicSetHulk((HAntiPatternDetection) otherEnd, msgs);
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
		case HulkPackage.HDETECTOR__HULK:
			return basicSetHulk(null, msgs);
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
		case HulkPackage.HDETECTOR__HULK:
			if (resolve)
				return getHulk();
			return basicGetHulk();
		case HulkPackage.HDETECTOR__HANNOTATION:
			return getHAnnotation();
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
		case HulkPackage.HDETECTOR__HULK:
			setHulk((HAntiPatternDetection) newValue);
			return;
		case HulkPackage.HDETECTOR__HANNOTATION:
			getHAnnotation().clear();
			getHAnnotation().addAll((Collection<? extends HAnnotation>) newValue);
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
		case HulkPackage.HDETECTOR__HULK:
			setHulk((HAntiPatternDetection) null);
			return;
		case HulkPackage.HDETECTOR__HANNOTATION:
			getHAnnotation().clear();
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
		case HulkPackage.HDETECTOR__HULK:
			return hulk != null;
		case HulkPackage.HDETECTOR__HANNOTATION:
			return hAnnotation != null && !hAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case HulkPackage.HDETECTOR___GET_NEXT_ID:
			return getNextID();
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HDetectorImpl
