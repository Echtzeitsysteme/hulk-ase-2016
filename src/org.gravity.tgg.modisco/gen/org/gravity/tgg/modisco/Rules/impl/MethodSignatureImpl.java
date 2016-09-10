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

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;

import org.gravity.tgg.modisco.MMethodNameToTMethod;
import org.gravity.tgg.modisco.MMethodSignatureToTMethodSignature;
import org.gravity.tgg.modisco.MMethodSignatureToTParameterList;
import org.gravity.tgg.modisco.MSignatureToTSignature;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.MethodSignature;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameterList;

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
 * An implementation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureImpl extends AbstractRuleImpl implements MethodSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mSignature, MMethodName mName) {
		// initial bindings
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_0_1_initialbindings_blackBBBB(this, match,
				mSignature, mName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mName] = " + mName + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mSignature, mName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mName] = "
					+ mName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureImpl.pattern_MethodSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBB(match, mSignature, mName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mName] = " + mName + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBFFF(match, mSignature,
					mName);
			// EMoflonEdge mSignature__mName____mMethodName = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mName__mSignature____mMethodSignatures = (EMoflonEdge) result4_green[4];
			// EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = MethodSignatureImpl
					.pattern_MethodSignature_0_5_collectcontextelements_blackBBB(match, mSignature, mName);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mSignature] = " + mSignature + ", " + "[mName] = " + mName + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_5_collectcontextelements_greenBB(match, mName);

			// register objects to match
			MethodSignatureImpl.pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mSignature, mName);
			return MethodSignatureImpl.pattern_MethodSignature_0_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[1];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[2];
		TMethod tName = (TMethod) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_greenBFFFFBFB(mSignature, tName, csp);
		TMethodSignature tSignature = (TMethodSignature) result1_green[1];
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result1_green[2];
		TParameterList tParameterList = (TParameterList) result1_green[3];
		MMethodSignatureToTParameterList mSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_green[4];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[6];

		// collect translated elements
		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBBBB(
				mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList, mSignatureToTParameterList,
				mSignatureToTSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mMethodSignatureToTMethodSignature] = " + mMethodSignatureToTMethodSignature + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[mSignatureToTParameterList] = "
					+ mSignatureToTParameterList + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBBBB(
				mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList, mSignatureToTParameterList,
				mSignatureToTSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, mNameToTName,
				tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mMethodSignatureToTMethodSignature] = " + mMethodSignatureToTMethodSignature
					+ ", " + "[mName] = " + mName + ", " + "[mNameToTName] = " + mNameToTName + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[mSignatureToTParameterList] = "
					+ mSignatureToTParameterList + ", " + "[tName] = " + tName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature);
		// EMoflonEdge mSignature__mName____mMethodName = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mName__mSignature____mMethodSignatures = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tSignature__tParameterList____paramList = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mMethodSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mMethodSignatureToTMethodSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mSignatureToTParameterList__mSignature____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureImpl.pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, mNameToTName, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature);
		return MethodSignatureImpl.pattern_MethodSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		MMethodName mName = (MMethodName) result2_binding[1];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_blackBBFFB(mSignature,
				mName, match)) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[2];
			TMethod tName = (TMethod) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : MethodSignatureImpl
					.pattern_MethodSignature_2_3_findcontext_blackBBBB(mSignature, mName, mNameToTName, tName)) {
				Object[] result3_green = MethodSignatureImpl.pattern_MethodSignature_2_3_findcontext_greenBBBBFFFFFF(
						mSignature, mName, mNameToTName, tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge mSignature__mName____mMethodName = (EMoflonEdge) result3_green[5];
				// EMoflonEdge mName__mSignature____mMethodSignatures = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mSignature, mName, mNameToTName, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mName] = " + mName + ", " + "[mNameToTName] = "
							+ mNameToTName + ", " + "[tName] = " + tName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureImpl.pattern_MethodSignature_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mSignature, MMethodName mName) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mName", mName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mSignature, MMethodName mName) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList.ID", csp);
		var_tParameterList_ID.setType("int");
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", csp);
		var_tSignature_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tParameterList_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mMethodSignatureToTMethodSignature", mMethodSignatureToTMethodSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mSignatureToTParameterList", mSignatureToTParameterList);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSignature").eClass())
				.equals("modisco.MMethodSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSignature, TParameterList tParameterList,
			TMethod tName) {
		// initial bindings
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_10_1_initialbindings_blackBBBBB(this,
				match, tSignature, tParameterList, tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[tName] = " + tName + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tParameterList,
						tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodSignatureImpl.pattern_MethodSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(match, tSignature,
							tParameterList, tName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
						+ "[tParameterList] = " + tParameterList + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tSignature, tParameterList, tName);
			// EMoflonEdge tSignature__tParameterList____paramList = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(
					match, tSignature, tParameterList, tName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", "
						+ "[tParameterList] = " + tParameterList + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_greenBB(match, tName);

			// register objects to match
			MethodSignatureImpl.pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tSignature, tParameterList, tName);
			return MethodSignatureImpl.pattern_MethodSignature_10_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[0];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[1];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[2];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[3];
		TMethod tName = (TMethod) result1_bindingAndBlack[4];
		// CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_greenFBFBBFF(tSignature, mName, tParameterList);
		MMethodSignature mSignature = (MMethodSignature) result1_green[0];
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result1_green[2];
		MMethodSignatureToTParameterList mSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_green[5];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[6];

		// collect translated elements
		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBBBB(
				mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList, mSignatureToTParameterList,
				mSignatureToTSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mMethodSignatureToTMethodSignature] = " + mMethodSignatureToTMethodSignature + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[mSignatureToTParameterList] = "
					+ mSignatureToTParameterList + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ".");
		}
		Object[] result2_green = MethodSignatureImpl
				.pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBBBB(mSignature, tSignature,
						mMethodSignatureToTMethodSignature, tParameterList, mSignatureToTParameterList,
						mSignatureToTSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, mNameToTName,
				tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = "
					+ tSignature + ", " + "[mMethodSignatureToTMethodSignature] = " + mMethodSignatureToTMethodSignature
					+ ", " + "[mName] = " + mName + ", " + "[mNameToTName] = " + mNameToTName + ", "
					+ "[tParameterList] = " + tParameterList + ", " + "[mSignatureToTParameterList] = "
					+ mSignatureToTParameterList + ", " + "[tName] = " + tName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature);
		// EMoflonEdge mSignature__mName____mMethodName = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mName__mSignature____mMethodSignatures = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tSignature__tParameterList____paramList = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mMethodSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mMethodSignatureToTMethodSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mSignatureToTParameterList__mSignature____source = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[16];
		// EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		MethodSignatureImpl.pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, mNameToTName, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature);
		return MethodSignatureImpl.pattern_MethodSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TParameterList tParameterList = (TParameterList) result2_binding[1];
		TMethod tName = (TMethod) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_12_2_corematch_blackBFFBBB(tSignature,
				tParameterList, tName, match)) {
			MMethodName mName = (MMethodName) result2_black[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_12_3_findcontext_blackBBBBB(
					tSignature, mName, mNameToTName, tParameterList, tName)) {
				Object[] result3_green = MethodSignatureImpl.pattern_MethodSignature_12_3_findcontext_greenBBBBBFFFFFF(
						tSignature, mName, mNameToTName, tParameterList, tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tSignature__tParameterList____paramList = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[9];
				// EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tSignature, mName, mNameToTName, tParameterList, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mName] = " + mName + ", " + "[mNameToTName] = "
							+ mNameToTName + ", " + "[tParameterList] = " + tParameterList + ", " + "[tName] = " + tName
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodSignatureImpl.pattern_MethodSignature_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSignature, TParameterList tParameterList,
			TMethod tName) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tParameterList", tParameterList);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSignature, TParameterList tParameterList,
			TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList.ID", true, csp);
		var_tParameterList_ID.setValue(tParameterList.getID());
		var_tParameterList_ID.setType("int");
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", true, csp);
		var_tSignature_ID.setValue(tSignature.getID());
		var_tSignature_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tParameterList_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSignature_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			MMethodName mName, MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("tName", tName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mMethodSignatureToTMethodSignature", mMethodSignatureToTMethodSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mSignatureToTParameterList", mSignatureToTParameterList);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TMethodSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tParameterList").eClass())
						.equals("basic.TParameterList.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(EMoflonEdge _edge_mMethodName) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_20_2_testcorematchandDECs_blackFFB(_edge_mMethodName)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[1];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureImpl
					.pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mSignature, mName)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureImpl
						.pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_26(EMoflonEdge _edge_paramList) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(_edge_paramList)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TParameterList tParameterList = (TParameterList) result2_black[1];
			TMethod tName = (TMethod) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodSignatureImpl
					.pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tSignature, tParameterList, tName)) {
				// Ensure that the correct types of elements are matched
				if (MethodSignatureImpl
						.pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList", true, csp);
		var_tParameterList_ID.setValue(__helper.getValue("tParameterList", "ID"));
		var_tParameterList_ID.setType("int");

		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_ID.setValue(__helper.getValue("tSignature", "ID"));
		var_tSignature_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		createID0.setRuleName("MethodSignature");
		createID0.solve(var_tParameterList_ID);

		createID1.setRuleName("MethodSignature");
		createID1.solve(var_tSignature_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tParameterList_ID.setBound(false);
			var_tSignature_ID.setBound(false);
			createID0.solve(var_tParameterList_ID);
			createID1.solve(var_tSignature_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tParameterList", "ID", var_tParameterList_ID.getValue());
				__helper.setValue("tSignature", "ID", var_tSignature_ID.getValue());
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
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList", true, csp);
		var_tParameterList_ID.setValue(__helper.getValue("tParameterList", "ID"));
		var_tParameterList_ID.setType("int");

		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_ID.setValue(__helper.getValue("tSignature", "ID"));
		var_tSignature_ID.setType("int");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		createID0.setRuleName("MethodSignature");
		createID0.solve(var_tParameterList_ID);

		createID1.setRuleName("MethodSignature");
		createID1.solve(var_tSignature_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			createID0.solve(var_tParameterList_ID);
			createID1.solve(var_tSignature_ID);
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
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodSignatureImpl
				.pattern_MethodSignature_24_2_matchcontext_bindingFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		TMethodSignature tSignature = (TMethodSignature) result2_binding[1];
		MMethodName mName = (MMethodName) result2_binding[2];
		TParameterList tParameterList = (TParameterList) result2_binding[3];
		TMethod tName = (TMethod) result2_binding[4];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_24_2_matchcontext_blackBBBFBBBB(
				mSignature, tSignature, mName, tParameterList, tName, sourceMatch, targetMatch)) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[3];
			Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_24_2_matchcontext_greenBBBBBBBFB(
					mSignature, tSignature, mName, mNameToTName, tParameterList, tName, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = MethodSignatureImpl
					.pattern_MethodSignature_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mSignature, tSignature, mName, mNameToTName, tParameterList, tName, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodSignatureImpl
						.pattern_MethodSignature_24_4_createcorrespondence_blackBBBBBB(mSignature, tSignature, mName,
								tParameterList, tName, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mName] = " + mName + ", " + "[tParameterList] = " + tParameterList + ", "
							+ "[tName] = " + tName + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_4_createcorrespondence_greenBBFBFFB(mSignature,
						tSignature, tParameterList, isApplicableMatch);
				// MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result4_green[2];
				// MMethodSignatureToTParameterList mSignatureToTParameterList = (MMethodSignatureToTParameterList) result4_green[4];
				// MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result4_green[5];

				// add to returned result
				Object[] result5_black = MethodSignatureImpl
						.pattern_MethodSignature_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodName mName, MMethodNameToTMethod mNameToTName,
			TParameterList tParameterList, TMethod tName, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList.ID", true, csp);
		var_tParameterList_ID.setValue(tParameterList.getID());
		var_tParameterList_ID.setType("int");
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", true, csp);
		var_tSignature_ID.setValue(tSignature.getID());
		var_tSignature_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tParameterList_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("tName", tName);
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
	public boolean checkDEC_FWD(MMethodSignature mSignature, MMethodName mName) {// match tgg pattern
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_27_1_matchtggpattern_blackBB(mSignature,
				mName);
		if (result1_black != null) {
			return MethodSignatureImpl.pattern_MethodSignature_27_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {// match tgg pattern
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_28_1_matchtggpattern_blackBBB(tSignature,
				tParameterList, tName);
		if (result1_black != null) {
			return MethodSignatureImpl.pattern_MethodSignature_28_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodNameToTMethod mNameToTNameParameter) {
		// create result
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[2];
			TMethod tName = (TMethod) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodSignatureImpl
					.pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mName,
							mNameToTName, tName, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mName] = " + mName
						+ ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodSignatureImpl.pattern_MethodSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_29_5_checknacs_blackBBB(mName,
						mNameToTName, tName);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodSignatureImpl.pattern_MethodSignature_29_6_perform_blackBBBB(mName,
							mNameToTName, tName, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mName] = " + mName + ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = "
								+ tName + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_29_6_perform_greenFFFBFFBFBB(mName, tName, ruleResult,
							csp);
					// MMethodSignature mSignature = (MMethodSignature) result6_green[0];
					// TMethodSignature tSignature = (TMethodSignature) result6_green[1];
					// MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = (MMethodSignatureToTMethodSignature) result6_green[2];
					// TParameterList tParameterList = (TParameterList) result6_green[4];
					// MMethodSignatureToTParameterList mSignatureToTParameterList = (MMethodSignatureToTParameterList) result6_green[5];
					// MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TMethod tName, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_tParameterList_ID = CSPFactoryHelper.eINSTANCE.createVariable("tParameterList.ID", csp);
		var_tParameterList_ID.setType("int");
		Variable var_tSignature_ID = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.ID", csp);
		var_tSignature_ID.setType("int");

		// Create constraints
		CreateID createID = new CreateID();
		CreateID createID_0 = new CreateID();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(createID_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tParameterList_ID);
		createID_0.setRuleName("");
		createID_0.solve(var_tSignature_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_MMETHODNAME_MMETHODNAMETOTMETHOD_TMETHOD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2), (MMethodNameToTMethod) arguments.get(3),
					(TMethod) arguments.get(4));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2), (TMethod) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TPARAMETERLIST_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameterList) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_MMETHODNAME_MMETHODNAMETOTMETHOD_TPARAMETERLIST_TMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2), (MMethodNameToTMethod) arguments.get(3),
					(TParameterList) arguments.get(4), (TMethod) arguments.get(5));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_26((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODSIGNATURE_TMETHODSIGNATURE_MMETHODNAME_MMETHODNAMETOTMETHOD_TPARAMETERLIST_TMETHOD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TMethodSignature) arguments.get(2), (MMethodName) arguments.get(3),
					(MMethodNameToTMethod) arguments.get(4), (TParameterList) arguments.get(5),
					(TMethod) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_FWD__MMETHODSIGNATURE_MMETHODNAME:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MMethodName) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_BWD__TMETHODSIGNATURE_TPARAMETERLIST_TMETHOD:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TParameterList) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODNAMETOTMETHOD:
			return generateModel((RuleEntryContainer) arguments.get(0), (MMethodNameToTMethod) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODNAME_MMETHODNAMETOTMETHOD_TMETHOD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodName) arguments.get(1),
					(MMethodNameToTMethod) arguments.get(2), (TMethod) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignature_0_1_initialbindings_blackBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName) {
		return new Object[] { _this, match, mSignature, mName };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingFBBBB(MethodSignature _this, Match match,
			MMethodSignature mSignature, MMethodName mName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName) {
		Object[] result_pattern_MethodSignature_0_2_SolveCSP_binding = pattern_MethodSignature_0_2_SolveCSP_bindingFBBBB(
				_this, match, mSignature, mName);
		if (result_pattern_MethodSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_0_2_SolveCSP_black = pattern_MethodSignature_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_0_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBB(Match match,
			MMethodSignature mSignature, MMethodName mName) {
		return new Object[] { match, mSignature, mName };
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBFFF(Match match,
			MMethodSignature mSignature, MMethodName mName) {
		EMoflonEdge mSignature__mName____mMethodName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mMethodSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSignature);
		String mSignature__mName____mMethodName_name_prime = "mMethodName";
		String mName__mSignature____mMethodSignatures_name_prime = "mMethodSignatures";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		mSignature__mName____mMethodName.setSrc(mSignature);
		mSignature__mName____mMethodName.setTrg(mName);
		match.getToBeTranslatedEdges().add(mSignature__mName____mMethodName);
		mName__mSignature____mMethodSignatures.setSrc(mName);
		mName__mSignature____mMethodSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mName__mSignature____mMethodSignatures);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignature__mName____mMethodName.setName(mSignature__mName____mMethodName_name_prime);
		mName__mSignature____mMethodSignatures.setName(mName__mSignature____mMethodSignatures_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		return new Object[] { match, mSignature, mName, mSignature__mName____mMethodName,
				mName__mSignature____mMethodSignatures, mName__mSignature____mSignatures };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mSignature, MMethodName mName) {
		return new Object[] { match, mSignature, mName };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_greenBB(Match match,
			MMethodName mName) {
		match.getContextNodes().add(mName);
		return new Object[] { match, mName };
	}

	public static final void pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mName);

	}

	public static final boolean pattern_MethodSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mName");
		EObject _localVariable_2 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_3 = isApplicableMatch.getObject("tName");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		EObject tmpMNameToTName = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (tmpMNameToTName instanceof MMethodNameToTMethod) {
					MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						return new Object[] { mSignature, mName, mNameToTName, tName, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_blackBBBBFBB(
			MMethodSignature mSignature, MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName,
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mName, mNameToTName, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_1_1_performtransformation_binding = pattern_MethodSignature_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_1_1_performtransformation_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_1_1_performtransformation_binding[0];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_1_1_performtransformation_binding[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[3];

			Object[] result_pattern_MethodSignature_1_1_performtransformation_black = pattern_MethodSignature_1_1_performtransformation_blackBBBBFBB(
					mSignature, mName, mNameToTName, tName, _this, isApplicableMatch);
			if (result_pattern_MethodSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_1_1_performtransformation_black[4];

				return new Object[] { mSignature, mName, mNameToTName, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_greenBFFFFBFB(
			MMethodSignature mSignature, TMethod tName, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTMethodSignature();
		TParameterList tParameterList = BasicFactory.eINSTANCE.createTParameterList();
		MMethodSignatureToTParameterList mSignatureToTParameterList = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTParameterList();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		Object _localVariable_0 = csp.getValue("tSignature", "ID");
		Object _localVariable_1 = csp.getValue("tParameterList", "ID");
		tSignature.setMethod(tName);
		mMethodSignatureToTMethodSignature.setSource(mSignature);
		mMethodSignatureToTMethodSignature.setTarget(tSignature);
		tSignature.setParamList(tParameterList);
		mSignatureToTParameterList.setSource(mSignature);
		mSignatureToTParameterList.setTarget(tParameterList);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		int tSignature_ID_prime = (int) _localVariable_0;
		int tParameterList_ID_prime = (int) _localVariable_1;
		tSignature.setID(Integer.valueOf(tSignature_ID_prime));
		tParameterList.setID(Integer.valueOf(tParameterList_ID_prime));
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature, csp };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature, TParameterList tParameterList,
			MMethodSignatureToTParameterList mSignatureToTParameterList,
			MSignatureToTSignature mSignatureToTSignature) {
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature, TParameterList tParameterList,
			MMethodSignatureToTParameterList mSignatureToTParameterList,
			MSignatureToTSignature mSignatureToTSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mMethodSignatureToTMethodSignature);
		ruleresult.getCreatedElements().add(tParameterList);
		ruleresult.getCreatedLinkElements().add(mSignatureToTParameterList);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		return new Object[] { ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature };
	}

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		if (!mSignature.equals(tSignature)) {
			if (!mSignature.equals(tParameterList)) {
				if (!mSignature.equals(mSignatureToTParameterList)) {
					if (!mSignature.equals(tName)) {
						if (!mSignature.equals(mSignatureToTSignature)) {
							if (!mMethodSignatureToTMethodSignature.equals(mSignature)) {
								if (!mMethodSignatureToTMethodSignature.equals(tSignature)) {
									if (!mMethodSignatureToTMethodSignature.equals(mName)) {
										if (!mMethodSignatureToTMethodSignature.equals(mNameToTName)) {
											if (!mMethodSignatureToTMethodSignature.equals(tParameterList)) {
												if (!mMethodSignatureToTMethodSignature
														.equals(mSignatureToTParameterList)) {
													if (!mMethodSignatureToTMethodSignature.equals(tName)) {
														if (!mMethodSignatureToTMethodSignature
																.equals(mSignatureToTSignature)) {
															if (!mName.equals(mSignature)) {
																if (!mName.equals(tSignature)) {
																	if (!mName.equals(mNameToTName)) {
																		if (!mName.equals(tParameterList)) {
																			if (!mName.equals(
																					mSignatureToTParameterList)) {
																				if (!mName.equals(tName)) {
																					if (!mName.equals(
																							mSignatureToTSignature)) {
																						if (!mNameToTName
																								.equals(mSignature)) {
																							if (!mNameToTName.equals(
																									tSignature)) {
																								if (!mNameToTName
																										.equals(tParameterList)) {
																									if (!mNameToTName
																											.equals(mSignatureToTParameterList)) {
																										if (!mNameToTName
																												.equals(tName)) {
																											if (!mNameToTName
																													.equals(mSignatureToTSignature)) {
																												if (!tParameterList
																														.equals(tSignature)) {
																													if (!mSignatureToTParameterList
																															.equals(tSignature)) {
																														if (!mSignatureToTParameterList
																																.equals(tParameterList)) {
																															if (!mSignatureToTParameterList
																																	.equals(tName)) {
																																if (!mSignatureToTParameterList
																																		.equals(mSignatureToTSignature)) {
																																	if (!tName
																																			.equals(tSignature)) {
																																		if (!tName
																																				.equals(tParameterList)) {
																																			if (!mSignatureToTSignature
																																					.equals(tSignature)) {
																																				if (!mSignatureToTSignature
																																						.equals(tParameterList)) {
																																					if (!mSignatureToTSignature
																																							.equals(tName)) {
																																						return new Object[] {
																																								ruleresult,
																																								mSignature,
																																								tSignature,
																																								mMethodSignatureToTMethodSignature,
																																								mName,
																																								mNameToTName,
																																								tParameterList,
																																								mSignatureToTParameterList,
																																								tName,
																																								mSignatureToTSignature };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		EMoflonEdge mSignature__mName____mMethodName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mMethodSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTMethodSignature__tSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTParameterList__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String mSignature__mName____mMethodName_name_prime = "mMethodName";
		String mName__mSignature____mMethodSignatures_name_prime = "mMethodSignatures";
		String tSignature__tParameterList____paramList_name_prime = "paramList";
		String mMethodSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		String mMethodSignatureToTMethodSignature__tSignature____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTParameterList__mSignature____source_name_prime = "source";
		String mSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		mSignature__mName____mMethodName.setSrc(mSignature);
		mSignature__mName____mMethodName.setTrg(mName);
		ruleresult.getTranslatedEdges().add(mSignature__mName____mMethodName);
		mName__mSignature____mMethodSignatures.setSrc(mName);
		mName__mSignature____mMethodSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mName__mSignature____mMethodSignatures);
		tSignature__tParameterList____paramList.setSrc(tSignature);
		tSignature__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(tSignature__tParameterList____paramList);
		mMethodSignatureToTMethodSignature__mSignature____source.setSrc(mMethodSignatureToTMethodSignature);
		mMethodSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mMethodSignatureToTMethodSignature__mSignature____source);
		mMethodSignatureToTMethodSignature__tSignature____target.setSrc(mMethodSignatureToTMethodSignature);
		mMethodSignatureToTMethodSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mMethodSignatureToTMethodSignature__tSignature____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTParameterList__mSignature____source.setSrc(mSignatureToTParameterList);
		mSignatureToTParameterList__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTParameterList__mSignature____source);
		mSignatureToTParameterList__tParameterList____target.setSrc(mSignatureToTParameterList);
		mSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(mSignatureToTParameterList__tParameterList____target);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignature__mName____mMethodName.setName(mSignature__mName____mMethodName_name_prime);
		mName__mSignature____mMethodSignatures.setName(mName__mSignature____mMethodSignatures_name_prime);
		tSignature__tParameterList____paramList.setName(tSignature__tParameterList____paramList_name_prime);
		mMethodSignatureToTMethodSignature__mSignature____source
				.setName(mMethodSignatureToTMethodSignature__mSignature____source_name_prime);
		mMethodSignatureToTMethodSignature__tSignature____target
				.setName(mMethodSignatureToTMethodSignature__tSignature____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTParameterList__mSignature____source
				.setName(mSignatureToTParameterList__mSignature____source_name_prime);
		mSignatureToTParameterList__tParameterList____target
				.setName(mSignatureToTParameterList__tParameterList____target_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName,
				tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature,
				mSignature__mName____mMethodName, mName__mSignature____mMethodSignatures,
				tSignature__tParameterList____paramList, mMethodSignatureToTMethodSignature__mSignature____source,
				mMethodSignatureToTMethodSignature__tSignature____target, mName__mSignature____mSignatures,
				mSignatureToTParameterList__mSignature____source, mSignatureToTParameterList__tParameterList____target,
				tSignature__tName____method, tName__tSignature____signatures,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target };
	}

	public static final void pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		_this.registerObjects_FWD(ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName,
				mNameToTName, tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_MethodSignature_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_binding = pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_black = pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mName");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				return new Object[] { mSignature, mName, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_2_corematch_blackBBFFB(MMethodSignature mSignature,
			MMethodName mName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
			TMethod tName = mNameToTName.getTarget();
			if (tName != null) {
				_result.add(new Object[] { mSignature, mName, mNameToTName, tName, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_3_findcontext_blackBBBB(
			MMethodSignature mSignature, MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mName.equals(mSignature.getMMethodName())) {
			if (mName.getMSignatures().contains(mSignature)) {
				if (mName.equals(mNameToTName.getSource())) {
					if (tName.equals(mNameToTName.getTarget())) {
						_result.add(new Object[] { mSignature, mName, mNameToTName, tName });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_3_findcontext_greenBBBBFFFFFF(MMethodSignature mSignature,
			MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignature__mName____mMethodName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mMethodSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignature__mName____mMethodName_name_prime = "mMethodName";
		String mName__mSignature____mMethodSignatures_name_prime = "mMethodSignatures";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		mSignature__mName____mMethodName.setSrc(mSignature);
		mSignature__mName____mMethodName.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mSignature__mName____mMethodName);
		mName__mSignature____mMethodSignatures.setSrc(mName);
		mName__mSignature____mMethodSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mMethodSignatures);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mSignature__mName____mMethodName.setName(mSignature__mName____mMethodName_name_prime);
		mName__mSignature____mMethodSignatures.setName(mName__mSignature____mMethodSignatures_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { mSignature, mName, mNameToTName, tName, isApplicableMatch,
				mSignature__mName____mMethodName, mName__mSignature____mMethodSignatures,
				mName__mSignature____mSignatures, mNameToTName__mName____source, mNameToTName__tName____target };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TMethod tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, mName, mNameToTName,
				tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mName, mNameToTName, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TMethod tName) {
		Object[] result_pattern_MethodSignature_2_4_solveCSP_binding = pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignature, mName, mNameToTName, tName);
		if (result_pattern_MethodSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_2_4_solveCSP_black = pattern_MethodSignature_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mName, mNameToTName, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_2_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		return new Object[] { _this, match, tSignature, tParameterList, tName };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tParameterList, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tParameterList, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		Object[] result_pattern_MethodSignature_10_2_SolveCSP_binding = pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tParameterList, tName);
		if (result_pattern_MethodSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_10_2_SolveCSP_black = pattern_MethodSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tParameterList, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_10_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		return new Object[] { match, tSignature, tParameterList, tName };
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		EMoflonEdge tSignature__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tParameterList);
		String tSignature__tParameterList____paramList_name_prime = "paramList";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		tSignature__tParameterList____paramList.setSrc(tSignature);
		tSignature__tParameterList____paramList.setTrg(tParameterList);
		match.getToBeTranslatedEdges().add(tSignature__tParameterList____paramList);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tParameterList____paramList.setName(tSignature__tParameterList____paramList_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		return new Object[] { match, tSignature, tParameterList, tName, tSignature__tParameterList____paramList,
				tSignature__tName____method, tName__tSignature____signatures };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		return new Object[] { match, tSignature, tParameterList, tName };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_greenBB(Match match,
			TMethod tName) {
		match.getContextNodes().add(tName);
		return new Object[] { match, tName };
	}

	public static final void pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TParameterList tParameterList, TMethod tName) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tParameterList, tName);

	}

	public static final boolean pattern_MethodSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mName");
		EObject _localVariable_2 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_4 = isApplicableMatch.getObject("tName");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		EObject tmpMNameToTName = _localVariable_2;
		EObject tmpTParameterList = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (tmpMNameToTName instanceof MMethodNameToTMethod) {
					MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
					if (tmpTParameterList instanceof TParameterList) {
						TParameterList tParameterList = (TParameterList) tmpTParameterList;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							return new Object[] { tSignature, mName, mNameToTName, tParameterList, tName,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_blackBBBBBFBB(
			TMethodSignature tSignature, MMethodName mName, MMethodNameToTMethod mNameToTName,
			TParameterList tParameterList, TMethod tName, MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSignature, mName, mNameToTName, tParameterList, tName, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_11_1_performtransformation_binding = pattern_MethodSignature_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_11_1_performtransformation_binding != null) {
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_11_1_performtransformation_binding[0];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_11_1_performtransformation_binding[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[2];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodSignature_11_1_performtransformation_binding[3];
			TMethod tName = (TMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[4];

			Object[] result_pattern_MethodSignature_11_1_performtransformation_black = pattern_MethodSignature_11_1_performtransformation_blackBBBBBFBB(
					tSignature, mName, mNameToTName, tParameterList, tName, _this, isApplicableMatch);
			if (result_pattern_MethodSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_11_1_performtransformation_black[5];

				return new Object[] { tSignature, mName, mNameToTName, tParameterList, tName, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_greenFBFBBFF(
			TMethodSignature tSignature, MMethodName mName, TParameterList tParameterList) {
		MMethodSignature mSignature = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMMethodSignature();
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTMethodSignature();
		MMethodSignatureToTParameterList mSignatureToTParameterList = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTParameterList();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		mSignature.setMMethodName(mName);
		mName.getMSignatures().add(mSignature);
		mMethodSignatureToTMethodSignature.setSource(mSignature);
		mMethodSignatureToTMethodSignature.setTarget(tSignature);
		mSignatureToTParameterList.setSource(mSignature);
		mSignatureToTParameterList.setTarget(tParameterList);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature, TParameterList tParameterList,
			MMethodSignatureToTParameterList mSignatureToTParameterList,
			MSignatureToTSignature mSignatureToTSignature) {
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature,
			MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature, TParameterList tParameterList,
			MMethodSignatureToTParameterList mSignatureToTParameterList,
			MSignatureToTSignature mSignatureToTSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mMethodSignatureToTMethodSignature);
		ruleresult.getTranslatedElements().add(tParameterList);
		ruleresult.getCreatedLinkElements().add(mSignatureToTParameterList);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		return new Object[] { ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature };
	}

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		if (!mSignature.equals(tSignature)) {
			if (!mSignature.equals(tParameterList)) {
				if (!mSignature.equals(mSignatureToTParameterList)) {
					if (!mSignature.equals(tName)) {
						if (!mSignature.equals(mSignatureToTSignature)) {
							if (!mMethodSignatureToTMethodSignature.equals(mSignature)) {
								if (!mMethodSignatureToTMethodSignature.equals(tSignature)) {
									if (!mMethodSignatureToTMethodSignature.equals(mName)) {
										if (!mMethodSignatureToTMethodSignature.equals(mNameToTName)) {
											if (!mMethodSignatureToTMethodSignature.equals(tParameterList)) {
												if (!mMethodSignatureToTMethodSignature
														.equals(mSignatureToTParameterList)) {
													if (!mMethodSignatureToTMethodSignature.equals(tName)) {
														if (!mMethodSignatureToTMethodSignature
																.equals(mSignatureToTSignature)) {
															if (!mName.equals(mSignature)) {
																if (!mName.equals(tSignature)) {
																	if (!mName.equals(mNameToTName)) {
																		if (!mName.equals(tParameterList)) {
																			if (!mName.equals(
																					mSignatureToTParameterList)) {
																				if (!mName.equals(tName)) {
																					if (!mName.equals(
																							mSignatureToTSignature)) {
																						if (!mNameToTName
																								.equals(mSignature)) {
																							if (!mNameToTName.equals(
																									tSignature)) {
																								if (!mNameToTName
																										.equals(tParameterList)) {
																									if (!mNameToTName
																											.equals(mSignatureToTParameterList)) {
																										if (!mNameToTName
																												.equals(tName)) {
																											if (!mNameToTName
																													.equals(mSignatureToTSignature)) {
																												if (!tParameterList
																														.equals(tSignature)) {
																													if (!mSignatureToTParameterList
																															.equals(tSignature)) {
																														if (!mSignatureToTParameterList
																																.equals(tParameterList)) {
																															if (!mSignatureToTParameterList
																																	.equals(tName)) {
																																if (!mSignatureToTParameterList
																																		.equals(mSignatureToTSignature)) {
																																	if (!tName
																																			.equals(tSignature)) {
																																		if (!tName
																																				.equals(tParameterList)) {
																																			if (!mSignatureToTSignature
																																					.equals(tSignature)) {
																																				if (!mSignatureToTSignature
																																						.equals(tParameterList)) {
																																					if (!mSignatureToTSignature
																																							.equals(tName)) {
																																						return new Object[] {
																																								ruleresult,
																																								mSignature,
																																								tSignature,
																																								mMethodSignatureToTMethodSignature,
																																								mName,
																																								mNameToTName,
																																								tParameterList,
																																								mSignatureToTParameterList,
																																								tName,
																																								mSignatureToTSignature };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		EMoflonEdge mSignature__mName____mMethodName = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mMethodSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTMethodSignature__tSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTParameterList__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String mSignature__mName____mMethodName_name_prime = "mMethodName";
		String mName__mSignature____mMethodSignatures_name_prime = "mMethodSignatures";
		String tSignature__tParameterList____paramList_name_prime = "paramList";
		String mMethodSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		String mMethodSignatureToTMethodSignature__tSignature____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTParameterList__mSignature____source_name_prime = "source";
		String mSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		mSignature__mName____mMethodName.setSrc(mSignature);
		mSignature__mName____mMethodName.setTrg(mName);
		ruleresult.getCreatedEdges().add(mSignature__mName____mMethodName);
		mName__mSignature____mMethodSignatures.setSrc(mName);
		mName__mSignature____mMethodSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mName__mSignature____mMethodSignatures);
		tSignature__tParameterList____paramList.setSrc(tSignature);
		tSignature__tParameterList____paramList.setTrg(tParameterList);
		ruleresult.getTranslatedEdges().add(tSignature__tParameterList____paramList);
		mMethodSignatureToTMethodSignature__mSignature____source.setSrc(mMethodSignatureToTMethodSignature);
		mMethodSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mMethodSignatureToTMethodSignature__mSignature____source);
		mMethodSignatureToTMethodSignature__tSignature____target.setSrc(mMethodSignatureToTMethodSignature);
		mMethodSignatureToTMethodSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mMethodSignatureToTMethodSignature__tSignature____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTParameterList__mSignature____source.setSrc(mSignatureToTParameterList);
		mSignatureToTParameterList__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTParameterList__mSignature____source);
		mSignatureToTParameterList__tParameterList____target.setSrc(mSignatureToTParameterList);
		mSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		ruleresult.getCreatedEdges().add(mSignatureToTParameterList__tParameterList____target);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignature__mName____mMethodName.setName(mSignature__mName____mMethodName_name_prime);
		mName__mSignature____mMethodSignatures.setName(mName__mSignature____mMethodSignatures_name_prime);
		tSignature__tParameterList____paramList.setName(tSignature__tParameterList____paramList_name_prime);
		mMethodSignatureToTMethodSignature__mSignature____source
				.setName(mMethodSignatureToTMethodSignature__mSignature____source_name_prime);
		mMethodSignatureToTMethodSignature__tSignature____target
				.setName(mMethodSignatureToTMethodSignature__tSignature____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTParameterList__mSignature____source
				.setName(mSignatureToTParameterList__mSignature____source_name_prime);
		mSignatureToTParameterList__tParameterList____target
				.setName(mSignatureToTParameterList__tParameterList____target_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName,
				tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature,
				mSignature__mName____mMethodName, mName__mSignature____mMethodSignatures,
				tSignature__tParameterList____paramList, mMethodSignatureToTMethodSignature__mSignature____source,
				mMethodSignatureToTMethodSignature__tSignature____target, mName__mSignature____mSignatures,
				mSignatureToTParameterList__mSignature____source, mSignatureToTParameterList__tParameterList____target,
				tSignature__tName____method, tName__tSignature____signatures,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target };
	}

	public static final void pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject tSignature,
			EObject mMethodSignatureToTMethodSignature, EObject mName, EObject mNameToTName, EObject tParameterList,
			EObject mSignatureToTParameterList, EObject tName, EObject mSignatureToTSignature) {
		_this.registerObjects_BWD(ruleresult, mSignature, tSignature, mMethodSignatureToTMethodSignature, mName,
				mNameToTName, tParameterList, mSignatureToTParameterList, tName, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_MethodSignature_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_binding = pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_black = pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tParameterList");
		EObject _localVariable_2 = match.getObject("tName");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTParameterList = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					return new Object[] { tSignature, tParameterList, tName, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_2_corematch_blackBFFBBB(
			TMethodSignature tSignature, TParameterList tParameterList, TMethod tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
			MMethodName mName = mNameToTName.getSource();
			if (mName != null) {
				_result.add(new Object[] { tSignature, mName, mNameToTName, tParameterList, tName, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_3_findcontext_blackBBBBB(
			TMethodSignature tSignature, MMethodName mName, MMethodNameToTMethod mNameToTName,
			TParameterList tParameterList, TMethod tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameterList.equals(tSignature.getParamList())) {
			if (mName.equals(mNameToTName.getSource())) {
				if (tName.equals(mNameToTName.getTarget())) {
					if (tName.equals(tSignature.getMethod())) {
						_result.add(new Object[] { tSignature, mName, mNameToTName, tParameterList, tName });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_3_findcontext_greenBBBBBFFFFFF(TMethodSignature tSignature,
			MMethodName mName, MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tParameterList____paramList = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tParameterList____paramList_name_prime = "paramList";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(tName);
		tSignature__tParameterList____paramList.setSrc(tSignature);
		tSignature__tParameterList____paramList.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(tSignature__tParameterList____paramList);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tParameterList____paramList.setName(tSignature__tParameterList____paramList_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		return new Object[] { tSignature, mName, mNameToTName, tParameterList, tName, isApplicableMatch,
				tSignature__tParameterList____paramList, mNameToTName__mName____source, mNameToTName__tName____target,
				tSignature__tName____method, tName__tSignature____signatures };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, mName, mNameToTName,
				tParameterList, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, mName, mNameToTName, tParameterList,
					tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, TMethodSignature tSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName) {
		Object[] result_pattern_MethodSignature_12_4_solveCSP_binding = pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tSignature, mName, mNameToTName, tParameterList, tName);
		if (result_pattern_MethodSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_12_4_solveCSP_black = pattern_MethodSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, mName, mNameToTName, tParameterList,
						tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_12_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_binding = pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_black = pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(
			MMethodSignature mSignature, MMethodName mName) {
		for (MName __DEC_mSignature_mSignatures_297114 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MName.class, "mSignatures")) {
			if (!mName.equals(__DEC_mSignature_mSignatures_297114)) {
				return new Object[] { mSignature, mName };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mMethodName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mMethodName.getSrc();
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			EObject tmpMName = _edge_mMethodName.getTrg();
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (mName.equals(mSignature.getMMethodName())) {
					if (mName.getMSignatures().contains(mSignature)) {
						if (pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(mSignature,
								mName) == null) {
							_result.add(new Object[] { mSignature, mName, _edge_mMethodName });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodSignature _this, Match match, MMethodSignature mSignature, MMethodName mName) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_binding = pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_black = pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_paramList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_paramList.getSrc();
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			EObject tmpTParameterList = _edge_paramList.getTrg();
			if (tmpTParameterList instanceof TParameterList) {
				TParameterList tParameterList = (TParameterList) tmpTParameterList;
				if (tParameterList.equals(tSignature.getParamList())) {
					TMethod tName = tSignature.getMethod();
					if (tName != null) {
						_result.add(new Object[] { tSignature, tParameterList, tName, _edge_paramList });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignature _this, Match match, TMethodSignature tSignature, TParameterList tParameterList,
			TMethod tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tParameterList, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodSignature_24_2_matchcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = sourceMatch.getObject("mName");
		EObject _localVariable_3 = targetMatch.getObject("tParameterList");
		EObject _localVariable_4 = targetMatch.getObject("tName");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpTParameterList = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpMName instanceof MMethodName) {
					MMethodName mName = (MMethodName) tmpMName;
					if (tmpTParameterList instanceof TParameterList) {
						TParameterList tParameterList = (TParameterList) tmpTParameterList;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							return new Object[] { mSignature, tSignature, mName, tParameterList, tName, sourceMatch,
									targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_24_2_matchcontext_blackBBBFBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature, MMethodName mName, TParameterList tParameterList,
			TMethod tName, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mName.equals(mSignature.getMMethodName())) {
				if (tParameterList.equals(tSignature.getParamList())) {
					if (mName.getMSignatures().contains(mSignature)) {
						if (tName.equals(tSignature.getMethod())) {
							for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
								if (tName.equals(mNameToTName.getTarget())) {
									_result.add(new Object[] { mSignature, tSignature, mName, mNameToTName,
											tParameterList, tName, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchcontext_greenBBBBBBBFB(MMethodSignature mSignature,
			TMethodSignature tSignature, MMethodName mName, MMethodNameToTMethod mNameToTName,
			TParameterList tParameterList, TMethod tName, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mSignature, tSignature, mName, mNameToTName, tParameterList, tName, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodSignature_24_3_checkcsp_bindingFBBBBBBBBBB(MethodSignature _this,
			CCMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mSignature, tSignature, mName,
				mNameToTName, tParameterList, tName, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mName, mNameToTName,
					tParameterList, tName, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(MethodSignature _this,
			CCMatch isApplicableMatch, MMethodSignature mSignature, TMethodSignature tSignature, MMethodName mName,
			MMethodNameToTMethod mNameToTName, TParameterList tParameterList, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_3_checkcsp_binding = pattern_MethodSignature_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, tSignature, mName, mNameToTName, tParameterList, tName,
				sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodSignature_24_3_checkcsp_black = pattern_MethodSignature_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodSignature_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, tSignature, mName, mNameToTName,
						tParameterList, tName, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_4_createcorrespondence_blackBBBBBB(
			MMethodSignature mSignature, TMethodSignature tSignature, MMethodName mName, TParameterList tParameterList,
			TMethod tName, CCMatch isApplicableMatch) {
		return new Object[] { mSignature, tSignature, mName, tParameterList, tName, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_24_4_createcorrespondence_greenBBFBFFB(
			MMethodSignature mSignature, TMethodSignature tSignature, TParameterList tParameterList,
			CCMatch isApplicableMatch) {
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTMethodSignature();
		MMethodSignatureToTParameterList mSignatureToTParameterList = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTParameterList();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		mMethodSignatureToTMethodSignature.setSource(mSignature);
		mMethodSignatureToTMethodSignature.setTarget(tSignature);
		isApplicableMatch.getCreateCorr().add(mMethodSignatureToTMethodSignature);
		mSignatureToTParameterList.setSource(mSignature);
		mSignatureToTParameterList.setTarget(tParameterList);
		isApplicableMatch.getCreateCorr().add(mSignatureToTParameterList);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		isApplicableMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, tParameterList,
				mSignatureToTParameterList, mSignatureToTSignature, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_27_1_matchtggpattern_black_nac_0BB(MMethodSignature mSignature,
			MMethodName mName) {
		for (MName __DEC_mSignature_mSignatures_34451 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MName.class, "mSignatures")) {
			if (!mName.equals(__DEC_mSignature_mSignatures_34451)) {
				return new Object[] { mSignature, mName };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_27_1_matchtggpattern_blackBB(MMethodSignature mSignature,
			MMethodName mName) {
		if (mName.equals(mSignature.getMMethodName())) {
			if (mName.getMSignatures().contains(mSignature)) {
				if (pattern_MethodSignature_27_1_matchtggpattern_black_nac_0BB(mSignature, mName) == null) {
					return new Object[] { mSignature, mName };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_blackBBB(TMethodSignature tSignature,
			TParameterList tParameterList, TMethod tName) {
		if (tParameterList.equals(tSignature.getParamList())) {
			if (tName.equals(tSignature.getMethod())) {
				return new Object[] { tSignature, tParameterList, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mNameToTNameList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
				if (tmpMNameToTName instanceof MMethodNameToTMethod) {
					MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
					MMethodName mName = mNameToTName.getSource();
					if (mName != null) {
						TMethod tName = mNameToTName.getTarget();
						if (tName != null) {
							if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mNameToTName) == null) {
								if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mName) == null) {
									if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tName) == null) {
										_result.add(new Object[] { mNameToTNameList, mName, mNameToTName, tName,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mName, mNameToTName, tName,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mName, mNameToTName, tName, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodName mName, MMethodNameToTMethod mNameToTName, TMethod tName,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignature_29_3_solveCSP_binding = pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mName, mNameToTName, tName, ruleResult);
		if (result_pattern_MethodSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_29_3_solveCSP_black = pattern_MethodSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mName, mNameToTName, tName, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_29_4_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_5_checknacs_blackBBB(MMethodName mName,
			MMethodNameToTMethod mNameToTName, TMethod tName) {
		return new Object[] { mName, mNameToTName, tName };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_blackBBBB(MMethodName mName,
			MMethodNameToTMethod mNameToTName, TMethod tName, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mName, mNameToTName, tName, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_greenFFFBFFBFBB(MMethodName mName, TMethod tName,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MMethodSignature mSignature = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMMethodSignature();
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MMethodSignatureToTMethodSignature mMethodSignatureToTMethodSignature = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTMethodSignature();
		TParameterList tParameterList = BasicFactory.eINSTANCE.createTParameterList();
		MMethodSignatureToTParameterList mSignatureToTParameterList = ModiscoFactory.eINSTANCE
				.createMMethodSignatureToTParameterList();
		MSignatureToTSignature mSignatureToTSignature = ModiscoFactory.eINSTANCE.createMSignatureToTSignature();
		Object _localVariable_0 = csp.getValue("tSignature", "ID");
		Object _localVariable_1 = csp.getValue("tParameterList", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		mSignature.setMMethodName(mName);
		mName.getMSignatures().add(mSignature);
		ruleResult.getSourceObjects().add(mSignature);
		tSignature.setMethod(tName);
		ruleResult.getTargetObjects().add(tSignature);
		mMethodSignatureToTMethodSignature.setSource(mSignature);
		mMethodSignatureToTMethodSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mMethodSignatureToTMethodSignature);
		tSignature.setParamList(tParameterList);
		ruleResult.getTargetObjects().add(tParameterList);
		mSignatureToTParameterList.setSource(mSignature);
		mSignatureToTParameterList.setTarget(tParameterList);
		ruleResult.getCorrObjects().add(mSignatureToTParameterList);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		int tSignature_ID_prime = (int) _localVariable_0;
		int tParameterList_ID_prime = (int) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tSignature.setID(Integer.valueOf(tSignature_ID_prime));
		tParameterList.setID(Integer.valueOf(tParameterList_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSignature, tSignature, mMethodSignatureToTMethodSignature, mName, tParameterList,
				mSignatureToTParameterList, tName, mSignatureToTSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureImpl
