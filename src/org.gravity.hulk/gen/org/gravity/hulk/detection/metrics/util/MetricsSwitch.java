/**
 */
package org.gravity.hulk.detection.metrics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;
import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.detection.metrics.*;

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
 * @see org.gravity.hulk.detection.metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
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
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR: {
			HInvocationRelationCalculator hInvocationRelationCalculator = (HInvocationRelationCalculator) theEObject;
			T result = caseHInvocationRelationCalculator(hInvocationRelationCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hInvocationRelationCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hInvocationRelationCalculator);
			if (result == null)
				result = caseHMetricCalculator(hInvocationRelationCalculator);
			if (result == null)
				result = caseHDetector(hInvocationRelationCalculator);
			if (result == null)
				result = caseNode(hInvocationRelationCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR: {
			HNumberOfChildCalculator hNumberOfChildCalculator = (HNumberOfChildCalculator) theEObject;
			T result = caseHNumberOfChildCalculator(hNumberOfChildCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hNumberOfChildCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hNumberOfChildCalculator);
			if (result == null)
				result = caseHMetricCalculator(hNumberOfChildCalculator);
			if (result == null)
				result = caseHDetector(hNumberOfChildCalculator);
			if (result == null)
				result = caseNode(hNumberOfChildCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HMEMBER_NUMBER_CALCULATOR: {
			HMemberNumberCalculator hMemberNumberCalculator = (HMemberNumberCalculator) theEObject;
			T result = caseHMemberNumberCalculator(hMemberNumberCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hMemberNumberCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hMemberNumberCalculator);
			if (result == null)
				result = caseHMetricCalculator(hMemberNumberCalculator);
			if (result == null)
				result = caseHDetector(hMemberNumberCalculator);
			if (result == null)
				result = caseNode(hMemberNumberCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR: {
			HLocalAccessRelationCalculator hLocalAccessRelationCalculator = (HLocalAccessRelationCalculator) theEObject;
			T result = caseHLocalAccessRelationCalculator(hLocalAccessRelationCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hLocalAccessRelationCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hLocalAccessRelationCalculator);
			if (result == null)
				result = caseHMetricCalculator(hLocalAccessRelationCalculator);
			if (result == null)
				result = caseHDetector(hLocalAccessRelationCalculator);
			if (result == null)
				result = caseNode(hLocalAccessRelationCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR: {
			HMethodNumberCalculator hMethodNumberCalculator = (HMethodNumberCalculator) theEObject;
			T result = caseHMethodNumberCalculator(hMethodNumberCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hMethodNumberCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hMethodNumberCalculator);
			if (result == null)
				result = caseHMetricCalculator(hMethodNumberCalculator);
			if (result == null)
				result = caseHDetector(hMethodNumberCalculator);
			if (result == null)
				result = caseNode(hMethodNumberCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR: {
			HGetterSetterMethodRelationCalculator hGetterSetterMethodRelationCalculator = (HGetterSetterMethodRelationCalculator) theEObject;
			T result = caseHGetterSetterMethodRelationCalculator(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = caseHMetricCalculator(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = caseHDetector(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = caseNode(hGetterSetterMethodRelationCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_PARAMTERS_CALCULATOR: {
			HAverageParamtersCalculator hAverageParamtersCalculator = (HAverageParamtersCalculator) theEObject;
			T result = caseHAverageParamtersCalculator(hAverageParamtersCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hAverageParamtersCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hAverageParamtersCalculator);
			if (result == null)
				result = caseHMetricCalculator(hAverageParamtersCalculator);
			if (result == null)
				result = caseHDetector(hAverageParamtersCalculator);
			if (result == null)
				result = caseNode(hAverageParamtersCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR: {
			HAverageOverloadingInClassCalculator hAverageOverloadingInClassCalculator = (HAverageOverloadingInClassCalculator) theEObject;
			T result = caseHAverageOverloadingInClassCalculator(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = caseHMetricCalculator(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = caseHDetector(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = caseNode(hAverageOverloadingInClassCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR: {
			HLocalMethodAccessCalculator hLocalMethodAccessCalculator = (HLocalMethodAccessCalculator) theEObject;
			T result = caseHLocalMethodAccessCalculator(hLocalMethodAccessCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hLocalMethodAccessCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hLocalMethodAccessCalculator);
			if (result == null)
				result = caseHMetricCalculator(hLocalMethodAccessCalculator);
			if (result == null)
				result = caseHDetector(hLocalMethodAccessCalculator);
			if (result == null)
				result = caseNode(hLocalMethodAccessCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_FIELDS_ACCESS_CALCULATOR: {
			HLocalFieldsAccessCalculator hLocalFieldsAccessCalculator = (HLocalFieldsAccessCalculator) theEObject;
			T result = caseHLocalFieldsAccessCalculator(hLocalFieldsAccessCalculator);
			if (result == null)
				result = caseHClassBasedMetricCalculator(hLocalFieldsAccessCalculator);
			if (result == null)
				result = caseHClassBasedCalculator(hLocalFieldsAccessCalculator);
			if (result == null)
				result = caseHMetricCalculator(hLocalFieldsAccessCalculator);
			if (result == null)
				result = caseHDetector(hLocalFieldsAccessCalculator);
			if (result == null)
				result = caseNode(hLocalFieldsAccessCalculator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HInvocation Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HInvocation Relation Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInvocationRelationCalculator(HInvocationRelationCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Child Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Child Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfChildCalculator(HNumberOfChildCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMember Number Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMember Number Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMemberNumberCalculator(HMemberNumberCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Access Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Access Relation Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalAccessRelationCalculator(HLocalAccessRelationCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMethod Number Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMethod Number Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMethodNumberCalculator(HMethodNumberCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HGetter Setter Method Relation Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HGetter Setter Method Relation Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHGetterSetterMethodRelationCalculator(HGetterSetterMethodRelationCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Paramters Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Paramters Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageParamtersCalculator(HAverageParamtersCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageOverloadingInClassCalculator(HAverageOverloadingInClassCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Method Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Method Access Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalMethodAccessCalculator(HLocalMethodAccessCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Fields Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Fields Access Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalFieldsAccessCalculator(HLocalFieldsAccessCalculator object) {
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

} //MetricsSwitch
