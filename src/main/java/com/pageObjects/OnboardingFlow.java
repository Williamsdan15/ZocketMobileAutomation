package com.pageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.UserDataHandler;

import com.utilities.CommonUtility;
import com.utilities.GetterSetter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class OnboardingFlow extends CommonUtility {

	GetterSetter getset = new GetterSetter();
	static AppiumDriver OnboardingFlowDriver;

	public OnboardingFlow(AppiumDriver driver) {

		OnboardingFlow.OnboardingFlowDriver = driver;
		PageFactory.initElements(OnboardingFlowDriver, this);

		this.OnboardingFlowDriver = getset.getDriver();

	}

	@FindBy(id = "com.digital.zocket:id/textView6")
	private WebElement businessCategoryScreenLabel;
	@FindBy(id = "com.digital.zocket:id/edit_search_category")
	private WebElement searchBusinessCategoryInput;
	@FindBy(id = "com.digital.zocket:id/text_category")
	private WebElement selectBusinessCategory;
	@FindBy(id = "com.digital.zocket:id/circular_progress")
	private WebElement rightArrowBtn;
	@FindBy(id = "com.digital.zocket:id/textView6")
	private WebElement customersFromScreenLabel;
	@FindBy(id = "com.digital.zocket:id/edit_location")
	private WebElement selectedAreaInput;
	@FindBy(id = "com.digital.zocket:id/textView6")
	private WebElement tellUsMoreScreenLabel;
	@FindBy(id = "com.digital.zocket:id/edit_business_name")
	private WebElement businessNameInputField;
	@FindBy(id = "com.digital.zocket:id/edit_location")
	private WebElement locationInputField;
	@FindBy(id = "com.digital.zocket:id/places_autocomplete_search_bar")
	private WebElement searchInputField;
	@FindBy(id = "com.digital.zocket:id/places_autocomplete_prediction_primary_text")
	private WebElement selectsLocation;
	@FindBy(id = "com.digital.zocket:id/image_back")
	private WebElement backArrowBtn;
	
	public void verifyBusinessCategoryScreen() {

		addInfo("Title of the screen is: " + businessCategoryScreenLabel.getText());

	}

	public void selectRespectiveBusinessCategory() {
		searchBusinessCategoryInput.click();

		searchBusinessCategoryInput.sendKeys("cafes");
		addInfo("User entered CAFES in Search business input field.");
		OnboardingFlowDriver.hideKeyboard();

		addInfo("Business Category based on the search: " + selectBusinessCategory.getText());

		selectBusinessCategory.click();

		addInfo("User selected business category as : " + searchBusinessCategoryInput.getText());

	}

	public void clickRightArrow() {
		rightArrowBtn.click();
		addInfo("User clicked right arrow.");
	}

	public void verifyCustomersFromScreen() {
		addInfo("Title of the screen is: " + customersFromScreenLabel.getText());

	}

	public void selectsTheArea() {
		addInfo("Area selected by the user is : " + selectedAreaInput.getText());

	}

	public void clicksRightArrowOne() {
		addInfo("User has selected the Area to launch the campaign");
		rightArrowBtn.click();

	}

	public void verifyTellUsMoreScreen() {
		addInfo("Header of the screen: " + tellUsMoreScreenLabel.getText());

//		addInfo("User click Next button to land on : " + selectedArea.getText());

	}

	public void enterBusinessName() {

		businessNameInputField.sendKeys("Will Coffee Cafe");
		addInfo("User has entered business name as : " + businessNameInputField.getText());
		OnboardingFlowDriver.hideKeyboard();
	}

	public void clicksRightArrowTwo() {
		addInfo("User has entered the business name and clicked next button");
		rightArrowBtn.click();

	}

	public void clickLocationInputField() {
		locationInputField.click();
		addInfo("User has clicked location input field in customer from screen");

	}

	public void locationSearchField() {
		searchInputField.sendKeys("Bangalore");
		addInfo("User has searched Bangalore in search location input field");

	}

	public void clicksSelectedLocation() {
		selectsLocation.click();
		addInfo("User has selected Bangalore form the search result");

	}

	public void clicksBackArrowBtn() {
		backArrowBtn.click();
		addInfo("User has clicked Back arrow button");

	}
}
