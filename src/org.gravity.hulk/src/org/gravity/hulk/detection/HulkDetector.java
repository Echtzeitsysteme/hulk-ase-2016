package org.gravity.hulk.detection;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.Messages;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfGettersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfIncommingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfOutgoingInvocationsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfSettersMetric;
import org.gravity.hulk.detection.metrics.sourcemeter.HSourceMeterMetricTypes;
import org.gravity.hulk.help.HFullyqualifiedName;
import org.gravity.hulk.sourcemeter.MetricCalculator;
import org.gravity.hulk.sourcemeter.SourcemeterActivator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Node;

public class HulkDetector {

	public static boolean detectSelectedAntiPattern(Set<EClass> selection, HAntiPatternDetection hulk,
			Set<HDetector> selected_detectors, Set<HDetector> processed_detectors) {
		Stack<HDetector> worklist = new Stack<>();

		// Fill worklist
		for (HDetector detector : hulk.getDetectors()) {
			if (selection.contains(detector.eClass())) {
				selected_detectors.add(detector);
				worklist.add(detector);
			}
		}

		File program_location = new File(hulk.getProgramlocation());

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " Sourcemeter");
		MetricCalculator metric_calculator = SourcemeterActivator.getInstance().getMetricCalculator();
		switch (metric_calculator.calculateMetrics(program_location, new File(program_location, "hulk"))) {//$NON-NLS-1$ )
		case ERROR:
			return false;
		case NOT_INSTALLED:
			System.err.println(Messages.getString("sourcemeter.not.installed")); //$NON-NLS-1$
			return false;
		case OK:
			break;
		default:
			break;

		}
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + "Sourcemeter - done " + (t1 - t0) + "ms");

		long h0 = System.currentTimeMillis();
		System.out.println(h0 + " Hulk Anti-Pattern Detection");
		while (!worklist.isEmpty()) {
			HDetector detector = worklist.pop();

			initDFS().processNode(detector);

			Comparator<Node> comp = new Comparator<Node>() {

				@Override
				public int compare(Node arg0, Node arg1) {
					return arg0.getPostTraversal() - arg1.getPostTraversal();
				}

			};

			List<HDetector> sorted = new ArrayList<>();
			for (HDetector n : hulk.getDetectors()) {
				if (n.getPreTraversal() > 0) {
					sorted.add(n);
				}
			}
			sorted.sort(comp);

			for (HDetector n : sorted) {
				if (!processed_detectors.contains(n)) {
					if (worklist.contains(n)) {
						worklist.remove(n);
					}
					long t2 = System.currentTimeMillis();
					System.out.println(t2 + " Hulk " + n.getGuiName());
					if (n.detect(hulk.getApg())) {
						n.setPostTraversal(0);
						n.setPreTraversal(0);
						processed_detectors.add(n);
					} else {
						System.err.println(Messages.getString("detector.failed") + n); //$NON-NLS-1$
					}
					long t3 = System.currentTimeMillis();
					System.out.println(t3 + " Hulk " + n.getGuiName() + " - done " + (t3 - t2) + "ms");

				}
			}
		}
		long h1 = System.currentTimeMillis();
		System.out.println(h1 + " Hulk Anti-Pattern Detection - done " + (h1 - h0) + "ms");

		return true;
	}

	private static DepthFirstSearch initDFS() {
		DepthFirstSearch dfs = DfsFactory.eINSTANCE.createDepthFirstSearch();
		DepthFirstSearch delegate = DfsFactory.eINSTANCE.createDepthFirstSearch();
		dfs.setDelegate(delegate);
		delegate.setDelegate(dfs);
		return dfs;
	}

	public static boolean syncSelectedAntiPattern(Set<EClass> selection, HAntiPatternDetection hulk,
			Set<HDetector> selected_detectors, HashSet<HDetector> processed_detectors) {
		
		File program_location = new File(hulk.getProgramlocation());

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " Sourcemeter");
		MetricCalculator metric_calculator = SourcemeterActivator.getInstance().getMetricCalculator();
		switch (metric_calculator.calculateMetrics(program_location, new File(program_location, "hulk"))) {//$NON-NLS-1$ )
		case ERROR:
			return false;
		case NOT_INSTALLED:
			System.err.println(Messages.getString("sourcemeter.not.installed")); //$NON-NLS-1$
			return false;
		case OK:
			break;
		default:
			break;

		}
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + "Sourcemeter - done " + (t1 - t0) + "ms");

		System.out.println(t1+" Start Anti-Pattern Detection");
		System.out.println(t1+" Revoke Annotations");
		Set<HAnnotation> revoke = new HashSet<>();
		for(HAnnotation a : hulk.getApg().getHAnnotations()){
			if(a instanceof HNumberOfMembersMetric){
				if(((HNumberOfMembersMetric) a).getValue() != ((TAbstractType) a.getTAnnotated()).getDefines().size()){
					revoke.add(a);
				}	
			}
			else if(a instanceof HNumberOfChildMetric){
				if(((HNumberOfChildMetric) a).getValue() != ((TClass) a.getTAnnotated()).getChildClasses().size()){
					revoke.add(a);
				}
			}
			else if(a instanceof HDepthOfInheritanceMetric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				if(((HDepthOfInheritanceMetric) a).getValue() != SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.DIT_VALUE)){
							revoke.add(a);
						}
			}
			else if(a instanceof HAverageOverloadingInClassMetric){
				Hashtable<TMethod, Integer> methods = new Hashtable<TMethod, Integer>();
				EList<TSignature> signatures = ((TAbstractType) a.getTAnnotated()).getSignature();
				for (TSignature sig : signatures) {
					if (sig instanceof TMethodSignature) {
						TMethod method = ((TMethodSignature) sig).getMethod();
						if (methods.containsKey(method)) {
								methods.put(method, methods.get(method) + 1);
						} else {
							methods.put(method, 1);
						}
					}
				}
				if (methods.size() == 0) {
					if(((HAverageOverloadingInClassMetric) a).getValue() != 0){
						revoke.add(a);
					}
				}
				else{
					double sum = 0;
					for (double value : methods.values()) {
						sum += value;
					}
					if(((HAverageOverloadingInClassMetric) a).getValue() != sum / methods.size()){
						revoke.add(a);
					}
				}
			}
			else if(a instanceof HAverageParametersMetric){
				double sum = 0;
				int amount = 0;
				for (TSignature sig : ((TAbstractType) a.getTAnnotated()).getSignature()) {
					if (sig instanceof TMethodSignature) {
						TMethodSignature method_sig = (TMethodSignature) sig;
						sum += method_sig.getParamList().getEntries().size();
						amount++;
					}
				}
				if(((HAverageParametersMetric) a).getValue() != sum / amount){
					revoke.add(a);
				}
			}
			else if(a instanceof HLocalFieldAccessesMetric){
				int new_value = 0;
				for (TMember m : ((TAbstractType) a.getTAnnotated()).getDefines()) {
					for (TAccess t : m.getTAccessing()) {
						TMember tTarget = t.getTTarget();
						if (tTarget instanceof TFieldDefinition && tTarget.getDefinedBy().equals(a.getTAnnotated())) {
							new_value++;
						}
					}
				}
				if(((HLocalFieldAccessesMetric) a).getValue() != new_value){
					revoke.add(a);
				}
			}
			else if(a instanceof HLocalMethodAccessesMetric){
				int new_value = 0;
				for (TMember m : ((TAbstractType) a.getTAnnotated()).getDefines()) {
					for (TAccess t : m.getTAccessing()) {
						TMember tTarget = t.getTTarget();
						if (tTarget instanceof TMethodDefinition && tTarget.getDefinedBy().equals(a.getTAnnotated())) {
							new_value++;
						}
					}
				}
				if(((HLocalMethodAccessesMetric) a).getValue()!=new_value){
					revoke.add(a);
				}
			}
			else if(a instanceof HNumberOfIncommingInvocationsMetric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				double new_value = SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.NII_VALUE);
				if(((HNumberOfIncommingInvocationsMetric) a).getValue()!=new_value){
					revoke.add(a);
				}
			}
			else if(a instanceof HNumberOfOutgoingInvocationsMetric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				double new_value = SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.NOI_VALUE);
				if(((HNumberOfOutgoingInvocationsMetric) a).getValue()!=new_value){
					revoke.add(a);
				}
			}
			else if(a instanceof HInvocationRelation){
				HNumberOfOutgoingInvocationsMetric noi = ((HInvocationRelation) a).getHNumberOfOutgoingInvocationsMetric();
				HNumberOfIncommingInvocationsMetric nii = ((HInvocationRelation) a).getHNumberOfIncommingInvocationsMetric();
				if(noi==null || nii==null){
					revoke.add(a);
				}
			}
			else if(a instanceof HLCOM5Metric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				if(((HLCOM5Metric) a).getValue() != SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.LCOM_VALUE)){
					revoke.add(a);
				}
			}
			else if(a instanceof HNumberOfGettersMetric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				if(((HNumberOfGettersMetric) a).getValue() != SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.NG_VALUE)){
					revoke.add(a);
				}
			}
			else if(a instanceof HNumberOfSettersMetric){
				String fullyqualified_name = HFullyqualifiedName.getFullyqualifiedName((TClass) a.getTAnnotated());
				if(((HNumberOfSettersMetric) a).getValue() != SourcemeterActivator.getInstance().getMetricCalculator().getMetric(fullyqualified_name,
						HSourceMeterMetricTypes.NS_VALUE)){
					revoke.add(a);
				}
			}
			else if(a instanceof HNumberOfMethodsMetric){
				int new_value = 0;
				for(TMember m : ((TAbstractType) a.getTAnnotated()).getDefines()){
					if(m instanceof TMethodDefinition){
						new_value++;
					}
				}
				if(new_value != ((HNumberOfMethodsMetric) a).getValue()){
					revoke.add(a);
				}
			}
			else if(a instanceof HLargeClassSmell){
				if(((HLargeClassSmell) a).getHNumberOfMembers()==null){
					revoke.add(a);
				}
			}
			else if(a instanceof HLocalAccessRelationMetric){
				HLocalAccessRelationMetric localAccessRelation = (HLocalAccessRelationMetric) a;
				if(localAccessRelation.getHLocalFieldAccesses()==null || localAccessRelation.getHLocalMethodAccesses()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HIntenseFieldUsageCodeSmell) {
				HIntenseFieldUsageCodeSmell intenseFieldUsage = (HIntenseFieldUsageCodeSmell) a;
				if(intenseFieldUsage.getHLocalAccessRelationMetric()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HSpaghettiCodeAntiPattern) {
				HSpaghettiCodeAntiPattern spaghetti = (HSpaghettiCodeAntiPattern) a;
				if(spaghetti.getHAverageOverloadingInClassMetric()==null || spaghetti.getHAverageParametersMetric()==null || spaghetti.getHDepthOfInheritance()==null || spaghetti.getHIntenseFieldUsageCodeSmell()==null || spaghetti.getHNumberOfChild()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HSwissArmyKnifeAntiPattern) {
				HSwissArmyKnifeAntiPattern sak = (HSwissArmyKnifeAntiPattern) a;
				if(sak.getHLargeClassSmell()==null || sak.getHMuchOverloadingCodeSmell()==null || sak.getHNumberOfIncommingInvocationsMetric()==null){
					revoke.add(a);
				}
			}
			else if(a instanceof HMuchOverloadingCodeSmell){
				if(((HMuchOverloadingCodeSmell) a).getHAverageOverloadingInClassMetric()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HControllerClassSmell) {
				HControllerClassSmell controller = (HControllerClassSmell) a;
				if(controller.getHInvocationRelation()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HLowCohesionSmell) {
				HLowCohesionSmell low = (HLowCohesionSmell) a;
				if(low.getHLCOM5()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HLargeClassLowCohesionSmell) {
				HLargeClassLowCohesionSmell lclc = (HLargeClassLowCohesionSmell) a;
				if(lclc.getHLargeClassSmell()==null && lclc.getHLowCohesionSmell()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HGodClassAntiPattern) {
				HGodClassAntiPattern god = (HGodClassAntiPattern) a;
				if(god.getHControllerClassSmell()==null || god.getHLargeClassLowCohesionSmell()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HNACCMetric) {
				HNACCMetric nacc = (HNACCMetric) a;
				if(nacc.getHNumberOfGettersMetric()==null || nacc.getHNumberOfMethodsMetric()==null || nacc.getHNumberOfSettersMetric()==null){
					revoke.add(a);
				}
				
			}
			else if (a instanceof HDataClassSmell) {
				HDataClassSmell data = (HDataClassSmell) a;
				if(data.getHNACCMetric()==null){
					revoke.add(a);
				}
			}
			else if (a instanceof HDataClassAccessor) {
				HDataClassAccessor dca = (HDataClassAccessor) a;
				if(dca.getHDataClassSmells().size()!=dca.getValue()){
					revoke.add(a);
				}
			}
			else if (a instanceof HBlobAntiPattern) {
				HBlobAntiPattern blob = (HBlobAntiPattern) a;
				if(blob.getHGodClassAntiPattern()==null || blob.getHDataClassSmells().size()==0){
					revoke.add(a);
				}
			}
			else{
					System.out.println("UNHANDLE METRIC: "+a);
			}
		}
		
		while(revoke.size()>0){
			HAnnotation r = revoke.iterator().next();
			TAnnotatable tAnnotated = r.getTAnnotated();
			if(tAnnotated!=null){
				tAnnotated.getTAnnotation().remove(r);
			}
			revoke.addAll(r.getPartOf());
			revoke.remove(r);
			EcoreUtil.delete(r);
		}
	
		Stack<HDetector> worklist = new Stack<>();

		long t2 = System.currentTimeMillis();
		System.out.println(t2+" Revoke Annotations - done "+(t2-t1)+" ms");
		System.out.println(t2+" Detect Anti-Patterns");
		// Fill worklist
		for (HDetector detector : hulk.getDetectors()) {
			if (selection.contains(detector.eClass())) {
				selected_detectors.add(detector);
				worklist.add(detector);
			}
		}

		while (!worklist.isEmpty()) {
			HDetector detector = worklist.pop();

			initDFS().processNode(detector);

			Comparator<Node> comp = new Comparator<Node>() {

				@Override
				public int compare(Node arg0, Node arg1) {
					return arg0.getPostTraversal() - arg1.getPostTraversal();
				}

			};

			List<HDetector> sorted = new ArrayList<>();
			for (HDetector n : hulk.getDetectors()) {
				if (n.getPreTraversal() > 0) {
					sorted.add(n);
				}
			}
			sorted.sort(comp);

			for (HDetector n : sorted) {
				if (!processed_detectors.contains(n)) {
					if (worklist.contains(n)) {
						worklist.remove(n);
					}
					long t2a = System.currentTimeMillis();
					System.out.println(t2a + " Hulk " + n.getGuiName());
					if (n.detect(hulk.getApg())) {
						n.setPostTraversal(0);
						n.setPreTraversal(0);
						processed_detectors.add(n);
					} else {
						System.err.println(Messages.getString("detector.failed") + n); //$NON-NLS-1$
					}
					long t3a = System.currentTimeMillis();
					System.out.println(t3a + " Hulk " + n.getGuiName() + " - done " + (t3a - t2a) + "ms");

				}
			}
		}
		long t3 = System.currentTimeMillis();
		System.out.println(t3+" Detect Anti-Pattern - done "+(t3-t2)+" ms");
		System.out.println(t3+" Entire Anti-Pattern Detection - done "+(t3-t1)+" ms");
		return true;
	}
}
