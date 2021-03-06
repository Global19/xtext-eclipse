/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.codetemplates.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.codetemplates.ui.internal.CodetemplatesActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SingleCodetemplateExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CodetemplatesActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CodetemplatesActivator activator = CodetemplatesActivator.getInstance();
		return activator != null ? activator.getInjector(CodetemplatesActivator.ORG_ECLIPSE_XTEXT_UI_CODETEMPLATES_SINGLECODETEMPLATE) : null;
	}

}
