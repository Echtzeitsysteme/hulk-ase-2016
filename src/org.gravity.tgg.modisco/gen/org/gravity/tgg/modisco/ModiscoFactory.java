/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.ModiscoPackage
 * @generated
 */
public interface ModiscoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoFactory eINSTANCE = org.gravity.tgg.modisco.impl.ModiscoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compilation Unit To TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit To TInterface</em>'.
	 * @generated
	 */
	CompilationUnitToTInterface createCompilationUnitToTInterface();

	/**
	 * Returns a new object of class '<em>Expression To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression To TField Definition</em>'.
	 * @generated
	 */
	ExpressionToTFieldDefinition createExpressionToTFieldDefinition();

	/**
	 * Returns a new object of class '<em>MField Definition To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Definition To TField Definition</em>'.
	 * @generated
	 */
	MFieldDefinitionToTFieldDefinition createMFieldDefinitionToTFieldDefinition();

	/**
	 * Returns a new object of class '<em>MConstructor Definition To TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MConstructor Definition To TParameter List</em>'.
	 * @generated
	 */
	MConstructorDefinitionToTParameterList createMConstructorDefinitionToTParameterList();

	/**
	 * Returns a new object of class '<em>Compilation Unit To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit To TClass</em>'.
	 * @generated
	 */
	CompilationUnitToTClass createCompilationUnitToTClass();

	/**
	 * Returns a new object of class '<em>Compilation Unit To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit To Type Graph</em>'.
	 * @generated
	 */
	CompilationUnitToTypeGraph createCompilationUnitToTypeGraph();

	/**
	 * Returns a new object of class '<em>Compilation Unit To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit To TPackage</em>'.
	 * @generated
	 */
	CompilationUnitToTPackage createCompilationUnitToTPackage();

	/**
	 * Returns a new object of class '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package To TPackage</em>'.
	 * @generated
	 */
	PackageToTPackage createPackageToTPackage();

	/**
	 * Returns a new object of class '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model To Type Graph</em>'.
	 * @generated
	 */
	ModelToTypeGraph createModelToTypeGraph();

	/**
	 * Returns a new object of class '<em>Field Declaration To TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Declaration To TField</em>'.
	 * @generated
	 */
	FieldDeclarationToTField createFieldDeclarationToTField();

	/**
	 * Returns a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @generated
	 */
	VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns a new object of class '<em>Method Declaration To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Declaration To TMethod Signature</em>'.
	 * @generated
	 */
	MethodDeclarationToTMethodSignature createMethodDeclarationToTMethodSignature();

	/**
	 * Returns a new object of class '<em>Statement To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement To TMethod Definition</em>'.
	 * @generated
	 */
	StatementToTMethodDefinition createStatementToTMethodDefinition();

	/**
	 * Returns a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @generated
	 */
	AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess();

	/**
	 * Returns a new object of class '<em>Type Access To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Access To TField Signature</em>'.
	 * @generated
	 */
	TypeAccessToTFieldSignature createTypeAccessToTFieldSignature();

	/**
	 * Returns a new object of class '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MDefinition To TMember</em>'.
	 * @generated
	 */
	MDefinitionToTMember createMDefinitionToTMember();

	/**
	 * Returns a new object of class '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access To TAccess</em>'.
	 * @generated
	 */
	FieldAccessToTAccess createFieldAccessToTAccess();

	/**
	 * Returns a new object of class '<em>Primitive Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type To TClass</em>'.
	 * @generated
	 */
	PrimitiveTypeToTClass createPrimitiveTypeToTClass();

	/**
	 * Returns a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @generated
	 */
	AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Name To TMethod</em>'.
	 * @generated
	 */
	MMethodNameToTMethod createMMethodNameToTMethod();

	/**
	 * Returns a new object of class '<em>MMethod Signature To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Signature To TMethod Signature</em>'.
	 * @generated
	 */
	MMethodSignatureToTMethodSignature createMMethodSignatureToTMethodSignature();

	/**
	 * Returns a new object of class '<em>MMethod Signature To TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Signature To TParameter List</em>'.
	 * @generated
	 */
	MMethodSignatureToTParameterList createMMethodSignatureToTParameterList();

	/**
	 * Returns a new object of class '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEntry To TParameter</em>'.
	 * @generated
	 */
	MEntryToTParameter createMEntryToTParameter();

	/**
	 * Returns a new object of class '<em>Block To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block To TMethod Definition</em>'.
	 * @generated
	 */
	BlockToTMethodDefinition createBlockToTMethodDefinition();

	/**
	 * Returns a new object of class '<em>Method Declaration To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Declaration To TMethod</em>'.
	 * @generated
	 */
	MethodDeclarationToTMethod createMethodDeclarationToTMethod();

	/**
	 * Returns a new object of class '<em>Method Declaration To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Declaration To TMethod Definition</em>'.
	 * @generated
	 */
	MethodDeclarationToTMethodDefinition createMethodDeclarationToTMethodDefinition();

	/**
	 * Returns a new object of class '<em>Single Variable Declaration To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Variable Declaration To TParameter</em>'.
	 * @generated
	 */
	SingleVariableDeclarationToTParameter createSingleVariableDeclarationToTParameter();

	/**
	 * Returns a new object of class '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSignature To TSignature</em>'.
	 * @generated
	 */
	MSignatureToTSignature createMSignatureToTSignature();

	/**
	 * Returns a new object of class '<em>MField Signature To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Signature To TField Signature</em>'.
	 * @generated
	 */
	MFieldSignatureToTFieldSignature createMFieldSignatureToTFieldSignature();

	/**
	 * Returns a new object of class '<em>Body Declaration To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Declaration To TAnnotatable</em>'.
	 * @generated
	 */
	BodyDeclarationToTAnnotatable createBodyDeclarationToTAnnotatable();

	/**
	 * Returns a new object of class '<em>Field Declaration To TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Declaration To TField Signature</em>'.
	 * @generated
	 */
	FieldDeclarationToTFieldSignature createFieldDeclarationToTFieldSignature();

	/**
	 * Returns a new object of class '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type To TAbstract Type</em>'.
	 * @generated
	 */
	TypeToTAbstractType createTypeToTAbstractType();

	/**
	 * Returns a new object of class '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Name To TField</em>'.
	 * @generated
	 */
	MFieldNameToTField createMFieldNameToTField();

	/**
	 * Returns a new object of class '<em>Statement To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement To TMember</em>'.
	 * @generated
	 */
	StatementToTMember createStatementToTMember();

	/**
	 * Returns a new object of class '<em>MSignature To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSignature To TMethod Signature</em>'.
	 * @generated
	 */
	MSignatureToTMethodSignature createMSignatureToTMethodSignature();

	/**
	 * Returns a new object of class '<em>MDefinition To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MDefinition To TSignature</em>'.
	 * @generated
	 */
	MDefinitionToTSignature createMDefinitionToTSignature();

	/**
	 * Returns a new object of class '<em>Single Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Variable Access To TAccess</em>'.
	 * @generated
	 */
	SingleVariableAccessToTAccess createSingleVariableAccessToTAccess();

	/**
	 * Returns a new object of class '<em>Constructor Declaration To TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Declaration To TMethod Definition</em>'.
	 * @generated
	 */
	ConstructorDeclarationToTMethodDefinition createConstructorDeclarationToTMethodDefinition();

	/**
	 * Returns a new object of class '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation To TAnnotation</em>'.
	 * @generated
	 */
	AnnotationToTAnnotation createAnnotationToTAnnotation();

	/**
	 * Returns a new object of class '<em>Constructor Declaration To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Declaration To TMethod</em>'.
	 * @generated
	 */
	ConstructorDeclarationToTMethod createConstructorDeclarationToTMethod();

	/**
	 * Returns a new object of class '<em>Constructor Declaration To TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Declaration To TMethod Signature</em>'.
	 * @generated
	 */
	ConstructorDeclarationToTMethodSignature createConstructorDeclarationToTMethodSignature();

	/**
	 * Returns a new object of class '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter To TClass</em>'.
	 * @generated
	 */
	TypeParameterToTClass createTypeParameterToTClass();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoPackage getModiscoPackage();

} //ModiscoFactory
