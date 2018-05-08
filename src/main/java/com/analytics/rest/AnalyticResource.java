package com.analytics.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.analytics.core.AnalyticsService;
import com.analytics.dto.AnalyticDTO;

@Path("/analytic")
public class AnalyticResource {

	private AnalyticsService analyticsService;

	@Autowired
	public AnalyticResource(AnalyticsService analyticsService) {
		this.analyticsService = analyticsService;
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addAnalytics(AnalyticDTO analyticRequest) {
		analyticsService.createEvent(analyticRequest);
		return Response.status(Status.OK).entity(analyticRequest).build();
	}

}
