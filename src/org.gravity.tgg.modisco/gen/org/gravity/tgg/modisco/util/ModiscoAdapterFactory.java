/**
 */
package org.gravity.tgg.modisco.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gravity.tgg.modisco.*;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.ModiscoPackage
 * @generated
 */
public class ModiscoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModiscoPackage.eINSTANCE;
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
	protected ModiscoSwitch<Adapter> modelSwitch = new ModiscoSwitch<Adapter>() {
		@Override
		public Adapter caseCompilationUnitToTInterface(CompilationUnitToTInterface object) {
			return createCompilationUnitToTInterfaceAdapter();
		}

		@Override
		public Adapter caseExpressionToTFieldDefinition(ExpressionToTFieldDefinition object) {
			return createExpressionToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseMFieldDefinitionToTFieldDefinition(MFieldDefinitionToTFieldDefinition object) {
			return createMFieldDefinitionToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseMConstructorDefinitionToTParameterList(MConstructorDefinitionToTParameterList object) {
			return createMConstructorDefinitionToTParameterListAdapter();
		}

		@Override
		public Adapter caseCompilationUnitToTClass(CompilationUnitToTClass object) {
			return createCompilationUnitToTClassAdapter();
		}

		@Override
		public Adapter caseCompilationUnitToTypeGraph(CompilationUnitToTypeGraph object) {
			return createCompilationUnitToTypeGraphAdapter();
		}

		@Override
		public Adapter caseCompilationUnitToTPackage(CompilationUnitToTPackage object) {
			return createCompilationUnitToTPackageAdapter();
		}

		@Override
		public Adapter casePackageToTPackage(PackageToTPackage object) {
			return createPackageToTPackageAdapter();
		}

		@Override
		public Adapter caseModelToTypeGraph(ModelToTypeGraph object) {
			return createModelToTypeGraphAdapter();
		}

		@Override
		public Adapter caseFieldDeclarationToTField(FieldDeclarationToTField object) {
			return createFieldDeclarationToTFieldAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragmentToTFieldDefinition(
				VariableDeclarationFragmentToTFieldDefinition object) {
			return createVariableDeclarationFragmentToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseMethodDeclarationToTMethodSignature(MethodDeclarationToTMethodSignature object) {
			return createMethodDeclarationToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseStatementToTMethodDefinition(StatementToTMethodDefinition object) {
			return createStatementToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
			return createAbstractMethodInvocationToTAccessAdapter();
		}

		@Override
		public Adapter caseTypeAccessToTFieldSignature(TypeAccessToTFieldSignature object) {
			return createTypeAccessToTFieldSignatureAdapter();
		}

		@Override
		public Adapter caseMDefinitionToTMember(MDefinitionToTMember object) {
			return createMDefinitionToTMemberAdapter();
		}

		@Override
		public Adapter caseFieldAccessToTAccess(FieldAccessToTAccess object) {
			return createFieldAccessToTAccessAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeToTClass(PrimitiveTypeToTClass object) {
			return createPrimitiveTypeToTClassAdapter();
		}

		@Override
		public Adapter caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
			return createAnonymousClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseMMethodNameToTMethod(MMethodNameToTMethod object) {
			return createMMethodNameToTMethodAdapter();
		}

		@Override
		public Adapter caseMMethodSignatureToTMethodSignature(MMethodSignatureToTMethodSignature object) {
			return createMMethodSignatureToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseMMethodSignatureToTParameterList(MMethodSignatureToTParameterList object) {
			return createMMethodSignatureToTParameterListAdapter();
		}

		@Override
		public Adapter caseMEntryToTParameter(MEntryToTParameter object) {
			return createMEntryToTParameterAdapter();
		}

		@Override
		public Adapter caseBlockToTMethodDefinition(BlockToTMethodDefinition object) {
			return createBlockToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseMethodDeclarationToTMethod(MethodDeclarationToTMethod object) {
			return createMethodDeclarationToTMethodAdapter();
		}

		@Override
		public Adapter caseMethodDeclarationToTMethodDefinition(MethodDeclarationToTMethodDefinition object) {
			return createMethodDeclarationToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseSingleVariableDeclarationToTParameter(SingleVariableDeclarationToTParameter object) {
			return createSingleVariableDeclarationToTParameterAdapter();
		}

		@Override
		public Adapter caseMSignatureToTSignature(MSignatureToTSignature object) {
			return createMSignatureToTSignatureAdapter();
		}

		@Override
		public Adapter caseMFieldSignatureToTFieldSignature(MFieldSignatureToTFieldSignature object) {
			return createMFieldSignatureToTFieldSignatureAdapter();
		}

		@Override
		public Adapter caseBodyDeclarationToTAnnotatable(BodyDeclarationToTAnnotatable object) {
			return createBodyDeclarationToTAnnotatableAdapter();
		}

		@Override
		public Adapter caseFieldDeclarationToTFieldSignature(FieldDeclarationToTFieldSignature object) {
			return createFieldDeclarationToTFieldSignatureAdapter();
		}

		@Override
		public Adapter caseTypeToTAbstractType(TypeToTAbstractType object) {
			return createTypeToTAbstractTypeAdapter();
		}

		@Override
		public Adapter caseMFieldNameToTField(MFieldNameToTField object) {
			return createMFieldNameToTFieldAdapter();
		}

		@Override
		public Adapter caseStatementToTMember(StatementToTMember object) {
			return createStatementToTMemberAdapter();
		}

		@Override
		public Adapter caseMSignatureToTMethodSignature(MSignatureToTMethodSignature object) {
			return createMSignatureToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseMDefinitionToTSignature(MDefinitionToTSignature object) {
			return createMDefinitionToTSignatureAdapter();
		}

		@Override
		public Adapter caseSingleVariableAccessToTAccess(SingleVariableAccessToTAccess object) {
			return createSingleVariableAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseConstructorDeclarationToTMethodDefinition(ConstructorDeclarationToTMethodDefinition object) {
			return createConstructorDeclarationToTMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
			return createAnnotationToTAnnotationAdapter();
		}

		@Override
		public Adapter caseConstructorDeclarationToTMethod(ConstructorDeclarationToTMethod object) {
			return createConstructorDeclarationToTMethodAdapter();
		}

		@Override
		public Adapter caseConstructorDeclarationToTMethodSignature(ConstructorDeclarationToTMethodSignature object) {
			return createConstructorDeclarationToTMethodSignatureAdapter();
		}

		@Override
		public Adapter caseTypeParameterToTClass(TypeParameterToTClass object) {
			return createTypeParameterToTClassAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
			return createUnresolvedTypeDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.CompilationUnitToTInterface <em>Compilation Unit To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTInterface
	 * @generated
	 */
	public Adapter createCompilationUnitToTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ExpressionToTFieldDefinition <em>Expression To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ExpressionToTFieldDefinition
	 * @generated
	 */
	public Adapter createExpressionToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition <em>MField Definition To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition
	 * @generated
	 */
	public Adapter createMFieldDefinitionToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList <em>MConstructor Definition To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MConstructorDefinitionToTParameterList
	 * @generated
	 */
	public Adapter createMConstructorDefinitionToTParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.CompilationUnitToTClass <em>Compilation Unit To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTClass
	 * @generated
	 */
	public Adapter createCompilationUnitToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.CompilationUnitToTypeGraph <em>Compilation Unit To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTypeGraph
	 * @generated
	 */
	public Adapter createCompilationUnitToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.CompilationUnitToTPackage <em>Compilation Unit To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.CompilationUnitToTPackage
	 * @generated
	 */
	public Adapter createCompilationUnitToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.PackageToTPackage
	 * @generated
	 */
	public Adapter createPackageToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ModelToTypeGraph
	 * @generated
	 */
	public Adapter createModelToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.FieldDeclarationToTField <em>Field Declaration To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTField
	 * @generated
	 */
	public Adapter createFieldDeclarationToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature <em>Method Declaration To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodSignature
	 * @generated
	 */
	public Adapter createMethodDeclarationToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.StatementToTMethodDefinition <em>Statement To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.StatementToTMethodDefinition
	 * @generated
	 */
	public Adapter createStatementToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.TypeAccessToTFieldSignature <em>Type Access To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.TypeAccessToTFieldSignature
	 * @generated
	 */
	public Adapter createTypeAccessToTFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MDefinitionToTMember
	 * @generated
	 */
	public Adapter createMDefinitionToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.FieldAccessToTAccess
	 * @generated
	 */
	public Adapter createFieldAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.PrimitiveTypeToTClass
	 * @generated
	 */
	public Adapter createPrimitiveTypeToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createAnonymousClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MMethodNameToTMethod
	 * @generated
	 */
	public Adapter createMMethodNameToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature <em>MMethod Signature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature
	 * @generated
	 */
	public Adapter createMMethodSignatureToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MMethodSignatureToTParameterList <em>MMethod Signature To TParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MMethodSignatureToTParameterList
	 * @generated
	 */
	public Adapter createMMethodSignatureToTParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MEntryToTParameter
	 * @generated
	 */
	public Adapter createMEntryToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.BlockToTMethodDefinition <em>Block To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.BlockToTMethodDefinition
	 * @generated
	 */
	public Adapter createBlockToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethod <em>Method Declaration To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethod
	 * @generated
	 */
	public Adapter createMethodDeclarationToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition <em>Method Declaration To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MethodDeclarationToTMethodDefinition
	 * @generated
	 */
	public Adapter createMethodDeclarationToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter <em>Single Variable Declaration To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.SingleVariableDeclarationToTParameter
	 * @generated
	 */
	public Adapter createSingleVariableDeclarationToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MSignatureToTSignature
	 * @generated
	 */
	public Adapter createMSignatureToTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature <em>MField Signature To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MFieldSignatureToTFieldSignature
	 * @generated
	 */
	public Adapter createMFieldSignatureToTFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable <em>Body Declaration To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable
	 * @generated
	 */
	public Adapter createBodyDeclarationToTAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature <em>Field Declaration To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature
	 * @generated
	 */
	public Adapter createFieldDeclarationToTFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.TypeToTAbstractType
	 * @generated
	 */
	public Adapter createTypeToTAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MFieldNameToTField
	 * @generated
	 */
	public Adapter createMFieldNameToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.StatementToTMember <em>Statement To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.StatementToTMember
	 * @generated
	 */
	public Adapter createStatementToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MSignatureToTMethodSignature <em>MSignature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MSignatureToTMethodSignature
	 * @generated
	 */
	public Adapter createMSignatureToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.MDefinitionToTSignature <em>MDefinition To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.MDefinitionToTSignature
	 * @generated
	 */
	public Adapter createMDefinitionToTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.SingleVariableAccessToTAccess <em>Single Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.SingleVariableAccessToTAccess
	 * @generated
	 */
	public Adapter createSingleVariableAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition <em>Constructor Declaration To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodDefinition
	 * @generated
	 */
	public Adapter createConstructorDeclarationToTMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.AnnotationToTAnnotation
	 * @generated
	 */
	public Adapter createAnnotationToTAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethod <em>Constructor Declaration To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethod
	 * @generated
	 */
	public Adapter createConstructorDeclarationToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature <em>Constructor Declaration To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.ConstructorDeclarationToTMethodSignature
	 * @generated
	 */
	public Adapter createConstructorDeclarationToTMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.TypeParameterToTClass
	 * @generated
	 */
	public Adapter createTypeParameterToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //ModiscoAdapterFactory
