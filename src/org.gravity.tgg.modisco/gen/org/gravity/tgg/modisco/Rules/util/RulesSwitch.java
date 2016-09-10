/**
 */
package org.gravity.tgg.modisco.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gravity.tgg.modisco.Rules.AbstractMethodInvocationSource;
import org.gravity.tgg.modisco.Rules.Annotatio;
import org.gravity.tgg.modisco.Rules.AnnotationType;
import org.gravity.tgg.modisco.Rules.AnnotationTypeWithValue;
import org.gravity.tgg.modisco.Rules.AnonymousClass;
import org.gravity.tgg.modisco.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.Rules.ClassImplementsInterface;
import org.gravity.tgg.modisco.Rules.ClassInnerConstructor;
import org.gravity.tgg.modisco.Rules.ClassInnerMethode;
import org.gravity.tgg.modisco.Rules.CompilationUnit;
import org.gravity.tgg.modisco.Rules.Constructor;
import org.gravity.tgg.modisco.Rules.ConstructorInvocationSource;
import org.gravity.tgg.modisco.Rules.FieldAccessSource;
import org.gravity.tgg.modisco.Rules.FieldAccessTarget;
import org.gravity.tgg.modisco.Rules.FieldDefinition;
import org.gravity.tgg.modisco.Rules.FieldName;
import org.gravity.tgg.modisco.Rules.FieldSignature;
import org.gravity.tgg.modisco.Rules.FieldType;
import org.gravity.tgg.modisco.Rules.Interface;
import org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.Rules.LinkDefinitionToClass;
import org.gravity.tgg.modisco.Rules.LinkSignatureToType;
import org.gravity.tgg.modisco.Rules.MethodDefinition;
import org.gravity.tgg.modisco.Rules.MethodInvocationSource;
import org.gravity.tgg.modisco.Rules.MethodInvocationTarget;
import org.gravity.tgg.modisco.Rules.MethodName;
import org.gravity.tgg.modisco.Rules.MethodParameter;
import org.gravity.tgg.modisco.Rules.MethodParameterLink;
import org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.Rules.MethodParameterType;
import org.gravity.tgg.modisco.Rules.MethodSignature;
import org.gravity.tgg.modisco.Rules.ModelToPg;
import org.gravity.tgg.modisco.Rules.NestedAnnotationType;
import org.gravity.tgg.modisco.Rules.NestedClassInType;
import org.gravity.tgg.modisco.Rules.NestedEnum;
import org.gravity.tgg.modisco.Rules.NestedInterfaceInType;
import org.gravity.tgg.modisco.Rules.NestedTypes;
import org.gravity.tgg.modisco.Rules.PackageToPGPackage;
import org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass;
import org.gravity.tgg.modisco.Rules.ReturnType;
import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SignatureReturnType;
import org.gravity.tgg.modisco.Rules.SubPackageToPGPackage;
import org.gravity.tgg.modisco.Rules.SuperConstructorInvocationSource;
import org.gravity.tgg.modisco.Rules.SuperMethodInvocationSource;
import org.gravity.tgg.modisco.Rules.TypeParameter;
import org.gravity.tgg.modisco.Rules.Types;
import org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration;

