package com.ugam.core.models.Impl;

import com.ugam.core.models.Testimonial;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestimonialImpl implements Testimonial {

    @Inject
    String title;

    @Inject
    String text;

    @Inject
    String designation;

    @Override
    public String getTestimonialName() {
        return title;
    }

    @Override
    public String getTestimonialDescription() {
        return text;
    }

    @Override
    public String getTestimonialDesignation() {
        return designation;
    }
}
