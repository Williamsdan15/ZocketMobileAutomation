package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;

public class CommonUtility extends LaunchDriver {
	static GetterSetter getset = new GetterSetter();
//	TO create HTML file 
	static ExtentHtmlReporter htmlReporter;
//	To build your report
	static ExtentReports reports = null;
//	To add your information into report
	static ExtentTest logger = null;

	public static void closeMobileApp() {
//		driver.closeApp();
		getset.getDriver().closeApp();

	}

	public static void generateExtentReports(String scenarioName) {
		htmlReporter = new ExtentHtmlReporter("./Reports/ZocketReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		logger = reports.createTest(scenarioName);
	}

	public static void flushReport() {
		reports.flush();
	}

	public static void addInfo(String message) {
//below line is for extent report
		logger.info(message);
//		below line is to print in eclipse console
		System.out.println(message);
//		below line is for cucumber report
		Reporter.addStepLog(message);

	}

	public static void reportPass(String message) {
		logger.log(Status.PASS, message);

	}

	public static void reportFail(String message) {
		logger.log(Status.FAIL, message);
	}

	public static void getScreenShot(String arg) {
		addInfo("Toast message to be verified is: " + arg);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(System.getProperty("user.dir") + File.separator
					+ "\\target\\cucumber-reports\\screenshots\\" + arg + ".png"));
			String fileToBeAdded = System.getProperty("user.dir") + File.separator
					+ "\\target\\cucumber-reports\\screenshots\\" + arg + ".png";
			System.out.println("Path of the screenshot it: " + fileToBeAdded);
			String addScreenshot = "./screenshots/" + arg + ".png";
			Reporter.addScreenCaptureFromPath(addScreenshot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
