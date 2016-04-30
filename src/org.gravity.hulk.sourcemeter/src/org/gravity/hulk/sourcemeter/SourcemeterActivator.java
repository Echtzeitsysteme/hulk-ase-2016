package org.gravity.hulk.sourcemeter;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class SourcemeterActivator extends Plugin {

	public final static String ID = "org.gravity.hulk.sourcemeter"; //$NON-NLS-1$

	private MetricCalculator metric_calculator;

	private static SourcemeterActivator INSTANCE;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		this.metric_calculator = new MetricCalculator();
	}

	public MetricCalculator getMetricCalculator() {
		return this.metric_calculator;
	}

	public static SourcemeterActivator getInstance() {
		return INSTANCE;
	}

}
