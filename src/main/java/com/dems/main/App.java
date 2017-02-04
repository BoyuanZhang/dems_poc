package com.dems.main;

import com.dems.configuration.DemsConfig;
import com.dems.health.DemsHealthCheck;
import com.dems.resources.SensorResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<DemsConfig> {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		new App().run(args);
	}

	@Override
	public void run(DemsConfig configuration, Environment environment) throws Exception {
		environment.healthChecks().register(DemsHealthCheck.NAME, new DemsHealthCheck());
		environment.jersey().register(new SensorResource());
	}
	
	@Override public String getName() {
		return "DEMS POC";
	}
}
