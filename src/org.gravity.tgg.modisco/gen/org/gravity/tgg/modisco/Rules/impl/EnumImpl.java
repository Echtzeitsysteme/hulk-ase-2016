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

import org.eclipse.gmt.modisco.java.EnumDeclaration;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PackageToTPackage;

import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
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
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnumImpl extends AbstractRuleImpl implements org.gravity.tgg.modisco.Rules.Enum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {
		// initial bindings
		Object[] result1_black = EnumImpl.pattern_Enum_0_1_initialbindings_blackBBBB(this, match, mPackage, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
					+ "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnumImpl.pattern_Enum_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
				mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = "
					+ mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnumImpl.pattern_Enum_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EnumImpl.pattern_Enum_0_4_collectelementstobetranslated_blackBBB(match, mPackage,
					mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
						+ "[mType] = " + mType + ".");
			}
			EnumImpl.pattern_Enum_0_4_collectelementstobetranslated_greenBBBFF(match, mPackage, mType);
			// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = EnumImpl.pattern_Enum_0_5_collectcontextelements_blackBBB(match, mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			EnumImpl.pattern_Enum_0_5_collectcontextelements_greenBB(match, mPackage);

			// register objects to match
			EnumImpl.pattern_Enum_0_6_registerobjectstomatch_expressionBBBB(this, match, mPackage, mType);
			return EnumImpl.pattern_Enum_0_7_expressionF();
		} else {
			return EnumImpl.pattern_Enum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnumImpl.pattern_Enum_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		EnumDeclaration mType = (EnumDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumImpl.pattern_Enum_1_1_performtransformation_greenFBFBFBB(tPackage, pg, mType, csp);
		TClass tType = (TClass) result1_green[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[2];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[4];

		// collect translated elements
		Object[] result2_black = EnumImpl.pattern_Enum_1_2_collecttranslatedelements_blackBBBB(tType, mTypeToTType,
				mBodyToTAnnotation, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = EnumImpl.pattern_Enum_1_2_collecttranslatedelements_greenFBBBB(tType, mTypeToTType,
				mBodyToTAnnotation, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnumImpl.pattern_Enum_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
				mPackageToTPackage, tType, tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		EnumImpl.pattern_Enum_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(ruleresult, tType, tPackage,
				mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tPackage__tType____classes = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[14];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		EnumImpl.pattern_Enum_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, mPackageToTPackage, tType,
				tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		return EnumImpl.pattern_Enum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnumImpl.pattern_Enum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumImpl.pattern_Enum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnumImpl.pattern_Enum_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[0];
		EnumDeclaration mType = (EnumDeclaration) result2_binding[1];
		for (Object[] result2_black : EnumImpl.pattern_Enum_2_2_corematch_blackFFBBB(mPackage, mType, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : EnumImpl.pattern_Enum_2_3_findcontext_blackBBBFB(mPackageToTPackage, tPackage,
					mPackage, mType)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = EnumImpl.pattern_Enum_2_3_findcontext_greenBBBBBFFFFFF(mPackageToTPackage,
						tPackage, mPackage, pg, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = EnumImpl.pattern_Enum_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", "
							+ "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnumImpl.pattern_Enum_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnumImpl.pattern_Enum_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnumImpl.pattern_Enum_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EnumImpl.pattern_Enum_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("%ENUM%");
		literal0.setType("");

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");

		// Create unbound variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");
		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType.ID", csp);
		var_tType_ID.setType("int");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();
		CreateID createID = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(addPrefix);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_mType_name, var_tType_tName);
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		eq.setRuleName("");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType,
			EObject tPackage, EObject mTypeToTType, EObject mPackage, EObject pg, EObject mBodyToTAnnotation,
			EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass())
				.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		// initial bindings
		Object[] result1_black = EnumImpl.pattern_Enum_10_1_initialbindings_blackBBBBB(this, match, tType, tPackage,
				pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", "
					+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EnumImpl.pattern_Enum_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType,
				tPackage, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
					+ tPackage + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EnumImpl.pattern_Enum_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EnumImpl.pattern_Enum_10_4_collectelementstobetranslated_blackBBBB(match, tType,
					tPackage, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[pg] = " + pg + ".");
			}
			EnumImpl.pattern_Enum_10_4_collectelementstobetranslated_greenBBBBFFFFFF(match, tType, tPackage, pg);
			// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tPackage__tType____classes = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pg__tType____classes = (EMoflonEdge) result4_green[7];
			// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[8];
			// EMoflonEdge tType__pg____pg = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = EnumImpl.pattern_Enum_10_5_collectcontextelements_blackBBBB(match, tType, tPackage,
					pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[pg] = " + pg + ".");
			}
			EnumImpl.pattern_Enum_10_5_collectcontextelements_greenBBBF(match, tPackage, pg);
			// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result5_green[3];

			// register objects to match
			EnumImpl.pattern_Enum_10_6_registerobjectstomatch_expressionBBBBB(this, match, tType, tPackage, pg);
			return EnumImpl.pattern_Enum_10_7_expressionF();
		} else {
			return EnumImpl.pattern_Enum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EnumImpl
				.pattern_Enum_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TClass tType = (TClass) result1_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[2];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumImpl.pattern_Enum_11_1_performtransformation_greenBFBFFB(tType, mPackage, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[3];
		EnumDeclaration mType = (EnumDeclaration) result1_green[4];

		// collect translated elements
		Object[] result2_black = EnumImpl.pattern_Enum_11_2_collecttranslatedelements_blackBBBB(tType, mTypeToTType,
				mBodyToTAnnotation, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = EnumImpl.pattern_Enum_11_2_collecttranslatedelements_greenFBBBB(tType, mTypeToTType,
				mBodyToTAnnotation, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EnumImpl.pattern_Enum_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
				mPackageToTPackage, tType, tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		EnumImpl.pattern_Enum_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(ruleresult, tType, tPackage,
				mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tPackage__tType____classes = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[14];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[18];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		EnumImpl.pattern_Enum_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, mPackageToTPackage, tType,
				tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType);
		return EnumImpl.pattern_Enum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnumImpl.pattern_Enum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumImpl.pattern_Enum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EnumImpl.pattern_Enum_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tType = (TClass) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : EnumImpl.pattern_Enum_12_2_corematch_blackFBBFBB(tType, tPackage, pg, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : EnumImpl.pattern_Enum_12_3_findcontext_blackBBBBB(mPackageToTPackage, tType,
					tPackage, mPackage, pg)) {
				Object[] result3_green = EnumImpl.pattern_Enum_12_3_findcontext_greenBBBBBFFFFFFFFFF(mPackageToTPackage,
						tType, tPackage, mPackage, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tPackage__tType____classes = (EMoflonEdge) result3_green[8];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pg__tType____classes = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = EnumImpl.pattern_Enum_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
									+ mPackageToTPackage + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
									+ tPackage + ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EnumImpl.pattern_Enum_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EnumImpl.pattern_Enum_12_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EnumImpl.pattern_Enum_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EnumImpl.pattern_Enum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		match.registerObject("tType", tType);
		match.registerObject("tPackage", tPackage);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tType, TPackage tPackage, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType.ID", true, csp);
		var_tType_ID.setValue(tType.getID());
		var_tType_ID.setType("int");

		// Create unbound variables

		// Create constraints
		CreateID createID = new CreateID();

		csp.getConstraints().add(createID);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tType_ID);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TClass tType, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("%ENUM%");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();
		Eq eq = new Eq();

		csp.getConstraints().add(addPrefix);
		csp.getConstraints().add(eq);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_mType_name, var_tType_tName);
		eq.setRuleName("");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType,
			EObject tPackage, EObject mTypeToTType, EObject mPackage, EObject pg, EObject mBodyToTAnnotation,
			EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass()).equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_47(EMoflonEdge _edge_ownedElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnumImpl.pattern_Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumImpl.pattern_Enum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnumImpl.pattern_Enum_20_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[0];
			EnumDeclaration mType = (EnumDeclaration) result2_black[1];
			Object[] result2_green = EnumImpl.pattern_Enum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnumImpl.pattern_Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
					mPackage, mType)) {
				// Ensure that the correct types of elements are matched
				if (EnumImpl.pattern_Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = EnumImpl.pattern_Enum_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnumImpl.pattern_Enum_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumImpl.pattern_Enum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_ownedTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = EnumImpl.pattern_Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumImpl.pattern_Enum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EnumImpl.pattern_Enum_21_2_testcorematchandDECs_blackFFFB(_edge_ownedTypes)) {
			TClass tType = (TClass) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = EnumImpl.pattern_Enum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EnumImpl.pattern_Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
					tType, tPackage, pg)) {
				// Ensure that the correct types of elements are matched
				if (EnumImpl.pattern_Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = EnumImpl.pattern_Enum_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					EnumImpl.pattern_Enum_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumImpl.pattern_Enum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Enum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("%ENUM%");
		var_literal0.setType("");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_ID.setValue(__helper.getValue("tType", "ID"));
		var_tType_ID.setType("int");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		AddPrefix addPrefix0 = new AddPrefix();
		csp.getConstraints().add(addPrefix0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		addPrefix0.setRuleName("Enum");
		addPrefix0.solve(var_literal0, var_mType_name, var_tType_tName);

		createID1.setRuleName("Enum");
		createID1.solve(var_tType_ID);

		eq2.setRuleName("Enum");
		eq2.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tName.setBound(false);
			var_tType_ID.setBound(false);
			var_tType_tLib.setBound(false);
			addPrefix0.solve(var_literal0, var_mType_name, var_tType_tName);
			createID1.solve(var_tType_ID);
			eq2.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tName", var_tType_tName.getValue());
				__helper.setValue("tType", "ID", var_tType_ID.getValue());
				__helper.setValue("tType", "tLib", var_tType_tLib.getValue());
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
		ruleResult.setRule("Enum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("%ENUM%");
		var_literal0.setType("");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_ID.setValue(__helper.getValue("tType", "ID"));
		var_tType_ID.setType("int");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		CreateID createID0 = new CreateID();
		csp.getConstraints().add(createID0);

		AddPrefix addPrefix1 = new AddPrefix();
		csp.getConstraints().add(addPrefix1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		createID0.setRuleName("Enum");
		createID0.solve(var_tType_ID);

		addPrefix1.setRuleName("Enum");
		addPrefix1.solve(var_literal0, var_mType_name, var_tType_tName);

		eq2.setRuleName("Enum");
		eq2.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			var_mType_proxy.setBound(false);
			createID0.solve(var_tType_ID);
			addPrefix1.solve(var_literal0, var_mType_name, var_tType_tName);
			eq2.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "name", var_mType_name.getValue());
				__helper.setValue("mType", "proxy", var_mType_proxy.getValue());
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
		Object[] result1_black = EnumImpl.pattern_Enum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumImpl.pattern_Enum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EnumImpl.pattern_Enum_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TClass tType = (TClass) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		EnumDeclaration mType = (EnumDeclaration) result2_binding[4];
		for (Object[] result2_black : EnumImpl.pattern_Enum_24_2_matchcontext_blackFBBBBBBB(tType, tPackage, mPackage,
				pg, mType, sourceMatch, targetMatch)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			Object[] result2_green = EnumImpl.pattern_Enum_24_2_matchcontext_greenBBBBBBBFB(mPackageToTPackage, tType,
					tPackage, mPackage, pg, mType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = EnumImpl.pattern_Enum_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this,
					isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg, mType, sourceMatch,
					targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = EnumImpl.pattern_Enum_24_4_createcorrespondence_blackBBBBBB(tType, tPackage,
						mPackage, pg, mType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
							+ "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EnumImpl.pattern_Enum_24_4_createcorrespondence_greenBFFBB(tType, mType, isApplicableMatch);
				// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result4_green[1];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[2];

				// add to returned result
				Object[] result5_black = EnumImpl.pattern_Enum_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EnumImpl.pattern_Enum_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EnumImpl.pattern_Enum_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TClass tType,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("%ENUM%");
		literal0.setType("");

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType.ID", true, csp);
		var_tType_ID.setValue(tType.getID());
		var_tType_ID.setType("int");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();
		CreateID createID = new CreateID();
		Eq eq = new Eq();

		csp.getConstraints().add(addPrefix);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq);

		// Solve CSP
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_mType_name, var_tType_tName);
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		eq.setRuleName("");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
	public boolean checkDEC_FWD(org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {// match tgg pattern
		Object[] result1_black = EnumImpl.pattern_Enum_27_1_matchtggpattern_blackBB(mPackage, mType);
		if (result1_black != null) {
			return EnumImpl.pattern_Enum_27_2_expressionF();
		} else {
			return EnumImpl.pattern_Enum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tType, TPackage tPackage, TypeGraph pg) {// match tgg pattern
		Object[] result1_black = EnumImpl.pattern_Enum_28_1_matchtggpattern_blackBBB(tType, tPackage, pg);
		if (result1_black != null) {
			return EnumImpl.pattern_Enum_28_2_expressionF();
		} else {
			return EnumImpl.pattern_Enum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mPackageToTPackageParameter) {
		// create result
		Object[] result1_black = EnumImpl.pattern_Enum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumImpl.pattern_Enum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EnumImpl.pattern_Enum_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer,
				ruleResult)) {
			// RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = EnumImpl.pattern_Enum_29_3_solveCSP_bindingAndBlackFBBBBBBB(this,
					isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage
						+ ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EnumImpl.pattern_Enum_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EnumImpl.pattern_Enum_29_5_checknacs_blackBBBB(mPackageToTPackage, tPackage,
						mPackage, pg);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EnumImpl.pattern_Enum_29_6_perform_blackBBBBB(mPackageToTPackage, tPackage,
							mPackage, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage
								+ ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					EnumImpl.pattern_Enum_29_6_perform_greenFBFBBFFBB(tPackage, mPackage, pg, ruleResult, csp);
					// TClass tType = (TClass) result6_green[0];
					// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[2];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[5];
					// EnumDeclaration mType = (EnumDeclaration) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return EnumImpl.pattern_Enum_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("%ENUM%");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");
		Variable var_tType_ID = CSPFactoryHelper.eINSTANCE.createVariable("tType.ID", csp);
		var_tType_ID.setType("int");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		CreateID createID = new CreateID();
		AddPrefix addPrefix = new AddPrefix();
		Eq eq = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(addPrefix);
		csp.getConstraints().add(eq);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		addPrefix.setRuleName("");
		addPrefix.solve(literal0, var_mType_name, var_tType_tName);
		eq.setRuleName("");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
		case RulesPackage.ENUM___IS_APPROPRIATE_FWD__MATCH_PACKAGE_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1), (EnumDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1), (EnumDeclaration) arguments.get(2));
		case RulesPackage.ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_ENUMDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TPackage) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(TypeGraph) arguments.get(4), (EnumDeclaration) arguments.get(5));
		case RulesPackage.ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TCLASS_TPACKAGE_PACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TClass) arguments.get(2), (TPackage) arguments.get(3),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_47((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_PACKAGETOTPACKAGE_TCLASS_TPACKAGE_PACKAGE_TYPEGRAPH_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TClass) arguments.get(2), (TPackage) arguments.get(3),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(4), (TypeGraph) arguments.get(5),
					(EnumDeclaration) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM___CHECK_DEC_FWD__PACKAGE_ENUMDECLARATION:
			return checkDEC_FWD((org.eclipse.gmt.modisco.java.Package) arguments.get(0),
					(EnumDeclaration) arguments.get(1));
		case RulesPackage.ENUM___CHECK_DEC_BWD__TCLASS_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TClass) arguments.get(0), (TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(PackageToTPackage) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Enum_0_1_initialbindings_blackBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			Match match, org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_Enum_0_2_SolveCSP_bindingFBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			Match match, org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_Enum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_0_2_SolveCSP_bindingAndBlackFBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {
		Object[] result_pattern_Enum_0_2_SolveCSP_binding = pattern_Enum_0_2_SolveCSP_bindingFBBBB(_this, match,
				mPackage, mType);
		if (result_pattern_Enum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Enum_0_2_SolveCSP_black = pattern_Enum_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Enum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_Enum_0_3_CheckCSP_expressionFBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_Enum_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		match.getToBeTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { match, mPackage, mType, mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final Object[] pattern_Enum_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_Enum_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage) {
		match.getContextNodes().add(mPackage);
		return new Object[] { match, mPackage };
	}

	public static final void pattern_Enum_0_6_registerobjectstomatch_expressionBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_Enum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Enum_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Enum_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof EnumDeclaration) {
							EnumDeclaration mType = (EnumDeclaration) tmpMType;
							return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_1_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage,
			TypeGraph pg, EnumDeclaration mType, org.gravity.tgg.modisco.Rules.Enum _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			org.gravity.tgg.modisco.Rules.Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Enum_1_1_performtransformation_binding = pattern_Enum_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Enum_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_Enum_1_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_Enum_1_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_Enum_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_Enum_1_1_performtransformation_binding[3];
			EnumDeclaration mType = (EnumDeclaration) result_pattern_Enum_1_1_performtransformation_binding[4];

			Object[] result_pattern_Enum_1_1_performtransformation_black = pattern_Enum_1_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tPackage, mPackage, pg, mType, _this, isApplicableMatch);
			if (result_pattern_Enum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Enum_1_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_1_1_performtransformation_greenFBFBFBB(TPackage tPackage, TypeGraph pg,
			EnumDeclaration mType, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		tPackage.getOwnedTypes().add(tType);
		tPackage.getClasses().add(tType);
		pg.getClasses().add(tType);
		pg.getOwnedTypes().add(tType);
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		String tType_tName_prime = (String) _localVariable_0;
		int tType_ID_prime = (int) _localVariable_1;
		boolean tType_tLib_prime = (boolean) _localVariable_2;
		tType.setTName(tType_tName_prime);
		tType.setID(Integer.valueOf(tType_ID_prime));
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		return new Object[] { tType, tPackage, mTypeToTType, pg, mBodyToTAnnotation, mType, csp };
	}

	public static final Object[] pattern_Enum_1_2_collecttranslatedelements_blackBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation, EnumDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_Enum_1_2_collecttranslatedelements_greenFBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation, EnumDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_Enum_1_3_bookkeepingforedges_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject mPackageToTPackage, EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(tPackage)) {
				if (!mPackageToTPackage.equals(mTypeToTType)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!tPackage.equals(tType)) {
								if (!mTypeToTType.equals(tType)) {
									if (!mTypeToTType.equals(tPackage)) {
										if (!mTypeToTType.equals(pg)) {
											if (!mPackage.equals(mPackageToTPackage)) {
												if (!mPackage.equals(tType)) {
													if (!mPackage.equals(tPackage)) {
														if (!mPackage.equals(mTypeToTType)) {
															if (!mPackage.equals(pg)) {
																if (!mPackage.equals(mType)) {
																	if (!pg.equals(tType)) {
																		if (!pg.equals(tPackage)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation.equals(tType)) {
																					if (!mBodyToTAnnotation
																							.equals(tPackage)) {
																						if (!mBodyToTAnnotation
																								.equals(mTypeToTType)) {
																							if (!mBodyToTAnnotation
																									.equals(mPackage)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mType)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(tPackage)) {
																												if (!mType
																														.equals(mTypeToTType)) {
																													if (!mType
																															.equals(pg)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																tType,
																																tPackage,
																																mTypeToTType,
																																mPackage,
																																pg,
																																mBodyToTAnnotation,
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
		return null;
	}

	public static final Object[] pattern_Enum_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Enum";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String tPackage__tType____classes_name_prime = "classes";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____classes_name_prime = "classes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mTypeToTType__mType____source_name_prime = "source";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tType__tPackage____package);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		tPackage__tType____classes.setSrc(tPackage);
		tPackage__tType____classes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____classes);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____classes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____pg);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mType__mPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		tPackage__tType____classes.setName(tPackage__tType____classes_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, tType, tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType,
				tPackage__tType____ownedTypes, tType__tPackage____package, mBodyToTAnnotation__tType____target,
				tPackage__tType____classes, mBodyToTAnnotation__mType____source, mTypeToTType__tType____target,
				pg__tType____classes, pg__tType____ownedTypes, tType__pg____pg, mTypeToTType__mType____source,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_Enum_1_5_registerobjects_expressionBBBBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage, EObject pg,
			EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, tType, tPackage, mTypeToTType, mPackage, pg,
				mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_Enum_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Enum_2_1_preparereturnvalue_bindingFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Enum_2_1_preparereturnvalue_blackFBB(EClass eClass,
			org.gravity.tgg.modisco.Rules.Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Enum_2_1_preparereturnvalue_bindingAndBlackFFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		Object[] result_pattern_Enum_2_1_preparereturnvalue_binding = pattern_Enum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Enum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Enum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Enum_2_1_preparereturnvalue_black = pattern_Enum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Enum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Enum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Enum_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			if (tmpMType instanceof EnumDeclaration) {
				EnumDeclaration mType = (EnumDeclaration) tmpMType;
				return new Object[] { mPackage, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Enum_2_2_corematch_blackFFBBB(
			org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
			TPackage tPackage = mPackageToTPackage.getTarget();
			if (tPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Enum_2_3_findcontext_blackBBBFB(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.equals(mPackageToTPackage.getSource())) {
			if (mPackage.getOwnedElements().contains(mType)) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					TypeGraph pg = tPackage.getTypeGraph();
					if (pg != null) {
						_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Enum_2_3_findcontext_greenBBBBBFFFFFF(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mType);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, isApplicableMatch,
				tPackage__pg____typeGraph, mPackageToTPackage__mPackage____source, mPackage__mType____ownedElements,
				mType__mPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_Enum_2_4_solveCSP_bindingFBBBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackageToTPackage, tPackage,
				mPackage, pg, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType };
		}
		return null;
	}

	public static final Object[] pattern_Enum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, IsApplicableMatch isApplicableMatch,
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage,
			TypeGraph pg, EnumDeclaration mType) {
		Object[] result_pattern_Enum_2_4_solveCSP_binding = pattern_Enum_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType);
		if (result_pattern_Enum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_2_4_solveCSP_binding[0];

			Object[] result_pattern_Enum_2_4_solveCSP_black = pattern_Enum_2_4_solveCSP_blackB(csp);
			if (result_pattern_Enum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						mType };
			}
		}
		return null;
	}

	public static final boolean pattern_Enum_2_5_checkCSP_expressionFBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Enum_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Enum_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Enum_10_1_initialbindings_blackBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { _this, match, tType, tPackage, pg };
	}

	public static final Object[] pattern_Enum_10_2_SolveCSP_bindingFBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_Enum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_10_2_SolveCSP_bindingAndBlackFBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		Object[] result_pattern_Enum_10_2_SolveCSP_binding = pattern_Enum_10_2_SolveCSP_bindingFBBBBB(_this, match,
				tType, tPackage, pg);
		if (result_pattern_Enum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Enum_10_2_SolveCSP_black = pattern_Enum_10_2_SolveCSP_blackB(csp);
			if (result_pattern_Enum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tPackage, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_Enum_10_3_CheckCSP_expressionFBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_10_4_collectelementstobetranslated_blackBBBB(Match match, TClass tType,
			TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_Enum_10_4_collectelementstobetranslated_greenBBBBFFFFFF(Match match,
			TClass tType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____classes_name_prime = "classes";
		String pg__tType____classes_name_prime = "classes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		tPackage__tType____classes.setSrc(tPackage);
		tPackage__tType____classes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____classes);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____classes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____pg);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____classes.setName(tPackage__tType____classes_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { match, tType, tPackage, pg, tPackage__tType____ownedTypes, tType__tPackage____package,
				tPackage__tType____classes, pg__tType____classes, pg__tType____ownedTypes, tType__pg____pg };
	}

	public static final Object[] pattern_Enum_10_5_collectcontextelements_blackBBBB(Match match, TClass tType,
			TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_Enum_10_5_collectcontextelements_greenBBBF(Match match, TPackage tPackage,
			TypeGraph pg) {
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(pg);
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____typeGraph);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		return new Object[] { match, tPackage, pg, tPackage__pg____typeGraph };
	}

	public static final void pattern_Enum_10_6_registerobjectstomatch_expressionBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tType, tPackage, pg);

	}

	public static final boolean pattern_Enum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Enum_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Enum_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpMPackage = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
						org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_11_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, org.gravity.tgg.modisco.Rules.Enum _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			org.gravity.tgg.modisco.Rules.Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Enum_11_1_performtransformation_binding = pattern_Enum_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Enum_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_Enum_11_1_performtransformation_binding[0];
			TClass tType = (TClass) result_pattern_Enum_11_1_performtransformation_binding[1];
			TPackage tPackage = (TPackage) result_pattern_Enum_11_1_performtransformation_binding[2];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_Enum_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_Enum_11_1_performtransformation_binding[4];

			Object[] result_pattern_Enum_11_1_performtransformation_black = pattern_Enum_11_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tType, tPackage, mPackage, pg, _this, isApplicableMatch);
			if (result_pattern_Enum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Enum_11_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_11_1_performtransformation_greenBFBFFB(TClass tType,
			org.eclipse.gmt.modisco.java.Package mPackage, CSP csp) {
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		EnumDeclaration mType = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("mType", "name");
		Object _localVariable_1 = csp.getValue("mType", "proxy");
		mTypeToTType.setTarget(tType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		mTypeToTType.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		String mType_name_prime = (String) _localVariable_0;
		boolean mType_proxy_prime = (boolean) _localVariable_1;
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { tType, mTypeToTType, mPackage, mBodyToTAnnotation, mType, csp };
	}

	public static final Object[] pattern_Enum_11_2_collecttranslatedelements_blackBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation, EnumDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_Enum_11_2_collecttranslatedelements_greenFBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation, EnumDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_Enum_11_3_bookkeepingforedges_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject mPackageToTPackage, EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(tPackage)) {
				if (!mPackageToTPackage.equals(mTypeToTType)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!tPackage.equals(tType)) {
								if (!mTypeToTType.equals(tType)) {
									if (!mTypeToTType.equals(tPackage)) {
										if (!mTypeToTType.equals(pg)) {
											if (!mPackage.equals(mPackageToTPackage)) {
												if (!mPackage.equals(tType)) {
													if (!mPackage.equals(tPackage)) {
														if (!mPackage.equals(mTypeToTType)) {
															if (!mPackage.equals(pg)) {
																if (!mPackage.equals(mType)) {
																	if (!pg.equals(tType)) {
																		if (!pg.equals(tPackage)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation.equals(tType)) {
																					if (!mBodyToTAnnotation
																							.equals(tPackage)) {
																						if (!mBodyToTAnnotation
																								.equals(mTypeToTType)) {
																							if (!mBodyToTAnnotation
																									.equals(mPackage)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mType)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(tPackage)) {
																												if (!mType
																														.equals(mTypeToTType)) {
																													if (!mType
																															.equals(pg)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																tType,
																																tPackage,
																																mTypeToTType,
																																mPackage,
																																pg,
																																mBodyToTAnnotation,
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
		return null;
	}

	public static final Object[] pattern_Enum_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Enum";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String tPackage__tType____classes_name_prime = "classes";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____classes_name_prime = "classes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mTypeToTType__mType____source_name_prime = "source";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tType__tPackage____package);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		tPackage__tType____classes.setSrc(tPackage);
		tPackage__tType____classes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____classes);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____classes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____pg);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getCreatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mType__mPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		tPackage__tType____classes.setName(tPackage__tType____classes_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, tType, tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType,
				tPackage__tType____ownedTypes, tType__tPackage____package, mBodyToTAnnotation__tType____target,
				tPackage__tType____classes, mBodyToTAnnotation__mType____source, mTypeToTType__tType____target,
				pg__tType____classes, pg__tType____ownedTypes, tType__pg____pg, mTypeToTType__mType____source,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_Enum_11_5_registerobjects_expressionBBBBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject tType, EObject tPackage, EObject mTypeToTType, EObject mPackage, EObject pg,
			EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, tType, tPackage, mTypeToTType, mPackage, pg,
				mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_Enum_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Enum_12_1_preparereturnvalue_bindingFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Enum_12_1_preparereturnvalue_blackFBB(EClass eClass,
			org.gravity.tgg.modisco.Rules.Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Enum_12_1_preparereturnvalue_bindingAndBlackFFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		Object[] result_pattern_Enum_12_1_preparereturnvalue_binding = pattern_Enum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Enum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Enum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Enum_12_1_preparereturnvalue_black = pattern_Enum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Enum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Enum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Enum_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tPackage");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTType = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTType instanceof TClass) {
			TClass tType = (TClass) tmpTType;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					return new Object[] { tType, tPackage, pg, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Enum_12_2_corematch_blackFBBFBB(TClass tType, TPackage tPackage,
			TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
			org.eclipse.gmt.modisco.java.Package mPackage = mPackageToTPackage.getSource();
			if (mPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Enum_12_3_findcontext_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tPackage.getOwnedTypes().contains(tType)) {
			if (tPackage.getClasses().contains(tType)) {
				if (pg.equals(tPackage.getTypeGraph())) {
					if (mPackage.equals(mPackageToTPackage.getSource())) {
						if (pg.getClasses().contains(tType)) {
							if (pg.getOwnedTypes().contains(tType)) {
								if (tPackage.equals(mPackageToTPackage.getTarget())) {
									_result.add(new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Enum_12_3_findcontext_greenBBBBBFFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____classes_name_prime = "classes";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String pg__tType____classes_name_prime = "classes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____classes.setSrc(tPackage);
		tPackage__tType____classes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____classes);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		pg__tType____classes.setSrc(pg);
		pg__tType____classes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____classes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____classes.setName(tPackage__tType____classes_name_prime);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		pg__tType____classes.setName(pg__tType____classes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg, isApplicableMatch,
				tPackage__tType____ownedTypes, tType__tPackage____package, tPackage__tType____classes,
				tPackage__pg____typeGraph, mPackageToTPackage__mPackage____source, pg__tType____classes,
				pg__tType____ownedTypes, tType__pg____pg, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_Enum_12_4_solveCSP_bindingFBBBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tType, tPackage,
				mPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_Enum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, IsApplicableMatch isApplicableMatch,
			PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {
		Object[] result_pattern_Enum_12_4_solveCSP_binding = pattern_Enum_12_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg);
		if (result_pattern_Enum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_12_4_solveCSP_binding[0];

			Object[] result_pattern_Enum_12_4_solveCSP_black = pattern_Enum_12_4_solveCSP_blackB(csp);
			if (result_pattern_Enum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_Enum_12_5_checkCSP_expressionFBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Enum_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Enum_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Enum_20_1_preparereturnvalue_bindingFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Enum_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			org.gravity.tgg.modisco.Rules.Enum _this) {
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

	public static final Object[] pattern_Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		Object[] result_pattern_Enum_20_1_preparereturnvalue_binding = pattern_Enum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Enum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Enum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Enum_20_1_preparereturnvalue_black = pattern_Enum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Enum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Enum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Enum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Enum_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_ownedElements.getSrc();
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			EObject tmpMType = _edge_ownedElements.getTrg();
			if (tmpMType instanceof EnumDeclaration) {
				EnumDeclaration mType = (EnumDeclaration) tmpMType;
				if (mPackage.getOwnedElements().contains(mType)) {
					_result.add(new Object[] { mPackage, mType, _edge_ownedElements });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Enum_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			EnumDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Enum_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Enum_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Enum_21_1_preparereturnvalue_bindingFB(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Enum_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			org.gravity.tgg.modisco.Rules.Enum _this) {
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

	public static final Object[] pattern_Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(
			org.gravity.tgg.modisco.Rules.Enum _this) {
		Object[] result_pattern_Enum_21_1_preparereturnvalue_binding = pattern_Enum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Enum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Enum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Enum_21_1_preparereturnvalue_black = pattern_Enum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Enum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Enum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Enum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Enum_21_2_testcorematchandDECs_black_nac_0BB(TClass tType, TPackage tPackage) {
		for (TPackage __DEC_tType_classes_740993 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tType_classes_740993)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_21_2_testcorematchandDECs_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_591206 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_591206)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_21_2_testcorematchandDECs_black_nac_2BB(TClass tType, TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_890444 = tType.getPackage();
		if (__DEC_tType_ownedTypes_890444 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_890444)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Enum_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_ownedTypes.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTType = _edge_ownedTypes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tPackage.getOwnedTypes().contains(tType)) {
					if (tPackage.getClasses().contains(tType)) {
						TypeGraph pg = tPackage.getTypeGraph();
						if (pg != null) {
							if (pg.getClasses().contains(tType)) {
								if (pg.getOwnedTypes().contains(tType)) {
									if (pattern_Enum_21_2_testcorematchandDECs_black_nac_0BB(tType, tPackage) == null) {
										if (pattern_Enum_21_2_testcorematchandDECs_black_nac_2BB(tType,
												tPackage) == null) {
											if (pattern_Enum_21_2_testcorematchandDECs_black_nac_1BB(tType,
													pg) == null) {
												_result.add(new Object[] { tType, tPackage, pg, _edge_ownedTypes });
											}
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

	public static final Object[] pattern_Enum_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match, TClass tType, TPackage tPackage, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tPackage, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			org.gravity.tgg.modisco.Rules.Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Enum_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Enum_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Enum_24_1_prepare_blackB(org.gravity.tgg.modisco.Rules.Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Enum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Enum_24_2_matchcontext_bindingFFFFFBB(Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = targetMatch.getObject("tPackage");
		EObject _localVariable_2 = sourceMatch.getObject("mPackage");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTType = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTType instanceof TClass) {
			TClass tType = (TClass) tmpTType;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof EnumDeclaration) {
							EnumDeclaration mType = (EnumDeclaration) tmpMType;
							return new Object[] { tType, tPackage, mPackage, pg, mType, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Enum_24_2_matchcontext_blackFBBBBBBB(TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tPackage.getOwnedTypes().contains(tType)) {
				if (tPackage.getClasses().contains(tType)) {
					if (pg.equals(tPackage.getTypeGraph())) {
						if (pg.getClasses().contains(tType)) {
							if (pg.getOwnedTypes().contains(tType)) {
								if (mPackage.getOwnedElements().contains(mType)) {
									for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
										if (tPackage.equals(mPackageToTPackage.getTarget())) {
											_result.add(new Object[] { mPackageToTPackage, tType, tPackage, mPackage,
													pg, mType, sourceMatch, targetMatch });
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

	public static final Object[] pattern_Enum_24_2_matchcontext_greenBBBBBBBFB(PackageToTPackage mPackageToTPackage,
			TClass tType, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg,
			EnumDeclaration mType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "Enum";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, tType, tPackage, mPackage, pg, mType, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_Enum_24_3_checkcsp_bindingFBBBBBBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mPackageToTPackage, tType, tPackage,
				mPackage, pg, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg,
					mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Enum_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TClass tType, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg,
			EnumDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Enum_24_3_checkcsp_binding = pattern_Enum_24_3_checkcsp_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg, mType, sourceMatch, targetMatch);
		if (result_pattern_Enum_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_24_3_checkcsp_binding[0];

			Object[] result_pattern_Enum_24_3_checkcsp_black = pattern_Enum_24_3_checkcsp_blackB(csp);
			if (result_pattern_Enum_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, tPackage, mPackage, pg,
						mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_24_4_createcorrespondence_blackBBBBBB(TClass tType, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, EnumDeclaration mType,
			CCMatch isApplicableMatch) {
		return new Object[] { tType, tPackage, mPackage, pg, mType, isApplicableMatch };
	}

	public static final Object[] pattern_Enum_24_4_createcorrespondence_greenBFFBB(TClass tType, EnumDeclaration mType,
			CCMatch isApplicableMatch) {
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		isApplicableMatch.getCreateCorr().add(mTypeToTType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mType, isApplicableMatch };
	}

	public static final Object[] pattern_Enum_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Enum_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Enum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Enum_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Enum_27_1_matchtggpattern_blackBB(
			org.eclipse.gmt.modisco.java.Package mPackage, EnumDeclaration mType) {
		if (mPackage.getOwnedElements().contains(mType)) {
			return new Object[] { mPackage, mType };
		}
		return null;
	}

	public static final boolean pattern_Enum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Enum_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Enum_28_1_matchtggpattern_black_nac_0BB(TClass tType, TPackage tPackage) {
		for (TPackage __DEC_tType_classes_33862 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tType_classes_33862)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_28_1_matchtggpattern_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_796337 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_796337)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_Enum_28_1_matchtggpattern_black_nac_2BB(TClass tType, TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_984459 = tType.getPackage();
		if (__DEC_tType_ownedTypes_984459 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_984459)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_Enum_28_1_matchtggpattern_blackBBB(TClass tType, TPackage tPackage,
			TypeGraph pg) {
		if (tPackage.getOwnedTypes().contains(tType)) {
			if (tPackage.getClasses().contains(tType)) {
				if (pg.equals(tPackage.getTypeGraph())) {
					if (pg.getClasses().contains(tType)) {
						if (pg.getOwnedTypes().contains(tType)) {
							if (pattern_Enum_28_1_matchtggpattern_black_nac_0BB(tType, tPackage) == null) {
								if (pattern_Enum_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
									if (pattern_Enum_28_1_matchtggpattern_black_nac_2BB(tType, tPackage) == null) {
										return new Object[] { tType, tPackage, pg };
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

	public static final boolean pattern_Enum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Enum_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Enum_29_1_createresult_blackB(org.gravity.tgg.modisco.Rules.Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Enum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Enum_29_2_isapplicablecore_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_Enum_29_2_isapplicablecore_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			org.eclipse.gmt.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_Enum_29_2_isapplicablecore_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_Enum_29_2_isapplicablecore_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Enum_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mPackageToTPackageList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMPackageToTPackage : mPackageToTPackageList.getEntryObjects()) {
				if (tmpMPackageToTPackage instanceof PackageToTPackage) {
					PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
					org.eclipse.gmt.modisco.java.Package mPackage = mPackageToTPackage.getSource();
					if (mPackage != null) {
						TPackage tPackage = mPackageToTPackage.getTarget();
						if (tPackage != null) {
							TypeGraph pg = tPackage.getTypeGraph();
							if (pg != null) {
								if (pattern_Enum_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_Enum_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_Enum_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												tPackage) == null) {
											if (pattern_Enum_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													pg) == null) {
												_result.add(new Object[] { mPackageToTPackageList, mPackageToTPackage,
														mPackage, tPackage, pg, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_Enum_29_3_solveCSP_bindingFBBBBBBB(org.gravity.tgg.modisco.Rules.Enum _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tPackage,
				mPackage, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Enum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Enum_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			org.gravity.tgg.modisco.Rules.Enum _this, IsApplicableMatch isApplicableMatch,
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage,
			TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Enum_29_3_solveCSP_binding = pattern_Enum_29_3_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
		if (result_pattern_Enum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Enum_29_3_solveCSP_binding[0];

			Object[] result_pattern_Enum_29_3_solveCSP_black = pattern_Enum_29_3_solveCSP_blackB(csp);
			if (result_pattern_Enum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Enum_29_4_checkCSP_expressionFBB(org.gravity.tgg.modisco.Rules.Enum _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Enum_29_5_checknacs_blackBBBB(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg };
	}

	public static final Object[] pattern_Enum_29_6_perform_blackBBBBB(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, ruleResult };
	}

	public static final Object[] pattern_Enum_29_6_perform_greenFBFBBFFBB(TPackage tPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		EnumDeclaration mType = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		Object _localVariable_3 = csp.getValue("mType", "name");
		Object _localVariable_4 = csp.getValue("mType", "proxy");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		tPackage.getOwnedTypes().add(tType);
		tPackage.getClasses().add(tType);
		pg.getClasses().add(tType);
		pg.getOwnedTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		mTypeToTType.setTarget(tType);
		ruleResult.getCorrObjects().add(mTypeToTType);
		mBodyToTAnnotation.setTarget(tType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mBodyToTAnnotation.setSource(mType);
		mTypeToTType.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		ruleResult.getSourceObjects().add(mType);
		String tType_tName_prime = (String) _localVariable_0;
		int tType_ID_prime = (int) _localVariable_1;
		boolean tType_tLib_prime = (boolean) _localVariable_2;
		String mType_name_prime = (String) _localVariable_3;
		boolean mType_proxy_prime = (boolean) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		tType.setTName(tType_tName_prime);
		tType.setID(Integer.valueOf(tType_ID_prime));
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tType, tPackage, mTypeToTType, mPackage, pg, mBodyToTAnnotation, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Enum_29_7_expressionFB(ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumImpl
