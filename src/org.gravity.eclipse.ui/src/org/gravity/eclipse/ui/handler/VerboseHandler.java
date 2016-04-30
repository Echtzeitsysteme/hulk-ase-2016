package org.gravity.eclipse.ui.handler;

import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;
import org.gravity.eclipse.GravityActivator;

public class VerboseHandler implements IHandler, IElementUpdater {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GravityActivator gravity_activator = GravityActivator.getDefault();
		boolean verbose = gravity_activator.isVerbose();
		gravity_activator.setVerbose(!verbose);

		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateElement(UIElement element, Map parameters) {
		if (GravityActivator.getDefault().isVerbose()) {
			element.setText("Disable verbose");
		} else {
			element.setText("Enable verbose");
		}
	}
}
