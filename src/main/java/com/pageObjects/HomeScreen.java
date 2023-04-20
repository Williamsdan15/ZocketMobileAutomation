package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.CommonUtility;
import com.utilities.GetterSetter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen extends CommonUtility {

	GetterSetter getset = new GetterSetter();
	static AppiumDriver homeScreenDriver;

	public HomeScreen(AppiumDriver driver) {
		HomeScreen.homeScreenDriver = driver;
		PageFactory.initElements(homeScreenDriver, this);

		this.homeScreenDriver = getset.getDriver();

	}

	@FindBy(id = "com.digital.zocket:id/text_congratulations")
	private WebElement firstReward;
	@FindBy(id = "com.digital.zocket:id/image_back")
	private WebElement rewardImgBackBtn;
	@FindBy(id = "com.digital.zocket:id/text1")
	private WebElement welcomeTxt;
	@FindBy(id = "com.digital.zocket:id/textView15")
	private WebElement hiInfoTxt;
	@FindBy(id = "com.digital.zocket:id/ic_account")
	private WebElement menuBtn;
	@FindBy(id = "com.digital.zocket:id/layout_logout")
	private WebElement logoutBtn;
	@FindBy(id = "android:id/button1")
	private WebElement yesBtn;

	public void verifyFirstReward() {
		addInfo("Information on First Reward screen is: " + firstReward.getText());
		rewardImgBackBtn.click();
		addInfo("User clicked back button at the first reward");

	}

	public void verifyHomeScreen() {
		addInfo("Title of the screen is: " + welcomeTxt.getText());
		addInfo("Information on the screen is: " + hiInfoTxt.getText());
	}

	public void logoutZocketApp() {
		menuBtn.click();
		addInfo("User clicked Menu button on homescreen");
		addInfo("Button to Logout: " + logoutBtn.getText());
		logoutBtn.click();
		try {
			homeScreenDriver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout");
			System.out.println("First Try Block");
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			homeScreenDriver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout/android.widget.TextView");
			System.out.println("Second Try Block");

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			homeScreenDriver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout/android.widget.ImageView");
			System.out.println("Third Try Block");

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		addInfo("Button on the logout pop is: " + yesBtn.getText());
		yesBtn.click();
		addInfo("User clicked Yes button on the logout pop up");

	}

	public void afterScratched() {
	}

}
