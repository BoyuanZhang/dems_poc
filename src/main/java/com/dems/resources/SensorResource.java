package com.dems.resources;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.dems.resource.timeout.DemsTimeoutHandler;

@Path("/v1/sensor")
public class SensorResource {
	
	@GET
	@Path("/ping")
	public void ping(@Suspended final AsyncResponse response) throws InterruptedException {
		response.setTimeoutHandler(new DemsTimeoutHandler());
		
		response.setTimeout(DemsTimeoutHandler.DEFAULT_MAX_TIMEOUT_S, TimeUnit.SECONDS);
		response.resume("pong");
	}
}
