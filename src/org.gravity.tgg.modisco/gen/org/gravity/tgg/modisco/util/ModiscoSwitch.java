/**
 */
package org.gravity.tgg.modisco.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

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
 * @see org.gravity.tgg.modisco.ModiscoPackage
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
		case ModiscoPackage.COMPILATION_UNIT_TO_TINTERFACE: {
			CompilationUnitToTInterface compilationUnitToTInterface = (CompilationUnitToTInterface) theEObject;
			T result = caseCompilationUnitToTInterface(compilationUnitToTInterface);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnitToTInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.EXPRESSION_TO_TFIELD_DEFINITION: {
			ExpressionToTFieldDefinition expressionToTFieldDefinition = (ExpressionToTFieldDefinition) theEObject;
			T result = caseExpressionToTFieldDefinition(expressionToTFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(expressionToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_DEFINITION_TO_TFIELD_DEFINITION: {
			MFieldDefinitionToTFieldDefinition mFieldDefinitionToTFieldDefinition = (MFieldDefinitionToTFieldDefinition) theEObject;
			T result = caseMFieldDefinitionToTFieldDefinition(mFieldDefinitionToTFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(mFieldDefinitionToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MCONSTRUCTOR_DEFINITION_TO_TPARAMETER_LIST: {
			MConstructorDefinitionToTParameterList mConstructorDefinitionToTParameterList = (MConstructorDefinitionToTParameterList) theEObject;
			T result = caseMConstructorDefinitionToTParameterList(mConstructorDefinitionToTParameterList);
			if (result == null)
				result = caseAbstractCorrespondence(mConstructorDefinitionToTParameterList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.COMPILATION_UNIT_TO_TCLASS: {
			CompilationUnitToTClass compilationUnitToTClass = (CompilationUnitToTClass) theEObject;
			T result = caseCompilationUnitToTClass(compilationUnitToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnitToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.COMPILATION_UNIT_TO_TYPE_GRAPH: {
			CompilationUnitToTypeGraph compilationUnitToTypeGraph = (CompilationUnitToTypeGraph) theEObject;
			T result = caseCompilationUnitToTypeGraph(compilationUnitToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnitToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.COMPILATION_UNIT_TO_TPACKAGE: {
			CompilationUnitToTPackage compilationUnitToTPackage = (CompilationUnitToTPackage) theEObject;
			T result = caseCompilationUnitToTPackage(compilationUnitToTPackage);
			if (result == null)
				result = caseAbstractCorrespondence(compilationUnitToTPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.PACKAGE_TO_TPACKAGE: {
			PackageToTPackage packageToTPackage = (PackageToTPackage) theEObject;
			T result = casePackageToTPackage(packageToTPackage);
			if (result == null)
				result = caseAbstractCorrespondence(packageToTPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MODEL_TO_TYPE_GRAPH: {
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) theEObject;
			T result = caseModelToTypeGraph(modelToTypeGraph);
			if (result == null)
				result = caseAbstractCorrespondence(modelToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.FIELD_DECLARATION_TO_TFIELD: {
			FieldDeclarationToTField fieldDeclarationToTField = (FieldDeclarationToTField) theEObject;
			T result = caseFieldDeclarationToTField(fieldDeclarationToTField);
			if (result == null)
				result = caseAbstractCorrespondence(fieldDeclarationToTField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION: {
			VariableDeclarationFragmentToTFieldDefinition variableDeclarationFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) theEObject;
			T result = caseVariableDeclarationFragmentToTFieldDefinition(variableDeclarationFragmentToTFieldDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(variableDeclarationFragmentToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD_SIGNATURE: {
			MethodDeclarationToTMethodSignature methodDeclarationToTMethodSignature = (MethodDeclarationToTMethodSignature) theEObject;
			T result = caseMethodDeclarationToTMethodSignature(methodDeclarationToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(methodDeclarationToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.STATEMENT_TO_TMETHOD_DEFINITION: {
			StatementToTMethodDefinition statementToTMethodDefinition = (StatementToTMethodDefinition) theEObject;
			T result = caseStatementToTMethodDefinition(statementToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(statementToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS: {
			AbstractMethodInvocationToTAccess abstractMethodInvocationToTAccess = (AbstractMethodInvocationToTAccess) theEObject;
			T result = caseAbstractMethodInvocationToTAccess(abstractMethodInvocationToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(abstractMethodInvocationToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.TYPE_ACCESS_TO_TFIELD_SIGNATURE: {
			TypeAccessToTFieldSignature typeAccessToTFieldSignature = (TypeAccessToTFieldSignature) theEObject;
			T result = caseTypeAccessToTFieldSignature(typeAccessToTFieldSignature);
			if (result == null)
				result = caseAbstractCorrespondence(typeAccessToTFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MDEFINITION_TO_TMEMBER: {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) theEObject;
			T result = caseMDefinitionToTMember(mDefinitionToTMember);
			if (result == null)
				result = caseAbstractCorrespondence(mDefinitionToTMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.FIELD_ACCESS_TO_TACCESS: {
			FieldAccessToTAccess fieldAccessToTAccess = (FieldAccessToTAccess) theEObject;
			T result = caseFieldAccessToTAccess(fieldAccessToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(fieldAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.PRIMITIVE_TYPE_TO_TCLASS: {
			PrimitiveTypeToTClass primitiveTypeToTClass = (PrimitiveTypeToTClass) theEObject;
			T result = casePrimitiveTypeToTClass(primitiveTypeToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(primitiveTypeToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS: {
			AnonymousClassDeclarationToTClass anonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) theEObject;
			T result = caseAnonymousClassDeclarationToTClass(anonymousClassDeclarationToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(anonymousClassDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_NAME_TO_TMETHOD: {
			MMethodNameToTMethod mMethodNameToTMethod = (MMethodNameToTMethod) theEObject;
			T result = caseMMethodNameToTMethod(mMethodNameToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(mMethodNameToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE: {
			MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) theEObject;
			T result = caseMMethodSignatureToTMethodSignature(mMethodSignatureToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mMethodSignatureToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MMETHOD_SIGNATURE_TO_TPARAMETER_LIST: {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) theEObject;
			T result = caseMMethodSignatureToTParameterList(mMethodSignatureToTParameterList);
			if (result == null)
				result = caseAbstractCorrespondence(mMethodSignatureToTParameterList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MENTRY_TO_TPARAMETER: {
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) theEObject;
			T result = caseMEntryToTParameter(mEntryToTParameter);
			if (result == null)
				result = caseAbstractCorrespondence(mEntryToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.BLOCK_TO_TMETHOD_DEFINITION: {
			BlockToTMethodDefinition blockToTMethodDefinition = (BlockToTMethodDefinition) theEObject;
			T result = caseBlockToTMethodDefinition(blockToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(blockToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD: {
			MethodDeclarationToTMethod methodDeclarationToTMethod = (MethodDeclarationToTMethod) theEObject;
			T result = caseMethodDeclarationToTMethod(methodDeclarationToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(methodDeclarationToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.METHOD_DECLARATION_TO_TMETHOD_DEFINITION: {
			MethodDeclarationToTMethodDefinition methodDeclarationToTMethodDefinition = (MethodDeclarationToTMethodDefinition) theEObject;
			T result = caseMethodDeclarationToTMethodDefinition(methodDeclarationToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(methodDeclarationToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.SINGLE_VARIABLE_DECLARATION_TO_TPARAMETER: {
			SingleVariableDeclarationToTParameter singleVariableDeclarationToTParameter = (SingleVariableDeclarationToTParameter) theEObject;
			T result = caseSingleVariableDeclarationToTParameter(singleVariableDeclarationToTParameter);
			if (result == null)
				result = caseAbstractCorrespondence(singleVariableDeclarationToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MSIGNATURE_TO_TSIGNATURE: {
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) theEObject;
			T result = caseMSignatureToTSignature(mSignatureToTSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mSignatureToTSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_SIGNATURE_TO_TFIELD_SIGNATURE: {
			MFieldSignatureToTFieldSignature mFieldSignatureToTFieldSignature = (MFieldSignatureToTFieldSignature) theEObject;
			T result = caseMFieldSignatureToTFieldSignature(mFieldSignatureToTFieldSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mFieldSignatureToTFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.BODY_DECLARATION_TO_TANNOTATABLE: {
			BodyDeclarationToTAnnotatable bodyDeclarationToTAnnotatable = (BodyDeclarationToTAnnotatable) theEObject;
			T result = caseBodyDeclarationToTAnnotatable(bodyDeclarationToTAnnotatable);
			if (result == null)
				result = caseAbstractCorrespondence(bodyDeclarationToTAnnotatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.FIELD_DECLARATION_TO_TFIELD_SIGNATURE: {
			FieldDeclarationToTFieldSignature fieldDeclarationToTFieldSignature = (FieldDeclarationToTFieldSignature) theEObject;
			T result = caseFieldDeclarationToTFieldSignature(fieldDeclarationToTFieldSignature);
			if (result == null)
				result = caseAbstractCorrespondence(fieldDeclarationToTFieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.TYPE_TO_TABSTRACT_TYPE: {
			TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) theEObject;
			T result = caseTypeToTAbstractType(typeToTAbstractType);
			if (result == null)
				result = caseAbstractCorrespondence(typeToTAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MFIELD_NAME_TO_TFIELD: {
			MFieldNameToTField mFieldNameToTField = (MFieldNameToTField) theEObject;
			T result = caseMFieldNameToTField(mFieldNameToTField);
			if (result == null)
				result = caseAbstractCorrespondence(mFieldNameToTField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.STATEMENT_TO_TMEMBER: {
			StatementToTMember statementToTMember = (StatementToTMember) theEObject;
			T result = caseStatementToTMember(statementToTMember);
			if (result == null)
				result = caseAbstractCorrespondence(statementToTMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MSIGNATURE_TO_TMETHOD_SIGNATURE: {
			MSignatureToTMethodSignature mSignatureToTMethodSignature = (MSignatureToTMethodSignature) theEObject;
			T result = caseMSignatureToTMethodSignature(mSignatureToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mSignatureToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.MDEFINITION_TO_TSIGNATURE: {
			MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) theEObject;
			T result = caseMDefinitionToTSignature(mDefinitionToTSignature);
			if (result == null)
				result = caseAbstractCorrespondence(mDefinitionToTSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.SINGLE_VARIABLE_ACCESS_TO_TACCESS: {
			SingleVariableAccessToTAccess singleVariableAccessToTAccess = (SingleVariableAccessToTAccess) theEObject;
			T result = caseSingleVariableAccessToTAccess(singleVariableAccessToTAccess);
			if (result == null)
				result = caseAbstractCorrespondence(singleVariableAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD_DEFINITION: {
			ConstructorDeclarationToTMethodDefinition constructorDeclarationToTMethodDefinition = (ConstructorDeclarationToTMethodDefinition) theEObject;
			T result = caseConstructorDeclarationToTMethodDefinition(constructorDeclarationToTMethodDefinition);
			if (result == null)
				result = caseAbstractCorrespondence(constructorDeclarationToTMethodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.ANNOTATION_TO_TANNOTATION: {
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) theEObject;
			T result = caseAnnotationToTAnnotation(annotationToTAnnotation);
			if (result == null)
				result = caseAbstractCorrespondence(annotationToTAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD: {
			ConstructorDeclarationToTMethod constructorDeclarationToTMethod = (ConstructorDeclarationToTMethod) theEObject;
			T result = caseConstructorDeclarationToTMethod(constructorDeclarationToTMethod);
			if (result == null)
				result = caseAbstractCorrespondence(constructorDeclarationToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.CONSTRUCTOR_DECLARATION_TO_TMETHOD_SIGNATURE: {
			ConstructorDeclarationToTMethodSignature constructorDeclarationToTMethodSignature = (ConstructorDeclarationToTMethodSignature) theEObject;
			T result = caseConstructorDeclarationToTMethodSignature(constructorDeclarationToTMethodSignature);
			if (result == null)
				result = caseAbstractCorrespondence(constructorDeclarationToTMethodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.TYPE_PARAMETER_TO_TCLASS: {
			TypeParameterToTClass typeParameterToTClass = (TypeParameterToTClass) theEObject;
			T result = caseTypeParameterToTClass(typeParameterToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(typeParameterToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS: {
			UnresolvedTypeDeclarationToTClass unresolvedTypeDeclarationToTClass = (UnresolvedTypeDeclarationToTClass) theEObject;
			T result = caseUnresolvedTypeDeclarationToTClass(unresolvedTypeDeclarationToTClass);
			if (result == null)
				result = caseAbstractCorrespondence(unresolvedTypeDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit To TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit To TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnitToTInterface(CompilationUnitToTInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionToTFieldDefinition(ExpressionToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Definition To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Definition To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldDefinitionToTFieldDefinition(MFieldDefinitionToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConstructor Definition To TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConstructor Definition To TParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConstructorDefinitionToTParameterList(MConstructorDefinitionToTParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnitToTClass(CompilationUnitToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnitToTypeGraph(CompilationUnitToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit To TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnitToTPackage(CompilationUnitToTPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToTPackage(PackageToTPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToTypeGraph(ModelToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration To TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration To TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclarationToTField(FieldDeclarationToTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragmentToTFieldDefinition(VariableDeclarationFragmentToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclarationToTMethodSignature(MethodDeclarationToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementToTMethodDefinition(StatementToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access To TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccessToTFieldSignature(TypeAccessToTFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinitionToTMember(MDefinitionToTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessToTAccess(FieldAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeToTClass(PrimitiveTypeToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodNameToTMethod(MMethodNameToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Signature To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Signature To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodSignatureToTMethodSignature(MMethodSignatureToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Signature To TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Signature To TParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodSignatureToTParameterList(MMethodSignatureToTParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEntryToTParameter(MEntryToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockToTMethodDefinition(BlockToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclarationToTMethod(MethodDeclarationToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclarationToTMethodDefinition(MethodDeclarationToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclarationToTParameter(SingleVariableDeclarationToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignatureToTSignature(MSignatureToTSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Signature To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Signature To TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldSignatureToTFieldSignature(MFieldSignatureToTFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration To TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclarationToTAnnotatable(BodyDeclarationToTAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration To TField Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclarationToTFieldSignature(FieldDeclarationToTFieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToTAbstractType(TypeToTAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldNameToTField(MFieldNameToTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement To TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementToTMember(StatementToTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignatureToTMethodSignature(MSignatureToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition To TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinitionToTSignature(MDefinitionToTSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccessToTAccess(SingleVariableAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclarationToTMethodDefinition(ConstructorDeclarationToTMethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclarationToTMethod(ConstructorDeclarationToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration To TMethod Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclarationToTMethodSignature(ConstructorDeclarationToTMethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameterToTClass(TypeParameterToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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
