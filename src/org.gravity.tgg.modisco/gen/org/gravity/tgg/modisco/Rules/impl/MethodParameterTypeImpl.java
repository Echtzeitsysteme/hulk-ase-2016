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

import org.eclipse.gmt.modisco.java.Type;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;

import org.gravity.tgg.modisco.MEntryToTParameter;
import org.gravity.tgg.modisco.MMethodSignatureToTParameterList;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.MethodParameterType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TParameter;
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
 * An implementation of the model object '<em><b>Method Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterTypeImpl extends AbstractRuleImpl implements MethodParameterType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		// initial bindings
		Object[] result1_black = MethodParameterTypeImpl.pattern_MethodParameterType_0_1_initialbindings_blackBBBBB(
				this, match, mMethodSignature, mEntry, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mMethodSignature] = "
					+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mMethodSignature, mEntry,
						mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
					+ "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterTypeImpl.pattern_MethodParameterType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterTypeImpl
					.pattern_MethodParameterType_0_4_collectelementstobetranslated_blackBBBB(match, mMethodSignature,
							mEntry, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature
						+ ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
			}
			MethodParameterTypeImpl.pattern_MethodParameterType_0_4_collectelementstobetranslated_greenBBBBFF(match,
					mMethodSignature, mEntry, mType);
			// EMoflonEdge mEntry__mType____type = (EMoflonEdge) result4_green[4];
			// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = MethodParameterTypeImpl
					.pattern_MethodParameterType_0_5_collectcontextelements_blackBBBB(match, mMethodSignature, mEntry,
							mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mMethodSignature] = " + mMethodSignature
						+ ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
			}
			MethodParameterTypeImpl.pattern_MethodParameterType_0_5_collectcontextelements_greenBBB(match,
					mMethodSignature, mType);

			// register objects to match
			MethodParameterTypeImpl.pattern_MethodParameterType_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mMethodSignature, mEntry, mType);
			return MethodParameterTypeImpl.pattern_MethodParameterType_0_7_expressionF();
		} else {
			return MethodParameterTypeImpl.pattern_MethodParameterType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		MMethodSignature mMethodSignature = (MMethodSignature) result1_bindingAndBlack[3];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[4];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_1_1_performtransformation_greenBBFFB(tAbstractType, mEntry,
						tParameterList);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[2];
		TParameter tParameter = (TParameter) result1_green[3];

		// collect translated elements
		Object[] result2_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_1_2_collecttranslatedelements_blackBBB(mEntry, mEntryToTParameter,
						tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_1_2_collecttranslatedelements_greenFBBB(mEntry, mEntryToTParameter,
						tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry,
						mEntryToTParameter, tParameter, tParameterList, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mMethodSignatureToTParameterList] = "
					+ mMethodSignatureToTParameterList + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[mMethodSignature] = "
					+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ", " + "[tParameterList] = "
					+ tParameterList + ", " + "[mType] = " + mType + ".");
		}
		MethodParameterTypeImpl.pattern_MethodParameterType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFF(ruleresult,
				tAbstractType, mMethodSignature, mEntry, mEntryToTParameter, tParameter, tParameterList, mType);
		// EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterTypeImpl.pattern_MethodParameterType_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry,
				mEntryToTParameter, tParameter, tParameterList, mType);
		return MethodParameterTypeImpl.pattern_MethodParameterType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterTypeImpl.pattern_MethodParameterType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mMethodSignature = (MMethodSignature) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		for (Object[] result2_black : MethodParameterTypeImpl
				.pattern_MethodParameterType_2_2_corematch_blackFFFBBFBB(mMethodSignature, mEntry, mType, match)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[2];
			TParameterList tParameterList = (TParameterList) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : MethodParameterTypeImpl
					.pattern_MethodParameterType_2_3_findcontext_blackBBBBBBB(mMethodSignatureToTParameterList,
							tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType)) {
				Object[] result3_green = MethodParameterTypeImpl
						.pattern_MethodParameterType_2_3_findcontext_greenBBBBBBBFFFFFFF(
								mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
								mEntry, tParameterList, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterTypeImpl
						.pattern_MethodParameterType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
								mEntry, tParameterList, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
							+ mTypeToTAbstractType + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameterList] = " + tParameterList + ", "
							+ "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterTypeImpl.pattern_MethodParameterType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterTypeImpl
							.pattern_MethodParameterType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterTypeImpl.pattern_MethodParameterType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		match.registerObject("mMethodSignature", mMethodSignature);
		match.registerObject("mEntry", mEntry);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameterList tParameterList, Type mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		ruleresult.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("mMethodSignature", mMethodSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mEntry").eClass()).equals("modisco.MEntry.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {
		// initial bindings
		Object[] result1_black = MethodParameterTypeImpl.pattern_MethodParameterType_10_1_initialbindings_blackBBBBB(
				this, match, tAbstractType, tParameter, tParameterList);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[tParameter] = " + tParameter + ", " + "[tParameterList] = " + tParameterList + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAbstractType, tParameter,
						tParameterList);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[tParameter] = " + tParameter + ", " + "[tParameterList] = " + tParameterList + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (MethodParameterTypeImpl.pattern_MethodParameterType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = MethodParameterTypeImpl
					.pattern_MethodParameterType_10_4_collectelementstobetranslated_blackBBBB(match, tAbstractType,
							tParameter, tParameterList);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ", " + "[tParameterList] = " + tParameterList + ".");
			}
			MethodParameterTypeImpl.pattern_MethodParameterType_10_4_collectelementstobetranslated_greenBBBBFF(match,
					tAbstractType, tParameter, tParameterList);
			// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = MethodParameterTypeImpl
					.pattern_MethodParameterType_10_5_collectcontextelements_blackBBBB(match, tAbstractType, tParameter,
							tParameterList);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ", " + "[tParameterList] = " + tParameterList + ".");
			}
			MethodParameterTypeImpl.pattern_MethodParameterType_10_5_collectcontextelements_greenBBB(match,
					tAbstractType, tParameterList);

			// register objects to match
			MethodParameterTypeImpl.pattern_MethodParameterType_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tAbstractType, tParameter, tParameterList);
			return MethodParameterTypeImpl.pattern_MethodParameterType_10_7_expressionF();
		} else {
			return MethodParameterTypeImpl.pattern_MethodParameterType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		MMethodSignature mMethodSignature = (MMethodSignature) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		TParameterList tParameterList = (TParameterList) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_11_1_performtransformation_greenBFFBB(mMethodSignature, tParameter, mType);
		MEntry mEntry = (MEntry) result1_green[1];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[2];

		// collect translated elements
		Object[] result2_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_11_2_collecttranslatedelements_blackBBB(mEntry, mEntryToTParameter,
						tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_11_2_collecttranslatedelements_greenFBBB(mEntry, mEntryToTParameter,
						tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry,
						mEntryToTParameter, tParameter, tParameterList, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mMethodSignatureToTParameterList] = "
					+ mMethodSignatureToTParameterList + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[mMethodSignature] = "
					+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ", " + "[tParameterList] = "
					+ tParameterList + ", " + "[mType] = " + mType + ".");
		}
		MethodParameterTypeImpl.pattern_MethodParameterType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFF(ruleresult,
				tAbstractType, mMethodSignature, mEntry, mEntryToTParameter, tParameter, tParameterList, mType);
		// EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[8];
		// EMoflonEdge mMethodSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
		// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[12];
		// EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		MethodParameterTypeImpl.pattern_MethodParameterType_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry,
				mEntryToTParameter, tParameter, tParameterList, mType);
		return MethodParameterTypeImpl.pattern_MethodParameterType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterTypeImpl
				.pattern_MethodParameterType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = MethodParameterTypeImpl
				.pattern_MethodParameterType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		TParameterList tParameterList = (TParameterList) result2_binding[2];
		for (Object[] result2_black : MethodParameterTypeImpl.pattern_MethodParameterType_12_2_corematch_blackFBFFBBFB(
				tAbstractType, tParameter, tParameterList, match)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[2];
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[3];
			Type mType = (Type) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : MethodParameterTypeImpl
					.pattern_MethodParameterType_12_3_findcontext_blackBBBBBBB(mMethodSignatureToTParameterList,
							tAbstractType, mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType)) {
				Object[] result3_green = MethodParameterTypeImpl
						.pattern_MethodParameterType_12_3_findcontext_greenBBBBBBBFFFFFFF(
								mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
								tParameter, tParameterList, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge tParameterList__tParameter____entries = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = MethodParameterTypeImpl
						.pattern_MethodParameterType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
								tParameter, tParameterList, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
							+ mTypeToTAbstractType + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
							+ "[tParameter] = " + tParameter + ", " + "[tParameterList] = " + tParameterList + ", "
							+ "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (MethodParameterTypeImpl.pattern_MethodParameterType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = MethodParameterTypeImpl
							.pattern_MethodParameterType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					MethodParameterTypeImpl.pattern_MethodParameterType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tParameter", tParameter);
		match.registerObject("tParameterList", tParameterList);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameter tParameter,
			TParameterList tParameterList, Type mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		ruleresult.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("mMethodSignature", mMethodSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("tParameterList", tParameterList);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tParameter").eClass())
				.equals("basic.TParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterTypeImpl.pattern_MethodParameterType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterTypeImpl
				.pattern_MethodParameterType_20_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Type mType = (Type) result2_black[2];
			Object[] result2_green = MethodParameterTypeImpl
					.pattern_MethodParameterType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterTypeImpl
					.pattern_MethodParameterType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mMethodSignature, mEntry, mType)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterTypeImpl
						.pattern_MethodParameterType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterTypeImpl
							.pattern_MethodParameterType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterTypeImpl.pattern_MethodParameterType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(EMoflonEdge _edge_entries) {
		// prepare return value
		Object[] result1_bindingAndBlack = MethodParameterTypeImpl
				.pattern_MethodParameterType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterTypeImpl.pattern_MethodParameterType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : MethodParameterTypeImpl
				.pattern_MethodParameterType_21_2_testcorematchandDECs_blackFFFB(_edge_entries)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			TParameterList tParameterList = (TParameterList) result2_black[2];
			Object[] result2_green = MethodParameterTypeImpl
					.pattern_MethodParameterType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (MethodParameterTypeImpl
					.pattern_MethodParameterType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tAbstractType, tParameter, tParameterList)) {
				// Ensure that the correct types of elements are matched
				if (MethodParameterTypeImpl
						.pattern_MethodParameterType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = MethodParameterTypeImpl
							.pattern_MethodParameterType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					MethodParameterTypeImpl.pattern_MethodParameterType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterType");
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
		ruleResult.setRule("MethodParameterType");
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
		Object[] result1_black = MethodParameterTypeImpl.pattern_MethodParameterType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterTypeImpl.pattern_MethodParameterType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = MethodParameterTypeImpl
				.pattern_MethodParameterType_24_2_matchcontext_bindingFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		MMethodSignature mMethodSignature = (MMethodSignature) result2_binding[1];
		MEntry mEntry = (MEntry) result2_binding[2];
		TParameter tParameter = (TParameter) result2_binding[3];
		TParameterList tParameterList = (TParameterList) result2_binding[4];
		Type mType = (Type) result2_binding[5];
		for (Object[] result2_black : MethodParameterTypeImpl
				.pattern_MethodParameterType_24_2_matchcontext_blackFBFBBBBBBB(tAbstractType, mMethodSignature, mEntry,
						tParameter, tParameterList, mType, sourceMatch, targetMatch)) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[0];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[2];
			Object[] result2_green = MethodParameterTypeImpl
					.pattern_MethodParameterType_24_2_matchcontext_greenBBBBBBBBBFB(mMethodSignatureToTParameterList,
							tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry, tParameter, tParameterList,
							mType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = MethodParameterTypeImpl
					.pattern_MethodParameterType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
							mEntry, tParameter, tParameterList, mType, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = MethodParameterTypeImpl
						.pattern_MethodParameterType_24_4_createcorrespondence_blackBBBBBBB(tAbstractType,
								mMethodSignature, mEntry, tParameter, tParameterList, mType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tAbstractType] = " + tAbstractType + ", " + "[mMethodSignature] = "
							+ mMethodSignature + ", " + "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter
							+ ", " + "[tParameterList] = " + tParameterList + ", " + "[mType] = " + mType + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodParameterTypeImpl.pattern_MethodParameterType_24_4_createcorrespondence_greenBFBB(mEntry,
						tParameter, isApplicableMatch);
				// MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result4_green[1];

				// add to returned result
				Object[] result5_black = MethodParameterTypeImpl
						.pattern_MethodParameterType_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				MethodParameterTypeImpl.pattern_MethodParameterType_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameter tParameter, TParameterList tParameterList, Type mType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mType", mType);
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
	public boolean checkDEC_FWD(MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {// match tgg pattern
		Object[] result1_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_27_1_matchtggpattern_blackBBB(mMethodSignature, mEntry, mType);
		if (result1_black != null) {
			return MethodParameterTypeImpl.pattern_MethodParameterType_27_2_expressionF();
		} else {
			return MethodParameterTypeImpl.pattern_MethodParameterType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {// match tgg pattern
		Object[] result1_black = MethodParameterTypeImpl
				.pattern_MethodParameterType_28_1_matchtggpattern_blackBBB(tAbstractType, tParameter, tParameterList);
		if (result1_black != null) {
			return MethodParameterTypeImpl.pattern_MethodParameterType_28_2_expressionF();
		} else {
			return MethodParameterTypeImpl.pattern_MethodParameterType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterListParameter,
			TypeToTAbstractType mTypeToTAbstractTypeParameter) {
		// create result
		Object[] result1_black = MethodParameterTypeImpl.pattern_MethodParameterType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterTypeImpl.pattern_MethodParameterType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : MethodParameterTypeImpl
				.pattern_MethodParameterType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mMethodSignatureToTParameterListList = (RuleEntryList) result2_black[0];
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result2_black[1];
			MMethodSignature mMethodSignature = (MMethodSignature) result2_black[2];
			TParameterList tParameterList = (TParameterList) result2_black[3];
			// RuleEntryList mTypeToTAbstractTypeList = (RuleEntryList) result2_black[4];
			TAbstractType tAbstractType = (TAbstractType) result2_black[5];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[6];
			Type mType = (Type) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = MethodParameterTypeImpl
					.pattern_MethodParameterType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
							tParameterList, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
						+ mTypeToTAbstractType + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
						+ "[tParameterList] = " + tParameterList + ", " + "[mType] = " + mType + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (MethodParameterTypeImpl.pattern_MethodParameterType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = MethodParameterTypeImpl.pattern_MethodParameterType_29_5_checknacs_blackBBBBBB(
						mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
						tParameterList, mType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = MethodParameterTypeImpl
							.pattern_MethodParameterType_29_6_perform_blackBBBBBBB(mMethodSignatureToTParameterList,
									tAbstractType, mTypeToTAbstractType, mMethodSignature, tParameterList, mType,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mMethodSignatureToTParameterList] = " + mMethodSignatureToTParameterList + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
								+ mTypeToTAbstractType + ", " + "[mMethodSignature] = " + mMethodSignature + ", "
								+ "[tParameterList] = " + tParameterList + ", " + "[mType] = " + mType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterTypeImpl.pattern_MethodParameterType_29_6_perform_greenBBFFFBBB(tAbstractType,
							mMethodSignature, tParameterList, mType, ruleResult);
					// MEntry mEntry = (MEntry) result6_green[2];
					// MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[3];
					// TParameter tParameter = (TParameter) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MethodParameterTypeImpl.pattern_MethodParameterType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameterList tParameterList,
			Type mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethodSignatureToTParameterList", mMethodSignatureToTParameterList);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mMethodSignature", mMethodSignature);
		isApplicableMatch.registerObject("tParameterList", tParameterList);
		isApplicableMatch.registerObject("mType", mType);
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
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MMETHODSIGNATURE_MENTRY_TPARAMETERLIST_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TAbstractType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (MMethodSignature) arguments.get(4),
					(MEntry) arguments.get(5), (TParameterList) arguments.get(6), (Type) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TParameterList) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TPARAMETERLIST:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TParameterList) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TPARAMETERLIST:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TParameterList) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MMETHODSIGNATURE_TPARAMETER_TPARAMETERLIST_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TAbstractType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (MMethodSignature) arguments.get(4),
					(TParameter) arguments.get(5), (TParameterList) arguments.get(6), (Type) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MMETHODSIGNATURE_MENTRY_TPARAMETER_TPARAMETERLIST_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TAbstractType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (MMethodSignature) arguments.get(4),
					(MEntry) arguments.get(5), (TParameter) arguments.get(6), (TParameterList) arguments.get(7),
					(Type) arguments.get(8), (Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.METHOD_PARAMETER_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_DEC_FWD__MMETHODSIGNATURE_MENTRY_TYPE:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_TYPE___CHECK_DEC_BWD__TABSTRACTTYPE_TPARAMETER_TPARAMETERLIST:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TParameter) arguments.get(1),
					(TParameterList) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODSIGNATURETOTPARAMETERLIST_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TypeToTAbstractType) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURETOTPARAMETERLIST_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MMETHODSIGNATURE_TPARAMETERLIST_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodSignatureToTParameterList) arguments.get(1), (TAbstractType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (MMethodSignature) arguments.get(4),
					(TParameterList) arguments.get(5), (Type) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterType_0_1_initialbindings_blackBBBBB(MethodParameterType _this,
			Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		return new Object[] { _this, match, mMethodSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameterType_0_2_SolveCSP_bindingFBBBBB(MethodParameterType _this,
			Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMethodSignature, mEntry, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMethodSignature, mEntry, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodParameterType _this, Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		Object[] result_pattern_MethodParameterType_0_2_SolveCSP_binding = pattern_MethodParameterType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mMethodSignature, mEntry, mType);
		if (result_pattern_MethodParameterType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterType_0_2_SolveCSP_black = pattern_MethodParameterType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMethodSignature, mEntry, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_0_3_CheckCSP_expressionFBB(MethodParameterType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		return new Object[] { match, mMethodSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameterType_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mEntry);
		String mEntry__mType____type_name_prime = "type";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mEntry__mType____type);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		return new Object[] { match, mMethodSignature, mEntry, mType, mEntry__mType____type,
				mMethodSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameterType_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		return new Object[] { match, mMethodSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameterType_0_5_collectcontextelements_greenBBB(Match match,
			MMethodSignature mMethodSignature, Type mType) {
		match.getContextNodes().add(mMethodSignature);
		match.getContextNodes().add(mType);
		return new Object[] { match, mMethodSignature, mType };
	}

	public static final void pattern_MethodParameterType_0_6_registerobjectstomatch_expressionBBBBB(
			MethodParameterType _this, Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mMethodSignature, mEntry, mType);

	}

	public static final boolean pattern_MethodParameterType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethodSignatureToTParameterList");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject tmpMMethodSignatureToTParameterList = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpMTypeToTAbstractType = _localVariable_2;
		EObject tmpMMethodSignature = _localVariable_3;
		EObject tmpMEntry = _localVariable_4;
		EObject tmpTParameterList = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
					if (tmpMMethodSignature instanceof MMethodSignature) {
						MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
						if (tmpMEntry instanceof MEntry) {
							MEntry mEntry = (MEntry) tmpMEntry;
							if (tmpTParameterList instanceof TParameterList) {
								TParameterList tParameterList = (TParameterList) tmpTParameterList;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									return new Object[] { mMethodSignatureToTParameterList, tAbstractType,
											mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_1_1_performtransformation_blackBBBBBBBFBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameterList tParameterList, Type mType, MethodParameterType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
						mMethodSignature, mEntry, tParameterList, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameterType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterType_1_1_performtransformation_binding = pattern_MethodParameterType_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterType_1_1_performtransformation_binding != null) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result_pattern_MethodParameterType_1_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterType_1_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterType_1_1_performtransformation_binding[2];
			MMethodSignature mMethodSignature = (MMethodSignature) result_pattern_MethodParameterType_1_1_performtransformation_binding[3];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterType_1_1_performtransformation_binding[4];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameterType_1_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodParameterType_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameterType_1_1_performtransformation_black = pattern_MethodParameterType_1_1_performtransformation_blackBBBBBBBFBB(
					mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry,
					tParameterList, mType, _this, isApplicableMatch);
			if (result_pattern_MethodParameterType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterType_1_1_performtransformation_black[7];

				return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
						mMethodSignature, mEntry, tParameterList, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_1_1_performtransformation_greenBBFFB(
			TAbstractType tAbstractType, MEntry mEntry, TParameterList tParameterList) {
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		tParameterList.getEntries().add(tParameter);
		tParameter.setType(tAbstractType);
		return new Object[] { tAbstractType, mEntry, mEntryToTParameter, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterType_1_2_collecttranslatedelements_blackBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameterType_1_2_collecttranslatedelements_greenFBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameterType_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tAbstractType,
			EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter,
			EObject tParameter, EObject tParameterList, EObject mType) {
		if (!mMethodSignatureToTParameterList.equals(tAbstractType)) {
			if (!mMethodSignatureToTParameterList.equals(mTypeToTAbstractType)) {
				if (!mMethodSignatureToTParameterList.equals(tParameter)) {
					if (!mMethodSignatureToTParameterList.equals(tParameterList)) {
						if (!mMethodSignatureToTParameterList.equals(mType)) {
							if (!tAbstractType.equals(tParameter)) {
								if (!tAbstractType.equals(tParameterList)) {
									if (!mTypeToTAbstractType.equals(tAbstractType)) {
										if (!mTypeToTAbstractType.equals(tParameter)) {
											if (!mTypeToTAbstractType.equals(tParameterList)) {
												if (!mMethodSignature.equals(mMethodSignatureToTParameterList)) {
													if (!mMethodSignature.equals(tAbstractType)) {
														if (!mMethodSignature.equals(mTypeToTAbstractType)) {
															if (!mMethodSignature.equals(tParameter)) {
																if (!mMethodSignature.equals(tParameterList)) {
																	if (!mMethodSignature.equals(mType)) {
																		if (!mEntry.equals(
																				mMethodSignatureToTParameterList)) {
																			if (!mEntry.equals(tAbstractType)) {
																				if (!mEntry
																						.equals(mTypeToTAbstractType)) {
																					if (!mEntry
																							.equals(mMethodSignature)) {
																						if (!mEntry.equals(
																								mEntryToTParameter)) {
																							if (!mEntry.equals(
																									tParameter)) {
																								if (!mEntry.equals(
																										tParameterList)) {
																									if (!mEntry.equals(
																											mType)) {
																										if (!mEntryToTParameter
																												.equals(mMethodSignatureToTParameterList)) {
																											if (!mEntryToTParameter
																													.equals(tAbstractType)) {
																												if (!mEntryToTParameter
																														.equals(mTypeToTAbstractType)) {
																													if (!mEntryToTParameter
																															.equals(mMethodSignature)) {
																														if (!mEntryToTParameter
																																.equals(tParameter)) {
																															if (!mEntryToTParameter
																																	.equals(tParameterList)) {
																																if (!mEntryToTParameter
																																		.equals(mType)) {
																																	if (!tParameter
																																			.equals(tParameterList)) {
																																		if (!mType
																																				.equals(tAbstractType)) {
																																			if (!mType
																																					.equals(mTypeToTAbstractType)) {
																																				if (!mType
																																						.equals(tParameter)) {
																																					if (!mType
																																							.equals(tParameterList)) {
																																						return new Object[] {
																																								ruleresult,
																																								mMethodSignatureToTParameterList,
																																								tAbstractType,
																																								mTypeToTAbstractType,
																																								mMethodSignature,
																																								mEntry,
																																								mEntryToTParameter,
																																								tParameter,
																																								tParameterList,
																																								mType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject tAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterType";
		String mEntry__mType____type_name_prime = "type";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String tParameter__tAbstractType____type_name_prime = "type";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mEntry__mType____type);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tParameterList__tParameter____entries);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tParameter__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, tAbstractType, mMethodSignature, mEntry, mEntryToTParameter, tParameter,
				tParameterList, mType, mEntry__mType____type, mMethodSignature__mEntry____mEntrys,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target,
				tParameterList__tParameter____entries, tParameter__tAbstractType____type };
	}

	public static final void pattern_MethodParameterType_1_5_registerobjects_expressionBBBBBBBBBBB(
			MethodParameterType _this, PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, mEntry, mEntryToTParameter, tParameter, tParameterList, mType);

	}

	public static final PerformRuleResult pattern_MethodParameterType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_2_1_preparereturnvalue_bindingFB(
			MethodParameterType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterType _this) {
		Object[] result_pattern_MethodParameterType_2_1_preparereturnvalue_binding = pattern_MethodParameterType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterType_2_1_preparereturnvalue_black = pattern_MethodParameterType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameterType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMethodSignature");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMMethodSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMMethodSignature instanceof MMethodSignature) {
			MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					return new Object[] { mMethodSignature, mEntry, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_2_2_corematch_blackFFFBBFBB(
			MMethodSignature mMethodSignature, MEntry mEntry, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMethodSignature, MMethodSignatureToTParameterList.class, "source")) {
			TParameterList tParameterList = mMethodSignatureToTParameterList.getTarget();
			if (tParameterList != null) {
				for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tAbstractType = mTypeToTAbstractType.getTarget();
					if (tAbstractType != null) {
						_result.add(new Object[] { mMethodSignatureToTParameterList, tAbstractType,
								mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_2_3_findcontext_blackBBBBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameterList tParameterList, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mEntry.getType())) {
			if (mMethodSignature.getMEntrys().contains(mEntry)) {
				if (tParameterList.equals(mMethodSignatureToTParameterList.getTarget())) {
					if (mMethodSignature.equals(mMethodSignatureToTParameterList.getSource())) {
						if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
							if (mType.equals(mTypeToTAbstractType.getSource())) {
								_result.add(new Object[] { mMethodSignatureToTParameterList, tAbstractType,
										mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_2_3_findcontext_greenBBBBBBBFFFFFFF(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameterList tParameterList, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEntry__mType____type_name_prime = "type";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mMethodSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String mMethodSignatureToTParameterList__mMethodSignature____source_name_prime = "source";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(mType);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mEntry__mType____type);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mMethodSignature__mEntry____mEntrys);
		mMethodSignatureToTParameterList__tParameterList____target.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__tParameterList____target);
		mMethodSignatureToTParameterList__mMethodSignature____source.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__mMethodSignature____source.setTrg(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__mMethodSignature____source);
		mTypeToTAbstractType__tAbstractType____target.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__tAbstractType____target);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		mMethodSignatureToTParameterList__tParameterList____target
				.setName(mMethodSignatureToTParameterList__tParameterList____target_name_prime);
		mMethodSignatureToTParameterList__mMethodSignature____source
				.setName(mMethodSignatureToTParameterList__mMethodSignature____source_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
				mEntry, tParameterList, mType, isApplicableMatch, mEntry__mType____type,
				mMethodSignature__mEntry____mEntrys, mMethodSignatureToTParameterList__tParameterList____target,
				mMethodSignatureToTParameterList__mMethodSignature____source,
				mTypeToTAbstractType__tAbstractType____target, mTypeToTAbstractType__mType____source };
	}

	public static final Object[] pattern_MethodParameterType_2_4_solveCSP_bindingFBBBBBBBBB(MethodParameterType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature,
			MEntry mEntry, TParameterList tParameterList, Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
					mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterType _this, IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameterList tParameterList, Type mType) {
		Object[] result_pattern_MethodParameterType_2_4_solveCSP_binding = pattern_MethodParameterType_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, mEntry, tParameterList, mType);
		if (result_pattern_MethodParameterType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterType_2_4_solveCSP_black = pattern_MethodParameterType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
						mTypeToTAbstractType, mMethodSignature, mEntry, tParameterList, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_2_5_checkCSP_expressionFBB(MethodParameterType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_10_1_initialbindings_blackBBBBB(MethodParameterType _this,
			Match match, TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { _this, match, tAbstractType, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterType_10_2_SolveCSP_bindingFBBBBB(MethodParameterType _this,
			Match match, TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, tParameter, tParameterList);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, tParameter, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodParameterType _this, Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {
		Object[] result_pattern_MethodParameterType_10_2_SolveCSP_binding = pattern_MethodParameterType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAbstractType, tParameter, tParameterList);
		if (result_pattern_MethodParameterType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterType_10_2_SolveCSP_black = pattern_MethodParameterType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_10_3_CheckCSP_expressionFBB(MethodParameterType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tAbstractType, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterType_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameter);
		String tParameterList__tParameter____entries_name_prime = "entries";
		String tParameter__tAbstractType____type_name_prime = "type";
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tParameterList__tParameter____entries);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tParameter__tAbstractType____type);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { match, tAbstractType, tParameter, tParameterList, tParameterList__tParameter____entries,
				tParameter__tAbstractType____type };
	}

	public static final Object[] pattern_MethodParameterType_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList) {
		return new Object[] { match, tAbstractType, tParameter, tParameterList };
	}

	public static final Object[] pattern_MethodParameterType_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TParameterList tParameterList) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tParameterList);
		return new Object[] { match, tAbstractType, tParameterList };
	}

	public static final void pattern_MethodParameterType_10_6_registerobjectstomatch_expressionBBBBB(
			MethodParameterType _this, Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, tParameter, tParameterList);

	}

	public static final boolean pattern_MethodParameterType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethodSignatureToTParameterList");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParameterList");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject tmpMMethodSignatureToTParameterList = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpMTypeToTAbstractType = _localVariable_2;
		EObject tmpMMethodSignature = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpTParameterList = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
					if (tmpMMethodSignature instanceof MMethodSignature) {
						MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpTParameterList instanceof TParameterList) {
								TParameterList tParameterList = (TParameterList) tmpTParameterList;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									return new Object[] { mMethodSignatureToTParameterList, tAbstractType,
											mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_11_1_performtransformation_blackBBBBBBBFBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameter tParameter,
			TParameterList tParameterList, Type mType, MethodParameterType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
						mMethodSignature, tParameter, tParameterList, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameterType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterType_11_1_performtransformation_binding = pattern_MethodParameterType_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterType_11_1_performtransformation_binding != null) {
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) result_pattern_MethodParameterType_11_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterType_11_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterType_11_1_performtransformation_binding[2];
			MMethodSignature mMethodSignature = (MMethodSignature) result_pattern_MethodParameterType_11_1_performtransformation_binding[3];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterType_11_1_performtransformation_binding[4];
			TParameterList tParameterList = (TParameterList) result_pattern_MethodParameterType_11_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodParameterType_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameterType_11_1_performtransformation_black = pattern_MethodParameterType_11_1_performtransformation_blackBBBBBBBFBB(
					mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature, tParameter,
					tParameterList, mType, _this, isApplicableMatch);
			if (result_pattern_MethodParameterType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterType_11_1_performtransformation_black[7];

				return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
						mMethodSignature, tParameter, tParameterList, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_11_1_performtransformation_greenBFFBB(
			MMethodSignature mMethodSignature, TParameter tParameter, Type mType) {
		MEntry mEntry = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		mEntry.setType(mType);
		mMethodSignature.getMEntrys().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		return new Object[] { mMethodSignature, mEntry, mEntryToTParameter, tParameter, mType };
	}

	public static final Object[] pattern_MethodParameterType_11_2_collecttranslatedelements_blackBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameterType_11_2_collecttranslatedelements_greenFBBB(MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameterType_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList, EObject tAbstractType,
			EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry, EObject mEntryToTParameter,
			EObject tParameter, EObject tParameterList, EObject mType) {
		if (!mMethodSignatureToTParameterList.equals(tAbstractType)) {
			if (!mMethodSignatureToTParameterList.equals(mTypeToTAbstractType)) {
				if (!mMethodSignatureToTParameterList.equals(tParameter)) {
					if (!mMethodSignatureToTParameterList.equals(tParameterList)) {
						if (!mMethodSignatureToTParameterList.equals(mType)) {
							if (!tAbstractType.equals(tParameter)) {
								if (!tAbstractType.equals(tParameterList)) {
									if (!mTypeToTAbstractType.equals(tAbstractType)) {
										if (!mTypeToTAbstractType.equals(tParameter)) {
											if (!mTypeToTAbstractType.equals(tParameterList)) {
												if (!mMethodSignature.equals(mMethodSignatureToTParameterList)) {
													if (!mMethodSignature.equals(tAbstractType)) {
														if (!mMethodSignature.equals(mTypeToTAbstractType)) {
															if (!mMethodSignature.equals(tParameter)) {
																if (!mMethodSignature.equals(tParameterList)) {
																	if (!mMethodSignature.equals(mType)) {
																		if (!mEntry.equals(
																				mMethodSignatureToTParameterList)) {
																			if (!mEntry.equals(tAbstractType)) {
																				if (!mEntry
																						.equals(mTypeToTAbstractType)) {
																					if (!mEntry
																							.equals(mMethodSignature)) {
																						if (!mEntry.equals(
																								mEntryToTParameter)) {
																							if (!mEntry.equals(
																									tParameter)) {
																								if (!mEntry.equals(
																										tParameterList)) {
																									if (!mEntry.equals(
																											mType)) {
																										if (!mEntryToTParameter
																												.equals(mMethodSignatureToTParameterList)) {
																											if (!mEntryToTParameter
																													.equals(tAbstractType)) {
																												if (!mEntryToTParameter
																														.equals(mTypeToTAbstractType)) {
																													if (!mEntryToTParameter
																															.equals(mMethodSignature)) {
																														if (!mEntryToTParameter
																																.equals(tParameter)) {
																															if (!mEntryToTParameter
																																	.equals(tParameterList)) {
																																if (!mEntryToTParameter
																																		.equals(mType)) {
																																	if (!tParameter
																																			.equals(tParameterList)) {
																																		if (!mType
																																				.equals(tAbstractType)) {
																																			if (!mType
																																					.equals(mTypeToTAbstractType)) {
																																				if (!mType
																																						.equals(tParameter)) {
																																					if (!mType
																																							.equals(tParameterList)) {
																																						return new Object[] {
																																								ruleresult,
																																								mMethodSignatureToTParameterList,
																																								tAbstractType,
																																								mTypeToTAbstractType,
																																								mMethodSignature,
																																								mEntry,
																																								mEntryToTParameter,
																																								tParameter,
																																								tParameterList,
																																								mType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject tAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterType";
		String mEntry__mType____type_name_prime = "type";
		String mMethodSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String tParameter__tAbstractType____type_name_prime = "type";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mEntry__mType____type);
		mMethodSignature__mEntry____mEntrys.setSrc(mMethodSignature);
		mMethodSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mMethodSignature__mEntry____mEntrys);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tParameterList__tParameter____entries);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tParameter__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mMethodSignature__mEntry____mEntrys.setName(mMethodSignature__mEntry____mEntrys_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, tAbstractType, mMethodSignature, mEntry, mEntryToTParameter, tParameter,
				tParameterList, mType, mEntry__mType____type, mMethodSignature__mEntry____mEntrys,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target,
				tParameterList__tParameter____entries, tParameter__tAbstractType____type };
	}

	public static final void pattern_MethodParameterType_11_5_registerobjects_expressionBBBBBBBBBBB(
			MethodParameterType _this, PerformRuleResult ruleresult, EObject mMethodSignatureToTParameterList,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mMethodSignature, EObject mEntry,
			EObject mEntryToTParameter, EObject tParameter, EObject tParameterList, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, mEntry, mEntryToTParameter, tParameter, tParameterList, mType);

	}

	public static final PerformRuleResult pattern_MethodParameterType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_12_1_preparereturnvalue_bindingFB(
			MethodParameterType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterType _this) {
		Object[] result_pattern_MethodParameterType_12_1_preparereturnvalue_binding = pattern_MethodParameterType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterType_12_1_preparereturnvalue_black = pattern_MethodParameterType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "MethodParameterType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAbstractType");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject _localVariable_2 = match.getObject("tParameterList");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpTParameterList = _localVariable_2;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpTParameterList instanceof TParameterList) {
					TParameterList tParameterList = (TParameterList) tmpTParameterList;
					return new Object[] { tAbstractType, tParameter, tParameterList, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_12_2_corematch_blackFBFFBBFB(
			TAbstractType tAbstractType, TParameter tParameter, TParameterList tParameterList, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParameterList, MMethodSignatureToTParameterList.class, "target")) {
			MMethodSignature mMethodSignature = mMethodSignatureToTParameterList.getSource();
			if (mMethodSignature != null) {
				for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTAbstractType.getSource();
					if (mType != null) {
						_result.add(new Object[] { mMethodSignatureToTParameterList, tAbstractType,
								mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_12_3_findcontext_blackBBBBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameter tParameter,
			TParameterList tParameterList, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameterList.equals(mMethodSignatureToTParameterList.getTarget())) {
			if (mMethodSignature.equals(mMethodSignatureToTParameterList.getSource())) {
				if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
					if (tParameterList.getEntries().contains(tParameter)) {
						if (tAbstractType.equals(tParameter.getType())) {
							if (mType.equals(mTypeToTAbstractType.getSource())) {
								_result.add(new Object[] { mMethodSignatureToTParameterList, tAbstractType,
										mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_12_3_findcontext_greenBBBBBBBFFFFFFF(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameter tParameter,
			TParameterList tParameterList, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMethodSignatureToTParameterList__tParameterList____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMethodSignatureToTParameterList__mMethodSignature____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameterList__tParameter____entries = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethodSignatureToTParameterList__tParameterList____target_name_prime = "target";
		String mMethodSignatureToTParameterList__mMethodSignature____source_name_prime = "source";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String tParameterList__tParameter____entries_name_prime = "entries";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(mType);
		mMethodSignatureToTParameterList__tParameterList____target.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__tParameterList____target.setTrg(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__tParameterList____target);
		mMethodSignatureToTParameterList__mMethodSignature____source.setSrc(mMethodSignatureToTParameterList);
		mMethodSignatureToTParameterList__mMethodSignature____source.setTrg(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList__mMethodSignature____source);
		mTypeToTAbstractType__tAbstractType____target.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__tAbstractType____target);
		tParameterList__tParameter____entries.setSrc(tParameterList);
		tParameterList__tParameter____entries.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList__tParameter____entries);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter__tAbstractType____type);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mMethodSignatureToTParameterList__tParameterList____target
				.setName(mMethodSignatureToTParameterList__tParameterList____target_name_prime);
		mMethodSignatureToTParameterList__mMethodSignature____source
				.setName(mMethodSignatureToTParameterList__mMethodSignature____source_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		tParameterList__tParameter____entries.setName(tParameterList__tParameter____entries_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
				tParameter, tParameterList, mType, isApplicableMatch,
				mMethodSignatureToTParameterList__tParameterList____target,
				mMethodSignatureToTParameterList__mMethodSignature____source,
				mTypeToTAbstractType__tAbstractType____target, tParameterList__tParameter____entries,
				tParameter__tAbstractType____type, mTypeToTAbstractType__mType____source };
	}

	public static final Object[] pattern_MethodParameterType_12_4_solveCSP_bindingFBBBBBBBBB(MethodParameterType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature,
			TParameter tParameter, TParameterList tParameterList, Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tAbstractType, mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
					mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterType _this, IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameter tParameter,
			TParameterList tParameterList, Type mType) {
		Object[] result_pattern_MethodParameterType_12_4_solveCSP_binding = pattern_MethodParameterType_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, tParameter, tParameterList, mType);
		if (result_pattern_MethodParameterType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterType_12_4_solveCSP_black = pattern_MethodParameterType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
						mTypeToTAbstractType, mMethodSignature, tParameter, tParameterList, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_12_5_checkCSP_expressionFBB(MethodParameterType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_20_1_preparereturnvalue_bindingFB(
			MethodParameterType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterType _this) {
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

	public static final Object[] pattern_MethodParameterType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterType _this) {
		Object[] result_pattern_MethodParameterType_20_1_preparereturnvalue_binding = pattern_MethodParameterType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterType_20_1_preparereturnvalue_black = pattern_MethodParameterType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMEntry = _edge_type.getSrc();
		if (tmpMEntry instanceof MEntry) {
			MEntry mEntry = (MEntry) tmpMEntry;
			EObject tmpMType = _edge_type.getTrg();
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (mType.equals(mEntry.getType())) {
					for (MMethodSignature mMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mEntry, MMethodSignature.class, "mEntrys")) {
						_result.add(new Object[] { mMethodSignature, mEntry, mType, _edge_type });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameterType _this, Match match, MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMethodSignature, mEntry, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_21_1_preparereturnvalue_bindingFB(
			MethodParameterType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterType _this) {
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

	public static final Object[] pattern_MethodParameterType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterType _this) {
		Object[] result_pattern_MethodParameterType_21_1_preparereturnvalue_binding = pattern_MethodParameterType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterType_21_1_preparereturnvalue_black = pattern_MethodParameterType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_entries) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameterList = _edge_entries.getSrc();
		if (tmpTParameterList instanceof TParameterList) {
			TParameterList tParameterList = (TParameterList) tmpTParameterList;
			EObject tmpTParameter = _edge_entries.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameterList.getEntries().contains(tParameter)) {
					TAbstractType tAbstractType = tParameter.getType();
					if (tAbstractType != null) {
						_result.add(new Object[] { tAbstractType, tParameter, tParameterList, _edge_entries });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameterType _this, Match match, TAbstractType tAbstractType, TParameter tParameter,
			TParameterList tParameterList) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, tParameter, tParameterList);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_24_1_prepare_blackB(MethodParameterType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterType_24_2_matchcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_1 = sourceMatch.getObject("mMethodSignature");
		EObject _localVariable_2 = sourceMatch.getObject("mEntry");
		EObject _localVariable_3 = targetMatch.getObject("tParameter");
		EObject _localVariable_4 = targetMatch.getObject("tParameterList");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpMMethodSignature = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpTParameterList = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpMMethodSignature instanceof MMethodSignature) {
				MMethodSignature mMethodSignature = (MMethodSignature) tmpMMethodSignature;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpTParameterList instanceof TParameterList) {
							TParameterList tParameterList = (TParameterList) tmpTParameterList;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								return new Object[] { tAbstractType, mMethodSignature, mEntry, tParameter,
										tParameterList, mType, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_24_2_matchcontext_blackFBFBBBBBBB(
			TAbstractType tAbstractType, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			TParameterList tParameterList, Type mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (mType.equals(mEntry.getType())) {
				if (mMethodSignature.getMEntrys().contains(mEntry)) {
					if (tParameterList.getEntries().contains(tParameter)) {
						if (tAbstractType.equals(tParameter.getType())) {
							for (MMethodSignatureToTParameterList mMethodSignatureToTParameterList : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tParameterList, MMethodSignatureToTParameterList.class,
											"target")) {
								if (mMethodSignature.equals(mMethodSignatureToTParameterList.getSource())) {
									for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class,
													"target")) {
										if (mType.equals(mTypeToTAbstractType.getSource())) {
											_result.add(new Object[] { mMethodSignatureToTParameterList, tAbstractType,
													mTypeToTAbstractType, mMethodSignature, mEntry, tParameter,
													tParameterList, mType, sourceMatch, targetMatch });
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

	public static final Object[] pattern_MethodParameterType_24_2_matchcontext_greenBBBBBBBBBFB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameter tParameter, TParameterList tParameterList, Type mType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "MethodParameterType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mMethodSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(tParameterList);
		isApplicableMatch.getAllContextElements().add(mMethodSignatureToTParameterList);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
				mEntry, tParameter, tParameterList, mType, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_MethodParameterType_24_3_checkcsp_bindingFBBBBBBBBBBBB(
			MethodParameterType _this, CCMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameter tParameter, TParameterList tParameterList, Type mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mMethodSignatureToTParameterList,
				tAbstractType, mTypeToTAbstractType, mMethodSignature, mEntry, tParameter, tParameterList, mType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
					mTypeToTAbstractType, mMethodSignature, mEntry, tParameter, tParameterList, mType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBB(
			MethodParameterType _this, CCMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, MEntry mEntry,
			TParameter tParameter, TParameterList tParameterList, Type mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterType_24_3_checkcsp_binding = pattern_MethodParameterType_24_3_checkcsp_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, mEntry, tParameter, tParameterList, mType, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_24_3_checkcsp_binding[0];

			Object[] result_pattern_MethodParameterType_24_3_checkcsp_black = pattern_MethodParameterType_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_MethodParameterType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
						mTypeToTAbstractType, mMethodSignature, mEntry, tParameter, tParameterList, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_24_4_createcorrespondence_blackBBBBBBB(
			TAbstractType tAbstractType, MMethodSignature mMethodSignature, MEntry mEntry, TParameter tParameter,
			TParameterList tParameterList, Type mType, CCMatch isApplicableMatch) {
		return new Object[] { tAbstractType, mMethodSignature, mEntry, tParameter, tParameterList, mType,
				isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterType_24_4_createcorrespondence_greenBFBB(MEntry mEntry,
			TParameter tParameter, CCMatch isApplicableMatch) {
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		isApplicableMatch.getCreateCorr().add(mEntryToTParameter);
		return new Object[] { mEntry, mEntryToTParameter, tParameter, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterType_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterType_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterType_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_27_1_matchtggpattern_blackBBB(
			MMethodSignature mMethodSignature, MEntry mEntry, Type mType) {
		if (mType.equals(mEntry.getType())) {
			if (mMethodSignature.getMEntrys().contains(mEntry)) {
				return new Object[] { mMethodSignature, mEntry, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_28_1_matchtggpattern_blackBBB(TAbstractType tAbstractType,
			TParameter tParameter, TParameterList tParameterList) {
		if (tParameterList.getEntries().contains(tParameter)) {
			if (tAbstractType.equals(tParameter.getType())) {
				return new Object[] { tAbstractType, tParameter, tParameterList };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_29_1_createresult_blackB(MethodParameterType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignatureToTParameterList mMethodSignatureToTParameterList) {
		if (ruleResult.getCorrObjects().contains(mMethodSignatureToTParameterList)) {
			return new Object[] { ruleResult, mMethodSignatureToTParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mMethodSignature) {
		if (ruleResult.getSourceObjects().contains(mMethodSignature)) {
			return new Object[] { ruleResult, mMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TParameterList tParameterList) {
		if (ruleResult.getTargetObjects().contains(tParameterList)) {
			return new Object[] { ruleResult, tParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTAbstractType)) {
			return new Object[] { ruleResult, mTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMethodSignatureToTParameterListList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTAbstractTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mMethodSignatureToTParameterListList.equals(mTypeToTAbstractTypeList)) {
					for (EObject tmpMMethodSignatureToTParameterList : mMethodSignatureToTParameterListList
							.getEntryObjects()) {
						if (tmpMMethodSignatureToTParameterList instanceof MMethodSignatureToTParameterList) {
							MMethodSignatureToTParameterList mMethodSignatureToTParameterList = (MMethodSignatureToTParameterList) tmpMMethodSignatureToTParameterList;
							MMethodSignature mMethodSignature = mMethodSignatureToTParameterList.getSource();
							if (mMethodSignature != null) {
								TParameterList tParameterList = mMethodSignatureToTParameterList.getTarget();
								if (tParameterList != null) {
									if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mMethodSignatureToTParameterList) == null) {
										if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mMethodSignature) == null) {
											if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tParameterList) == null) {
												for (EObject tmpMTypeToTAbstractType : mTypeToTAbstractTypeList
														.getEntryObjects()) {
													if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
														TAbstractType tAbstractType = mTypeToTAbstractType.getTarget();
														if (tAbstractType != null) {
															Type mType = mTypeToTAbstractType.getSource();
															if (mType != null) {
																if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTAbstractType) == null) {
																	if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tAbstractType) == null) {
																		if (pattern_MethodParameterType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			_result.add(new Object[] {
																					mMethodSignatureToTParameterListList,
																					mMethodSignatureToTParameterList,
																					mMethodSignature, tParameterList,
																					mTypeToTAbstractTypeList,
																					tAbstractType, mTypeToTAbstractType,
																					mType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_29_3_solveCSP_bindingFBBBBBBBBB(MethodParameterType _this,
			IsApplicableMatch isApplicableMatch, MMethodSignatureToTParameterList mMethodSignatureToTParameterList,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature,
			TParameterList tParameterList, Type mType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMethodSignatureToTParameterList,
				tAbstractType, mTypeToTAbstractType, mMethodSignature, tParameterList, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
					mTypeToTAbstractType, mMethodSignature, tParameterList, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterType _this, IsApplicableMatch isApplicableMatch,
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameterList tParameterList,
			Type mType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterType_29_3_solveCSP_binding = pattern_MethodParameterType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType,
				mMethodSignature, tParameterList, mType, ruleResult);
		if (result_pattern_MethodParameterType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterType_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterType_29_3_solveCSP_black = pattern_MethodParameterType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethodSignatureToTParameterList, tAbstractType,
						mTypeToTAbstractType, mMethodSignature, tParameterList, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterType_29_4_checkCSP_expressionFBB(MethodParameterType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterType_29_5_checknacs_blackBBBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameterList tParameterList,
			Type mType) {
		return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
				tParameterList, mType };
	}

	public static final Object[] pattern_MethodParameterType_29_6_perform_blackBBBBBBB(
			MMethodSignatureToTParameterList mMethodSignatureToTParameterList, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MMethodSignature mMethodSignature, TParameterList tParameterList,
			Type mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMethodSignatureToTParameterList, tAbstractType, mTypeToTAbstractType, mMethodSignature,
				tParameterList, mType, ruleResult };
	}

	public static final Object[] pattern_MethodParameterType_29_6_perform_greenBBFFFBBB(TAbstractType tAbstractType,
			MMethodSignature mMethodSignature, TParameterList tParameterList, Type mType,
			ModelgeneratorRuleResult ruleResult) {
		MEntry mEntry = org.gravity.modisco.ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = ModiscoFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mEntry.setType(mType);
		mMethodSignature.getMEntrys().add(mEntry);
		ruleResult.getSourceObjects().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		mEntryToTParameter.setTarget(tParameter);
		tParameterList.getEntries().add(tParameter);
		tParameter.setType(tAbstractType);
		ruleResult.getTargetObjects().add(tParameter);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAbstractType, mMethodSignature, mEntry, mEntryToTParameter, tParameter, tParameterList,
				mType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterTypeImpl
