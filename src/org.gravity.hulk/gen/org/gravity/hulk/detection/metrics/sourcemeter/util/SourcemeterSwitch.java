/**
 */
package org.gravity.hulk.detection.metrics.sourcemeter.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.detection.metrics.sourcemeter.*;

import org.moflon.core.dfs.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.metrics.sourcemeter.SourcemeterPackage
 * @generated
 */
public class SourcemeterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SourcemeterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcemeterSwitch() {
		if (modelPackage == null) {
			modelPackage = SourcemeterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SourcemeterPackage.HLCOM5_CALCULATOR: {
			HLCOM5Calculator hlcom5Calculator = (HLCOM5Calculator) theEObject;
			T result = caseHLCOM5Calculator(hlcom5Calculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hlcom5Calculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hlcom5Calculator);
			if (result == null)
				result = caseHClassBasedCalculator(hlcom5Calculator);
			if (result == null)
				result = caseHMetricCalculator(hlcom5Calculator);
			if (result == null)
				result = caseHDetector(hlcom5Calculator);
			if (result == null)
				result = caseNode(hlcom5Calculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HSETTERS_CALCULATOR: {
			HSettersCalculator hSettersCalculator = (HSettersCalculator) theEObject;
			T result = caseHSettersCalculator(hSettersCalculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hSettersCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hSettersCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hSettersCalculator);
			if (result == null)
				result = caseHMetricCalculator(hSettersCalculator);
			if (result == null)
				result = caseHDetector(hSettersCalculator);
			if (result == null)
				result = caseNode(hSettersCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HINCOMMING_INVOCATIONS_CALCULATOR: {
			HIncommingInvocationsCalculator hIncommingInvocationsCalculator = (HIncommingInvocationsCalculator) theEObject;
			T result = caseHIncommingInvocationsCalculator(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseHMetricCalculator(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseHDetector(hIncommingInvocationsCalculator);
			if (result == null)
				result = caseNode(hIncommingInvocationsCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HSOURCEMETER_METRIC_CALCULATOR: {
			HSourcemeterMetricCalculator hSourcemeterMetricCalculator = (HSourcemeterMetricCalculator) theEObject;
			T result = caseHSourcemeterMetricCalculator(hSourcemeterMetricCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hSourcemeterMetricCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hSourcemeterMetricCalculator);
			if (result == null)
				result = caseHMetricCalculator(hSourcemeterMetricCalculator);
			if (result == null)
				result = caseHDetector(hSourcemeterMetricCalculator);
			if (result == null)
				result = caseNode(hSourcemeterMetricCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HSOURE_METER_METRIC_TYPE: {
			HSoureMeterMetricType hSoureMeterMetricType = (HSoureMeterMetricType) theEObject;
			T result = caseHSoureMeterMetricType(hSoureMeterMetricType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HOUTGOING_INVOCATIONS_CALCULATOR: {
			HOutgoingInvocationsCalculator hOutgoingInvocationsCalculator = (HOutgoingInvocationsCalculator) theEObject;
			T result = caseHOutgoingInvocationsCalculator(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseHMetricCalculator(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseHDetector(hOutgoingInvocationsCalculator);
			if (result == null)
				result = caseNode(hOutgoingInvocationsCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HGETTERS_CALCULATOR: {
			HGettersCalculator hGettersCalculator = (HGettersCalculator) theEObject;
			T result = caseHGettersCalculator(hGettersCalculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hGettersCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hGettersCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hGettersCalculator);
			if (result == null)
				result = caseHMetricCalculator(hGettersCalculator);
			if (result == null)
				result = caseHDetector(hGettersCalculator);
			if (result == null)
				result = caseNode(hGettersCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SourcemeterPackage.HDEPTH_OF_INHERITANCE_CALCULATOR: {
			HDepthOfInheritanceCalculator hDepthOfInheritanceCalculator = (HDepthOfInheritanceCalculator) theEObject;
			T result = caseHDepthOfInheritanceCalculator(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseHSourcemeterMetricCalculator(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseHMetricCalculator(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseHDetector(hDepthOfInheritanceCalculator);
			if (result == null)
				result = caseNode(hDepthOfInheritanceCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLCOM5 Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLCOM5 Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLCOM5Calculator(HLCOM5Calculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSetters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSetters Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSettersCalculator(HSettersCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIncomming Invocations Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIncomming Invocations Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIncommingInvocationsCalculator(HIncommingInvocationsCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSourcemeter Metric Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSourcemeter Metric Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSourcemeterMetricCalculator(HSourcemeterMetricCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSoure Meter Metric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSoure Meter Metric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSoureMeterMetricType(HSoureMeterMetricType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HOutgoing Invocations Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HOutgoing Invocations Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOutgoingInvocationsCalculator(HOutgoingInvocationsCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGetters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGetters Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGettersCalculator(HGettersCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDepthOfInheritanceCalculator(HDepthOfInheritanceCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDetector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDetector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDetector(HDetector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HClass Based Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClass Based Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClassBasedCalculator(HClassBasedCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMetric Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMetric Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMetricCalculator(HMetricCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HClass Based Metric Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClass Based Metric Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClassBasedMetricCalculator(HClassBasedMetricCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SourcemeterSwitch
