package com.dems.resource.timeout;

import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.TimeoutHandler;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.http.HttpStatus;

public class DemsTimeoutHandler implements TimeoutHandler {

	public static final int DEFAULT_MAX_TIMEOUT_S = 10;
	
	@Override
	public void handleTimeout(AsyncResponse asyncResponse) {
		asyncResponse.resume(Response.status(HttpStatus.REQUEST_TIMEOUT_408)
						.entity("Operation timed out. Please try again later.")
						.build());
	}

}
