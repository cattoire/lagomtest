
package com.example.rp.test.lagomendpoints.impl;

import play.filters.cors.CORSFilter;
import play.http.DefaultHttpFilters;

import javax.inject.Inject;

// See https://playframework.com/documentation/2.5.x/CorsFilter
public class HelloFilters extends DefaultHttpFilters {
    @Inject
    public HelloFilters(CORSFilter corsFilter) {
        super(corsFilter);
    }
}