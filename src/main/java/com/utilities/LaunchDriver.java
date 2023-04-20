package com.utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchDriver {

	static AppiumDriver driver;
	static URL url;
	static GetterSetter obj1 = new GetterSetter();
	static ReadPropFile rpFile = new ReadPropFile();

	public static void launchMobileApp() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "a399d884");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, rpFile.getDeviceName());

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.VERSION, rpFile.getOSVersion());
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		// Zocket app
		capabilities.setCapability("appPackage", rpFile.getAppPackage());
		capabilities.setCapability("appActivity", rpFile.getAppActivity());

		capabilities.setCapability("automationName", "UiAutomator1");

		try {
//			url = new URL("http://127.0.0.1:4723/wd/hub");
			System.out.println();
//			url = new URL("http://" + rpFile.getIpAddress() + ":" + rpFile.getPortNum() + "/wd/hub");
			url = new URL(rpFile.getServerUrl());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver(url, capabilities);
		obj1.setDriver(driver);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
