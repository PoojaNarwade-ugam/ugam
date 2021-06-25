package com.ugam.core.models.Impl;

import com.ugam.core.models.PortfolioTeaser;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = PortfolioTeaser.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PortfolioTeaserImpl implements PortfolioTeaser {
    @Inject
    String portfolioText;

    @Inject
    String portfolioTitle;

    @Inject
    String imgPath;

    @Inject
    String preimgPath;

    @Override
    public String getPortfolioTitle() {
        return portfolioText;
    }

    @Override
    public String getPortfolioText() {
        return portfolioTitle;
    }

    @Override
    public String getImgPath() {
        return imgPath;
    }

    @Override
    public String getPreimgPath() {
        return preimgPath;
    }
}
