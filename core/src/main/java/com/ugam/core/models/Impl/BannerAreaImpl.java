package com.ugam.core.models.Impl;

import com.ugam.core.models.BannerArea;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = BannerArea.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerAreaImpl implements BannerArea{
    @Inject
    String title;

    @Inject
    String desc;

    @Inject
    String heading;

    @Inject
    String buttonTitle;

    @Inject
    String imgPath;

    @Inject
    String path;

    @Override
    public String getBannerAreaTitle() {
        return title;
    }

    @Override
    public String getBannerAreaHeading() {
        return heading;
    }

    @Override
    public String getBannerAreaDescription() {
        return desc;
    }

    @Override
    public String getBannerAreaButtonTitle() {
        return buttonTitle;
    }

    @Override
    public String getImgPath() {
        return imgPath;
    }

    @Override
    public String getPathValue() {
        return path;
    }


}
