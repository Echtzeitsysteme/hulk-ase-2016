/**
 */
package org.gravity.hulk.antipatterngraph.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.hulk.antipatterngraph.*;

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
 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage
 * @generated
 */
public class AntipatterngraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AntipatterngraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntipatterngraphSwitch() {
		if (modelPackage == null) {
			modelPackage = AntipatterngraphPackage.eINSTANCE;
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
		case AntipatterngraphPackage.HANNOTATION: {
			HAnnotation hAnnotation = (HAnnotation) theEObject;
			T result = caseHAnnotation(hAnnotation);
			if (result == null)
				result = caseTAnnotation(hAnnotation);
			if (result == null)
				result = caseTElementWithId(hAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatterngraphPackage.HANTI_PATTERN: {
			HAntiPattern hAntiPattern = (HAntiPattern) theEObject;
			T result = caseHAntiPattern(hAntiPattern);
			if (result == null)
				result = caseHAnnotation(hAntiPattern);
			if (result == null)
				result = caseTAnnotation(hAntiPattern);
			if (result == null)
				result = caseTElementWithId(hAntiPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatterngraphPackage.HCODE_SMELL: {
			HCodeSmell hCodeSmell = (HCodeSmell) theEObject;
			T result = caseHCodeSmell(hCodeSmell);
			if (result == null)
				result = caseHAnnotation(hCodeSmell);
			if (result == null)
				result = caseTAnnotation(hCodeSmell);
			if (result == null)
				result = caseTElementWithId(hCodeSmell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatterngraphPackage.HMETRIC: {
			HMetric hMetric = (HMetric) theEObject;
			T result = caseHMetric(hMetric);
			if (result == null)
				result = caseHAnnotation(hMetric);
			if (result == null)
				result = caseTAnnotation(hMetric);
			if (result == null)
				result = caseTElementWithId(hMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH: {
			HAntiPatternGraph hAntiPatternGraph = (HAntiPatternGraph) theEObject;
			T result = caseHAntiPatternGraph(hAntiPatternGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>HAnti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAntiPattern(HAntiPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HCode Smell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HCode Smell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHCodeSmell(HCodeSmell object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>HAnti Pattern Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAnti Pattern Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAntiPatternGraph(HAntiPatternGraph object) {
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

} //AntipatterngraphSwitch
