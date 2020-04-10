Feature: Login Functionality

  Background:
    Given User Launch Chrome browser
    When User opens URL "http://automationpractice.com/"
    And user navigates to login page

#  @Regression @Smoke
 Scenario: Valid Credentials

   And User enters Email as "dadsa234@asd.com" and Password as "adminadmin"
    And Click on Login
    Then User should be get this "My account - My Store"


