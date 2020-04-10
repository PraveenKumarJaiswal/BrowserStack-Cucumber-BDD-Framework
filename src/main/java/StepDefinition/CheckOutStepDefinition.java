package StepDefinition;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import browserStack.BrowserStackTestNew;


public class CheckOutStepDefinition extends BrowserStackTestNew {

    WebDriver driver;


    @Given("^user has selected an item$")
    public void user_has_selected_an_item() throws Throwable {
        driver.findElement(By.xpath(""));
    }

    @When("^user is navigated to Shopping cart page$")
    public void user_is_navigated_to_Shopping_cart_page() throws Throwable {

    }

    @When("^user clicks checkout button$")
    public void user_clicks_checkout_button() throws Throwable {

    }

    @When("^user confirms delivery address$")
    public void user_confirms_delivery_address() throws Throwable {

    }

    @When("^user cchecks the Terms of servicwe checkbox$")
    public void user_cchecks_the_Terms_of_servicwe_checkbox() throws Throwable {

    }

    @When("^user clicks checkout butoon$")
    public void user_clicks_checkout_butoon() throws Throwable {

    }

    @When("^user selects payment method$")
    public void user_selects_payment_method() throws Throwable {

    }

    @When("^user clicks confirm order button$")
    public void user_clicks_confirm_order_button() throws Throwable {

    }

    @Then("^user should be navigated to order confirmation page$")
    public void user_should_be_navigated_to_order_confirmation_page() throws Throwable {

    }





}
