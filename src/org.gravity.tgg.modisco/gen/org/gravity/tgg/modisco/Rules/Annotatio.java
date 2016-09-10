/**
 */
package org.gravity.tgg.modisco.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotatio</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.Rules.RulesPackage#getAnnotatio()
 * @model
 * @generated
 */
public interface Annotatio extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_35(EMoflonEdge _edge_type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Match sourceMatch,
			Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_CC(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mAnnotationTypeToTAnnotationTypeParameter,
			BodyDeclarationToTAnnotatable mBodyToTAnnotableParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Annotatio
