package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import com.utilities.CommonUtility;
import com.utilities.GetterSetter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginScreen extends CommonUtility {

	GetterSetter getset = new GetterSetter();

	static AppiumDriver loginScreenDriver;
	static AndroidDriver xDriver;

//	public LoginScreen(AppiumDriver<AndroidElement> driver) {
	public LoginScreen(AppiumDriver driver) {

		LoginScreen.loginScreenDriver = driver;
		LoginScreen.xDriver = (AndroidDriver) driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

//	By continueDiffNum = By.id("com.truecaller:id/continueWithDifferentNumber");

	@FindBy(id = "com.truecaller:id/continueWithDifferentNumber")
	private WebElement anotherMobNumBtn;
	@FindBy(id = "com.digital.zocket:id/edit_number")
	private AndroidElement enterNumInput;
	@FindBy(id = "com.digital.zocket:id/button_get_started")
	private AndroidElement getStartedBtn;
	@FindBy(className = "android.widget.TextView")
	private AndroidElement otpScreenLabel;
	@FindBy(className = "android.widget.EditText")
	private AndroidElement otpInputField;
	@FindBy(id = "com.truecaller:id/confirm")
	private AndroidElement useTruecallerBtn;
	@FindBy(id = "com.digital.zocket:id/change_number")
	private AndroidElement changeMobNum;

	public void chooseAnotherMobileNum() {
		addInfo("Button to choose another mobile number is: " + anotherMobNumBtn.getText());
		anotherMobNumBtn.click();
		addInfo("User clicked Use another Mobile number button.");

	}

	public void enterMobileNum(String mobileNumber) {
		enterNumInput.clear();
		enterNumInput.sendKeys(mobileNumber);
		addInfo("User entered "+ mobileNumber+" Mobile Number through use another mobile number option");

	}

	public void clickGetStartedBtn() {
		addInfo("Button to get started is: " + getStartedBtn.getText());
		getStartedBtn.click();
		addInfo("User clicked Get Started button.");
	}

	public void verifyOTPScreen() {
		addInfo("User entered mobile number is verified and moved to text screen : " + otpScreenLabel.getText());
		addInfo("OTP is fetched automatically and verified");
	}

	public void enterOTP() {

		otpInputField.sendKeys("000000");

		addInfo("User entered OTP successfully");

	}

	public void truecallerOption() {
		addInfo("TruCaller Mobile number as per the button: " + useTruecallerBtn.getText());
		useTruecallerBtn.click();
		addInfo("User selected truecaller option");
	}

	public void invalidMobileNumber() {
		enterNumInput.sendKeys("123456789");
		addInfo("User entered 123456789 Mobile Number through use another mobile number option");
	}

	public void clearsMobileNumber() {
		enterNumInput.clear();
		addInfo("User cleared Mobile Number input field");
	}

	public void incorrectMobileNumber() {
		enterNumInput.sendKeys("9856817856");
		addInfo("User entered 9856817856 mobile number");
	}

	public void clickChangeOtpOptions() {
		changeMobNum.click();
		addInfo("User wants to change Mobile Number");

	}
}
