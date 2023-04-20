package com.stepDefinition;

import com.pageObjects.HomeScreen;
import com.pageObjects.LoginScreen;
import com.pageObjects.OnboardingFlow;
import com.utilities.CommonUtility;
import com.utilities.GetterSetter;
import com.utilities.LaunchDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepDefinitions {
	GetterSetter getset = new GetterSetter();

	LoginScreen ls = new LoginScreen(getset.getDriver());

	OnboardingFlow obFlow = new OnboardingFlow(getset.getDriver());
	HomeScreen hScreen = new HomeScreen(getset.getDriver());

	@And("User launches zocket application in mobile")
	public void user_launches_zocket_application_in_mobile() {

		LaunchDriver.launchMobileApp();
	}

	@And("^User clicks use another number option$")
	public void user_clicks_use_another_number_option() {
		// Write code here that turns the phrase above into concrete actions

		ls.chooseAnotherMobileNum();

	}

//	@And("^User enters mobile number$")
//	public void user_enters_mobile_number() {
//		// Write code here that turns the phrase above into concrete actions
//		ls.enterMobileNum();
//
//	}

	@And("^User clicks Get Started button$")
	public void user_clicks_Get_Started_button() {
		// Write code here that turns the phrase above into concrete actions
		ls.clickGetStartedBtn();

	}

	@Then("^User verifies OTP screen$")
	public void user_verifies_OTP_screen() {
		// Write code here that turns the phrase above into concrete actions
		ls.verifyOTPScreen();

	}

	@And("^User enters OTP$")
	public void user_enters_OTP() {
		// Write code here that turns the phrase above into concrete actions
		ls.enterOTP();

	}

	@Then("^User verifies Business Category screen$")
	public void user_verifies_Business_Category_screen() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.verifyBusinessCategoryScreen();

	}

	@And("^User selects respective Business Category$")
	public void user_selects_respective_Business_Category() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.selectRespectiveBusinessCategory();

	}

	@And("^User clicks right arrow button$")
	public void user_clicks_right_arrow_button() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.clickRightArrow();

	}

	@Then("^User verifies I want customers from screen$")
	public void user_verifies_I_want_customers_from_screen() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.verifyCustomersFromScreen();

	}

	@And("^User selects the area$")
	public void user_selects_the_area() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.selectsTheArea();
	}

	@And("^User selects right arrow button$")
	public void user_clicks_right_arrowOne() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.clicksRightArrowOne();
	}

	@Then("^User verifies Tell us more screen$")
	public void user_verifies_Tell_us_more_screen() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.verifyTellUsMoreScreen();

	}

	@And("^User enters the business name$")
	public void user_enters_the_business_name() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.enterBusinessName();

	}

	@And("^User clicked right arrow button$")
	public void user_clicked_right_arrow_button() {
		// Write code here that turns the phrase above into concrete actions
		obFlow.clicksRightArrowTwo();
	}

	@And("^User scratches the first Reward$")
	public void user_scratches_the_first_Reward() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks on Run Ad button$")
	public void user_clicks_on_Run_Ad_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks Continue with Facebook$")
	public void user_clicks_Continue_with_Facebook() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects Continue once logged in his facebook account$")
	public void user_selects_Continue_once_logged_in_his_facebook_account() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User verifies Choose a page$")
	public void user_verifies_Choose_a_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User selects the facebook page$")
	public void user_selects_the_facebook_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks Next button$")
	public void user_clicks_Next_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Reach campaign screen$")
	public void user_verifies_Reach_campaign_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks Edit Ad button$")
	public void user_clicks_Edit_Ad_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Edit Your Ad screen$")
	public void user_verifies_Edit_Your_Ad_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks on Edit image button$")
	public void user_clicks_on_Edit_image_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects one image$")
	public void user_selects_one_image() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User clicks DONE button$")
	public void user_clicks_DONE_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks on Edit Ad button$")
	public void user_clicks_on_Edit_Ad_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User select Edit your caption button$")
	public void user_select_Edit_your_caption_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects any templates from the list$")
	public void user_selects_any_templates_from_the_list() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User clicks Done button$")
	public void user_clicks_Done_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks Start Campaign button$")
	public void user_clicks_Start_Campaign_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Your Payment screen$")
	public void user_verifies_Your_Payment_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User clicks PayNow button$")
	public void user_clicks_PayNow_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects UPI-Google Play$")
	public void user_selects_UPI_Google_Play() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User do the payment$")
	public void user_do_the_payment() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks on Add your product button$")
	public void user_clicks_on_Add_your_product_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects Allow option from the pop up$")
	public void user_selects_Allow_option_from_the_pop_up() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Add Package screen$")
	public void user_verifies_Add_Package_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User enters product name$")
	public void user_enters_product_name() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User enters price$")
	public void user_enters_price() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User enters three Package details$")
	public void user_enters_three_Package_details() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects Browse here$")
	public void user_selects_Browse_here() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User selects three images$")
	public void user_selects_three_images() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User clicks Save Package button$")
	public void user_clicks_Save_Package_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Connect whatsapp screen$")
	public void user_verifies_Connect_whatsapp_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^Clicks Send WhatsApp code button$")
	public void clicks_Send_WhatsApp_code_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Ad launched screen$")
	public void user_verifies_Ad_launched_screen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User clicks on Go to home button$")
	public void user_clicks_on_Go_to_home_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^User verifies Reach campaign on homesreen$")
	public void user_verifies_Reach_campaign_on_homesreen() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User verifies homepage$")
	public void user_verifies_homepage() {
		hScreen.verifyHomeScreen();
	}

	@Then("^User verifies first reward$")
	public void user_verifies_first_reward() {
		hScreen.verifyFirstReward();
	}

	@And("^User clicks on use truecaller option$")
	public void user_clicks_on_use_truecaller_option() {
		ls.truecallerOption();
	}

	@And("^User log out from the application$")
	public void user_logout_from_the_application() {
		hScreen.logoutZocketApp();
	}

	@And("^User enters invalid mobile number$")
	public void user_enters_invalid_mobile_number() {
		ls.invalidMobileNumber();
	}

	@And("^User forget to enter mobile number$")
	public void user_forget_to_enter_mobile_number() {
		ls.clearsMobileNumber();
	}

	@And("^User enters incorrect mobile number$")
	public void user_enters_incorrect_mobile_number() {
		ls.incorrectMobileNumber();
	}

	@And("^User clicks change option in OTP verification screen$")
	public void user_clicks_change_option_in_OTP_verification_screen() {
		ls.clickChangeOtpOptions();
	}

	@Then("^User verifies toast message \"([^\"]*)\"$")
	public void user_verifies_toast_message(String toastMessage) {
		CommonUtility.getScreenShot(toastMessage);
	}

	@And("^User clears mobile number input fied$")
	public void user_clears_mobile_number_input_fied() {
		ls.clearsMobileNumber();
	}

	@And("^User clicks location input field")
	public void user_clicks_location_input_field() {
		obFlow.clickLocationInputField();
	}

	@And("^User enters location in search field$")
	public void user_enters_location_in_search_field() {
		obFlow.locationSearchField();
	}

	@And("^User selects the location$")
	public void user_selects_the_location() {
		obFlow.clicksSelectedLocation();
	}

	@And("^User clicks back arrow button$")
	public void user_clicks_back_arrow_button() {
		obFlow.clicksBackArrowBtn();
	}
	
	@And("^User enters mobile number \"([^\"]*)\"$")
	public void user_enters_mobile_number(String mobileNum) {
		ls.enterMobileNum(mobileNum);
	}
}
