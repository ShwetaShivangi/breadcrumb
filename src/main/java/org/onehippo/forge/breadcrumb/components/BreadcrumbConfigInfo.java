package org.onehippo.forge.breadcrumb.components;

import org.hippoecm.hst.core.parameters.Parameter;

public interface BreadcrumbConfigInfo {
	
	@Parameter(name = "separator",
            defaultValue = "»",
            displayName = "Separator")
	String getSeparator();

}
