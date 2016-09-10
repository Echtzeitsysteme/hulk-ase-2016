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
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PackageToTPackage;

import org.gravity.tgg.modisco.Rules.AnnotationTypeWithValue;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Annotation Type With Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeWithValueImpl extends AbstractRuleImpl implements AnnotationTypeWithValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeWithValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeWithValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage,
			Type type, AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {
		// initial bindings
		Object[] result1_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_0_1_initialbindings_blackBBBBBBB(this, match, access, mPackage, type,
						mType, member);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[access] = " + access + ", "
					+ "[mPackage] = " + mPackage + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ", "
					+ "[member] = " + member + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, access, mPackage,
						type, mType, member);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[access] = " + access + ", " + "[mPackage] = "
					+ mPackage + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ", " + "[member] = " + member
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_0_4_collectelementstobetranslated_blackBBBBBB(match, access,
							mPackage, type, mType, member);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[access] = " + access + ", " + "[mPackage] = "
						+ mPackage + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ", " + "[member] = "
						+ member + ".");
			}
			AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_0_4_collectelementstobetranslated_greenBBBBBBFFFFFFF(match, access,
							mPackage, type, mType, member);
			// EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			// EMoflonEdge access__type____type = (EMoflonEdge) result4_green[7];
			// EMoflonEdge member__mType____abstractTypeDeclaration = (EMoflonEdge) result4_green[8];
			// EMoflonEdge mType__member____bodyDeclarations = (EMoflonEdge) result4_green[9];
			// EMoflonEdge member__access____type = (EMoflonEdge) result4_green[10];
			// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[11];
			// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_0_5_collectcontextelements_blackBBBBBB(match, access, mPackage,
							type, mType, member);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[access] = " + access + ", " + "[mPackage] = "
						+ mPackage + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ", " + "[member] = "
						+ member + ".");
			}
			AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_0_5_collectcontextelements_greenBBB(match,
					mPackage, type);

			// register objects to match
			AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_0_6_registerobjectstomatch_expressionBBBBBBB(
					this, match, access, mPackage, type, mType, member);
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_0_7_expressionF();
		} else {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TypeAccess access = (TypeAccess) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		TAbstractType tAType = (TAbstractType) result1_bindingAndBlack[3];
		Type type = (Type) result1_bindingAndBlack[4];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_bindingAndBlack[5];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[6];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[7];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[8];
		TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_1_performtransformation_greenFFBBBFB(mType, tPackage, pg, csp);
		TAnnotationType tType = (TAnnotationType) result1_green[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[5];

		// collect translated elements
		Object[] result2_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_2_collecttranslatedelements_blackBBBBBB(access, tType, mTypeToTType,
						mType, member, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[access] = " + access + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mType] = " + mType + ", " + "[member] = " + member + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_2_collecttranslatedelements_greenFBBBBBB(access, tType, mTypeToTType,
						mType, member, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult,
						mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type, mType, tPackage, pg,
						member, mBodyToTAnnotation, typeToTAType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[access] = " + access + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mPackage] = " + mPackage + ", " + "[tAType] = " + tAType + ", " + "[type] = " + type
					+ ", " + "[mType] = " + mType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", "
					+ "[member] = " + member + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[typeToTAType] = " + typeToTAType + ".");
		}
		AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						access, tType, mTypeToTType, mPackage, type, mType, tPackage, pg, member, mBodyToTAnnotation);
		// EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		// EMoflonEdge access__type____type = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge member__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mType__member____bodyDeclarations = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge member__access____type = (EMoflonEdge) result3_green[17];
		// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[20];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[21];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[22];
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[23];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type, mType, tPackage,
				pg, member, mBodyToTAnnotation, typeToTAType);
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess access = (TypeAccess) result2_binding[0];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[1];
		Type type = (Type) result2_binding[2];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_binding[3];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_binding[4];
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_2_2_corematch_blackFBBFBBFBFB(access, mPackage, type, mType, member,
						match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TAbstractType tAType = (TAbstractType) result2_black[3];
			TPackage tPackage = (TPackage) result2_black[6];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_2_3_findcontext_blackBBBBBBBFBB(mPackageToTPackage, access,
							mPackage, tAType, type, mType, tPackage, member, typeToTAType)) {
				TypeGraph pg = (TypeGraph) result3_black[7];
				Object[] result3_green = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
								mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg, member,
								typeToTAType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				// EMoflonEdge access__type____type = (EMoflonEdge) result3_green[12];
				// EMoflonEdge member__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mType__member____bodyDeclarations = (EMoflonEdge) result3_green[14];
				// EMoflonEdge typeToTAType__type____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge member__access____type = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[19];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge typeToTAType__tAType____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pg__tAType____ownedTypes = (EMoflonEdge) result3_green[22];
				// EMoflonEdge tAType__pg____pg = (EMoflonEdge) result3_green[23];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage,
								pg, member, typeToTAType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[access] = " + access + ", "
							+ "[mPackage] = " + mPackage + ", " + "[tAType] = " + tAType + ", " + "[type] = " + type
							+ ", " + "[mType] = " + mType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg
							+ ", " + "[member] = " + member + ", " + "[typeToTAType] = " + typeToTAType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AnnotationTypeWithValueImpl
							.pattern_AnnotationTypeWithValue_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		match.registerObject("access", access);
		match.registerObject("mPackage", mPackage);
		match.registerObject("type", type);
		match.registerObject("mType", mType);
		match.registerObject("member", member);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage,
			Type type, AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {// Create CSP
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
			TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg, AnnotationTypeMemberDeclaration member,
			TypeToTAbstractType typeToTAType) {// Create CSP
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
		isApplicableMatch.registerObject("access", access);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tAType", tAType);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("typeToTAType", typeToTAType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access,
			EObject tType, EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType,
			EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tAType", tAType);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("member", member);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("typeToTAType", typeToTAType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("access").eClass()).equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass())
						.equals("java.AnnotationTypeDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("member").eClass())
						.equals("java.AnnotationTypeMemberDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		// initial bindings
		Object[] result1_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_10_1_initialbindings_blackBBBBBB(this, match, tType, tAType, tPackage,
						pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", "
					+ "[tAType] = " + tAType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, tType, tAType,
						tPackage, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tAType] = " + tAType
					+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_10_4_collectelementstobetranslated_blackBBBBB(match, tType, tAType,
							tPackage, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tAType] = "
						+ tAType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_10_4_collectelementstobetranslated_greenBBBBFFFFF(match, tType,
							tPackage, pg);
			// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result4_green[4];
			// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tType__pg____pg = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result4_green[7];
			// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[8];

			// collect context elements
			Object[] result5_black = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_10_5_collectcontextelements_blackBBBBB(match, tType, tAType,
							tPackage, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tAType] = "
						+ tAType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_10_5_collectcontextelements_greenBBBBFFF(match,
					tAType, tPackage, pg);
			// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result5_green[4];
			// EMoflonEdge pg__tAType____ownedTypes = (EMoflonEdge) result5_green[5];
			// EMoflonEdge tAType__pg____pg = (EMoflonEdge) result5_green[6];

			// register objects to match
			AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_10_6_registerobjectstomatch_expressionBBBBBB(
					this, match, tType, tAType, tPackage, pg);
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_10_7_expressionF();
		} else {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TAnnotationType tType = (TAnnotationType) result1_bindingAndBlack[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result1_bindingAndBlack[2];
		TAbstractType tAType = (TAbstractType) result1_bindingAndBlack[3];
		Type type = (Type) result1_bindingAndBlack[4];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[5];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[6];
		TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_1_performtransformation_greenFBFBBFFFB(tType, mPackage, type, csp);
		TypeAccess access = (TypeAccess) result1_green[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[2];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_green[5];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result1_green[6];
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result1_green[7];

		// collect translated elements
		Object[] result2_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_2_collecttranslatedelements_blackBBBBBB(access, tType, mTypeToTType,
						mType, member, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[access] = " + access + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mType] = " + mType + ", " + "[member] = " + member + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ".");
		}
		Object[] result2_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_2_collecttranslatedelements_greenFBBBBBB(access, tType,
						mTypeToTType, mType, member, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult,
						mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type, mType, tPackage, pg,
						member, mBodyToTAnnotation, typeToTAType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
					+ "[access] = " + access + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mPackage] = " + mPackage + ", " + "[tAType] = " + tAType + ", " + "[type] = " + type
					+ ", " + "[mType] = " + mType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", "
					+ "[member] = " + member + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[typeToTAType] = " + typeToTAType + ".");
		}
		AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						access, tType, mTypeToTType, mPackage, type, mType, tPackage, pg, member, mBodyToTAnnotation);
		// EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		// EMoflonEdge access__type____type = (EMoflonEdge) result3_green[12];
		// EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[13];
		// EMoflonEdge member__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
		// EMoflonEdge mType__member____bodyDeclarations = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[16];
		// EMoflonEdge member__access____type = (EMoflonEdge) result3_green[17];
		// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[18];
		// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[20];
		// EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[21];
		// EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[22];
		// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[23];
		// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[25];
		// EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type, mType, tPackage,
				pg, member, mBodyToTAnnotation, typeToTAType);
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotationType tType = (TAnnotationType) result2_binding[0];
		TAbstractType tAType = (TAbstractType) result2_binding[1];
		TPackage tPackage = (TPackage) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_12_2_corematch_blackFBFBFBBFB(tType, tAType, tPackage, pg, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			Type type = (Type) result2_black[4];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_12_3_findcontext_blackBBBBBBBB(mPackageToTPackage, tType, mPackage,
							tAType, type, tPackage, pg, typeToTAType)) {
				Object[] result3_green = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(mPackageToTPackage,
								tType, mPackage, tAType, type, tPackage, pg, typeToTAType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge typeToTAType__type____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pg__tType____tAnnotationTypes = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[11];
				// EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge typeToTAType__tAType____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pg__tAType____ownedTypes = (EMoflonEdge) result3_green[18];
				// EMoflonEdge tAType__pg____pg = (EMoflonEdge) result3_green[19];
				// EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg,
								typeToTAType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tType] = " + tType + ", "
							+ "[mPackage] = " + mPackage + ", " + "[tAType] = " + tAType + ", " + "[type] = " + type
							+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[typeToTAType] = "
							+ typeToTAType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_12_5_checkCSP_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = AnnotationTypeWithValueImpl
							.pattern_AnnotationTypeWithValue_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		match.registerObject("tType", tType);
		match.registerObject("tAType", tAType);
		match.registerObject("tPackage", tPackage);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {// Create CSP
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
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {// Create CSP
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
		isApplicableMatch.registerObject("tAType", tAType);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("typeToTAType", typeToTAType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access,
			EObject tType, EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType,
			EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tAType", tAType);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("member", member);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("typeToTAType", typeToTAType);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_24(EMoflonEdge _edge_usagesInTypeAccess) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_20_2_testcorematchandDECs_blackFFFFFB(_edge_usagesInTypeAccess)) {
			TypeAccess access = (TypeAccess) result2_black[0];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[1];
			Type type = (Type) result2_black[2];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_black[3];
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_black[4];
			Object[] result2_green = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, access, mPackage, type, mType, member)) {
				// Ensure that the correct types of elements are matched
				if (AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AnnotationTypeWithValueImpl
							.pattern_AnnotationTypeWithValue_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(EMoflonEdge _edge_tAnnotationTypes) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_blackFFFFB(_edge_tAnnotationTypes)) {
			TAnnotationType tType = (TAnnotationType) result2_black[0];
			TAbstractType tAType = (TAbstractType) result2_black[1];
			TPackage tPackage = (TPackage) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			Object[] result2_green = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, tType, tAType, tPackage, pg)) {
				// Ensure that the correct types of elements are matched
				if (AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = AnnotationTypeWithValueImpl
							.pattern_AnnotationTypeWithValue_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeWithValue");
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

		eq0.setRuleName("AnnotationTypeWithValue");
		eq0.solve(var_mType_name, var_tType_tName);

		createID1.setRuleName("AnnotationTypeWithValue");
		createID1.solve(var_tType_ID);

		eq2.setRuleName("AnnotationTypeWithValue");
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
		ruleResult.setRule("AnnotationTypeWithValue");
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

		createID0.setRuleName("AnnotationTypeWithValue");
		createID0.solve(var_tType_ID);

		eq1.setRuleName("AnnotationTypeWithValue");
		eq1.solve(var_mType_name, var_tType_tName);

		eq2.setRuleName("AnnotationTypeWithValue");
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
		Object[] result1_black = AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_24_2_matchcontext_bindingFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeAccess access = (TypeAccess) result2_binding[0];
		TAnnotationType tType = (TAnnotationType) result2_binding[1];
		org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_binding[2];
		TAbstractType tAType = (TAbstractType) result2_binding[3];
		Type type = (Type) result2_binding[4];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_binding[5];
		TPackage tPackage = (TPackage) result2_binding[6];
		TypeGraph pg = (TypeGraph) result2_binding[7];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_binding[8];
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_24_2_matchcontext_blackFBBBBBBBBBFBB(access, tType, mPackage, tAType,
						type, mType, tPackage, pg, member, sourceMatch, targetMatch)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result2_black[10];
			Object[] result2_green = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_24_2_matchcontext_greenBBBBBBBBBBBBFB(mPackageToTPackage, access,
							tType, mPackage, tAType, type, mType, tPackage, pg, member, typeToTAType, sourceMatch,
							targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(this,
							isApplicableMatch, mPackageToTPackage, access, tType, mPackage, tAType, type, mType,
							tPackage, pg, member, typeToTAType, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_24_4_createcorrespondence_blackBBBBBBBBBB(access, tType,
								mPackage, tAType, type, mType, tPackage, pg, member, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [create correspondence] failed." + " Variables: " + "[access] = "
									+ access + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", "
									+ "[tAType] = " + tAType + ", " + "[type] = " + type + ", " + "[mType] = " + mType
									+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[member] = "
									+ member + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_24_4_createcorrespondence_greenBFBFB(tType,
						mType, isApplicableMatch);
				// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result4_green[1];
				// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result4_green[3];

				// add to returned result
				Object[] result5_black = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_24_5_addtoreturnedresult_blackBB(result, isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_24_5_addtoreturnedresult_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TypeAccess access, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
		isApplicableMatch.registerObject("access", access);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tAType", tAType);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("typeToTAType", typeToTAType);
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
	public boolean checkDEC_FWD(TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, Type type,
			AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {// match tgg pattern
		Object[] result1_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_27_1_matchtggpattern_blackBBBBB(access, mPackage, type, mType, member);
		if (result1_black != null) {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_27_2_expressionF();
		} else {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotationType tType, TAbstractType tAType, TPackage tPackage, TypeGraph pg) {// match tgg pattern
		Object[] result1_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_28_1_matchtggpattern_blackBBBB(tType, tAType, tPackage, pg);
		if (result1_black != null) {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_28_2_expressionF();
		} else {
			return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_28_3_expressionF();
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
		Object[] result1_black = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AnnotationTypeWithValueImpl
				.pattern_AnnotationTypeWithValue_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];
			TAbstractType tAType = (TAbstractType) result2_black[5];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result2_black[6];
			Type type = (Type) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = AnnotationTypeWithValueImpl
					.pattern_AnnotationTypeWithValue_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mPackageToTPackage, mPackage, tAType, type, tPackage, pg, typeToTAType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[mPackage] = " + mPackage + ", " + "[tAType] = " + tAType + ", "
						+ "[type] = " + type + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", "
						+ "[typeToTAType] = " + typeToTAType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = AnnotationTypeWithValueImpl
						.pattern_AnnotationTypeWithValue_29_5_checknacs_blackBBBBBBB(mPackageToTPackage, mPackage,
								tAType, type, tPackage, pg, typeToTAType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AnnotationTypeWithValueImpl
							.pattern_AnnotationTypeWithValue_29_6_perform_blackBBBBBBBB(mPackageToTPackage, mPackage,
									tAType, type, tPackage, pg, typeToTAType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[mPackage] = " + mPackage
								+ ", " + "[tAType] = " + tAType + ", " + "[type] = " + type + ", " + "[tPackage] = "
								+ tPackage + ", " + "[pg] = " + pg + ", " + "[typeToTAType] = " + typeToTAType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_29_6_perform_greenFFFBBFBBFFBB(mPackage,
							type, tPackage, pg, ruleResult, csp);
					// TypeAccess access = (TypeAccess) result6_green[0];
					// TAnnotationType tType = (TAnnotationType) result6_green[1];
					// TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[2];
					// AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result6_green[5];
					// AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result6_green[8];
					// BodyDeclarationToTAnnotatable mBodyToTAnnotation = (BodyDeclarationToTAnnotatable) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeWithValueImpl.pattern_AnnotationTypeWithValue_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type, TPackage tPackage,
			TypeGraph pg, TypeToTAbstractType typeToTAType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tAType", tAType);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("typeToTAType", typeToTAType);
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
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_PACKAGE_TYPE_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (AnnotationTypeMemberDeclaration) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_PACKAGE_TYPE_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (AnnotationTypeMemberDeclaration) arguments.get(5));
			return null;
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_PACKAGE_TYPE_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(2), (Type) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (AnnotationTypeMemberDeclaration) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TYPEACCESS_PACKAGE_TABSTRACTTYPE_TYPE_ANNOTATIONTYPEDECLARATION_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEMEMBERDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TypeAccess) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(TAbstractType) arguments.get(4), (Type) arguments.get(5),
					(AnnotationTypeDeclaration) arguments.get(6), (TPackage) arguments.get(7),
					(TypeGraph) arguments.get(8), (AnnotationTypeMemberDeclaration) arguments.get(9),
					(TypeToTAbstractType) arguments.get(10));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TypeGraph) arguments.get(4));
			return null;
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TANNOTATIONTYPE_PACKAGE_TABSTRACTTYPE_TYPE_TPACKAGE_TYPEGRAPH_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TAnnotationType) arguments.get(2), (org.eclipse.gmt.modisco.java.Package) arguments.get(3),
					(TAbstractType) arguments.get(4), (Type) arguments.get(5), (TPackage) arguments.get(6),
					(TypeGraph) arguments.get(7), (TypeToTAbstractType) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_24((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_PACKAGETOTPACKAGE_TYPEACCESS_TANNOTATIONTYPE_PACKAGE_TABSTRACTTYPE_TYPE_ANNOTATIONTYPEDECLARATION_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEMEMBERDECLARATION_TYPETOTABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TypeAccess) arguments.get(2), (TAnnotationType) arguments.get(3),
					(org.eclipse.gmt.modisco.java.Package) arguments.get(4), (TAbstractType) arguments.get(5),
					(Type) arguments.get(6), (AnnotationTypeDeclaration) arguments.get(7), (TPackage) arguments.get(8),
					(TypeGraph) arguments.get(9), (AnnotationTypeMemberDeclaration) arguments.get(10),
					(TypeToTAbstractType) arguments.get(11), (Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_DEC_FWD__TYPEACCESS_PACKAGE_TYPE_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (org.eclipse.gmt.modisco.java.Package) arguments.get(1),
					(Type) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(AnnotationTypeMemberDeclaration) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___CHECK_DEC_BWD__TANNOTATIONTYPE_TABSTRACTTYPE_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TAnnotationType) arguments.get(0), (TAbstractType) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_PACKAGE_TABSTRACTTYPE_TYPE_TPACKAGE_TYPEGRAPH_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(PackageToTPackage) arguments.get(1), (org.eclipse.gmt.modisco.java.Package) arguments.get(2),
					(TAbstractType) arguments.get(3), (Type) arguments.get(4), (TPackage) arguments.get(5),
					(TypeGraph) arguments.get(6), (TypeToTAbstractType) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_WITH_VALUE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_1_initialbindings_blackBBBBBBB(
			AnnotationTypeWithValue _this, Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		if (!mType.equals(type)) {
			return new Object[] { _this, match, access, mPackage, type, mType, member };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_2_SolveCSP_bindingFBBBBBBB(
			AnnotationTypeWithValue _this, Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, access, mPackage, type, mType, member);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, access, mPackage, type, mType, member };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			AnnotationTypeWithValue _this, Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		Object[] result_pattern_AnnotationTypeWithValue_0_2_SolveCSP_binding = pattern_AnnotationTypeWithValue_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, access, mPackage, type, mType, member);
		if (result_pattern_AnnotationTypeWithValue_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_0_2_SolveCSP_black = pattern_AnnotationTypeWithValue_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, access, mPackage, type, mType, member };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_0_3_CheckCSP_expressionFBB(
			AnnotationTypeWithValue _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, Type type,
			AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {
		if (!mType.equals(type)) {
			return new Object[] { match, access, mPackage, type, mType, member };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_4_collectelementstobetranslated_greenBBBBBBFFFFFFF(
			Match match, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, Type type,
			AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(access);
		match.getToBeTranslatedNodes().add(mType);
		match.getToBeTranslatedNodes().add(member);
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String access__type____type_name_prime = "type";
		String member__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String member__access____type_name_prime = "type";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		match.getToBeTranslatedEdges().add(type__access____usagesInTypeAccess);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		match.getToBeTranslatedEdges().add(access__type____type);
		member__mType____abstractTypeDeclaration.setSrc(member);
		member__mType____abstractTypeDeclaration.setTrg(mType);
		match.getToBeTranslatedEdges().add(member__mType____abstractTypeDeclaration);
		mType__member____bodyDeclarations.setSrc(mType);
		mType__member____bodyDeclarations.setTrg(member);
		match.getToBeTranslatedEdges().add(mType__member____bodyDeclarations);
		member__access____type.setSrc(member);
		member__access____type.setTrg(access);
		match.getToBeTranslatedEdges().add(member__access____type);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		match.getToBeTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mType__mPackage____package);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		member__mType____abstractTypeDeclaration.setName(member__mType____abstractTypeDeclaration_name_prime);
		mType__member____bodyDeclarations.setName(mType__member____bodyDeclarations_name_prime);
		member__access____type.setName(member__access____type_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { match, access, mPackage, type, mType, member, type__access____usagesInTypeAccess,
				access__type____type, member__mType____abstractTypeDeclaration, mType__member____bodyDeclarations,
				member__access____type, mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_5_collectcontextelements_blackBBBBBB(Match match,
			TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, Type type,
			AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member) {
		if (!mType.equals(type)) {
			return new Object[] { match, access, mPackage, type, mType, member };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_0_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type) {
		match.getContextNodes().add(mPackage);
		match.getContextNodes().add(type);
		return new Object[] { match, mPackage, type };
	}

	public static final void pattern_AnnotationTypeWithValue_0_6_registerobjectstomatch_expressionBBBBBBB(
			AnnotationTypeWithValue _this, Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		_this.registerObjectsToMatch_FWD(match, access, mPackage, type, mType, member);

	}

	public static final boolean pattern_AnnotationTypeWithValue_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("access");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAType");
		EObject _localVariable_4 = isApplicableMatch.getObject("type");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_7 = isApplicableMatch.getObject("pg");
		EObject _localVariable_8 = isApplicableMatch.getObject("member");
		EObject _localVariable_9 = isApplicableMatch.getObject("typeToTAType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpAccess = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpTAType = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTPackage = _localVariable_6;
		EObject tmpPg = _localVariable_7;
		EObject tmpMember = _localVariable_8;
		EObject tmpTypeToTAType = _localVariable_9;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpTAType instanceof TAbstractType) {
						TAbstractType tAType = (TAbstractType) tmpTAType;
						if (tmpType instanceof Type) {
							Type type = (Type) tmpType;
							if (tmpMType instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
								if (tmpTPackage instanceof TPackage) {
									TPackage tPackage = (TPackage) tmpTPackage;
									if (tmpPg instanceof TypeGraph) {
										TypeGraph pg = (TypeGraph) tmpPg;
										if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
											AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
											if (tmpTypeToTAType instanceof TypeToTAbstractType) {
												TypeToTAbstractType typeToTAType = (TypeToTAbstractType) tmpTypeToTAType;
												return new Object[] { mPackageToTPackage, access, mPackage, tAType,
														type, mType, tPackage, pg, member, typeToTAType,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_AnnotationTypeWithValue_1_1_performtransformation_blackBBBBBBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType, AnnotationTypeWithValue _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mType.equals(type)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg,
							member, typeToTAType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding = pattern_AnnotationTypeWithValue_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[0];
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[2];
			TAbstractType tAType = (TAbstractType) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[3];
			Type type = (Type) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[4];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[5];
			TPackage tPackage = (TPackage) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[6];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[7];
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[8];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_binding[9];

			Object[] result_pattern_AnnotationTypeWithValue_1_1_performtransformation_black = pattern_AnnotationTypeWithValue_1_1_performtransformation_blackBBBBBBBBBBFBB(
					mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg, member, typeToTAType,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationTypeWithValue_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_1_1_performtransformation_black[10];

				return new Object[] { mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg, member,
						typeToTAType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_1_performtransformation_greenFFBBBFB(
			AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg, CSP csp) {
		TAnnotationType tType = BasicFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		pg.getTAnnotationTypes().add(tType);
		pg.getOwnedTypes().add(tType);
		tPackage.getOwnedTypes().add(tType);
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
		return new Object[] { tType, mTypeToTType, mType, tPackage, pg, mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_2_collecttranslatedelements_blackBBBBBB(
			TypeAccess access, TAnnotationType tType, TypeToTAbstractType mTypeToTType, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { access, tType, mTypeToTType, mType, member, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_2_collecttranslatedelements_greenFBBBBBB(
			TypeAccess access, TAnnotationType tType, TypeToTAbstractType mTypeToTType, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(access);
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getTranslatedElements().add(mType);
		ruleresult.getTranslatedElements().add(member);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, access, tType, mTypeToTType, mType, member, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access, EObject tType,
			EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType, EObject tPackage,
			EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(mTypeToTType)) {
				if (!mPackageToTPackage.equals(tAType)) {
					if (!mPackageToTPackage.equals(type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!mPackageToTPackage.equals(tPackage)) {
								if (!mPackageToTPackage.equals(pg)) {
									if (!mPackageToTPackage.equals(member)) {
										if (!mPackageToTPackage.equals(typeToTAType)) {
											if (!access.equals(mPackageToTPackage)) {
												if (!access.equals(tType)) {
													if (!access.equals(mTypeToTType)) {
														if (!access.equals(mPackage)) {
															if (!access.equals(tAType)) {
																if (!access.equals(type)) {
																	if (!access.equals(mType)) {
																		if (!access.equals(tPackage)) {
																			if (!access.equals(pg)) {
																				if (!access.equals(member)) {
																					if (!access.equals(
																							mBodyToTAnnotation)) {
																						if (!access
																								.equals(typeToTAType)) {
																							if (!tType.equals(type)) {
																								if (!tType.equals(
																										typeToTAType)) {
																									if (!mTypeToTType
																											.equals(tType)) {
																										if (!mTypeToTType
																												.equals(tAType)) {
																											if (!mTypeToTType
																													.equals(type)) {
																												if (!mTypeToTType
																														.equals(tPackage)) {
																													if (!mTypeToTType
																															.equals(pg)) {
																														if (!mTypeToTType
																																.equals(member)) {
																															if (!mTypeToTType
																																	.equals(typeToTAType)) {
																																if (!mPackage
																																		.equals(mPackageToTPackage)) {
																																	if (!mPackage
																																			.equals(tType)) {
																																		if (!mPackage
																																				.equals(mTypeToTType)) {
																																			if (!mPackage
																																					.equals(tAType)) {
																																				if (!mPackage
																																						.equals(type)) {
																																					if (!mPackage
																																							.equals(mType)) {
																																						if (!mPackage
																																								.equals(tPackage)) {
																																							if (!mPackage
																																									.equals(pg)) {
																																								if (!mPackage
																																										.equals(member)) {
																																									if (!mPackage
																																											.equals(typeToTAType)) {
																																										if (!tAType
																																												.equals(tType)) {
																																											if (!tAType
																																													.equals(type)) {
																																												if (!tAType
																																														.equals(tPackage)) {
																																													if (!tAType
																																															.equals(typeToTAType)) {
																																														if (!type
																																																.equals(typeToTAType)) {
																																															if (!mType
																																																	.equals(tType)) {
																																																if (!mType
																																																		.equals(mTypeToTType)) {
																																																	if (!mType
																																																			.equals(tAType)) {
																																																		if (!mType
																																																				.equals(type)) {
																																																			if (!mType
																																																					.equals(tPackage)) {
																																																				if (!mType
																																																						.equals(pg)) {
																																																					if (!mType
																																																							.equals(member)) {
																																																						if (!mType
																																																								.equals(typeToTAType)) {
																																																							if (!tPackage
																																																									.equals(tType)) {
																																																								if (!tPackage
																																																										.equals(type)) {
																																																									if (!tPackage
																																																											.equals(typeToTAType)) {
																																																										if (!pg.equals(
																																																												tType)) {
																																																											if (!pg.equals(
																																																													tAType)) {
																																																												if (!pg.equals(
																																																														type)) {
																																																													if (!pg.equals(
																																																															tPackage)) {
																																																														if (!pg.equals(
																																																																typeToTAType)) {
																																																															if (!member
																																																																	.equals(tType)) {
																																																																if (!member
																																																																		.equals(tAType)) {
																																																																	if (!member
																																																																			.equals(type)) {
																																																																		if (!member
																																																																				.equals(tPackage)) {
																																																																			if (!member
																																																																					.equals(pg)) {
																																																																				if (!member
																																																																						.equals(typeToTAType)) {
																																																																					if (!mBodyToTAnnotation
																																																																							.equals(mPackageToTPackage)) {
																																																																						if (!mBodyToTAnnotation
																																																																								.equals(tType)) {
																																																																							if (!mBodyToTAnnotation
																																																																									.equals(mTypeToTType)) {
																																																																								if (!mBodyToTAnnotation
																																																																										.equals(mPackage)) {
																																																																									if (!mBodyToTAnnotation
																																																																											.equals(tAType)) {
																																																																										if (!mBodyToTAnnotation
																																																																												.equals(type)) {
																																																																											if (!mBodyToTAnnotation
																																																																													.equals(mType)) {
																																																																												if (!mBodyToTAnnotation
																																																																														.equals(tPackage)) {
																																																																													if (!mBodyToTAnnotation
																																																																															.equals(pg)) {
																																																																														if (!mBodyToTAnnotation
																																																																																.equals(member)) {
																																																																															if (!mBodyToTAnnotation
																																																																																	.equals(typeToTAType)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		mPackageToTPackage,
																																																																																		access,
																																																																																		tType,
																																																																																		mTypeToTType,
																																																																																		mPackage,
																																																																																		tAType,
																																																																																		type,
																																																																																		mType,
																																																																																		tPackage,
																																																																																		pg,
																																																																																		member,
																																																																																		mBodyToTAnnotation,
																																																																																		typeToTAType };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeWithValue_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject access, EObject tType, EObject mTypeToTType, EObject mPackage,
			EObject type, EObject mType, EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation) {
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeWithValue";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String access__type____type_name_prime = "type";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String member__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String member__access____type_name_prime = "type";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getTranslatedEdges().add(type__access____usagesInTypeAccess);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		ruleresult.getTranslatedEdges().add(access__type____type);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		member__mType____abstractTypeDeclaration.setSrc(member);
		member__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getTranslatedEdges().add(member__mType____abstractTypeDeclaration);
		mType__member____bodyDeclarations.setSrc(mType);
		mType__member____bodyDeclarations.setTrg(member);
		ruleresult.getTranslatedEdges().add(mType__member____bodyDeclarations);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		member__access____type.setSrc(member);
		member__access____type.setTrg(access);
		ruleresult.getTranslatedEdges().add(member__access____type);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____tAnnotationTypes);
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
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tType__tPackage____package);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		member__mType____abstractTypeDeclaration.setName(member__mType____abstractTypeDeclaration_name_prime);
		mType__member____bodyDeclarations.setName(mType__member____bodyDeclarations_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		member__access____type.setName(member__access____type_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, access, tType, mTypeToTType, mPackage, type, mType, tPackage, pg, member,
				mBodyToTAnnotation, type__access____usagesInTypeAccess, access__type____type,
				mBodyToTAnnotation__tType____target, member__mType____abstractTypeDeclaration,
				mType__member____bodyDeclarations, mBodyToTAnnotation__mType____source, member__access____type,
				pg__tType____tAnnotationTypes, pg__tType____ownedTypes, tType__pg____pg,
				mPackage__mType____ownedElements, mType__mPackage____package, tPackage__tType____ownedTypes,
				tType__tPackage____package, mTypeToTType__tType____target, mTypeToTType__mType____source };
	}

	public static final void pattern_AnnotationTypeWithValue_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access,
			EObject tType, EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType,
			EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type,
				mType, tPackage, pg, member, mBodyToTAnnotation, typeToTAType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeWithValue_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeWithValue _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeWithValue _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeWithValue _this) {
		Object[] result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_binding = pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_black = pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AnnotationTypeWithValue";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("access");
		EObject _localVariable_1 = match.getObject("mPackage");
		EObject _localVariable_2 = match.getObject("type");
		EObject _localVariable_3 = match.getObject("mType");
		EObject _localVariable_4 = match.getObject("member");
		EObject tmpAccess = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMember = _localVariable_4;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
				org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
				if (tmpType instanceof Type) {
					Type type = (Type) tmpType;
					if (tmpMType instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
						if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
							AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
							return new Object[] { access, mPackage, type, mType, member, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_2_2_corematch_blackFBBFBBFBFB(
			TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, Type type,
			AnnotationTypeDeclaration mType, AnnotationTypeMemberDeclaration member, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mType.equals(type)) {
			for (TypeToTAbstractType typeToTAType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(type, TypeToTAbstractType.class, "source")) {
				TAbstractType tAType = typeToTAType.getTarget();
				if (tAType != null) {
					for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
						TPackage tPackage = mPackageToTPackage.getTarget();
						if (tPackage != null) {
							_result.add(new Object[] { mPackageToTPackage, access, mPackage, tAType, type, mType,
									tPackage, member, typeToTAType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_2_3_findcontext_blackBBBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mType.equals(type)) {
			if (type.getUsagesInTypeAccess().contains(access)) {
				if (mType.equals(member.getAbstractTypeDeclaration())) {
					if (type.equals(typeToTAType.getSource())) {
						if (access.equals(member.getType())) {
							if (mPackage.getOwnedElements().contains(mType)) {
								if (mPackage.equals(mPackageToTPackage.getSource())) {
									if (tAType.equals(typeToTAType.getTarget())) {
										if (tPackage.equals(mPackageToTPackage.getTarget())) {
											TypeGraph pg = tPackage.getTypeGraph();
											if (pg != null) {
												if (pg.getOwnedTypes().contains(tAType)) {
													_result.add(new Object[] { mPackageToTPackage, access, mPackage,
															tAType, type, mType, tPackage, pg, member, typeToTAType });
												}
											}

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

	public static final Object[] pattern_AnnotationTypeWithValue_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAType__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAType__tAType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String access__type____type_name_prime = "type";
		String member__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeToTAType__type____source_name_prime = "source";
		String member__access____type_name_prime = "type";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String typeToTAType__tAType____target_name_prime = "target";
		String pg__tAType____ownedTypes_name_prime = "ownedTypes";
		String tAType__pg____pg_name_prime = "pg";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(access);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tAType);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(member);
		isApplicableMatch.getAllContextElements().add(typeToTAType);
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		isApplicableMatch.getAllContextElements().add(type__access____usagesInTypeAccess);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		isApplicableMatch.getAllContextElements().add(access__type____type);
		member__mType____abstractTypeDeclaration.setSrc(member);
		member__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(member__mType____abstractTypeDeclaration);
		mType__member____bodyDeclarations.setSrc(mType);
		mType__member____bodyDeclarations.setTrg(member);
		isApplicableMatch.getAllContextElements().add(mType__member____bodyDeclarations);
		typeToTAType__type____source.setSrc(typeToTAType);
		typeToTAType__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(typeToTAType__type____source);
		member__access____type.setSrc(member);
		member__access____type.setTrg(access);
		isApplicableMatch.getAllContextElements().add(member__access____type);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		typeToTAType__tAType____target.setSrc(typeToTAType);
		typeToTAType__tAType____target.setTrg(tAType);
		isApplicableMatch.getAllContextElements().add(typeToTAType__tAType____target);
		pg__tAType____ownedTypes.setSrc(pg);
		pg__tAType____ownedTypes.setTrg(tAType);
		isApplicableMatch.getAllContextElements().add(pg__tAType____ownedTypes);
		tAType__pg____pg.setSrc(tAType);
		tAType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAType__pg____pg);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		member__mType____abstractTypeDeclaration.setName(member__mType____abstractTypeDeclaration_name_prime);
		mType__member____bodyDeclarations.setName(mType__member____bodyDeclarations_name_prime);
		typeToTAType__type____source.setName(typeToTAType__type____source_name_prime);
		member__access____type.setName(member__access____type_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		typeToTAType__tAType____target.setName(typeToTAType__tAType____target_name_prime);
		pg__tAType____ownedTypes.setName(pg__tAType____ownedTypes_name_prime);
		tAType__pg____pg.setName(tAType__pg____pg_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg, member,
				typeToTAType, isApplicableMatch, type__access____usagesInTypeAccess, access__type____type,
				member__mType____abstractTypeDeclaration, mType__member____bodyDeclarations,
				typeToTAType__type____source, member__access____type, mPackage__mType____ownedElements,
				mType__mPackage____package, tPackage__pg____typeGraph, mPackageToTPackage__mPackage____source,
				typeToTAType__tAType____target, pg__tAType____ownedTypes, tAType__pg____pg,
				mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg, AnnotationTypeMemberDeclaration member,
			TypeToTAbstractType typeToTAType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackageToTPackage, access, mPackage,
				tAType, type, mType, tPackage, pg, member, typeToTAType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, access, mPackage, tAType, type,
					mType, tPackage, pg, member, typeToTAType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TypeAccess access, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg, AnnotationTypeMemberDeclaration member,
			TypeToTAbstractType typeToTAType) {
		Object[] result_pattern_AnnotationTypeWithValue_2_4_solveCSP_binding = pattern_AnnotationTypeWithValue_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, access, mPackage, tAType, type, mType, tPackage, pg,
				member, typeToTAType);
		if (result_pattern_AnnotationTypeWithValue_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_2_4_solveCSP_black = pattern_AnnotationTypeWithValue_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, access, mPackage, tAType, type,
						mType, tPackage, pg, member, typeToTAType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_2_5_checkCSP_expressionFBB(
			AnnotationTypeWithValue _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeWithValue";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeWithValue_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_1_initialbindings_blackBBBBBB(
			AnnotationTypeWithValue _this, Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		if (!tAType.equals(tType)) {
			return new Object[] { _this, match, tType, tAType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_2_SolveCSP_bindingFBBBBBB(
			AnnotationTypeWithValue _this, Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tAType, tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tAType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeWithValue _this, Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		Object[] result_pattern_AnnotationTypeWithValue_10_2_SolveCSP_binding = pattern_AnnotationTypeWithValue_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tType, tAType, tPackage, pg);
		if (result_pattern_AnnotationTypeWithValue_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_10_2_SolveCSP_black = pattern_AnnotationTypeWithValue_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tAType, tPackage, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_10_3_CheckCSP_expressionFBB(
			AnnotationTypeWithValue _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage, TypeGraph pg) {
		if (!tAType.equals(tType)) {
			return new Object[] { match, tType, tAType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_4_collectelementstobetranslated_greenBBBBFFFFF(
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____tAnnotationTypes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____pg);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		return new Object[] { match, tType, tPackage, pg, pg__tType____tAnnotationTypes, pg__tType____ownedTypes,
				tType__pg____pg, tPackage__tType____ownedTypes, tType__tPackage____package };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_5_collectcontextelements_blackBBBBB(Match match,
			TAnnotationType tType, TAbstractType tAType, TPackage tPackage, TypeGraph pg) {
		if (!tAType.equals(tType)) {
			return new Object[] { match, tType, tAType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_10_5_collectcontextelements_greenBBBBFFF(Match match,
			TAbstractType tAType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAType);
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(pg);
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String pg__tAType____ownedTypes_name_prime = "ownedTypes";
		String tAType__pg____pg_name_prime = "pg";
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____typeGraph);
		pg__tAType____ownedTypes.setSrc(pg);
		pg__tAType____ownedTypes.setTrg(tAType);
		match.getContextEdges().add(pg__tAType____ownedTypes);
		tAType__pg____pg.setSrc(tAType);
		tAType__pg____pg.setTrg(pg);
		match.getContextEdges().add(tAType__pg____pg);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		pg__tAType____ownedTypes.setName(pg__tAType____ownedTypes_name_prime);
		tAType__pg____pg.setName(tAType__pg____pg_name_prime);
		return new Object[] { match, tAType, tPackage, pg, tPackage__pg____typeGraph, pg__tAType____ownedTypes,
				tAType__pg____pg };
	}

	public static final void pattern_AnnotationTypeWithValue_10_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeWithValue _this, Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tType, tAType, tPackage, pg);

	}

	public static final boolean pattern_AnnotationTypeWithValue_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAType");
		EObject _localVariable_4 = isApplicableMatch.getObject("type");
		EObject _localVariable_5 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("pg");
		EObject _localVariable_7 = isApplicableMatch.getObject("typeToTAType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpTAType = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpTPackage = _localVariable_5;
		EObject tmpPg = _localVariable_6;
		EObject tmpTypeToTAType = _localVariable_7;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpTAType instanceof TAbstractType) {
						TAbstractType tAType = (TAbstractType) tmpTAType;
						if (tmpType instanceof Type) {
							Type type = (Type) tmpType;
							if (tmpTPackage instanceof TPackage) {
								TPackage tPackage = (TPackage) tmpTPackage;
								if (tmpPg instanceof TypeGraph) {
									TypeGraph pg = (TypeGraph) tmpPg;
									if (tmpTypeToTAType instanceof TypeToTAbstractType) {
										TypeToTAbstractType typeToTAType = (TypeToTAbstractType) tmpTypeToTAType;
										return new Object[] { mPackageToTPackage, tType, mPackage, tAType, type,
												tPackage, pg, typeToTAType, isApplicableMatch };
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

	public static final Object[] pattern_AnnotationTypeWithValue_11_1_performtransformation_blackBBBBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType,
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch) {
		if (!tAType.equals(tType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg, typeToTAType,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding = pattern_AnnotationTypeWithValue_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[0];
			TAnnotationType tType = (TAnnotationType) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[1];
			org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[2];
			TAbstractType tAType = (TAbstractType) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[3];
			Type type = (Type) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[4];
			TPackage tPackage = (TPackage) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[5];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[6];
			TypeToTAbstractType typeToTAType = (TypeToTAbstractType) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_binding[7];

			Object[] result_pattern_AnnotationTypeWithValue_11_1_performtransformation_black = pattern_AnnotationTypeWithValue_11_1_performtransformation_blackBBBBBBBBFBB(
					mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg, typeToTAType, _this,
					isApplicableMatch);
			if (result_pattern_AnnotationTypeWithValue_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_11_1_performtransformation_black[8];

				return new Object[] { mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg, typeToTAType,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_1_performtransformation_greenFBFBBFFFB(
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, Type type, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		AnnotationTypeMemberDeclaration member = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("mType", "name");
		Object _localVariable_1 = csp.getValue("mType", "proxy");
		type.getUsagesInTypeAccess().add(access);
		mTypeToTType.setTarget(tType);
		mPackage.getOwnedElements().add(mType);
		mTypeToTType.setSource(mType);
		member.setAbstractTypeDeclaration(mType);
		member.setType(access);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		String mType_name_prime = (String) _localVariable_0;
		boolean mType_proxy_prime = (boolean) _localVariable_1;
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { access, tType, mTypeToTType, mPackage, type, mType, member, mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_2_collecttranslatedelements_blackBBBBBB(
			TypeAccess access, TAnnotationType tType, TypeToTAbstractType mTypeToTType, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { access, tType, mTypeToTType, mType, member, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_2_collecttranslatedelements_greenFBBBBBB(
			TypeAccess access, TAnnotationType tType, TypeToTAbstractType mTypeToTType, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member, BodyDeclarationToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(access);
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedElements().add(mType);
		ruleresult.getCreatedElements().add(member);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, access, tType, mTypeToTType, mType, member, mBodyToTAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access, EObject tType,
			EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType, EObject tPackage,
			EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(mTypeToTType)) {
				if (!mPackageToTPackage.equals(tAType)) {
					if (!mPackageToTPackage.equals(type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!mPackageToTPackage.equals(tPackage)) {
								if (!mPackageToTPackage.equals(pg)) {
									if (!mPackageToTPackage.equals(member)) {
										if (!mPackageToTPackage.equals(typeToTAType)) {
											if (!access.equals(mPackageToTPackage)) {
												if (!access.equals(tType)) {
													if (!access.equals(mTypeToTType)) {
														if (!access.equals(mPackage)) {
															if (!access.equals(tAType)) {
																if (!access.equals(type)) {
																	if (!access.equals(mType)) {
																		if (!access.equals(tPackage)) {
																			if (!access.equals(pg)) {
																				if (!access.equals(member)) {
																					if (!access.equals(
																							mBodyToTAnnotation)) {
																						if (!access
																								.equals(typeToTAType)) {
																							if (!tType.equals(type)) {
																								if (!tType.equals(
																										typeToTAType)) {
																									if (!mTypeToTType
																											.equals(tType)) {
																										if (!mTypeToTType
																												.equals(tAType)) {
																											if (!mTypeToTType
																													.equals(type)) {
																												if (!mTypeToTType
																														.equals(tPackage)) {
																													if (!mTypeToTType
																															.equals(pg)) {
																														if (!mTypeToTType
																																.equals(member)) {
																															if (!mTypeToTType
																																	.equals(typeToTAType)) {
																																if (!mPackage
																																		.equals(mPackageToTPackage)) {
																																	if (!mPackage
																																			.equals(tType)) {
																																		if (!mPackage
																																				.equals(mTypeToTType)) {
																																			if (!mPackage
																																					.equals(tAType)) {
																																				if (!mPackage
																																						.equals(type)) {
																																					if (!mPackage
																																							.equals(mType)) {
																																						if (!mPackage
																																								.equals(tPackage)) {
																																							if (!mPackage
																																									.equals(pg)) {
																																								if (!mPackage
																																										.equals(member)) {
																																									if (!mPackage
																																											.equals(typeToTAType)) {
																																										if (!tAType
																																												.equals(tType)) {
																																											if (!tAType
																																													.equals(type)) {
																																												if (!tAType
																																														.equals(tPackage)) {
																																													if (!tAType
																																															.equals(typeToTAType)) {
																																														if (!type
																																																.equals(typeToTAType)) {
																																															if (!mType
																																																	.equals(tType)) {
																																																if (!mType
																																																		.equals(mTypeToTType)) {
																																																	if (!mType
																																																			.equals(tAType)) {
																																																		if (!mType
																																																				.equals(type)) {
																																																			if (!mType
																																																					.equals(tPackage)) {
																																																				if (!mType
																																																						.equals(pg)) {
																																																					if (!mType
																																																							.equals(member)) {
																																																						if (!mType
																																																								.equals(typeToTAType)) {
																																																							if (!tPackage
																																																									.equals(tType)) {
																																																								if (!tPackage
																																																										.equals(type)) {
																																																									if (!tPackage
																																																											.equals(typeToTAType)) {
																																																										if (!pg.equals(
																																																												tType)) {
																																																											if (!pg.equals(
																																																													tAType)) {
																																																												if (!pg.equals(
																																																														type)) {
																																																													if (!pg.equals(
																																																															tPackage)) {
																																																														if (!pg.equals(
																																																																typeToTAType)) {
																																																															if (!member
																																																																	.equals(tType)) {
																																																																if (!member
																																																																		.equals(tAType)) {
																																																																	if (!member
																																																																			.equals(type)) {
																																																																		if (!member
																																																																				.equals(tPackage)) {
																																																																			if (!member
																																																																					.equals(pg)) {
																																																																				if (!member
																																																																						.equals(typeToTAType)) {
																																																																					if (!mBodyToTAnnotation
																																																																							.equals(mPackageToTPackage)) {
																																																																						if (!mBodyToTAnnotation
																																																																								.equals(tType)) {
																																																																							if (!mBodyToTAnnotation
																																																																									.equals(mTypeToTType)) {
																																																																								if (!mBodyToTAnnotation
																																																																										.equals(mPackage)) {
																																																																									if (!mBodyToTAnnotation
																																																																											.equals(tAType)) {
																																																																										if (!mBodyToTAnnotation
																																																																												.equals(type)) {
																																																																											if (!mBodyToTAnnotation
																																																																													.equals(mType)) {
																																																																												if (!mBodyToTAnnotation
																																																																														.equals(tPackage)) {
																																																																													if (!mBodyToTAnnotation
																																																																															.equals(pg)) {
																																																																														if (!mBodyToTAnnotation
																																																																																.equals(member)) {
																																																																															if (!mBodyToTAnnotation
																																																																																	.equals(typeToTAType)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		mPackageToTPackage,
																																																																																		access,
																																																																																		tType,
																																																																																		mTypeToTType,
																																																																																		mPackage,
																																																																																		tAType,
																																																																																		type,
																																																																																		mType,
																																																																																		tPackage,
																																																																																		pg,
																																																																																		member,
																																																																																		mBodyToTAnnotation,
																																																																																		typeToTAType };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeWithValue_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject access, EObject tType, EObject mTypeToTType, EObject mPackage,
			EObject type, EObject mType, EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation) {
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeWithValue";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String access__type____type_name_prime = "type";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String member__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String member__access____type_name_prime = "type";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getCreatedEdges().add(type__access____usagesInTypeAccess);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		ruleresult.getCreatedEdges().add(access__type____type);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		member__mType____abstractTypeDeclaration.setSrc(member);
		member__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getCreatedEdges().add(member__mType____abstractTypeDeclaration);
		mType__member____bodyDeclarations.setSrc(mType);
		mType__member____bodyDeclarations.setTrg(member);
		ruleresult.getCreatedEdges().add(mType__member____bodyDeclarations);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		member__access____type.setSrc(member);
		member__access____type.setTrg(access);
		ruleresult.getCreatedEdges().add(member__access____type);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____tAnnotationTypes);
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
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tType__tPackage____package);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		member__mType____abstractTypeDeclaration.setName(member__mType____abstractTypeDeclaration_name_prime);
		mType__member____bodyDeclarations.setName(mType__member____bodyDeclarations_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		member__access____type.setName(member__access____type_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, access, tType, mTypeToTType, mPackage, type, mType, tPackage, pg, member,
				mBodyToTAnnotation, type__access____usagesInTypeAccess, access__type____type,
				mBodyToTAnnotation__tType____target, member__mType____abstractTypeDeclaration,
				mType__member____bodyDeclarations, mBodyToTAnnotation__mType____source, member__access____type,
				pg__tType____tAnnotationTypes, pg__tType____ownedTypes, tType__pg____pg,
				mPackage__mType____ownedElements, mType__mPackage____package, tPackage__tType____ownedTypes,
				tType__tPackage____package, mTypeToTType__tType____target, mTypeToTType__mType____source };
	}

	public static final void pattern_AnnotationTypeWithValue_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject access,
			EObject tType, EObject mTypeToTType, EObject mPackage, EObject tAType, EObject type, EObject mType,
			EObject tPackage, EObject pg, EObject member, EObject mBodyToTAnnotation, EObject typeToTAType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, access, tType, mTypeToTType, mPackage, tAType, type,
				mType, tPackage, pg, member, mBodyToTAnnotation, typeToTAType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeWithValue_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeWithValue _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeWithValue _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeWithValue _this) {
		Object[] result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_binding = pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_black = pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "AnnotationTypeWithValue";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tAType");
		EObject _localVariable_2 = match.getObject("tPackage");
		EObject _localVariable_3 = match.getObject("pg");
		EObject tmpTType = _localVariable_0;
		EObject tmpTAType = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpTType instanceof TAnnotationType) {
			TAnnotationType tType = (TAnnotationType) tmpTType;
			if (tmpTAType instanceof TAbstractType) {
				TAbstractType tAType = (TAbstractType) tmpTAType;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { tType, tAType, tPackage, pg, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_12_2_corematch_blackFBFBFBBFB(
			TAnnotationType tType, TAbstractType tAType, TPackage tPackage, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAType.equals(tType)) {
			for (TypeToTAbstractType typeToTAType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAType, TypeToTAbstractType.class, "target")) {
				Type type = typeToTAType.getSource();
				if (type != null) {
					for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
						org.eclipse.gmt.modisco.java.Package mPackage = mPackageToTPackage.getSource();
						if (mPackage != null) {
							_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg,
									typeToTAType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_12_3_findcontext_blackBBBBBBBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAType.equals(tType)) {
			if (type.equals(typeToTAType.getSource())) {
				if (pg.getTAnnotationTypes().contains(tType)) {
					if (pg.getOwnedTypes().contains(tType)) {
						if (tPackage.getOwnedTypes().contains(tType)) {
							if (pg.equals(tPackage.getTypeGraph())) {
								if (mPackage.equals(mPackageToTPackage.getSource())) {
									if (tAType.equals(typeToTAType.getTarget())) {
										if (pg.getOwnedTypes().contains(tAType)) {
											if (tPackage.equals(mPackageToTPackage.getTarget())) {
												_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tAType,
														type, tPackage, pg, typeToTAType });
											}
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

	public static final Object[] pattern_AnnotationTypeWithValue_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeToTAType__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____tAnnotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAType__tAType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeToTAType__type____source_name_prime = "source";
		String pg__tType____tAnnotationTypes_name_prime = "tAnnotationTypes";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String typeToTAType__tAType____target_name_prime = "target";
		String pg__tAType____ownedTypes_name_prime = "ownedTypes";
		String tAType__pg____pg_name_prime = "pg";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tAType);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(typeToTAType);
		typeToTAType__type____source.setSrc(typeToTAType);
		typeToTAType__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(typeToTAType__type____source);
		pg__tType____tAnnotationTypes.setSrc(pg);
		pg__tType____tAnnotationTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____tAnnotationTypes);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
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
		typeToTAType__tAType____target.setSrc(typeToTAType);
		typeToTAType__tAType____target.setTrg(tAType);
		isApplicableMatch.getAllContextElements().add(typeToTAType__tAType____target);
		pg__tAType____ownedTypes.setSrc(pg);
		pg__tAType____ownedTypes.setTrg(tAType);
		isApplicableMatch.getAllContextElements().add(pg__tAType____ownedTypes);
		tAType__pg____pg.setSrc(tAType);
		tAType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAType__pg____pg);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		typeToTAType__type____source.setName(typeToTAType__type____source_name_prime);
		pg__tType____tAnnotationTypes.setName(pg__tType____tAnnotationTypes_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		typeToTAType__tAType____target.setName(typeToTAType__tAType____target_name_prime);
		pg__tAType____ownedTypes.setName(pg__tAType____ownedTypes_name_prime);
		tAType__pg____pg.setName(tAType__pg____pg_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg, typeToTAType,
				isApplicableMatch, typeToTAType__type____source, pg__tType____tAnnotationTypes, pg__tType____ownedTypes,
				tType__pg____pg, tPackage__tType____ownedTypes, tType__tPackage____package, tPackage__pg____typeGraph,
				mPackageToTPackage__mPackage____source, typeToTAType__tAType____target, pg__tAType____ownedTypes,
				tAType__pg____pg, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_4_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tType, mPackage,
				tAType, type, tPackage, pg, typeToTAType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tAType, type,
					tPackage, pg, typeToTAType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {
		Object[] result_pattern_AnnotationTypeWithValue_12_4_solveCSP_binding = pattern_AnnotationTypeWithValue_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tAType, type, tPackage, pg,
				typeToTAType);
		if (result_pattern_AnnotationTypeWithValue_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_12_4_solveCSP_black = pattern_AnnotationTypeWithValue_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tAType, type,
						tPackage, pg, typeToTAType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_12_5_checkCSP_expressionFBB(
			AnnotationTypeWithValue _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeWithValue";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeWithValue_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeWithValue _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeWithValue _this) {
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

	public static final Object[] pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeWithValue _this) {
		Object[] result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_binding = pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_black = pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_usagesInTypeAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpType = _edge_usagesInTypeAccess.getSrc();
		if (tmpType instanceof Type) {
			Type type = (Type) tmpType;
			EObject tmpAccess = _edge_usagesInTypeAccess.getTrg();
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (type.getUsagesInTypeAccess().contains(access)) {
					for (AnnotationTypeMemberDeclaration member : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(access, AnnotationTypeMemberDeclaration.class, "type")) {
						AbstractTypeDeclaration tmpMType = member.getAbstractTypeDeclaration();
						if (tmpMType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
							if (!mType.equals(type)) {
								org.eclipse.gmt.modisco.java.Package mPackage = mType.getPackage();
								if (mPackage != null) {
									_result.add(new Object[] { access, mPackage, type, mType, member,
											_edge_usagesInTypeAccess });
								}

							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeWithValue_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnnotationTypeWithValue _this, Match match, TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, access, mPackage, type, mType, member);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeWithValue _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeWithValue_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeWithValue _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeWithValue _this) {
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

	public static final Object[] pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeWithValue _this) {
		Object[] result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_binding = pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_black = pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_black_nac_0BB(
			TAnnotationType tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_tAnnotationTypes_177490 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "tAnnotationTypes")) {
			if (!pg.equals(__DEC_tType_tAnnotationTypes_177490)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_black_nac_1BB(
			TAnnotationType tType, TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_551925 = tType.getPackage();
		if (__DEC_tType_ownedTypes_551925 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_551925)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_tAnnotationTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_tAnnotationTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_tAnnotationTypes.getTrg();
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (pg.getTAnnotationTypes().contains(tType)) {
					if (pg.getOwnedTypes().contains(tType)) {
						TPackage tPackage = tType.getPackage();
						if (tPackage != null) {
							if (pg.equals(tPackage.getTypeGraph())) {
								if (pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_black_nac_0BB(tType,
										pg) == null) {
									if (pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_black_nac_1BB(tType,
											tPackage) == null) {
										for (TAbstractType tAType : pg.getOwnedTypes()) {
											if (!tAType.equals(tType)) {
												_result.add(new Object[] { tType, tAType, tPackage, pg,
														_edge_tAnnotationTypes });
											}
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

	public static final Object[] pattern_AnnotationTypeWithValue_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeWithValue_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationTypeWithValue _this, Match match, TAnnotationType tType, TAbstractType tAType, TPackage tPackage,
			TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tAType, tPackage, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeWithValue _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeWithValue_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_1_prepare_blackB(AnnotationTypeWithValue _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_2_matchcontext_bindingFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("access");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mPackage");
		EObject _localVariable_3 = targetMatch.getObject("tAType");
		EObject _localVariable_4 = sourceMatch.getObject("type");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject _localVariable_6 = targetMatch.getObject("tPackage");
		EObject _localVariable_7 = targetMatch.getObject("pg");
		EObject _localVariable_8 = sourceMatch.getObject("member");
		EObject tmpAccess = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpTAType = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTPackage = _localVariable_6;
		EObject tmpPg = _localVariable_7;
		EObject tmpMember = _localVariable_8;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (tmpMPackage instanceof org.eclipse.gmt.modisco.java.Package) {
					org.eclipse.gmt.modisco.java.Package mPackage = (org.eclipse.gmt.modisco.java.Package) tmpMPackage;
					if (tmpTAType instanceof TAbstractType) {
						TAbstractType tAType = (TAbstractType) tmpTAType;
						if (tmpType instanceof Type) {
							Type type = (Type) tmpType;
							if (tmpMType instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
								if (tmpTPackage instanceof TPackage) {
									TPackage tPackage = (TPackage) tmpTPackage;
									if (tmpPg instanceof TypeGraph) {
										TypeGraph pg = (TypeGraph) tmpPg;
										if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
											AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
											return new Object[] { access, tType, mPackage, tAType, type, mType,
													tPackage, pg, member, sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_24_2_matchcontext_blackFBBBBBBBBBFBB(
			TypeAccess access, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAType.equals(tType)) {
			if (!mType.equals(type)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (type.getUsagesInTypeAccess().contains(access)) {
						if (mType.equals(member.getAbstractTypeDeclaration())) {
							if (access.equals(member.getType())) {
								if (pg.getTAnnotationTypes().contains(tType)) {
									if (pg.getOwnedTypes().contains(tType)) {
										if (mPackage.getOwnedElements().contains(mType)) {
											if (tPackage.getOwnedTypes().contains(tType)) {
												if (pg.equals(tPackage.getTypeGraph())) {
													if (pg.getOwnedTypes().contains(tAType)) {
														for (TypeToTAbstractType typeToTAType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(type,
																		TypeToTAbstractType.class, "source")) {
															if (tAType.equals(typeToTAType.getTarget())) {
																for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(mPackage,
																				PackageToTPackage.class, "source")) {
																	if (tPackage
																			.equals(mPackageToTPackage.getTarget())) {
																		_result.add(new Object[] { mPackageToTPackage,
																				access, tType, mPackage, tAType, type,
																				mType, tPackage, pg, member,
																				typeToTAType, sourceMatch,
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
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_2_matchcontext_greenBBBBBBBBBBBBFB(
			PackageToTPackage mPackageToTPackage, TypeAccess access, TAnnotationType tType,
			org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type,
			AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg, AnnotationTypeMemberDeclaration member,
			TypeToTAbstractType typeToTAType, Match sourceMatch, Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "AnnotationTypeWithValue";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(access);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(member);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tAType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(typeToTAType);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, access, tType, mPackage, tAType, type, mType, tPackage, pg, member,
				typeToTAType, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TypeAccess access, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, mPackageToTPackage, access, tType,
				mPackage, tAType, type, mType, tPackage, pg, member, typeToTAType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, access, tType, mPackage, tAType,
					type, mType, tPackage, pg, member, typeToTAType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBB(
			AnnotationTypeWithValue _this, CCMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TypeAccess access, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, TypeToTAbstractType typeToTAType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AnnotationTypeWithValue_24_3_checkcsp_binding = pattern_AnnotationTypeWithValue_24_3_checkcsp_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, access, tType, mPackage, tAType, type, mType, tPackage,
				pg, member, typeToTAType, sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeWithValue_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_24_3_checkcsp_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_24_3_checkcsp_black = pattern_AnnotationTypeWithValue_24_3_checkcsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, access, tType, mPackage,
						tAType, type, mType, tPackage, pg, member, typeToTAType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_4_createcorrespondence_blackBBBBBBBBBB(
			TypeAccess access, TAnnotationType tType, org.eclipse.gmt.modisco.java.Package mPackage,
			TAbstractType tAType, Type type, AnnotationTypeDeclaration mType, TPackage tPackage, TypeGraph pg,
			AnnotationTypeMemberDeclaration member, CCMatch isApplicableMatch) {
		if (!tAType.equals(tType)) {
			if (!mType.equals(type)) {
				return new Object[] { access, tType, mPackage, tAType, type, mType, tPackage, pg, member,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_4_createcorrespondence_greenBFBFB(
			TAnnotationType tType, AnnotationTypeDeclaration mType, CCMatch isApplicableMatch) {
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		isApplicableMatch.getCreateCorr().add(mTypeToTType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		isApplicableMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { tType, mTypeToTType, mType, mBodyToTAnnotation, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_5_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_24_5_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeWithValue";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeWithValue_24_6_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_27_1_matchtggpattern_blackBBBBB(TypeAccess access,
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, AnnotationTypeDeclaration mType,
			AnnotationTypeMemberDeclaration member) {
		if (!mType.equals(type)) {
			if (type.getUsagesInTypeAccess().contains(access)) {
				if (mType.equals(member.getAbstractTypeDeclaration())) {
					if (access.equals(member.getType())) {
						if (mPackage.getOwnedElements().contains(mType)) {
							return new Object[] { access, mPackage, type, mType, member };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_28_1_matchtggpattern_black_nac_0BB(
			TAnnotationType tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_tAnnotationTypes_493455 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "tAnnotationTypes")) {
			if (!pg.equals(__DEC_tType_tAnnotationTypes_493455)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_28_1_matchtggpattern_black_nac_1BB(
			TAnnotationType tType, TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_932239 = tType.getPackage();
		if (__DEC_tType_ownedTypes_932239 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_932239)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_28_1_matchtggpattern_blackBBBB(TAnnotationType tType,
			TAbstractType tAType, TPackage tPackage, TypeGraph pg) {
		if (!tAType.equals(tType)) {
			if (pg.getTAnnotationTypes().contains(tType)) {
				if (pg.getOwnedTypes().contains(tType)) {
					if (tPackage.getOwnedTypes().contains(tType)) {
						if (pg.equals(tPackage.getTypeGraph())) {
							if (pg.getOwnedTypes().contains(tAType)) {
								if (pattern_AnnotationTypeWithValue_28_1_matchtggpattern_black_nac_0BB(tType,
										pg) == null) {
									if (pattern_AnnotationTypeWithValue_28_1_matchtggpattern_black_nac_1BB(tType,
											tPackage) == null) {
										return new Object[] { tType, tAType, tPackage, pg };
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

	public static final boolean pattern_AnnotationTypeWithValue_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeWithValue_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_1_createresult_blackB(
			AnnotationTypeWithValue _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.gmt.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAType) {
		if (ruleResult.getTargetObjects().contains(tAType)) {
			return new Object[] { ruleResult, tAType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType typeToTAType) {
		if (ruleResult.getCorrObjects().contains(typeToTAType)) {
			return new Object[] { ruleResult, typeToTAType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Type type) {
		if (ruleResult.getSourceObjects().contains(type)) {
			return new Object[] { ruleResult, type };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeWithValue_29_2_isapplicablecore_blackFFFFFFFFBB(
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
								if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, tPackage) == null) {
											if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, pg) == null) {
												for (TAbstractType tAType : pg.getOwnedTypes()) {
													if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tAType) == null) {
														for (TypeToTAbstractType typeToTAType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tAType,
																		TypeToTAbstractType.class, "target")) {
															Type type = typeToTAType.getSource();
															if (type != null) {
																if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, typeToTAType) == null) {
																	if (pattern_AnnotationTypeWithValue_29_2_isapplicablecore_black_nac_6BB(
																			ruleResult, type) == null) {
																		_result.add(new Object[] {
																				mPackageToTPackageList,
																				mPackageToTPackage, mPackage, tPackage,
																				pg, tAType, typeToTAType, type,
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
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type, TPackage tPackage,
			TypeGraph pg, TypeToTAbstractType typeToTAType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, mPackage, tAType,
				type, tPackage, pg, typeToTAType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tAType, type, tPackage,
					pg, typeToTAType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeWithValue _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType, Type type, TPackage tPackage,
			TypeGraph pg, TypeToTAbstractType typeToTAType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeWithValue_29_3_solveCSP_binding = pattern_AnnotationTypeWithValue_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, mPackage, tAType, type, tPackage, pg, typeToTAType,
				ruleResult);
		if (result_pattern_AnnotationTypeWithValue_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeWithValue_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeWithValue_29_3_solveCSP_black = pattern_AnnotationTypeWithValue_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeWithValue_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tAType, type,
						tPackage, pg, typeToTAType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeWithValue_29_4_checkCSP_expressionFBB(
			AnnotationTypeWithValue _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_5_checknacs_blackBBBBBBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType,
			Type type, TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType) {
		return new Object[] { mPackageToTPackage, mPackage, tAType, type, tPackage, pg, typeToTAType };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_6_perform_blackBBBBBBBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.gmt.modisco.java.Package mPackage, TAbstractType tAType,
			Type type, TPackage tPackage, TypeGraph pg, TypeToTAbstractType typeToTAType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, mPackage, tAType, type, tPackage, pg, typeToTAType, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeWithValue_29_6_perform_greenFFFBBFBBFFBB(
			org.eclipse.gmt.modisco.java.Package mPackage, Type type, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		TAnnotationType tType = BasicFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType mTypeToTType = ModiscoFactory.eINSTANCE.createTypeToTAbstractType();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		AnnotationTypeMemberDeclaration member = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		BodyDeclarationToTAnnotatable mBodyToTAnnotation = ModiscoFactory.eINSTANCE
				.createBodyDeclarationToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "ID");
		Object _localVariable_2 = csp.getValue("tType", "tLib");
		Object _localVariable_3 = csp.getValue("mType", "name");
		Object _localVariable_4 = csp.getValue("mType", "proxy");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		type.getUsagesInTypeAccess().add(access);
		ruleResult.getSourceObjects().add(access);
		pg.getTAnnotationTypes().add(tType);
		pg.getOwnedTypes().add(tType);
		tPackage.getOwnedTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		mTypeToTType.setTarget(tType);
		ruleResult.getCorrObjects().add(mTypeToTType);
		mPackage.getOwnedElements().add(mType);
		mTypeToTType.setSource(mType);
		ruleResult.getSourceObjects().add(mType);
		member.setAbstractTypeDeclaration(mType);
		member.setType(access);
		ruleResult.getSourceObjects().add(member);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
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
		return new Object[] { access, tType, mTypeToTType, mPackage, type, mType, tPackage, pg, member,
				mBodyToTAnnotation, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeWithValue_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeWithValueImpl
