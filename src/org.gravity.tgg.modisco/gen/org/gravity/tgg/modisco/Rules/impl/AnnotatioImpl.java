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

import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.BodyDeclarationToTAnnotatable;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.Annotatio;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;

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
 * An implementation of the model object '<em><b>Annotatio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotatioImpl extends AbstractRuleImpl implements Annotatio {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotatio();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		// initial bindings
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_0_1_initialbindings_blackBBBBBBBBB(this, match, number,
				member, mBody, value, mAnnotation, mAccess, mAnnotationType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[number] = " + number + ", "
					+ "[member] = " + member + ", " + "[mBody] = " + mBody + ", " + "[value] = " + value + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
					+ mAnnotationType + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotatioImpl.pattern_Annotatio_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this,
				match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[number] = " + number + ", " + "[member] = " + member
					+ ", " + "[mBody] = " + mBody + ", " + "[value] = " + value + ", " + "[mAnnotation] = "
					+ mAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = " + mAnnotationType
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotatioImpl.pattern_Annotatio_0_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotatioImpl.pattern_Annotatio_0_4_collectelementstobetranslated_blackBBBBBBBB(
					match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[number] = " + number + ", " + "[member] = "
						+ member + ", " + "[mBody] = " + mBody + ", " + "[value] = " + value + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
						+ mAnnotationType + ".");
			}
			AnnotatioImpl.pattern_Annotatio_0_4_collectelementstobetranslated_greenBBBBBBBBFFFFFFFF(match, number,
					member, mBody, value, mAnnotation, mAccess, mAnnotationType);
			// EMoflonEdge mBody__mAnnotation____annotations = (EMoflonEdge) result4_green[8];
			// EMoflonEdge value__member____member = (EMoflonEdge) result4_green[9];
			// EMoflonEdge member__value____usages = (EMoflonEdge) result4_green[10];
			// EMoflonEdge value__number____value = (EMoflonEdge) result4_green[11];
			// EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result4_green[12];
			// EMoflonEdge mAnnotation__value____values = (EMoflonEdge) result4_green[13];
			// EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[14];
			// EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result4_green[15];

			// collect context elements
			Object[] result5_black = AnnotatioImpl.pattern_Annotatio_0_5_collectcontextelements_blackBBBBBBBB(match,
					number, member, mBody, value, mAnnotation, mAccess, mAnnotationType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[number] = " + number + ", " + "[member] = "
						+ member + ", " + "[mBody] = " + mBody + ", " + "[value] = " + value + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
						+ mAnnotationType + ".");
			}
			AnnotatioImpl.pattern_Annotatio_0_5_collectcontextelements_greenBBBBFF(match, member, mBody,
					mAnnotationType);
			// EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];
			// EMoflonEdge mAnnotationType__member____bodyDeclarations = (EMoflonEdge) result5_green[5];

			// register objects to match
			AnnotatioImpl.pattern_Annotatio_0_6_registerobjectstomatch_expressionBBBBBBBBB(this, match, number, member,
					mBody, value, mAnnotation, mAccess, mAnnotationType);
			return AnnotatioImpl.pattern_Annotatio_0_7_expressionF();
		} else {
			return AnnotatioImpl.pattern_Annotatio_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NumberLiteral number = (NumberLiteral) result1_bindingAndBlack[0];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[1];
		TAnnotationType tAnnotationType = (TAnnotationType) result1_bindingAndBlack[2];
		TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		BodyDeclaration mBody = (BodyDeclaration) result1_bindingAndBlack[4];
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[5];
		BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result1_bindingAndBlack[6];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[7];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[8];
		TypeAccess mAccess = (TypeAccess) result1_bindingAndBlack[9];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_1_1_performtransformation_greenBBBFFB(tAnnotationType,
				tAnnotable, mAnnotation, csp);
		TAnnotation tAnnotation = (TAnnotation) result1_green[3];
		AnnotationToTAnnotation mAnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[4];

		// collect translated elements
		Object[] result2_black = AnnotatioImpl.pattern_Annotatio_1_2_collecttranslatedelements_blackBBBBBB(number,
				value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[number] = " + number + ", " + "[value] = " + value + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotationToTAnnotation] = "
					+ mAnnotationToTAnnotation + ", " + "[mAccess] = " + mAccess + ".");
		}
		Object[] result2_green = AnnotatioImpl.pattern_Annotatio_1_2_collecttranslatedelements_greenFBBBBBB(number,
				value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotatioImpl.pattern_Annotatio_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult,
				number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
				value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[number] = " + number + ", " + "[member] = " + member
					+ ", " + "[tAnnotationType] = " + tAnnotationType + ", " + "[mAnnotationTypeToTAnnotationType] = "
					+ mAnnotationTypeToTAnnotationType + ", " + "[mBody] = " + mBody + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[mBodyToTAnnotable] = " + mBodyToTAnnotable + ", " + "[value] = " + value
					+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[mAnnotationToTAnnotation] = " + mAnnotationToTAnnotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationType] = " + mAnnotationType + ".");
		}
		AnnotatioImpl.pattern_Annotatio_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, number,
				member, tAnnotationType, mBody, tAnnotable, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation,
				mAccess, mAnnotationType);
		// EMoflonEdge mBody__mAnnotation____annotations = (EMoflonEdge) result3_green[12];
		// EMoflonEdge value__member____member = (EMoflonEdge) result3_green[13];
		// EMoflonEdge member__value____usages = (EMoflonEdge) result3_green[14];
		// EMoflonEdge value__number____value = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mAnnotation__value____values = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[21];
		// EMoflonEdge mAnnotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge mAnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		AnnotatioImpl.pattern_Annotatio_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult, number, member,
				tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value,
				mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType);
		return AnnotatioImpl.pattern_Annotatio_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotatioImpl.pattern_Annotatio_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NumberLiteral number = (NumberLiteral) result2_binding[0];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_binding[1];
		BodyDeclaration mBody = (BodyDeclaration) result2_binding[2];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_binding[3];
		Annotation mAnnotation = (Annotation) result2_binding[4];
		TypeAccess mAccess = (TypeAccess) result2_binding[5];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_binding[6];
		for (Object[] result2_black : AnnotatioImpl.pattern_Annotatio_2_2_corematch_blackBBFFBFFBBBBB(number, member,
				mBody, value, mAnnotation, mAccess, mAnnotationType, match)) {
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[2];
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[3];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[5];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : AnnotatioImpl.pattern_Annotatio_2_3_findcontext_blackBBBBBBBBBBB(number,
					member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
					value, mAnnotation, mAccess, mAnnotationType)) {
				Object[] result3_green = AnnotatioImpl
						.pattern_Annotatio_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(number, member,
								tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
								value, mAnnotation, mAccess, mAnnotationType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mAnnotationType__member____bodyDeclarations = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mAnnotationTypeToTAnnotationType__mAnnotationType____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge mAnnotationTypeToTAnnotationType__tAnnotationType____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge mBody__mAnnotation____annotations = (EMoflonEdge) result3_green[16];
				// EMoflonEdge mBodyToTAnnotable__mBody____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge mBodyToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge value__member____member = (EMoflonEdge) result3_green[19];
				// EMoflonEdge member__value____usages = (EMoflonEdge) result3_green[20];
				// EMoflonEdge value__number____value = (EMoflonEdge) result3_green[21];
				// EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[22];
				// EMoflonEdge mAnnotation__value____values = (EMoflonEdge) result3_green[23];
				// EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[24];
				// EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotatioImpl
						.pattern_Annotatio_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch, number,
								member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
								mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[number] = " + number + ", " + "[member] = " + member + ", " + "[tAnnotationType] = "
							+ tAnnotationType + ", " + "[mAnnotationTypeToTAnnotationType] = "
							+ mAnnotationTypeToTAnnotationType + ", " + "[mBody] = " + mBody + ", " + "[tAnnotable] = "
							+ tAnnotable + ", " + "[mBodyToTAnnotable] = " + mBodyToTAnnotable + ", " + "[value] = "
							+ value + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mAccess] = " + mAccess + ", "
							+ "[mAnnotationType] = " + mAnnotationType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotatioImpl.pattern_Annotatio_2_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AnnotatioImpl
							.pattern_Annotatio_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotatioImpl.pattern_Annotatio_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotatioImpl.pattern_Annotatio_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		match.registerObject("number", number);
		match.registerObject("member", member);
		match.registerObject("mBody", mBody);
		match.registerObject("value", value);
		match.registerObject("mAnnotation", mAnnotation);
		match.registerObject("mAccess", mAccess);
		match.registerObject("mAnnotationType", mAnnotationType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number.tokenValue", true, csp);
		var_number_tokenValue.setValue(number.getTokenValue());
		var_number_tokenValue.setType("String");

		// Create unbound variables
		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation.ID", csp);
		var_tAnnotation_ID.setType("int");

		// Create constraints
		StringToInt stringToInt = new StringToInt();

		csp.getConstraints().add(stringToInt);

		// Solve CSP
		stringToInt.setRuleName("");
		stringToInt.solve(var_number_tokenValue, var_tAnnotation_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("number", number);
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
		isApplicableMatch.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mBody", mBody);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject number, EObject member,
			EObject tAnnotationType, EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable,
			EObject mBodyToTAnnotable, EObject value, EObject mAnnotation, EObject tAnnotation,
			EObject mAnnotationToTAnnotation, EObject mAccess, EObject mAnnotationType) {
		ruleresult.registerObject("number", number);
		ruleresult.registerObject("member", member);
		ruleresult.registerObject("tAnnotationType", tAnnotationType);
		ruleresult.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		ruleresult.registerObject("mBody", mBody);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAnnotationToTAnnotation", mAnnotationToTAnnotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationType", mAnnotationType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("number").eClass())
						.equals("java.NumberLiteral.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("value").eClass())
						.equals("java.AnnotationMemberValuePair.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnnotation").eClass())
						.equals("java.Annotation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation) {
		// initial bindings
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_10_1_initialbindings_blackBBBBB(this, match,
				tAnnotationType, tAnnotable, tAnnotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[tAnnotationType] = " + tAnnotationType
					+ ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = AnnotatioImpl.pattern_Annotatio_10_2_SolveCSP_bindingAndBlackFBBBBB(this,
				match, tAnnotationType, tAnnotable, tAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[tAnnotationType] = " + tAnnotationType + ", "
					+ "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (AnnotatioImpl.pattern_Annotatio_10_3_CheckCSP_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = AnnotatioImpl.pattern_Annotatio_10_4_collectelementstobetranslated_blackBBBB(match,
					tAnnotationType, tAnnotable, tAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAnnotationType] = " + tAnnotationType + ", "
						+ "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotatioImpl.pattern_Annotatio_10_4_collectelementstobetranslated_greenBBBBFFFF(match, tAnnotationType,
					tAnnotable, tAnnotation);
			// EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result4_green[5];
			// EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result4_green[6];
			// EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = AnnotatioImpl.pattern_Annotatio_10_5_collectcontextelements_blackBBBB(match,
					tAnnotationType, tAnnotable, tAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[tAnnotationType] = " + tAnnotationType + ", "
						+ "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotatioImpl.pattern_Annotatio_10_5_collectcontextelements_greenBBB(match, tAnnotationType, tAnnotable);

			// register objects to match
			AnnotatioImpl.pattern_Annotatio_10_6_registerobjectstomatch_expressionBBBBB(this, match, tAnnotationType,
					tAnnotable, tAnnotation);
			return AnnotatioImpl.pattern_Annotatio_10_7_expressionF();
		} else {
			return AnnotatioImpl.pattern_Annotatio_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[0];
		TAnnotationType tAnnotationType = (TAnnotationType) result1_bindingAndBlack[1];
		TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		BodyDeclaration mBody = (BodyDeclaration) result1_bindingAndBlack[3];
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[4];
		BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result1_bindingAndBlack[5];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[6];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_11_1_performtransformation_greenFBBFFBFFBB(member,
				mBody, tAnnotation, mAnnotationType, csp);
		NumberLiteral number = (NumberLiteral) result1_green[0];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_green[3];
		Annotation mAnnotation = (Annotation) result1_green[4];
		AnnotationToTAnnotation mAnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[6];
		TypeAccess mAccess = (TypeAccess) result1_green[7];

		// collect translated elements
		Object[] result2_black = AnnotatioImpl.pattern_Annotatio_11_2_collecttranslatedelements_blackBBBBBB(number,
				value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[number] = " + number + ", " + "[value] = " + value + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAnnotationToTAnnotation] = "
					+ mAnnotationToTAnnotation + ", " + "[mAccess] = " + mAccess + ".");
		}
		Object[] result2_green = AnnotatioImpl.pattern_Annotatio_11_2_collecttranslatedelements_greenFBBBBBB(number,
				value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = AnnotatioImpl.pattern_Annotatio_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
				ruleresult, number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[number] = " + number + ", " + "[member] = " + member
					+ ", " + "[tAnnotationType] = " + tAnnotationType + ", " + "[mAnnotationTypeToTAnnotationType] = "
					+ mAnnotationTypeToTAnnotationType + ", " + "[mBody] = " + mBody + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[mBodyToTAnnotable] = " + mBodyToTAnnotable + ", " + "[value] = " + value
					+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[mAnnotationToTAnnotation] = " + mAnnotationToTAnnotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationType] = " + mAnnotationType + ".");
		}
		AnnotatioImpl.pattern_Annotatio_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, number,
				member, tAnnotationType, mBody, tAnnotable, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation,
				mAccess, mAnnotationType);
		// EMoflonEdge mBody__mAnnotation____annotations = (EMoflonEdge) result3_green[12];
		// EMoflonEdge value__member____member = (EMoflonEdge) result3_green[13];
		// EMoflonEdge member__value____usages = (EMoflonEdge) result3_green[14];
		// EMoflonEdge value__number____value = (EMoflonEdge) result3_green[15];
		// EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[16];
		// EMoflonEdge mAnnotation__value____values = (EMoflonEdge) result3_green[17];
		// EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[18];
		// EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[19];
		// EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[20];
		// EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[21];
		// EMoflonEdge mAnnotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[22];
		// EMoflonEdge mAnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[23];
		// EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[24];
		// EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		AnnotatioImpl.pattern_Annotatio_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult, number, member,
				tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value,
				mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType);
		return AnnotatioImpl.pattern_Annotatio_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = AnnotatioImpl.pattern_Annotatio_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotationType tAnnotationType = (TAnnotationType) result2_binding[0];
		TAnnotatable tAnnotable = (TAnnotatable) result2_binding[1];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[2];
		for (Object[] result2_black : AnnotatioImpl.pattern_Annotatio_12_2_corematch_blackBFFBFBFB(tAnnotationType,
				tAnnotable, tAnnotation, match)) {
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[1];
			BodyDeclaration mBody = (BodyDeclaration) result2_black[2];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result2_black[4];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : AnnotatioImpl.pattern_Annotatio_12_3_findcontext_blackFBBBBBBB(
					tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
					tAnnotation, mAnnotationType)) {
				AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result3_black[0];
				Object[] result3_green = AnnotatioImpl.pattern_Annotatio_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
						member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
						tAnnotation, mAnnotationType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				// EMoflonEdge mAnnotationType__member____bodyDeclarations = (EMoflonEdge) result3_green[10];
				// EMoflonEdge mAnnotationTypeToTAnnotationType__mAnnotationType____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge mAnnotationTypeToTAnnotationType__tAnnotationType____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge mBodyToTAnnotable__mBody____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge mBodyToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[15];
				// EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[16];
				// EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[17];
				// EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = AnnotatioImpl
						.pattern_Annotatio_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, member,
								tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
								tAnnotation, mAnnotationType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[member] = " + member + ", " + "[tAnnotationType] = " + tAnnotationType + ", "
							+ "[mAnnotationTypeToTAnnotationType] = " + mAnnotationTypeToTAnnotationType + ", "
							+ "[mBody] = " + mBody + ", " + "[tAnnotable] = " + tAnnotable + ", "
							+ "[mBodyToTAnnotable] = " + mBodyToTAnnotable + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[mAnnotationType] = " + mAnnotationType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (AnnotatioImpl.pattern_Annotatio_12_5_checkCSP_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = AnnotatioImpl
							.pattern_Annotatio_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					AnnotatioImpl.pattern_Annotatio_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotatioImpl.pattern_Annotatio_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation) {
		match.registerObject("tAnnotationType", tAnnotationType);
		match.registerObject("tAnnotable", tAnnotable);
		match.registerObject("tAnnotation", tAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation.ID", true, csp);
		var_tAnnotation_ID.setValue(tAnnotation.getID());
		var_tAnnotation_ID.setType("int");

		// Create unbound variables
		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number.tokenValue", csp);
		var_number_tokenValue.setType("String");

		// Create constraints
		StringToInt stringToInt = new StringToInt();

		csp.getConstraints().add(stringToInt);

		// Solve CSP
		stringToInt.setRuleName("");
		stringToInt.solve(var_number_tokenValue, var_tAnnotation_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
		isApplicableMatch.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mBody", mBody);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject number, EObject member,
			EObject tAnnotationType, EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable,
			EObject mBodyToTAnnotable, EObject value, EObject mAnnotation, EObject tAnnotation,
			EObject mAnnotationToTAnnotation, EObject mAccess, EObject mAnnotationType) {
		ruleresult.registerObject("number", number);
		ruleresult.registerObject("member", member);
		ruleresult.registerObject("tAnnotationType", tAnnotationType);
		ruleresult.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		ruleresult.registerObject("mBody", mBody);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAnnotationToTAnnotation", mAnnotationToTAnnotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationType", mAnnotationType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnnotation").eClass())
				.equals("basic.TAnnotation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_annotations) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotatioImpl
				.pattern_Annotatio_20_2_testcorematchandDECs_blackFFFFFFFB(_edge_annotations)) {
			NumberLiteral number = (NumberLiteral) result2_black[0];
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_black[1];
			BodyDeclaration mBody = (BodyDeclaration) result2_black[2];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[3];
			Annotation mAnnotation = (Annotation) result2_black[4];
			TypeAccess mAccess = (TypeAccess) result2_black[5];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[6];
			Object[] result2_green = AnnotatioImpl.pattern_Annotatio_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotatioImpl.pattern_Annotatio_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
					this, match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType)) {
				// Ensure that the correct types of elements are matched
				if (AnnotatioImpl.pattern_Annotatio_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = AnnotatioImpl.pattern_Annotatio_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotatioImpl.pattern_Annotatio_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotatioImpl.pattern_Annotatio_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_35(EMoflonEdge _edge_type) {
		// prepare return value
		Object[] result1_bindingAndBlack = AnnotatioImpl
				.pattern_Annotatio_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : AnnotatioImpl.pattern_Annotatio_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[0];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[1];
			TAnnotation tAnnotation = (TAnnotation) result2_black[2];
			Object[] result2_green = AnnotatioImpl.pattern_Annotatio_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (AnnotatioImpl.pattern_Annotatio_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, tAnnotationType, tAnnotable, tAnnotation)) {
				// Ensure that the correct types of elements are matched
				if (AnnotatioImpl.pattern_Annotatio_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = AnnotatioImpl.pattern_Annotatio_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ", " + "[isApplicableCC] = "
								+ isApplicableCC + ".");
					}
					AnnotatioImpl.pattern_Annotatio_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotatioImpl.pattern_Annotatio_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Annotatio");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("member", "name", "id", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("value", "name", "id", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("value", "proxy", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number", true, csp);
		var_number_tokenValue.setValue(__helper.getValue("number", "tokenValue"));
		var_number_tokenValue.setType("String");

		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation", true, csp);
		var_tAnnotation_ID.setValue(__helper.getValue("tAnnotation", "ID"));
		var_tAnnotation_ID.setType("int");

		StringToInt stringToInt0 = new StringToInt();
		csp.getConstraints().add(stringToInt0);

		stringToInt0.setRuleName("Annotatio");
		stringToInt0.solve(var_number_tokenValue, var_tAnnotation_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tAnnotation_ID.setBound(false);
			stringToInt0.solve(var_number_tokenValue, var_tAnnotation_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tAnnotation", "ID", var_tAnnotation_ID.getValue());
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
		ruleResult.setRule("Annotatio");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("member", "name", "id", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("value", "name", "id", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("value", "proxy", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number", true, csp);
		var_number_tokenValue.setValue(__helper.getValue("number", "tokenValue"));
		var_number_tokenValue.setType("String");

		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation", true, csp);
		var_tAnnotation_ID.setValue(__helper.getValue("tAnnotation", "ID"));
		var_tAnnotation_ID.setType("int");

		StringToInt stringToInt0 = new StringToInt();
		csp.getConstraints().add(stringToInt0);

		stringToInt0.setRuleName("Annotatio");
		stringToInt0.solve(var_number_tokenValue, var_tAnnotation_ID);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_number_tokenValue.setBound(false);
			stringToInt0.solve(var_number_tokenValue, var_tAnnotation_ID);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("number", "tokenValue", var_number_tokenValue.getValue());
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
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = AnnotatioImpl.pattern_Annotatio_24_2_matchcontext_bindingFFFFFFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		NumberLiteral number = (NumberLiteral) result2_binding[0];
		AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_binding[1];
		TAnnotationType tAnnotationType = (TAnnotationType) result2_binding[2];
		BodyDeclaration mBody = (BodyDeclaration) result2_binding[3];
		TAnnotatable tAnnotable = (TAnnotatable) result2_binding[4];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_binding[5];
		Annotation mAnnotation = (Annotation) result2_binding[6];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[7];
		TypeAccess mAccess = (TypeAccess) result2_binding[8];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_binding[9];
		for (Object[] result2_black : AnnotatioImpl.pattern_Annotatio_24_2_matchcontext_blackBBBFBBFBBBBBBB(number,
				member, tAnnotationType, mBody, tAnnotable, value, mAnnotation, tAnnotation, mAccess, mAnnotationType,
				sourceMatch, targetMatch)) {
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[3];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result2_black[6];
			Object[] result2_green = AnnotatioImpl.pattern_Annotatio_24_2_matchcontext_greenBBBBBBBBBBBBBFB(number,
					member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
					value, mAnnotation, tAnnotation, mAccess, mAnnotationType, sourceMatch, targetMatch);
			CCMatch isApplicableMatch = (CCMatch) result2_green[13];

			// check csp
			Object[] result3_bindingAndBlack = AnnotatioImpl
					.pattern_Annotatio_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBBB(this, isApplicableMatch, number,
							member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
							mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAccess, mAnnotationType, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// create correspondence
				Object[] result4_black = AnnotatioImpl.pattern_Annotatio_24_4_createcorrespondence_blackBBBBBBBBBBB(
						number, member, tAnnotationType, mBody, tAnnotable, value, mAnnotation, tAnnotation, mAccess,
						mAnnotationType, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [create correspondence] failed."
							+ " Variables: " + "[number] = " + number + ", " + "[member] = " + member + ", "
							+ "[tAnnotationType] = " + tAnnotationType + ", " + "[mBody] = " + mBody + ", "
							+ "[tAnnotable] = " + tAnnotable + ", " + "[value] = " + value + ", " + "[mAnnotation] = "
							+ mAnnotation + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAccess] = " + mAccess
							+ ", " + "[mAnnotationType] = " + mAnnotationType + ", " + "[isApplicableMatch] = "
							+ isApplicableMatch + ".");
				}
				AnnotatioImpl.pattern_Annotatio_24_4_createcorrespondence_greenBBFB(mAnnotation, tAnnotation,
						isApplicableMatch);
				// AnnotationToTAnnotation mAnnotationToTAnnotation = (AnnotationToTAnnotation) result4_green[2];

				// add to returned result
				Object[] result5_black = AnnotatioImpl.pattern_Annotatio_24_5_addtoreturnedresult_blackBB(result,
						isApplicableMatch);
				if (result5_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				AnnotatioImpl.pattern_Annotatio_24_5_addtoreturnedresult_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return AnnotatioImpl.pattern_Annotatio_24_6_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CCMatch isApplicableMatch, NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number.tokenValue", true, csp);
		var_number_tokenValue.setValue(number.getTokenValue());
		var_number_tokenValue.setType("String");
		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation.ID", true, csp);
		var_tAnnotation_ID.setValue(tAnnotation.getID());
		var_tAnnotation_ID.setType("int");

		// Create unbound variables

		// Create constraints
		StringToInt stringToInt = new StringToInt();

		csp.getConstraints().add(stringToInt);

		// Solve CSP
		stringToInt.setRuleName("");
		stringToInt.solve(var_number_tokenValue, var_tAnnotation_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("number", number);
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
		isApplicableMatch.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mBody", mBody);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
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
	public boolean checkDEC_FWD(NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {// match tgg pattern
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_27_1_matchtggpattern_blackBBBBBBB(number, member,
				mBody, value, mAnnotation, mAccess, mAnnotationType);
		if (result1_black != null) {
			AnnotatioImpl.pattern_Annotatio_27_1_matchtggpattern_greenB(value);

			return AnnotatioImpl.pattern_Annotatio_27_2_expressionF();
		} else {
			return AnnotatioImpl.pattern_Annotatio_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {// match tgg pattern
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_28_1_matchtggpattern_blackBBB(tAnnotationType,
				tAnnotable, tAnnotation);
		if (result1_black != null) {
			return AnnotatioImpl.pattern_Annotatio_28_2_expressionF();
		} else {
			return AnnotatioImpl.pattern_Annotatio_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mAnnotationTypeToTAnnotationTypeParameter,
			BodyDeclarationToTAnnotatable mBodyToTAnnotableParameter) {
		// create result
		Object[] result1_black = AnnotatioImpl.pattern_Annotatio_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotatioImpl.pattern_Annotatio_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : AnnotatioImpl
				.pattern_Annotatio_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList mAnnotationTypeToTAnnotationTypeList = (RuleEntryList) result2_black[0];
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result2_black[1];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[2];
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[3];
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[4];
			// RuleEntryList mBodyToTAnnotableList = (RuleEntryList) result2_black[5];
			BodyDeclaration mBody = (BodyDeclaration) result2_black[6];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result2_black[7];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[8];

			// solve CSP
			Object[] result3_bindingAndBlack = AnnotatioImpl.pattern_Annotatio_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
					this, isApplicableMatch, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
					tAnnotable, mBodyToTAnnotable, mAnnotationType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[member] = " + member
						+ ", " + "[tAnnotationType] = " + tAnnotationType + ", "
						+ "[mAnnotationTypeToTAnnotationType] = " + mAnnotationTypeToTAnnotationType + ", "
						+ "[mBody] = " + mBody + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[mBodyToTAnnotable] = "
						+ mBodyToTAnnotable + ", " + "[mAnnotationType] = " + mAnnotationType + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (AnnotatioImpl.pattern_Annotatio_29_4_checkCSP_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = AnnotatioImpl.pattern_Annotatio_29_5_checknacs_blackBBBBBBB(member,
						tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
						mAnnotationType);
				if (result5_black != null) {

					// perform
					Object[] result6_black = AnnotatioImpl.pattern_Annotatio_29_6_perform_blackBBBBBBBB(member,
							tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
							mAnnotationType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[member] = " + member + ", " + "[tAnnotationType] = " + tAnnotationType + ", "
								+ "[mAnnotationTypeToTAnnotationType] = " + mAnnotationTypeToTAnnotationType + ", "
								+ "[mBody] = " + mBody + ", " + "[tAnnotable] = " + tAnnotable + ", "
								+ "[mBodyToTAnnotable] = " + mBodyToTAnnotable + ", " + "[mAnnotationType] = "
								+ mAnnotationType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotatioImpl.pattern_Annotatio_29_6_perform_greenFBBBBFFFFFBBB(member, tAnnotationType, mBody,
							tAnnotable, mAnnotationType, ruleResult, csp);
					// NumberLiteral number = (NumberLiteral) result6_green[0];
					// AnnotationMemberValuePair value = (AnnotationMemberValuePair) result6_green[5];
					// Annotation mAnnotation = (Annotation) result6_green[6];
					// TAnnotation tAnnotation = (TAnnotation) result6_green[7];
					// AnnotationToTAnnotation mAnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[8];
					// TypeAccess mAccess = (TypeAccess) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return AnnotatioImpl.pattern_Annotatio_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_number_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("number.tokenValue", csp);
		var_number_tokenValue.setType("String");
		Variable var_tAnnotation_ID = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotation.ID", csp);
		var_tAnnotation_ID.setType("int");

		// Create constraints
		StringToInt stringToInt = new StringToInt();

		csp.getConstraints().add(stringToInt);

		// Solve CSP
		stringToInt.setRuleName("");
		stringToInt.solve(var_number_tokenValue, var_tAnnotation_ID);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("member", member);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
		isApplicableMatch.registerObject("mAnnotationTypeToTAnnotationType", mAnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mBody", mBody);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("mBodyToTAnnotable", mBodyToTAnnotable);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
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
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_FWD__MATCH_NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (NumberLiteral) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4), (Annotation) arguments.get(5),
					(TypeAccess) arguments.get(6), (AnnotationTypeDeclaration) arguments.get(7));
		case RulesPackage.ANNOTATIO___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATIO___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (NumberLiteral) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4), (Annotation) arguments.get(5),
					(TypeAccess) arguments.get(6), (AnnotationTypeDeclaration) arguments.get(7));
			return null;
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (NumberLiteral) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4), (Annotation) arguments.get(5),
					(TypeAccess) arguments.get(6), (AnnotationTypeDeclaration) arguments.get(7));
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_BODYDECLARATION_TANNOTATABLE_BODYDECLARATIONTOTANNOTATABLE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (NumberLiteral) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (TAnnotationType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (BodyDeclaration) arguments.get(5),
					(TAnnotatable) arguments.get(6), (BodyDeclarationToTAnnotatable) arguments.get(7),
					(AnnotationMemberValuePair) arguments.get(8), (Annotation) arguments.get(9),
					(TypeAccess) arguments.get(10), (AnnotationTypeDeclaration) arguments.get(11));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATIO___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATIO___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONTYPE_TANNOTATABLE_TANNOTATION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAnnotatable) arguments.get(2), (TAnnotation) arguments.get(3));
		case RulesPackage.ANNOTATIO___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATIO___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONTYPE_TANNOTATABLE_TANNOTATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAnnotatable) arguments.get(2), (TAnnotation) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONTYPE_TANNOTATABLE_TANNOTATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TAnnotatable) arguments.get(2), (TAnnotation) arguments.get(3));
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATIONTYPEMEMBERDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_BODYDECLARATION_TANNOTATABLE_BODYDECLARATIONTOTANNOTATABLE_TANNOTATION_ANNOTATIONTYPEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnnotationTypeMemberDeclaration) arguments.get(1), (TAnnotationType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (BodyDeclaration) arguments.get(4),
					(TAnnotatable) arguments.get(5), (BodyDeclarationToTAnnotatable) arguments.get(6),
					(TAnnotation) arguments.get(7), (AnnotationTypeDeclaration) arguments.get(8));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATIO___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATIO___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_35((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATIO___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATIO___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_SOLVE_CSP_CC__CCMATCH_NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_BODYDECLARATION_TANNOTATABLE_BODYDECLARATIONTOTANNOTATABLE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CCMatch) arguments.get(0), (NumberLiteral) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (TAnnotationType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (BodyDeclaration) arguments.get(5),
					(TAnnotatable) arguments.get(6), (BodyDeclarationToTAnnotatable) arguments.get(7),
					(AnnotationMemberValuePair) arguments.get(8), (Annotation) arguments.get(9),
					(TAnnotation) arguments.get(10), (TypeAccess) arguments.get(11),
					(AnnotationTypeDeclaration) arguments.get(12), (Match) arguments.get(13),
					(Match) arguments.get(14));
		case RulesPackage.ANNOTATIO___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATIO___CHECK_DEC_FWD__NUMBERLITERAL_ANNOTATIONTYPEMEMBERDECLARATION_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION:
			return checkDEC_FWD((NumberLiteral) arguments.get(0), (AnnotationTypeMemberDeclaration) arguments.get(1),
					(BodyDeclaration) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(Annotation) arguments.get(4), (TypeAccess) arguments.get(5),
					(AnnotationTypeDeclaration) arguments.get(6));
		case RulesPackage.ANNOTATIO___CHECK_DEC_BWD__TANNOTATIONTYPE_TANNOTATABLE_TANNOTATION:
			return checkDEC_BWD((TAnnotationType) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotation) arguments.get(2));
		case RulesPackage.ANNOTATIO___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_BODYDECLARATIONTOTANNOTATABLE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(BodyDeclarationToTAnnotatable) arguments.get(2));
		case RulesPackage.ANNOTATIO___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATIONTYPEMEMBERDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_BODYDECLARATION_TANNOTATABLE_BODYDECLARATIONTOTANNOTATABLE_ANNOTATIONTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnnotationTypeMemberDeclaration) arguments.get(1), (TAnnotationType) arguments.get(2),
					(TypeToTAbstractType) arguments.get(3), (BodyDeclaration) arguments.get(4),
					(TAnnotatable) arguments.get(5), (BodyDeclarationToTAnnotatable) arguments.get(6),
					(AnnotationTypeDeclaration) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANNOTATIO___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Annotatio_0_1_initialbindings_blackBBBBBBBBB(Annotatio _this, Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		if (!mBody.equals(member)) {
			if (!mAnnotationType.equals(mBody)) {
				return new Object[] { _this, match, number, member, mBody, value, mAnnotation, mAccess,
						mAnnotationType };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_0_2_SolveCSP_bindingFBBBBBBBBB(Annotatio _this, Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, number, member, mBody, value, mAnnotation,
				mAccess, mAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, number, member, mBody, value, mAnnotation, mAccess,
					mAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(Annotatio _this, Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		Object[] result_pattern_Annotatio_0_2_SolveCSP_binding = pattern_Annotatio_0_2_SolveCSP_bindingFBBBBBBBBB(_this,
				match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType);
		if (result_pattern_Annotatio_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Annotatio_0_2_SolveCSP_black = pattern_Annotatio_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Annotatio_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, number, member, mBody, value, mAnnotation, mAccess,
						mAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_0_3_CheckCSP_expressionFBB(Annotatio _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_0_4_collectelementstobetranslated_blackBBBBBBBB(Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		if (!mBody.equals(member)) {
			if (!mAnnotationType.equals(mBody)) {
				return new Object[] { match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_0_4_collectelementstobetranslated_greenBBBBBBBBFFFFFFFF(Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		EMoflonEdge mBody__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__member____member = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__value____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__number____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(number);
		match.getToBeTranslatedNodes().add(value);
		match.getToBeTranslatedNodes().add(mAnnotation);
		match.getToBeTranslatedNodes().add(mAccess);
		String mBody__mAnnotation____annotations_name_prime = "annotations";
		String value__member____member_name_prime = "member";
		String member__value____usages_name_prime = "usages";
		String value__number____value_name_prime = "value";
		String mAnnotation__mAccess____type_name_prime = "type";
		String mAnnotation__value____values_name_prime = "values";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAccess__mAnnotationType____type_name_prime = "type";
		mBody__mAnnotation____annotations.setSrc(mBody);
		mBody__mAnnotation____annotations.setTrg(mAnnotation);
		match.getToBeTranslatedEdges().add(mBody__mAnnotation____annotations);
		value__member____member.setSrc(value);
		value__member____member.setTrg(member);
		match.getToBeTranslatedEdges().add(value__member____member);
		member__value____usages.setSrc(member);
		member__value____usages.setTrg(value);
		match.getToBeTranslatedEdges().add(member__value____usages);
		value__number____value.setSrc(value);
		value__number____value.setTrg(number);
		match.getToBeTranslatedEdges().add(value__number____value);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mAnnotation__mAccess____type);
		mAnnotation__value____values.setSrc(mAnnotation);
		mAnnotation__value____values.setTrg(value);
		match.getToBeTranslatedEdges().add(mAnnotation__value____values);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		match.getToBeTranslatedEdges().add(mAccess__mAnnotationType____type);
		mBody__mAnnotation____annotations.setName(mBody__mAnnotation____annotations_name_prime);
		value__member____member.setName(value__member____member_name_prime);
		member__value____usages.setName(member__value____usages_name_prime);
		value__number____value.setName(value__number____value_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		mAnnotation__value____values.setName(mAnnotation__value____values_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		return new Object[] { match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType,
				mBody__mAnnotation____annotations, value__member____member, member__value____usages,
				value__number____value, mAnnotation__mAccess____type, mAnnotation__value____values,
				mAnnotationType__mAccess____usagesInTypeAccess, mAccess__mAnnotationType____type };
	}

	public static final Object[] pattern_Annotatio_0_5_collectcontextelements_blackBBBBBBBB(Match match,
			NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		if (!mBody.equals(member)) {
			if (!mAnnotationType.equals(mBody)) {
				return new Object[] { match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_0_5_collectcontextelements_greenBBBBFF(Match match,
			AnnotationTypeMemberDeclaration member, BodyDeclaration mBody, AnnotationTypeDeclaration mAnnotationType) {
		EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(member);
		match.getContextNodes().add(mBody);
		match.getContextNodes().add(mAnnotationType);
		String member__mAnnotationType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mAnnotationType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		member__mAnnotationType____abstractTypeDeclaration.setSrc(member);
		member__mAnnotationType____abstractTypeDeclaration.setTrg(mAnnotationType);
		match.getContextEdges().add(member__mAnnotationType____abstractTypeDeclaration);
		mAnnotationType__member____bodyDeclarations.setSrc(mAnnotationType);
		mAnnotationType__member____bodyDeclarations.setTrg(member);
		match.getContextEdges().add(mAnnotationType__member____bodyDeclarations);
		member__mAnnotationType____abstractTypeDeclaration
				.setName(member__mAnnotationType____abstractTypeDeclaration_name_prime);
		mAnnotationType__member____bodyDeclarations.setName(mAnnotationType__member____bodyDeclarations_name_prime);
		return new Object[] { match, member, mBody, mAnnotationType, member__mAnnotationType____abstractTypeDeclaration,
				mAnnotationType__member____bodyDeclarations };
	}

	public static final void pattern_Annotatio_0_6_registerobjectstomatch_expressionBBBBBBBBB(Annotatio _this,
			Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member, BodyDeclaration mBody,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		_this.registerObjectsToMatch_FWD(match, number, member, mBody, value, mAnnotation, mAccess, mAnnotationType);

	}

	public static final boolean pattern_Annotatio_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotatio_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Annotatio_1_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("number");
		EObject _localVariable_1 = isApplicableMatch.getObject("member");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotationType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mAnnotationTypeToTAnnotationType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mBody");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_6 = isApplicableMatch.getObject("mBodyToTAnnotable");
		EObject _localVariable_7 = isApplicableMatch.getObject("value");
		EObject _localVariable_8 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_9 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_10 = isApplicableMatch.getObject("mAnnotationType");
		EObject tmpNumber = _localVariable_0;
		EObject tmpMember = _localVariable_1;
		EObject tmpTAnnotationType = _localVariable_2;
		EObject tmpMAnnotationTypeToTAnnotationType = _localVariable_3;
		EObject tmpMBody = _localVariable_4;
		EObject tmpTAnnotable = _localVariable_5;
		EObject tmpMBodyToTAnnotable = _localVariable_6;
		EObject tmpValue = _localVariable_7;
		EObject tmpMAnnotation = _localVariable_8;
		EObject tmpMAccess = _localVariable_9;
		EObject tmpMAnnotationType = _localVariable_10;
		if (tmpNumber instanceof NumberLiteral) {
			NumberLiteral number = (NumberLiteral) tmpNumber;
			if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
				if (tmpTAnnotationType instanceof TAnnotationType) {
					TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
					if (tmpMAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) tmpMAnnotationTypeToTAnnotationType;
						if (tmpMBody instanceof BodyDeclaration) {
							BodyDeclaration mBody = (BodyDeclaration) tmpMBody;
							if (tmpTAnnotable instanceof TAnnotatable) {
								TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
								if (tmpMBodyToTAnnotable instanceof BodyDeclarationToTAnnotatable) {
									BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) tmpMBodyToTAnnotable;
									if (tmpValue instanceof AnnotationMemberValuePair) {
										AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
										if (tmpMAnnotation instanceof Annotation) {
											Annotation mAnnotation = (Annotation) tmpMAnnotation;
											if (tmpMAccess instanceof TypeAccess) {
												TypeAccess mAccess = (TypeAccess) tmpMAccess;
												if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
													AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
													return new Object[] { number, member, tAnnotationType,
															mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
															mBodyToTAnnotable, value, mAnnotation, mAccess,
															mAnnotationType, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_Annotatio_1_1_performtransformation_blackBBBBBBBBBBBFBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Annotatio _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { number, member, tAnnotationType, mAnnotationTypeToTAnnotationType,
									mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType,
									csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			Annotatio _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Annotatio_1_1_performtransformation_binding = pattern_Annotatio_1_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Annotatio_1_1_performtransformation_binding != null) {
			NumberLiteral number = (NumberLiteral) result_pattern_Annotatio_1_1_performtransformation_binding[0];
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result_pattern_Annotatio_1_1_performtransformation_binding[1];
			TAnnotationType tAnnotationType = (TAnnotationType) result_pattern_Annotatio_1_1_performtransformation_binding[2];
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result_pattern_Annotatio_1_1_performtransformation_binding[3];
			BodyDeclaration mBody = (BodyDeclaration) result_pattern_Annotatio_1_1_performtransformation_binding[4];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_Annotatio_1_1_performtransformation_binding[5];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result_pattern_Annotatio_1_1_performtransformation_binding[6];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_Annotatio_1_1_performtransformation_binding[7];
			Annotation mAnnotation = (Annotation) result_pattern_Annotatio_1_1_performtransformation_binding[8];
			TypeAccess mAccess = (TypeAccess) result_pattern_Annotatio_1_1_performtransformation_binding[9];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result_pattern_Annotatio_1_1_performtransformation_binding[10];

			Object[] result_pattern_Annotatio_1_1_performtransformation_black = pattern_Annotatio_1_1_performtransformation_blackBBBBBBBBBBBFBB(
					number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
					mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType, _this, isApplicableMatch);
			if (result_pattern_Annotatio_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Annotatio_1_1_performtransformation_black[11];

				return new Object[] { number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
						tAnnotable, mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_1_1_performtransformation_greenBBBFFB(
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, Annotation mAnnotation, CSP csp) {
		TAnnotation tAnnotation = BasicFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation mAnnotationToTAnnotation = ModiscoFactory.eINSTANCE.createAnnotationToTAnnotation();
		Object _localVariable_0 = csp.getValue("tAnnotation", "ID");
		tAnnotation.setType(tAnnotationType);
		tAnnotation.setTAnnotated(tAnnotable);
		mAnnotationToTAnnotation.setSource(mAnnotation);
		mAnnotationToTAnnotation.setTarget(tAnnotation);
		int tAnnotation_ID_prime = (int) _localVariable_0;
		tAnnotation.setID(Integer.valueOf(tAnnotation_ID_prime));
		return new Object[] { tAnnotationType, tAnnotable, mAnnotation, tAnnotation, mAnnotationToTAnnotation, csp };
	}

	public static final Object[] pattern_Annotatio_1_2_collecttranslatedelements_blackBBBBBB(NumberLiteral number,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			AnnotationToTAnnotation mAnnotationToTAnnotation, TypeAccess mAccess) {
		return new Object[] { number, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess };
	}

	public static final Object[] pattern_Annotatio_1_2_collecttranslatedelements_greenFBBBBBB(NumberLiteral number,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			AnnotationToTAnnotation mAnnotationToTAnnotation, TypeAccess mAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(number);
		ruleresult.getTranslatedElements().add(value);
		ruleresult.getTranslatedElements().add(mAnnotation);
		ruleresult.getCreatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(mAnnotationToTAnnotation);
		ruleresult.getTranslatedElements().add(mAccess);
		return new Object[] { ruleresult, number, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess };
	}

	public static final Object[] pattern_Annotatio_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType) {
		if (!number.equals(tAnnotationType)) {
			if (!number.equals(tAnnotable)) {
				if (!number.equals(value)) {
					if (!number.equals(tAnnotation)) {
						if (!member.equals(number)) {
							if (!member.equals(tAnnotationType)) {
								if (!member.equals(tAnnotable)) {
									if (!member.equals(value)) {
										if (!member.equals(tAnnotation)) {
											if (!tAnnotationType.equals(value)) {
												if (!mAnnotationTypeToTAnnotationType.equals(number)) {
													if (!mAnnotationTypeToTAnnotationType.equals(member)) {
														if (!mAnnotationTypeToTAnnotationType.equals(tAnnotationType)) {
															if (!mAnnotationTypeToTAnnotationType.equals(mBody)) {
																if (!mAnnotationTypeToTAnnotationType
																		.equals(tAnnotable)) {
																	if (!mAnnotationTypeToTAnnotationType
																			.equals(mBodyToTAnnotable)) {
																		if (!mAnnotationTypeToTAnnotationType
																				.equals(value)) {
																			if (!mAnnotationTypeToTAnnotationType
																					.equals(tAnnotation)) {
																				if (!mBody.equals(number)) {
																					if (!mBody.equals(member)) {
																						if (!mBody.equals(
																								tAnnotationType)) {
																							if (!mBody.equals(
																									tAnnotable)) {
																								if (!mBody.equals(
																										mBodyToTAnnotable)) {
																									if (!mBody.equals(
																											value)) {
																										if (!mBody
																												.equals(tAnnotation)) {
																											if (!tAnnotable
																													.equals(tAnnotationType)) {
																												if (!tAnnotable
																														.equals(value)) {
																													if (!tAnnotable
																															.equals(tAnnotation)) {
																														if (!mBodyToTAnnotable
																																.equals(number)) {
																															if (!mBodyToTAnnotable
																																	.equals(member)) {
																																if (!mBodyToTAnnotable
																																		.equals(tAnnotationType)) {
																																	if (!mBodyToTAnnotable
																																			.equals(tAnnotable)) {
																																		if (!mBodyToTAnnotable
																																				.equals(value)) {
																																			if (!mBodyToTAnnotable
																																					.equals(tAnnotation)) {
																																				if (!mAnnotation
																																						.equals(number)) {
																																					if (!mAnnotation
																																							.equals(member)) {
																																						if (!mAnnotation
																																								.equals(tAnnotationType)) {
																																							if (!mAnnotation
																																									.equals(mAnnotationTypeToTAnnotationType)) {
																																								if (!mAnnotation
																																										.equals(mBody)) {
																																									if (!mAnnotation
																																											.equals(tAnnotable)) {
																																										if (!mAnnotation
																																												.equals(mBodyToTAnnotable)) {
																																											if (!mAnnotation
																																													.equals(value)) {
																																												if (!mAnnotation
																																														.equals(tAnnotation)) {
																																													if (!mAnnotation
																																															.equals(mAnnotationToTAnnotation)) {
																																														if (!mAnnotation
																																																.equals(mAnnotationType)) {
																																															if (!tAnnotation
																																																	.equals(tAnnotationType)) {
																																																if (!tAnnotation
																																																		.equals(value)) {
																																																	if (!mAnnotationToTAnnotation
																																																			.equals(number)) {
																																																		if (!mAnnotationToTAnnotation
																																																				.equals(member)) {
																																																			if (!mAnnotationToTAnnotation
																																																					.equals(tAnnotationType)) {
																																																				if (!mAnnotationToTAnnotation
																																																						.equals(mAnnotationTypeToTAnnotationType)) {
																																																					if (!mAnnotationToTAnnotation
																																																							.equals(mBody)) {
																																																						if (!mAnnotationToTAnnotation
																																																								.equals(tAnnotable)) {
																																																							if (!mAnnotationToTAnnotation
																																																									.equals(mBodyToTAnnotable)) {
																																																								if (!mAnnotationToTAnnotation
																																																										.equals(value)) {
																																																									if (!mAnnotationToTAnnotation
																																																											.equals(tAnnotation)) {
																																																										if (!mAnnotationToTAnnotation
																																																												.equals(mAnnotationType)) {
																																																											if (!mAccess
																																																													.equals(number)) {
																																																												if (!mAccess
																																																														.equals(member)) {
																																																													if (!mAccess
																																																															.equals(tAnnotationType)) {
																																																														if (!mAccess
																																																																.equals(mAnnotationTypeToTAnnotationType)) {
																																																															if (!mAccess
																																																																	.equals(mBody)) {
																																																																if (!mAccess
																																																																		.equals(tAnnotable)) {
																																																																	if (!mAccess
																																																																			.equals(mBodyToTAnnotable)) {
																																																																		if (!mAccess
																																																																				.equals(value)) {
																																																																			if (!mAccess
																																																																					.equals(mAnnotation)) {
																																																																				if (!mAccess
																																																																						.equals(tAnnotation)) {
																																																																					if (!mAccess
																																																																							.equals(mAnnotationToTAnnotation)) {
																																																																						if (!mAccess
																																																																								.equals(mAnnotationType)) {
																																																																							if (!mAnnotationType
																																																																									.equals(number)) {
																																																																								if (!mAnnotationType
																																																																										.equals(member)) {
																																																																									if (!mAnnotationType
																																																																											.equals(tAnnotationType)) {
																																																																										if (!mAnnotationType
																																																																												.equals(mAnnotationTypeToTAnnotationType)) {
																																																																											if (!mAnnotationType
																																																																													.equals(mBody)) {
																																																																												if (!mAnnotationType
																																																																														.equals(tAnnotable)) {
																																																																													if (!mAnnotationType
																																																																															.equals(mBodyToTAnnotable)) {
																																																																														if (!mAnnotationType
																																																																																.equals(value)) {
																																																																															if (!mAnnotationType
																																																																																	.equals(tAnnotation)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		number,
																																																																																		member,
																																																																																		tAnnotationType,
																																																																																		mAnnotationTypeToTAnnotationType,
																																																																																		mBody,
																																																																																		tAnnotable,
																																																																																		mBodyToTAnnotable,
																																																																																		value,
																																																																																		mAnnotation,
																																																																																		tAnnotation,
																																																																																		mAnnotationToTAnnotation,
																																																																																		mAccess,
																																																																																		mAnnotationType };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Annotatio_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType, EObject mBody,
			EObject tAnnotable, EObject value, EObject mAnnotation, EObject tAnnotation,
			EObject mAnnotationToTAnnotation, EObject mAccess, EObject mAnnotationType) {
		EMoflonEdge mBody__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__member____member = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__value____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__number____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Annotatio";
		String mBody__mAnnotation____annotations_name_prime = "annotations";
		String value__member____member_name_prime = "member";
		String member__value____usages_name_prime = "usages";
		String value__number____value_name_prime = "value";
		String mAnnotation__mAccess____type_name_prime = "type";
		String mAnnotation__value____values_name_prime = "values";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String mAnnotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String mAnnotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAccess__mAnnotationType____type_name_prime = "type";
		mBody__mAnnotation____annotations.setSrc(mBody);
		mBody__mAnnotation____annotations.setTrg(mAnnotation);
		ruleresult.getTranslatedEdges().add(mBody__mAnnotation____annotations);
		value__member____member.setSrc(value);
		value__member____member.setTrg(member);
		ruleresult.getTranslatedEdges().add(value__member____member);
		member__value____usages.setSrc(member);
		member__value____usages.setTrg(value);
		ruleresult.getTranslatedEdges().add(member__value____usages);
		value__number____value.setSrc(value);
		value__number____value.setTrg(number);
		ruleresult.getTranslatedEdges().add(value__number____value);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mAnnotation__mAccess____type);
		mAnnotation__value____values.setSrc(mAnnotation);
		mAnnotation__value____values.setTrg(value);
		ruleresult.getTranslatedEdges().add(mAnnotation__value____values);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotationType____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		mAnnotationToTAnnotation__mAnnotation____source.setSrc(mAnnotationToTAnnotation);
		mAnnotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mAnnotationToTAnnotation__mAnnotation____source);
		mAnnotationToTAnnotation__tAnnotation____target.setSrc(mAnnotationToTAnnotation);
		mAnnotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(mAnnotationToTAnnotation__tAnnotation____target);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		ruleresult.getTranslatedEdges().add(mAccess__mAnnotationType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBody__mAnnotation____annotations.setName(mBody__mAnnotation____annotations_name_prime);
		value__member____member.setName(value__member____member_name_prime);
		member__value____usages.setName(member__value____usages_name_prime);
		value__number____value.setName(value__number____value_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		mAnnotation__value____values.setName(mAnnotation__value____values_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		mAnnotationToTAnnotation__mAnnotation____source
				.setName(mAnnotationToTAnnotation__mAnnotation____source_name_prime);
		mAnnotationToTAnnotation__tAnnotation____target
				.setName(mAnnotationToTAnnotation__tAnnotation____target_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		return new Object[] { ruleresult, number, member, tAnnotationType, mBody, tAnnotable, value, mAnnotation,
				tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType, mBody__mAnnotation____annotations,
				value__member____member, member__value____usages, value__number____value, mAnnotation__mAccess____type,
				mAnnotation__value____values, tAnnotation__tAnnotationType____type,
				tAnnotationType__tAnnotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation, mAnnotationToTAnnotation__mAnnotation____source,
				mAnnotationToTAnnotation__tAnnotation____target, mAnnotationType__mAccess____usagesInTypeAccess,
				mAccess__mAnnotationType____type };
	}

	public static final void pattern_Annotatio_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(Annotatio _this,
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType) {
		_this.registerObjects_FWD(ruleresult, number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
				tAnnotable, mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess,
				mAnnotationType);

	}

	public static final PerformRuleResult pattern_Annotatio_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotatio_2_1_preparereturnvalue_bindingFB(Annotatio _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_2_1_preparereturnvalue_blackFBB(EClass eClass, Annotatio _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Annotatio_2_1_preparereturnvalue_bindingAndBlackFFB(Annotatio _this) {
		Object[] result_pattern_Annotatio_2_1_preparereturnvalue_binding = pattern_Annotatio_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotatio_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Annotatio_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotatio_2_1_preparereturnvalue_black = pattern_Annotatio_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Annotatio_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Annotatio_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Annotatio";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Annotatio_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("number");
		EObject _localVariable_1 = match.getObject("member");
		EObject _localVariable_2 = match.getObject("mBody");
		EObject _localVariable_3 = match.getObject("value");
		EObject _localVariable_4 = match.getObject("mAnnotation");
		EObject _localVariable_5 = match.getObject("mAccess");
		EObject _localVariable_6 = match.getObject("mAnnotationType");
		EObject tmpNumber = _localVariable_0;
		EObject tmpMember = _localVariable_1;
		EObject tmpMBody = _localVariable_2;
		EObject tmpValue = _localVariable_3;
		EObject tmpMAnnotation = _localVariable_4;
		EObject tmpMAccess = _localVariable_5;
		EObject tmpMAnnotationType = _localVariable_6;
		if (tmpNumber instanceof NumberLiteral) {
			NumberLiteral number = (NumberLiteral) tmpNumber;
			if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
				if (tmpMBody instanceof BodyDeclaration) {
					BodyDeclaration mBody = (BodyDeclaration) tmpMBody;
					if (tmpValue instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
						if (tmpMAnnotation instanceof Annotation) {
							Annotation mAnnotation = (Annotation) tmpMAnnotation;
							if (tmpMAccess instanceof TypeAccess) {
								TypeAccess mAccess = (TypeAccess) tmpMAccess;
								if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
									return new Object[] { number, member, mBody, value, mAnnotation, mAccess,
											mAnnotationType, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotatio_2_2_corematch_blackBBFFBFFBBBBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, BodyDeclaration mBody, AnnotationMemberValuePair value,
			Annotation mAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mBody.equals(member)) {
			if (!mAnnotationType.equals(mBody)) {
				String member_name = member.getName();
				if (member_name.equals("id")) {
					String value_name = value.getName();
					if (value_name.equals("id")) {
						boolean value_proxy = value.isProxy();
						if (Boolean.valueOf(value_proxy).equals(false)) {
							for (TypeToTAbstractType mAnnotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mAnnotationType, TypeToTAbstractType.class, "source")) {
								TAbstractType tmpTAnnotationType = mAnnotationTypeToTAnnotationType.getTarget();
								if (tmpTAnnotationType instanceof TAnnotationType) {
									TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
									for (BodyDeclarationToTAnnotatable mBodyToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mBody, BodyDeclarationToTAnnotatable.class,
													"source")) {
										TAnnotatable tAnnotable = mBodyToTAnnotable.getTarget();
										if (tAnnotable != null) {
											if (!tAnnotable.equals(tAnnotationType)) {
												_result.add(new Object[] { number, member, tAnnotationType,
														mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
														mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType,
														match });
											}
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

	public static final Iterable<Object[]> pattern_Annotatio_2_3_findcontext_blackBBBBBBBBBBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					if (mAnnotationType.equals(member.getAbstractTypeDeclaration())) {
						if (mAnnotationType.equals(mAnnotationTypeToTAnnotationType.getSource())) {
							if (tAnnotationType.equals(mAnnotationTypeToTAnnotationType.getTarget())) {
								if (mBody.getAnnotations().contains(mAnnotation)) {
									if (mBody.equals(mBodyToTAnnotable.getSource())) {
										if (tAnnotable.equals(mBodyToTAnnotable.getTarget())) {
											if (member.equals(value.getMember())) {
												if (number.equals(value.getValue())) {
													if (mAccess.equals(mAnnotation.getType())) {
														if (mAnnotation.getValues().contains(value)) {
															if (mAnnotationType.getUsagesInTypeAccess()
																	.contains(mAccess)) {
																String member_name = member.getName();
																if (member_name.equals("id")) {
																	String value_name = value.getName();
																	if (value_name.equals("id")) {
																		boolean value_proxy = value.isProxy();
																		if (Boolean.valueOf(value_proxy)
																				.equals(false)) {
																			_result.add(new Object[] { number, member,
																					tAnnotationType,
																					mAnnotationTypeToTAnnotationType,
																					mBody, tAnnotable,
																					mBodyToTAnnotable, value,
																					mAnnotation, mAccess,
																					mAnnotationType });
																		}

																	}

																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Annotatio_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationTypeToTAnnotationType__mAnnotationType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotationTypeToTAnnotationType__tAnnotationType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBody__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotable__mBody____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__member____member = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__value____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__number____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String member__mAnnotationType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mAnnotationType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String mAnnotationTypeToTAnnotationType__mAnnotationType____source_name_prime = "source";
		String mAnnotationTypeToTAnnotationType__tAnnotationType____target_name_prime = "target";
		String mBody__mAnnotation____annotations_name_prime = "annotations";
		String mBodyToTAnnotable__mBody____source_name_prime = "source";
		String mBodyToTAnnotable__tAnnotable____target_name_prime = "target";
		String value__member____member_name_prime = "member";
		String member__value____usages_name_prime = "usages";
		String value__number____value_name_prime = "value";
		String mAnnotation__mAccess____type_name_prime = "type";
		String mAnnotation__value____values_name_prime = "values";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAccess__mAnnotationType____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(number);
		isApplicableMatch.getAllContextElements().add(member);
		isApplicableMatch.getAllContextElements().add(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType);
		isApplicableMatch.getAllContextElements().add(mBody);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationType);
		member__mAnnotationType____abstractTypeDeclaration.setSrc(member);
		member__mAnnotationType____abstractTypeDeclaration.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(member__mAnnotationType____abstractTypeDeclaration);
		mAnnotationType__member____bodyDeclarations.setSrc(mAnnotationType);
		mAnnotationType__member____bodyDeclarations.setTrg(member);
		isApplicableMatch.getAllContextElements().add(mAnnotationType__member____bodyDeclarations);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source.setSrc(mAnnotationTypeToTAnnotationType);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType__mAnnotationType____source);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target.setSrc(mAnnotationTypeToTAnnotationType);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType__tAnnotationType____target);
		mBody__mAnnotation____annotations.setSrc(mBody);
		mBody__mAnnotation____annotations.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mBody__mAnnotation____annotations);
		mBodyToTAnnotable__mBody____source.setSrc(mBodyToTAnnotable);
		mBodyToTAnnotable__mBody____source.setTrg(mBody);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable__mBody____source);
		mBodyToTAnnotable__tAnnotable____target.setSrc(mBodyToTAnnotable);
		mBodyToTAnnotable__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable__tAnnotable____target);
		value__member____member.setSrc(value);
		value__member____member.setTrg(member);
		isApplicableMatch.getAllContextElements().add(value__member____member);
		member__value____usages.setSrc(member);
		member__value____usages.setTrg(value);
		isApplicableMatch.getAllContextElements().add(member__value____usages);
		value__number____value.setSrc(value);
		value__number____value.setTrg(number);
		isApplicableMatch.getAllContextElements().add(value__number____value);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mAccess____type);
		mAnnotation__value____values.setSrc(mAnnotation);
		mAnnotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(mAnnotation__value____values);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAccess__mAnnotationType____type);
		member__mAnnotationType____abstractTypeDeclaration
				.setName(member__mAnnotationType____abstractTypeDeclaration_name_prime);
		mAnnotationType__member____bodyDeclarations.setName(mAnnotationType__member____bodyDeclarations_name_prime);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source
				.setName(mAnnotationTypeToTAnnotationType__mAnnotationType____source_name_prime);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target
				.setName(mAnnotationTypeToTAnnotationType__tAnnotationType____target_name_prime);
		mBody__mAnnotation____annotations.setName(mBody__mAnnotation____annotations_name_prime);
		mBodyToTAnnotable__mBody____source.setName(mBodyToTAnnotable__mBody____source_name_prime);
		mBodyToTAnnotable__tAnnotable____target.setName(mBodyToTAnnotable__tAnnotable____target_name_prime);
		value__member____member.setName(value__member____member_name_prime);
		member__value____usages.setName(member__value____usages_name_prime);
		value__number____value.setName(value__number____value_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		mAnnotation__value____values.setName(mAnnotation__value____values_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		return new Object[] { number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType, isApplicableMatch,
				member__mAnnotationType____abstractTypeDeclaration, mAnnotationType__member____bodyDeclarations,
				mAnnotationTypeToTAnnotationType__mAnnotationType____source,
				mAnnotationTypeToTAnnotationType__tAnnotationType____target, mBody__mAnnotation____annotations,
				mBodyToTAnnotable__mBody____source, mBodyToTAnnotable__tAnnotable____target, value__member____member,
				member__value____usages, value__number____value, mAnnotation__mAccess____type,
				mAnnotation__value____values, mAnnotationType__mAccess____usagesInTypeAccess,
				mAccess__mAnnotationType____type };
	}

	public static final Object[] pattern_Annotatio_2_4_solveCSP_bindingFBBBBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, number, member, tAnnotationType,
				mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation, mAccess,
				mAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, number, member, tAnnotationType,
					mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation, mAccess,
					mAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		Object[] result_pattern_Annotatio_2_4_solveCSP_binding = pattern_Annotatio_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
				tAnnotable, mBodyToTAnnotable, value, mAnnotation, mAccess, mAnnotationType);
		if (result_pattern_Annotatio_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_2_4_solveCSP_binding[0];

			Object[] result_pattern_Annotatio_2_4_solveCSP_black = pattern_Annotatio_2_4_solveCSP_blackB(csp);
			if (result_pattern_Annotatio_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, number, member, tAnnotationType,
						mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation,
						mAccess, mAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_2_5_checkCSP_expressionFBB(Annotatio _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Annotatio_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Annotatio";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotatio_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotatio_10_1_initialbindings_blackBBBBB(Annotatio _this, Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		if (!tAnnotable.equals(tAnnotationType)) {
			return new Object[] { _this, match, tAnnotationType, tAnnotable, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_10_2_SolveCSP_bindingFBBBBB(Annotatio _this, Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotationType, tAnnotable, tAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotationType, tAnnotable, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_10_2_SolveCSP_bindingAndBlackFBBBBB(Annotatio _this, Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		Object[] result_pattern_Annotatio_10_2_SolveCSP_binding = pattern_Annotatio_10_2_SolveCSP_bindingFBBBBB(_this,
				match, tAnnotationType, tAnnotable, tAnnotation);
		if (result_pattern_Annotatio_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Annotatio_10_2_SolveCSP_black = pattern_Annotatio_10_2_SolveCSP_blackB(csp);
			if (result_pattern_Annotatio_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotationType, tAnnotable, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_10_3_CheckCSP_expressionFBB(Annotatio _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		if (!tAnnotable.equals(tAnnotationType)) {
			return new Object[] { match, tAnnotationType, tAnnotable, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_10_4_collectelementstobetranslated_greenBBBBFFFF(Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnnotation);
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		match.getToBeTranslatedEdges().add(tAnnotation__tAnnotationType____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		match.getToBeTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		return new Object[] { match, tAnnotationType, tAnnotable, tAnnotation, tAnnotation__tAnnotationType____type,
				tAnnotationType__tAnnotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final Object[] pattern_Annotatio_10_5_collectcontextelements_blackBBBB(Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		if (!tAnnotable.equals(tAnnotationType)) {
			return new Object[] { match, tAnnotationType, tAnnotable, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_10_5_collectcontextelements_greenBBB(Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable) {
		match.getContextNodes().add(tAnnotationType);
		match.getContextNodes().add(tAnnotable);
		return new Object[] { match, tAnnotationType, tAnnotable };
	}

	public static final void pattern_Annotatio_10_6_registerobjectstomatch_expressionBBBBB(Annotatio _this, Match match,
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		_this.registerObjectsToMatch_BWD(match, tAnnotationType, tAnnotable, tAnnotation);

	}

	public static final boolean pattern_Annotatio_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotatio_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Annotatio_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("member");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotationType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationTypeToTAnnotationType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mBody");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_5 = isApplicableMatch.getObject("mBodyToTAnnotable");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnnotationType");
		EObject tmpMember = _localVariable_0;
		EObject tmpTAnnotationType = _localVariable_1;
		EObject tmpMAnnotationTypeToTAnnotationType = _localVariable_2;
		EObject tmpMBody = _localVariable_3;
		EObject tmpTAnnotable = _localVariable_4;
		EObject tmpMBodyToTAnnotable = _localVariable_5;
		EObject tmpTAnnotation = _localVariable_6;
		EObject tmpMAnnotationType = _localVariable_7;
		if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
			if (tmpTAnnotationType instanceof TAnnotationType) {
				TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
				if (tmpMAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) tmpMAnnotationTypeToTAnnotationType;
					if (tmpMBody instanceof BodyDeclaration) {
						BodyDeclaration mBody = (BodyDeclaration) tmpMBody;
						if (tmpTAnnotable instanceof TAnnotatable) {
							TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
							if (tmpMBodyToTAnnotable instanceof BodyDeclarationToTAnnotatable) {
								BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) tmpMBodyToTAnnotable;
								if (tmpTAnnotation instanceof TAnnotation) {
									TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
									if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
										AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
										return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType,
												mBody, tAnnotable, mBodyToTAnnotable, tAnnotation, mAnnotationType,
												isApplicableMatch };
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

	public static final Object[] pattern_Annotatio_11_1_performtransformation_blackBBBBBBBBFBB(
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, Annotatio _this, IsApplicableMatch isApplicableMatch) {
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
									tAnnotable, mBodyToTAnnotable, tAnnotation, mAnnotationType, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			Annotatio _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Annotatio_11_1_performtransformation_binding = pattern_Annotatio_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Annotatio_11_1_performtransformation_binding != null) {
			AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) result_pattern_Annotatio_11_1_performtransformation_binding[0];
			TAnnotationType tAnnotationType = (TAnnotationType) result_pattern_Annotatio_11_1_performtransformation_binding[1];
			TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) result_pattern_Annotatio_11_1_performtransformation_binding[2];
			BodyDeclaration mBody = (BodyDeclaration) result_pattern_Annotatio_11_1_performtransformation_binding[3];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_Annotatio_11_1_performtransformation_binding[4];
			BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) result_pattern_Annotatio_11_1_performtransformation_binding[5];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_Annotatio_11_1_performtransformation_binding[6];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result_pattern_Annotatio_11_1_performtransformation_binding[7];

			Object[] result_pattern_Annotatio_11_1_performtransformation_black = pattern_Annotatio_11_1_performtransformation_blackBBBBBBBBFBB(
					member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable,
					tAnnotation, mAnnotationType, _this, isApplicableMatch);
			if (result_pattern_Annotatio_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Annotatio_11_1_performtransformation_black[8];

				return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
						mBodyToTAnnotable, tAnnotation, mAnnotationType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_11_1_performtransformation_greenFBBFFBFFBB(
			AnnotationTypeMemberDeclaration member, BodyDeclaration mBody, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, CSP csp) {
		NumberLiteral number = JavaFactory.eINSTANCE.createNumberLiteral();
		AnnotationMemberValuePair value = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Annotation mAnnotation = JavaFactory.eINSTANCE.createAnnotation();
		AnnotationToTAnnotation mAnnotationToTAnnotation = ModiscoFactory.eINSTANCE.createAnnotationToTAnnotation();
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("number", "tokenValue");
		String value_name_prime = "id";
		boolean value_proxy_prime = false;
		value.setMember(member);
		value.setValue(number);
		mBody.getAnnotations().add(mAnnotation);
		mAnnotation.getValues().add(value);
		mAnnotationToTAnnotation.setSource(mAnnotation);
		mAnnotationToTAnnotation.setTarget(tAnnotation);
		mAnnotation.setType(mAccess);
		mAnnotationType.getUsagesInTypeAccess().add(mAccess);
		String number_tokenValue_prime = (String) _localVariable_0;
		value.setName(value_name_prime);
		value.setProxy(Boolean.valueOf(value_proxy_prime));
		number.setTokenValue(number_tokenValue_prime);
		return new Object[] { number, member, mBody, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess,
				mAnnotationType, csp };
	}

	public static final Object[] pattern_Annotatio_11_2_collecttranslatedelements_blackBBBBBB(NumberLiteral number,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			AnnotationToTAnnotation mAnnotationToTAnnotation, TypeAccess mAccess) {
		return new Object[] { number, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess };
	}

	public static final Object[] pattern_Annotatio_11_2_collecttranslatedelements_greenFBBBBBB(NumberLiteral number,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			AnnotationToTAnnotation mAnnotationToTAnnotation, TypeAccess mAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(number);
		ruleresult.getCreatedElements().add(value);
		ruleresult.getCreatedElements().add(mAnnotation);
		ruleresult.getTranslatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(mAnnotationToTAnnotation);
		ruleresult.getCreatedElements().add(mAccess);
		return new Object[] { ruleresult, number, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess };
	}

	public static final Object[] pattern_Annotatio_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType) {
		if (!number.equals(tAnnotationType)) {
			if (!number.equals(tAnnotable)) {
				if (!number.equals(value)) {
					if (!number.equals(tAnnotation)) {
						if (!member.equals(number)) {
							if (!member.equals(tAnnotationType)) {
								if (!member.equals(tAnnotable)) {
									if (!member.equals(value)) {
										if (!member.equals(tAnnotation)) {
											if (!tAnnotationType.equals(value)) {
												if (!mAnnotationTypeToTAnnotationType.equals(number)) {
													if (!mAnnotationTypeToTAnnotationType.equals(member)) {
														if (!mAnnotationTypeToTAnnotationType.equals(tAnnotationType)) {
															if (!mAnnotationTypeToTAnnotationType.equals(mBody)) {
																if (!mAnnotationTypeToTAnnotationType
																		.equals(tAnnotable)) {
																	if (!mAnnotationTypeToTAnnotationType
																			.equals(mBodyToTAnnotable)) {
																		if (!mAnnotationTypeToTAnnotationType
																				.equals(value)) {
																			if (!mAnnotationTypeToTAnnotationType
																					.equals(tAnnotation)) {
																				if (!mBody.equals(number)) {
																					if (!mBody.equals(member)) {
																						if (!mBody.equals(
																								tAnnotationType)) {
																							if (!mBody.equals(
																									tAnnotable)) {
																								if (!mBody.equals(
																										mBodyToTAnnotable)) {
																									if (!mBody.equals(
																											value)) {
																										if (!mBody
																												.equals(tAnnotation)) {
																											if (!tAnnotable
																													.equals(tAnnotationType)) {
																												if (!tAnnotable
																														.equals(value)) {
																													if (!tAnnotable
																															.equals(tAnnotation)) {
																														if (!mBodyToTAnnotable
																																.equals(number)) {
																															if (!mBodyToTAnnotable
																																	.equals(member)) {
																																if (!mBodyToTAnnotable
																																		.equals(tAnnotationType)) {
																																	if (!mBodyToTAnnotable
																																			.equals(tAnnotable)) {
																																		if (!mBodyToTAnnotable
																																				.equals(value)) {
																																			if (!mBodyToTAnnotable
																																					.equals(tAnnotation)) {
																																				if (!mAnnotation
																																						.equals(number)) {
																																					if (!mAnnotation
																																							.equals(member)) {
																																						if (!mAnnotation
																																								.equals(tAnnotationType)) {
																																							if (!mAnnotation
																																									.equals(mAnnotationTypeToTAnnotationType)) {
																																								if (!mAnnotation
																																										.equals(mBody)) {
																																									if (!mAnnotation
																																											.equals(tAnnotable)) {
																																										if (!mAnnotation
																																												.equals(mBodyToTAnnotable)) {
																																											if (!mAnnotation
																																													.equals(value)) {
																																												if (!mAnnotation
																																														.equals(tAnnotation)) {
																																													if (!mAnnotation
																																															.equals(mAnnotationToTAnnotation)) {
																																														if (!mAnnotation
																																																.equals(mAnnotationType)) {
																																															if (!tAnnotation
																																																	.equals(tAnnotationType)) {
																																																if (!tAnnotation
																																																		.equals(value)) {
																																																	if (!mAnnotationToTAnnotation
																																																			.equals(number)) {
																																																		if (!mAnnotationToTAnnotation
																																																				.equals(member)) {
																																																			if (!mAnnotationToTAnnotation
																																																					.equals(tAnnotationType)) {
																																																				if (!mAnnotationToTAnnotation
																																																						.equals(mAnnotationTypeToTAnnotationType)) {
																																																					if (!mAnnotationToTAnnotation
																																																							.equals(mBody)) {
																																																						if (!mAnnotationToTAnnotation
																																																								.equals(tAnnotable)) {
																																																							if (!mAnnotationToTAnnotation
																																																									.equals(mBodyToTAnnotable)) {
																																																								if (!mAnnotationToTAnnotation
																																																										.equals(value)) {
																																																									if (!mAnnotationToTAnnotation
																																																											.equals(tAnnotation)) {
																																																										if (!mAnnotationToTAnnotation
																																																												.equals(mAnnotationType)) {
																																																											if (!mAccess
																																																													.equals(number)) {
																																																												if (!mAccess
																																																														.equals(member)) {
																																																													if (!mAccess
																																																															.equals(tAnnotationType)) {
																																																														if (!mAccess
																																																																.equals(mAnnotationTypeToTAnnotationType)) {
																																																															if (!mAccess
																																																																	.equals(mBody)) {
																																																																if (!mAccess
																																																																		.equals(tAnnotable)) {
																																																																	if (!mAccess
																																																																			.equals(mBodyToTAnnotable)) {
																																																																		if (!mAccess
																																																																				.equals(value)) {
																																																																			if (!mAccess
																																																																					.equals(mAnnotation)) {
																																																																				if (!mAccess
																																																																						.equals(tAnnotation)) {
																																																																					if (!mAccess
																																																																							.equals(mAnnotationToTAnnotation)) {
																																																																						if (!mAccess
																																																																								.equals(mAnnotationType)) {
																																																																							if (!mAnnotationType
																																																																									.equals(number)) {
																																																																								if (!mAnnotationType
																																																																										.equals(member)) {
																																																																									if (!mAnnotationType
																																																																											.equals(tAnnotationType)) {
																																																																										if (!mAnnotationType
																																																																												.equals(mAnnotationTypeToTAnnotationType)) {
																																																																											if (!mAnnotationType
																																																																													.equals(mBody)) {
																																																																												if (!mAnnotationType
																																																																														.equals(tAnnotable)) {
																																																																													if (!mAnnotationType
																																																																															.equals(mBodyToTAnnotable)) {
																																																																														if (!mAnnotationType
																																																																																.equals(value)) {
																																																																															if (!mAnnotationType
																																																																																	.equals(tAnnotation)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		number,
																																																																																		member,
																																																																																		tAnnotationType,
																																																																																		mAnnotationTypeToTAnnotationType,
																																																																																		mBody,
																																																																																		tAnnotable,
																																																																																		mBodyToTAnnotable,
																																																																																		value,
																																																																																		mAnnotation,
																																																																																		tAnnotation,
																																																																																		mAnnotationToTAnnotation,
																																																																																		mAccess,
																																																																																		mAnnotationType };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Annotatio_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType, EObject mBody,
			EObject tAnnotable, EObject value, EObject mAnnotation, EObject tAnnotation,
			EObject mAnnotationToTAnnotation, EObject mAccess, EObject mAnnotationType) {
		EMoflonEdge mBody__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__member____member = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge member__value____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__number____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Annotatio";
		String mBody__mAnnotation____annotations_name_prime = "annotations";
		String value__member____member_name_prime = "member";
		String member__value____usages_name_prime = "usages";
		String value__number____value_name_prime = "value";
		String mAnnotation__mAccess____type_name_prime = "type";
		String mAnnotation__value____values_name_prime = "values";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String mAnnotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String mAnnotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAccess__mAnnotationType____type_name_prime = "type";
		mBody__mAnnotation____annotations.setSrc(mBody);
		mBody__mAnnotation____annotations.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mBody__mAnnotation____annotations);
		value__member____member.setSrc(value);
		value__member____member.setTrg(member);
		ruleresult.getCreatedEdges().add(value__member____member);
		member__value____usages.setSrc(member);
		member__value____usages.setTrg(value);
		ruleresult.getCreatedEdges().add(member__value____usages);
		value__number____value.setSrc(value);
		value__number____value.setTrg(number);
		ruleresult.getCreatedEdges().add(value__number____value);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAnnotation__mAccess____type);
		mAnnotation__value____values.setSrc(mAnnotation);
		mAnnotation__value____values.setTrg(value);
		ruleresult.getCreatedEdges().add(mAnnotation__value____values);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotationType____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		mAnnotationToTAnnotation__mAnnotation____source.setSrc(mAnnotationToTAnnotation);
		mAnnotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mAnnotationToTAnnotation__mAnnotation____source);
		mAnnotationToTAnnotation__tAnnotation____target.setSrc(mAnnotationToTAnnotation);
		mAnnotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(mAnnotationToTAnnotation__tAnnotation____target);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		ruleresult.getCreatedEdges().add(mAccess__mAnnotationType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBody__mAnnotation____annotations.setName(mBody__mAnnotation____annotations_name_prime);
		value__member____member.setName(value__member____member_name_prime);
		member__value____usages.setName(member__value____usages_name_prime);
		value__number____value.setName(value__number____value_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		mAnnotation__value____values.setName(mAnnotation__value____values_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		mAnnotationToTAnnotation__mAnnotation____source
				.setName(mAnnotationToTAnnotation__mAnnotation____source_name_prime);
		mAnnotationToTAnnotation__tAnnotation____target
				.setName(mAnnotationToTAnnotation__tAnnotation____target_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		return new Object[] { ruleresult, number, member, tAnnotationType, mBody, tAnnotable, value, mAnnotation,
				tAnnotation, mAnnotationToTAnnotation, mAccess, mAnnotationType, mBody__mAnnotation____annotations,
				value__member____member, member__value____usages, value__number____value, mAnnotation__mAccess____type,
				mAnnotation__value____values, tAnnotation__tAnnotationType____type,
				tAnnotationType__tAnnotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation, mAnnotationToTAnnotation__mAnnotation____source,
				mAnnotationToTAnnotation__tAnnotation____target, mAnnotationType__mAccess____usagesInTypeAccess,
				mAccess__mAnnotationType____type };
	}

	public static final void pattern_Annotatio_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(Annotatio _this,
			PerformRuleResult ruleresult, EObject number, EObject member, EObject tAnnotationType,
			EObject mAnnotationTypeToTAnnotationType, EObject mBody, EObject tAnnotable, EObject mBodyToTAnnotable,
			EObject value, EObject mAnnotation, EObject tAnnotation, EObject mAnnotationToTAnnotation, EObject mAccess,
			EObject mAnnotationType) {
		_this.registerObjects_BWD(ruleresult, number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
				tAnnotable, mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAnnotationToTAnnotation, mAccess,
				mAnnotationType);

	}

	public static final PerformRuleResult pattern_Annotatio_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotatio_12_1_preparereturnvalue_bindingFB(Annotatio _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_12_1_preparereturnvalue_blackFBB(EClass eClass, Annotatio _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Annotatio_12_1_preparereturnvalue_bindingAndBlackFFB(Annotatio _this) {
		Object[] result_pattern_Annotatio_12_1_preparereturnvalue_binding = pattern_Annotatio_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotatio_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Annotatio_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotatio_12_1_preparereturnvalue_black = pattern_Annotatio_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Annotatio_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Annotatio_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Annotatio";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Annotatio_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotationType");
		EObject _localVariable_1 = match.getObject("tAnnotable");
		EObject _localVariable_2 = match.getObject("tAnnotation");
		EObject tmpTAnnotationType = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		if (tmpTAnnotationType instanceof TAnnotationType) {
			TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tmpTAnnotation instanceof TAnnotation) {
					TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
					return new Object[] { tAnnotationType, tAnnotable, tAnnotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotatio_12_2_corematch_blackBFFBFBFB(
			TAnnotationType tAnnotationType, TAnnotatable tAnnotable, TAnnotation tAnnotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotable.equals(tAnnotationType)) {
			for (TypeToTAbstractType mAnnotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnnotationType, TypeToTAbstractType.class, "target")) {
				Type tmpMAnnotationType = mAnnotationTypeToTAnnotationType.getSource();
				if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
					for (BodyDeclarationToTAnnotatable mBodyToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAnnotable, BodyDeclarationToTAnnotatable.class, "target")) {
						BodyDeclaration mBody = mBodyToTAnnotable.getSource();
						if (mBody != null) {
							if (!mAnnotationType.equals(mBody)) {
								_result.add(new Object[] { tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
										tAnnotable, mBodyToTAnnotable, tAnnotation, mAnnotationType, match });
							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Annotatio_12_3_findcontext_blackFBBBBBBB(
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotable.equals(tAnnotationType)) {
			if (!mAnnotationType.equals(mBody)) {
				if (mAnnotationType.equals(mAnnotationTypeToTAnnotationType.getSource())) {
					if (tAnnotationType.equals(mAnnotationTypeToTAnnotationType.getTarget())) {
						if (mBody.equals(mBodyToTAnnotable.getSource())) {
							if (tAnnotable.equals(mBodyToTAnnotable.getTarget())) {
								if (tAnnotationType.equals(tAnnotation.getType())) {
									if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
										for (BodyDeclaration tmpMember : mAnnotationType.getBodyDeclarations()) {
											if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
												AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
												if (!mBody.equals(member)) {
													String member_name = member.getName();
													if (member_name.equals("id")) {
														_result.add(new Object[] { member, tAnnotationType,
																mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
																mBodyToTAnnotable, tAnnotation, mAnnotationType });
													}

												}
											}
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

	public static final Object[] pattern_Annotatio_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge member__mAnnotationType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__member____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationTypeToTAnnotationType__mAnnotationType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotationTypeToTAnnotationType__tAnnotationType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotable__mBody____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String member__mAnnotationType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mAnnotationType__member____bodyDeclarations_name_prime = "bodyDeclarations";
		String mAnnotationTypeToTAnnotationType__mAnnotationType____source_name_prime = "source";
		String mAnnotationTypeToTAnnotationType__tAnnotationType____target_name_prime = "target";
		String mBodyToTAnnotable__mBody____source_name_prime = "source";
		String mBodyToTAnnotable__tAnnotable____target_name_prime = "target";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		isApplicableMatch.getAllContextElements().add(member);
		isApplicableMatch.getAllContextElements().add(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType);
		isApplicableMatch.getAllContextElements().add(mBody);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationType);
		member__mAnnotationType____abstractTypeDeclaration.setSrc(member);
		member__mAnnotationType____abstractTypeDeclaration.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(member__mAnnotationType____abstractTypeDeclaration);
		mAnnotationType__member____bodyDeclarations.setSrc(mAnnotationType);
		mAnnotationType__member____bodyDeclarations.setTrg(member);
		isApplicableMatch.getAllContextElements().add(mAnnotationType__member____bodyDeclarations);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source.setSrc(mAnnotationTypeToTAnnotationType);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType__mAnnotationType____source);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target.setSrc(mAnnotationTypeToTAnnotationType);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType__tAnnotationType____target);
		mBodyToTAnnotable__mBody____source.setSrc(mBodyToTAnnotable);
		mBodyToTAnnotable__mBody____source.setTrg(mBody);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable__mBody____source);
		mBodyToTAnnotable__tAnnotable____target.setSrc(mBodyToTAnnotable);
		mBodyToTAnnotable__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable__tAnnotable____target);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotationType____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotable__tAnnotation____tAnnotation);
		member__mAnnotationType____abstractTypeDeclaration
				.setName(member__mAnnotationType____abstractTypeDeclaration_name_prime);
		mAnnotationType__member____bodyDeclarations.setName(mAnnotationType__member____bodyDeclarations_name_prime);
		mAnnotationTypeToTAnnotationType__mAnnotationType____source
				.setName(mAnnotationTypeToTAnnotationType__mAnnotationType____source_name_prime);
		mAnnotationTypeToTAnnotationType__tAnnotationType____target
				.setName(mAnnotationTypeToTAnnotationType__tAnnotationType____target_name_prime);
		mBodyToTAnnotable__mBody____source.setName(mBodyToTAnnotable__mBody____source_name_prime);
		mBodyToTAnnotable__tAnnotable____target.setName(mBodyToTAnnotable__tAnnotable____target_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, tAnnotation, mAnnotationType, isApplicableMatch,
				member__mAnnotationType____abstractTypeDeclaration, mAnnotationType__member____bodyDeclarations,
				mAnnotationTypeToTAnnotationType__mAnnotationType____source,
				mAnnotationTypeToTAnnotationType__tAnnotationType____target, mBodyToTAnnotable__mBody____source,
				mBodyToTAnnotable__tAnnotable____target, tAnnotation__tAnnotationType____type,
				tAnnotationType__tAnnotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final Object[] pattern_Annotatio_12_4_solveCSP_bindingFBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, member, tAnnotationType,
				mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, tAnnotation, mAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, member, tAnnotationType,
					mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, tAnnotation,
					mAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType) {
		Object[] result_pattern_Annotatio_12_4_solveCSP_binding = pattern_Annotatio_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, tAnnotation, mAnnotationType);
		if (result_pattern_Annotatio_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_12_4_solveCSP_binding[0];

			Object[] result_pattern_Annotatio_12_4_solveCSP_black = pattern_Annotatio_12_4_solveCSP_blackB(csp);
			if (result_pattern_Annotatio_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, member, tAnnotationType,
						mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, tAnnotation,
						mAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_12_5_checkCSP_expressionFBB(Annotatio _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Annotatio_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Annotatio";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotatio_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotatio_20_1_preparereturnvalue_bindingFB(Annotatio _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_20_1_preparereturnvalue_blackFBBF(EClass __eClass, Annotatio _this) {
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

	public static final Object[] pattern_Annotatio_20_1_preparereturnvalue_bindingAndBlackFFBF(Annotatio _this) {
		Object[] result_pattern_Annotatio_20_1_preparereturnvalue_binding = pattern_Annotatio_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotatio_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Annotatio_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotatio_20_1_preparereturnvalue_black = pattern_Annotatio_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Annotatio_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Annotatio_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Annotatio_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Annotatio_20_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_annotations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMBody = _edge_annotations.getSrc();
		if (tmpMBody instanceof BodyDeclaration) {
			BodyDeclaration mBody = (BodyDeclaration) tmpMBody;
			EObject tmpMAnnotation = _edge_annotations.getTrg();
			if (tmpMAnnotation instanceof Annotation) {
				Annotation mAnnotation = (Annotation) tmpMAnnotation;
				if (mBody.getAnnotations().contains(mAnnotation)) {
					TypeAccess mAccess = mAnnotation.getType();
					if (mAccess != null) {
						Type tmpMAnnotationType = mAccess.getType();
						if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
							if (!mAnnotationType.equals(mBody)) {
								for (AnnotationMemberValuePair value : mAnnotation.getValues()) {
									AnnotationTypeMemberDeclaration member = value.getMember();
									if (member != null) {
										if (!mBody.equals(member)) {
											if (mAnnotationType.equals(member.getAbstractTypeDeclaration())) {
												Expression tmpNumber = value.getValue();
												if (tmpNumber instanceof NumberLiteral) {
													NumberLiteral number = (NumberLiteral) tmpNumber;
													String value_name = value.getName();
													if (value_name.equals("id")) {
														boolean value_proxy = value.isProxy();
														if (Boolean.valueOf(value_proxy).equals(false)) {
															String member_name = member.getName();
															if (member_name.equals("id")) {
																_result.add(new Object[] { number, member, mBody, value,
																		mAnnotation, mAccess, mAnnotationType,
																		_edge_annotations });
															}

														}

													}

												}

											}
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

	public static final Object[] pattern_Annotatio_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Annotatio_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			Annotatio _this, Match match, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			BodyDeclaration mBody, AnnotationMemberValuePair value, Annotation mAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, number, member, mBody, value, mAnnotation, mAccess,
				mAnnotationType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Annotatio_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Annotatio _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Annotatio_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Annotatio_21_1_preparereturnvalue_bindingFB(Annotatio _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_21_1_preparereturnvalue_blackFBBF(EClass __eClass, Annotatio _this) {
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

	public static final Object[] pattern_Annotatio_21_1_preparereturnvalue_bindingAndBlackFFBF(Annotatio _this) {
		Object[] result_pattern_Annotatio_21_1_preparereturnvalue_binding = pattern_Annotatio_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotatio_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Annotatio_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotatio_21_1_preparereturnvalue_black = pattern_Annotatio_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Annotatio_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Annotatio_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Annotatio_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Annotatio_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_type.getSrc();
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			EObject tmpTAnnotationType = _edge_type.getTrg();
			if (tmpTAnnotationType instanceof TAnnotationType) {
				TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
				if (tAnnotationType.equals(tAnnotation.getType())) {
					TAnnotatable tAnnotable = tAnnotation.getTAnnotated();
					if (tAnnotable != null) {
						if (!tAnnotable.equals(tAnnotationType)) {
							_result.add(new Object[] { tAnnotationType, tAnnotable, tAnnotation, _edge_type });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Annotatio_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Annotatio_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Annotatio _this, Match match, TAnnotationType tAnnotationType, TAnnotatable tAnnotable,
			TAnnotation tAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotationType, tAnnotable, tAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Annotatio_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Annotatio _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Annotatio_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Annotatio_24_1_prepare_blackB(Annotatio _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Annotatio_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Annotatio_24_2_matchcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("number");
		EObject _localVariable_1 = sourceMatch.getObject("member");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotationType");
		EObject _localVariable_3 = sourceMatch.getObject("mBody");
		EObject _localVariable_4 = targetMatch.getObject("tAnnotable");
		EObject _localVariable_5 = sourceMatch.getObject("value");
		EObject _localVariable_6 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_7 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_8 = sourceMatch.getObject("mAccess");
		EObject _localVariable_9 = sourceMatch.getObject("mAnnotationType");
		EObject tmpNumber = _localVariable_0;
		EObject tmpMember = _localVariable_1;
		EObject tmpTAnnotationType = _localVariable_2;
		EObject tmpMBody = _localVariable_3;
		EObject tmpTAnnotable = _localVariable_4;
		EObject tmpValue = _localVariable_5;
		EObject tmpMAnnotation = _localVariable_6;
		EObject tmpTAnnotation = _localVariable_7;
		EObject tmpMAccess = _localVariable_8;
		EObject tmpMAnnotationType = _localVariable_9;
		if (tmpNumber instanceof NumberLiteral) {
			NumberLiteral number = (NumberLiteral) tmpNumber;
			if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
				if (tmpTAnnotationType instanceof TAnnotationType) {
					TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
					if (tmpMBody instanceof BodyDeclaration) {
						BodyDeclaration mBody = (BodyDeclaration) tmpMBody;
						if (tmpTAnnotable instanceof TAnnotatable) {
							TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
							if (tmpValue instanceof AnnotationMemberValuePair) {
								AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
								if (tmpMAnnotation instanceof Annotation) {
									Annotation mAnnotation = (Annotation) tmpMAnnotation;
									if (tmpTAnnotation instanceof TAnnotation) {
										TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
										if (tmpMAccess instanceof TypeAccess) {
											TypeAccess mAccess = (TypeAccess) tmpMAccess;
											if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
												AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
												return new Object[] { number, member, tAnnotationType, mBody,
														tAnnotable, value, mAnnotation, tAnnotation, mAccess,
														mAnnotationType, sourceMatch, targetMatch };
											}
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

	public static final Iterable<Object[]> pattern_Annotatio_24_2_matchcontext_blackBBBFBBFBBBBBBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType, BodyDeclaration mBody,
			TAnnotatable tAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (mAnnotationType.equals(member.getAbstractTypeDeclaration())) {
							if (mBody.getAnnotations().contains(mAnnotation)) {
								if (member.equals(value.getMember())) {
									if (number.equals(value.getValue())) {
										if (mAccess.equals(mAnnotation.getType())) {
											if (mAnnotation.getValues().contains(value)) {
												if (tAnnotationType.equals(tAnnotation.getType())) {
													if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
														if (mAnnotationType.getUsagesInTypeAccess().contains(mAccess)) {
															String member_name = member.getName();
															if (member_name.equals("id")) {
																String value_name = value.getName();
																if (value_name.equals("id")) {
																	boolean value_proxy = value.isProxy();
																	if (Boolean.valueOf(value_proxy).equals(false)) {
																		for (TypeToTAbstractType mAnnotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(
																						mAnnotationType,
																						TypeToTAbstractType.class,
																						"source")) {
																			if (tAnnotationType
																					.equals(mAnnotationTypeToTAnnotationType
																							.getTarget())) {
																				for (BodyDeclarationToTAnnotatable mBodyToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								mBody,
																								BodyDeclarationToTAnnotatable.class,
																								"source")) {
																					if (tAnnotable
																							.equals(mBodyToTAnnotable
																									.getTarget())) {
																						_result.add(new Object[] {
																								number, member,
																								tAnnotationType,
																								mAnnotationTypeToTAnnotationType,
																								mBody, tAnnotable,
																								mBodyToTAnnotable,
																								value, mAnnotation,
																								tAnnotation, mAccess,
																								mAnnotationType,
																								sourceMatch,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Annotatio_24_2_matchcontext_greenBBBBBBBBBBBBBFB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType,
			TypeToTAbstractType mAnnotationTypeToTAnnotationType, BodyDeclaration mBody, TAnnotatable tAnnotable,
			BodyDeclarationToTAnnotatable mBodyToTAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation,
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Match sourceMatch,
			Match targetMatch) {
		CCMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String isApplicableMatch_ruleName_prime = "Annotatio";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(number);
		isApplicableMatch.getAllContextElements().add(member);
		isApplicableMatch.getAllContextElements().add(mBody);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationTypeToTAnnotationType);
		isApplicableMatch.getAllContextElements().add(mBodyToTAnnotable);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAccess, mAnnotationType, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_Annotatio_24_3_checkcsp_bindingFBBBBBBBBBBBBBBBB(Annotatio _this,
			CCMatch isApplicableMatch, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, number, member, tAnnotationType,
				mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation, tAnnotation,
				mAccess, mAnnotationType, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, number, member, tAnnotationType,
					mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation,
					tAnnotation, mAccess, mAnnotationType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_24_3_checkcsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_24_3_checkcsp_bindingAndBlackFBBBBBBBBBBBBBBBB(Annotatio _this,
			CCMatch isApplicableMatch, NumberLiteral number, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Annotatio_24_3_checkcsp_binding = pattern_Annotatio_24_3_checkcsp_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, number, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
				tAnnotable, mBodyToTAnnotable, value, mAnnotation, tAnnotation, mAccess, mAnnotationType, sourceMatch,
				targetMatch);
		if (result_pattern_Annotatio_24_3_checkcsp_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_24_3_checkcsp_binding[0];

			Object[] result_pattern_Annotatio_24_3_checkcsp_black = pattern_Annotatio_24_3_checkcsp_blackB(csp);
			if (result_pattern_Annotatio_24_3_checkcsp_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, number, member, tAnnotationType,
						mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, value, mAnnotation,
						tAnnotation, mAccess, mAnnotationType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_24_4_createcorrespondence_blackBBBBBBBBBBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType, BodyDeclaration mBody,
			TAnnotatable tAnnotable, AnnotationMemberValuePair value, Annotation mAnnotation, TAnnotation tAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, CCMatch isApplicableMatch) {
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					return new Object[] { number, member, tAnnotationType, mBody, tAnnotable, value, mAnnotation,
							tAnnotation, mAccess, mAnnotationType, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_24_4_createcorrespondence_greenBBFB(Annotation mAnnotation,
			TAnnotation tAnnotation, CCMatch isApplicableMatch) {
		AnnotationToTAnnotation mAnnotationToTAnnotation = ModiscoFactory.eINSTANCE.createAnnotationToTAnnotation();
		mAnnotationToTAnnotation.setSource(mAnnotation);
		mAnnotationToTAnnotation.setTarget(tAnnotation);
		isApplicableMatch.getCreateCorr().add(mAnnotationToTAnnotation);
		return new Object[] { mAnnotation, tAnnotation, mAnnotationToTAnnotation, isApplicableMatch };
	}

	public static final Object[] pattern_Annotatio_24_5_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Annotatio_24_5_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Annotatio";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotatio_24_6_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Annotatio_27_1_matchtggpattern_blackBBBBBBB(NumberLiteral number,
			AnnotationTypeMemberDeclaration member, BodyDeclaration mBody, AnnotationMemberValuePair value,
			Annotation mAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {
		if (!mBody.equals(member)) {
			if (!mAnnotationType.equals(mBody)) {
				if (mAnnotationType.equals(member.getAbstractTypeDeclaration())) {
					if (mBody.getAnnotations().contains(mAnnotation)) {
						if (member.equals(value.getMember())) {
							if (number.equals(value.getValue())) {
								if (mAccess.equals(mAnnotation.getType())) {
									if (mAnnotation.getValues().contains(value)) {
										if (mAnnotationType.getUsagesInTypeAccess().contains(mAccess)) {
											String member_name = member.getName();
											if (member_name.equals("id")) {
												return new Object[] { number, member, mBody, value, mAnnotation,
														mAccess, mAnnotationType };
											}

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

	public static final Object[] pattern_Annotatio_27_1_matchtggpattern_greenB(AnnotationMemberValuePair value) {
		String value_name_prime = "id";
		boolean value_proxy_prime = false;
		value.setName(value_name_prime);
		value.setProxy(Boolean.valueOf(value_proxy_prime));
		return new Object[] { value };
	}

	public static final boolean pattern_Annotatio_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotatio_27_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Annotatio_28_1_matchtggpattern_blackBBB(TAnnotationType tAnnotationType,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		if (!tAnnotable.equals(tAnnotationType)) {
			if (tAnnotationType.equals(tAnnotation.getType())) {
				if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
					return new Object[] { tAnnotationType, tAnnotable, tAnnotation };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotatio_28_3_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Annotatio_29_1_createresult_blackB(Annotatio _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Annotatio_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeMemberDeclaration member) {
		if (ruleResult.getSourceObjects().contains(member)) {
			return new Object[] { ruleResult, member };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration mAnnotationType) {
		if (ruleResult.getSourceObjects().contains(mAnnotationType)) {
			return new Object[] { ruleResult, mAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mAnnotationTypeToTAnnotationType) {
		if (ruleResult.getCorrObjects().contains(mAnnotationTypeToTAnnotationType)) {
			return new Object[] { ruleResult, mAnnotationTypeToTAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotationType) {
		if (ruleResult.getTargetObjects().contains(tAnnotationType)) {
			return new Object[] { ruleResult, tAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mBody) {
		if (ruleResult.getSourceObjects().contains(mBody)) {
			return new Object[] { ruleResult, mBody };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclarationToTAnnotatable mBodyToTAnnotable) {
		if (ruleResult.getCorrObjects().contains(mBodyToTAnnotable)) {
			return new Object[] { ruleResult, mBodyToTAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TAnnotatable tAnnotable) {
		if (ruleResult.getTargetObjects().contains(tAnnotable)) {
			return new Object[] { ruleResult, tAnnotable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotatio_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mAnnotationTypeToTAnnotationTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mBodyToTAnnotableList : ruleEntryContainer.getRuleEntryList()) {
				if (!mAnnotationTypeToTAnnotationTypeList.equals(mBodyToTAnnotableList)) {
					for (EObject tmpMAnnotationTypeToTAnnotationType : mAnnotationTypeToTAnnotationTypeList
							.getEntryObjects()) {
						if (tmpMAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mAnnotationTypeToTAnnotationType = (TypeToTAbstractType) tmpMAnnotationTypeToTAnnotationType;
							Type tmpMAnnotationType = mAnnotationTypeToTAnnotationType.getSource();
							if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
								TAbstractType tmpTAnnotationType = mAnnotationTypeToTAnnotationType.getTarget();
								if (tmpTAnnotationType instanceof TAnnotationType) {
									TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
									if (pattern_Annotatio_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mAnnotationTypeToTAnnotationType) == null) {
										if (pattern_Annotatio_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mAnnotationType) == null) {
											if (pattern_Annotatio_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													tAnnotationType) == null) {
												for (EObject tmpMBodyToTAnnotable : mBodyToTAnnotableList
														.getEntryObjects()) {
													if (tmpMBodyToTAnnotable instanceof BodyDeclarationToTAnnotatable) {
														BodyDeclarationToTAnnotatable mBodyToTAnnotable = (BodyDeclarationToTAnnotatable) tmpMBodyToTAnnotable;
														BodyDeclaration mBody = mBodyToTAnnotable.getSource();
														if (mBody != null) {
															if (!mAnnotationType.equals(mBody)) {
																TAnnotatable tAnnotable = mBodyToTAnnotable.getTarget();
																if (tAnnotable != null) {
																	if (!tAnnotable.equals(tAnnotationType)) {
																		if (pattern_Annotatio_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult,
																				mBodyToTAnnotable) == null) {
																			if (pattern_Annotatio_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, mBody) == null) {
																				if (pattern_Annotatio_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult,
																						tAnnotable) == null) {
																					for (BodyDeclaration tmpMember : mAnnotationType
																							.getBodyDeclarations()) {
																						if (tmpMember instanceof AnnotationTypeMemberDeclaration) {
																							AnnotationTypeMemberDeclaration member = (AnnotationTypeMemberDeclaration) tmpMember;
																							if (!mBody.equals(member)) {
																								String member_name = member
																										.getName();
																								if (member_name
																										.equals("id")) {
																									if (pattern_Annotatio_29_2_isapplicablecore_black_nac_0BB(
																											ruleResult,
																											member) == null) {
																										_result.add(
																												new Object[] {
																														mAnnotationTypeToTAnnotationTypeList,
																														member,
																														mAnnotationType,
																														mAnnotationTypeToTAnnotationType,
																														tAnnotationType,
																														mBodyToTAnnotableList,
																														mBody,
																														mBodyToTAnnotable,
																														tAnnotable,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Annotatio_29_3_solveCSP_bindingFBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, member, tAnnotationType,
				mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, mAnnotationType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, member, tAnnotationType,
					mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, mAnnotationType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotatio_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(Annotatio _this,
			IsApplicableMatch isApplicableMatch, AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Annotatio_29_3_solveCSP_binding = pattern_Annotatio_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody, tAnnotable,
				mBodyToTAnnotable, mAnnotationType, ruleResult);
		if (result_pattern_Annotatio_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotatio_29_3_solveCSP_binding[0];

			Object[] result_pattern_Annotatio_29_3_solveCSP_black = pattern_Annotatio_29_3_solveCSP_blackB(csp);
			if (result_pattern_Annotatio_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, member, tAnnotationType,
						mAnnotationTypeToTAnnotationType, mBody, tAnnotable, mBodyToTAnnotable, mAnnotationType,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotatio_29_4_checkCSP_expressionFBB(Annotatio _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotatio_29_5_checknacs_blackBBBBBBB(AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType) {
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					String member_name = member.getName();
					if (member_name.equals("id")) {
						return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
								tAnnotable, mBodyToTAnnotable, mAnnotationType };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_6_perform_blackBBBBBBBB(AnnotationTypeMemberDeclaration member,
			TAnnotationType tAnnotationType, TypeToTAbstractType mAnnotationTypeToTAnnotationType,
			BodyDeclaration mBody, TAnnotatable tAnnotable, BodyDeclarationToTAnnotatable mBodyToTAnnotable,
			AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult) {
		if (!mBody.equals(member)) {
			if (!tAnnotable.equals(tAnnotationType)) {
				if (!mAnnotationType.equals(mBody)) {
					String member_name = member.getName();
					if (member_name.equals("id")) {
						return new Object[] { member, tAnnotationType, mAnnotationTypeToTAnnotationType, mBody,
								tAnnotable, mBodyToTAnnotable, mAnnotationType, ruleResult };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotatio_29_6_perform_greenFBBBBFFFFFBBB(
			AnnotationTypeMemberDeclaration member, TAnnotationType tAnnotationType, BodyDeclaration mBody,
			TAnnotatable tAnnotable, AnnotationTypeDeclaration mAnnotationType, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		NumberLiteral number = JavaFactory.eINSTANCE.createNumberLiteral();
		AnnotationMemberValuePair value = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Annotation mAnnotation = JavaFactory.eINSTANCE.createAnnotation();
		TAnnotation tAnnotation = BasicFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation mAnnotationToTAnnotation = ModiscoFactory.eINSTANCE.createAnnotationToTAnnotation();
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("number", "tokenValue");
		String value_name_prime = "id";
		boolean value_proxy_prime = false;
		Object _localVariable_1 = csp.getValue("tAnnotation", "ID");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(number);
		value.setMember(member);
		value.setValue(number);
		ruleResult.getSourceObjects().add(value);
		mBody.getAnnotations().add(mAnnotation);
		mAnnotation.getValues().add(value);
		ruleResult.getSourceObjects().add(mAnnotation);
		tAnnotation.setType(tAnnotationType);
		tAnnotation.setTAnnotated(tAnnotable);
		ruleResult.getTargetObjects().add(tAnnotation);
		mAnnotationToTAnnotation.setSource(mAnnotation);
		mAnnotationToTAnnotation.setTarget(tAnnotation);
		ruleResult.getCorrObjects().add(mAnnotationToTAnnotation);
		mAnnotation.setType(mAccess);
		mAnnotationType.getUsagesInTypeAccess().add(mAccess);
		ruleResult.getSourceObjects().add(mAccess);
		String number_tokenValue_prime = (String) _localVariable_0;
		value.setName(value_name_prime);
		value.setProxy(Boolean.valueOf(value_proxy_prime));
		int tAnnotation_ID_prime = (int) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		number.setTokenValue(number_tokenValue_prime);
		tAnnotation.setID(Integer.valueOf(tAnnotation_ID_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { number, member, tAnnotationType, mBody, tAnnotable, value, mAnnotation, tAnnotation,
				mAnnotationToTAnnotation, mAccess, mAnnotationType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Annotatio_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotatioImpl
