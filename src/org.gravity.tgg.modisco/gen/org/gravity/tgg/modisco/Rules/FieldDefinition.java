/**
 */
package org.gravity.tgg.modisco.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;

import org.gravity.tgg.modisco.MFieldNameToTField;
import org.gravity.tgg.modisco.MSignatureToTSignature;

import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;

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
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.Rules.RulesPackage#getFieldDefinition()
 * @model
 * @generated
 */
public interface FieldDefinition extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment);

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
	void registerObjectsToMatch_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField,
			VariableDeclarationFragment varDeclFragment);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation);

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
	boolean isAppropriate_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature);

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
	void registerObjectsToMatch_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_19(EMoflonEdge _edge_mFieldDefinitions);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_17(EMoflonEdge _edge_definitions);

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
	CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment, Match sourceMatch,
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
	boolean checkDEC_FWD(MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MFieldNameToTField mNameToTFieldParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FieldDefinition
