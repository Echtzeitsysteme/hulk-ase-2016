/**
 */
package org.gravity.eval.ase.deltas.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;

import org.gravity.eval.ase.deltas.CreateMethod;
import org.gravity.eval.ase.deltas.DeltasPackage;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.ModiscoFactory;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CreateMethodImpl extends DeltaImpl implements CreateMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltasPackage.Literals.CREATE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {// ActivityNode12 story node is empty
		return CreateMethodImpl.pattern_CreateMethod_0_2_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void perform(MGravityModel modisco) {
		// ActivityNode13
		Object[] result1_black = CreateMethodImpl.pattern_CreateMethod_1_1_ActivityNode13_blackBFFFFFF(modisco);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode13] failed." + " Variables: "
					+ "[modisco] = " + modisco + ".");
		}
		// org.eclipse.gmt.modisco.java.Package p_net = (org.eclipse.gmt.modisco.java.Package) result1_black[1];
		// org.eclipse.gmt.modisco.java.Package p_sourceforge = (org.eclipse.gmt.modisco.java.Package) result1_black[2];
		// org.eclipse.gmt.modisco.java.Package p_ganttproject = (org.eclipse.gmt.modisco.java.Package) result1_black[3];
		// org.eclipse.gmt.modisco.java.Package p_gui = (org.eclipse.gmt.modisco.java.Package) result1_black[4];
		// org.eclipse.gmt.modisco.java.Package p_taskproperties = (org.eclipse.gmt.modisco.java.Package) result1_black[5];
		ClassDeclaration c_commponpanel = (ClassDeclaration) result1_black[6];

		// ActivityNode14
		Object[] result2_black = CreateMethodImpl.pattern_CreateMethod_1_2_ActivityNode14_blackBFFBFF(c_commponpanel,
				modisco);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode14] failed." + " Variables: "
					+ "[c_commponpanel] = " + c_commponpanel + ", " + "[modisco] = " + modisco + ".");
		}
		// MethodDeclaration m_setupCommonFields = (MethodDeclaration) result2_black[1];
		CompilationUnit cu = (CompilationUnit) result2_black[2];
		// TypeAccess t_1 = (TypeAccess) result2_black[4];
		ClassDeclaration c_jpanel = (ClassDeclaration) result2_black[5];
		CreateMethodImpl.pattern_CreateMethod_1_2_ActivityNode14_greenBFFBFFBBFFF(c_commponpanel, cu, modisco,
				c_jpanel);
		// MMethodDefinition m_setupCommonFields_new = (MMethodDefinition) result2_green[1];
		// TypeAccess t_1_new = (TypeAccess) result2_green[2];
		// ReturnStatement ret = (ReturnStatement) result2_green[4];
		// SingleVariableAccess ac = (SingleVariableAccess) result2_green[5];
		// SingleVariableDeclaration s_param = (SingleVariableDeclaration) result2_green[8];
		// TypeAccess t_2_new = (TypeAccess) result2_green[9];
		// Block b = (Block) result2_green[10];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DeltasPackage.CREATE_METHOD___GET_PROJECT_NAME:
			return getProjectName();
		case DeltasPackage.CREATE_METHOD___PERFORM__MGRAVITYMODEL:
			perform((MGravityModel) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final String pattern_CreateMethod_0_2_expressionF() {
		String _result = "04_Gantt1.10.2";
		return _result;
	}

	public static final Object[] pattern_CreateMethod_1_1_ActivityNode13_blackBFFFFFF(MGravityModel modisco) {
		for (org.eclipse.gmt.modisco.java.Package p_net : modisco.getOwnedElements()) {
			String p_net_name = p_net.getName();
			if (p_net_name.equals("net")) {
				for (org.eclipse.gmt.modisco.java.Package p_sourceforge : p_net.getOwnedPackages()) {
					if (!p_net.equals(p_sourceforge)) {
						String p_sourceforge_name = p_sourceforge.getName();
						if (p_sourceforge_name.equals("sourceforge")) {
							for (org.eclipse.gmt.modisco.java.Package p_ganttproject : p_sourceforge
									.getOwnedPackages()) {
								if (!p_ganttproject.equals(p_net)) {
									if (!p_ganttproject.equals(p_sourceforge)) {
										String p_ganttproject_name = p_ganttproject.getName();
										if (p_ganttproject_name.equals("ganttproject")) {
											for (org.eclipse.gmt.modisco.java.Package p_gui : p_ganttproject
													.getOwnedPackages()) {
												if (!p_ganttproject.equals(p_gui)) {
													if (!p_gui.equals(p_net)) {
														if (!p_gui.equals(p_sourceforge)) {
															String p_gui_name = p_gui.getName();
															if (p_gui_name.equals("gui")) {
																for (org.eclipse.gmt.modisco.java.Package p_taskproperties : p_gui
																		.getOwnedPackages()) {
																	if (!p_net.equals(p_taskproperties)) {
																		if (!p_sourceforge.equals(p_taskproperties)) {
																			if (!p_ganttproject
																					.equals(p_taskproperties)) {
																				if (!p_gui.equals(p_taskproperties)) {
																					String p_taskproperties_name = p_taskproperties
																							.getName();
																					if (p_taskproperties_name
																							.equals("taskproperties")) {
																						for (AbstractTypeDeclaration tmpC_commponpanel : p_taskproperties
																								.getOwnedElements()) {
																							if (tmpC_commponpanel instanceof ClassDeclaration) {
																								ClassDeclaration c_commponpanel = (ClassDeclaration) tmpC_commponpanel;
																								String c_commponpanel_name = c_commponpanel
																										.getName();
																								if (c_commponpanel_name
																										.equals("CommonPanel")) {
																									return new Object[] {
																											modisco,
																											p_net,
																											p_sourceforge,
																											p_ganttproject,
																											p_gui,
																											p_taskproperties,
																											c_commponpanel };
																								}

																							}
																						}
																					}

																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
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

	public static final Object[] pattern_CreateMethod_1_2_ActivityNode14_blackBFFBFF(ClassDeclaration c_commponpanel,
			MGravityModel modisco) {
		CompilationUnit cu = c_commponpanel.getOriginalCompilationUnit();
		if (cu != null) {
			for (BodyDeclaration tmpM_setupCommonFields : c_commponpanel.getBodyDeclarations()) {
				if (tmpM_setupCommonFields instanceof MethodDeclaration) {
					MethodDeclaration m_setupCommonFields = (MethodDeclaration) tmpM_setupCommonFields;
					TypeAccess t_1 = m_setupCommonFields.getReturnType();
					if (t_1 != null) {
						String m_setupCommonFields_name = m_setupCommonFields.getName();
						if (m_setupCommonFields_name.equals("setupCommonFields")) {
							Type tmpC_jpanel = t_1.getType();
							if (tmpC_jpanel instanceof ClassDeclaration) {
								ClassDeclaration c_jpanel = (ClassDeclaration) tmpC_jpanel;
								if (!c_commponpanel.equals(c_jpanel)) {
									return new Object[] { c_commponpanel, m_setupCommonFields, cu, modisco, t_1,
											c_jpanel };
								}
							}

						}

					}

				}
			}
		}

		return null;
	}

	public static final Object[] pattern_CreateMethod_1_2_ActivityNode14_greenBFFBFFBBFFF(
			ClassDeclaration c_commponpanel, CompilationUnit cu, MGravityModel modisco, ClassDeclaration c_jpanel) {
		MMethodDefinition m_setupCommonFields_new = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		TypeAccess t_1_new = JavaFactory.eINSTANCE.createTypeAccess();
		ReturnStatement ret = JavaFactory.eINSTANCE.createReturnStatement();
		SingleVariableAccess ac = JavaFactory.eINSTANCE.createSingleVariableAccess();
		SingleVariableDeclaration s_param = JavaFactory.eINSTANCE.createSingleVariableDeclaration();
		TypeAccess t_2_new = JavaFactory.eINSTANCE.createTypeAccess();
		Block b = JavaFactory.eINSTANCE.createBlock();
		String m_setupCommonFields_new_name_prime = "setupCommonFields";
		String s_param_name_prime = "s";
		m_setupCommonFields_new.setAbstractTypeDeclaration(c_commponpanel);
		m_setupCommonFields_new.setOriginalCompilationUnit(cu);
		m_setupCommonFields_new.setModel(modisco);
		m_setupCommonFields_new.setReturnType(t_1_new);
		t_1_new.setType(c_jpanel);
		ret.setOriginalCompilationUnit(cu);
		ret.setExpression(ac);
		s_param.setMethodDeclaration(m_setupCommonFields_new);
		s_param.getUsageInVariableAccess().add(ac);
		s_param.setOriginalCompilationUnit(cu);
		s_param.setType(t_2_new);
		t_2_new.setType(c_jpanel);
		m_setupCommonFields_new.setBody(b);
		b.setOriginalCompilationUnit(cu);
		b.getStatements().add(ret);
		m_setupCommonFields_new.setName(m_setupCommonFields_new_name_prime);
		s_param.setName(s_param_name_prime);
		return new Object[] { c_commponpanel, m_setupCommonFields_new, t_1_new, cu, ret, ac, modisco, c_jpanel, s_param,
				t_2_new, b };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CreateMethodImpl
