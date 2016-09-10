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

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.MSignatureToTSignature;

import org.gravity.tgg.modisco.Rules.LinkSignatureToType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Link Signature To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkSignatureToTypeImpl extends AbstractRuleImpl implements LinkSignatureToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkSignatureToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkSignatureToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		// initial bindings
		Object[] result1_black = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_1_initialbindings_blackBBBBB(
				this, match, mSignature, mDefinition, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mSignature, mDefinition,
						mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_0_4_collectelementstobetranslated_blackBBBB(match, mSignature,
							mDefinition, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
			}
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_4_collectelementstobetranslated_greenBBBF(match,
					mSignature, mDefinition);
			// EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_0_5_collectcontextelements_blackBBBB(match, mSignature, mDefinition,
							mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
			}
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_5_collectcontextelements_greenBBBBFF(match,
					mSignature, mDefinition, mType);
			// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[4];
			// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result5_green[5];

			// register objects to match
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mSignature, mDefinition, mType);
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_7_expressionF();
		} else {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TSignature tSignature = (TSignature) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[2];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_1_1_performtransformation_greenBB(tSignature, tType);

		// collect translated elements
		Object[] result2_green = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tSignature, tType,
						mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
					+ tType + ", " + "[mSignature] = " + mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ".");
		}
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, tSignature,
				tType, mSignature, mDefinition);
		// EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSignature mSignature = (MSignature) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[2];
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_2_2_corematch_blackFFBBFBFB(mSignature, mDefinition, mType, match)) {
			TSignature tSignature = (TSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_2_3_findcontext_blackBBBBBBB(tSignature, tType, mSignature,
							mDefinition, mSignatureToTSignature, mType, mTypeToTType)) {
				Object[] result3_green = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_2_3_findcontext_greenBBBBBBBFFFFFFFF(tSignature, tType, mSignature,
								mDefinition, mSignatureToTSignature, mType, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
								mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mSignature] = "
							+ mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LinkSignatureToTypeImpl.pattern_LinkSignatureToType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LinkSignatureToTypeImpl
							.pattern_LinkSignatureToType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LinkSignatureToTypeImpl.pattern_LinkSignatureToType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature,
			EObject mDefinition, EObject mSignatureToTSignature, EObject mType, EObject mTypeToTType) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TSignature tSignature, TAbstractType tType) {
		// initial bindings
		Object[] result1_black = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_10_1_initialbindings_blackBBBB(this, match, tSignature, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tType] = " + tType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tSignature, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
					+ tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_10_4_collectelementstobetranslated_blackBBB(match, tSignature, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
						+ "[tType] = " + tType + ".");
			}
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_4_collectelementstobetranslated_greenBBBF(match,
					tSignature, tType);
			// EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_10_5_collectcontextelements_blackBBB(match, tSignature, tType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ".");
			}
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_5_collectcontextelements_greenBBB(match, tSignature,
					tType);

			// register objects to match
			LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tSignature, tType);
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_7_expressionF();
		} else {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TSignature tSignature = (TSignature) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[2];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_11_1_performtransformation_greenBB(mSignature, mDefinition);

		// collect translated elements
		Object[] result2_green = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tSignature, tType,
						mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
					+ tType + ", " + "[mSignature] = " + mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ".");
		}
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				tSignature, tType, mSignature, mDefinition);
		// EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[5];
		// EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		LinkSignatureToTypeImpl.pattern_LinkSignatureToType_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TSignature tSignature = (TSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_12_2_corematch_blackBBFFFFB(tSignature, tType, match)) {
			MSignature mSignature = (MSignature) result2_black[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_12_3_findcontext_blackBBBFBBB(tSignature, tType, mSignature,
							mSignatureToTSignature, mType, mTypeToTType)) {
				MDefinition mDefinition = (MDefinition) result3_black[3];
				Object[] result3_green = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_12_3_findcontext_greenBBBBBBBFFFFFFFF(tSignature, tType,
								mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
								mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mSignature] = "
							+ mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LinkSignatureToTypeImpl.pattern_LinkSignatureToType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LinkSignatureToTypeImpl
							.pattern_LinkSignatureToType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LinkSignatureToTypeImpl.pattern_LinkSignatureToType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TSignature tSignature, TAbstractType tType) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TSignature tSignature, TAbstractType tType) {// Create CSP
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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature,
			EObject mDefinition, EObject mSignatureToTSignature, EObject mType, EObject mTypeToTType) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_44(EMoflonEdge _edge_mDefinitions) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_20_2_testcorematchandDECs_blackFFFB(_edge_mDefinitions)) {
			MSignature mSignature = (MSignature) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			Object[] result2_green = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mSignature, mDefinition, mType)) {
				// Ensure that the correct types of elements are matched
				if (LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = LinkSignatureToTypeImpl
							.pattern_LinkSignatureToType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LinkSignatureToTypeImpl.pattern_LinkSignatureToType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_41(EMoflonEdge _edge_signature) {
		// prepare return value
		Object[] result1_bindingAndBlack = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_21_2_testcorematchandDECs_blackFFB(_edge_signature)) {
			TSignature tSignature = (TSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			Object[] result2_green = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tSignature, tType)) {
				// Ensure that the correct types of elements are matched
				if (LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = LinkSignatureToTypeImpl
							.pattern_LinkSignatureToType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					LinkSignatureToTypeImpl.pattern_LinkSignatureToType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkSignatureToType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkSignatureToType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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
		Object[] result1_black = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TSignature tSignature = (TSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		MSignature mSignature = (MSignature) result2_binding[2];
		MDefinition mDefinition = (MDefinition) result2_binding[3];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[4];
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_24_2_matchcontext_blackBBBBFBFBB(tSignature, tType, mSignature,
						mDefinition, mType, sourceMatch, targetMatch)) {
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			Object[] result2_green = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_24_2_matchcontext_greenBBBBBBBBFB(tSignature, tType, mSignature,
							mDefinition, mSignatureToTSignature, mType, mTypeToTType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[8];

			// check csp
			Object[] result3_bindingAndBlack = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
							tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_24_4_createcorrespondence_blackBBBBBB(tSignature, tType,
								mSignature, mDefinition, mType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mType] = " + mType + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}

				// add to returned result
				Object[] result5_black = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				LinkSignatureToTypeImpl.pattern_LinkSignatureToType_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public boolean checkDEC_FWD(MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {// match tgg pattern
		Object[] result1_black = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_27_1_matchtggpattern_blackBBB(mSignature, mDefinition, mType);
		if (result1_black != null) {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_27_2_expressionF();
		} else {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TSignature tSignature, TAbstractType tType) {// match tgg pattern
		Object[] result1_black = LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_28_1_matchtggpattern_blackBB(tSignature, tType);
		if (result1_black != null) {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_28_2_expressionF();
		} else {
			return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTSignatureParameter, TypeToTAbstractType mTypeToTTypeParameter) {
		// create result
		Object[] result1_black = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkSignatureToTypeImpl.pattern_LinkSignatureToType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LinkSignatureToTypeImpl
				.pattern_LinkSignatureToType_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[0];
			TSignature tSignature = (TSignature) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[2];
			MSignature mSignature = (MSignature) result2_black[3];
			// RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[7];
			MDefinition mDefinition = (MDefinition) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = LinkSignatureToTypeImpl
					.pattern_LinkSignatureToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSignature] = "
						+ tSignature + ", " + "[tType] = " + tType + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignatureToTSignature] = "
						+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LinkSignatureToTypeImpl.pattern_LinkSignatureToType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = LinkSignatureToTypeImpl
						.pattern_LinkSignatureToType_29_5_checknacs_blackBBBBBBB(tSignature, tType, mSignature,
								mDefinition, mSignatureToTSignature, mType, mTypeToTType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LinkSignatureToTypeImpl
							.pattern_LinkSignatureToType_29_6_perform_blackBBBBBBBB(tSignature, tType, mSignature,
									mDefinition, mSignatureToTSignature, mType, mTypeToTType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
								+ "[mSignature] = " + mSignature + ", " + "[mDefinition] = " + mDefinition + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
								+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					LinkSignatureToTypeImpl.pattern_LinkSignatureToType_29_6_perform_greenBBBBB(tSignature, tType,
							mSignature, mDefinition, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkSignatureToTypeImpl.pattern_LinkSignatureToType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_MSIGNATURE_MDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSIGNATURE_MDEFINITION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
			return null;
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSIGNATURE_MDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TSIGNATURE_TABSTRACTTYPE_MSIGNATURE_MDEFINITION_MSIGNATURETOTSIGNATURE_ABSTRACTTYPEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (MSignature) arguments.get(3), (MDefinition) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TSIGNATURE_TABSTRACTTYPE_MSIGNATURE_MDEFINITION_MSIGNATURETOTSIGNATURE_ABSTRACTTYPEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (MSignature) arguments.get(3), (MDefinition) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_TSIGNATURE_TABSTRACTTYPE_MSIGNATURE_MDEFINITION_MSIGNATURETOTSIGNATURE_ABSTRACTTYPEDECLARATION_TYPETOTABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (MSignature) arguments.get(3), (MDefinition) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_DEC_FWD__MSIGNATURE_MDEFINITION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MSignature) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___CHECK_DEC_BWD__TSIGNATURE_TABSTRACTTYPE:
			return checkDEC_BWD((TSignature) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TSIGNATURE_TABSTRACTTYPE_MSIGNATURE_MDEFINITION_MSIGNATURETOTSIGNATURE_ABSTRACTTYPEDECLARATION_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (MSignature) arguments.get(3), (MDefinition) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.LINK_SIGNATURE_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkSignatureToType_0_1_initialbindings_blackBBBBB(LinkSignatureToType _this,
			Match match, MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mSignature, mDefinition, mType };
	}

	public static final Object[] pattern_LinkSignatureToType_0_2_SolveCSP_bindingFBBBBB(LinkSignatureToType _this,
			Match match, MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mDefinition, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mDefinition, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkSignatureToType _this, Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		Object[] result_pattern_LinkSignatureToType_0_2_SolveCSP_binding = pattern_LinkSignatureToType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mSignature, mDefinition, mType);
		if (result_pattern_LinkSignatureToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkSignatureToType_0_2_SolveCSP_black = pattern_LinkSignatureToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_0_3_CheckCSP_expressionFBB(LinkSignatureToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { match, mSignature, mDefinition, mType };
	}

	public static final Object[] pattern_LinkSignatureToType_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MSignature mSignature, MDefinition mDefinition) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		return new Object[] { match, mSignature, mDefinition, mSignature__mDefinition____mDefinitions };
	}

	public static final Object[] pattern_LinkSignatureToType_0_5_collectcontextelements_blackBBBB(Match match,
			MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		return new Object[] { match, mSignature, mDefinition, mType };
	}

	public static final Object[] pattern_LinkSignatureToType_0_5_collectcontextelements_greenBBBBFF(Match match,
			MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mType);
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		match.getContextEdges().add(mDefinition__mType____abstractTypeDeclaration);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mSignature, mDefinition, mType, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration };
	}

	public static final void pattern_LinkSignatureToType_0_6_registerobjectstomatch_expressionBBBBB(
			LinkSignatureToType _this, Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mDefinition, mType);

	}

	public static final boolean pattern_LinkSignatureToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpMType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { tSignature, tType, mSignature, mDefinition,
											mSignatureToTSignature, mType, mTypeToTType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_1_1_performtransformation_blackBBBBBBBFBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, LinkSignatureToType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			LinkSignatureToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkSignatureToType_1_1_performtransformation_binding = pattern_LinkSignatureToType_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkSignatureToType_1_1_performtransformation_binding != null) {
			TSignature tSignature = (TSignature) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[1];
			MSignature mSignature = (MSignature) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[2];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkSignatureToType_1_1_performtransformation_binding[6];

			Object[] result_pattern_LinkSignatureToType_1_1_performtransformation_black = pattern_LinkSignatureToType_1_1_performtransformation_blackBBBBBBBFBB(
					tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_LinkSignatureToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkSignatureToType_1_1_performtransformation_black[7];

				return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_1_1_performtransformation_greenBB(TSignature tSignature,
			TAbstractType tType) {
		tType.getSignature().add(tSignature);
		return new Object[] { tSignature, tType };
	}

	public static final Object[] pattern_LinkSignatureToType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkSignatureToType_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature, EObject mDefinition,
			EObject mSignatureToTSignature, EObject mType, EObject mTypeToTType) {
		if (!tSignature.equals(tType)) {
			if (!mSignature.equals(tSignature)) {
				if (!mSignature.equals(tType)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(mTypeToTType)) {
								if (!mDefinition.equals(tSignature)) {
									if (!mDefinition.equals(tType)) {
										if (!mDefinition.equals(mSignature)) {
											if (!mDefinition.equals(mSignatureToTSignature)) {
												if (!mDefinition.equals(mType)) {
													if (!mDefinition.equals(mTypeToTType)) {
														if (!mSignatureToTSignature.equals(tSignature)) {
															if (!mSignatureToTSignature.equals(tType)) {
																if (!mSignatureToTSignature.equals(mType)) {
																	if (!mSignatureToTSignature.equals(mTypeToTType)) {
																		if (!mType.equals(tSignature)) {
																			if (!mType.equals(tType)) {
																				if (!mType.equals(mTypeToTType)) {
																					if (!mTypeToTType
																							.equals(tSignature)) {
																						if (!mTypeToTType
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult,
																									tSignature, tType,
																									mSignature,
																									mDefinition,
																									mSignatureToTSignature,
																									mType,
																									mTypeToTType };
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

	public static final Object[] pattern_LinkSignatureToType_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature, EObject mDefinition) {
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkSignatureToType";
		String tType__tSignature____signature_name_prime = "signature";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tType__tSignature____signature);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mSignature, mDefinition, tType__tSignature____signature,
				mSignature__mDefinition____mDefinitions };
	}

	public static final void pattern_LinkSignatureToType_1_5_registerobjects_expressionBBBBBBBBB(
			LinkSignatureToType _this, PerformRuleResult ruleresult, EObject tSignature, EObject tType,
			EObject mSignature, EObject mDefinition, EObject mSignatureToTSignature, EObject mType,
			EObject mTypeToTType) {
		_this.registerObjects_FWD(ruleresult, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType);

	}

	public static final PerformRuleResult pattern_LinkSignatureToType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_2_1_preparereturnvalue_bindingFB(
			LinkSignatureToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkSignatureToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkSignatureToType _this) {
		Object[] result_pattern_LinkSignatureToType_2_1_preparereturnvalue_binding = pattern_LinkSignatureToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkSignatureToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkSignatureToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkSignatureToType_2_1_preparereturnvalue_black = pattern_LinkSignatureToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkSignatureToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkSignatureToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LinkSignatureToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkSignatureToType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					return new Object[] { mSignature, mDefinition, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_2_2_corematch_blackFFBBFBFB(
			MSignature mSignature, MDefinition mDefinition, AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tSignature = mSignatureToTSignature.getTarget();
			if (tSignature != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						_result.add(new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature,
								mType, mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_2_3_findcontext_blackBBBBBBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (mSignature.equals(mSignatureToTSignature.getSource())) {
				if (tSignature.equals(mSignatureToTSignature.getTarget())) {
					if (mType.getBodyDeclarations().contains(mDefinition)) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (tType.equals(mTypeToTType.getTarget())) {
								_result.add(new Object[] { tSignature, tType, mSignature, mDefinition,
										mSignatureToTSignature, mType, mTypeToTType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_2_3_findcontext_greenBBBBBBBFFFFFFFF(TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____abstractTypeDeclaration);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
				isApplicableMatch, mSignature__mDefinition____mDefinitions,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				mTypeToTType__mType____source, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_LinkSignatureToType_2_4_solveCSP_bindingFBBBBBBBBB(LinkSignatureToType _this,
			IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType, MSignature mSignature,
			MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tSignature, tType, mSignature,
				mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
					mSignatureToTSignature, mType, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			LinkSignatureToType _this, IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_LinkSignatureToType_2_4_solveCSP_binding = pattern_LinkSignatureToType_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType);
		if (result_pattern_LinkSignatureToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkSignatureToType_2_4_solveCSP_black = pattern_LinkSignatureToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
						mSignatureToTSignature, mType, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_2_5_checkCSP_expressionFBB(LinkSignatureToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkSignatureToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkSignatureToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkSignatureToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_10_1_initialbindings_blackBBBB(LinkSignatureToType _this,
			Match match, TSignature tSignature, TAbstractType tType) {
		return new Object[] { _this, match, tSignature, tType };
	}

	public static final Object[] pattern_LinkSignatureToType_10_2_SolveCSP_bindingFBBBB(LinkSignatureToType _this,
			Match match, TSignature tSignature, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_10_2_SolveCSP_bindingAndBlackFBBBB(
			LinkSignatureToType _this, Match match, TSignature tSignature, TAbstractType tType) {
		Object[] result_pattern_LinkSignatureToType_10_2_SolveCSP_binding = pattern_LinkSignatureToType_10_2_SolveCSP_bindingFBBBB(
				_this, match, tSignature, tType);
		if (result_pattern_LinkSignatureToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkSignatureToType_10_2_SolveCSP_black = pattern_LinkSignatureToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_10_3_CheckCSP_expressionFBB(LinkSignatureToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_10_4_collectelementstobetranslated_blackBBB(Match match,
			TSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tSignature, tType };
	}

	public static final Object[] pattern_LinkSignatureToType_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TSignature tSignature, TAbstractType tType) {
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tSignature____signature_name_prime = "signature";
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tType__tSignature____signature);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { match, tSignature, tType, tType__tSignature____signature };
	}

	public static final Object[] pattern_LinkSignatureToType_10_5_collectcontextelements_blackBBB(Match match,
			TSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tSignature, tType };
	}

	public static final Object[] pattern_LinkSignatureToType_10_5_collectcontextelements_greenBBB(Match match,
			TSignature tSignature, TAbstractType tType) {
		match.getContextNodes().add(tSignature);
		match.getContextNodes().add(tType);
		return new Object[] { match, tSignature, tType };
	}

	public static final void pattern_LinkSignatureToType_10_6_registerobjectstomatch_expressionBBBB(
			LinkSignatureToType _this, Match match, TSignature tSignature, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType);

	}

	public static final boolean pattern_LinkSignatureToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpMType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { tSignature, tType, mSignature, mDefinition,
											mSignatureToTSignature, mType, mTypeToTType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_11_1_performtransformation_blackBBBBBBBFBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, LinkSignatureToType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			LinkSignatureToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkSignatureToType_11_1_performtransformation_binding = pattern_LinkSignatureToType_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkSignatureToType_11_1_performtransformation_binding != null) {
			TSignature tSignature = (TSignature) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[1];
			MSignature mSignature = (MSignature) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[2];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkSignatureToType_11_1_performtransformation_binding[6];

			Object[] result_pattern_LinkSignatureToType_11_1_performtransformation_black = pattern_LinkSignatureToType_11_1_performtransformation_blackBBBBBBBFBB(
					tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_LinkSignatureToType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkSignatureToType_11_1_performtransformation_black[7];

				return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
						mTypeToTType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_11_1_performtransformation_greenBB(MSignature mSignature,
			MDefinition mDefinition) {
		mSignature.getMDefinitions().add(mDefinition);
		return new Object[] { mSignature, mDefinition };
	}

	public static final Object[] pattern_LinkSignatureToType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkSignatureToType_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature, EObject mDefinition,
			EObject mSignatureToTSignature, EObject mType, EObject mTypeToTType) {
		if (!tSignature.equals(tType)) {
			if (!mSignature.equals(tSignature)) {
				if (!mSignature.equals(tType)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(mTypeToTType)) {
								if (!mDefinition.equals(tSignature)) {
									if (!mDefinition.equals(tType)) {
										if (!mDefinition.equals(mSignature)) {
											if (!mDefinition.equals(mSignatureToTSignature)) {
												if (!mDefinition.equals(mType)) {
													if (!mDefinition.equals(mTypeToTType)) {
														if (!mSignatureToTSignature.equals(tSignature)) {
															if (!mSignatureToTSignature.equals(tType)) {
																if (!mSignatureToTSignature.equals(mType)) {
																	if (!mSignatureToTSignature.equals(mTypeToTType)) {
																		if (!mType.equals(tSignature)) {
																			if (!mType.equals(tType)) {
																				if (!mType.equals(mTypeToTType)) {
																					if (!mTypeToTType
																							.equals(tSignature)) {
																						if (!mTypeToTType
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult,
																									tSignature, tType,
																									mSignature,
																									mDefinition,
																									mSignatureToTSignature,
																									mType,
																									mTypeToTType };
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

	public static final Object[] pattern_LinkSignatureToType_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mSignature, EObject mDefinition) {
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkSignatureToType";
		String tType__tSignature____signature_name_prime = "signature";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tType__tSignature____signature);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mSignature__mDefinition____mDefinitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mSignature, mDefinition, tType__tSignature____signature,
				mSignature__mDefinition____mDefinitions };
	}

	public static final void pattern_LinkSignatureToType_11_5_registerobjects_expressionBBBBBBBBB(
			LinkSignatureToType _this, PerformRuleResult ruleresult, EObject tSignature, EObject tType,
			EObject mSignature, EObject mDefinition, EObject mSignatureToTSignature, EObject mType,
			EObject mTypeToTType) {
		_this.registerObjects_BWD(ruleresult, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType);

	}

	public static final PerformRuleResult pattern_LinkSignatureToType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_12_1_preparereturnvalue_bindingFB(
			LinkSignatureToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkSignatureToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkSignatureToType _this) {
		Object[] result_pattern_LinkSignatureToType_12_1_preparereturnvalue_binding = pattern_LinkSignatureToType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkSignatureToType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkSignatureToType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkSignatureToType_12_1_preparereturnvalue_black = pattern_LinkSignatureToType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkSignatureToType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkSignatureToType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LinkSignatureToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkSignatureToType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				return new Object[] { tSignature, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_12_2_corematch_blackBBFFFFB(
			TSignature tSignature, TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
			MSignature mSignature = mSignatureToTSignature.getSource();
			if (mSignature != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type tmpMType = mTypeToTType.getSource();
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						_result.add(new Object[] { tSignature, tType, mSignature, mSignatureToTSignature, mType,
								mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_12_3_findcontext_blackBBBFBBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.getSignature().contains(tSignature)) {
			if (mSignature.equals(mSignatureToTSignature.getSource())) {
				if (tSignature.equals(mSignatureToTSignature.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							for (BodyDeclaration tmpMDefinition : mType.getBodyDeclarations()) {
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									_result.add(new Object[] { tSignature, tType, mSignature, mDefinition,
											mSignatureToTSignature, mType, mTypeToTType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tSignature____signature_name_prime = "signature";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tType__tSignature____signature);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____abstractTypeDeclaration);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
				isApplicableMatch, tType__tSignature____signature, mSignatureToTSignature__mSignature____source,
				mSignatureToTSignature__tSignature____target, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration, mTypeToTType__mType____source,
				mTypeToTType__tType____target };
	}

	public static final Object[] pattern_LinkSignatureToType_12_4_solveCSP_bindingFBBBBBBBBB(LinkSignatureToType _this,
			IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType, MSignature mSignature,
			MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, tType, mSignature,
				mDefinition, mSignatureToTSignature, mType, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
					mSignatureToTSignature, mType, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			LinkSignatureToType _this, IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_LinkSignatureToType_12_4_solveCSP_binding = pattern_LinkSignatureToType_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType);
		if (result_pattern_LinkSignatureToType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkSignatureToType_12_4_solveCSP_black = pattern_LinkSignatureToType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
						mSignatureToTSignature, mType, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_12_5_checkCSP_expressionFBB(LinkSignatureToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkSignatureToType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkSignatureToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkSignatureToType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_20_1_preparereturnvalue_bindingFB(
			LinkSignatureToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkSignatureToType _this) {
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

	public static final Object[] pattern_LinkSignatureToType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkSignatureToType _this) {
		Object[] result_pattern_LinkSignatureToType_20_1_preparereturnvalue_binding = pattern_LinkSignatureToType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkSignatureToType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkSignatureToType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkSignatureToType_20_1_preparereturnvalue_black = pattern_LinkSignatureToType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkSignatureToType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkSignatureToType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkSignatureToType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mDefinitions.getSrc();
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			EObject tmpMDefinition = _edge_mDefinitions.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					AbstractTypeDeclaration mType = mDefinition.getAbstractTypeDeclaration();
					if (mType != null) {
						_result.add(new Object[] { mSignature, mDefinition, mType, _edge_mDefinitions });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkSignatureToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkSignatureToType _this, Match match, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mDefinition, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkSignatureToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkSignatureToType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_21_1_preparereturnvalue_bindingFB(
			LinkSignatureToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkSignatureToType _this) {
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

	public static final Object[] pattern_LinkSignatureToType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkSignatureToType _this) {
		Object[] result_pattern_LinkSignatureToType_21_1_preparereturnvalue_binding = pattern_LinkSignatureToType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkSignatureToType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkSignatureToType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkSignatureToType_21_1_preparereturnvalue_black = pattern_LinkSignatureToType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkSignatureToType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkSignatureToType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkSignatureToType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_signature.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpTSignature = _edge_signature.getTrg();
			if (tmpTSignature instanceof TSignature) {
				TSignature tSignature = (TSignature) tmpTSignature;
				if (tType.getSignature().contains(tSignature)) {
					_result.add(new Object[] { tSignature, tType, _edge_signature });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkSignatureToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			LinkSignatureToType _this, Match match, TSignature tSignature, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkSignatureToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkSignatureToType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_24_1_prepare_blackB(LinkSignatureToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkSignatureToType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkSignatureToType_24_2_matchcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mSignature");
		EObject _localVariable_3 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpMType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
							return new Object[] { tSignature, tType, mSignature, mDefinition, mType, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_24_2_matchcontext_blackBBBBFBFBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tType.getSignature().contains(tSignature)) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (mType.getBodyDeclarations().contains(mDefinition)) {
						for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
							if (tSignature.equals(mSignatureToTSignature.getTarget())) {
								for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
									if (tType.equals(mTypeToTType.getTarget())) {
										_result.add(new Object[] { tSignature, tType, mSignature, mDefinition,
												mSignatureToTSignature, mType, mTypeToTType, sourceMatch,
												targetMatch });
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

	public static final Object[] pattern_LinkSignatureToType_24_2_matchcontext_greenBBBBBBBBFB(TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "LinkSignatureToType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
				sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_LinkSignatureToType_24_3_checkcsp_bindingFBBBBBBBBBBB(
			LinkSignatureToType _this, CCMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, tSignature, tType, mSignature,
				mDefinition, mSignatureToTSignature, mType, mTypeToTType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
					mSignatureToTSignature, mType, mTypeToTType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBB(
			LinkSignatureToType _this, CCMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkSignatureToType_24_3_checkcsp_binding = pattern_LinkSignatureToType_24_3_checkcsp_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType, sourceMatch, targetMatch);
		if (result_pattern_LinkSignatureToType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_24_3_checkcsp_binding[0];

			Object[] result_pattern_LinkSignatureToType_24_3_checkcsp_black = pattern_LinkSignatureToType_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
						mSignatureToTSignature, mType, mTypeToTType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_24_4_createcorrespondence_blackBBBBBB(
			TSignature tSignature, TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			AbstractTypeDeclaration mType, CCMatch isApplicableMatch) {
		return new Object[] { tSignature, tType, mSignature, mDefinition, mType, isApplicableMatch };
	}

	public static final Object[] pattern_LinkSignatureToType_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_LinkSignatureToType_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkSignatureToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkSignatureToType_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_27_1_matchtggpattern_blackBBB(MSignature mSignature,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (mType.getBodyDeclarations().contains(mDefinition)) {
				return new Object[] { mSignature, mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_28_1_matchtggpattern_blackBB(TSignature tSignature,
			TAbstractType tType) {
		if (tType.getSignature().contains(tSignature)) {
			return new Object[] { tSignature, tType };
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkSignatureToType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_29_1_createresult_blackB(LinkSignatureToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkSignatureToType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkSignatureToType_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList.getEntryObjects()) {
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							TSignature tSignature = mSignatureToTSignature.getTarget();
							if (tSignature != null) {
								MSignature mSignature = mSignatureToTSignature.getSource();
								if (mSignature != null) {
									if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mSignatureToTSignature) == null) {
										if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tSignature) == null) {
											if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mSignature) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														TAbstractType tType = mTypeToTType.getTarget();
														if (tType != null) {
															Type tmpMType = mTypeToTType.getSource();
															if (tmpMType instanceof AbstractTypeDeclaration) {
																AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
																if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tType) == null) {
																		if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			for (BodyDeclaration tmpMDefinition : mType
																					.getBodyDeclarations()) {
																				if (tmpMDefinition instanceof MDefinition) {
																					MDefinition mDefinition = (MDefinition) tmpMDefinition;
																					if (pattern_LinkSignatureToType_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult,
																							mDefinition) == null) {
																						_result.add(new Object[] {
																								mSignatureToTSignatureList,
																								tSignature,
																								mSignatureToTSignature,
																								mSignature,
																								mTypeToTTypeList, tType,
																								mTypeToTType, mType,
																								mDefinition,
																								ruleEntryContainer,
																								ruleResult });
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
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_29_3_solveCSP_bindingFBBBBBBBBBB(LinkSignatureToType _this,
			IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType, MSignature mSignature,
			MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tSignature, tType, mSignature,
				mDefinition, mSignatureToTSignature, mType, mTypeToTType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
					mSignatureToTSignature, mType, mTypeToTType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkSignatureToType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkSignatureToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			LinkSignatureToType _this, IsApplicableMatch isApplicableMatch, TSignature tSignature, TAbstractType tType,
			MSignature mSignature, MDefinition mDefinition, MSignatureToTSignature mSignatureToTSignature,
			AbstractTypeDeclaration mType, TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkSignatureToType_29_3_solveCSP_binding = pattern_LinkSignatureToType_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType,
				mTypeToTType, ruleResult);
		if (result_pattern_LinkSignatureToType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkSignatureToType_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkSignatureToType_29_3_solveCSP_black = pattern_LinkSignatureToType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkSignatureToType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, tType, mSignature, mDefinition,
						mSignatureToTSignature, mType, mTypeToTType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkSignatureToType_29_4_checkCSP_expressionFBB(LinkSignatureToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkSignatureToType_29_5_checknacs_blackBBBBBBB(TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType) {
		return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType };
	}

	public static final Object[] pattern_LinkSignatureToType_29_6_perform_blackBBBBBBBB(TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition,
			MSignatureToTSignature mSignatureToTSignature, AbstractTypeDeclaration mType,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tSignature, tType, mSignature, mDefinition, mSignatureToTSignature, mType, mTypeToTType,
				ruleResult };
	}

	public static final Object[] pattern_LinkSignatureToType_29_6_perform_greenBBBBB(TSignature tSignature,
			TAbstractType tType, MSignature mSignature, MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		tType.getSignature().add(tSignature);
		mSignature.getMDefinitions().add(mDefinition);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, tType, mSignature, mDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkSignatureToType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkSignatureToTypeImpl
