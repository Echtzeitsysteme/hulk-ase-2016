/**
 */
package org.gravity.tgg.modisco.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;

import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.SingleVariableAccessToTAccess;
import org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;

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
 * A representation of the model object '<em><b>Field Access Target</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.Rules.RulesPackage#getFieldAccessTarget()
 * @model
 * @generated
 */
public interface FieldAccessTarget extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag);

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
	void registerObjectsToMatch_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mDefinition, MFieldDefinition mField,
			SingleVariableAccess varAccess, VariableDeclarationFragment varDeclFrag);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition, EObject tAccess,
			EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess);

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
	boolean isAppropriate_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField);

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
	void registerObjectsToMatch_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TMember tDefinition, TAccess tAccess, TFieldDefinition tField);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tDefinition, EObject tAccess,
			EObject tField, EObject mDefinitionToTDefinition, EObject mField, EObject mMethodToTMethod,
			EObject varAccess, EObject varDeclFrag, EObject varDeclFragToTField, EObject varAccessToTAccess);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_46(EMoflonEdge _edge_variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_43(EMoflonEdge _edge_accessedBy);

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
	CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, Match sourceMatch, Match targetMatch);

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
	boolean checkDEC_FWD(MDefinition mDefinition, MFieldDefinition mField, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(TMember tDefinition, TAccess tAccess, TFieldDefinition tField);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			SingleVariableAccessToTAccess varAccessToTAccessParameter, MDefinitionToTMember mMethodToTMethodParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition, TMember tDefinition,
			TAccess tAccess, TFieldDefinition tField, MDefinitionToTMember mDefinitionToTDefinition,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, SingleVariableAccess varAccess,
			VariableDeclarationFragment varDeclFrag, VariableDeclarationFragmentToTFieldDefinition varDeclFragToTField,
			SingleVariableAccessToTAccess varAccessToTAccess, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FieldAccessTarget
