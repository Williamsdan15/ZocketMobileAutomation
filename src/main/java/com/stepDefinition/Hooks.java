package com.stepDefinition;

import com.utilities.CommonUtility;
import com.utilities.LaunchDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static Scenario scenario;

	@Before
	public void beforeScenario(Scenario sc) {
		Hooks.scenario = sc;
		CommonUtility.generateExtentReports(sc.getName());

		LaunchDriver.launchMobileApp();

	}

	@After
	public void afterScenario() {
		CommonUtility.closeMobileApp();
		CommonUtility.flushReport();
	}

}
