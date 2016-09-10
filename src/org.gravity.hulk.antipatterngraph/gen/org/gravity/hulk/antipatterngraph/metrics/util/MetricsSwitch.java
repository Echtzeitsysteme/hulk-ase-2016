/**
 */
package org.gravity.hulk.antipatterngraph.metrics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.*;

import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TElementWithId;

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
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage
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
		case MetricsPackage.HNACC_METRIC: {
			HNACCMetric hnaccMetric = (HNACCMetric) theEObject;
			T result = caseHNACCMetric(hnaccMetric);
			if (result == null)
				result = caseHMetric(hnaccMetric);
			if (result == null)
				result = caseHAnnotation(hnaccMetric);
			if (result == null)
				result = caseTAnnotation(hnaccMetric);
			if (result == null)
				result = caseTElementWithId(hnaccMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLCOM5_METRIC: {
			HLCOM5Metric hlcom5Metric = (HLCOM5Metric) theEObject;
			T result = caseHLCOM5Metric(hlcom5Metric);
			if (result == null)
				result = caseHMetric(hlcom5Metric);
			if (result == null)
				result = caseHAnnotation(hlcom5Metric);
			if (result == null)
				result = caseTAnnotation(hlcom5Metric);
			if (result == null)
				result = caseTElementWithId(hlcom5Metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_MEMBERS_METRIC: {
			HNumberOfMembersMetric hNumberOfMembersMetric = (HNumberOfMembersMetric) theEObject;
			T result = caseHNumberOfMembersMetric(hNumberOfMembersMetric);
			if (result == null)
				result = caseHMetric(hNumberOfMembersMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfMembersMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfMembersMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfMembersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_INCOMMING_INVOCATIONS_METRIC: {
			HNumberOfIncommingInvocationsMetric hNumberOfIncommingInvocationsMetric = (HNumberOfIncommingInvocationsMetric) theEObject;
			T result = caseHNumberOfIncommingInvocationsMetric(hNumberOfIncommingInvocationsMetric);
			if (result == null)
				result = caseHMetric(hNumberOfIncommingInvocationsMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfIncommingInvocationsMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfIncommingInvocationsMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfIncommingInvocationsMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_OUTGOING_INVOCATIONS_METRIC: {
			HNumberOfOutgoingInvocationsMetric hNumberOfOutgoingInvocationsMetric = (HNumberOfOutgoingInvocationsMetric) theEObject;
			T result = caseHNumberOfOutgoingInvocationsMetric(hNumberOfOutgoingInvocationsMetric);
			if (result == null)
				result = caseHMetric(hNumberOfOutgoingInvocationsMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfOutgoingInvocationsMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfOutgoingInvocationsMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfOutgoingInvocationsMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC: {
			HLocalAccessRelationMetric hLocalAccessRelationMetric = (HLocalAccessRelationMetric) theEObject;
			T result = caseHLocalAccessRelationMetric(hLocalAccessRelationMetric);
			if (result == null)
				result = caseHMetric(hLocalAccessRelationMetric);
			if (result == null)
				result = caseHAnnotation(hLocalAccessRelationMetric);
			if (result == null)
				result = caseTAnnotation(hLocalAccessRelationMetric);
			if (result == null)
				result = caseTElementWithId(hLocalAccessRelationMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HINVOCATION_RELATION: {
			HInvocationRelation hInvocationRelation = (HInvocationRelation) theEObject;
			T result = caseHInvocationRelation(hInvocationRelation);
			if (result == null)
				result = caseHMetric(hInvocationRelation);
			if (result == null)
				result = caseHAnnotation(hInvocationRelation);
			if (result == null)
				result = caseTAnnotation(hInvocationRelation);
			if (result == null)
				result = caseTElementWithId(hInvocationRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_CHILD_METRIC: {
			HNumberOfChildMetric hNumberOfChildMetric = (HNumberOfChildMetric) theEObject;
			T result = caseHNumberOfChildMetric(hNumberOfChildMetric);
			if (result == null)
				result = caseHMetric(hNumberOfChildMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfChildMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfChildMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfChildMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_GETTERS_METRIC: {
			HNumberOfGettersMetric hNumberOfGettersMetric = (HNumberOfGettersMetric) theEObject;
			T result = caseHNumberOfGettersMetric(hNumberOfGettersMetric);
			if (result == null)
				result = caseHMetric(hNumberOfGettersMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfGettersMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfGettersMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfGettersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_SETTERS_METRIC: {
			HNumberOfSettersMetric hNumberOfSettersMetric = (HNumberOfSettersMetric) theEObject;
			T result = caseHNumberOfSettersMetric(hNumberOfSettersMetric);
			if (result == null)
				result = caseHMetric(hNumberOfSettersMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfSettersMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfSettersMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfSettersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HNUMBER_OF_METHODS_METRIC: {
			HNumberOfMethodsMetric hNumberOfMethodsMetric = (HNumberOfMethodsMetric) theEObject;
			T result = caseHNumberOfMethodsMetric(hNumberOfMethodsMetric);
			if (result == null)
				result = caseHMetric(hNumberOfMethodsMetric);
			if (result == null)
				result = caseHAnnotation(hNumberOfMethodsMetric);
			if (result == null)
				result = caseTAnnotation(hNumberOfMethodsMetric);
			if (result == null)
				result = caseTElementWithId(hNumberOfMethodsMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_METRIC: {
			HAverageOverloadingInClassMetric hAverageOverloadingInClassMetric = (HAverageOverloadingInClassMetric) theEObject;
			T result = caseHAverageOverloadingInClassMetric(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseHMetric(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseHAnnotation(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseTAnnotation(hAverageOverloadingInClassMetric);
			if (result == null)
				result = caseTElementWithId(hAverageOverloadingInClassMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HAVERAGE_PARAMETERS_METRIC: {
			HAverageParametersMetric hAverageParametersMetric = (HAverageParametersMetric) theEObject;
			T result = caseHAverageParametersMetric(hAverageParametersMetric);
			if (result == null)
				result = caseHMetric(hAverageParametersMetric);
			if (result == null)
				result = caseHAnnotation(hAverageParametersMetric);
			if (result == null)
				result = caseTAnnotation(hAverageParametersMetric);
			if (result == null)
				result = caseTElementWithId(hAverageParametersMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_METHOD_ACCESSES_METRIC: {
			HLocalMethodAccessesMetric hLocalMethodAccessesMetric = (HLocalMethodAccessesMetric) theEObject;
			T result = caseHLocalMethodAccessesMetric(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseHMetric(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseHAnnotation(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseTAnnotation(hLocalMethodAccessesMetric);
			if (result == null)
				result = caseTElementWithId(hLocalMethodAccessesMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HLOCAL_FIELD_ACCESSES_METRIC: {
			HLocalFieldAccessesMetric hLocalFieldAccessesMetric = (HLocalFieldAccessesMetric) theEObject;
			T result = caseHLocalFieldAccessesMetric(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseHMetric(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseHAnnotation(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseTAnnotation(hLocalFieldAccessesMetric);
			if (result == null)
				result = caseTElementWithId(hLocalFieldAccessesMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetricsPackage.HDEPTH_OF_INHERITANCE_METRIC: {
			HDepthOfInheritanceMetric hDepthOfInheritanceMetric = (HDepthOfInheritanceMetric) theEObject;
			T result = caseHDepthOfInheritanceMetric(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseHMetric(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseHAnnotation(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseTAnnotation(hDepthOfInheritanceMetric);
			if (result == null)
				result = caseTElementWithId(hDepthOfInheritanceMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNACC Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNACC Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNACCMetric(HNACCMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLCOM5 Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLCOM5 Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLCOM5Metric(HLCOM5Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Members Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Members Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfMembersMetric(HNumberOfMembersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Incomming Invocations Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Incomming Invocations Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfIncommingInvocationsMetric(HNumberOfIncommingInvocationsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Outgoing Invocations Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Outgoing Invocations Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfOutgoingInvocationsMetric(HNumberOfOutgoingInvocationsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Access Relation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Access Relation Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalAccessRelationMetric(HLocalAccessRelationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HInvocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HInvocation Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHInvocationRelation(HInvocationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Child Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Child Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfChildMetric(HNumberOfChildMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Getters Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Getters Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfGettersMetric(HNumberOfGettersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Setters Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Setters Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfSettersMetric(HNumberOfSettersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HNumber Of Methods Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HNumber Of Methods Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHNumberOfMethodsMetric(HNumberOfMethodsMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Overloading In Class Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageOverloadingInClassMetric(HAverageOverloadingInClassMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAverage Parameters Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAverage Parameters Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAverageParametersMetric(HAverageParametersMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Method Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Method Accesses Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalMethodAccessesMetric(HLocalMethodAccessesMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLocal Field Accesses Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLocal Field Accesses Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLocalFieldAccessesMetric(HLocalFieldAccessesMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDepth Of Inheritance Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDepthOfInheritanceMetric(HDepthOfInheritanceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TElement With Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TElement With Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTElementWithId(TElementWithId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnnotation(TAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAnnotation(HAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMetric(HMetric object) {
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
