/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HInvocation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl#getHNumberOfOutgoingInvocationsMetric <em>HNumber Of Outgoing Invocations Metric</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.impl.HInvocationRelationImpl#getHNumberOfIncommingInvocationsMetric <em>HNumber Of Incomming Invocations Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HInvocationRelationImpl extends HMetricImpl implements HInvocationRelation {
	/**
	 * The cached value of the '{@link #getHNumberOfOutgoingInvocationsMetric() <em>HNumber Of Outgoing Invocations Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfOutgoingInvocationsMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfOutgoingInvocationsMetric hNumberOfOutgoingInvocationsMetric;

	/**
	 * The cached value of the '{@link #getHNumberOfIncommingInvocationsMetric() <em>HNumber Of Incomming Invocations Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHNumberOfIncommingInvocationsMetric()
	 * @generated
	 * @ordered
	 */
	protected HNumberOfIncommingInvocationsMetric hNumberOfIncommingInvocationsMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HInvocationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINVOCATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfOutgoingInvocationsMetric getHNumberOfOutgoingInvocationsMetric() {
		if (hNumberOfOutgoingInvocationsMetric != null && hNumberOfOutgoingInvocationsMetric.eIsProxy()) {
			InternalEObject oldHNumberOfOutgoingInvocationsMetric = (InternalEObject) hNumberOfOutgoingInvocationsMetric;
			hNumberOfOutgoingInvocationsMetric = (HNumberOfOutgoingInvocationsMetric) eResolveProxy(
					oldHNumberOfOutgoingInvocationsMetric);
			if (hNumberOfOutgoingInvocationsMetric != oldHNumberOfOutgoingInvocationsMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC,
							oldHNumberOfOutgoingInvocationsMetric, hNumberOfOutgoingInvocationsMetric));
			}
		}
		return hNumberOfOutgoingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfOutgoingInvocationsMetric basicGetHNumberOfOutgoingInvocationsMetric() {
		return hNumberOfOutgoingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfOutgoingInvocationsMetric(
			HNumberOfOutgoingInvocationsMetric newHNumberOfOutgoingInvocationsMetric) {
		HNumberOfOutgoingInvocationsMetric oldHNumberOfOutgoingInvocationsMetric = hNumberOfOutgoingInvocationsMetric;
		hNumberOfOutgoingInvocationsMetric = newHNumberOfOutgoingInvocationsMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC,
					oldHNumberOfOutgoingInvocationsMetric, hNumberOfOutgoingInvocationsMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfIncommingInvocationsMetric getHNumberOfIncommingInvocationsMetric() {
		if (hNumberOfIncommingInvocationsMetric != null && hNumberOfIncommingInvocationsMetric.eIsProxy()) {
			InternalEObject oldHNumberOfIncommingInvocationsMetric = (InternalEObject) hNumberOfIncommingInvocationsMetric;
			hNumberOfIncommingInvocationsMetric = (HNumberOfIncommingInvocationsMetric) eResolveProxy(
					oldHNumberOfIncommingInvocationsMetric);
			if (hNumberOfIncommingInvocationsMetric != oldHNumberOfIncommingInvocationsMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC,
							oldHNumberOfIncommingInvocationsMetric, hNumberOfIncommingInvocationsMetric));
			}
		}
		return hNumberOfIncommingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfIncommingInvocationsMetric basicGetHNumberOfIncommingInvocationsMetric() {
		return hNumberOfIncommingInvocationsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHNumberOfIncommingInvocationsMetric(
			HNumberOfIncommingInvocationsMetric newHNumberOfIncommingInvocationsMetric) {
		HNumberOfIncommingInvocationsMetric oldHNumberOfIncommingInvocationsMetric = hNumberOfIncommingInvocationsMetric;
		hNumberOfIncommingInvocationsMetric = newHNumberOfIncommingInvocationsMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC,
					oldHNumberOfIncommingInvocationsMetric, hNumberOfIncommingInvocationsMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			if (resolve)
				return getHNumberOfOutgoingInvocationsMetric();
			return basicGetHNumberOfOutgoingInvocationsMetric();
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			if (resolve)
				return getHNumberOfIncommingInvocationsMetric();
			return basicGetHNumberOfIncommingInvocationsMetric();
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
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			setHNumberOfOutgoingInvocationsMetric((HNumberOfOutgoingInvocationsMetric) newValue);
			return;
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			setHNumberOfIncommingInvocationsMetric((HNumberOfIncommingInvocationsMetric) newValue);
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
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			setHNumberOfOutgoingInvocationsMetric((HNumberOfOutgoingInvocationsMetric) null);
			return;
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			setHNumberOfIncommingInvocationsMetric((HNumberOfIncommingInvocationsMetric) null);
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
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			return hNumberOfOutgoingInvocationsMetric != null;
		case MetricsPackage.HINVOCATION_RELATION__HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			return hNumberOfIncommingInvocationsMetric != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("InvocationRelation(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}
	// [user code injected with eMoflon] -->
} //HInvocationRelationImpl