import org.moflon.tgg.runtime.AbstractRule;

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
 * @see org.gravity.tgg.modisco.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
		case RulesPackage.COMPILATION_UNIT: {
			CompilationUnit compilationUnit = (CompilationUnit) theEObject;
			T result = caseCompilationUnit(compilationUnit);
			if (result == null)
				result = caseAbstractRule(compilationUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.MODEL_TO_PG: {
			ModelToPg modelToPg = (ModelToPg) theEObject;
			T result = caseModelToPg(modelToPg);
			if (result == null)
				result = caseAbstractRule(modelToPg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PACKAGE_TO_PG_PACKAGE: {
			PackageToPGPackage packageToPGPackage = (PackageToPGPackage) theEObject;
			T result = casePackageToPGPackage(packageToPGPackage);
			if (result == null)
				result = caseAbstractRule(packageToPGPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE: {
			SubPackageToPGPackage subPackageToPGPackage = (SubPackageToPGPackage) theEObject;
			T result = caseSubPackageToPGPackage(subPackageToPGPackage);
			if (result == null)
				result = caseAbstractRule(subPackageToPGPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPES: {
			Types types = (Types) theEObject;
			T result = caseTypes(types);
			if (result == null)
				result = caseAbstractRule(types);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_INTERFACE_IN_TYPE: {
			NestedInterfaceInType nestedInterfaceInType = (NestedInterfaceInType) theEObject;
			T result = caseNestedInterfaceInType(nestedInterfaceInType);
			if (result == null)
				result = caseAbstractRule(nestedInterfaceInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS: {
			ParameterizedTypeToClass parameterizedTypeToClass = (ParameterizedTypeToClass) theEObject;
			T result = caseParameterizedTypeToClass(parameterizedTypeToClass);
			if (result == null)
				result = caseAbstractRule(parameterizedTypeToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_CLASS_IN_TYPE: {
			NestedClassInType nestedClassInType = (NestedClassInType) theEObject;
			T result = caseNestedClassInType(nestedClassInType);
			if (result == null)
				result = caseAbstractRule(nestedClassInType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SIGNATURE_RETURN_TYPE: {
			SignatureReturnType signatureReturnType = (SignatureReturnType) theEObject;
			T result = caseSignatureReturnType(signatureReturnType);
			if (result == null)
				result = caseAbstractRule(signatureReturnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE: {
			Interface interface_ = (Interface) theEObject;
			T result = caseInterface(interface_);
			if (result == null)
				result = caseAbstractRule(interface_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_SIGNATURE: {
			FieldSignature fieldSignature = (FieldSignature) theEObject;
			T result = caseFieldSignature(fieldSignature);
			if (result == null)
				result = caseAbstractRule(fieldSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ABSTRACT_METHOD_INVOCATION_SOURCE: {
			AbstractMethodInvocationSource abstractMethodInvocationSource = (AbstractMethodInvocationSource) theEObject;
			T result = caseAbstractMethodInvocationSource(abstractMethodInvocationSource);
			if (result == null)
				result = caseAbstractRule(abstractMethodInvocationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPES_TO_CLASS: {
			PrimitiveTypesToClass primitiveTypesToClass = (PrimitiveTypesToClass) theEObject;
			T result = casePrimitiveTypesToClass(primitiveTypesToClass);
			if (result == null)
				result = caseAbstractRule(primitiveTypesToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_TYPE: {
			MethodParameterType methodParameterType = (MethodParameterType) theEObject;
			T result = caseMethodParameterType(methodParameterType);
			if (result == null)
				result = caseAbstractRule(methodParameterType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_TYPES: {
			NestedTypes nestedTypes = (NestedTypes) theEObject;
			T result = caseNestedTypes(nestedTypes);
			if (result == null)
				result = caseAbstractRule(nestedTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE: {
			AnnotationType annotationType = (AnnotationType) theEObject;
			T result = caseAnnotationType(annotationType);
			if (result == null)
				result = caseAbstractRule(annotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS_SOURCE: {
			FieldAccessSource fieldAccessSource = (FieldAccessSource) theEObject;
			T result = caseFieldAccessSource(fieldAccessSource);
			if (result == null)
				result = caseAbstractRule(fieldAccessSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE: {
			InterfaceExtendsInterface interfaceExtendsInterface = (InterfaceExtendsInterface) theEObject;
			T result = caseInterfaceExtendsInterface(interfaceExtendsInterface);
			if (result == null)
				result = caseAbstractRule(interfaceExtendsInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_EXTENDS_CLASS: {
			ClassExtendsClass classExtendsClass = (ClassExtendsClass) theEObject;
			T result = caseClassExtendsClass(classExtendsClass);
			if (result == null)
				result = caseAbstractRule(classExtendsClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE: {
			ClassImplementsInterface classImplementsInterface = (ClassImplementsInterface) theEObject;
			T result = caseClassImplementsInterface(classImplementsInterface);
			if (result == null)
				result = caseAbstractRule(classImplementsInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INNER_METHODE: {
			ClassInnerMethode classInnerMethode = (ClassInnerMethode) theEObject;
			T result = caseClassInnerMethode(classInnerMethode);
			if (result == null)
				result = caseAbstractRule(classInnerMethode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS_INNER_CONSTRUCTOR: {
			ClassInnerConstructor classInnerConstructor = (ClassInnerConstructor) theEObject;
			T result = caseClassInnerConstructor(classInnerConstructor);
			if (result == null)
				result = caseAbstractRule(classInnerConstructor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION_TARGET: {
			MethodInvocationTarget methodInvocationTarget = (MethodInvocationTarget) theEObject;
			T result = caseMethodInvocationTarget(methodInvocationTarget);
			if (result == null)
				result = caseAbstractRule(methodInvocationTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_NAME: {
			FieldName fieldName = (FieldName) theEObject;
			T result = caseFieldName(fieldName);
			if (result == null)
				result = caseAbstractRule(fieldName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_DEFINITION: {
			FieldDefinition fieldDefinition = (FieldDefinition) theEObject;
			T result = caseFieldDefinition(fieldDefinition);
			if (result == null)
				result = caseAbstractRule(fieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LINK_DEFINITION_TO_CLASS: {
			LinkDefinitionToClass linkDefinitionToClass = (LinkDefinitionToClass) theEObject;
			T result = caseLinkDefinitionToClass(linkDefinitionToClass);
			if (result == null)
				result = caseAbstractRule(linkDefinitionToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CLASS: {
			org.gravity.tgg.modisco.Rules.Class class_ = (org.gravity.tgg.modisco.Rules.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseAbstractRule(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_TYPE: {
			FieldType fieldType = (FieldType) theEObject;
			T result = caseFieldType(fieldType);
			if (result == null)
				result = caseAbstractRule(fieldType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_ANNOTATION_TYPE: {
			NestedAnnotationType nestedAnnotationType = (NestedAnnotationType) theEObject;
			T result = caseNestedAnnotationType(nestedAnnotationType);
			if (result == null)
				result = caseAbstractRule(nestedAnnotationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE: {
			AnnotationTypeWithValue annotationTypeWithValue = (AnnotationTypeWithValue) theEObject;
			T result = caseAnnotationTypeWithValue(annotationTypeWithValue);
			if (result == null)
				result = caseAbstractRule(annotationTypeWithValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_INT: {
			PrimitiveTypeIsInt primitiveTypeIsInt = (PrimitiveTypeIsInt) theEObject;
			T result = casePrimitiveTypeIsInt(primitiveTypeIsInt);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANONYMOUS_CLASS: {
			AnonymousClass anonymousClass = (AnonymousClass) theEObject;
			T result = caseAnonymousClass(anonymousClass);
			if (result == null)
				result = caseAbstractRule(anonymousClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST: {
			MethodParameterLinkFirst methodParameterLinkFirst = (MethodParameterLinkFirst) theEObject;
			T result = caseMethodParameterLinkFirst(methodParameterLinkFirst);
			if (result == null)
				result = caseAbstractRule(methodParameterLinkFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_SIGNATURE: {
			MethodSignature methodSignature = (MethodSignature) theEObject;
			T result = caseMethodSignature(methodSignature);
			if (result == null)
				result = caseAbstractRule(methodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ARRAY_TYPE_TO_CLASS: {
			ArrayTypeToClass arrayTypeToClass = (ArrayTypeToClass) theEObject;
			T result = caseArrayTypeToClass(arrayTypeToClass);
			if (result == null)
				result = caseAbstractRule(arrayTypeToClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN: {
			PrimitiveTypeIsBoolean primitiveTypeIsBoolean = (PrimitiveTypeIsBoolean) theEObject;
			T result = casePrimitiveTypeIsBoolean(primitiveTypeIsBoolean);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_CHAR: {
			PrimitiveTypeIsChar primitiveTypeIsChar = (PrimitiveTypeIsChar) theEObject;
			T result = casePrimitiveTypeIsChar(primitiveTypeIsChar);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsChar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE: {
			PrimitiveTypeIsByte primitiveTypeIsByte = (PrimitiveTypeIsByte) theEObject;
			T result = casePrimitiveTypeIsByte(primitiveTypeIsByte);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_SHORT: {
			PrimitiveTypeIsShort primitiveTypeIsShort = (PrimitiveTypeIsShort) theEObject;
			T result = casePrimitiveTypeIsShort(primitiveTypeIsShort);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsShort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_LONG: {
			PrimitiveTypeIsLong primitiveTypeIsLong = (PrimitiveTypeIsLong) theEObject;
			T result = casePrimitiveTypeIsLong(primitiveTypeIsLong);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_FLOAT: {
			PrimitiveTypeIsFloat primitiveTypeIsFloat = (PrimitiveTypeIsFloat) theEObject;
			T result = casePrimitiveTypeIsFloat(primitiveTypeIsFloat);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPE_IS_DOUBLE: {
			PrimitiveTypeIsDouble primitiveTypeIsDouble = (PrimitiveTypeIsDouble) theEObject;
			T result = casePrimitiveTypeIsDouble(primitiveTypeIsDouble);
			if (result == null)
				result = caseAbstractRule(primitiveTypeIsDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_DEFINITION: {
			MethodDefinition methodDefinition = (MethodDefinition) theEObject;
			T result = caseMethodDefinition(methodDefinition);
			if (result == null)
				result = caseAbstractRule(methodDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ANNOTATIO: {
			Annotatio annotatio = (Annotatio) theEObject;
			T result = caseAnnotatio(annotatio);
			if (result == null)
				result = caseAbstractRule(annotatio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NESTED_ENUM: {
			NestedEnum nestedEnum = (NestedEnum) theEObject;
			T result = caseNestedEnum(nestedEnum);
			if (result == null)
				result = caseAbstractRule(nestedEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIMITIVE_TYPES_IS_VOID: {
			PrimitiveTypesIsVoid primitiveTypesIsVoid = (PrimitiveTypesIsVoid) theEObject;
			T result = casePrimitiveTypesIsVoid(primitiveTypesIsVoid);
			if (result == null)
				result = caseAbstractRule(primitiveTypesIsVoid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.RETURN_TYPE: {
			ReturnType returnType = (ReturnType) theEObject;
			T result = caseReturnType(returnType);
			if (result == null)
				result = caseAbstractRule(returnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER_LINK: {
			MethodParameterLink methodParameterLink = (MethodParameterLink) theEObject;
			T result = caseMethodParameterLink(methodParameterLink);
			if (result == null)
				result = caseAbstractRule(methodParameterLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_NAME: {
			MethodName methodName = (MethodName) theEObject;
			T result = caseMethodName(methodName);
			if (result == null)
				result = caseAbstractRule(methodName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LINK_SIGNATURE_TO_TYPE: {
			LinkSignatureToType linkSignatureToType = (LinkSignatureToType) theEObject;
			T result = caseLinkSignatureToType(linkSignatureToType);
			if (result == null)
				result = caseAbstractRule(linkSignatureToType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_PARAMETER: {
			MethodParameter methodParameter = (MethodParameter) theEObject;
			T result = caseMethodParameter(methodParameter);
			if (result == null)
				result = caseAbstractRule(methodParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIELD_ACCESS_TARGET: {
			FieldAccessTarget fieldAccessTarget = (FieldAccessTarget) theEObject;
			T result = caseFieldAccessTarget(fieldAccessTarget);
			if (result == null)
				result = caseAbstractRule(fieldAccessTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENUM: {
			org.gravity.tgg.modisco.Rules.Enum enum_ = (org.gravity.tgg.modisco.Rules.Enum) theEObject;
			T result = caseEnum(enum_);
			if (result == null)
				result = caseAbstractRule(enum_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.METHOD_INVOCATION_SOURCE: {
			MethodInvocationSource methodInvocationSource = (MethodInvocationSource) theEObject;
			T result = caseMethodInvocationSource(methodInvocationSource);
			if (result == null)
				result = caseAbstractRule(methodInvocationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUPER_METHOD_INVOCATION_SOURCE: {
			SuperMethodInvocationSource superMethodInvocationSource = (SuperMethodInvocationSource) theEObject;
			T result = caseSuperMethodInvocationSource(superMethodInvocationSource);
			if (result == null)
				result = caseAbstractRule(superMethodInvocationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE: {
			ConstructorInvocationSource constructorInvocationSource = (ConstructorInvocationSource) theEObject;
			T result = caseConstructorInvocationSource(constructorInvocationSource);
			if (result == null)
				result = caseAbstractRule(constructorInvocationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION_SOURCE: {
			SuperConstructorInvocationSource superConstructorInvocationSource = (SuperConstructorInvocationSource) theEObject;
			T result = caseSuperConstructorInvocationSource(superConstructorInvocationSource);
			if (result == null)
				result = caseAbstractRule(superConstructorInvocationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TYPE_PARAMETER: {
			TypeParameter typeParameter = (TypeParameter) theEObject;
			T result = caseTypeParameter(typeParameter);
			if (result == null)
				result = caseAbstractRule(typeParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONSTRUCTOR: {
			Constructor constructor = (Constructor) theEObject;
			T result = caseConstructor(constructor);
			if (result == null)
				result = caseAbstractRule(constructor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION: {
			UnresolvedTypeDeclaration unresolvedTypeDeclaration = (UnresolvedTypeDeclaration) theEObject;
			T result = caseUnresolvedTypeDeclaration(unresolvedTypeDeclaration);
			if (result == null)
				result = caseAbstractRule(unresolvedTypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Pg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Pg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToPg(ModelToPg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To PG Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToPGPackage(PackageToPGPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Package To PG Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPackageToPGPackage(SubPackageToPGPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Interface In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Interface In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedInterfaceInType(NestedInterfaceInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedTypeToClass(ParameterizedTypeToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Class In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Class In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedClassInType(NestedClassInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureReturnType(SignatureReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSignature(FieldSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocationSource(AbstractMethodInvocationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Types To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Types To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypesToClass(PrimitiveTypesToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterType(MethodParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedTypes(NestedTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessSource(FieldAccessSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Extends Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Extends Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceExtendsInterface(InterfaceExtendsInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Extends Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Extends Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExtendsClass(ClassExtendsClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Implements Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Implements Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassImplementsInterface(ClassImplementsInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerMethode(ClassInnerMethode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerConstructor(ClassInnerConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationTarget(MethodInvocationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldName(FieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinition(FieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Definition To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Definition To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDefinitionToClass(LinkDefinitionToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.gravity.tgg.modisco.Rules.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedAnnotationType(NestedAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type With Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type With Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeWithValue(AnnotationTypeWithValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsInt(PrimitiveTypeIsInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass(AnonymousClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLinkFirst(MethodParameterLinkFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignature(MethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type To Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeToClass(ArrayTypeToClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsBoolean(PrimitiveTypeIsBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsChar(PrimitiveTypeIsChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsByte(PrimitiveTypeIsByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsShort(PrimitiveTypeIsShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsLong(PrimitiveTypeIsLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsFloat(PrimitiveTypeIsFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsDouble(PrimitiveTypeIsDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinition(MethodDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotatio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotatio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatio(Annotatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedEnum(NestedEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Types Is Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Types Is Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypesIsVoid(PrimitiveTypesIsVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLink(MethodParameterLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodName(MethodName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Signature To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Signature To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkSignatureToType(LinkSignatureToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameter(MethodParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessTarget(FieldAccessTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.gravity.tgg.modisco.Rules.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationSource(MethodInvocationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocationSource(SuperMethodInvocationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocationSource(ConstructorInvocationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocationSource(SuperConstructorInvocationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
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

} //RulesSwitch
