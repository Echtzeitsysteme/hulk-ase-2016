/**
 */
package org.gravity.tgg.modisco.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.modisco.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseCompilationUnit(CompilationUnit object) {
			return createCompilationUnitAdapter();
		}

		@Override
		public Adapter caseModelToPg(ModelToPg object) {
			return createModelToPgAdapter();
		}

		@Override
		public Adapter casePackageToPGPackage(PackageToPGPackage object) {
			return createPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseSubPackageToPGPackage(SubPackageToPGPackage object) {
			return createSubPackageToPGPackageAdapter();
		}

		@Override
		public Adapter caseTypes(Types object) {
			return createTypesAdapter();
		}

		@Override
		public Adapter caseNestedInterfaceInType(NestedInterfaceInType object) {
			return createNestedInterfaceInTypeAdapter();
		}

		@Override
		public Adapter caseParameterizedTypeToClass(ParameterizedTypeToClass object) {
			return createParameterizedTypeToClassAdapter();
		}

		@Override
		public Adapter caseNestedClassInType(NestedClassInType object) {
			return createNestedClassInTypeAdapter();
		}

		@Override
		public Adapter caseSignatureReturnType(SignatureReturnType object) {
			return createSignatureReturnTypeAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseFieldSignature(FieldSignature object) {
			return createFieldSignatureAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocationSource(AbstractMethodInvocationSource object) {
			return createAbstractMethodInvocationSourceAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesToClass(PrimitiveTypesToClass object) {
			return createPrimitiveTypesToClassAdapter();
		}

		@Override
		public Adapter caseMethodParameterType(MethodParameterType object) {
			return createMethodParameterTypeAdapter();
		}

		@Override
		public Adapter caseNestedTypes(NestedTypes object) {
			return createNestedTypesAdapter();
		}

		@Override
		public Adapter caseAnnotationType(AnnotationType object) {
			return createAnnotationTypeAdapter();
		}

		@Override
		public Adapter caseFieldAccessSource(FieldAccessSource object) {
			return createFieldAccessSourceAdapter();
		}

		@Override
		public Adapter caseInterfaceExtendsInterface(InterfaceExtendsInterface object) {
			return createInterfaceExtendsInterfaceAdapter();
		}

		@Override
		public Adapter caseClassExtendsClass(ClassExtendsClass object) {
			return createClassExtendsClassAdapter();
		}

		@Override
		public Adapter caseClassImplementsInterface(ClassImplementsInterface object) {
			return createClassImplementsInterfaceAdapter();
		}

		@Override
		public Adapter caseClassInnerMethode(ClassInnerMethode object) {
			return createClassInnerMethodeAdapter();
		}

		@Override
		public Adapter caseClassInnerConstructor(ClassInnerConstructor object) {
			return createClassInnerConstructorAdapter();
		}

		@Override
		public Adapter caseMethodInvocationTarget(MethodInvocationTarget object) {
			return createMethodInvocationTargetAdapter();
		}

		@Override
		public Adapter caseFieldName(FieldName object) {
			return createFieldNameAdapter();
		}

		@Override
		public Adapter caseFieldDefinition(FieldDefinition object) {
			return createFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToClass(LinkDefinitionToClass object) {
			return createLinkDefinitionToClassAdapter();
		}

		@Override
		public Adapter caseClass(org.gravity.tgg.modisco.Rules.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseFieldType(FieldType object) {
			return createFieldTypeAdapter();
		}

		@Override
		public Adapter caseNestedAnnotationType(NestedAnnotationType object) {
			return createNestedAnnotationTypeAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeWithValue(AnnotationTypeWithValue object) {
			return createAnnotationTypeWithValueAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsInt(PrimitiveTypeIsInt object) {
			return createPrimitiveTypeIsIntAdapter();
		}

		@Override
		public Adapter caseAnonymousClass(AnonymousClass object) {
			return createAnonymousClassAdapter();
		}

		@Override
		public Adapter caseMethodParameterLinkFirst(MethodParameterLinkFirst object) {
			return createMethodParameterLinkFirstAdapter();
		}

		@Override
		public Adapter caseMethodSignature(MethodSignature object) {
			return createMethodSignatureAdapter();
		}

		@Override
		public Adapter caseArrayTypeToClass(ArrayTypeToClass object) {
			return createArrayTypeToClassAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsBoolean(PrimitiveTypeIsBoolean object) {
			return createPrimitiveTypeIsBooleanAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsChar(PrimitiveTypeIsChar object) {
			return createPrimitiveTypeIsCharAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsByte(PrimitiveTypeIsByte object) {
			return createPrimitiveTypeIsByteAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsShort(PrimitiveTypeIsShort object) {
			return createPrimitiveTypeIsShortAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsLong(PrimitiveTypeIsLong object) {
			return createPrimitiveTypeIsLongAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsFloat(PrimitiveTypeIsFloat object) {
			return createPrimitiveTypeIsFloatAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsDouble(PrimitiveTypeIsDouble object) {
			return createPrimitiveTypeIsDoubleAdapter();
		}

		@Override
		public Adapter caseMethodDefinition(MethodDefinition object) {
			return createMethodDefinitionAdapter();
		}

		@Override
		public Adapter caseAnnotatio(Annotatio object) {
			return createAnnotatioAdapter();
		}

		@Override
		public Adapter caseNestedEnum(NestedEnum object) {
			return createNestedEnumAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesIsVoid(PrimitiveTypesIsVoid object) {
			return createPrimitiveTypesIsVoidAdapter();
		}

		@Override
		public Adapter caseReturnType(ReturnType object) {
			return createReturnTypeAdapter();
		}

		@Override
		public Adapter caseMethodParameterLink(MethodParameterLink object) {
			return createMethodParameterLinkAdapter();
		}

		@Override
		public Adapter caseMethodName(MethodName object) {
			return createMethodNameAdapter();
		}

		@Override
		public Adapter caseLinkSignatureToType(LinkSignatureToType object) {
			return createLinkSignatureToTypeAdapter();
		}

		@Override
		public Adapter caseMethodParameter(MethodParameter object) {
			return createMethodParameterAdapter();
		}

		@Override
		public Adapter caseFieldAccessTarget(FieldAccessTarget object) {
			return createFieldAccessTargetAdapter();
		}

		@Override
		public Adapter caseEnum(org.gravity.tgg.modisco.Rules.Enum object) {
			return createEnumAdapter();
		}

		@Override
		public Adapter caseMethodInvocationSource(MethodInvocationSource object) {
			return createMethodInvocationSourceAdapter();
		}

		@Override
		public Adapter caseSuperMethodInvocationSource(SuperMethodInvocationSource object) {
			return createSuperMethodInvocationSourceAdapter();
		}

		@Override
		public Adapter caseConstructorInvocationSource(ConstructorInvocationSource object) {
			return createConstructorInvocationSourceAdapter();
		}

		@Override
		public Adapter caseSuperConstructorInvocationSource(SuperConstructorInvocationSource object) {
			return createSuperConstructorInvocationSourceAdapter();
		}

		@Override
		public Adapter caseTypeParameter(TypeParameter object) {
			return createTypeParameterAdapter();
		}

		@Override
		public Adapter caseConstructor(Constructor object) {
			return createConstructorAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
			return createUnresolvedTypeDeclarationAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ModelToPg <em>Model To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ModelToPg
	 * @generated
	 */
	public Adapter createModelToPgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PackageToPGPackage <em>Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PackageToPGPackage
	 * @generated
	 */
	public Adapter createPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SubPackageToPGPackage <em>Sub Package To PG Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SubPackageToPGPackage
	 * @generated
	 */
	public Adapter createSubPackageToPGPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedInterfaceInType <em>Nested Interface In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedInterfaceInType
	 * @generated
	 */
	public Adapter createNestedInterfaceInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass <em>Parameterized Type To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass
	 * @generated
	 */
	public Adapter createParameterizedTypeToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedClassInType <em>Nested Class In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedClassInType
	 * @generated
	 */
	public Adapter createNestedClassInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SignatureReturnType <em>Signature Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SignatureReturnType
	 * @generated
	 */
	public Adapter createSignatureReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldSignature <em>Field Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldSignature
	 * @generated
	 */
	public Adapter createFieldSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AbstractMethodInvocationSource <em>Abstract Method Invocation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AbstractMethodInvocationSource
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass <em>Primitive Types To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass
	 * @generated
	 */
	public Adapter createPrimitiveTypesToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterType <em>Method Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterType
	 * @generated
	 */
	public Adapter createMethodParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedTypes <em>Nested Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedTypes
	 * @generated
	 */
	public Adapter createNestedTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccessSource <em>Field Access Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccessSource
	 * @generated
	 */
	public Adapter createFieldAccessSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface <em>Interface Extends Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface
	 * @generated
	 */
	public Adapter createInterfaceExtendsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassExtendsClass <em>Class Extends Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassExtendsClass
	 * @generated
	 */
	public Adapter createClassExtendsClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassImplementsInterface <em>Class Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassImplementsInterface
	 * @generated
	 */
	public Adapter createClassImplementsInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInnerMethode <em>Class Inner Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInnerMethode
	 * @generated
	 */
	public Adapter createClassInnerMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ClassInnerConstructor <em>Class Inner Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ClassInnerConstructor
	 * @generated
	 */
	public Adapter createClassInnerConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationTarget <em>Method Invocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationTarget
	 * @generated
	 */
	public Adapter createMethodInvocationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldName
	 * @generated
	 */
	public Adapter createFieldNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldDefinition
	 * @generated
	 */
	public Adapter createFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.LinkDefinitionToClass <em>Link Definition To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.LinkDefinitionToClass
	 * @generated
	 */
	public Adapter createLinkDefinitionToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedAnnotationType <em>Nested Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedAnnotationType
	 * @generated
	 */
	public Adapter createNestedAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnnotationTypeWithValue <em>Annotation Type With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnnotationTypeWithValue
	 * @generated
	 */
	public Adapter createAnnotationTypeWithValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt <em>Primitive Type Is Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.AnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.AnonymousClass
	 * @generated
	 */
	public Adapter createAnonymousClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst <em>Method Parameter Link First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst
	 * @generated
	 */
	public Adapter createMethodParameterLinkFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodSignature
	 * @generated
	 */
	public Adapter createMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ArrayTypeToClass <em>Array Type To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ArrayTypeToClass
	 * @generated
	 */
	public Adapter createArrayTypeToClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean <em>Primitive Type Is Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar <em>Primitive Type Is Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte <em>Primitive Type Is Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort <em>Primitive Type Is Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong <em>Primitive Type Is Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat <em>Primitive Type Is Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble <em>Primitive Type Is Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodDefinition <em>Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodDefinition
	 * @generated
	 */
	public Adapter createMethodDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Annotatio <em>Annotatio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Annotatio
	 * @generated
	 */
	public Adapter createAnnotatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.NestedEnum <em>Nested Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.NestedEnum
	 * @generated
	 */
	public Adapter createNestedEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid <em>Primitive Types Is Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid
	 * @generated
	 */
	public Adapter createPrimitiveTypesIsVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameterLink <em>Method Parameter Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameterLink
	 * @generated
	 */
	public Adapter createMethodParameterLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodName
	 * @generated
	 */
	public Adapter createMethodNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.LinkSignatureToType <em>Link Signature To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.LinkSignatureToType
	 * @generated
	 */
	public Adapter createLinkSignatureToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodParameter
	 * @generated
	 */
	public Adapter createMethodParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.FieldAccessTarget <em>Field Access Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.FieldAccessTarget
	 * @generated
	 */
	public Adapter createFieldAccessTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.MethodInvocationSource <em>Method Invocation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.MethodInvocationSource
	 * @generated
	 */
	public Adapter createMethodInvocationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SuperMethodInvocationSource <em>Super Method Invocation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SuperMethodInvocationSource
	 * @generated
	 */
	public Adapter createSuperMethodInvocationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.ConstructorInvocationSource <em>Constructor Invocation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.ConstructorInvocationSource
	 * @generated
	 */
	public Adapter createConstructorInvocationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.SuperConstructorInvocationSource <em>Super Constructor Invocation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.SuperConstructorInvocationSource
	 * @generated
	 */
	public Adapter createSuperConstructorInvocationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration <em>Unresolved Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
