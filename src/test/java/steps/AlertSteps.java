package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AlertPage;

public class AlertSteps {
    AlertPage alertPage = new AlertPage();

    @Given("I navigate to the alert website")
    public void navigate_to_the_website(){
        alertPage.navigateToSite();
    }

    @Then("click on the alert button")
    public void click_on_the_alert_button() {
        alertPage.clickButton();
    }

    @And("dismiss the alert")
    public void dismiss_the_alert() {
        alertPage.dismissAlert();
    }

}
