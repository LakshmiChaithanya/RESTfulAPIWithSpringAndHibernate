package com.analytics.rest;

import org.glassfish.jersey.message.filtering.SecurityEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class APIApplicationResourceConfig extends ResourceConfig {

	public APIApplicationResourceConfig() {
		packages("com.analytics.rest");
		register(SecurityEntityFilteringFeature.class);
	}
}
