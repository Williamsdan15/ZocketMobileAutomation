package com.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class GetterSetter {
	static AppiumDriver driver;

	public void setDriver(AppiumDriver driver2) {

		GetterSetter.driver = driver2;

	}

	public AppiumDriver getDriver() {
		return driver;
	}

}
