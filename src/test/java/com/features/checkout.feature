Feature: Checkout


Background: These are the common actions taken prior

    Given User Launch Chrome browser
    When User opens URL "http://automationpractice.com/"
    And user navigates to login page
    And User enters Email as "dadsa234@asd.com" and Password as "adminadmin"
    And Click on Login
    Then User should be get this "My account - My Store"


Scenario: Verify Checkout with 1 item
Given user has selected an item
When user is navigated to Shopping cart page
And user clicks checkout button
And user confirms delivery address
When user clicks checkout button
And user cchecks the Terms of servicwe checkbox
And user clicks checkout butoon
And user selects payment method
When user clicks confirm order button
Then user should be navigated to order confirmation page 






