package com.ugam.core.models.Impl;

import com.ugam.core.models.BannerNavigation;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = BannerNavigation.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerNavigationImpl implements BannerNavigation{
    @Inject
    String title;

    @Inject
    String nav1;

    @Inject
    String nav2;

    @Inject
    String nav1Path;

    @Inject
    String nav2Path;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getNav1() {
        return nav1;
    }

    @Override
    public String getNav2() {
        return nav2;
    }

    @Override
    public String getNav1Path() {
        return nav1Path;
    }

    @Override
    public String getNav2Path() {
        return nav2Path;
    }
}
