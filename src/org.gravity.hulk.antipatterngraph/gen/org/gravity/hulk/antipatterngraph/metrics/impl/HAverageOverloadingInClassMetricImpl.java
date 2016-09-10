/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAverage Overloading In Class Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAverageOverloadingInClassMetricImpl extends HMetricImpl implements HAverageOverloadingInClassMetric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAverageOverloadingInClassMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAVERAGE_OVERLOADING_IN_CLASS_METRIC;
	}

	// <-- [user code injected with eMoflon]
	@Override
	public TreeItem createItemContents(TreeItem item, int style) {
		item.setText("AverageOverloading(" + ((TClass) getTAnnotated()).getTName() + ")=" + getValue());
		return item;
	}
	// [user code injected with eMoflon] -->
} //HAverageOverloadingInClassMetricImpl
