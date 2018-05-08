package com.analytics.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.analytics.core.AnalyticsService;
import com.analytics.dto.StatsResponseDTO;

@Path("/stats")
public class StatsResource {

	private AnalyticsService analyticsService;

	@Autowired
	public StatsResource(AnalyticsService analyticsService) {
		this.analyticsService = analyticsService;
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addAnalytics() {
		StatsResponseDTO stats = analyticsService.getStats();
		return Response.status(Status.OK).entity(stats).build();
	}

}
