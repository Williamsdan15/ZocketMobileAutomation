package com.utilities;

import java.io.BufferedReader;

import java.io.FileReader;

import java.util.Properties;

public class ReadPropFile {

	Properties prop;
	String propFilePath = "Configs/Configuration.properties";
	BufferedReader buffReader;

	public ReadPropFile() {
		try {
			buffReader = new BufferedReader(new FileReader(propFilePath));
			prop = new Properties();
			prop.load(buffReader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getDeviceName() {

		String deviceName = prop.getProperty("deviceName");
		System.out.println("Device Name from property File is :" + deviceName);
		return deviceName;
	}

	public String getOSVersion() {

		String osVersion = prop.getProperty("osVersion");

		System.out.println("OS version from property File is : " + osVersion);

		return osVersion;
	}

	public String getAppPackage() {

		String appPackage = prop.getProperty("appPackage");
		System.out.println("App Package from property File is : " + appPackage);

		return appPackage;

	}

	public String getAppActivity() {

		String appActivity = prop.getProperty("appActivity");
		System.out.println("App Activity from property File is : " + appActivity);

		return appActivity;

	}

	public String getIpAddress() {

		String ipAddress = prop.getProperty("ipAddress");

		System.out.println("Get IP Address from property File is :" + ipAddress);

		return ipAddress;

	}

	public String getPortNum() {
		String portNum = prop.getProperty("portNum");
		System.out.println("Get Port Num from property File is : " + portNum);
		return portNum;
	}

	public String getServerUrl() {

		String serverURL = prop.getProperty("serverURL");
		System.out.println("Get server URL from property file is : " + serverURL);

		return serverURL;
	}
}
