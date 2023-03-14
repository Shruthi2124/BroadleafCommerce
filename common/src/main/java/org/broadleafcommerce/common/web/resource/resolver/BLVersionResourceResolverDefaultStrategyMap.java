/*-
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2023 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.common.web.resource.resolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.ContentVersionStrategy;
import org.springframework.web.servlet.resource.VersionStrategy;

import java.util.HashMap;

import jakarta.annotation.PostConstruct;

@Component("blVersionResourceResolverStrategyMap")
public class BLVersionResourceResolverDefaultStrategyMap<T, V> extends HashMap<String, VersionStrategy> {

    private static final long serialVersionUID = -3345223635822341852L;

    @PostConstruct
    public void initIt() throws Exception {
        this.put("/**", (VersionStrategy) new ContentVersionStrategy());
    }

}
