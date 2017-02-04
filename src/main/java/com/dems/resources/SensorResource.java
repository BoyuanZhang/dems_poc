package com.dems.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/v1/sensor")
public class SensorResource {
	
	@GET
	@Path("/ping")
	public String ping() {
		return "pong";
	}
}
