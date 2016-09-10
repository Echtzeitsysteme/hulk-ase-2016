/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.gravity.tgg.modisco.Rules.ReturnType;
import org.gravity.tgg.modisco.Rules.RulesFactory;
import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SignatureReturnType;
import org.gravity.tgg.modisco.Rules.SubPackageToPGPackage;
import org.gravity.tgg.modisco.Rules.SuperConstructorInvocationSource;
import org.gravity.tgg.modisco.Rules.SuperMethodInvocationSource;
import org.gravity.tgg.modisco.Rules.TypeParameter;
import org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.COMPILATION_UNIT:
			return createCompilationUnit();
		case RulesPackage.MODEL_TO_PG:
			return createModelToPg();
		case RulesPackage.PACKAGE_TO_PG_PACKAGE:
			return createPackageToPGPackage();
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE:
			return createSubPackageToPGPackage();
		case RulesPackage.NESTED_INTERFACE_IN_TYPE:
			return createNestedInterfaceInType();
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS:
			return createParameterizedTypeToClass();
		case RulesPackage.NESTED_CLASS_IN_TYPE:
			return createNestedClassInType();
		case RulesPackage.SIGNATURE_RETURN_TYPE:
			return createSignatureReturnType();
		case RulesPackage.INTERFACE:
			return createInterface();
		case RulesPackage.FIELD_SIGNATURE:
			return createFieldSignature();
		case RulesPackage.METHOD_PARAMETER_TYPE:
			return createMethodParameterType();
		case RulesPackage.ANNOTATION_TYPE:
			return createAnnotationType();
		case RulesPackage.FIELD_ACCESS_SOURCE:
			return createFieldAccessSource();
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE:
			return createInterfaceExtendsInterface();
		case RulesPackage.CLASS_EXTENDS_CLASS:
			return createClassExtendsClass();
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE:
			return createClassImplementsInterface();
		case RulesPackage.CLASS_INNER_METHODE:
			return createClassInnerMethode();
		case RulesPackage.CLASS_INNER_CONSTRUCTOR:
			return createClassInnerConstructor();
		case RulesPackage.METHOD_INVOCATION_TARGET:
			return createMethodInvocationTarget();
		case RulesPackage.FIELD_NAME:
			return createFieldName();
		case RulesPackage.FIELD_DEFINITION:
			return createFieldDefinition();
		case RulesPackage.LINK_DEFINITION_TO_CLASS:
			return createLinkDefinitionToClass();
		case RulesPackage.CLASS:
			return createClass();
		case RulesPackage.FIELD_TYPE:
			return createFieldType();
		case RulesPackage.NESTED_ANNOTATION_TYPE:
			return createNestedAnnotationType();
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE:
			return createAnnotationTypeWithValue();
		case RulesPackage.PRIMITIVE_TYPE_IS_INT:
			return createPrimitiveTypeIsInt();
		case RulesPackage.ANONYMOUS_CLASS:
			return createAnonymousClass();
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST:
			return createMethodParameterLinkFirst();
		case RulesPackage.METHOD_SIGNATURE:
			return createMethodSignature();
		case RulesPackage.ARRAY_TYPE_TO_CLASS:
			return createArrayTypeToClass();
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN:
			return createPrimitiveTypeIsBoolean();
		case RulesPackage.PRIMITIVE_TYPE_IS_CHAR:
			return createPrimitiveTypeIsChar();
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE:
			return createPrimitiveTypeIsByte();
		case RulesPackage.PRIMITIVE_TYPE_IS_SHORT:
			return createPrimitiveTypeIsShort();
		case RulesPackage.PRIMITIVE_TYPE_IS_LONG:
			return createPrimitiveTypeIsLong();
		case RulesPackage.PRIMITIVE_TYPE_IS_FLOAT:
			return createPrimitiveTypeIsFloat();
		case RulesPackage.PRIMITIVE_TYPE_IS_DOUBLE:
			return createPrimitiveTypeIsDouble();
		case RulesPackage.METHOD_DEFINITION:
			return createMethodDefinition();
		case RulesPackage.ANNOTATIO:
			return createAnnotatio();
		case RulesPackage.NESTED_ENUM:
			return createNestedEnum();
		case RulesPackage.PRIMITIVE_TYPES_IS_VOID:
			return createPrimitiveTypesIsVoid();
		case RulesPackage.RETURN_TYPE:
			return createReturnType();
		case RulesPackage.METHOD_PARAMETER_LINK:
			return createMethodParameterLink();
		case RulesPackage.METHOD_NAME:
			return createMethodName();
		case RulesPackage.LINK_SIGNATURE_TO_TYPE:
			return createLinkSignatureToType();
		case RulesPackage.METHOD_PARAMETER:
			return createMethodParameter();
		case RulesPackage.FIELD_ACCESS_TARGET:
			return createFieldAccessTarget();
		case RulesPackage.ENUM:
			return createEnum();
		case RulesPackage.METHOD_INVOCATION_SOURCE:
			return createMethodInvocationSource();
		case RulesPackage.SUPER_METHOD_INVOCATION_SOURCE:
			return createSuperMethodInvocationSource();
		case RulesPackage.CONSTRUCTOR_INVOCATION_SOURCE:
			return createConstructorInvocationSource();
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION_SOURCE:
			return createSuperConstructorInvocationSource();
		case RulesPackage.TYPE_PARAMETER:
			return createTypeParameter();
		case RulesPackage.CONSTRUCTOR:
			return createConstructor();
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION:
			return createUnresolvedTypeDeclaration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToPg createModelToPg() {
		ModelToPgImpl modelToPg = new ModelToPgImpl();
		return modelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToPGPackage createPackageToPGPackage() {
		PackageToPGPackageImpl packageToPGPackage = new PackageToPGPackageImpl();
		return packageToPGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageToPGPackage createSubPackageToPGPackage() {
		SubPackageToPGPackageImpl subPackageToPGPackage = new SubPackageToPGPackageImpl();
		return subPackageToPGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedInterfaceInType createNestedInterfaceInType() {
		NestedInterfaceInTypeImpl nestedInterfaceInType = new NestedInterfaceInTypeImpl();
		return nestedInterfaceInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedTypeToClass createParameterizedTypeToClass() {
		ParameterizedTypeToClassImpl parameterizedTypeToClass = new ParameterizedTypeToClassImpl();
		return parameterizedTypeToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedClassInType createNestedClassInType() {
		NestedClassInTypeImpl nestedClassInType = new NestedClassInTypeImpl();
		return nestedClassInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureReturnType createSignatureReturnType() {
		SignatureReturnTypeImpl signatureReturnType = new SignatureReturnTypeImpl();
		return signatureReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSignature createFieldSignature() {
		FieldSignatureImpl fieldSignature = new FieldSignatureImpl();
		return fieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameterType createMethodParameterType() {
		MethodParameterTypeImpl methodParameterType = new MethodParameterTypeImpl();
		return methodParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccessSource createFieldAccessSource() {
		FieldAccessSourceImpl fieldAccessSource = new FieldAccessSourceImpl();
		return fieldAccessSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceExtendsInterface createInterfaceExtendsInterface() {
		InterfaceExtendsInterfaceImpl interfaceExtendsInterface = new InterfaceExtendsInterfaceImpl();
		return interfaceExtendsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExtendsClass createClassExtendsClass() {
		ClassExtendsClassImpl classExtendsClass = new ClassExtendsClassImpl();
		return classExtendsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassImplementsInterface createClassImplementsInterface() {
		ClassImplementsInterfaceImpl classImplementsInterface = new ClassImplementsInterfaceImpl();
		return classImplementsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInnerMethode createClassInnerMethode() {
		ClassInnerMethodeImpl classInnerMethode = new ClassInnerMethodeImpl();
		return classInnerMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInnerConstructor createClassInnerConstructor() {
		ClassInnerConstructorImpl classInnerConstructor = new ClassInnerConstructorImpl();
		return classInnerConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocationTarget createMethodInvocationTarget() {
		MethodInvocationTargetImpl methodInvocationTarget = new MethodInvocationTargetImpl();
		return methodInvocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldName createFieldName() {
		FieldNameImpl fieldName = new FieldNameImpl();
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition createFieldDefinition() {
		FieldDefinitionImpl fieldDefinition = new FieldDefinitionImpl();
		return fieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDefinitionToClass createLinkDefinitionToClass() {
		LinkDefinitionToClassImpl linkDefinitionToClass = new LinkDefinitionToClassImpl();
		return linkDefinitionToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gravity.tgg.modisco.Rules.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedAnnotationType createNestedAnnotationType() {
		NestedAnnotationTypeImpl nestedAnnotationType = new NestedAnnotationTypeImpl();
		return nestedAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeWithValue createAnnotationTypeWithValue() {
		AnnotationTypeWithValueImpl annotationTypeWithValue = new AnnotationTypeWithValueImpl();
		return annotationTypeWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsInt createPrimitiveTypeIsInt() {
		PrimitiveTypeIsIntImpl primitiveTypeIsInt = new PrimitiveTypeIsIntImpl();
		return primitiveTypeIsInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass createAnonymousClass() {
		AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameterLinkFirst createMethodParameterLinkFirst() {
		MethodParameterLinkFirstImpl methodParameterLinkFirst = new MethodParameterLinkFirstImpl();
		return methodParameterLinkFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSignature createMethodSignature() {
		MethodSignatureImpl methodSignature = new MethodSignatureImpl();
		return methodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeToClass createArrayTypeToClass() {
		ArrayTypeToClassImpl arrayTypeToClass = new ArrayTypeToClassImpl();
		return arrayTypeToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsBoolean createPrimitiveTypeIsBoolean() {
		PrimitiveTypeIsBooleanImpl primitiveTypeIsBoolean = new PrimitiveTypeIsBooleanImpl();
		return primitiveTypeIsBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsChar createPrimitiveTypeIsChar() {
		PrimitiveTypeIsCharImpl primitiveTypeIsChar = new PrimitiveTypeIsCharImpl();
		return primitiveTypeIsChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsByte createPrimitiveTypeIsByte() {
		PrimitiveTypeIsByteImpl primitiveTypeIsByte = new PrimitiveTypeIsByteImpl();
		return primitiveTypeIsByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsShort createPrimitiveTypeIsShort() {
		PrimitiveTypeIsShortImpl primitiveTypeIsShort = new PrimitiveTypeIsShortImpl();
		return primitiveTypeIsShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsLong createPrimitiveTypeIsLong() {
		PrimitiveTypeIsLongImpl primitiveTypeIsLong = new PrimitiveTypeIsLongImpl();
		return primitiveTypeIsLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsFloat createPrimitiveTypeIsFloat() {
		PrimitiveTypeIsFloatImpl primitiveTypeIsFloat = new PrimitiveTypeIsFloatImpl();
		return primitiveTypeIsFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeIsDouble createPrimitiveTypeIsDouble() {
		PrimitiveTypeIsDoubleImpl primitiveTypeIsDouble = new PrimitiveTypeIsDoubleImpl();
		return primitiveTypeIsDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDefinition createMethodDefinition() {
		MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
		return methodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotatio createAnnotatio() {
		AnnotatioImpl annotatio = new AnnotatioImpl();
		return annotatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedEnum createNestedEnum() {
		NestedEnumImpl nestedEnum = new NestedEnumImpl();
		return nestedEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypesIsVoid createPrimitiveTypesIsVoid() {
		PrimitiveTypesIsVoidImpl primitiveTypesIsVoid = new PrimitiveTypesIsVoidImpl();
		return primitiveTypesIsVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameterLink createMethodParameterLink() {
		MethodParameterLinkImpl methodParameterLink = new MethodParameterLinkImpl();
		return methodParameterLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodName createMethodName() {
		MethodNameImpl methodName = new MethodNameImpl();
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSignatureToType createLinkSignatureToType() {
		LinkSignatureToTypeImpl linkSignatureToType = new LinkSignatureToTypeImpl();
		return linkSignatureToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccessTarget createFieldAccessTarget() {
		FieldAccessTargetImpl fieldAccessTarget = new FieldAccessTargetImpl();
		return fieldAccessTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gravity.tgg.modisco.Rules.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocationSource createMethodInvocationSource() {
		MethodInvocationSourceImpl methodInvocationSource = new MethodInvocationSourceImpl();
		return methodInvocationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperMethodInvocationSource createSuperMethodInvocationSource() {
		SuperMethodInvocationSourceImpl superMethodInvocationSource = new SuperMethodInvocationSourceImpl();
		return superMethodInvocationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorInvocationSource createConstructorInvocationSource() {
		ConstructorInvocationSourceImpl constructorInvocationSource = new ConstructorInvocationSourceImpl();
		return constructorInvocationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperConstructorInvocationSource createSuperConstructorInvocationSource() {
		SuperConstructorInvocationSourceImpl superConstructorInvocationSource = new SuperConstructorInvocationSourceImpl();
		return superConstructorInvocationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration() {
		UnresolvedTypeDeclarationImpl unresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		return unresolvedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
