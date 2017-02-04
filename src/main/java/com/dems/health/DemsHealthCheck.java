package com.dems.health;

import com.codahale.metrics.health.HealthCheck;

public class DemsHealthCheck extends HealthCheck {

	public static final String NAME = "DEMS Health Check";
	
	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
