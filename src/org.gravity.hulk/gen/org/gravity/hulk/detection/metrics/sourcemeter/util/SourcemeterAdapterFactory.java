/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.detection.metrics.sourcemeter.*;

import org.moflon.core.dfs.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage
 * @generated
 */
public class SourcemeterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SourcemeterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcemeterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SourcemeterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourcemeterSwitch<Adapter> modelSwitch = new SourcemeterSwitch<Adapter>() {
		@Override
		public Adapter caseHLCOM5Calculator(HLCOM5Calculator object) {
			return createHLCOM5CalculatorAdapter();
		}

		@Override
		public Adapter caseHSettersCalculator(HSettersCalculator object) {
			return createHSettersCalculatorAdapter();
		}

		@Override
		public Adapter caseHIncommingInvocationsCalculator(HIncommingInvocationsCalculator object) {
			return createHIncommingInvocationsCalculatorAdapter();
		}

		@Override
		public Adapter caseHSourcemeterMetricCalculator(HSourcemeterMetricCalculator object) {
			return createHSourcemeterMetricCalculatorAdapter();
		}

		@Override
		public Adapter caseHSoureMeterMetricType(HSoureMeterMetricType object) {
			return createHSoureMeterMetricTypeAdapter();
		}

		@Override
		public Adapter caseHOutgoingInvocationsCalculator(HOutgoingInvocationsCalculator object) {
			return createHOutgoingInvocationsCalculatorAdapter();
		}

		@Override
		public Adapter caseHGettersCalculator(HGettersCalculator object) {
			return createHGettersCalculatorAdapter();
		}

		@Override
		public Adapter caseHDepthOfInheritanceCalculator(HDepthOfInheritanceCalculator object) {
			return createHDepthOfInheritanceCalculatorAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseHDetector(HDetector object) {
			return createHDetectorAdapter();
		}

		@Override
		public Adapter caseHClassBasedCalculator(HClassBasedCalculator object) {
			return createHClassBasedCalculatorAdapter();
		}

		@Override
		public Adapter caseHMetricCalculator(HMetricCalculator object) {
			return createHMetricCalculatorAdapter();
		}

		@Override
		public Adapter caseHClassBasedMetricCalculator(HClassBasedMetricCalculator object) {
			return createHClassBasedMetricCalculatorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator <em>HLCOM5 Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HLCOM5Calculator
	 * @generated
	 */
	public Adapter createHLCOM5CalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator <em>HSetters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSettersCalculator
	 * @generated
	 */
	public Adapter createHSettersCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator <em>HIncomming Invocations Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HIncommingInvocationsCalculator
	 * @generated
	 */
	public Adapter createHIncommingInvocationsCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator <em>HSourcemeter Metric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSourcemeterMetricCalculator
	 * @generated
	 */
	public Adapter createHSourcemeterMetricCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType <em>HSoure Meter Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HSoureMeterMetricType
	 * @generated
	 */
	public Adapter createHSoureMeterMetricTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator <em>HOutgoing Invocations Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HOutgoingInvocationsCalculator
	 * @generated
	 */
	public Adapter createHOutgoingInvocationsCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator <em>HGetters Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HGettersCalculator
	 * @generated
	 */
	public Adapter createHGettersCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator <em>HDepth Of Inheritance Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.metrics.sourcemeter.HDepthOfInheritanceCalculator
	 * @generated
	 */
	public Adapter createHDepthOfInheritanceCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.core.dfs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.core.dfs.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.HDetector <em>HDetector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.HDetector
	 * @generated
	 */
	public Adapter createHDetectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HClassBasedCalculator <em>HClass Based Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HClassBasedCalculator
	 * @generated
	 */
	public Adapter createHClassBasedCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HMetricCalculator <em>HMetric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HMetricCalculator
	 * @generated
	 */
	public Adapter createHMetricCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.hulk.detection.HClassBasedMetricCalculator <em>HClass Based Metric Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.hulk.detection.HClassBasedMetricCalculator
	 * @generated
	 */
	public Adapter createHClassBasedMetricCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SourcemeterAdapterFactory
