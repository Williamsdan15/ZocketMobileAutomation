@Zocket
Feature: To test the Login and Onboarding Functionality of Zocket application

  @Login_TC1
  Scenario: To test login and sign up functionality without Truecaller
    #Given User launches zocket application in mobile
    And User clicks use another number option
    And User enters mobile number "8056063881"
    And User clicks Get Started button
    #Then User verifies OTP screen
    #And User enters OTP
    #Then User clicks Verify OTP button
    Then User verifies Business Category screen
    And User selects respective Business Category
    And User clicks right arrow button
    #And User allows device location
    Then User verifies I want customers from screen
    And User selects the area
    And User clicks right arrow button
    Then User verifies Tell us more screen
    And User enters the business name
    And User clicks back arrow button
    Then User verifies I want customers from screen
    And User clicks back arrow button
    Then User verifies Business Category screen
    And User clicks back arrow button

  #And User clicks right arrow button
  #Then User verifies first reward
  #Then User verifies homepage
  #And User log out from the application
  @Login_TC2
  Scenario: To Test Login and sign up Functionality using Truecaller
    And User clicks on use truecaller option
    Then User verifies Business Category screen
    And User selects respective Business Category
    And User clicks right arrow button
    Then User verifies I want customers from screen
    And User selects the area
    And User clicks right arrow button
    Then User verifies Tell us more screen
    And User enters the business name
    And User clicks back arrow button
    Then User verifies I want customers from screen
    And User clicks back arrow button
    Then User verifies Business Category screen
    And User clicks back arrow button

  #Then User verifies first reward
  #Then User verifies homepage
  @Login_TC3
  Scenario: To Test Negative scenarios of Login functionality
    And User clicks use another number option
    #And User enters invalid mobile number
    And User enters mobile number "123456789"
    And User clicks Get Started button
    Then User verifies toast message "Please enter valid phone number"
    And User clears mobile number input fied
    And User clicks Get Started button
    Then User verifies toast message "Please enter your phone number"
    #And User enters incorrect mobile number
    And User enters mobile number "9856817856"
    And User clicks Get Started button
    And User clicks change option in OTP verification screen
    And User enters mobile number "8056063881"
    And User clicks Get Started button
    Then User verifies Business Category screen
    And User selects respective Business Category
    And User clicks right arrow button
    Then User verifies I want customers from screen
    And User selects the area
    And User clicks right arrow button
    Then User verifies Tell us more screen
    And User enters the business name
    And User clicks back arrow button
    Then User verifies I want customers from screen
    And User clicks back arrow button
    Then User verifies Business Category screen
    And User clicks back arrow button

  #Then User verifies first reward
  #Then User verifies homepage
  @Login_TC4
  Scenario: To Test Negative scenarios of onboarding functionality
    And User clicks on use truecaller option
    Then User verifies Business Category screen
    And User clicks right arrow button
    Then User verifies toast message "Please Select Business Category"
    And User selects respective Business Category
    And User clicks right arrow button
    Then User verifies I want customers from screen
    And User clicks location input field
    And User enters location in search field
    And User selects the location
    And User clicks right arrow button
    Then User verifies Tell us more screen
    And User clicks right arrow button
    Then User verifies toast message "Please Enter Business Name"
    And User enters the business name
    And User clicks right arrow button
    Then User verifies first reward
    Then User verifies homepage

  #@Login_TC2
  #Scenario: To test change mobil number functionality
  #Given User launches zocket application in mobile
  #And User clicks use another number option
  #Then User verifies negative scenario mobile number input field
  #And User enters mobile number
  #And User clicks Get Started button
  #Then User verifies OTP screen
  #Then User verifies change mobile number button
  #And User clicks change mobile number
  #And User enters mobile number
  #And User clicks Get Started button
  #Then User verifies OTP screen
  #And User enters OTP
  #Then User clicks Verify OTP button
  #Then User verifies Business Category screen
  #And User selects respective Business Category
  #And User clicks right arrow button
  #And User allows device location
  #Then User verifies I want customers from screen
  #And User selects the area
  #And User clicks right arrow button
  #Then User verifies Tell us more screen
  #And User enters the business name
  #And User clicks right arrow button
  @Homescreen_TC2
  Scenario: To Test First Reward on Homescreen
    #Given User completes login and onboarding flow
    And User scratches the first Reward
    And User clicks on Run Ad button
    And User clicks Continue with Facebook
    And User selects Continue once logged in his facebook account
    Then User verifies Choose a page
    And User selects the facebook page
    And User clicks Next button
    And User verifies Reach campaign screen
    And User clicks Edit Ad button
    And User verifies Edit Your Ad screen
    And User clicks on Edit image button
    And User selects one image
    Then User clicks DONE button
    And User clicks on Edit Ad button
    And User select Edit your caption button
    And User selects any templates from the list
    Then User clicks Done button
    And User clicks Start Campaign button
    And User verifies Your Payment screen
    Then User clicks PayNow button
    And User selects UPI-Google Play
    And User clicks PayNow button
    And User do the payment
    And User clicks on Add your product button
    And User selects Allow option from the pop up
    And User verifies Add Package screen
    And User enters product name
    And User enters price
    And User enters three Package details
    And User selects Browse here
    And User selects three images
    And User clicks Next button
    Then User clicks Save Package button
    And User verifies Connect whatsapp screen
    And User enters mobile number "8056063881"
    And Clicks Send WhatsApp code button
    And User verifies Ad launched screen
    And User clicks on Go to home button
    And User verifies Reach campaign on homesreen
