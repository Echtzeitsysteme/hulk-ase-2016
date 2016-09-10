/**
 */
package org.gravity.eval.ase.deltas.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeParameter;

import org.gravity.eval.ase.deltas.DeleteMethod;
import org.gravity.eval.ase.deltas.DeltasPackage;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeleteMethodImpl extends DeltaImpl implements DeleteMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltasPackage.Literals.DELETE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {// ActivityNode8 story node is empty
		return DeleteMethodImpl.pattern_DeleteMethod_0_2_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void perform(MGravityModel modisco) {
		// ActivityNode1
		Object[] result1_black = DeleteMethodImpl.pattern_DeleteMethod_1_1_ActivityNode1_blackBFFFFF(modisco);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode1] failed." + " Variables: "
					+ "[modisco] = " + modisco + ".");
		}
		// org.eclipse.gmt.modisco.java.Package p_net = (org.eclipse.gmt.modisco.java.Package) result1_black[1];
		// org.eclipse.gmt.modisco.java.Package p_sourceforge = (org.eclipse.gmt.modisco.java.Package) result1_black[2];
		// org.eclipse.gmt.modisco.java.Package p_ganttproject = (org.eclipse.gmt.modisco.java.Package) result1_black[3];
		// ClassDeclaration c_GanttProject = (ClassDeclaration) result1_black[4];
		MMethodDefinition m_main = (MMethodDefinition) result1_black[5];
		// ForEach ActivityNode2
		for (Object[] result2_black : DeleteMethodImpl.pattern_DeleteMethod_1_2_ActivityNode2_blackBF(m_main)) {
			SingleVariableDeclaration parameter = (SingleVariableDeclaration) result2_black[1];
			DeleteMethodImpl.pattern_DeleteMethod_1_2_ActivityNode2_redBB(m_main, parameter);

			EcoreUtil.delete(parameter);
			parameter = null;
			;

		}
		// ForEach ActivityNode3
		for (Object[] result3_black : DeleteMethodImpl.pattern_DeleteMethod_1_3_ActivityNode3_blackBF(m_main)) {
			TypeAccess exceptions = (TypeAccess) result3_black[1];
			DeleteMethodImpl.pattern_DeleteMethod_1_3_ActivityNode3_redBB(m_main, exceptions);

			EcoreUtil.delete(exceptions);
			exceptions = null;
			;

		}
		// ForEach ActivityNode4
		for (Object[] result4_black : DeleteMethodImpl.pattern_DeleteMethod_1_4_ActivityNode4_blackBF(m_main)) {
			TypeParameter typeparam = (TypeParameter) result4_black[1];
			DeleteMethodImpl.pattern_DeleteMethod_1_4_ActivityNode4_redBB(m_main, typeparam);

			EcoreUtil.delete(typeparam);
			typeparam = null;
			;

		}

		// ActivityNode5
		Object[] result5_black = DeleteMethodImpl.pattern_DeleteMethod_1_5_ActivityNode5_blackBF(m_main);
		if (result5_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode5] failed." + " Variables: " + "[m_main] = " + m_main + ".");
		}
		TypeAccess returntype = (TypeAccess) result5_black[1];
		DeleteMethodImpl.pattern_DeleteMethod_1_5_ActivityNode5_redBB(m_main, returntype);

		EcoreUtil.delete(returntype);
		returntype = null;
		;

		// ActivityNode6
		Object[] result6_black = DeleteMethodImpl.pattern_DeleteMethod_1_6_ActivityNode6_blackBF(m_main);
		if (result6_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode6] failed." + " Variables: " + "[m_main] = " + m_main + ".");
		}
		Block block = (Block) result6_black[1];
		DeleteMethodImpl.pattern_DeleteMethod_1_6_ActivityNode6_redBB(m_main, block);

		EcoreUtil.delete(block);
		block = null;
		;

		// ForEach ActivityNode7
		for (Object[] result7_black : DeleteMethodImpl.pattern_DeleteMethod_1_7_ActivityNode7_blackBF(m_main)) {
			AbstractMethodInvocation invoc = (AbstractMethodInvocation) result7_black[1];
			DeleteMethodImpl.pattern_DeleteMethod_1_7_ActivityNode7_redBB(m_main, invoc);

			EcoreUtil.delete(invoc);
			invoc = null;
			;

		}

		// ActivityNode18
		Object[] result8_black = DeleteMethodImpl.pattern_DeleteMethod_1_8_ActivityNode18_blackB(m_main);
		if (result8_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode18] failed." + " Variables: "
					+ "[m_main] = " + m_main + ".");
		}
		DeleteMethodImpl.pattern_DeleteMethod_1_8_ActivityNode18_redB(m_main);

		EcoreUtil.delete(m_main);
		m_main = null;
		;

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
		case DeltasPackage.DELETE_METHOD___GET_PROJECT_NAME:
			return getProjectName();
		case DeltasPackage.DELETE_METHOD___PERFORM__MGRAVITYMODEL:
			perform((MGravityModel) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final String pattern_DeleteMethod_0_2_expressionF() {
		String _result = "04_Gantt1.10.2";
		return _result;
	}

	public static final Object[] pattern_DeleteMethod_1_1_ActivityNode1_blackBFFFFF(Model modisco) {
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
											for (AbstractTypeDeclaration tmpC_GanttProject : p_ganttproject
													.getOwnedElements()) {
												if (tmpC_GanttProject instanceof ClassDeclaration) {
													ClassDeclaration c_GanttProject = (ClassDeclaration) tmpC_GanttProject;
													String c_GanttProject_name = c_GanttProject.getName();
													if (c_GanttProject_name.equals("GanttProject")) {
														for (BodyDeclaration tmpM_main : c_GanttProject
																.getBodyDeclarations()) {
															if (tmpM_main instanceof MMethodDefinition) {
																MMethodDefinition m_main = (MMethodDefinition) tmpM_main;
																String m_main_name = m_main.getName();
																if (m_main_name.equals("main")) {
																	return new Object[] { modisco, p_net, p_sourceforge,
																			p_ganttproject, c_GanttProject, m_main };
																}

															}
														}
													}

												}
											}
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

	public static final Iterable<Object[]> pattern_DeleteMethod_1_2_ActivityNode2_blackBF(MMethodDefinition m_main) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SingleVariableDeclaration parameter : m_main.getParameters()) {
			_result.add(new Object[] { m_main, parameter });
		}
		return _result;
	}

	public static final Object[] pattern_DeleteMethod_1_2_ActivityNode2_redBB(MMethodDefinition m_main,
			SingleVariableDeclaration parameter) {
		parameter.setMethodDeclaration(null);
		return new Object[] { m_main, parameter };
	}

	public static final Iterable<Object[]> pattern_DeleteMethod_1_3_ActivityNode3_blackBF(MMethodDefinition m_main) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeAccess exceptions : m_main.getThrownExceptions()) {
			_result.add(new Object[] { m_main, exceptions });
		}
		return _result;
	}

	public static final Object[] pattern_DeleteMethod_1_3_ActivityNode3_redBB(MMethodDefinition m_main,
			TypeAccess exceptions) {
		m_main.getThrownExceptions().remove(exceptions);
		return new Object[] { m_main, exceptions };
	}

	public static final Iterable<Object[]> pattern_DeleteMethod_1_4_ActivityNode4_blackBF(MethodDeclaration m_main) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeParameter typeparam : m_main.getTypeParameters()) {
			_result.add(new Object[] { m_main, typeparam });
		}
		return _result;
	}

	public static final Object[] pattern_DeleteMethod_1_4_ActivityNode4_redBB(MethodDeclaration m_main,
			TypeParameter typeparam) {
		m_main.getTypeParameters().remove(typeparam);
		return new Object[] { m_main, typeparam };
	}

	public static final Object[] pattern_DeleteMethod_1_5_ActivityNode5_blackBF(MethodDeclaration m_main) {
		TypeAccess returntype = m_main.getReturnType();
		if (returntype != null) {
			return new Object[] { m_main, returntype };
		}

		return null;
	}

	public static final Object[] pattern_DeleteMethod_1_5_ActivityNode5_redBB(MethodDeclaration m_main,
			TypeAccess returntype) {
		m_main.setReturnType(null);
		return new Object[] { m_main, returntype };
	}

	public static final Object[] pattern_DeleteMethod_1_6_ActivityNode6_blackBF(MethodDeclaration m_main) {
		Block block = m_main.getBody();
		if (block != null) {
			return new Object[] { m_main, block };
		}

		return null;
	}

	public static final Object[] pattern_DeleteMethod_1_6_ActivityNode6_redBB(MethodDeclaration m_main, Block block) {
		m_main.setBody(null);
		return new Object[] { m_main, block };
	}

	public static final Iterable<Object[]> pattern_DeleteMethod_1_7_ActivityNode7_blackBF(MMethodDefinition m_main) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AbstractMethodInvocation invoc : m_main.getAbstractMethodInvocations()) {
			_result.add(new Object[] { m_main, invoc });
		}
		return _result;
	}

	public static final Object[] pattern_DeleteMethod_1_7_ActivityNode7_redBB(MMethodDefinition m_main,
			AbstractMethodInvocation invoc) {
		m_main.getAbstractMethodInvocations().remove(invoc);
		return new Object[] { m_main, invoc };
	}

	public static final Object[] pattern_DeleteMethod_1_8_ActivityNode18_blackB(MethodDeclaration m_main) {
		return new Object[] { m_main };
	}

	public static final Object[] pattern_DeleteMethod_1_8_ActivityNode18_redB(MethodDeclaration m_main) {
		return new Object[] { m_main };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DeleteMethodImpl
