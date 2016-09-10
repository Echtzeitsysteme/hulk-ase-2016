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

import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PackageToTPackage;

import org.gravity.tgg.modisco.Rules.AnnotationType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAnnotationType;
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
 * An implementation of the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeImpl extends AbstractRuleImpl implements AnnotationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		// initial bindings
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_0_1_initialbindings_blackBBBB(this, match,
				mPackage, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
					+ "[mType] = " + mType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = "
					+ mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotationTypeImpl.pattern_AnnotationType_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotationTypeImpl
					.pattern_AnnotationType_0_4_collectelementstobetranslated_blackBBB(match, mPackage, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", "
						+ "[mType] = " + mType + ".");
			}
			AnnotationTypeImpl.pattern_AnnotationType_0_4_collectelementstobetranslated_greenBBBFF(match, mPackage,
					mType);
			// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[3];
			// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = AnnotationTypeImpl
					.pattern_AnnotationType_0_5_collectcontextelements_blackBBB(match, mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			AnnotationTypeImpl.pattern_AnnotationType_0_5_collectcontextelements_greenBB(match, mPackage);

			// register objects to match
			AnnotationTypeImpl.pattern_AnnotationType_0_6_registerobjectstomatch_expressionBBBB(this, match, mPackage,
					mType);
			return AnnotationTypeImpl.pattern_AnnotationType_0_7_expressionF();
		} else {
			return AnnotationTypeImpl.pattern_AnnotationType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationTypeImpl
				.pattern_AnnotationType_1_1_performtransformation_greenFFBBFBB(tPackage, pg, mType, csp);
		TAnnotationType tType = (TAnnotationType) result1_green[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[4];

		// collect translated elements
		Object[] result2_black = AnnotationTypeImpl.pattern_AnnotationType_1_2_collecttranslatedelements_blackBBBB(
				tType, mTypeToTType, mBodyToTAnnotation, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnnotationTypeImpl.pattern_AnnotationType_1_2_collecttranslatedelements_greenFBBBB(
				tType, mTypeToTType, mBodyToTAnnotation, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotationTypeImpl.pattern_AnnotationType_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mPackage] = "
					+ mPackage + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		AnnotationTypeImpl.pattern_AnnotationType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(ruleresult, tType,
				mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		AnnotationTypeImpl.pattern_AnnotationType_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		return AnnotationTypeImpl.pattern_AnnotationType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeImpl
				.pattern_AnnotationType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotationTypeImpl.pattern_AnnotationType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[0];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : AnnotationTypeImpl.pattern_AnnotationType_2_2_corematch_blackFBFBB(mPackage,
				mType, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : AnnotationTypeImpl
					.pattern_AnnotationType_2_3_findcontext_blackBBBFB(mPackageToTPackage, mPackage, tPackage, mType)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = AnnotationTypeImpl.pattern_AnnotationType_2_3_findcontext_greenBBBBBFFFFFF(
						mPackageToTPackage, mPackage, tPackage, pg, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[6];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotationTypeImpl
						.pattern_AnnotationType_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, mPackage, tPackage, pg, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[mPackage] = " + mPackage + ", "
							+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotationTypeImpl.pattern_AnnotationType_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AnnotationTypeImpl
							.pattern_AnnotationType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotationTypeImpl.pattern_AnnotationType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {// Create CSP
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
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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
		Eq eq = new Eq();
		CreateID createID = new CreateID();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mType_name, var_tType_tName);
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		eq_0.setRuleName("");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
			EObject mTypeToTType, EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation,
			EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tPackage", tPackage);
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
				.equals("java.AnnotationTypeDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		// initial bindings
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_10_1_initialbindings_blackBBBBB(this, match,
				tType, tPackage, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", "
					+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType, tPackage, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
					+ tPackage + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotationTypeImpl.pattern_AnnotationType_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotationTypeImpl
					.pattern_AnnotationType_10_4_collectelementstobetranslated_blackBBBB(match, tType, tPackage, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeImpl.pattern_AnnotationType_10_4_collectelementstobetranslated_greenBBBBFFFFF(match, tType,
					tPackage, pg);
			// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[5];
			// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tType__pg____pg = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = AnnotationTypeImpl
					.pattern_AnnotationType_10_5_collectcontextelements_blackBBBB(match, tType, tPackage, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeImpl.pattern_AnnotationType_10_5_collectcontextelements_greenBBBF(match, tPackage, pg);
			// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result5_green[3];

			// register objects to match
			AnnotationTypeImpl.pattern_AnnotationType_10_6_registerobjectstomatch_expressionBBBBB(this, match, tType,
					tPackage, pg);
			return AnnotationTypeImpl.pattern_AnnotationType_10_7_expressionF();
		} else {
			return AnnotationTypeImpl.pattern_AnnotationType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TAnnotationType tType = (TAnnotationType) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationTypeImpl.pattern_AnnotationType_11_1_performtransformation_greenBFBFFB(tType,
				mPackage, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_green[4];

		// collect translated elements
		Object[] result2_black = AnnotationTypeImpl.pattern_AnnotationType_11_2_collecttranslatedelements_blackBBBB(
				tType, mTypeToTType, mBodyToTAnnotation, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnnotationTypeImpl.pattern_AnnotationType_11_2_collecttranslatedelements_greenFBBBB(
				tType, mTypeToTType, mBodyToTAnnotation, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotationTypeImpl.pattern_AnnotationType_11_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mPackage] = "
					+ mPackage + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		AnnotationTypeImpl.pattern_AnnotationType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(ruleresult, tType,
				mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[8];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[9];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[12];
		// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[13];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[14];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[15];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[17];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		AnnotationTypeImpl.pattern_AnnotationType_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType);
		return AnnotationTypeImpl.pattern_AnnotationType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeImpl
				.pattern_AnnotationType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotationTypeImpl.pattern_AnnotationType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotationType tType = (TAnnotationType) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : AnnotationTypeImpl.pattern_AnnotationType_12_2_corematch_blackFBFBBB(tType,
				tPackage, pg, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : AnnotationTypeImpl.pattern_AnnotationType_12_3_findcontext_blackBBBBB(
					mPackageToTPackage, tType, mPackage, tPackage, pg)) {
				Object[] result3_green = AnnotationTypeImpl.pattern_AnnotationType_12_3_findcontext_greenBBBBBFFFFFFFFF(
						mPackageToTPackage, tType, mPackage, tPackage, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[7];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[8];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotationTypeImpl
						.pattern_AnnotationType_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, tType, mPackage, tPackage, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
									+ mPackageToTPackage + ", " + "[tType] = " + tType + ", " + "[mPackage] = "
									+ mPackage + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotationTypeImpl.pattern_AnnotationType_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AnnotationTypeImpl
							.pattern_AnnotationType_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotationTypeImpl.pattern_AnnotationType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		match.registerObject("tType", tType);
		match.registerObject("tPackage", tPackage);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {// Create CSP
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
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
			EObject mTypeToTType, EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation,
			EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tPackage", tPackage);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass())
				.equals("basic.TAnnotationType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_10(EMoflonEdge _edge_ownedElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeImpl.pattern_AnnotationType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotationTypeImpl
				.pattern_AnnotationType_20_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[0];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_black[1];
			Object[] result2_green = AnnotationTypeImpl
					.pattern_AnnotationType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotationTypeImpl
					.pattern_AnnotationType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mPackage, mType)) {
				// Ensure that the correct types of elements are matched
				if (AnnotationTypeImpl
						.pattern_AnnotationType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AnnotationTypeImpl
							.pattern_AnnotationType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotationTypeImpl.pattern_AnnotationType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_ownedTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeImpl
				.pattern_AnnotationType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeImpl.pattern_AnnotationType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotationTypeImpl
				.pattern_AnnotationType_21_2_testcorematchandDECs_blackFFFB(_edge_ownedTypes)) {
			TAnnotationType tType = (TAnnotationType) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = AnnotationTypeImpl
					.pattern_AnnotationType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotationTypeImpl
					.pattern_AnnotationType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							tType, tPackage, pg)) {
				// Ensure that the correct types of elements are matched
				if (AnnotationTypeImpl
						.pattern_AnnotationType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = AnnotationTypeImpl
							.pattern_AnnotationType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotationTypeImpl.pattern_AnnotationType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		CreateID createID1 = new CreateID();
		csp.getConstraints().add(createID1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("AnnotationType");
		eq0.solve(var_mType_name, var_tType_tName);

		createID1.setRuleName("AnnotationType");
		createID1.solve(var_tType_ID);

		eq2.setRuleName("AnnotationType");
		eq2.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tName.setBound(false);
			var_tType_ID.setBound(false);
			var_tType_tLib.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
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
		ruleResult.setRule("AnnotationType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		createID0.setRuleName("AnnotationType");
		createID0.solve(var_tType_ID);

		eq1.setRuleName("AnnotationType");
		eq1.solve(var_mType_name, var_tType_tName);

		eq2.setRuleName("AnnotationType");
		eq2.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			var_mType_proxy.setBound(false);
			createID0.solve(var_tType_ID);
			eq1.solve(var_mType_name, var_tType_tName);
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
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeImpl.pattern_AnnotationType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = AnnotationTypeImpl
				.pattern_AnnotationType_24_2_matchcontext_bindingFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		TAnnotationType tType = (TAnnotationType) result2_binding[0];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[1];
		TPackage tPackage = (TPackage) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_binding[4];
		for (Object[] result2_black : AnnotationTypeImpl.pattern_AnnotationType_24_2_matchcontext_blackFBBBBBBB(tType,
				mPackage, tPackage, pg, mType, sourceMatch, targetMatch)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			Object[] result2_green = AnnotationTypeImpl.pattern_AnnotationType_24_2_matchcontext_greenBBBBBBBFB(
					mPackageToTPackage, tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = AnnotationTypeImpl
					.pattern_AnnotationType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mPackageToTPackage, tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = AnnotationTypeImpl
						.pattern_AnnotationType_24_4_createcorrespondence_blackBBBBBB(tType, mPackage, tPackage, pg,
								mType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", "
							+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				AnnotationTypeImpl.pattern_AnnotationType_24_4_createcorrespondence_greenBFFBB(tType, mType,
						isApplicableMatch);
				// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result4_green[1];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[2];

				// add to returned result
				Object[] result5_black = AnnotationTypeImpl
						.pattern_AnnotationType_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				AnnotationTypeImpl.pattern_AnnotationType_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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
		Eq eq = new Eq();
		CreateID createID = new CreateID();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_mType_name, var_tType_tName);
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		eq_0.setRuleName("");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
	public boolean checkDEC_FWD(org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {// match tgg pattern
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_27_1_matchtggpattern_blackBB(mPackage,
				mType);
		if (result1_black != null) {
			return AnnotationTypeImpl.pattern_AnnotationType_27_2_expressionF();
		} else {
			return AnnotationTypeImpl.pattern_AnnotationType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotationType tType, TPackage tPackage, TypeGraph pg) {// match tgg pattern
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_28_1_matchtggpattern_blackBBB(tType,
				tPackage, pg);
		if (result1_black != null) {
			return AnnotationTypeImpl.pattern_AnnotationType_28_2_expressionF();
		} else {
			return AnnotationTypeImpl.pattern_AnnotationType_28_3_expressionF();
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
		Object[] result1_black = AnnotationTypeImpl.pattern_AnnotationType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeImpl.pattern_AnnotationType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AnnotationTypeImpl
				.pattern_AnnotationType_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = AnnotationTypeImpl
					.pattern_AnnotationType_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							mPackageToTPackage, mPackage, tPackage, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[mPackage] = " + mPackage + ", " + "[tPackage] = " + tPackage
						+ ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AnnotationTypeImpl.pattern_AnnotationType_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = AnnotationTypeImpl
						.pattern_AnnotationType_29_5_checknacs_blackBBBB(mPackageToTPackage, mPackage, tPackage, pg);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AnnotationTypeImpl.pattern_AnnotationType_29_6_perform_blackBBBBB(
							mPackageToTPackage, mPackage, tPackage, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[mPackage] = " + mPackage
								+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					AnnotationTypeImpl.pattern_AnnotationType_29_6_perform_greenFFBBBFFBB(mPackage, tPackage, pg,
							ruleResult, csp);
					// TAnnotationType tType = (TAnnotationType) result6_green[0];
					// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[5];
					// AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeImpl.pattern_AnnotationType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

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
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(createID);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		createID.setRuleName("");
		createID.solve(var_tType_ID);
		eq.setRuleName("");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_PACKAGE_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2), (TPackage) arguments.get(3),
					(TypeGraph) arguments.get(4), (AnnotationTypeDeclaration) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANNOTATION_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TANNOTATIONTYPE_PACKAGE_TPACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TAnnotationType) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(TPackage) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANNOTATION_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_PACKAGETOTPACKAGE_TANNOTATIONTYPE_PACKAGE_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TAnnotationType) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(TPackage) arguments.get(4), (TypeGraph) arguments.get(5),
					(AnnotationTypeDeclaration) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE___CHECK_DEC_FWD__PACKAGE_ANNOTATIONTYPEDECLARATION:
			return checkDEC_FWD((org.eclipse.gmt.modisco.java.Package) arguments.get(0),
					(AnnotationTypeDeclaration) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE___CHECK_DEC_BWD__TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TAnnotationType) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_PACKAGE_TPACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(PackageToTPackage) arguments.get(1), (org.eclipse.gmt.modisco.java.Package) arguments.get(2),
					(TPackage) arguments.get(3), (TypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationType_0_1_initialbindings_blackBBBB(AnnotationType _this, Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationType_0_2_SolveCSP_bindingFBBBB(AnnotationType _this, Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_0_2_SolveCSP_bindingAndBlackFBBBB(AnnotationType _this,
			Match match, org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		Object[] result_pattern_AnnotationType_0_2_SolveCSP_binding = pattern_AnnotationType_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mType);
		if (result_pattern_AnnotationType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationType_0_2_SolveCSP_black = pattern_AnnotationType_0_2_SolveCSP_blackB(csp);
			if (result_pattern_AnnotationType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_0_3_CheckCSP_expressionFBB(AnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
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

	public static final Object[] pattern_AnnotationType_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationType_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage) {
		match.getContextNodes().add(mPackage);
		return new Object[] { match, mPackage };
	}

	public static final void pattern_AnnotationType_0_6_registerobjectstomatch_expressionBBBB(AnnotationType _this,
			Match match, org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_AnnotationType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationType_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
				org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
							return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_1_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg, AnnotationTypeDeclaration mType, AnnotationType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationType_1_1_performtransformation_binding = pattern_AnnotationType_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationType_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationType_1_1_performtransformation_binding[0];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_AnnotationType_1_1_performtransformation_binding[1];
			TPackage tPackage = (TPackage) result_pattern_AnnotationType_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationType_1_1_performtransformation_binding[3];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result_pattern_AnnotationType_1_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationType_1_1_performtransformation_black = pattern_AnnotationType_1_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, mPackage, tPackage, pg, mType, _this, isApplicableMatch);
			if (result_pattern_AnnotationType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationType_1_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_1_1_performtransformation_greenFFBBFBB(TPackage tPackage,
			TypeGraph pg, AnnotationTypeDeclaration mType, CSP csp) {
		TAnnotationType tType = BasicFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		tPackage.getOwnedTypes().add(tType);
		pg.getTAnnotationTypes().add(tType);
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
		return new Object[] { tType, mTypeToTType, tPackage, pg, mBodyToTAnnotation, mType, csp };
	}

	public static final Object[] pattern_AnnotationType_1_2_collecttranslatedelements_blackBBBB(TAnnotationType tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation,
			AnnotationTypeDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_AnnotationType_1_2_collecttranslatedelements_greenFBBBB(TAnnotationType tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation,
			AnnotationTypeDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_AnnotationType_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType, EObject mTypeToTType,
			EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(mTypeToTType)) {
				if (!mPackageToTPackage.equals(tPackage)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!mTypeToTType.equals(tType)) {
								if (!mTypeToTType.equals(tPackage)) {
									if (!mTypeToTType.equals(pg)) {
										if (!mPackage.equals(mPackageToTPackage)) {
											if (!mPackage.equals(tType)) {
												if (!mPackage.equals(mTypeToTType)) {
													if (!mPackage.equals(tPackage)) {
														if (!mPackage.equals(pg)) {
															if (!mPackage.equals(mType)) {
																if (!tPackage.equals(tType)) {
																	if (!pg.equals(tType)) {
																		if (!pg.equals(tPackage)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation.equals(tType)) {
																					if (!mBodyToTAnnotation
																							.equals(mTypeToTType)) {
																						if (!mBodyToTAnnotation
																								.equals(mPackage)) {
																							if (!mBodyToTAnnotation
																									.equals(tPackage)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mType)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(mTypeToTType)) {
																												if (!mType
																														.equals(tPackage)) {
																													if (!mType
																															.equals(pg)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																tType,
																																mTypeToTType,
																																mPackage,
																																tPackage,
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

	public static final Object[] pattern_AnnotationType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mPackage, EObject tPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationType";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String mTypeToTType__mType____source_name_prime = "source";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
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
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____tAnnotationTypes);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____pg);
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
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType,
				tPackage__tType____ownedTypes, tType__tPackage____package, mBodyToTAnnotation__tType____target,
				mBodyToTAnnotation__mType____source, mTypeToTType__tType____target, pg__tType____tAnnotationTypes,
				mTypeToTType__mType____source, pg__tType____ownedTypes, tType__pg____pg,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_AnnotationType_1_5_registerobjects_expressionBBBBBBBBBB(AnnotationType _this,
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType, EObject mTypeToTType,
			EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg,
				mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_AnnotationType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_2_1_preparereturnvalue_bindingFB(AnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationType _this) {
		Object[] result_pattern_AnnotationType_2_1_preparereturnvalue_binding = pattern_AnnotationType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationType_2_1_preparereturnvalue_black = pattern_AnnotationType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AnnotationType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			if (tmpMType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
				return new Object[] { mPackage, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_2_2_corematch_blackFBFBB(
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
			TPackage tPackage = mPackageToTPackage.getTarget();
			if (tPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, mPackage, tPackage, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_2_3_findcontext_blackBBBFB(
			PackageToTPackage mPackageToTPackage, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage,
			AnnotationTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.equals(mPackageToTPackage.getSource())) {
			if (mPackage.getOwnedElements().contains(mType)) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					TypeGraph pg = tPackage.getTypeGraph();
					if (pg != null) {
						_result.add(new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationType_2_3_findcontext_greenBBBBBFFFFFF(
			PackageToTPackage mPackageToTPackage, org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg, AnnotationTypeDeclaration mType) {
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
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
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
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, isApplicableMatch,
				tPackage__pg____typeGraph, mPackageToTPackage__mPackage____source, mPackage__mType____ownedElements,
				mType__mPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationType_2_4_solveCSP_bindingFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackageToTPackage, mPackage,
				tPackage, pg, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_2_4_solveCSP_bindingAndBlackFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {
		Object[] result_pattern_AnnotationType_2_4_solveCSP_binding = pattern_AnnotationType_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, mType);
		if (result_pattern_AnnotationType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationType_2_4_solveCSP_black = pattern_AnnotationType_2_4_solveCSP_blackB(csp);
			if (result_pattern_AnnotationType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
						mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_2_5_checkCSP_expressionFBB(AnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_10_1_initialbindings_blackBBBBB(AnnotationType _this,
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { _this, match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationType_10_2_SolveCSP_bindingFBBBBB(AnnotationType _this, Match match,
			TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_10_2_SolveCSP_bindingAndBlackFBBBBB(AnnotationType _this,
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		Object[] result_pattern_AnnotationType_10_2_SolveCSP_binding = pattern_AnnotationType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tPackage, pg);
		if (result_pattern_AnnotationType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationType_10_2_SolveCSP_black = pattern_AnnotationType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tPackage, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_10_3_CheckCSP_expressionFBB(AnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationType_10_4_collectelementstobetranslated_greenBBBBFFFFF(Match match,
			TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____tAnnotationTypes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____pg);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { match, tType, tPackage, pg, tPackage__tType____ownedTypes, tType__tPackage____package,
				pg__tType____tAnnotationTypes, pg__tType____ownedTypes, tType__pg____pg };
	}

	public static final Object[] pattern_AnnotationType_10_5_collectcontextelements_blackBBBB(Match match,
			TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationType_10_5_collectcontextelements_greenBBBF(Match match,
			TPackage tPackage, TypeGraph pg) {
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

	public static final void pattern_AnnotationType_10_6_registerobjectstomatch_expressionBBBBB(AnnotationType _this,
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tType, tPackage, pg);

	}

	public static final boolean pattern_AnnotationType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationType_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpTPackage = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpTPackage instanceof TPackage) {
						TPackage tPackage = (TPackage) tmpTPackage;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_11_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationType_11_1_performtransformation_binding = pattern_AnnotationType_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationType_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationType_11_1_performtransformation_binding[0];
			TAnnotationType tType = (TAnnotationType) result_pattern_AnnotationType_11_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_AnnotationType_11_1_performtransformation_binding[2];
			TPackage tPackage = (TPackage) result_pattern_AnnotationType_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationType_11_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationType_11_1_performtransformation_black = pattern_AnnotationType_11_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tType, mPackage, tPackage, pg, _this, isApplicableMatch);
			if (result_pattern_AnnotationType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationType_11_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_11_1_performtransformation_greenBFBFFB(TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, CSP csp) {
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
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

	public static final Object[] pattern_AnnotationType_11_2_collecttranslatedelements_blackBBBB(TAnnotationType tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation,
			AnnotationTypeDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_AnnotationType_11_2_collecttranslatedelements_greenFBBBB(TAnnotationType tType,
			TypeToTAbstractType mTypeToTType, BodyDeclarationToTAnnotatable mBodyToTAnnotation,
			AnnotationTypeDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_AnnotationType_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType, EObject mTypeToTType,
			EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(mTypeToTType)) {
				if (!mPackageToTPackage.equals(tPackage)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!mTypeToTType.equals(tType)) {
								if (!mTypeToTType.equals(tPackage)) {
									if (!mTypeToTType.equals(pg)) {
										if (!mPackage.equals(mPackageToTPackage)) {
											if (!mPackage.equals(tType)) {
												if (!mPackage.equals(mTypeToTType)) {
													if (!mPackage.equals(tPackage)) {
														if (!mPackage.equals(pg)) {
															if (!mPackage.equals(mType)) {
																if (!tPackage.equals(tType)) {
																	if (!pg.equals(tType)) {
																		if (!pg.equals(tPackage)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation.equals(tType)) {
																					if (!mBodyToTAnnotation
																							.equals(mTypeToTType)) {
																						if (!mBodyToTAnnotation
																								.equals(mPackage)) {
																							if (!mBodyToTAnnotation
																									.equals(tPackage)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mType)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(mTypeToTType)) {
																												if (!mType
																														.equals(tPackage)) {
																													if (!mType
																															.equals(pg)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																tType,
																																mTypeToTType,
																																mPackage,
																																tPackage,
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

	public static final Object[] pattern_AnnotationType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mPackage, EObject tPackage,
			EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationType";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String mTypeToTType__mType____source_name_prime = "source";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
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
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____tAnnotationTypes);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____pg);
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
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType,
				tPackage__tType____ownedTypes, tType__tPackage____package, mBodyToTAnnotation__tType____target,
				mBodyToTAnnotation__mType____source, mTypeToTType__tType____target, pg__tType____tAnnotationTypes,
				mTypeToTType__mType____source, pg__tType____ownedTypes, tType__pg____pg,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_AnnotationType_11_5_registerobjects_expressionBBBBBBBBBB(AnnotationType _this,
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tType, EObject mTypeToTType,
			EObject mPackage, EObject tPackage, EObject pg, EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, tType, mTypeToTType, mPackage, tPackage, pg,
				mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_AnnotationType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_12_1_preparereturnvalue_bindingFB(AnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationType _this) {
		Object[] result_pattern_AnnotationType_12_1_preparereturnvalue_binding = pattern_AnnotationType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationType_12_1_preparereturnvalue_black = pattern_AnnotationType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AnnotationType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tPackage");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTType = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTType instanceof TAnnotationType) {
			TAnnotationType tType = (TAnnotationType) tmpTType;
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

	public static final Iterable<Object[]> pattern_AnnotationType_12_2_corematch_blackFBFBBB(TAnnotationType tType,
			TPackage tPackage, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
			org.eclipse.gmt.modisco.java.Package mPackage = mPackageToTPackage.getSource();
			if (mPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_12_3_findcontext_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tPackage.getOwnedTypes().contains(tType)) {
			if (pg.equals(tPackage.getTypeGraph())) {
				if (mPackage.equals(mPackageToTPackage.getSource())) {
					if (pg.getTAnnotationTypes().contains(tType)) {
						if (pg.getOwnedTypes().contains(tType)) {
							if (tPackage.equals(mPackageToTPackage.getTarget())) {
								_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationType_12_3_findcontext_greenBBBBBFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____tAnnotationTypes);
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
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, isApplicableMatch,
				tPackage__tType____ownedTypes, tType__tPackage____package, tPackage__pg____typeGraph,
				mPackageToTPackage__mPackage____source, pg__tType____tAnnotationTypes, pg__tType____ownedTypes,
				tType__pg____pg, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationType_12_4_solveCSP_bindingFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tType, mPackage,
				tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_12_4_solveCSP_bindingAndBlackFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {
		Object[] result_pattern_AnnotationType_12_4_solveCSP_binding = pattern_AnnotationType_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg);
		if (result_pattern_AnnotationType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationType_12_4_solveCSP_black = pattern_AnnotationType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_12_5_checkCSP_expressionFBB(AnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_20_1_preparereturnvalue_bindingFB(AnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationType _this) {
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

	public static final Object[] pattern_AnnotationType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationType _this) {
		Object[] result_pattern_AnnotationType_20_1_preparereturnvalue_binding = pattern_AnnotationType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationType_20_1_preparereturnvalue_black = pattern_AnnotationType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_ownedElements.getSrc();
		if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
			EObject tmpMType = _edge_ownedElements.getTrg();
			if (tmpMType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
				if (mPackage.getOwnedElements().contains(mType)) {
					_result.add(new Object[] { mPackage, mType, _edge_ownedElements });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationType _this, Match match, org.eclipse.gmt.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_21_1_preparereturnvalue_bindingFB(AnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationType _this) {
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

	public static final Object[] pattern_AnnotationType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationType _this) {
		Object[] result_pattern_AnnotationType_21_1_preparereturnvalue_binding = pattern_AnnotationType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationType_21_1_preparereturnvalue_black = pattern_AnnotationType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationType_21_2_testcorematchandDECs_black_nac_0BB(TAnnotationType tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_tAnnotationTypes_263252 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "tAnnotationTypes")) {
			if (!pg.equals(__DEC_tType_tAnnotationTypes_263252)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_21_2_testcorematchandDECs_black_nac_1BB(TAnnotationType tType,
			TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_272639 = tType.getPackage();
		if (__DEC_tType_ownedTypes_272639 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_272639)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_ownedTypes.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTType = _edge_ownedTypes.getTrg();
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (tPackage.getOwnedTypes().contains(tType)) {
					TypeGraph pg = tPackage.getTypeGraph();
					if (pg != null) {
						if (pg.getTAnnotationTypes().contains(tType)) {
							if (pg.getOwnedTypes().contains(tType)) {
								if (pattern_AnnotationType_21_2_testcorematchandDECs_black_nac_1BB(tType,
										tPackage) == null) {
									if (pattern_AnnotationType_21_2_testcorematchandDECs_black_nac_0BB(tType,
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

		return _result;
	}

	public static final Object[] pattern_AnnotationType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationType _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tPackage, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_24_1_prepare_blackB(AnnotationType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationType_24_2_matchcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = sourceMatch.getObject("mPackage");
		EObject _localVariable_2 = targetMatch.getObject("tPackage");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTType = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTType instanceof TAnnotationType) {
			TAnnotationType tType = (TAnnotationType) tmpTType;
			if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
				org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
							return new Object[] { tType, mPackage, tPackage, pg, mType, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_24_2_matchcontext_blackFBBBBBBB(TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (tPackage.getOwnedTypes().contains(tType)) {
				if (pg.equals(tPackage.getTypeGraph())) {
					if (pg.getTAnnotationTypes().contains(tType)) {
						if (pg.getOwnedTypes().contains(tType)) {
							if (mPackage.getOwnedElements().contains(mType)) {
								for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
									if (tPackage.equals(mPackageToTPackage.getTarget())) {
										_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg,
												mType, sourceMatch, targetMatch });
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

	public static final Object[] pattern_AnnotationType_24_2_matchcontext_greenBBBBBBBFB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "AnnotationType";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, mType, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_AnnotationType_24_3_checkcsp_bindingFBBBBBBBBBB(AnnotationType _this,
			CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mPackageToTPackage, tType, mPackage,
				tPackage, pg, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg,
					mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_24_3_checkcsp_bindingAndBlackFBBBBBBBBBB(AnnotationType _this,
			CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationType_24_3_checkcsp_binding = pattern_AnnotationType_24_3_checkcsp_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg, mType, sourceMatch,
				targetMatch);
		if (result_pattern_AnnotationType_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_24_3_checkcsp_binding[0];

			Object[] result_pattern_AnnotationType_24_3_checkcsp_black = pattern_AnnotationType_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_AnnotationType_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg,
						mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_24_4_createcorrespondence_blackBBBBBB(TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, CCMatch isApplicableMatch) {
		return new Object[] { tType, mPackage, tPackage, pg, mType, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationType_24_4_createcorrespondence_greenBFFBB(TAnnotationType tType,
			AnnotationTypeDeclaration mType, CCMatch isApplicableMatch) {
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

	public static final Object[] pattern_AnnotationType_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationType_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationType_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_27_1_matchtggpattern_blackBB(
			org.eclipse.gmt.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		if (mPackage.getOwnedElements().contains(mType)) {
			return new Object[] { mPackage, mType };
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationType_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_28_1_matchtggpattern_black_nac_0BB(TAnnotationType tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_tAnnotationTypes_151532 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "tAnnotationTypes")) {
			if (!pg.equals(__DEC_tType_tAnnotationTypes_151532)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_28_1_matchtggpattern_black_nac_1BB(TAnnotationType tType,
			TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_478170 = tType.getPackage();
		if (__DEC_tType_ownedTypes_478170 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_478170)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationType_28_1_matchtggpattern_blackBBB(TAnnotationType tType,
			TPackage tPackage, TypeGraph pg) {
		if (tPackage.getOwnedTypes().contains(tType)) {
			if (pg.equals(tPackage.getTypeGraph())) {
				if (pg.getTAnnotationTypes().contains(tType)) {
					if (pg.getOwnedTypes().contains(tType)) {
						if (pattern_AnnotationType_28_1_matchtggpattern_black_nac_0BB(tType, pg) == null) {
							if (pattern_AnnotationType_28_1_matchtggpattern_black_nac_1BB(tType, tPackage) == null) {
								return new Object[] { tType, tPackage, pg };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationType_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationType_29_1_createresult_blackB(AnnotationType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.gmt.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationType_29_2_isapplicablecore_blackFFFFFBB(
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
								if (pattern_AnnotationType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_AnnotationType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_AnnotationType_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												tPackage) == null) {
											if (pattern_AnnotationType_29_2_isapplicablecore_black_nac_3BB(ruleResult,
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

	public static final Object[] pattern_AnnotationType_29_3_solveCSP_bindingFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, mPackage,
				tPackage, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationType_29_3_solveCSP_bindingAndBlackFBBBBBBB(AnnotationType _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationType_29_3_solveCSP_binding = pattern_AnnotationType_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, ruleResult);
		if (result_pattern_AnnotationType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationType_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationType_29_3_solveCSP_black = pattern_AnnotationType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationType_29_4_checkCSP_expressionFBB(AnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationType_29_5_checknacs_blackBBBB(PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationType_29_6_perform_blackBBBBB(PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, ruleResult };
	}

	public static final Object[] pattern_AnnotationType_29_6_perform_greenFFBBBFFBB(
			org.eclipse.gmt.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TAnnotationType tType = BasicFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		Object _localVariable_3 = csp.getValue("mType", "name");
		Object _localVariable_4 = csp.getValue("mType", "proxy");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		tPackage.getOwnedTypes().add(tType);
		pg.getTAnnotationTypes().add(tType);
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
		return new Object[] { tType, mTypeToTType, mPackage, tPackage, pg, mBodyToTAnnotation, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeImpl
