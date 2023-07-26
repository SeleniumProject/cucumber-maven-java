Feature: Login Functionality

  Background: Launch App
    Given user navigate to site url "https://demowebshop.tricentis.com/"
  When user click on login link
  @smoke
  Scenario: Validate login functionality with valid data
  And user enter email address "rkudikala83@gmail.com"
  And user enter password "gmail@123"
  When click on login button
  Then validate login success
  @regression
  Scenario Outline: Verify login functionality with multiple data
  When user enter email address '<uname>'
  And user enter password '<password>'
  When click on login button
  Then validate login success
  
  Examples:
  | uname                 | password    |
  | testing@gmail.com     | gmail123    |
  | rkudikala83@gmail.com | testing123  |
  | sample@gmail.com      | testing1324 |
  #Scenario: Login with Data Table
    #When user click on login link
    #When user login to app with username and password
      #| selenium1@gmail.com | testing |
      #| selenium2@gmail.com | testing |
      #| selenium3@gmail.com | testing |
      #| selenium4@gmail.com | testing |
