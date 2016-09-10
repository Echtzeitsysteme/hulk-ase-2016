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

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PackageToTPackage;

import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SubPackageToPGPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Sub Package To PG Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubPackageToPGPackageImpl extends AbstractRuleImpl implements SubPackageToPGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPackageToPGPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSubPackageToPGPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		// initial bindings
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(this, match, mPackage, mParentPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
					+ "[mParentPackage] = " + mParentPackage + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mParentPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
					+ "[mParentPackage] = " + mParentPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(match, mPackage,
							mParentPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
						+ "[mParentPackage] = " + mParentPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mPackage, mParentPackage);
			// EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(match, mPackage, mParentPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
						+ "[mParentPackage] = " + mParentPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(match,
					mParentPackage);

			// register objects to match
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mPackage, mParentPackage);
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_7_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[0];
		TPackage tParent = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[3];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_1_performtransformation_greenBBFFBB(mPackage, tParent, typeGraph, csp);
		TPackage tSub = (TPackage) result1_green[2];
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(mPackage, tSub, mPackageToTSub);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mPackage] = " + mPackage + ", " + "[tSub] = " + tSub + ", " + "[mPackageToTSub] = "
					+ mPackageToTSub + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(mPackage, tSub, mPackageToTSub);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mPackage, tParent,
						tSub, mParentPackage, mParentPackageToTParent, mPackageToTSub, typeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackage] = " + mPackage + ", " + "[tParent] = "
					+ tParent + ", " + "[tSub] = " + tSub + ", " + "[mParentPackage] = " + mParentPackage + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[mPackageToTSub] = "
					+ mPackageToTSub + ", " + "[typeGraph] = " + typeGraph + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				mPackage, tParent, tSub, mParentPackage, mPackageToTSub, typeGraph);
		// EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tParent__tSub____subpackage = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tSub__typeGraph____typeGraph = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mPackageToTSub__mPackage____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mPackageToTSub__tSub____target = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent, mPackageToTSub,
				typeGraph);
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[0];
		org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[1];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_2_corematch_blackBFBFB(mPackage, mParentPackage, match)) {
			TPackage tParent = (TPackage) result2_black[1];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_2_3_findcontext_blackBBBBF(mPackage, tParent, mParentPackage,
							mParentPackageToTParent)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[4];
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(mPackage, tParent,
								mParentPackage, mParentPackageToTParent, typeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tParent__typeGraph____typeGraph = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mParentPackageToTParent__tParent____target = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mPackage] = " + mPackage + ", " + "[tParent] = " + tParent + ", "
							+ "[mParentPackage] = " + mParentPackage + ", " + "[mParentPackageToTParent] = "
							+ mParentPackageToTParent + ", " + "[typeGraph] = " + typeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mParentPackage", mParentPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {// Create CSP
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
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");

		// Create unbound variables
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", csp);
		var_tSub_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub,
			EObject mParentPackage, EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("tSub", tSub);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mPackage").eClass()).equals("java.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		// initial bindings
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_1_initialbindings_blackBBBBB(this, match, tParent, tSub, typeGraph);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tParent] = " + tParent + ", "
					+ "[tSub] = " + tSub + ", " + "[typeGraph] = " + typeGraph + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tParent, tSub,
						typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tParent] = " + tParent + ", " + "[tSub] = " + tSub
					+ ", " + "[typeGraph] = " + typeGraph + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_blackBBBB(match, tParent, tSub,
							typeGraph);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParent] = " + tParent + ", " + "[tSub] = "
						+ tSub + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
					match, tParent, tSub, typeGraph);
			// EMoflonEdge tParent__tSub____subpackage = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tSub__typeGraph____typeGraph = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(match, tParent, tSub,
							typeGraph);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tParent] = " + tParent + ", " + "[tSub] = "
						+ tSub + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(match,
					tParent, typeGraph);
			// EMoflonEdge tParent__typeGraph____typeGraph = (EMoflonEdge) result5_green[3];

			// register objects to match
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tParent, tSub, typeGraph);
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_7_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tParent = (TPackage) result1_bindingAndBlack[0];
		TPackage tSub = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[3];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_1_performtransformation_greenFBBFB(tSub, mParentPackage, csp);
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_green[0];
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[3];

		// collect translated elements
		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(mPackage, tSub, mPackageToTSub);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[mPackage] = " + mPackage + ", " + "[tSub] = " + tSub + ", " + "[mPackageToTSub] = "
					+ mPackageToTSub + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(mPackage, tSub, mPackageToTSub);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mPackage, tParent,
						tSub, mParentPackage, mParentPackageToTParent, mPackageToTSub, typeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackage] = " + mPackage + ", " + "[tParent] = "
					+ tParent + ", " + "[tSub] = " + tSub + ", " + "[mParentPackage] = " + mParentPackage + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[mPackageToTSub] = "
					+ mPackageToTSub + ", " + "[typeGraph] = " + typeGraph + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				mPackage, tParent, tSub, mParentPackage, mPackageToTSub, typeGraph);
		// EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[7];
		// EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tParent__tSub____subpackage = (EMoflonEdge) result3_green[9];
		// EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tSub__typeGraph____typeGraph = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mPackageToTSub__mPackage____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mPackageToTSub__tSub____target = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent, mPackageToTSub,
				typeGraph);
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tParent = (TPackage) result2_binding[0];
		TPackage tSub = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_2_corematch_blackBBFFBB(tParent, tSub, typeGraph, match)) {
			org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(tParent, tSub, mParentPackage,
							mParentPackageToTParent, typeGraph)) {
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(tParent, tSub, mParentPackage,
								mParentPackageToTParent, typeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tParent__tSub____subpackage = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tParent__typeGraph____typeGraph = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tSub__typeGraph____typeGraph = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mParentPackageToTParent__tParent____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[tParent] = " + tParent + ", " + "[tSub] = " + tSub + ", " + "[mParentPackage] = "
							+ mParentPackage + ", " + "[mParentPackageToTParent] = " + mParentPackageToTParent + ", "
							+ "[typeGraph] = " + typeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		match.registerObject("tParent", tParent);
		match.registerObject("tSub", tSub);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", true, csp);
		var_tSub_tName.setValue(tSub.getTName());
		var_tSub_tName.setType("String");

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("tSub", tSub);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub,
			EObject mParentPackage, EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("tSub", tSub);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSub").eClass()).equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_package) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_blackFFB(_edge_package)) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[0];
			org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[1];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mPackage, mParentPackage)) {
				// Ensure that the correct types of elements are matched
				if (SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_subpackage) {
		// prepare return value
		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFFB(_edge_subpackage)) {
			TPackage tParent = (TPackage) result2_black[0];
			TPackage tSub = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tParent, tSub, typeGraph)) {
				// Ensure that the correct types of elements are matched
				if (SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SubPackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub", true, csp);
		var_tSub_tName.setValue(__helper.getValue("tSub", "tName"));
		var_tSub_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tSub_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSub_tName.setBound(false);
			eq0.solve(var_mPackage_name, var_tSub_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSub", "tName", var_tSub_tName.getValue());
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
		ruleResult.setRule("SubPackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub", true, csp);
		var_tSub_tName.setValue(__helper.getValue("tSub", "tName"));
		var_tSub_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tSub_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mPackage_name.setBound(false);
			eq0.solve(var_mPackage_name, var_tSub_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mPackage", "name", var_mPackage_name.getValue());
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
		Object[] result1_black = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_24_2_matchcontext_bindingFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[0];
		TPackage tParent = (TPackage) result2_binding[1];
		TPackage tSub = (TPackage) result2_binding[2];
		org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[3];
		TypeGraph typeGraph = (TypeGraph) result2_binding[4];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_24_2_matchcontext_blackBBBBFBBB(mPackage, tParent, tSub, mParentPackage,
						typeGraph, sourceMatch, targetMatch)) {
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[4];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_24_2_matchcontext_greenBBBBBBBFB(mPackage, tParent, tSub,
							mParentPackage, mParentPackageToTParent, typeGraph, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_4_createcorrespondence_blackBBBBBB(mPackage, tParent, tSub,
								mParentPackage, typeGraph, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[mPackage] = " + mPackage + ", " + "[tParent] = " + tParent + ", "
							+ "[tSub] = " + tSub + ", " + "[mParentPackage] = " + mParentPackage + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_4_createcorrespondence_greenBBFB(mPackage,
						tSub, isApplicableMatch);
				// PackageToTPackage mPackageToTSub = (PackageToTPackage) result4_green[2];

				// add to returned result
				Object[] result5_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tParent, TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", true, csp);
		var_tSub_tName.setValue(tSub.getTName());
		var_tSub_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("tSub", tSub);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
	public boolean checkDEC_FWD(org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {// match tgg pattern
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(mPackage, mParentPackage);
		if (result1_black != null) {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_27_2_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tParent, TPackage tSub, TypeGraph typeGraph) {// match tgg pattern
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(tParent, tSub, typeGraph);
		if (result1_black != null) {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_28_2_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mParentPackageToTParentParameter) {
		// create result
		Object[] result1_black = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mParentPackageToTParentList = (RuleEntryList) result2_black[0];
			TPackage tParent = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							tParent, mParentPackage, mParentPackageToTParent, typeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tParent] = " + tParent
						+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mParentPackageToTParent] = "
						+ mParentPackageToTParent + ", " + "[typeGraph] = " + typeGraph + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(tParent, mParentPackage,
								mParentPackageToTParent, typeGraph);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(tParent, mParentPackage,
									mParentPackageToTParent, typeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[tParent] = " + tParent + ", " + "[mParentPackage] = " + mParentPackage + ", "
								+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[typeGraph] = "
								+ typeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_6_perform_greenFBFBFBBB(tParent,
							mParentPackage, typeGraph, ruleResult, csp);
					// org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result6_green[0];
					// TPackage tSub = (TPackage) result6_green[2];
					// PackageToTPackage mPackageToTSub = (PackageToTPackage) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", csp);
		var_tSub_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_PACKAGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_TPACKAGE_PACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(3), (PackageToTPackage) arguments.get(4),
					(TypeGraph) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TPACKAGE_PACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(PackageToTPackage) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_PACKAGE_TPACKAGE_TPACKAGE_PACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (org.eclipse.gmt.modisco.java.Package) arguments.get(4),
					(PackageToTPackage) arguments.get(5), (TypeGraph) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_FWD__PACKAGE_PACKAGE:
			return checkDEC_FWD((org.eclipse.gmt.modisco.java.Package) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_BWD__TPACKAGE_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_PACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2), (PackageToTPackage) arguments.get(3),
					(TypeGraph) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { _this, match, mPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(SubPackageToPGPackage _this,
			Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mParentPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding = pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mParentPackage);
		if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black = pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mParentPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_0_3_CheckCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, org.eclipse.gmt.modisco.java.Package mParentPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { match, mPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, org.eclipse.gmt.modisco.java.Package mParentPackage) {
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mPackage);
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		match.getToBeTranslatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mParentPackage__mPackage____ownedPackages);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		return new Object[] { match, mPackage, mParentPackage, mPackage__mParentPackage____package,
				mParentPackage__mPackage____ownedPackages };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, org.eclipse.gmt.modisco.java.Package mParentPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { match, mPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		match.getContextNodes().add(mParentPackage);
		return new Object[] { match, mParentPackage };
	}

	public static final void pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mParentPackage);

	}

	public static final boolean pattern_SubPackageToPGPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("mParentPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeGraph");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		EObject tmpMParentPackage = _localVariable_2;
		EObject tmpMParentPackageToTParent = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			if (tmpTParent instanceof TPackage) {
				TPackage tParent = (TPackage) tmpTParent;
				if (tmpMParentPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) tmpMParentPackage;
					if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
						PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							return new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		if (!mPackage.equals(mParentPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding = pattern_SubPackageToPGPackage_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding != null) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[0];
			TPackage tParent = (TPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[3];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_1_1_performtransformation_black = pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(
					mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph, _this, isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_1_1_performtransformation_black[5];

				return new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_greenBBFFBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent, TypeGraph typeGraph, CSP csp) {
		TPackage tSub = BasicFactory.eINSTANCE.createTPackage();
		PackageToTPackage mPackageToTSub = ModiscoFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("tSub", "tName");
		tParent.getSubpackage().add(tSub);
		tSub.setTypeGraph(typeGraph);
		mPackageToTSub.setSource(mPackage);
		mPackageToTSub.setTarget(tSub);
		String tSub_tName_prime = (String) _localVariable_0;
		tSub.setTName(tSub_tName_prime);
		return new Object[] { mPackage, tParent, tSub, mPackageToTSub, typeGraph, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tSub, PackageToTPackage mPackageToTSub) {
		return new Object[] { mPackage, tSub, mPackageToTSub };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tSub, PackageToTPackage mPackageToTSub) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mPackage);
		ruleresult.getCreatedElements().add(tSub);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		return new Object[] { ruleresult, mPackage, tSub, mPackageToTSub };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub, EObject mParentPackage,
			EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		if (!mPackage.equals(tParent)) {
			if (!mPackage.equals(tSub)) {
				if (!mPackage.equals(mParentPackage)) {
					if (!mPackage.equals(mParentPackageToTParent)) {
						if (!mPackage.equals(mPackageToTSub)) {
							if (!mPackage.equals(typeGraph)) {
								if (!tParent.equals(tSub)) {
									if (!tParent.equals(typeGraph)) {
										if (!tSub.equals(typeGraph)) {
											if (!mParentPackage.equals(tParent)) {
												if (!mParentPackage.equals(tSub)) {
													if (!mParentPackage.equals(mParentPackageToTParent)) {
														if (!mParentPackage.equals(typeGraph)) {
															if (!mParentPackageToTParent.equals(tParent)) {
																if (!mParentPackageToTParent.equals(tSub)) {
																	if (!mParentPackageToTParent.equals(typeGraph)) {
																		if (!mPackageToTSub.equals(tParent)) {
																			if (!mPackageToTSub.equals(tSub)) {
																				if (!mPackageToTSub
																						.equals(mParentPackage)) {
																					if (!mPackageToTSub.equals(
																							mParentPackageToTParent)) {
																						if (!mPackageToTSub
																								.equals(typeGraph)) {
																							return new Object[] {
																									ruleresult,
																									mPackage, tParent,
																									tSub,
																									mParentPackage,
																									mParentPackageToTParent,
																									mPackageToTSub,
																									typeGraph };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub, EObject mParentPackage,
			EObject mPackageToTSub, EObject typeGraph) {
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSub____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		String tParent__tSub____subpackage_name_prime = "subpackage";
		String tSub__tParent____parent_name_prime = "parent";
		String tSub__typeGraph____typeGraph_name_prime = "typeGraph";
		String mPackageToTSub__mPackage____source_name_prime = "source";
		String mPackageToTSub__tSub____target_name_prime = "target";
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getTranslatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mParentPackage__mPackage____ownedPackages);
		tParent__tSub____subpackage.setSrc(tParent);
		tParent__tSub____subpackage.setTrg(tSub);
		ruleresult.getCreatedEdges().add(tParent__tSub____subpackage);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		ruleresult.getCreatedEdges().add(tSub__tParent____parent);
		tSub__typeGraph____typeGraph.setSrc(tSub);
		tSub__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tSub__typeGraph____typeGraph);
		mPackageToTSub__mPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mPackage____source);
		mPackageToTSub__tSub____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSub____target.setTrg(tSub);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSub____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		tParent__tSub____subpackage.setName(tParent__tSub____subpackage_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		tSub__typeGraph____typeGraph.setName(tSub__typeGraph____typeGraph_name_prime);
		mPackageToTSub__mPackage____source.setName(mPackageToTSub__mPackage____source_name_prime);
		mPackageToTSub__tSub____target.setName(mPackageToTSub__tSub____target_name_prime);
		return new Object[] { ruleresult, mPackage, tParent, tSub, mParentPackage, mPackageToTSub, typeGraph,
				mPackage__mParentPackage____package, mParentPackage__mPackage____ownedPackages,
				tParent__tSub____subpackage, tSub__tParent____parent, tSub__typeGraph____typeGraph,
				mPackageToTSub__mPackage____source, mPackageToTSub__tSub____target };
	}

	public static final void pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub,
			EObject mParentPackage, EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		_this.registerObjects_FWD(ruleresult, mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent,
				mPackageToTSub, typeGraph);

	}

	public static final PerformRuleResult pattern_SubPackageToPGPackage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SubPackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SubPackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mParentPackage");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMParentPackage = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			if (tmpMParentPackage instanceof org.eclipse.gmt.modisco.java.Package) {
				org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) tmpMParentPackage;
				return new Object[] { mPackage, mParentPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_2_corematch_blackBFBFB(
			org.eclipse.gmt.modisco.java.Package mPackage, org.eclipse.gmt.modisco.java.Package mParentPackage,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mPackage.equals(mParentPackage)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mParentPackage, PackageToTPackage.class, "source")) {
				TPackage tParent = mParentPackageToTParent.getTarget();
				if (tParent != null) {
					_result.add(new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_3_findcontext_blackBBBBF(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mPackage.equals(mParentPackage)) {
			if (mParentPackage.equals(mPackage.getPackage())) {
				if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
					if (tParent.equals(mParentPackageToTParent.getTarget())) {
						TypeGraph typeGraph = tParent.getTypeGraph();
						if (typeGraph != null) {
							_result.add(new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent,
									typeGraph });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		String tParent__typeGraph____typeGraph_name_prime = "typeGraph";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String mParentPackageToTParent__tParent____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage__mPackage____ownedPackages);
		tParent__typeGraph____typeGraph.setSrc(tParent);
		tParent__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParent__typeGraph____typeGraph);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		mParentPackageToTParent__tParent____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParent____target);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		tParent__typeGraph____typeGraph.setName(tParent__typeGraph____typeGraph_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		mParentPackageToTParent__tParent____target.setName(mParentPackageToTParent__tParent____target_name_prime);
		return new Object[] { mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph, isApplicableMatch,
				mPackage__mParentPackage____package, mParentPackage__mPackage____ownedPackages,
				tParent__typeGraph____typeGraph, mParentPackageToTParent__mParentPackage____source,
				mParentPackageToTParent__tParent____target };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackage, tParent, mParentPackage,
				mParentPackageToTParent, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, tParent, mParentPackage,
					mParentPackageToTParent, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding = pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackage, tParent, mParentPackage, mParentPackageToTParent, typeGraph);
		if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_black = pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, tParent, mParentPackage,
						mParentPackageToTParent, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_2_5_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_1_initialbindings_blackBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { _this, match, tParent, tSub, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(SubPackageToPGPackage _this,
			Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParent, tSub, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParent, tSub, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding = pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tParent, tSub, typeGraph);
		if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black = pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParent, tSub, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_10_3_CheckCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { match, tParent, tSub, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		EMoflonEdge tParent__tSub____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSub);
		String tParent__tSub____subpackage_name_prime = "subpackage";
		String tSub__tParent____parent_name_prime = "parent";
		String tSub__typeGraph____typeGraph_name_prime = "typeGraph";
		tParent__tSub____subpackage.setSrc(tParent);
		tParent__tSub____subpackage.setTrg(tSub);
		match.getToBeTranslatedEdges().add(tParent__tSub____subpackage);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		match.getToBeTranslatedEdges().add(tSub__tParent____parent);
		tSub__typeGraph____typeGraph.setSrc(tSub);
		tSub__typeGraph____typeGraph.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tSub__typeGraph____typeGraph);
		tParent__tSub____subpackage.setName(tParent__tSub____subpackage_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		tSub__typeGraph____typeGraph.setName(tSub__typeGraph____typeGraph_name_prime);
		return new Object[] { match, tParent, tSub, typeGraph, tParent__tSub____subpackage, tSub__tParent____parent,
				tSub__typeGraph____typeGraph };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(Match match,
			TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { match, tParent, tSub, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(Match match,
			TPackage tParent, TypeGraph typeGraph) {
		EMoflonEdge tParent__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tParent);
		match.getContextNodes().add(typeGraph);
		String tParent__typeGraph____typeGraph_name_prime = "typeGraph";
		tParent__typeGraph____typeGraph.setSrc(tParent);
		tParent__typeGraph____typeGraph.setTrg(typeGraph);
		match.getContextEdges().add(tParent__typeGraph____typeGraph);
		tParent__typeGraph____typeGraph.setName(tParent__typeGraph____typeGraph_name_prime);
		return new Object[] { match, tParent, typeGraph, tParent__typeGraph____typeGraph };
	}

	public static final void pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tParent, tSub, typeGraph);

	}

	public static final boolean pattern_SubPackageToPGPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSub");
		EObject _localVariable_2 = isApplicableMatch.getObject("mParentPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeGraph");
		EObject tmpTParent = _localVariable_0;
		EObject tmpTSub = _localVariable_1;
		EObject tmpMParentPackage = _localVariable_2;
		EObject tmpMParentPackageToTParent = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		if (tmpTParent instanceof TPackage) {
			TPackage tParent = (TPackage) tmpTParent;
			if (tmpTSub instanceof TPackage) {
				TPackage tSub = (TPackage) tmpTSub;
				if (tmpMParentPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) tmpMParentPackage;
					if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
						PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							return new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(
			TPackage tParent, TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph, SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tParent.equals(tSub)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding = pattern_SubPackageToPGPackage_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding != null) {
			TPackage tParent = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[0];
			TPackage tSub = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[3];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_11_1_performtransformation_black = pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(
					tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, _this, isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_11_1_performtransformation_black[5];

				return new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_greenFBBFB(TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, CSP csp) {
		org.eclipse.gmt.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		PackageToTPackage mPackageToTSub = ModiscoFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("mPackage", "name");
		mPackage.setPackage(mParentPackage);
		mPackageToTSub.setSource(mPackage);
		mPackageToTSub.setTarget(tSub);
		String mPackage_name_prime = (String) _localVariable_0;
		mPackage.setName(mPackage_name_prime);
		return new Object[] { mPackage, tSub, mParentPackage, mPackageToTSub, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tSub, PackageToTPackage mPackageToTSub) {
		return new Object[] { mPackage, tSub, mPackageToTSub };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tSub, PackageToTPackage mPackageToTSub) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mPackage);
		ruleresult.getTranslatedElements().add(tSub);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		return new Object[] { ruleresult, mPackage, tSub, mPackageToTSub };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub, EObject mParentPackage,
			EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		if (!mPackage.equals(tParent)) {
			if (!mPackage.equals(tSub)) {
				if (!mPackage.equals(mParentPackage)) {
					if (!mPackage.equals(mParentPackageToTParent)) {
						if (!mPackage.equals(mPackageToTSub)) {
							if (!mPackage.equals(typeGraph)) {
								if (!tParent.equals(tSub)) {
									if (!tParent.equals(typeGraph)) {
										if (!tSub.equals(typeGraph)) {
											if (!mParentPackage.equals(tParent)) {
												if (!mParentPackage.equals(tSub)) {
													if (!mParentPackage.equals(mParentPackageToTParent)) {
														if (!mParentPackage.equals(typeGraph)) {
															if (!mParentPackageToTParent.equals(tParent)) {
																if (!mParentPackageToTParent.equals(tSub)) {
																	if (!mParentPackageToTParent.equals(typeGraph)) {
																		if (!mPackageToTSub.equals(tParent)) {
																			if (!mPackageToTSub.equals(tSub)) {
																				if (!mPackageToTSub
																						.equals(mParentPackage)) {
																					if (!mPackageToTSub.equals(
																							mParentPackageToTParent)) {
																						if (!mPackageToTSub
																								.equals(typeGraph)) {
																							return new Object[] {
																									ruleresult,
																									mPackage, tParent,
																									tSub,
																									mParentPackage,
																									mParentPackageToTParent,
																									mPackageToTSub,
																									typeGraph };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub, EObject mParentPackage,
			EObject mPackageToTSub, EObject typeGraph) {
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSub____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		String tParent__tSub____subpackage_name_prime = "subpackage";
		String tSub__tParent____parent_name_prime = "parent";
		String tSub__typeGraph____typeGraph_name_prime = "typeGraph";
		String mPackageToTSub__mPackage____source_name_prime = "source";
		String mPackageToTSub__tSub____target_name_prime = "target";
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getCreatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mParentPackage__mPackage____ownedPackages);
		tParent__tSub____subpackage.setSrc(tParent);
		tParent__tSub____subpackage.setTrg(tSub);
		ruleresult.getTranslatedEdges().add(tParent__tSub____subpackage);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		ruleresult.getTranslatedEdges().add(tSub__tParent____parent);
		tSub__typeGraph____typeGraph.setSrc(tSub);
		tSub__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tSub__typeGraph____typeGraph);
		mPackageToTSub__mPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mPackage____source);
		mPackageToTSub__tSub____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSub____target.setTrg(tSub);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSub____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		tParent__tSub____subpackage.setName(tParent__tSub____subpackage_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		tSub__typeGraph____typeGraph.setName(tSub__typeGraph____typeGraph_name_prime);
		mPackageToTSub__mPackage____source.setName(mPackageToTSub__mPackage____source_name_prime);
		mPackageToTSub__tSub____target.setName(mPackageToTSub__tSub____target_name_prime);
		return new Object[] { ruleresult, mPackage, tParent, tSub, mParentPackage, mPackageToTSub, typeGraph,
				mPackage__mParentPackage____package, mParentPackage__mPackage____ownedPackages,
				tParent__tSub____subpackage, tSub__tParent____parent, tSub__typeGraph____typeGraph,
				mPackageToTSub__mPackage____source, mPackageToTSub__tSub____target };
	}

	public static final void pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject mPackage, EObject tParent, EObject tSub,
			EObject mParentPackage, EObject mParentPackageToTParent, EObject mPackageToTSub, EObject typeGraph) {
		_this.registerObjects_BWD(ruleresult, mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent,
				mPackageToTSub, typeGraph);

	}

	public static final PerformRuleResult pattern_SubPackageToPGPackage_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SubPackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SubPackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tParent");
		EObject _localVariable_1 = match.getObject("tSub");
		EObject _localVariable_2 = match.getObject("typeGraph");
		EObject tmpTParent = _localVariable_0;
		EObject tmpTSub = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		if (tmpTParent instanceof TPackage) {
			TPackage tParent = (TPackage) tmpTParent;
			if (tmpTSub instanceof TPackage) {
				TPackage tSub = (TPackage) tmpTSub;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					return new Object[] { tParent, tSub, typeGraph, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_2_corematch_blackBBFFBB(TPackage tParent,
			TPackage tSub, TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParent.equals(tSub)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParent, PackageToTPackage.class, "target")) {
				org.eclipse.gmt.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
				if (mParentPackage != null) {
					_result.add(
							new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(TPackage tParent,
			TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParent.equals(tSub)) {
			if (tParent.getSubpackage().contains(tSub)) {
				if (typeGraph.equals(tParent.getTypeGraph())) {
					if (typeGraph.equals(tSub.getTypeGraph())) {
						if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
							if (tParent.equals(mParentPackageToTParent.getTarget())) {
								_result.add(new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent,
										typeGraph });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(TPackage tParent,
			TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tParent__tSub____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tParent__tSub____subpackage_name_prime = "subpackage";
		String tSub__tParent____parent_name_prime = "parent";
		String tParent__typeGraph____typeGraph_name_prime = "typeGraph";
		String tSub__typeGraph____typeGraph_name_prime = "typeGraph";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String mParentPackageToTParent__tParent____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(tSub);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		tParent__tSub____subpackage.setSrc(tParent);
		tParent__tSub____subpackage.setTrg(tSub);
		isApplicableMatch.getAllContextElements().add(tParent__tSub____subpackage);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(tSub__tParent____parent);
		tParent__typeGraph____typeGraph.setSrc(tParent);
		tParent__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParent__typeGraph____typeGraph);
		tSub__typeGraph____typeGraph.setSrc(tSub);
		tSub__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tSub__typeGraph____typeGraph);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		mParentPackageToTParent__tParent____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParent____target);
		tParent__tSub____subpackage.setName(tParent__tSub____subpackage_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		tParent__typeGraph____typeGraph.setName(tParent__typeGraph____typeGraph_name_prime);
		tSub__typeGraph____typeGraph.setName(tSub__typeGraph____typeGraph_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		mParentPackageToTParent__tParent____target.setName(mParentPackageToTParent__tParent____target_name_prime);
		return new Object[] { tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, isApplicableMatch,
				tParent__tSub____subpackage, tSub__tParent____parent, tParent__typeGraph____typeGraph,
				tSub__typeGraph____typeGraph, mParentPackageToTParent__mParentPackage____source,
				mParentPackageToTParent__tParent____target };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tParent, tSub, mParentPackage,
				mParentPackageToTParent, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParent, tSub, mParentPackage, mParentPackageToTParent,
					typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding = pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph);
		if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_black = pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParent, tSub, mParentPackage,
						mParentPackageToTParent, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_12_5_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubPackageToPGPackage _this) {
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

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_package.getSrc();
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			EObject tmpMParentPackage = _edge_package.getTrg();
			if (tmpMParentPackage instanceof org.eclipse.gmt.modisco.java.Package) {
				org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) tmpMParentPackage;
				if (!mPackage.equals(mParentPackage)) {
					if (mParentPackage.equals(mPackage.getPackage())) {
						_result.add(new Object[] { mPackage, mParentPackage, _edge_package });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubPackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			org.eclipse.gmt.modisco.java.Package mParentPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mParentPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubPackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubPackageToPGPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubPackageToPGPackage _this) {
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

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_0BB(TPackage tSub,
			TPackage tParent) {
		if (!tParent.equals(tSub)) {
			TPackage __DEC_tSub_parent_301007 = tSub.getParent();
			if (__DEC_tSub_parent_301007 != null) {
				if (!tSub.equals(__DEC_tSub_parent_301007)) {
					if (!tParent.equals(__DEC_tSub_parent_301007)) {
						return new Object[] { tSub, tParent };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_1BB(TPackage tSub,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tSub_packages_130896 = tSub.getPg();
		if (__DEC_tSub_packages_130896 != null) {
			if (!typeGraph.equals(__DEC_tSub_packages_130896)) {
				return new Object[] { tSub, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_2BB(
			TypeGraph typeGraph, TPackage tSub) {
		if (typeGraph.getPackages().contains(tSub)) {
			return new Object[] { typeGraph, tSub };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_subpackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParent = _edge_subpackage.getSrc();
		if (tmpTParent instanceof TPackage) {
			TPackage tParent = (TPackage) tmpTParent;
			EObject tmpTSub = _edge_subpackage.getTrg();
			if (tmpTSub instanceof TPackage) {
				TPackage tSub = (TPackage) tmpTSub;
				if (!tParent.equals(tSub)) {
					if (tParent.getSubpackage().contains(tSub)) {
						TypeGraph typeGraph = tParent.getTypeGraph();
						if (typeGraph != null) {
							if (typeGraph.equals(tSub.getTypeGraph())) {
								if (pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_0BB(tSub,
										tParent) == null) {
									if (pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_1BB(tSub,
											typeGraph) == null) {
										if (pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_2BB(
												typeGraph, tSub) == null) {
											_result.add(new Object[] { tParent, tSub, typeGraph, _edge_subpackage });
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

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubPackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParent, TPackage tSub, TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParent, tSub, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubPackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubPackageToPGPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_1_prepare_blackB(SubPackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mPackage");
		EObject _localVariable_1 = targetMatch.getObject("tParent");
		EObject _localVariable_2 = targetMatch.getObject("tSub");
		EObject _localVariable_3 = sourceMatch.getObject("mParentPackage");
		EObject _localVariable_4 = targetMatch.getObject("typeGraph");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		EObject tmpTSub = _localVariable_2;
		EObject tmpMParentPackage = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			if (tmpTParent instanceof TPackage) {
				TPackage tParent = (TPackage) tmpTParent;
				if (tmpTSub instanceof TPackage) {
					TPackage tSub = (TPackage) tmpTSub;
					if (tmpMParentPackage instanceof org.eclipse.gmt.modisco.java.Package) {
						org.eclipse.gmt.modisco.java.Package mParentPackage = (org.eclipse.gmt.modisco.java.Package) tmpMParentPackage;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							return new Object[] { mPackage, tParent, tSub, mParentPackage, typeGraph, sourceMatch,
									targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_24_2_matchcontext_blackBBBBFBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, TypeGraph typeGraph, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mPackage.equals(mParentPackage)) {
			if (!tParent.equals(tSub)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (mParentPackage.equals(mPackage.getPackage())) {
						if (tParent.getSubpackage().contains(tSub)) {
							if (typeGraph.equals(tParent.getTypeGraph())) {
								if (typeGraph.equals(tSub.getTypeGraph())) {
									for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mParentPackage, PackageToTPackage.class,
													"source")) {
										if (tParent.equals(mParentPackageToTParent.getTarget())) {
											_result.add(new Object[] { mPackage, tParent, tSub, mParentPackage,
													mParentPackageToTParent, typeGraph, sourceMatch, targetMatch });
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

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchcontext_greenBBBBBBBFB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(tSub);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_checkcsp_bindingFBBBBBBBBBB(
			SubPackageToPGPackage _this, CCMatch isApplicableMatch, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tParent, TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mPackage, tParent, tSub,
				mParentPackage, mParentPackageToTParent, typeGraph, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, tParent, tSub, mParentPackage,
					mParentPackageToTParent, typeGraph, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			SubPackageToPGPackage _this, CCMatch isApplicableMatch, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tParent, TPackage tSub, org.eclipse.gmt.modisco.java.Package mParentPackage,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SubPackageToPGPackage_24_3_checkcsp_binding = pattern_SubPackageToPGPackage_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mPackage, tParent, tSub, mParentPackage, mParentPackageToTParent, typeGraph,
				sourceMatch, targetMatch);
		if (result_pattern_SubPackageToPGPackage_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_24_3_checkcsp_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_24_3_checkcsp_black = pattern_SubPackageToPGPackage_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, tParent, tSub, mParentPackage,
						mParentPackageToTParent, typeGraph, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_4_createcorrespondence_blackBBBBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tParent, TPackage tSub,
			org.eclipse.gmt.modisco.java.Package mParentPackage, TypeGraph typeGraph, CCMatch isApplicableMatch) {
		if (!mPackage.equals(mParentPackage)) {
			if (!tParent.equals(tSub)) {
				return new Object[] { mPackage, tParent, tSub, mParentPackage, typeGraph, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_4_createcorrespondence_greenBBFB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tSub, CCMatch isApplicableMatch) {
		PackageToTPackage mPackageToTSub = ModiscoFactory.eINSTANCE.createPackageToTPackage();
		mPackageToTSub.setSource(mPackage);
		mPackageToTSub.setTarget(tSub);
		isApplicableMatch.getCreateCorr().add(mPackageToTSub);
		return new Object[] { mPackage, tSub, mPackageToTSub, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.gmt.modisco.java.Package mPackage, org.eclipse.gmt.modisco.java.Package mParentPackage) {
		if (!mPackage.equals(mParentPackage)) {
			if (mParentPackage.equals(mPackage.getPackage())) {
				return new Object[] { mPackage, mParentPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(TPackage tSub,
			TPackage tParent) {
		if (!tParent.equals(tSub)) {
			TPackage __DEC_tSub_parent_780215 = tSub.getParent();
			if (__DEC_tSub_parent_780215 != null) {
				if (!tSub.equals(__DEC_tSub_parent_780215)) {
					if (!tParent.equals(__DEC_tSub_parent_780215)) {
						return new Object[] { tSub, tParent };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(TPackage tSub,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tSub_packages_536397 = tSub.getPg();
		if (__DEC_tSub_packages_536397 != null) {
			if (!typeGraph.equals(__DEC_tSub_packages_536397)) {
				return new Object[] { tSub, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_2BB(TypeGraph typeGraph,
			TPackage tSub) {
		if (typeGraph.getPackages().contains(tSub)) {
			return new Object[] { typeGraph, tSub };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(TPackage tParent,
			TPackage tSub, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			if (tParent.getSubpackage().contains(tSub)) {
				if (typeGraph.equals(tParent.getTypeGraph())) {
					if (typeGraph.equals(tSub.getTypeGraph())) {
						if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(tSub, tParent) == null) {
							if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(tSub,
									typeGraph) == null) {
								if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_2BB(typeGraph,
										tSub) == null) {
									return new Object[] { tParent, tSub, typeGraph };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_1_createresult_blackB(SubPackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TPackage tParent) {
		if (ruleResult.getTargetObjects().contains(tParent)) {
			return new Object[] { ruleResult, tParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mParentPackageToTParent) {
		if (ruleResult.getCorrObjects().contains(mParentPackageToTParent)) {
			return new Object[] { ruleResult, mParentPackageToTParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.gmt.modisco.java.Package mParentPackage) {
		if (ruleResult.getSourceObjects().contains(mParentPackage)) {
			return new Object[] { ruleResult, mParentPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mParentPackageToTParentList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMParentPackageToTParent : mParentPackageToTParentList.getEntryObjects()) {
				if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
					PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
					TPackage tParent = mParentPackageToTParent.getTarget();
					if (tParent != null) {
						org.eclipse.gmt.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
						if (mParentPackage != null) {
							TypeGraph typeGraph = tParent.getTypeGraph();
							if (typeGraph != null) {
								if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mParentPackageToTParent) == null) {
									if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											tParent) == null) {
										if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, mParentPackage) == null) {
											if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, typeGraph) == null) {
												_result.add(new Object[] { mParentPackageToTParentList, tParent,
														typeGraph, mParentPackageToTParent, mParentPackage,
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
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_bindingFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tParent, mParentPackage,
				mParentPackageToTParent, typeGraph, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackage, mParentPackageToTParent,
					typeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding = pattern_SubPackageToPGPackage_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParent, mParentPackage, mParentPackageToTParent, typeGraph, ruleResult);
		if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_black = pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackage, mParentPackageToTParent,
						typeGraph, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_29_4_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph) {
		return new Object[] { tParent, mParentPackage, mParentPackageToTParent, typeGraph };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tParent, mParentPackage, mParentPackageToTParent, typeGraph, ruleResult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_greenFBFBFBBB(TPackage tParent,
			org.eclipse.gmt.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.eclipse.gmt.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		TPackage tSub = BasicFactory.eINSTANCE.createTPackage();
		PackageToTPackage mPackageToTSub = ModiscoFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("mPackage", "name");
		Object _localVariable_1 = csp.getValue("tSub", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		mPackage.setPackage(mParentPackage);
		ruleResult.getSourceObjects().add(mPackage);
		tParent.getSubpackage().add(tSub);
		tSub.setTypeGraph(typeGraph);
		ruleResult.getTargetObjects().add(tSub);
		mPackageToTSub.setSource(mPackage);
		mPackageToTSub.setTarget(tSub);
		ruleResult.getCorrObjects().add(mPackageToTSub);
		String mPackage_name_prime = (String) _localVariable_0;
		String tSub_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mPackage.setName(mPackage_name_prime);
		tSub.setTName(tSub_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mPackage, tParent, tSub, mParentPackage, mPackageToTSub, typeGraph, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SubPackageToPGPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SubPackageToPGPackageImpl
