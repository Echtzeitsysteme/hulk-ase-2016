/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;

import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
// <-- [user defined imports]
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TClass;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLow Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl#getHLCOM5 <em>HLCOM5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLowCohesionSmellImpl extends HCodeSmellImpl implements HLowCohesionSmell {
	/**
	 * The cached value of the '{@link #getHLCOM5() <em>HLCOM5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLCOM5()
	 * @generated
	 * @ordered
	 */
	protected HLCOM5Metric hLCOM5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLowCohesionSmellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLOW_COHESION_SMELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLCOM5Metric getHLCOM5() {
		if (hLCOM5 != null && hLCOM5.eIsProxy()) {
			InternalEObject oldHLCOM5 = (InternalEObject) hLCOM5;
			hLCOM5 = (HLCOM5Metric) eResolveProxy(oldHLCOM5);
			if (hLCOM5 != oldHLCOM5) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5, oldHLCOM5, hLCOM5));
			}
		}
		return hLCOM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLCOM5Metric basicGetHLCOM5() {
		return hLCOM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLCOM5(HLCOM5Metric newHLCOM5) {
		HLCOM5Metric oldHLCOM5 = hLCOM5;
		hLCOM5 = newHLCOM5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5,
					oldHLCOM5, hLCOM5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5:
			if (resolve)
				return getHLCOM5();
			return basicGetHLCOM5();
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5:
			setHLCOM5((HLCOM5Metric) newValue);
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5:
			setHLCOM5((HLCOM5Metric) null);
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
		case CodesmellsPackage.HLOW_COHESION_SMELL__HLCOM5:
			return hLCOM5 != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText(((TClass) getTAnnotated()).getTName());
		getHLCOM5().getTreeItem(item, style);
		return item;
	}
	// [user code injected with eMoflon] -->
} //HLowCohesionSmellImpl
