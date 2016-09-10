/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.FieldDeclarationToTField;
import org.gravity.tgg.modisco.FieldDeclarationToTFieldSignature;
import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.MDefinitionToTSignature;
import org.gravity.tgg.modisco.MFieldDefinitionToTFieldDefinition;
import org.gravity.tgg.modisco.MFieldNameToTField;
import org.gravity.tgg.modisco.MSignatureToTSignature;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.FieldDefinition;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TSignature;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDefinitionImpl extends AbstractRuleImpl implements FieldDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment) {
		// initial bindings
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_0_1_initialbindings_blackBBBBBB(this,
				match, mSignature, eFieldDeclaration, mName, varDeclFragment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[eFieldDeclaration] = " + eFieldDeclaration + ", " + "[mName] = " + mName + ", "
					+ "[varDeclFragment] = " + varDeclFragment + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mSignature, eFieldDeclaration,
						mName, varDeclFragment);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[eFieldDeclaration] = " + eFieldDeclaration + ", " + "[mName] = " + mName + ", "
					+ "[varDeclFragment] = " + varDeclFragment + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldDefinitionImpl.pattern_FieldDefinition_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldDefinitionImpl
					.pattern_FieldDefinition_0_4_collectelementstobetranslated_blackBBBBB(match, mSignature,
							eFieldDeclaration, mName, varDeclFragment);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[eFieldDeclaration] = " + eFieldDeclaration + ", " + "[mName] = " + mName + ", "
						+ "[varDeclFragment] = " + varDeclFragment + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_0_4_collectelementstobetranslated_greenBBBBFFFF(match,
					mSignature, eFieldDeclaration, varDeclFragment);
			// EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = (EMoflonEdge) result4_green[4];
			// EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = (EMoflonEdge) result4_green[5];
			// EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = (EMoflonEdge) result4_green[6];
			// EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = FieldDefinitionImpl.pattern_FieldDefinition_0_5_collectcontextelements_blackBBBBB(
					match, mSignature, eFieldDeclaration, mName, varDeclFragment);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[eFieldDeclaration] = " + eFieldDeclaration + ", " + "[mName] = " + mName + ", "
						+ "[varDeclFragment] = " + varDeclFragment + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_0_5_collectcontextelements_greenBBBFF(match, mSignature, mName);
			// EMoflonEdge mSignature__mName____mFieldName = (EMoflonEdge) result5_green[3];
			// EMoflonEdge mName__mSignature____mFieldSignatures = (EMoflonEdge) result5_green[4];

			// register objects to match
			FieldDefinitionImpl.pattern_FieldDefinition_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					mSignature, eFieldDeclaration, mName, varDeclFragment);
			return FieldDefinitionImpl.pattern_FieldDefinition_0_7_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[0];
		MFieldDefinition eFieldDeclaration = (MFieldDefinition) result1_bindingAndBlack[1];
		TField tField = (TField) result1_bindingAndBlack[2];
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[3];
		MFieldName mName = (MFieldName) result1_bindingAndBlack[4];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[5];
		MFieldNameToTField mNameToTField = (MFieldNameToTField) result1_bindingAndBlack[6];
		VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_1_1_performtransformation_greenFFFBBFFBBFFFB(eFieldDeclaration, tField,
						tFieldSignature, varDeclFragment, csp);
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = (MFieldDefinitionToTFieldDefinition) result1_green[0];
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = (FieldDeclarationToTFieldSignature) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];
		FieldDeclarationToTField eFieldDeclarationToTField = (FieldDeclarationToTField) result1_green[5];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_green[6];
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result1_green[9];
		MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result1_green[10];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[11];

		// collect translated elements
		Object[] result2_black = FieldDefinitionImpl
				.pattern_FieldDefinition_1_2_collecttranslatedelements_blackBBBBBBBBBB(
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eFieldDeclarationToTFieldDefinition] = " + eFieldDeclarationToTFieldDefinition + ", "
					+ "[eFieldDeclarationToTFieldSignature] = " + eFieldDeclarationToTFieldSignature + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[eFieldDeclaration] = "
					+ eFieldDeclaration + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
					+ "[tFieldDefinition] = " + tFieldDefinition + ", " + "[varDeclFragment] = " + varDeclFragment
					+ ", " + "[varDeclFragmentToTFieldDefinition] = " + varDeclFragmentToTFieldDefinition + ", "
					+ "[mDefinitionToTSignature] = " + mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = FieldDefinitionImpl
				.pattern_FieldDefinition_1_2_collecttranslatedelements_greenFBBBBBBBBBB(
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldDefinitionImpl
				.pattern_FieldDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult,
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField, mSignatureToTFieldSignature,
						mName, tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eFieldDeclarationToTFieldDefinition] = "
					+ eFieldDeclarationToTFieldDefinition + ", " + "[eFieldDeclarationToTFieldSignature] = "
					+ eFieldDeclarationToTFieldSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember
					+ ", " + "[mSignature] = " + mSignature + ", " + "[eFieldDeclaration] = " + eFieldDeclaration + ", "
					+ "[tField] = " + tField + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField
					+ ", " + "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mName] = "
					+ mName + ", " + "[tFieldDefinition] = " + tFieldDefinition + ", " + "[tFieldSignature] = "
					+ tFieldSignature + ", " + "[mNameToTField] = " + mNameToTField + ", " + "[varDeclFragment] = "
					+ varDeclFragment + ", " + "[varDeclFragmentToTFieldDefinition] = "
					+ varDeclFragmentToTFieldDefinition + ", " + "[mDefinitionToTSignature] = "
					+ mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		FieldDefinitionImpl.pattern_FieldDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
				ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation);
		// EMoflonEdge eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge eFieldDeclarationToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge eFieldDeclarationToTFieldSignature__eFieldDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge eFieldDeclarationToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mDefinitionToTMember__eFieldDeclaration____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mDefinitionToTMember__tFieldDefinition____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = (EMoflonEdge) result3_green[21];
		// EMoflonEdge eFieldDeclarationToTField__eFieldDeclaration____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[24];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[25];
		// EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = (EMoflonEdge) result3_green[26];
		// EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = (EMoflonEdge) result3_green[27];
		// EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge varDeclFragmentToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge mDefinitionToTSignature__eFieldDeclaration____source = (EMoflonEdge) result3_green[30];
		// EMoflonEdge mDefinitionToTSignature__tFieldSignature____target = (EMoflonEdge) result3_green[31];
		// EMoflonEdge mBodyToTAnnotation__eFieldDeclaration____source = (EMoflonEdge) result3_green[32];
		// EMoflonEdge mBodyToTAnnotation__tFieldDefinition____target = (EMoflonEdge) result3_green[33];

		// perform postprocessing story node is empty
		// register objects
		FieldDefinitionImpl.pattern_FieldDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this, ruleresult,
				eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
				mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField, mSignatureToTFieldSignature, mName,
				tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation);
		return FieldDefinitionImpl.pattern_FieldDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldDefinitionImpl.pattern_FieldDefinition_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldSignature mSignature = (MFieldSignature) result2_binding[0];
		MFieldDefinition eFieldDeclaration = (MFieldDefinition) result2_binding[1];
		MFieldName mName = (MFieldName) result2_binding[2];
		VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result2_binding[3];
		for (Object[] result2_black : FieldDefinitionImpl.pattern_FieldDefinition_2_2_corematch_blackBBFFBFFBB(
				mSignature, eFieldDeclaration, mName, varDeclFragment, match)) {
			TField tField = (TField) result2_black[2];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[3];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[5];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : FieldDefinitionImpl.pattern_FieldDefinition_2_3_findcontext_blackBBBBBBBB(
					mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName, tFieldSignature,
					mNameToTField, varDeclFragment)) {
				Object[] result3_green = FieldDefinitionImpl
						.pattern_FieldDefinition_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(mSignature,
								eFieldDeclaration, tField, mSignatureToTFieldSignature, mName, tFieldSignature,
								mNameToTField, varDeclFragment);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge mSignature__mName____mFieldName = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mName__mSignature____mFieldSignatures = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mNameToTField__mName____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge mNameToTField__tField____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = (EMoflonEdge) result3_green[19];
				// EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldDefinitionImpl
						.pattern_FieldDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
								tFieldSignature, mNameToTField, varDeclFragment);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mSignature] = " + mSignature + ", " + "[eFieldDeclaration] = " + eFieldDeclaration
							+ ", " + "[tField] = " + tField + ", " + "[mSignatureToTFieldSignature] = "
							+ mSignatureToTFieldSignature + ", " + "[mName] = " + mName + ", " + "[tFieldSignature] = "
							+ tFieldSignature + ", " + "[mNameToTField] = " + mNameToTField + ", "
							+ "[varDeclFragment] = " + varDeclFragment + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldDefinitionImpl.pattern_FieldDefinition_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldDefinitionImpl
							.pattern_FieldDefinition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("eFieldDeclaration", eFieldDeclaration);
		match.registerObject("mName", mName);
		match.registerObject("varDeclFragment", varDeclFragment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField,
			VariableDeclarationFragment varDeclFragment) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition.ID", csp);
		var_tFieldDefinition_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tFieldDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("eFieldDeclaration", eFieldDeclaration);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("mNameToTField", mNameToTField);
		isApplicableMatch.registerObject("varDeclFragment", varDeclFragment);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		ruleresult.registerObject("eFieldDeclarationToTFieldDefinition", eFieldDeclarationToTFieldDefinition);
		ruleresult.registerObject("eFieldDeclarationToTFieldSignature", eFieldDeclarationToTFieldSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("eFieldDeclaration", eFieldDeclaration);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("mNameToTField", mNameToTField);
		ruleresult.registerObject("varDeclFragment", varDeclFragment);
		ruleresult.registerObject("varDeclFragmentToTFieldDefinition", varDeclFragmentToTFieldDefinition);
		ruleresult.registerObject("mDefinitionToTSignature", mDefinitionToTSignature);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eFieldDeclaration").eClass())
						.equals("modisco.MFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("varDeclFragment").eClass())
						.equals("java.VariableDeclarationFragment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature) {
		// initial bindings
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_10_1_initialbindings_blackBBBBB(this,
				match, tField, tFieldDefinition, tFieldSignature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tField] = " + tField + ", " + "[tFieldDefinition] = "
							+ tFieldDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tField, tFieldDefinition,
						tFieldSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tField] = " + tField + ", " + "[tFieldDefinition] = "
							+ tFieldDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (FieldDefinitionImpl.pattern_FieldDefinition_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = FieldDefinitionImpl
					.pattern_FieldDefinition_10_4_collectelementstobetranslated_blackBBBB(match, tField,
							tFieldDefinition, tFieldSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[tField] = " + tField + ", " + "[tFieldDefinition] = "
								+ tFieldDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_10_4_collectelementstobetranslated_greenBBBFF(match,
					tFieldDefinition, tFieldSignature);
			// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result4_green[3];
			// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = FieldDefinitionImpl.pattern_FieldDefinition_10_5_collectcontextelements_blackBBBB(
					match, tField, tFieldDefinition, tFieldSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tField] = " + tField + ", " + "[tFieldDefinition] = "
								+ tFieldDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_10_5_collectcontextelements_greenBBBFF(match, tField,
					tFieldSignature);
			// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result5_green[3];
			// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result5_green[4];

			// register objects to match
			FieldDefinitionImpl.pattern_FieldDefinition_10_6_registerobjectstomatch_expressionBBBBB(this, match, tField,
					tFieldDefinition, tFieldSignature);
			return FieldDefinitionImpl.pattern_FieldDefinition_10_7_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[0];
		TField tField = (TField) result1_bindingAndBlack[1];
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[2];
		MFieldName mName = (MFieldName) result1_bindingAndBlack[3];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result1_bindingAndBlack[4];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[5];
		MFieldNameToTField mNameToTField = (MFieldNameToTField) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_11_1_performtransformation_greenFFFBFBFBBFFFF(mSignature, tField,
						tFieldDefinition, tFieldSignature);
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = (MFieldDefinitionToTFieldDefinition) result1_green[0];
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = (FieldDeclarationToTFieldSignature) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];
		MFieldDefinition eFieldDeclaration = (MFieldDefinition) result1_green[4];
		FieldDeclarationToTField eFieldDeclarationToTField = (FieldDeclarationToTField) result1_green[6];
		VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result1_green[9];
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result1_green[10];
		MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result1_green[11];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[12];

		// collect translated elements
		Object[] result2_black = FieldDefinitionImpl
				.pattern_FieldDefinition_11_2_collecttranslatedelements_blackBBBBBBBBBB(
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[eFieldDeclarationToTFieldDefinition] = " + eFieldDeclarationToTFieldDefinition + ", "
					+ "[eFieldDeclarationToTFieldSignature] = " + eFieldDeclarationToTFieldSignature + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[eFieldDeclaration] = "
					+ eFieldDeclaration + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
					+ "[tFieldDefinition] = " + tFieldDefinition + ", " + "[varDeclFragment] = " + varDeclFragment
					+ ", " + "[varDeclFragmentToTFieldDefinition] = " + varDeclFragmentToTFieldDefinition + ", "
					+ "[mDefinitionToTSignature] = " + mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = FieldDefinitionImpl
				.pattern_FieldDefinition_11_2_collecttranslatedelements_greenFBBBBBBBBBB(
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = FieldDefinitionImpl
				.pattern_FieldDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult,
						eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
						mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField, mSignatureToTFieldSignature,
						mName, tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment,
						varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[eFieldDeclarationToTFieldDefinition] = "
					+ eFieldDeclarationToTFieldDefinition + ", " + "[eFieldDeclarationToTFieldSignature] = "
					+ eFieldDeclarationToTFieldSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember
					+ ", " + "[mSignature] = " + mSignature + ", " + "[eFieldDeclaration] = " + eFieldDeclaration + ", "
					+ "[tField] = " + tField + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField
					+ ", " + "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mName] = "
					+ mName + ", " + "[tFieldDefinition] = " + tFieldDefinition + ", " + "[tFieldSignature] = "
					+ tFieldSignature + ", " + "[mNameToTField] = " + mNameToTField + ", " + "[varDeclFragment] = "
					+ varDeclFragment + ", " + "[varDeclFragmentToTFieldDefinition] = "
					+ varDeclFragmentToTFieldDefinition + ", " + "[mDefinitionToTSignature] = "
					+ mDefinitionToTSignature + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		FieldDefinitionImpl.pattern_FieldDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
				ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation);
		// EMoflonEdge eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge eFieldDeclarationToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[15];
		// EMoflonEdge eFieldDeclarationToTFieldSignature__eFieldDeclaration____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge eFieldDeclarationToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mDefinitionToTMember__eFieldDeclaration____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mDefinitionToTMember__tFieldDefinition____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = (EMoflonEdge) result3_green[20];
		// EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = (EMoflonEdge) result3_green[21];
		// EMoflonEdge eFieldDeclarationToTField__eFieldDeclaration____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[24];
		// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[25];
		// EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = (EMoflonEdge) result3_green[26];
		// EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = (EMoflonEdge) result3_green[27];
		// EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = (EMoflonEdge) result3_green[28];
		// EMoflonEdge varDeclFragmentToTFieldDefinition__tFieldDefinition____target = (EMoflonEdge) result3_green[29];
		// EMoflonEdge mDefinitionToTSignature__eFieldDeclaration____source = (EMoflonEdge) result3_green[30];
		// EMoflonEdge mDefinitionToTSignature__tFieldSignature____target = (EMoflonEdge) result3_green[31];
		// EMoflonEdge mBodyToTAnnotation__eFieldDeclaration____source = (EMoflonEdge) result3_green[32];
		// EMoflonEdge mBodyToTAnnotation__tFieldDefinition____target = (EMoflonEdge) result3_green[33];

		// perform postprocessing story node is empty
		// register objects
		FieldDefinitionImpl.pattern_FieldDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this, ruleresult,
				eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature, mDefinitionToTMember,
				mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField, mSignatureToTFieldSignature, mName,
				tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation);
		return FieldDefinitionImpl.pattern_FieldDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = FieldDefinitionImpl.pattern_FieldDefinition_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TField tField = (TField) result2_binding[0];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_binding[1];
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[2];
		for (Object[] result2_black : FieldDefinitionImpl.pattern_FieldDefinition_12_2_corematch_blackFBFFBBFB(tField,
				tFieldDefinition, tFieldSignature, match)) {
			MFieldSignature mSignature = (MFieldSignature) result2_black[0];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[2];
			MFieldName mName = (MFieldName) result2_black[3];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : FieldDefinitionImpl.pattern_FieldDefinition_12_3_findcontext_blackBBBBBBB(
					mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature,
					mNameToTField)) {
				Object[] result3_green = FieldDefinitionImpl
						.pattern_FieldDefinition_12_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mSignature, tField,
								mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge tFieldSignature__tField____field = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tField__tFieldSignature____signatures = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mSignature__mName____mFieldName = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mName__mSignature____mFieldSignatures = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tFieldSignature__tFieldDefinition____definitions = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tFieldDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mNameToTField__mName____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mNameToTField__tField____target = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = FieldDefinitionImpl
						.pattern_FieldDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
								tFieldSignature, mNameToTField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tField] = " + tField + ", "
							+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mName] = "
							+ mName + ", " + "[tFieldDefinition] = " + tFieldDefinition + ", " + "[tFieldSignature] = "
							+ tFieldSignature + ", " + "[mNameToTField] = " + mNameToTField + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (FieldDefinitionImpl.pattern_FieldDefinition_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = FieldDefinitionImpl
							.pattern_FieldDefinition_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature) {
		match.registerObject("tField", tField);
		match.registerObject("tFieldDefinition", tFieldDefinition);
		match.registerObject("tFieldSignature", tFieldSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition.ID", true, csp);
		var_tFieldDefinition_ID.setValue(tFieldDefinition.getID());
		var_tFieldDefinition_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tFieldDefinition_ID);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tFieldDefinition", tFieldDefinition);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("mNameToTField", mNameToTField);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		ruleresult.registerObject("eFieldDeclarationToTFieldDefinition", eFieldDeclarationToTFieldDefinition);
		ruleresult.registerObject("eFieldDeclarationToTFieldSignature", eFieldDeclarationToTFieldSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("eFieldDeclaration", eFieldDeclaration);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tFieldDefinition", tFieldDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("mNameToTField", mNameToTField);
		ruleresult.registerObject("varDeclFragment", varDeclFragment);
		ruleresult.registerObject("varDeclFragmentToTFieldDefinition", varDeclFragmentToTFieldDefinition);
		ruleresult.registerObject("mDefinitionToTSignature", mDefinitionToTSignature);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tFieldDefinition").eClass())
				.equals("basic.TFieldDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(EMoflonEdge _edge_mFieldDefinitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_20_2_testcorematchandDECs_blackFFFFB(_edge_mFieldDefinitions)) {
			MFieldSignature mSignature = (MFieldSignature) result2_black[0];
			MFieldDefinition eFieldDeclaration = (MFieldDefinition) result2_black[1];
			MFieldName mName = (MFieldName) result2_black[2];
			VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result2_black[3];
			Object[] result2_green = FieldDefinitionImpl
					.pattern_FieldDefinition_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldDefinitionImpl
					.pattern_FieldDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mSignature, eFieldDeclaration, mName, varDeclFragment)) {
				// Ensure that the correct types of elements are matched
				if (FieldDefinitionImpl
						.pattern_FieldDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldDefinitionImpl
							.pattern_FieldDefinition_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(EMoflonEdge _edge_definitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_21_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TField tField = (TField) result2_black[0];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_black[1];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[2];
			Object[] result2_green = FieldDefinitionImpl
					.pattern_FieldDefinition_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (FieldDefinitionImpl
					.pattern_FieldDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tField, tFieldDefinition, tFieldSignature)) {
				// Ensure that the correct types of elements are matched
				if (FieldDefinitionImpl
						.pattern_FieldDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = FieldDefinitionImpl
							.pattern_FieldDefinition_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition", true, csp);
		var_tFieldDefinition_ID.setValue(__helper.getValue("tFieldDefinition", "ID"));
		var_tFieldDefinition_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("FieldDefinition");
		createID0.solve(var_tFieldDefinition_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tFieldDefinition_ID.setBound(false);
			createID0.solve(var_tFieldDefinition_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tFieldDefinition", "ID", var_tFieldDefinition_ID.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition", true, csp);
		var_tFieldDefinition_ID.setValue(__helper.getValue("tFieldDefinition", "ID"));
		var_tFieldDefinition_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		createID0.setRuleName("FieldDefinition");
		createID0.solve(var_tFieldDefinition_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			createID0.solve(var_tFieldDefinition_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = FieldDefinitionImpl
				.pattern_FieldDefinition_24_2_matchcontext_bindingFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFieldSignature mSignature = (MFieldSignature) result2_binding[0];
		MFieldDefinition eFieldDeclaration = (MFieldDefinition) result2_binding[1];
		TField tField = (TField) result2_binding[2];
		MFieldName mName = (MFieldName) result2_binding[3];
		TFieldDefinition tFieldDefinition = (TFieldDefinition) result2_binding[4];
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[5];
		VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result2_binding[6];
		for (Object[] result2_black : FieldDefinitionImpl.pattern_FieldDefinition_24_2_matchcontext_blackBBBFBBBFBBB(
				mSignature, eFieldDeclaration, tField, mName, tFieldDefinition, tFieldSignature, varDeclFragment,
				sourceMatch, targetMatch)) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[3];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result2_black[7];
			Object[] result2_green = FieldDefinitionImpl.pattern_FieldDefinition_24_2_matchcontext_greenBBBBBBBBBBFB(
					mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
					tFieldSignature, mNameToTField, varDeclFragment, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = FieldDefinitionImpl
					.pattern_FieldDefinition_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
							mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
							tFieldSignature, mNameToTField, varDeclFragment, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = FieldDefinitionImpl
						.pattern_FieldDefinition_24_4_createcorrespondence_blackBBBBBBBB(mSignature, eFieldDeclaration,
								tField, mName, tFieldDefinition, tFieldSignature, varDeclFragment, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mSignature] = " + mSignature + ", " + "[eFieldDeclaration] = "
							+ eFieldDeclaration + ", " + "[tField] = " + tField + ", " + "[mName] = " + mName + ", "
							+ "[tFieldDefinition] = " + tFieldDefinition + ", " + "[tFieldSignature] = "
							+ tFieldSignature + ", " + "[varDeclFragment] = " + varDeclFragment + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldDefinitionImpl.pattern_FieldDefinition_24_4_createcorrespondence_greenFFFBBFBBBFFFB(
						eFieldDeclaration, tField, tFieldDefinition, tFieldSignature, varDeclFragment,
						isApplicableMatch);
				// MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = (MFieldDefinitionToTFieldDefinition) result4_green[0];
				// FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = (FieldDeclarationToTFieldSignature) result4_green[1];
				// MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result4_green[2];
				// FieldDeclarationToTField eFieldDeclarationToTField = (FieldDeclarationToTField) result4_green[5];
				// VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result4_green[9];
				// MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result4_green[10];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[11];

				// add to returned result
				Object[] result5_black = FieldDefinitionImpl
						.pattern_FieldDefinition_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				FieldDefinitionImpl.pattern_FieldDefinition_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition.ID", true, csp);
		var_tFieldDefinition_ID.setValue(tFieldDefinition.getID());
		var_tFieldDefinition_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tFieldDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("eFieldDeclaration", eFieldDeclaration);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tFieldDefinition", tFieldDefinition);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("mNameToTField", mNameToTField);
		isApplicableMatch.registerObject("varDeclFragment", varDeclFragment);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {// match tgg pattern
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_27_1_matchtggpattern_blackBBBB(mSignature,
				eFieldDeclaration, mName, varDeclFragment);
		if (result1_black != null) {
			return FieldDefinitionImpl.pattern_FieldDefinition_27_2_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {// match tgg pattern
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_28_1_matchtggpattern_blackBBB(tField,
				tFieldDefinition, tFieldSignature);
		if (result1_black != null) {
			return FieldDefinitionImpl.pattern_FieldDefinition_28_2_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MFieldNameToTField mNameToTFieldParameter) {
		// create result
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mNameToTFieldList = (RuleEntryList) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			MFieldName mName = (MFieldName) result2_black[2];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result2_black[3];
			TField tField = (TField) result2_black[4];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[5];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = FieldDefinitionImpl
					.pattern_FieldDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = "
						+ mSignature + ", " + "[tField] = " + tField + ", " + "[mSignatureToTFieldSignature] = "
						+ mSignatureToTFieldSignature + ", " + "[mName] = " + mName + ", " + "[tFieldSignature] = "
						+ tFieldSignature + ", " + "[mNameToTField] = " + mNameToTField + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (FieldDefinitionImpl.pattern_FieldDefinition_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = FieldDefinitionImpl.pattern_FieldDefinition_29_5_checknacs_blackBBBBBB(
						mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField);
				if (result5_black != null) {

					// perform
					Object[] result6_black = FieldDefinitionImpl.pattern_FieldDefinition_29_6_perform_blackBBBBBBB(
							mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mSignature] = " + mSignature + ", " + "[tField] = " + tField + ", "
								+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", " + "[mName] = "
								+ mName + ", " + "[tFieldSignature] = " + tFieldSignature + ", " + "[mNameToTField] = "
								+ mNameToTField + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_29_6_perform_greenFFFBFBFFBFFFFBB(mSignature, tField,
							tFieldSignature, ruleResult, csp);
					// MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = (MFieldDefinitionToTFieldDefinition) result6_green[0];
					// FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = (FieldDeclarationToTFieldSignature) result6_green[1];
					// MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[2];
					// MFieldDefinition eFieldDeclaration = (MFieldDefinition) result6_green[4];
					// FieldDeclarationToTField eFieldDeclarationToTField = (FieldDeclarationToTField) result6_green[6];
					// TFieldDefinition tFieldDefinition = (TFieldDefinition) result6_green[7];
					// VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result6_green[9];
					// VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result6_green[10];
					// MDefinitionToTSignature mDefinitionToTSignature = (MDefinitionToTSignature) result6_green[11];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldSignature mSignature,
			TField tField, MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tFieldDefinition_ID = CSPFactoryHelper.eINSTANCE.createVariable("tFieldDefinition.ID", csp);
		var_tFieldDefinition_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tFieldDefinition_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("mNameToTField", mNameToTField);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_FWD__MATCH_MFIELDSIGNATURE_MFIELDDEFINITION_MFIELDNAME_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (MFieldName) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
		case RulesPackage.FIELD_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDSIGNATURE_MFIELDDEFINITION_MFIELDNAME_VARIABLEDECLARATIONFRAGMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (MFieldName) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
			return null;
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDSIGNATURE_MFIELDDEFINITION_MFIELDNAME_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (MFieldName) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4));
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDSIGNATURE_MFIELDDEFINITION_TFIELD_MSIGNATURETOTSIGNATURE_MFIELDNAME_TFIELDSIGNATURE_MFIELDNAMETOTFIELD_VARIABLEDECLARATIONFRAGMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (TField) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (MFieldName) arguments.get(5),
					(TFieldSignature) arguments.get(6), (MFieldNameToTField) arguments.get(7),
					(VariableDeclarationFragment) arguments.get(8));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.FIELD_DEFINITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldDefinition) arguments.get(2), (TFieldSignature) arguments.get(3));
		case RulesPackage.FIELD_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldDefinition) arguments.get(2), (TFieldSignature) arguments.get(3));
			return null;
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TFieldDefinition) arguments.get(2), (TFieldSignature) arguments.get(3));
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDSIGNATURE_TFIELD_MSIGNATURETOTSIGNATURE_MFIELDNAME_TFIELDDEFINITION_TFIELDSIGNATURE_MFIELDNAMETOTFIELD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (MSignatureToTSignature) arguments.get(3), (MFieldName) arguments.get(4),
					(TFieldDefinition) arguments.get(5), (TFieldSignature) arguments.get(6),
					(MFieldNameToTField) arguments.get(7));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.FIELD_DEFINITION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MFIELDSIGNATURE_MFIELDDEFINITION_TFIELD_MSIGNATURETOTSIGNATURE_MFIELDNAME_TFIELDDEFINITION_TFIELDSIGNATURE_MFIELDNAMETOTFIELD_VARIABLEDECLARATIONFRAGMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (TField) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (MFieldName) arguments.get(5),
					(TFieldDefinition) arguments.get(6), (TFieldSignature) arguments.get(7),
					(MFieldNameToTField) arguments.get(8), (VariableDeclarationFragment) arguments.get(9),
					(Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEFINITION___CHECK_DEC_FWD__MFIELDSIGNATURE_MFIELDDEFINITION_MFIELDNAME_VARIABLEDECLARATIONFRAGMENT:
			return checkDEC_FWD((MFieldSignature) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(MFieldName) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
		case RulesPackage.FIELD_DEFINITION___CHECK_DEC_BWD__TFIELD_TFIELDDEFINITION_TFIELDSIGNATURE:
			return checkDEC_BWD((TField) arguments.get(0), (TFieldDefinition) arguments.get(1),
					(TFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL__RULEENTRYCONTAINER_MFIELDNAMETOTFIELD:
			return generateModel((RuleEntryContainer) arguments.get(0), (MFieldNameToTField) arguments.get(1));
		case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDSIGNATURE_TFIELD_MSIGNATURETOTSIGNATURE_MFIELDNAME_TFIELDSIGNATURE_MFIELDNAMETOTFIELD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (MSignatureToTSignature) arguments.get(3), (MFieldName) arguments.get(4),
					(TFieldSignature) arguments.get(5), (MFieldNameToTField) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDefinition_0_1_initialbindings_blackBBBBBB(FieldDefinition _this,
			Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		return new Object[] { _this, match, mSignature, eFieldDeclaration, mName, varDeclFragment };
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_bindingFBBBBBB(FieldDefinition _this, Match match,
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, eFieldDeclaration, mName,
				varDeclFragment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, eFieldDeclaration, mName, varDeclFragment };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_bindingAndBlackFBBBBBB(FieldDefinition _this,
			Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		Object[] result_pattern_FieldDefinition_0_2_SolveCSP_binding = pattern_FieldDefinition_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mSignature, eFieldDeclaration, mName, varDeclFragment);
		if (result_pattern_FieldDefinition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_0_2_SolveCSP_black = pattern_FieldDefinition_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, eFieldDeclaration, mName, varDeclFragment };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_0_3_CheckCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		return new Object[] { match, mSignature, eFieldDeclaration, mName, varDeclFragment };
	}

	public static final Object[] pattern_FieldDefinition_0_4_collectelementstobetranslated_greenBBBBFFFF(Match match,
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			VariableDeclarationFragment varDeclFragment) {
		EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eFieldDeclaration);
		match.getToBeTranslatedNodes().add(varDeclFragment);
		String mSignature__eFieldDeclaration____mFieldDefinitions_name_prime = "mFieldDefinitions";
		String eFieldDeclaration__mSignature____mFieldSignature_name_prime = "mFieldSignature";
		String varDeclFragment__eFieldDeclaration____variablesContainer_name_prime = "variablesContainer";
		String eFieldDeclaration__varDeclFragment____fragments_name_prime = "fragments";
		mSignature__eFieldDeclaration____mFieldDefinitions.setSrc(mSignature);
		mSignature__eFieldDeclaration____mFieldDefinitions.setTrg(eFieldDeclaration);
		match.getToBeTranslatedEdges().add(mSignature__eFieldDeclaration____mFieldDefinitions);
		eFieldDeclaration__mSignature____mFieldSignature.setSrc(eFieldDeclaration);
		eFieldDeclaration__mSignature____mFieldSignature.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(eFieldDeclaration__mSignature____mFieldSignature);
		varDeclFragment__eFieldDeclaration____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__eFieldDeclaration____variablesContainer.setTrg(eFieldDeclaration);
		match.getToBeTranslatedEdges().add(varDeclFragment__eFieldDeclaration____variablesContainer);
		eFieldDeclaration__varDeclFragment____fragments.setSrc(eFieldDeclaration);
		eFieldDeclaration__varDeclFragment____fragments.setTrg(varDeclFragment);
		match.getToBeTranslatedEdges().add(eFieldDeclaration__varDeclFragment____fragments);
		mSignature__eFieldDeclaration____mFieldDefinitions
				.setName(mSignature__eFieldDeclaration____mFieldDefinitions_name_prime);
		eFieldDeclaration__mSignature____mFieldSignature
				.setName(eFieldDeclaration__mSignature____mFieldSignature_name_prime);
		varDeclFragment__eFieldDeclaration____variablesContainer
				.setName(varDeclFragment__eFieldDeclaration____variablesContainer_name_prime);
		eFieldDeclaration__varDeclFragment____fragments
				.setName(eFieldDeclaration__varDeclFragment____fragments_name_prime);
		return new Object[] { match, mSignature, eFieldDeclaration, varDeclFragment,
				mSignature__eFieldDeclaration____mFieldDefinitions, eFieldDeclaration__mSignature____mFieldSignature,
				varDeclFragment__eFieldDeclaration____variablesContainer,
				eFieldDeclaration__varDeclFragment____fragments };
	}

	public static final Object[] pattern_FieldDefinition_0_5_collectcontextelements_blackBBBBB(Match match,
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		return new Object[] { match, mSignature, eFieldDeclaration, mName, varDeclFragment };
	}

	public static final Object[] pattern_FieldDefinition_0_5_collectcontextelements_greenBBBFF(Match match,
			MFieldSignature mSignature, MFieldName mName) {
		EMoflonEdge mSignature__mName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mName);
		String mSignature__mName____mFieldName_name_prime = "mFieldName";
		String mName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		mSignature__mName____mFieldName.setSrc(mSignature);
		mSignature__mName____mFieldName.setTrg(mName);
		match.getContextEdges().add(mSignature__mName____mFieldName);
		mName__mSignature____mFieldSignatures.setSrc(mName);
		mName__mSignature____mFieldSignatures.setTrg(mSignature);
		match.getContextEdges().add(mName__mSignature____mFieldSignatures);
		mSignature__mName____mFieldName.setName(mSignature__mName____mFieldName_name_prime);
		mName__mSignature____mFieldSignatures.setName(mName__mSignature____mFieldSignatures_name_prime);
		return new Object[] { match, mSignature, mName, mSignature__mName____mFieldName,
				mName__mSignature____mFieldSignatures };
	}

	public static final void pattern_FieldDefinition_0_6_registerobjectstomatch_expressionBBBBBB(FieldDefinition _this,
			Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment) {
		_this.registerObjectsToMatch_FWD(match, mSignature, eFieldDeclaration, mName, varDeclFragment);

	}

	public static final boolean pattern_FieldDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("eFieldDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("tField");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mName");
		EObject _localVariable_5 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("mNameToTField");
		EObject _localVariable_7 = isApplicableMatch.getObject("varDeclFragment");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpEFieldDeclaration = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpMSignatureToTFieldSignature = _localVariable_3;
		EObject tmpMName = _localVariable_4;
		EObject tmpTFieldSignature = _localVariable_5;
		EObject tmpMNameToTField = _localVariable_6;
		EObject tmpVarDeclFragment = _localVariable_7;
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			if (tmpEFieldDeclaration instanceof MFieldDefinition) {
				MFieldDefinition eFieldDeclaration = (MFieldDefinition) tmpEFieldDeclaration;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
						MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
						if (tmpMName instanceof MFieldName) {
							MFieldName mName = (MFieldName) tmpMName;
							if (tmpTFieldSignature instanceof TFieldSignature) {
								TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
								if (tmpMNameToTField instanceof MFieldNameToTField) {
									MFieldNameToTField mNameToTField = (MFieldNameToTField) tmpMNameToTField;
									if (tmpVarDeclFragment instanceof VariableDeclarationFragment) {
										VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) tmpVarDeclFragment;
										return new Object[] { mSignature, eFieldDeclaration, tField,
												mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField,
												varDeclFragment, isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_blackBBBBBBBBFBB(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment, FieldDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
						tFieldSignature, mNameToTField, varDeclFragment, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			FieldDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDefinition_1_1_performtransformation_binding = pattern_FieldDefinition_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDefinition_1_1_performtransformation_binding != null) {
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[0];
			MFieldDefinition eFieldDeclaration = (MFieldDefinition) result_pattern_FieldDefinition_1_1_performtransformation_binding[1];
			TField tField = (TField) result_pattern_FieldDefinition_1_1_performtransformation_binding[2];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[3];
			MFieldName mName = (MFieldName) result_pattern_FieldDefinition_1_1_performtransformation_binding[4];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[5];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result_pattern_FieldDefinition_1_1_performtransformation_binding[6];
			VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) result_pattern_FieldDefinition_1_1_performtransformation_binding[7];

			Object[] result_pattern_FieldDefinition_1_1_performtransformation_black = pattern_FieldDefinition_1_1_performtransformation_blackBBBBBBBBFBB(
					mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName, tFieldSignature,
					mNameToTField, varDeclFragment, _this, isApplicableMatch);
			if (result_pattern_FieldDefinition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDefinition_1_1_performtransformation_black[8];

				return new Object[] { mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
						tFieldSignature, mNameToTField, varDeclFragment, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_greenFFFBBFFBBFFFB(
			MFieldDefinition eFieldDeclaration, TField tField, TFieldSignature tFieldSignature,
			VariableDeclarationFragment varDeclFragment, CSP csp) {
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createMFieldDefinitionToTFieldDefinition();
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = ModiscoFactory.eINSTANCE
				.createFieldDeclarationToTFieldSignature();
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		FieldDeclarationToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createFieldDeclarationToTField();
		TFieldDefinition tFieldDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tFieldDefinition", "ID");
		eFieldDeclarationToTFieldDefinition.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldSignature.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldSignature.setTarget(tFieldSignature);
		mDefinitionToTMember.setSource(eFieldDeclaration);
		eFieldDeclarationToTField.setSource(eFieldDeclaration);
		eFieldDeclarationToTField.setTarget(tField);
		eFieldDeclarationToTFieldDefinition.setTarget(tFieldDefinition);
		mDefinitionToTMember.setTarget(tFieldDefinition);
		tFieldSignature.getDefinitions().add(tFieldDefinition);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setTarget(tFieldDefinition);
		mDefinitionToTSignature.setSource(eFieldDeclaration);
		mDefinitionToTSignature.setTarget(tFieldSignature);
		mBodyToTAnnotation.setSource(eFieldDeclaration);
		mBodyToTAnnotation.setTarget(tFieldDefinition);
		int tFieldDefinition_ID_prime = (int) _localVariable_0;
		tFieldDefinition.setID(Integer.valueOf(tFieldDefinition_ID_prime));
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, tField, eFieldDeclarationToTField, tFieldDefinition,
				tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_FieldDefinition_1_2_collecttranslatedelements_blackBBBBBBBBBB(
			MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition,
			FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition eFieldDeclaration,
			FieldDeclarationToTField eFieldDeclarationToTField, TFieldDefinition tFieldDefinition,
			VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition,
			MDefinitionToTSignature mDefinitionToTSignature, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_FieldDefinition_1_2_collecttranslatedelements_greenFBBBBBBBBBB(
			MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition,
			FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition eFieldDeclaration,
			FieldDeclarationToTField eFieldDeclarationToTField, TFieldDefinition tFieldDefinition,
			VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition,
			MDefinitionToTSignature mDefinitionToTSignature, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTFieldDefinition);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTFieldSignature);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(eFieldDeclaration);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getCreatedElements().add(tFieldDefinition);
		ruleresult.getTranslatedElements().add(varDeclFragment);
		ruleresult.getCreatedLinkElements().add(varDeclFragmentToTFieldDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTSignature);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_FieldDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		if (!eFieldDeclarationToTFieldDefinition.equals(eFieldDeclarationToTFieldSignature)) {
			if (!eFieldDeclarationToTFieldDefinition.equals(mDefinitionToTMember)) {
				if (!eFieldDeclarationToTFieldDefinition.equals(mSignature)) {
					if (!eFieldDeclarationToTFieldDefinition.equals(tField)) {
						if (!eFieldDeclarationToTFieldDefinition.equals(mSignatureToTFieldSignature)) {
							if (!eFieldDeclarationToTFieldDefinition.equals(mName)) {
								if (!eFieldDeclarationToTFieldDefinition.equals(tFieldDefinition)) {
									if (!eFieldDeclarationToTFieldDefinition.equals(tFieldSignature)) {
										if (!eFieldDeclarationToTFieldDefinition.equals(mNameToTField)) {
											if (!eFieldDeclarationToTFieldDefinition.equals(varDeclFragment)) {
												if (!eFieldDeclarationToTFieldDefinition
														.equals(varDeclFragmentToTFieldDefinition)) {
													if (!eFieldDeclarationToTFieldDefinition
															.equals(mDefinitionToTSignature)) {
														if (!eFieldDeclarationToTFieldDefinition
																.equals(mBodyToTAnnotation)) {
															if (!eFieldDeclarationToTFieldSignature
																	.equals(mDefinitionToTMember)) {
																if (!eFieldDeclarationToTFieldSignature
																		.equals(mSignature)) {
																	if (!eFieldDeclarationToTFieldSignature
																			.equals(tField)) {
																		if (!eFieldDeclarationToTFieldSignature
																				.equals(mSignatureToTFieldSignature)) {
																			if (!eFieldDeclarationToTFieldSignature
																					.equals(mName)) {
																				if (!eFieldDeclarationToTFieldSignature
																						.equals(tFieldDefinition)) {
																					if (!eFieldDeclarationToTFieldSignature
																							.equals(tFieldSignature)) {
																						if (!eFieldDeclarationToTFieldSignature
																								.equals(mNameToTField)) {
																							if (!eFieldDeclarationToTFieldSignature
																									.equals(varDeclFragment)) {
																								if (!eFieldDeclarationToTFieldSignature
																										.equals(varDeclFragmentToTFieldDefinition)) {
																									if (!eFieldDeclarationToTFieldSignature
																											.equals(mDefinitionToTSignature)) {
																										if (!eFieldDeclarationToTFieldSignature
																												.equals(mBodyToTAnnotation)) {
																											if (!mDefinitionToTMember
																													.equals(mSignature)) {
																												if (!mDefinitionToTMember
																														.equals(tField)) {
																													if (!mDefinitionToTMember
																															.equals(mSignatureToTFieldSignature)) {
																														if (!mDefinitionToTMember
																																.equals(mName)) {
																															if (!mDefinitionToTMember
																																	.equals(tFieldDefinition)) {
																																if (!mDefinitionToTMember
																																		.equals(tFieldSignature)) {
																																	if (!mDefinitionToTMember
																																			.equals(mNameToTField)) {
																																		if (!mDefinitionToTMember
																																				.equals(varDeclFragment)) {
																																			if (!mDefinitionToTMember
																																					.equals(varDeclFragmentToTFieldDefinition)) {
																																				if (!mDefinitionToTMember
																																						.equals(mDefinitionToTSignature)) {
																																					if (!mSignature
																																							.equals(tField)) {
																																						if (!mSignature
																																								.equals(mSignatureToTFieldSignature)) {
																																							if (!mSignature
																																									.equals(tFieldDefinition)) {
																																								if (!mSignature
																																										.equals(tFieldSignature)) {
																																									if (!mSignature
																																											.equals(varDeclFragment)) {
																																										if (!mSignature
																																												.equals(varDeclFragmentToTFieldDefinition)) {
																																											if (!eFieldDeclaration
																																													.equals(eFieldDeclarationToTFieldDefinition)) {
																																												if (!eFieldDeclaration
																																														.equals(eFieldDeclarationToTFieldSignature)) {
																																													if (!eFieldDeclaration
																																															.equals(mDefinitionToTMember)) {
																																														if (!eFieldDeclaration
																																																.equals(mSignature)) {
																																															if (!eFieldDeclaration
																																																	.equals(tField)) {
																																																if (!eFieldDeclaration
																																																		.equals(eFieldDeclarationToTField)) {
																																																	if (!eFieldDeclaration
																																																			.equals(mSignatureToTFieldSignature)) {
																																																		if (!eFieldDeclaration
																																																				.equals(mName)) {
																																																			if (!eFieldDeclaration
																																																					.equals(tFieldDefinition)) {
																																																				if (!eFieldDeclaration
																																																						.equals(tFieldSignature)) {
																																																					if (!eFieldDeclaration
																																																							.equals(mNameToTField)) {
																																																						if (!eFieldDeclaration
																																																								.equals(varDeclFragment)) {
																																																							if (!eFieldDeclaration
																																																									.equals(varDeclFragmentToTFieldDefinition)) {
																																																								if (!eFieldDeclaration
																																																										.equals(mDefinitionToTSignature)) {
																																																									if (!eFieldDeclaration
																																																											.equals(mBodyToTAnnotation)) {
																																																										if (!tField
																																																												.equals(tFieldDefinition)) {
																																																											if (!tField
																																																													.equals(tFieldSignature)) {
																																																												if (!tField
																																																														.equals(varDeclFragment)) {
																																																													if (!tField
																																																															.equals(varDeclFragmentToTFieldDefinition)) {
																																																														if (!eFieldDeclarationToTField
																																																																.equals(eFieldDeclarationToTFieldDefinition)) {
																																																															if (!eFieldDeclarationToTField
																																																																	.equals(eFieldDeclarationToTFieldSignature)) {
																																																																if (!eFieldDeclarationToTField
																																																																		.equals(mDefinitionToTMember)) {
																																																																	if (!eFieldDeclarationToTField
																																																																			.equals(mSignature)) {
																																																																		if (!eFieldDeclarationToTField
																																																																				.equals(tField)) {
																																																																			if (!eFieldDeclarationToTField
																																																																					.equals(mSignatureToTFieldSignature)) {
																																																																				if (!eFieldDeclarationToTField
																																																																						.equals(mName)) {
																																																																					if (!eFieldDeclarationToTField
																																																																							.equals(tFieldDefinition)) {
																																																																						if (!eFieldDeclarationToTField
																																																																								.equals(tFieldSignature)) {
																																																																							if (!eFieldDeclarationToTField
																																																																									.equals(mNameToTField)) {
																																																																								if (!eFieldDeclarationToTField
																																																																										.equals(varDeclFragment)) {
																																																																									if (!eFieldDeclarationToTField
																																																																											.equals(varDeclFragmentToTFieldDefinition)) {
																																																																										if (!eFieldDeclarationToTField
																																																																												.equals(mDefinitionToTSignature)) {
																																																																											if (!eFieldDeclarationToTField
																																																																													.equals(mBodyToTAnnotation)) {
																																																																												if (!mSignatureToTFieldSignature
																																																																														.equals(tField)) {
																																																																													if (!mSignatureToTFieldSignature
																																																																															.equals(tFieldDefinition)) {
																																																																														if (!mSignatureToTFieldSignature
																																																																																.equals(tFieldSignature)) {
																																																																															if (!mSignatureToTFieldSignature
																																																																																	.equals(varDeclFragment)) {
																																																																																if (!mSignatureToTFieldSignature
																																																																																		.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																	if (!mName
																																																																																			.equals(mSignature)) {
																																																																																		if (!mName
																																																																																				.equals(tField)) {
																																																																																			if (!mName
																																																																																					.equals(mSignatureToTFieldSignature)) {
																																																																																				if (!mName
																																																																																						.equals(tFieldDefinition)) {
																																																																																					if (!mName
																																																																																							.equals(tFieldSignature)) {
																																																																																						if (!mName
																																																																																								.equals(mNameToTField)) {
																																																																																							if (!mName
																																																																																									.equals(varDeclFragment)) {
																																																																																								if (!mName
																																																																																										.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																									if (!tFieldDefinition
																																																																																											.equals(tFieldSignature)) {
																																																																																										if (!tFieldDefinition
																																																																																												.equals(varDeclFragment)) {
																																																																																											if (!tFieldDefinition
																																																																																													.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																												if (!tFieldSignature
																																																																																														.equals(varDeclFragment)) {
																																																																																													if (!tFieldSignature
																																																																																															.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																														if (!mNameToTField
																																																																																																.equals(mSignature)) {
																																																																																															if (!mNameToTField
																																																																																																	.equals(tField)) {
																																																																																																if (!mNameToTField
																																																																																																		.equals(mSignatureToTFieldSignature)) {
																																																																																																	if (!mNameToTField
																																																																																																			.equals(tFieldDefinition)) {
																																																																																																		if (!mNameToTField
																																																																																																				.equals(tFieldSignature)) {
																																																																																																			if (!mNameToTField
																																																																																																					.equals(varDeclFragment)) {
																																																																																																				if (!mNameToTField
																																																																																																						.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																					if (!varDeclFragment
																																																																																																							.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																						if (!mDefinitionToTSignature
																																																																																																								.equals(mSignature)) {
																																																																																																							if (!mDefinitionToTSignature
																																																																																																									.equals(tField)) {
																																																																																																								if (!mDefinitionToTSignature
																																																																																																										.equals(mSignatureToTFieldSignature)) {
																																																																																																									if (!mDefinitionToTSignature
																																																																																																											.equals(mName)) {
																																																																																																										if (!mDefinitionToTSignature
																																																																																																												.equals(tFieldDefinition)) {
																																																																																																											if (!mDefinitionToTSignature
																																																																																																													.equals(tFieldSignature)) {
																																																																																																												if (!mDefinitionToTSignature
																																																																																																														.equals(mNameToTField)) {
																																																																																																													if (!mDefinitionToTSignature
																																																																																																															.equals(varDeclFragment)) {
																																																																																																														if (!mDefinitionToTSignature
																																																																																																																.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																															if (!mBodyToTAnnotation
																																																																																																																	.equals(mDefinitionToTMember)) {
																																																																																																																if (!mBodyToTAnnotation
																																																																																																																		.equals(mSignature)) {
																																																																																																																	if (!mBodyToTAnnotation
																																																																																																																			.equals(tField)) {
																																																																																																																		if (!mBodyToTAnnotation
																																																																																																																				.equals(mSignatureToTFieldSignature)) {
																																																																																																																			if (!mBodyToTAnnotation
																																																																																																																					.equals(mName)) {
																																																																																																																				if (!mBodyToTAnnotation
																																																																																																																						.equals(tFieldDefinition)) {
																																																																																																																					if (!mBodyToTAnnotation
																																																																																																																							.equals(tFieldSignature)) {
																																																																																																																						if (!mBodyToTAnnotation
																																																																																																																								.equals(mNameToTField)) {
																																																																																																																							if (!mBodyToTAnnotation
																																																																																																																									.equals(varDeclFragment)) {
																																																																																																																								if (!mBodyToTAnnotation
																																																																																																																										.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																																									if (!mBodyToTAnnotation
																																																																																																																											.equals(mDefinitionToTSignature)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												eFieldDeclarationToTFieldDefinition,
																																																																																																																												eFieldDeclarationToTFieldSignature,
																																																																																																																												mDefinitionToTMember,
																																																																																																																												mSignature,
																																																																																																																												eFieldDeclaration,
																																																																																																																												tField,
																																																																																																																												eFieldDeclarationToTField,
																																																																																																																												mSignatureToTFieldSignature,
																																																																																																																												mName,
																																																																																																																												tFieldDefinition,
																																																																																																																												tFieldSignature,
																																																																																																																												mNameToTField,
																																																																																																																												varDeclFragment,
																																																																																																																												varDeclFragmentToTFieldDefinition,
																																																																																																																												mDefinitionToTSignature,
																																																																																																																												mBodyToTAnnotation };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField, EObject tFieldDefinition,
			EObject tFieldSignature, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		EMoflonEdge eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldDefinition__tFieldDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldSignature__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tFieldDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__tFieldDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tFieldDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDefinition";
		String eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String eFieldDeclarationToTFieldSignature__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mDefinitionToTMember__eFieldDeclaration____source_name_prime = "source";
		String mDefinitionToTMember__tFieldDefinition____target_name_prime = "target";
		String mSignature__eFieldDeclaration____mFieldDefinitions_name_prime = "mFieldDefinitions";
		String eFieldDeclaration__mSignature____mFieldSignature_name_prime = "mFieldSignature";
		String eFieldDeclarationToTField__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String varDeclFragment__eFieldDeclaration____variablesContainer_name_prime = "variablesContainer";
		String eFieldDeclaration__varDeclFragment____fragments_name_prime = "fragments";
		String varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime = "source";
		String varDeclFragmentToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String mDefinitionToTSignature__eFieldDeclaration____source_name_prime = "source";
		String mDefinitionToTSignature__tFieldSignature____target_name_prime = "target";
		String mBodyToTAnnotation__eFieldDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tFieldDefinition____target_name_prime = "target";
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldDefinition__tFieldDefinition____target);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source.setSrc(eFieldDeclarationToTFieldSignature);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldSignature__eFieldDeclaration____source);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target.setSrc(eFieldDeclarationToTFieldSignature);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldSignature__tFieldSignature____target);
		mDefinitionToTMember__eFieldDeclaration____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__eFieldDeclaration____source);
		mDefinitionToTMember__tFieldDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tFieldDefinition____target);
		mSignature__eFieldDeclaration____mFieldDefinitions.setSrc(mSignature);
		mSignature__eFieldDeclaration____mFieldDefinitions.setTrg(eFieldDeclaration);
		ruleresult.getTranslatedEdges().add(mSignature__eFieldDeclaration____mFieldDefinitions);
		eFieldDeclaration__mSignature____mFieldSignature.setSrc(eFieldDeclaration);
		eFieldDeclaration__mSignature____mFieldSignature.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(eFieldDeclaration__mSignature____mFieldSignature);
		eFieldDeclarationToTField__eFieldDeclaration____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__eFieldDeclaration____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		tFieldSignature__tFieldDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(tFieldDefinition__tFieldSignature____signature);
		varDeclFragment__eFieldDeclaration____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__eFieldDeclaration____variablesContainer.setTrg(eFieldDeclaration);
		ruleresult.getTranslatedEdges().add(varDeclFragment__eFieldDeclaration____variablesContainer);
		eFieldDeclaration__varDeclFragment____fragments.setSrc(eFieldDeclaration);
		eFieldDeclaration__varDeclFragment____fragments.setTrg(varDeclFragment);
		ruleresult.getTranslatedEdges().add(eFieldDeclaration__varDeclFragment____fragments);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setTrg(varDeclFragment);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__varDeclFragment____source);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__tFieldDefinition____target);
		mDefinitionToTSignature__eFieldDeclaration____source.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__eFieldDeclaration____source);
		mDefinitionToTSignature__tFieldSignature____target.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__tFieldSignature____target.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__tFieldSignature____target);
		mBodyToTAnnotation__eFieldDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eFieldDeclaration____source);
		mBodyToTAnnotation__tFieldDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tFieldDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source
				.setName(eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target
				.setName(eFieldDeclarationToTFieldDefinition__tFieldDefinition____target_name_prime);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source
				.setName(eFieldDeclarationToTFieldSignature__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target
				.setName(eFieldDeclarationToTFieldSignature__tFieldSignature____target_name_prime);
		mDefinitionToTMember__eFieldDeclaration____source
				.setName(mDefinitionToTMember__eFieldDeclaration____source_name_prime);
		mDefinitionToTMember__tFieldDefinition____target
				.setName(mDefinitionToTMember__tFieldDefinition____target_name_prime);
		mSignature__eFieldDeclaration____mFieldDefinitions
				.setName(mSignature__eFieldDeclaration____mFieldDefinitions_name_prime);
		eFieldDeclaration__mSignature____mFieldSignature
				.setName(eFieldDeclaration__mSignature____mFieldSignature_name_prime);
		eFieldDeclarationToTField__eFieldDeclaration____source
				.setName(eFieldDeclarationToTField__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		varDeclFragment__eFieldDeclaration____variablesContainer
				.setName(varDeclFragment__eFieldDeclaration____variablesContainer_name_prime);
		eFieldDeclaration__varDeclFragment____fragments
				.setName(eFieldDeclaration__varDeclFragment____fragments_name_prime);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source
				.setName(varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target
				.setName(varDeclFragmentToTFieldDefinition__tFieldDefinition____target_name_prime);
		mDefinitionToTSignature__eFieldDeclaration____source
				.setName(mDefinitionToTSignature__eFieldDeclaration____source_name_prime);
		mDefinitionToTSignature__tFieldSignature____target
				.setName(mDefinitionToTSignature__tFieldSignature____target_name_prime);
		mBodyToTAnnotation__eFieldDeclaration____source
				.setName(mBodyToTAnnotation__eFieldDeclaration____source_name_prime);
		mBodyToTAnnotation__tFieldDefinition____target
				.setName(mBodyToTAnnotation__tFieldDefinition____target_name_prime);
		return new Object[] { ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation,
				eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source,
				eFieldDeclarationToTFieldDefinition__tFieldDefinition____target,
				eFieldDeclarationToTFieldSignature__eFieldDeclaration____source,
				eFieldDeclarationToTFieldSignature__tFieldSignature____target,
				mDefinitionToTMember__eFieldDeclaration____source, mDefinitionToTMember__tFieldDefinition____target,
				mSignature__eFieldDeclaration____mFieldDefinitions, eFieldDeclaration__mSignature____mFieldSignature,
				eFieldDeclarationToTField__eFieldDeclaration____source, eFieldDeclarationToTField__tField____target,
				tFieldSignature__tFieldDefinition____definitions, tFieldDefinition__tFieldSignature____signature,
				varDeclFragment__eFieldDeclaration____variablesContainer,
				eFieldDeclaration__varDeclFragment____fragments,
				varDeclFragmentToTFieldDefinition__varDeclFragment____source,
				varDeclFragmentToTFieldDefinition__tFieldDefinition____target,
				mDefinitionToTSignature__eFieldDeclaration____source,
				mDefinitionToTSignature__tFieldSignature____target, mBodyToTAnnotation__eFieldDeclaration____source,
				mBodyToTAnnotation__tFieldDefinition____target };
	}

	public static final void pattern_FieldDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			FieldDefinition _this, PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		_this.registerObjects_FWD(ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);

	}

	public static final PerformRuleResult pattern_FieldDefinition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_2_1_preparereturnvalue_binding = pattern_FieldDefinition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDefinition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_2_1_preparereturnvalue_black = pattern_FieldDefinition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDefinition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDefinition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDefinition_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("eFieldDeclaration");
		EObject _localVariable_2 = match.getObject("mName");
		EObject _localVariable_3 = match.getObject("varDeclFragment");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpEFieldDeclaration = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpVarDeclFragment = _localVariable_3;
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			if (tmpEFieldDeclaration instanceof MFieldDefinition) {
				MFieldDefinition eFieldDeclaration = (MFieldDefinition) tmpEFieldDeclaration;
				if (tmpMName instanceof MFieldName) {
					MFieldName mName = (MFieldName) tmpMName;
					if (tmpVarDeclFragment instanceof VariableDeclarationFragment) {
						VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) tmpVarDeclFragment;
						return new Object[] { mSignature, eFieldDeclaration, mName, varDeclFragment, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_2_2_corematch_blackBBFFBFFBB(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, MFieldName mName,
			VariableDeclarationFragment varDeclFragment, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tmpTFieldSignature = mSignatureToTFieldSignature.getTarget();
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				for (MFieldNameToTField mNameToTField : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mName, MFieldNameToTField.class, "source")) {
					TField tField = mNameToTField.getTarget();
					if (tField != null) {
						_result.add(new Object[] { mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature,
								mName, tFieldSignature, mNameToTField, varDeclFragment, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_2_3_findcontext_blackBBBBBBBB(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.getMFieldDefinitions().contains(eFieldDeclaration)) {
			if (tField.equals(tFieldSignature.getField())) {
				if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
					if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
						if (mName.equals(mSignature.getMFieldName())) {
							if (mName.equals(mNameToTField.getSource())) {
								if (tField.equals(mNameToTField.getTarget())) {
									if (eFieldDeclaration.equals(varDeclFragment.getVariablesContainer())) {
										_result.add(new Object[] { mSignature, eFieldDeclaration, tField,
												mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField,
												varDeclFragment });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__mName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTField__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__eFieldDeclaration____mFieldDefinitions_name_prime = "mFieldDefinitions";
		String eFieldDeclaration__mSignature____mFieldSignature_name_prime = "mFieldSignature";
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mSignature__mName____mFieldName_name_prime = "mFieldName";
		String mName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		String mNameToTField__mName____source_name_prime = "source";
		String mNameToTField__tField____target_name_prime = "target";
		String varDeclFragment__eFieldDeclaration____variablesContainer_name_prime = "variablesContainer";
		String eFieldDeclaration__varDeclFragment____fragments_name_prime = "fragments";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(eFieldDeclaration);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mNameToTField);
		isApplicableMatch.getAllContextElements().add(varDeclFragment);
		mSignature__eFieldDeclaration____mFieldDefinitions.setSrc(mSignature);
		mSignature__eFieldDeclaration____mFieldDefinitions.setTrg(eFieldDeclaration);
		isApplicableMatch.getAllContextElements().add(mSignature__eFieldDeclaration____mFieldDefinitions);
		eFieldDeclaration__mSignature____mFieldSignature.setSrc(eFieldDeclaration);
		eFieldDeclaration__mSignature____mFieldSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(eFieldDeclaration__mSignature____mFieldSignature);
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tField__tFieldSignature____signatures);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		mSignature__mName____mFieldName.setSrc(mSignature);
		mSignature__mName____mFieldName.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mSignature__mName____mFieldName);
		mName__mSignature____mFieldSignatures.setSrc(mName);
		mName__mSignature____mFieldSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mFieldSignatures);
		mNameToTField__mName____source.setSrc(mNameToTField);
		mNameToTField__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTField__mName____source);
		mNameToTField__tField____target.setSrc(mNameToTField);
		mNameToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mNameToTField__tField____target);
		varDeclFragment__eFieldDeclaration____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__eFieldDeclaration____variablesContainer.setTrg(eFieldDeclaration);
		isApplicableMatch.getAllContextElements().add(varDeclFragment__eFieldDeclaration____variablesContainer);
		eFieldDeclaration__varDeclFragment____fragments.setSrc(eFieldDeclaration);
		eFieldDeclaration__varDeclFragment____fragments.setTrg(varDeclFragment);
		isApplicableMatch.getAllContextElements().add(eFieldDeclaration__varDeclFragment____fragments);
		mSignature__eFieldDeclaration____mFieldDefinitions
				.setName(mSignature__eFieldDeclaration____mFieldDefinitions_name_prime);
		eFieldDeclaration__mSignature____mFieldSignature
				.setName(eFieldDeclaration__mSignature____mFieldSignature_name_prime);
		tFieldSignature__tField____field.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures.setName(tField__tFieldSignature____signatures_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		mSignature__mName____mFieldName.setName(mSignature__mName____mFieldName_name_prime);
		mName__mSignature____mFieldSignatures.setName(mName__mSignature____mFieldSignatures_name_prime);
		mNameToTField__mName____source.setName(mNameToTField__mName____source_name_prime);
		mNameToTField__tField____target.setName(mNameToTField__tField____target_name_prime);
		varDeclFragment__eFieldDeclaration____variablesContainer
				.setName(varDeclFragment__eFieldDeclaration____variablesContainer_name_prime);
		eFieldDeclaration__varDeclFragment____fragments
				.setName(eFieldDeclaration__varDeclFragment____fragments_name_prime);
		return new Object[] { mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
				tFieldSignature, mNameToTField, varDeclFragment, isApplicableMatch,
				mSignature__eFieldDeclaration____mFieldDefinitions, eFieldDeclaration__mSignature____mFieldSignature,
				tFieldSignature__tField____field, tField__tFieldSignature____signatures,
				mSignatureToTFieldSignature__mSignature____source,
				mSignatureToTFieldSignature__tFieldSignature____target, mSignature__mName____mFieldName,
				mName__mSignature____mFieldSignatures, mNameToTField__mName____source, mNameToTField__tField____target,
				varDeclFragment__eFieldDeclaration____variablesContainer,
				eFieldDeclaration__varDeclFragment____fragments };
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_bindingFBBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			TField tField, MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField,
			VariableDeclarationFragment varDeclFragment) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, eFieldDeclaration, tField,
				mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField, varDeclFragment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, eFieldDeclaration, tField,
					mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField, varDeclFragment };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			TField tField, MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField,
			VariableDeclarationFragment varDeclFragment) {
		Object[] result_pattern_FieldDefinition_2_4_solveCSP_binding = pattern_FieldDefinition_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
				tFieldSignature, mNameToTField, varDeclFragment);
		if (result_pattern_FieldDefinition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_2_4_solveCSP_black = pattern_FieldDefinition_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, eFieldDeclaration, tField,
						mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField, varDeclFragment };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_2_5_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_10_1_initialbindings_blackBBBBB(FieldDefinition _this,
			Match match, TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { _this, match, tField, tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_bindingFBBBBB(FieldDefinition _this, Match match,
			TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tField, tFieldDefinition, tFieldSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tField, tFieldDefinition, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(FieldDefinition _this,
			Match match, TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		Object[] result_pattern_FieldDefinition_10_2_SolveCSP_binding = pattern_FieldDefinition_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tField, tFieldDefinition, tFieldSignature);
		if (result_pattern_FieldDefinition_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_10_2_SolveCSP_black = pattern_FieldDefinition_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tField, tFieldDefinition, tFieldSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_10_3_CheckCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { match, tField, tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldDefinition_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tFieldDefinition);
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		tFieldSignature__tFieldDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions.setTrg(tFieldDefinition);
		match.getToBeTranslatedEdges().add(tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(tFieldDefinition__tFieldSignature____signature);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		return new Object[] { match, tFieldDefinition, tFieldSignature,
				tFieldSignature__tFieldDefinition____definitions, tFieldDefinition__tFieldSignature____signature };
	}

	public static final Object[] pattern_FieldDefinition_10_5_collectcontextelements_blackBBBB(Match match,
			TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		return new Object[] { match, tField, tFieldDefinition, tFieldSignature };
	}

	public static final Object[] pattern_FieldDefinition_10_5_collectcontextelements_greenBBBFF(Match match,
			TField tField, TFieldSignature tFieldSignature) {
		EMoflonEdge tFieldSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tField);
		match.getContextNodes().add(tFieldSignature);
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		match.getContextEdges().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		match.getContextEdges().add(tField__tFieldSignature____signatures);
		tFieldSignature__tField____field.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures.setName(tField__tFieldSignature____signatures_name_prime);
		return new Object[] { match, tField, tFieldSignature, tFieldSignature__tField____field,
				tField__tFieldSignature____signatures };
	}

	public static final void pattern_FieldDefinition_10_6_registerobjectstomatch_expressionBBBBB(FieldDefinition _this,
			Match match, TField tField, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		_this.registerObjectsToMatch_BWD(match, tField, tFieldDefinition, tFieldSignature);

	}

	public static final boolean pattern_FieldDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tField");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mName");
		EObject _localVariable_4 = isApplicableMatch.getObject("tFieldDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("mNameToTField");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		EObject tmpMSignatureToTFieldSignature = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpTFieldDefinition = _localVariable_4;
		EObject tmpTFieldSignature = _localVariable_5;
		EObject tmpMNameToTField = _localVariable_6;
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
					if (tmpMName instanceof MFieldName) {
						MFieldName mName = (MFieldName) tmpMName;
						if (tmpTFieldDefinition instanceof TFieldDefinition) {
							TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
							if (tmpTFieldSignature instanceof TFieldSignature) {
								TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
								if (tmpMNameToTField instanceof MFieldNameToTField) {
									MFieldNameToTField mNameToTField = (MFieldNameToTField) tmpMNameToTField;
									return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName,
											tFieldDefinition, tFieldSignature, mNameToTField, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_blackBBBBBBBFBB(
			MFieldSignature mSignature, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, FieldDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
						tFieldSignature, mNameToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			FieldDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDefinition_11_1_performtransformation_binding = pattern_FieldDefinition_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDefinition_11_1_performtransformation_binding != null) {
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[0];
			TField tField = (TField) result_pattern_FieldDefinition_11_1_performtransformation_binding[1];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[2];
			MFieldName mName = (MFieldName) result_pattern_FieldDefinition_11_1_performtransformation_binding[3];
			TFieldDefinition tFieldDefinition = (TFieldDefinition) result_pattern_FieldDefinition_11_1_performtransformation_binding[4];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[5];
			MFieldNameToTField mNameToTField = (MFieldNameToTField) result_pattern_FieldDefinition_11_1_performtransformation_binding[6];

			Object[] result_pattern_FieldDefinition_11_1_performtransformation_black = pattern_FieldDefinition_11_1_performtransformation_blackBBBBBBBFBB(
					mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature,
					mNameToTField, _this, isApplicableMatch);
			if (result_pattern_FieldDefinition_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDefinition_11_1_performtransformation_black[7];

				return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
						tFieldSignature, mNameToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_greenFFFBFBFBBFFFF(
			MFieldSignature mSignature, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature) {
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createMFieldDefinitionToTFieldDefinition();
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = ModiscoFactory.eINSTANCE
				.createFieldDeclarationToTFieldSignature();
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MFieldDefinition eFieldDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldDefinition();
		FieldDeclarationToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createFieldDeclarationToTField();
		VariableDeclarationFragment varDeclFragment = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		eFieldDeclarationToTFieldDefinition.setTarget(tFieldDefinition);
		eFieldDeclarationToTFieldSignature.setTarget(tFieldSignature);
		mDefinitionToTMember.setTarget(tFieldDefinition);
		eFieldDeclarationToTFieldDefinition.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldSignature.setSource(eFieldDeclaration);
		mDefinitionToTMember.setSource(eFieldDeclaration);
		mSignature.getMFieldDefinitions().add(eFieldDeclaration);
		eFieldDeclarationToTField.setSource(eFieldDeclaration);
		eFieldDeclarationToTField.setTarget(tField);
		varDeclFragment.setVariablesContainer(eFieldDeclaration);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setTarget(tFieldDefinition);
		mDefinitionToTSignature.setSource(eFieldDeclaration);
		mDefinitionToTSignature.setTarget(tFieldSignature);
		mBodyToTAnnotation.setSource(eFieldDeclaration);
		mBodyToTAnnotation.setTarget(tFieldDefinition);
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_FieldDefinition_11_2_collecttranslatedelements_blackBBBBBBBBBB(
			MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition,
			FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition eFieldDeclaration,
			FieldDeclarationToTField eFieldDeclarationToTField, TFieldDefinition tFieldDefinition,
			VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition,
			MDefinitionToTSignature mDefinitionToTSignature, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_FieldDefinition_11_2_collecttranslatedelements_greenFBBBBBBBBBB(
			MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition,
			FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition eFieldDeclaration,
			FieldDeclarationToTField eFieldDeclarationToTField, TFieldDefinition tFieldDefinition,
			VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition,
			MDefinitionToTSignature mDefinitionToTSignature, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTFieldDefinition);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTFieldSignature);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(eFieldDeclaration);
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getTranslatedElements().add(tFieldDefinition);
		ruleresult.getCreatedElements().add(varDeclFragment);
		ruleresult.getCreatedLinkElements().add(varDeclFragmentToTFieldDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTSignature);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, eFieldDeclarationToTField, tFieldDefinition, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation };
	}

	public static final Object[] pattern_FieldDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		if (!eFieldDeclarationToTFieldDefinition.equals(eFieldDeclarationToTFieldSignature)) {
			if (!eFieldDeclarationToTFieldDefinition.equals(mDefinitionToTMember)) {
				if (!eFieldDeclarationToTFieldDefinition.equals(mSignature)) {
					if (!eFieldDeclarationToTFieldDefinition.equals(tField)) {
						if (!eFieldDeclarationToTFieldDefinition.equals(mSignatureToTFieldSignature)) {
							if (!eFieldDeclarationToTFieldDefinition.equals(mName)) {
								if (!eFieldDeclarationToTFieldDefinition.equals(tFieldDefinition)) {
									if (!eFieldDeclarationToTFieldDefinition.equals(tFieldSignature)) {
										if (!eFieldDeclarationToTFieldDefinition.equals(mNameToTField)) {
											if (!eFieldDeclarationToTFieldDefinition.equals(varDeclFragment)) {
												if (!eFieldDeclarationToTFieldDefinition
														.equals(varDeclFragmentToTFieldDefinition)) {
													if (!eFieldDeclarationToTFieldDefinition
															.equals(mDefinitionToTSignature)) {
														if (!eFieldDeclarationToTFieldDefinition
																.equals(mBodyToTAnnotation)) {
															if (!eFieldDeclarationToTFieldSignature
																	.equals(mDefinitionToTMember)) {
																if (!eFieldDeclarationToTFieldSignature
																		.equals(mSignature)) {
																	if (!eFieldDeclarationToTFieldSignature
																			.equals(tField)) {
																		if (!eFieldDeclarationToTFieldSignature
																				.equals(mSignatureToTFieldSignature)) {
																			if (!eFieldDeclarationToTFieldSignature
																					.equals(mName)) {
																				if (!eFieldDeclarationToTFieldSignature
																						.equals(tFieldDefinition)) {
																					if (!eFieldDeclarationToTFieldSignature
																							.equals(tFieldSignature)) {
																						if (!eFieldDeclarationToTFieldSignature
																								.equals(mNameToTField)) {
																							if (!eFieldDeclarationToTFieldSignature
																									.equals(varDeclFragment)) {
																								if (!eFieldDeclarationToTFieldSignature
																										.equals(varDeclFragmentToTFieldDefinition)) {
																									if (!eFieldDeclarationToTFieldSignature
																											.equals(mDefinitionToTSignature)) {
																										if (!eFieldDeclarationToTFieldSignature
																												.equals(mBodyToTAnnotation)) {
																											if (!mDefinitionToTMember
																													.equals(mSignature)) {
																												if (!mDefinitionToTMember
																														.equals(tField)) {
																													if (!mDefinitionToTMember
																															.equals(mSignatureToTFieldSignature)) {
																														if (!mDefinitionToTMember
																																.equals(mName)) {
																															if (!mDefinitionToTMember
																																	.equals(tFieldDefinition)) {
																																if (!mDefinitionToTMember
																																		.equals(tFieldSignature)) {
																																	if (!mDefinitionToTMember
																																			.equals(mNameToTField)) {
																																		if (!mDefinitionToTMember
																																				.equals(varDeclFragment)) {
																																			if (!mDefinitionToTMember
																																					.equals(varDeclFragmentToTFieldDefinition)) {
																																				if (!mDefinitionToTMember
																																						.equals(mDefinitionToTSignature)) {
																																					if (!mSignature
																																							.equals(tField)) {
																																						if (!mSignature
																																								.equals(mSignatureToTFieldSignature)) {
																																							if (!mSignature
																																									.equals(tFieldDefinition)) {
																																								if (!mSignature
																																										.equals(tFieldSignature)) {
																																									if (!mSignature
																																											.equals(varDeclFragment)) {
																																										if (!mSignature
																																												.equals(varDeclFragmentToTFieldDefinition)) {
																																											if (!eFieldDeclaration
																																													.equals(eFieldDeclarationToTFieldDefinition)) {
																																												if (!eFieldDeclaration
																																														.equals(eFieldDeclarationToTFieldSignature)) {
																																													if (!eFieldDeclaration
																																															.equals(mDefinitionToTMember)) {
																																														if (!eFieldDeclaration
																																																.equals(mSignature)) {
																																															if (!eFieldDeclaration
																																																	.equals(tField)) {
																																																if (!eFieldDeclaration
																																																		.equals(eFieldDeclarationToTField)) {
																																																	if (!eFieldDeclaration
																																																			.equals(mSignatureToTFieldSignature)) {
																																																		if (!eFieldDeclaration
																																																				.equals(mName)) {
																																																			if (!eFieldDeclaration
																																																					.equals(tFieldDefinition)) {
																																																				if (!eFieldDeclaration
																																																						.equals(tFieldSignature)) {
																																																					if (!eFieldDeclaration
																																																							.equals(mNameToTField)) {
																																																						if (!eFieldDeclaration
																																																								.equals(varDeclFragment)) {
																																																							if (!eFieldDeclaration
																																																									.equals(varDeclFragmentToTFieldDefinition)) {
																																																								if (!eFieldDeclaration
																																																										.equals(mDefinitionToTSignature)) {
																																																									if (!eFieldDeclaration
																																																											.equals(mBodyToTAnnotation)) {
																																																										if (!tField
																																																												.equals(tFieldDefinition)) {
																																																											if (!tField
																																																													.equals(tFieldSignature)) {
																																																												if (!tField
																																																														.equals(varDeclFragment)) {
																																																													if (!tField
																																																															.equals(varDeclFragmentToTFieldDefinition)) {
																																																														if (!eFieldDeclarationToTField
																																																																.equals(eFieldDeclarationToTFieldDefinition)) {
																																																															if (!eFieldDeclarationToTField
																																																																	.equals(eFieldDeclarationToTFieldSignature)) {
																																																																if (!eFieldDeclarationToTField
																																																																		.equals(mDefinitionToTMember)) {
																																																																	if (!eFieldDeclarationToTField
																																																																			.equals(mSignature)) {
																																																																		if (!eFieldDeclarationToTField
																																																																				.equals(tField)) {
																																																																			if (!eFieldDeclarationToTField
																																																																					.equals(mSignatureToTFieldSignature)) {
																																																																				if (!eFieldDeclarationToTField
																																																																						.equals(mName)) {
																																																																					if (!eFieldDeclarationToTField
																																																																							.equals(tFieldDefinition)) {
																																																																						if (!eFieldDeclarationToTField
																																																																								.equals(tFieldSignature)) {
																																																																							if (!eFieldDeclarationToTField
																																																																									.equals(mNameToTField)) {
																																																																								if (!eFieldDeclarationToTField
																																																																										.equals(varDeclFragment)) {
																																																																									if (!eFieldDeclarationToTField
																																																																											.equals(varDeclFragmentToTFieldDefinition)) {
																																																																										if (!eFieldDeclarationToTField
																																																																												.equals(mDefinitionToTSignature)) {
																																																																											if (!eFieldDeclarationToTField
																																																																													.equals(mBodyToTAnnotation)) {
																																																																												if (!mSignatureToTFieldSignature
																																																																														.equals(tField)) {
																																																																													if (!mSignatureToTFieldSignature
																																																																															.equals(tFieldDefinition)) {
																																																																														if (!mSignatureToTFieldSignature
																																																																																.equals(tFieldSignature)) {
																																																																															if (!mSignatureToTFieldSignature
																																																																																	.equals(varDeclFragment)) {
																																																																																if (!mSignatureToTFieldSignature
																																																																																		.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																	if (!mName
																																																																																			.equals(mSignature)) {
																																																																																		if (!mName
																																																																																				.equals(tField)) {
																																																																																			if (!mName
																																																																																					.equals(mSignatureToTFieldSignature)) {
																																																																																				if (!mName
																																																																																						.equals(tFieldDefinition)) {
																																																																																					if (!mName
																																																																																							.equals(tFieldSignature)) {
																																																																																						if (!mName
																																																																																								.equals(mNameToTField)) {
																																																																																							if (!mName
																																																																																									.equals(varDeclFragment)) {
																																																																																								if (!mName
																																																																																										.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																									if (!tFieldDefinition
																																																																																											.equals(tFieldSignature)) {
																																																																																										if (!tFieldDefinition
																																																																																												.equals(varDeclFragment)) {
																																																																																											if (!tFieldDefinition
																																																																																													.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																												if (!tFieldSignature
																																																																																														.equals(varDeclFragment)) {
																																																																																													if (!tFieldSignature
																																																																																															.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																														if (!mNameToTField
																																																																																																.equals(mSignature)) {
																																																																																															if (!mNameToTField
																																																																																																	.equals(tField)) {
																																																																																																if (!mNameToTField
																																																																																																		.equals(mSignatureToTFieldSignature)) {
																																																																																																	if (!mNameToTField
																																																																																																			.equals(tFieldDefinition)) {
																																																																																																		if (!mNameToTField
																																																																																																				.equals(tFieldSignature)) {
																																																																																																			if (!mNameToTField
																																																																																																					.equals(varDeclFragment)) {
																																																																																																				if (!mNameToTField
																																																																																																						.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																					if (!varDeclFragment
																																																																																																							.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																						if (!mDefinitionToTSignature
																																																																																																								.equals(mSignature)) {
																																																																																																							if (!mDefinitionToTSignature
																																																																																																									.equals(tField)) {
																																																																																																								if (!mDefinitionToTSignature
																																																																																																										.equals(mSignatureToTFieldSignature)) {
																																																																																																									if (!mDefinitionToTSignature
																																																																																																											.equals(mName)) {
																																																																																																										if (!mDefinitionToTSignature
																																																																																																												.equals(tFieldDefinition)) {
																																																																																																											if (!mDefinitionToTSignature
																																																																																																													.equals(tFieldSignature)) {
																																																																																																												if (!mDefinitionToTSignature
																																																																																																														.equals(mNameToTField)) {
																																																																																																													if (!mDefinitionToTSignature
																																																																																																															.equals(varDeclFragment)) {
																																																																																																														if (!mDefinitionToTSignature
																																																																																																																.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																															if (!mBodyToTAnnotation
																																																																																																																	.equals(mDefinitionToTMember)) {
																																																																																																																if (!mBodyToTAnnotation
																																																																																																																		.equals(mSignature)) {
																																																																																																																	if (!mBodyToTAnnotation
																																																																																																																			.equals(tField)) {
																																																																																																																		if (!mBodyToTAnnotation
																																																																																																																				.equals(mSignatureToTFieldSignature)) {
																																																																																																																			if (!mBodyToTAnnotation
																																																																																																																					.equals(mName)) {
																																																																																																																				if (!mBodyToTAnnotation
																																																																																																																						.equals(tFieldDefinition)) {
																																																																																																																					if (!mBodyToTAnnotation
																																																																																																																							.equals(tFieldSignature)) {
																																																																																																																						if (!mBodyToTAnnotation
																																																																																																																								.equals(mNameToTField)) {
																																																																																																																							if (!mBodyToTAnnotation
																																																																																																																									.equals(varDeclFragment)) {
																																																																																																																								if (!mBodyToTAnnotation
																																																																																																																										.equals(varDeclFragmentToTFieldDefinition)) {
																																																																																																																									if (!mBodyToTAnnotation
																																																																																																																											.equals(mDefinitionToTSignature)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												eFieldDeclarationToTFieldDefinition,
																																																																																																																												eFieldDeclarationToTFieldSignature,
																																																																																																																												mDefinitionToTMember,
																																																																																																																												mSignature,
																																																																																																																												eFieldDeclaration,
																																																																																																																												tField,
																																																																																																																												eFieldDeclarationToTField,
																																																																																																																												mSignatureToTFieldSignature,
																																																																																																																												mName,
																																																																																																																												tFieldDefinition,
																																																																																																																												tFieldSignature,
																																																																																																																												mNameToTField,
																																																																																																																												varDeclFragment,
																																																																																																																												varDeclFragmentToTFieldDefinition,
																																																																																																																												mDefinitionToTSignature,
																																																																																																																												mBodyToTAnnotation };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField, EObject tFieldDefinition,
			EObject tFieldSignature, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		EMoflonEdge eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldDefinition__tFieldDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldSignature__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tFieldDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__eFieldDeclaration____mFieldDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__mSignature____mFieldSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__eFieldDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragment__eFieldDeclaration____variablesContainer = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclaration__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__tFieldDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eFieldDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tFieldDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDefinition";
		String eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String eFieldDeclarationToTFieldSignature__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mDefinitionToTMember__eFieldDeclaration____source_name_prime = "source";
		String mDefinitionToTMember__tFieldDefinition____target_name_prime = "target";
		String mSignature__eFieldDeclaration____mFieldDefinitions_name_prime = "mFieldDefinitions";
		String eFieldDeclaration__mSignature____mFieldSignature_name_prime = "mFieldSignature";
		String eFieldDeclarationToTField__eFieldDeclaration____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String varDeclFragment__eFieldDeclaration____variablesContainer_name_prime = "variablesContainer";
		String eFieldDeclaration__varDeclFragment____fragments_name_prime = "fragments";
		String varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime = "source";
		String varDeclFragmentToTFieldDefinition__tFieldDefinition____target_name_prime = "target";
		String mDefinitionToTSignature__eFieldDeclaration____source_name_prime = "source";
		String mDefinitionToTSignature__tFieldSignature____target_name_prime = "target";
		String mBodyToTAnnotation__eFieldDeclaration____source_name_prime = "source";
		String mBodyToTAnnotation__tFieldDefinition____target_name_prime = "target";
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldDefinition__tFieldDefinition____target);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source.setSrc(eFieldDeclarationToTFieldSignature);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldSignature__eFieldDeclaration____source);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target.setSrc(eFieldDeclarationToTFieldSignature);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTFieldSignature__tFieldSignature____target);
		mDefinitionToTMember__eFieldDeclaration____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__eFieldDeclaration____source);
		mDefinitionToTMember__tFieldDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tFieldDefinition____target);
		mSignature__eFieldDeclaration____mFieldDefinitions.setSrc(mSignature);
		mSignature__eFieldDeclaration____mFieldDefinitions.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mSignature__eFieldDeclaration____mFieldDefinitions);
		eFieldDeclaration__mSignature____mFieldSignature.setSrc(eFieldDeclaration);
		eFieldDeclaration__mSignature____mFieldSignature.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(eFieldDeclaration__mSignature____mFieldSignature);
		eFieldDeclarationToTField__eFieldDeclaration____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__eFieldDeclaration____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		tFieldSignature__tFieldDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions.setTrg(tFieldDefinition);
		ruleresult.getTranslatedEdges().add(tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(tFieldDefinition__tFieldSignature____signature);
		varDeclFragment__eFieldDeclaration____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__eFieldDeclaration____variablesContainer.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(varDeclFragment__eFieldDeclaration____variablesContainer);
		eFieldDeclaration__varDeclFragment____fragments.setSrc(eFieldDeclaration);
		eFieldDeclaration__varDeclFragment____fragments.setTrg(varDeclFragment);
		ruleresult.getCreatedEdges().add(eFieldDeclaration__varDeclFragment____fragments);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setTrg(varDeclFragment);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__varDeclFragment____source);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__tFieldDefinition____target);
		mDefinitionToTSignature__eFieldDeclaration____source.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__eFieldDeclaration____source);
		mDefinitionToTSignature__tFieldSignature____target.setSrc(mDefinitionToTSignature);
		mDefinitionToTSignature__tFieldSignature____target.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(mDefinitionToTSignature__tFieldSignature____target);
		mBodyToTAnnotation__eFieldDeclaration____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eFieldDeclaration____source.setTrg(eFieldDeclaration);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eFieldDeclaration____source);
		mBodyToTAnnotation__tFieldDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tFieldDefinition____target.setTrg(tFieldDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tFieldDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source
				.setName(eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTFieldDefinition__tFieldDefinition____target
				.setName(eFieldDeclarationToTFieldDefinition__tFieldDefinition____target_name_prime);
		eFieldDeclarationToTFieldSignature__eFieldDeclaration____source
				.setName(eFieldDeclarationToTFieldSignature__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTFieldSignature__tFieldSignature____target
				.setName(eFieldDeclarationToTFieldSignature__tFieldSignature____target_name_prime);
		mDefinitionToTMember__eFieldDeclaration____source
				.setName(mDefinitionToTMember__eFieldDeclaration____source_name_prime);
		mDefinitionToTMember__tFieldDefinition____target
				.setName(mDefinitionToTMember__tFieldDefinition____target_name_prime);
		mSignature__eFieldDeclaration____mFieldDefinitions
				.setName(mSignature__eFieldDeclaration____mFieldDefinitions_name_prime);
		eFieldDeclaration__mSignature____mFieldSignature
				.setName(eFieldDeclaration__mSignature____mFieldSignature_name_prime);
		eFieldDeclarationToTField__eFieldDeclaration____source
				.setName(eFieldDeclarationToTField__eFieldDeclaration____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		varDeclFragment__eFieldDeclaration____variablesContainer
				.setName(varDeclFragment__eFieldDeclaration____variablesContainer_name_prime);
		eFieldDeclaration__varDeclFragment____fragments
				.setName(eFieldDeclaration__varDeclFragment____fragments_name_prime);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source
				.setName(varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime);
		varDeclFragmentToTFieldDefinition__tFieldDefinition____target
				.setName(varDeclFragmentToTFieldDefinition__tFieldDefinition____target_name_prime);
		mDefinitionToTSignature__eFieldDeclaration____source
				.setName(mDefinitionToTSignature__eFieldDeclaration____source_name_prime);
		mDefinitionToTSignature__tFieldSignature____target
				.setName(mDefinitionToTSignature__tFieldSignature____target_name_prime);
		mBodyToTAnnotation__eFieldDeclaration____source
				.setName(mBodyToTAnnotation__eFieldDeclaration____source_name_prime);
		mBodyToTAnnotation__tFieldDefinition____target
				.setName(mBodyToTAnnotation__tFieldDefinition____target_name_prime);
		return new Object[] { ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation,
				eFieldDeclarationToTFieldDefinition__eFieldDeclaration____source,
				eFieldDeclarationToTFieldDefinition__tFieldDefinition____target,
				eFieldDeclarationToTFieldSignature__eFieldDeclaration____source,
				eFieldDeclarationToTFieldSignature__tFieldSignature____target,
				mDefinitionToTMember__eFieldDeclaration____source, mDefinitionToTMember__tFieldDefinition____target,
				mSignature__eFieldDeclaration____mFieldDefinitions, eFieldDeclaration__mSignature____mFieldSignature,
				eFieldDeclarationToTField__eFieldDeclaration____source, eFieldDeclarationToTField__tField____target,
				tFieldSignature__tFieldDefinition____definitions, tFieldDefinition__tFieldSignature____signature,
				varDeclFragment__eFieldDeclaration____variablesContainer,
				eFieldDeclaration__varDeclFragment____fragments,
				varDeclFragmentToTFieldDefinition__varDeclFragment____source,
				varDeclFragmentToTFieldDefinition__tFieldDefinition____target,
				mDefinitionToTSignature__eFieldDeclaration____source,
				mDefinitionToTSignature__tFieldSignature____target, mBodyToTAnnotation__eFieldDeclaration____source,
				mBodyToTAnnotation__tFieldDefinition____target };
	}

	public static final void pattern_FieldDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			FieldDefinition _this, PerformRuleResult ruleresult, EObject eFieldDeclarationToTFieldDefinition,
			EObject eFieldDeclarationToTFieldSignature, EObject mDefinitionToTMember, EObject mSignature,
			EObject eFieldDeclaration, EObject tField, EObject eFieldDeclarationToTField,
			EObject mSignatureToTFieldSignature, EObject mName, EObject tFieldDefinition, EObject tFieldSignature,
			EObject mNameToTField, EObject varDeclFragment, EObject varDeclFragmentToTFieldDefinition,
			EObject mDefinitionToTSignature, EObject mBodyToTAnnotation) {
		_this.registerObjects_BWD(ruleresult, eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment,
				varDeclFragmentToTFieldDefinition, mDefinitionToTSignature, mBodyToTAnnotation);

	}

	public static final PerformRuleResult pattern_FieldDefinition_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_12_1_preparereturnvalue_binding = pattern_FieldDefinition_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDefinition_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_12_1_preparereturnvalue_black = pattern_FieldDefinition_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDefinition_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDefinition_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "FieldDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDefinition_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tField");
		EObject _localVariable_1 = match.getObject("tFieldDefinition");
		EObject _localVariable_2 = match.getObject("tFieldSignature");
		EObject tmpTField = _localVariable_0;
		EObject tmpTFieldDefinition = _localVariable_1;
		EObject tmpTFieldSignature = _localVariable_2;
		if (tmpTField instanceof TField) {
			TField tField = (TField) tmpTField;
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tmpTFieldSignature instanceof TFieldSignature) {
					TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
					return new Object[] { tField, tFieldDefinition, tFieldSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_12_2_corematch_blackFBFFBBFB(TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tFieldSignature, MSignatureToTSignature.class, "target")) {
			MSignature tmpMSignature = mSignatureToTFieldSignature.getSource();
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				for (MFieldNameToTField mNameToTField : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
					MFieldName mName = mNameToTField.getSource();
					if (mName != null) {
						_result.add(new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName,
								tFieldDefinition, tFieldSignature, mNameToTField, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_12_3_findcontext_blackBBBBBBB(
			MFieldSignature mSignature, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tField.equals(tFieldSignature.getField())) {
			if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
				if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
					if (mName.equals(mSignature.getMFieldName())) {
						if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
							if (mName.equals(mNameToTField.getSource())) {
								if (tField.equals(mNameToTField.getTarget())) {
									_result.add(new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName,
											tFieldDefinition, tFieldSignature, mNameToTField });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			MFieldSignature mSignature, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tFieldSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tFieldSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__mName____mFieldName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mFieldSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tFieldDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTField__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tFieldSignature__tField____field_name_prime = "field";
		String tField__tFieldSignature____signatures_name_prime = "signatures";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mSignature__mName____mFieldName_name_prime = "mFieldName";
		String mName__mSignature____mFieldSignatures_name_prime = "mFieldSignatures";
		String tFieldSignature__tFieldDefinition____definitions_name_prime = "definitions";
		String tFieldDefinition__tFieldSignature____signature_name_prime = "signature";
		String mNameToTField__mName____source_name_prime = "source";
		String mNameToTField__tField____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mNameToTField);
		tFieldSignature__tField____field.setSrc(tFieldSignature);
		tFieldSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tFieldSignature__tField____field);
		tField__tFieldSignature____signatures.setSrc(tField);
		tField__tFieldSignature____signatures.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tField__tFieldSignature____signatures);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		mSignature__mName____mFieldName.setSrc(mSignature);
		mSignature__mName____mFieldName.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mSignature__mName____mFieldName);
		mName__mSignature____mFieldSignatures.setSrc(mName);
		mName__mSignature____mFieldSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mFieldSignatures);
		tFieldSignature__tFieldDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tFieldDefinition____definitions.setTrg(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature__tFieldDefinition____definitions);
		tFieldDefinition__tFieldSignature____signature.setSrc(tFieldDefinition);
		tFieldDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tFieldDefinition__tFieldSignature____signature);
		mNameToTField__mName____source.setSrc(mNameToTField);
		mNameToTField__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTField__mName____source);
		mNameToTField__tField____target.setSrc(mNameToTField);
		mNameToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mNameToTField__tField____target);
		tFieldSignature__tField____field.setName(tFieldSignature__tField____field_name_prime);
		tField__tFieldSignature____signatures.setName(tField__tFieldSignature____signatures_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		mSignature__mName____mFieldName.setName(mSignature__mName____mFieldName_name_prime);
		mName__mSignature____mFieldSignatures.setName(mName__mSignature____mFieldSignatures_name_prime);
		tFieldSignature__tFieldDefinition____definitions
				.setName(tFieldSignature__tFieldDefinition____definitions_name_prime);
		tFieldDefinition__tFieldSignature____signature
				.setName(tFieldDefinition__tFieldSignature____signature_name_prime);
		mNameToTField__mName____source.setName(mNameToTField__mName____source_name_prime);
		mNameToTField__tField____target.setName(mNameToTField__tField____target_name_prime);
		return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature,
				mNameToTField, isApplicableMatch, tFieldSignature__tField____field,
				tField__tFieldSignature____signatures, mSignatureToTFieldSignature__mSignature____source,
				mSignatureToTFieldSignature__tFieldSignature____target, mSignature__mName____mFieldName,
				mName__mSignature____mFieldSignatures, tFieldSignature__tFieldDefinition____definitions,
				tFieldDefinition__tFieldSignature____signature, mNameToTField__mName____source,
				mNameToTField__tField____target };
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_bindingFBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSignature, tField,
				mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature, mName,
					tFieldDefinition, tFieldSignature, mNameToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField) {
		Object[] result_pattern_FieldDefinition_12_4_solveCSP_binding = pattern_FieldDefinition_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature, mName, tFieldDefinition,
				tFieldSignature, mNameToTField);
		if (result_pattern_FieldDefinition_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_12_4_solveCSP_black = pattern_FieldDefinition_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature,
						mName, tFieldDefinition, tFieldSignature, mNameToTField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_12_5_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_20_1_preparereturnvalue_binding = pattern_FieldDefinition_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDefinition_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_20_1_preparereturnvalue_black = pattern_FieldDefinition_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDefinition_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDefinition_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDefinition_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_0BB(
			MFieldDefinition eFieldDeclaration, MFieldSignature mSignature) {
		MFieldSignature __DEC_eFieldDeclaration_mFieldDefinitions_707432 = eFieldDeclaration.getMFieldSignature();
		if (__DEC_eFieldDeclaration_mFieldDefinitions_707432 != null) {
			if (!mSignature.equals(__DEC_eFieldDeclaration_mFieldDefinitions_707432)) {
				return new Object[] { eFieldDeclaration, mSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_mFieldDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mFieldDefinitions.getSrc();
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			EObject tmpEFieldDeclaration = _edge_mFieldDefinitions.getTrg();
			if (tmpEFieldDeclaration instanceof MFieldDefinition) {
				MFieldDefinition eFieldDeclaration = (MFieldDefinition) tmpEFieldDeclaration;
				if (mSignature.getMFieldDefinitions().contains(eFieldDeclaration)) {
					MFieldName mName = mSignature.getMFieldName();
					if (mName != null) {
						if (pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_0BB(eFieldDeclaration,
								mSignature) == null) {
							for (VariableDeclarationFragment varDeclFragment : eFieldDeclaration.getFragments()) {
								_result.add(new Object[] { mSignature, eFieldDeclaration, mName, varDeclFragment,
										_edge_mFieldDefinitions });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			FieldDefinition _this, Match match, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration,
			MFieldName mName, VariableDeclarationFragment varDeclFragment) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, eFieldDeclaration, mName,
				varDeclFragment);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDefinition_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDefinition _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_21_1_preparereturnvalue_binding = pattern_FieldDefinition_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDefinition_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_21_1_preparereturnvalue_black = pattern_FieldDefinition_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDefinition_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDefinition_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDefinition_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldSignature = _edge_definitions.getSrc();
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			EObject tmpTFieldDefinition = _edge_definitions.getTrg();
			if (tmpTFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
				if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
					TField tField = tFieldSignature.getField();
					if (tField != null) {
						_result.add(new Object[] { tField, tFieldDefinition, tFieldSignature, _edge_definitions });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldDefinition _this, Match match, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tField, tFieldDefinition, tFieldSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDefinition_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_24_1_prepare_blackB(FieldDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDefinition_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDefinition_24_2_matchcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = sourceMatch.getObject("eFieldDeclaration");
		EObject _localVariable_2 = targetMatch.getObject("tField");
		EObject _localVariable_3 = sourceMatch.getObject("mName");
		EObject _localVariable_4 = targetMatch.getObject("tFieldDefinition");
		EObject _localVariable_5 = targetMatch.getObject("tFieldSignature");
		EObject _localVariable_6 = sourceMatch.getObject("varDeclFragment");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpEFieldDeclaration = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpTFieldDefinition = _localVariable_4;
		EObject tmpTFieldSignature = _localVariable_5;
		EObject tmpVarDeclFragment = _localVariable_6;
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			if (tmpEFieldDeclaration instanceof MFieldDefinition) {
				MFieldDefinition eFieldDeclaration = (MFieldDefinition) tmpEFieldDeclaration;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpMName instanceof MFieldName) {
						MFieldName mName = (MFieldName) tmpMName;
						if (tmpTFieldDefinition instanceof TFieldDefinition) {
							TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
							if (tmpTFieldSignature instanceof TFieldSignature) {
								TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
								if (tmpVarDeclFragment instanceof VariableDeclarationFragment) {
									VariableDeclarationFragment varDeclFragment = (VariableDeclarationFragment) tmpVarDeclFragment;
									return new Object[] { mSignature, eFieldDeclaration, tField, mName,
											tFieldDefinition, tFieldSignature, varDeclFragment, sourceMatch,
											targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_24_2_matchcontext_blackBBBFBBBFBBB(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField, MFieldName mName,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			VariableDeclarationFragment varDeclFragment, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mSignature.getMFieldDefinitions().contains(eFieldDeclaration)) {
				if (tField.equals(tFieldSignature.getField())) {
					if (mName.equals(mSignature.getMFieldName())) {
						if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
							if (eFieldDeclaration.equals(varDeclFragment.getVariablesContainer())) {
								for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class,
												"source")) {
									if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
										for (MFieldNameToTField mNameToTField : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mName, MFieldNameToTField.class, "source")) {
											if (tField.equals(mNameToTField.getTarget())) {
												_result.add(new Object[] { mSignature, eFieldDeclaration, tField,
														mSignatureToTFieldSignature, mName, tFieldDefinition,
														tFieldSignature, mNameToTField, varDeclFragment, sourceMatch,
														targetMatch });
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_24_2_matchcontext_greenBBBBBBBBBBFB(MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(eFieldDeclaration);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(varDeclFragment);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(tFieldDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mNameToTField);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
				tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_3_checkcsp_bindingFBBBBBBBBBBBBB(FieldDefinition _this,
			CCMatch isApplicableMatch, MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField,
			VariableDeclarationFragment varDeclFragment, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mSignature, eFieldDeclaration, tField,
				mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, eFieldDeclaration, tField,
					mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField,
					varDeclFragment, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBB(
			FieldDefinition _this, CCMatch isApplicableMatch, MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, TField tField, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldName mName, TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, VariableDeclarationFragment varDeclFragment, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FieldDefinition_24_3_checkcsp_binding = pattern_FieldDefinition_24_3_checkcsp_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, eFieldDeclaration, tField, mSignatureToTFieldSignature, mName,
				tFieldDefinition, tFieldSignature, mNameToTField, varDeclFragment, sourceMatch, targetMatch);
		if (result_pattern_FieldDefinition_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_24_3_checkcsp_binding[0];

			Object[] result_pattern_FieldDefinition_24_3_checkcsp_black = pattern_FieldDefinition_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_FieldDefinition_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, eFieldDeclaration, tField,
						mSignatureToTFieldSignature, mName, tFieldDefinition, tFieldSignature, mNameToTField,
						varDeclFragment, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_4_createcorrespondence_blackBBBBBBBB(
			MFieldSignature mSignature, MFieldDefinition eFieldDeclaration, TField tField, MFieldName mName,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature,
			VariableDeclarationFragment varDeclFragment, CCMatch isApplicableMatch) {
		return new Object[] { mSignature, eFieldDeclaration, tField, mName, tFieldDefinition, tFieldSignature,
				varDeclFragment, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_4_createcorrespondence_greenFFFBBFBBBFFFB(
			MFieldDefinition eFieldDeclaration, TField tField, TFieldDefinition tFieldDefinition,
			TFieldSignature tFieldSignature, VariableDeclarationFragment varDeclFragment, CCMatch isApplicableMatch) {
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createMFieldDefinitionToTFieldDefinition();
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = ModiscoFactory.eINSTANCE
				.createFieldDeclarationToTFieldSignature();
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		FieldDeclarationToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createFieldDeclarationToTField();
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		eFieldDeclarationToTFieldDefinition.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldDefinition.setTarget(tFieldDefinition);
		isApplicableMatch.getCreateCorr().add(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldSignature.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldSignature.setTarget(tFieldSignature);
		isApplicableMatch.getCreateCorr().add(eFieldDeclarationToTFieldSignature);
		mDefinitionToTMember.setSource(eFieldDeclaration);
		mDefinitionToTMember.setTarget(tFieldDefinition);
		isApplicableMatch.getCreateCorr().add(mDefinitionToTMember);
		eFieldDeclarationToTField.setSource(eFieldDeclaration);
		eFieldDeclarationToTField.setTarget(tField);
		isApplicableMatch.getCreateCorr().add(eFieldDeclarationToTField);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setTarget(tFieldDefinition);
		isApplicableMatch.getCreateCorr().add(varDeclFragmentToTFieldDefinition);
		mDefinitionToTSignature.setSource(eFieldDeclaration);
		mDefinitionToTSignature.setTarget(tFieldSignature);
		isApplicableMatch.getCreateCorr().add(mDefinitionToTSignature);
		mBodyToTAnnotation.setSource(eFieldDeclaration);
		mBodyToTAnnotation.setTarget(tFieldDefinition);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, eFieldDeclaration, tField, eFieldDeclarationToTField, tFieldDefinition,
				tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition, mDefinitionToTSignature,
				mBodyToTAnnotation, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_27_1_matchtggpattern_black_nac_0BB(
			MFieldDefinition eFieldDeclaration, MFieldSignature mSignature) {
		MFieldSignature __DEC_eFieldDeclaration_mFieldDefinitions_327138 = eFieldDeclaration.getMFieldSignature();
		if (__DEC_eFieldDeclaration_mFieldDefinitions_327138 != null) {
			if (!mSignature.equals(__DEC_eFieldDeclaration_mFieldDefinitions_327138)) {
				return new Object[] { eFieldDeclaration, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_27_1_matchtggpattern_blackBBBB(MFieldSignature mSignature,
			MFieldDefinition eFieldDeclaration, MFieldName mName, VariableDeclarationFragment varDeclFragment) {
		if (mSignature.getMFieldDefinitions().contains(eFieldDeclaration)) {
			if (mName.equals(mSignature.getMFieldName())) {
				if (eFieldDeclaration.equals(varDeclFragment.getVariablesContainer())) {
					if (pattern_FieldDefinition_27_1_matchtggpattern_black_nac_0BB(eFieldDeclaration,
							mSignature) == null) {
						return new Object[] { mSignature, eFieldDeclaration, mName, varDeclFragment };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_28_1_matchtggpattern_blackBBB(TField tField,
			TFieldDefinition tFieldDefinition, TFieldSignature tFieldSignature) {
		if (tField.equals(tFieldSignature.getField())) {
			if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
				return new Object[] { tField, tFieldDefinition, tFieldSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_29_1_createresult_blackB(FieldDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDefinition_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MFieldSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MFieldName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MFieldNameToTField mNameToTField) {
		if (ruleResult.getCorrObjects().contains(mNameToTField)) {
			return new Object[] { ruleResult, mNameToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TField tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TFieldSignature tFieldSignature) {
		if (ruleResult.getTargetObjects().contains(tFieldSignature)) {
			return new Object[] { ruleResult, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTFieldSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTFieldSignature)) {
			return new Object[] { ruleResult, mSignatureToTFieldSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mNameToTFieldList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMNameToTField : mNameToTFieldList.getEntryObjects()) {
				if (tmpMNameToTField instanceof MFieldNameToTField) {
					MFieldNameToTField mNameToTField = (MFieldNameToTField) tmpMNameToTField;
					MFieldName mName = mNameToTField.getSource();
					if (mName != null) {
						TField tField = mNameToTField.getTarget();
						if (tField != null) {
							if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									mNameToTField) == null) {
								if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mName) == null) {
									if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											tField) == null) {
										for (MFieldSignature mSignature : mName.getMFieldSignatures()) {
											if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_0BB(ruleResult,
													mSignature) == null) {
												for (TFieldSignature tFieldSignature : tField.getSignatures()) {
													if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tFieldSignature) == null) {
														for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(mSignature,
																		MSignatureToTSignature.class, "source")) {
															if (tFieldSignature
																	.equals(mSignatureToTFieldSignature.getTarget())) {
																if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult,
																		mSignatureToTFieldSignature) == null) {
																	_result.add(new Object[] { mNameToTFieldList,
																			mSignature, mName, mNameToTField, tField,
																			tFieldSignature,
																			mSignatureToTFieldSignature,
																			ruleEntryContainer, ruleResult });
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_bindingFBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignature, tField,
				mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature, mName,
					tFieldSignature, mNameToTField, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MFieldSignature mSignature, TField tField,
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName, TFieldSignature tFieldSignature,
			MFieldNameToTField mNameToTField, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDefinition_29_3_solveCSP_binding = pattern_FieldDefinition_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature,
				mNameToTField, ruleResult);
		if (result_pattern_FieldDefinition_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_29_3_solveCSP_black = pattern_FieldDefinition_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tField, mSignatureToTFieldSignature,
						mName, tFieldSignature, mNameToTField, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_29_4_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_29_5_checknacs_blackBBBBBB(MFieldSignature mSignature,
			TField tField, MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField) {
		return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField };
	}

	public static final Object[] pattern_FieldDefinition_29_6_perform_blackBBBBBBB(MFieldSignature mSignature,
			TField tField, MSignatureToTSignature mSignatureToTFieldSignature, MFieldName mName,
			TFieldSignature tFieldSignature, MFieldNameToTField mNameToTField, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignature, tField, mSignatureToTFieldSignature, mName, tFieldSignature, mNameToTField,
				ruleResult };
	}

	public static final Object[] pattern_FieldDefinition_29_6_perform_greenFFFBFBFFBFFFFBB(MFieldSignature mSignature,
			TField tField, TFieldSignature tFieldSignature, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MFieldDefinitionToTFieldDefinition eFieldDeclarationToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createMFieldDefinitionToTFieldDefinition();
		FieldDeclarationToTFieldSignature eFieldDeclarationToTFieldSignature = ModiscoFactory.eINSTANCE
				.createFieldDeclarationToTFieldSignature();
		MDefinitionToTMember mDefinitionToTMember = ModiscoFactory.eINSTANCE.createMDefinitionToTMember();
		MFieldDefinition eFieldDeclaration = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMFieldDefinition();
		FieldDeclarationToTField eFieldDeclarationToTField = ModiscoFactory.eINSTANCE.createFieldDeclarationToTField();
		TFieldDefinition tFieldDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		VariableDeclarationFragment varDeclFragment = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = ModiscoFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		MDefinitionToTSignature mDefinitionToTSignature = ModiscoFactory.eINSTANCE.createMDefinitionToTSignature();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tFieldDefinition", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldSignature.setTarget(tFieldSignature);
		ruleResult.getCorrObjects().add(eFieldDeclarationToTFieldSignature);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		eFieldDeclarationToTFieldDefinition.setSource(eFieldDeclaration);
		eFieldDeclarationToTFieldSignature.setSource(eFieldDeclaration);
		mDefinitionToTMember.setSource(eFieldDeclaration);
		mSignature.getMFieldDefinitions().add(eFieldDeclaration);
		ruleResult.getSourceObjects().add(eFieldDeclaration);
		eFieldDeclarationToTField.setSource(eFieldDeclaration);
		eFieldDeclarationToTField.setTarget(tField);
		ruleResult.getCorrObjects().add(eFieldDeclarationToTField);
		eFieldDeclarationToTFieldDefinition.setTarget(tFieldDefinition);
		mDefinitionToTMember.setTarget(tFieldDefinition);
		tFieldSignature.getDefinitions().add(tFieldDefinition);
		ruleResult.getTargetObjects().add(tFieldDefinition);
		varDeclFragment.setVariablesContainer(eFieldDeclaration);
		ruleResult.getSourceObjects().add(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setTarget(tFieldDefinition);
		ruleResult.getCorrObjects().add(varDeclFragmentToTFieldDefinition);
		mDefinitionToTSignature.setSource(eFieldDeclaration);
		mDefinitionToTSignature.setTarget(tFieldSignature);
		ruleResult.getCorrObjects().add(mDefinitionToTSignature);
		mBodyToTAnnotation.setSource(eFieldDeclaration);
		mBodyToTAnnotation.setTarget(tFieldDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		int tFieldDefinition_ID_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tFieldDefinition.setID(Integer.valueOf(tFieldDefinition_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eFieldDeclarationToTFieldDefinition, eFieldDeclarationToTFieldSignature,
				mDefinitionToTMember, mSignature, eFieldDeclaration, tField, eFieldDeclarationToTField,
				tFieldDefinition, tFieldSignature, varDeclFragment, varDeclFragmentToTFieldDefinition,
				mDefinitionToTSignature, mBodyToTAnnotation, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDefinition_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDefinitionImpl
