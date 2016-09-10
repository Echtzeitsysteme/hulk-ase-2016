/**
 */
package org.gravity.modisco.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;

import org.gravity.modisco.*;

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
 * @see org.gravity.modisco.ModiscoPackage
 * @generated
 */
public class ModiscoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoSwitch() {
		if (modelPackage == null) {
			modelPackage = ModiscoPackage.eINSTANCE;
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
		case ModiscoPackage.MABSTRACT_METHOD_DEFINITION: {
			MAbstractMethodDefinition mAbstractMethodDefinition = (MAbstractMethodDefinition) theEObject;
			T result = caseMAbstractMethodDefinition(mAbstractMethodDefinition);
			if (result == null)
				result = caseMDefinition(mAbstractMethodDefinition);
			if (result == null)
				result = caseAbstractMethodDeclaration(mAbstractMethodDefinition);
			if (result == null)
				result = caseBodyDeclaration(mAbstractMethodDefinition);
			if (result == null)
				result = caseNamedElement(mAbstractMethodDefinition);
			if (result == null)
				result = caseASTNode(mAbstractMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MCONSTRUCTOR_DEFINITION: {
			MConstructorDefinition mConstructorDefinition = (MConstructorDefinition) theEObject;
			T result = caseMConstructorDefinition(mConstructorDefinition);
			if (result == null)
				result = caseMAbstractMethodDefinition(mConstructorDefinition);
			if (result == null)
				result = caseConstructorDeclaration(mConstructorDefinition);
			if (result == null)
				result = caseMDefinition(mConstructorDefinition);
			if (result == null)
				result = caseAbstractMethodDeclaration(mConstructorDefinition);
			if (result == null)
				result = caseBodyDeclaration(mConstructorDefinition);
			if (result == null)
				result = caseNamedElement(mConstructorDefinition);
			if (result == null)
				result = caseASTNode(mConstructorDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MDEFINITION: {
			MDefinition mDefinition = (MDefinition) theEObject;
			T result = caseMDefinition(mDefinition);
			if (result == null)
				result = caseBodyDeclaration(mDefinition);
			if (result == null)
				result = caseNamedElement(mDefinition);
			if (result == null)
				result = caseASTNode(mDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_SIGNATURE: {
			MMethodSignature mMethodSignature = (MMethodSignature) theEObject;
			T result = caseMMethodSignature(mMethodSignature);
			if (result == null)
				result = caseMSignature(mMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MNAME: {
			MName mName = (MName) theEObject;
			T result = caseMName(mName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_NAME: {
			MMethodName mMethodName = (MMethodName) theEObject;
			T result = caseMMethodName(mMethodName);
			if (result == null)
				result = caseMName(mMethodName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_NAME: {
			MFieldName mFieldName = (MFieldName) theEObject;
			T result = caseMFieldName(mFieldName);
			if (result == null)
				result = caseMName(mFieldName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_DEFINITION: {
			MFieldDefinition mFieldDefinition = (MFieldDefinition) theEObject;
			T result = caseMFieldDefinition(mFieldDefinition);
			if (result == null)
				result = caseMDefinition(mFieldDefinition);
			if (result == null)
				result = caseFieldDeclaration(mFieldDefinition);
			if (result == null)
				result = caseBodyDeclaration(mFieldDefinition);
			if (result == null)
				result = caseAbstractVariablesContainer(mFieldDefinition);
			if (result == null)
				result = caseNamedElement(mFieldDefinition);
			if (result == null)
				result = caseASTNode(mFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_DEFINITION: {
			MMethodDefinition mMethodDefinition = (MMethodDefinition) theEObject;
			T result = caseMMethodDefinition(mMethodDefinition);
			if (result == null)
				result = caseMethodDeclaration(mMethodDefinition);
			if (result == null)
				result = caseMAbstractMethodDefinition(mMethodDefinition);
			if (result == null)
				result = caseAbstractMethodDeclaration(mMethodDefinition);
			if (result == null)
				result = caseMDefinition(mMethodDefinition);
			if (result == null)
				result = caseBodyDeclaration(mMethodDefinition);
			if (result == null)
				result = caseNamedElement(mMethodDefinition);
			if (result == null)
				result = caseASTNode(mMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MSIGNATURE: {
			MSignature mSignature = (MSignature) theEObject;
			T result = caseMSignature(mSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MENTRY: {
			MEntry mEntry = (MEntry) theEObject;
			T result = caseMEntry(mEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MGRAVITY_MODEL: {
			MGravityModel mGravityModel = (MGravityModel) theEObject;
			T result = caseMGravityModel(mGravityModel);
			if (result == null)
				result = caseModel(mGravityModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_SIGNATURE: {
			MFieldSignature mFieldSignature = (MFieldSignature) theEObject;
			T result = caseMFieldSignature(mFieldSignature);
			if (result == null)
				result = caseMSignature(mFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractMethodDefinition(MAbstractMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConstructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConstructor Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConstructorDefinition(MConstructorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinition(MDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodSignature(MMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMName(MName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodName(MMethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldName(MFieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldDefinition(MFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodDefinition(MMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignature(MSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEntry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEntry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEntry(MEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGravity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGravity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGravityModel(MGravityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldSignature(MFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode(ASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration(BodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration(AbstractMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclaration(ConstructorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer(AbstractVariablesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclaration(FieldDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration(MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
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

} //ModiscoSwitch
