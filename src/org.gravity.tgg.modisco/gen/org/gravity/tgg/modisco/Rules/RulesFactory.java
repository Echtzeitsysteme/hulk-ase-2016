/**
 */
package org.gravity.tgg.modisco.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.gravity.tgg.modisco.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns a new object of class '<em>Model To Pg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model To Pg</em>'.
	 * @generated
	 */
	ModelToPg createModelToPg();

	/**
	 * Returns a new object of class '<em>Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package To PG Package</em>'.
	 * @generated
	 */
	PackageToPGPackage createPackageToPGPackage();

	/**
	 * Returns a new object of class '<em>Sub Package To PG Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Package To PG Package</em>'.
	 * @generated
	 */
	SubPackageToPGPackage createSubPackageToPGPackage();

	/**
	 * Returns a new object of class '<em>Nested Interface In Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Interface In Type</em>'.
	 * @generated
	 */
	NestedInterfaceInType createNestedInterfaceInType();

	/**
	 * Returns a new object of class '<em>Parameterized Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Type To Class</em>'.
	 * @generated
	 */
	ParameterizedTypeToClass createParameterizedTypeToClass();

	/**
	 * Returns a new object of class '<em>Nested Class In Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Class In Type</em>'.
	 * @generated
	 */
	NestedClassInType createNestedClassInType();

	/**
	 * Returns a new object of class '<em>Signature Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Return Type</em>'.
	 * @generated
	 */
	SignatureReturnType createSignatureReturnType();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Field Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Signature</em>'.
	 * @generated
	 */
	FieldSignature createFieldSignature();

	/**
	 * Returns a new object of class '<em>Method Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Type</em>'.
	 * @generated
	 */
	MethodParameterType createMethodParameterType();

	/**
	 * Returns a new object of class '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type</em>'.
	 * @generated
	 */
	AnnotationType createAnnotationType();

	/**
	 * Returns a new object of class '<em>Field Access Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access Source</em>'.
	 * @generated
	 */
	FieldAccessSource createFieldAccessSource();

	/**
	 * Returns a new object of class '<em>Interface Extends Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Extends Interface</em>'.
	 * @generated
	 */
	InterfaceExtendsInterface createInterfaceExtendsInterface();

	/**
	 * Returns a new object of class '<em>Class Extends Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Extends Class</em>'.
	 * @generated
	 */
	ClassExtendsClass createClassExtendsClass();

	/**
	 * Returns a new object of class '<em>Class Implements Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Implements Interface</em>'.
	 * @generated
	 */
	ClassImplementsInterface createClassImplementsInterface();

	/**
	 * Returns a new object of class '<em>Class Inner Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Inner Methode</em>'.
	 * @generated
	 */
	ClassInnerMethode createClassInnerMethode();

	/**
	 * Returns a new object of class '<em>Class Inner Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Inner Constructor</em>'.
	 * @generated
	 */
	ClassInnerConstructor createClassInnerConstructor();

	/**
	 * Returns a new object of class '<em>Method Invocation Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation Target</em>'.
	 * @generated
	 */
	MethodInvocationTarget createMethodInvocationTarget();

	/**
	 * Returns a new object of class '<em>Field Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Name</em>'.
	 * @generated
	 */
	FieldName createFieldName();

	/**
	 * Returns a new object of class '<em>Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Definition</em>'.
	 * @generated
	 */
	FieldDefinition createFieldDefinition();

	/**
	 * Returns a new object of class '<em>Link Definition To Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Definition To Class</em>'.
	 * @generated
	 */
	LinkDefinitionToClass createLinkDefinitionToClass();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Type</em>'.
	 * @generated
	 */
	FieldType createFieldType();

	/**
	 * Returns a new object of class '<em>Nested Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Annotation Type</em>'.
	 * @generated
	 */
	NestedAnnotationType createNestedAnnotationType();

	/**
	 * Returns a new object of class '<em>Annotation Type With Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type With Value</em>'.
	 * @generated
	 */
	AnnotationTypeWithValue createAnnotationTypeWithValue();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Int</em>'.
	 * @generated
	 */
	PrimitiveTypeIsInt createPrimitiveTypeIsInt();

	/**
	 * Returns a new object of class '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class</em>'.
	 * @generated
	 */
	AnonymousClass createAnonymousClass();

	/**
	 * Returns a new object of class '<em>Method Parameter Link First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Link First</em>'.
	 * @generated
	 */
	MethodParameterLinkFirst createMethodParameterLinkFirst();

	/**
	 * Returns a new object of class '<em>Method Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Signature</em>'.
	 * @generated
	 */
	MethodSignature createMethodSignature();

	/**
	 * Returns a new object of class '<em>Array Type To Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type To Class</em>'.
	 * @generated
	 */
	ArrayTypeToClass createArrayTypeToClass();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Boolean</em>'.
	 * @generated
	 */
	PrimitiveTypeIsBoolean createPrimitiveTypeIsBoolean();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Char</em>'.
	 * @generated
	 */
	PrimitiveTypeIsChar createPrimitiveTypeIsChar();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Byte</em>'.
	 * @generated
	 */
	PrimitiveTypeIsByte createPrimitiveTypeIsByte();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Short</em>'.
	 * @generated
	 */
	PrimitiveTypeIsShort createPrimitiveTypeIsShort();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Long</em>'.
	 * @generated
	 */
	PrimitiveTypeIsLong createPrimitiveTypeIsLong();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Float</em>'.
	 * @generated
	 */
	PrimitiveTypeIsFloat createPrimitiveTypeIsFloat();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Double</em>'.
	 * @generated
	 */
	PrimitiveTypeIsDouble createPrimitiveTypeIsDouble();

	/**
	 * Returns a new object of class '<em>Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Definition</em>'.
	 * @generated
	 */
	MethodDefinition createMethodDefinition();

	/**
	 * Returns a new object of class '<em>Annotatio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotatio</em>'.
	 * @generated
	 */
	Annotatio createAnnotatio();

	/**
	 * Returns a new object of class '<em>Nested Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Enum</em>'.
	 * @generated
	 */
	NestedEnum createNestedEnum();

	/**
	 * Returns a new object of class '<em>Primitive Types Is Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Types Is Void</em>'.
	 * @generated
	 */
	PrimitiveTypesIsVoid createPrimitiveTypesIsVoid();

	/**
	 * Returns a new object of class '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns a new object of class '<em>Method Parameter Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Link</em>'.
	 * @generated
	 */
	MethodParameterLink createMethodParameterLink();

	/**
	 * Returns a new object of class '<em>Method Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Name</em>'.
	 * @generated
	 */
	MethodName createMethodName();

	/**
	 * Returns a new object of class '<em>Link Signature To Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Signature To Type</em>'.
	 * @generated
	 */
	LinkSignatureToType createLinkSignatureToType();

	/**
	 * Returns a new object of class '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter</em>'.
	 * @generated
	 */
	MethodParameter createMethodParameter();

	/**
	 * Returns a new object of class '<em>Field Access Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access Target</em>'.
	 * @generated
	 */
	FieldAccessTarget createFieldAccessTarget();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Method Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation Source</em>'.
	 * @generated
	 */
	MethodInvocationSource createMethodInvocationSource();

	/**
	 * Returns a new object of class '<em>Super Method Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Invocation Source</em>'.
	 * @generated
	 */
	SuperMethodInvocationSource createSuperMethodInvocationSource();

	/**
	 * Returns a new object of class '<em>Constructor Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Invocation Source</em>'.
	 * @generated
	 */
	ConstructorInvocationSource createConstructorInvocationSource();

	/**
	 * Returns a new object of class '<em>Super Constructor Invocation Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Constructor Invocation Source</em>'.
	 * @generated
	 */
	SuperConstructorInvocationSource createSuperConstructorInvocationSource();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclaration createUnresolvedTypeDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
