/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HNACC Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl#getHGetterSetterSmells <em>HGetter Setter Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl#getHNumberOfGettersMetric <em>HNumber Of Getters Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl#getHNumberOfSettersMetric <em>HNumber Of Setters Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HNACCMetricImpl#getHNumberOfMethodsMetric <em>HNumber Of Methods Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HNACCMetricImpl extends HMetricImpl implements HNACCMetric {
	/**
	 * The cached value of the '{@link #getHGetterSetterSmells() <em>HGetter Setter Smells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHGetterSetterSmells()
	 * @generated
	 * @ordered
	 */
	protected EList<HGetterSetterSmell> hGetterSetterSmells;

	/**
	 * The cached value of the '{@link #getHNumberOfGettersMetric() <em>HNumber Of Getters Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfGettersMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfGettersMetric hNumberOfGettersMetric;

	/**
	 * The cached value of the '{@link #getHNumberOfSettersMetric() <em>HNumber Of Setters Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfSettersMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfSettersMetric hNumberOfSettersMetric;

	/**
	 * The cached value of the '{@link #getHNumberOfMethodsMetric() <em>HNumber Of Methods Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfMethodsMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfMethodsMetric hNumberOfMethodsMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HNACCMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HNACC_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HGetterSetterSmell> getHGetterSetterSmells() {
		if (hGetterSetterSmells == null) {
			hGetterSetterSmells = new EObjectResolvingEList<HGetterSetterSmell>(HGetterSetterSmell.class, this,
					MetricsPackage.HNACC_METRIC__HGETTER_SETTER_SMELLS);
		}
		return hGetterSetterSmells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfGettersMetric getHNumberOfGettersMetric() {
		if (hNumberOfGettersMetric != null && hNumberOfGettersMetric.eIsProxy()) {
			InternalEObject oldHNumberOfGettersMetric = (InternalEObject) hNumberOfGettersMetric;
			hNumberOfGettersMetric = (HNumberOfGettersMetric) eResolveProxy(oldHNumberOfGettersMetric);
			if (hNumberOfGettersMetric != oldHNumberOfGettersMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC, oldHNumberOfGettersMetric,
							hNumberOfGettersMetric));
			}
		}
		return hNumberOfGettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfGettersMetric basicGetHNumberOfGettersMetric() {
		return hNumberOfGettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfGettersMetric(HNumberOfGettersMetric newHNumberOfGettersMetric) {
		HNumberOfGettersMetric oldHNumberOfGettersMetric = hNumberOfGettersMetric;
		hNumberOfGettersMetric = newHNumberOfGettersMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC, oldHNumberOfGettersMetric,
					hNumberOfGettersMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfSettersMetric getHNumberOfSettersMetric() {
		if (hNumberOfSettersMetric != null && hNumberOfSettersMetric.eIsProxy()) {
			InternalEObject oldHNumberOfSettersMetric = (InternalEObject) hNumberOfSettersMetric;
			hNumberOfSettersMetric = (HNumberOfSettersMetric) eResolveProxy(oldHNumberOfSettersMetric);
			if (hNumberOfSettersMetric != oldHNumberOfSettersMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC, oldHNumberOfSettersMetric,
							hNumberOfSettersMetric));
			}
		}
		return hNumberOfSettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfSettersMetric basicGetHNumberOfSettersMetric() {
		return hNumberOfSettersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfSettersMetric(HNumberOfSettersMetric newHNumberOfSettersMetric) {
		HNumberOfSettersMetric oldHNumberOfSettersMetric = hNumberOfSettersMetric;
		hNumberOfSettersMetric = newHNumberOfSettersMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC, oldHNumberOfSettersMetric,
					hNumberOfSettersMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMethodsMetric getHNumberOfMethodsMetric() {
		if (hNumberOfMethodsMetric != null && hNumberOfMethodsMetric.eIsProxy()) {
			InternalEObject oldHNumberOfMethodsMetric = (InternalEObject) hNumberOfMethodsMetric;
			hNumberOfMethodsMetric = (HNumberOfMethodsMetric) eResolveProxy(oldHNumberOfMethodsMetric);
			if (hNumberOfMethodsMetric != oldHNumberOfMethodsMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC, oldHNumberOfMethodsMetric,
							hNumberOfMethodsMetric));
			}
		}
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfMethodsMetric basicGetHNumberOfMethodsMetric() {
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfMethodsMetric(HNumberOfMethodsMetric newHNumberOfMethodsMetric) {
		HNumberOfMethodsMetric oldHNumberOfMethodsMetric = hNumberOfMethodsMetric;
		hNumberOfMethodsMetric = newHNumberOfMethodsMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC, oldHNumberOfMethodsMetric,
					hNumberOfMethodsMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetricsPackage.HNACC_METRIC__HGETTER_SETTER_SMELLS:
			return getHGetterSetterSmells();
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC:
			if (resolve)
				return getHNumberOfGettersMetric();
			return basicGetHNumberOfGettersMetric();
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC:
			if (resolve)
				return getHNumberOfSettersMetric();
			return basicGetHNumberOfSettersMetric();
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC:
			if (resolve)
				return getHNumberOfMethodsMetric();
			return basicGetHNumberOfMethodsMetric();
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
		case MetricsPackage.HNACC_METRIC__HGETTER_SETTER_SMELLS:
			getHGetterSetterSmells().clear();
			getHGetterSetterSmells().addAll((Collection<? extends HGetterSetterSmell>) newValue);
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC:
			setHNumberOfGettersMetric((HNumberOfGettersMetric) newValue);
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC:
			setHNumberOfSettersMetric((HNumberOfSettersMetric) newValue);
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC:
			setHNumberOfMethodsMetric((HNumberOfMethodsMetric) newValue);
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
		case MetricsPackage.HNACC_METRIC__HGETTER_SETTER_SMELLS:
			getHGetterSetterSmells().clear();
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC:
			setHNumberOfGettersMetric((HNumberOfGettersMetric) null);
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC:
			setHNumberOfSettersMetric((HNumberOfSettersMetric) null);
			return;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC:
			setHNumberOfMethodsMetric((HNumberOfMethodsMetric) null);
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
		case MetricsPackage.HNACC_METRIC__HGETTER_SETTER_SMELLS:
			return hGetterSetterSmells != null && !hGetterSetterSmells.isEmpty();
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_GETTERS_METRIC:
			return hNumberOfGettersMetric != null;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_SETTERS_METRIC:
			return hNumberOfSettersMetric != null;
		case MetricsPackage.HNACC_METRIC__HNUMBER_OF_METHODS_METRIC:
			return hNumberOfMethodsMetric != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("GetterSetterRatio(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}
	// [user code injected with eMoflon] -->
} //HNACCMetricImpl
