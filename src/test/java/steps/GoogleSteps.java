package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage googlePage = new GooglePage();
    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        googlePage.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        googlePage.enterSearchCriteria("Argentina");
    }
    @And("^click on the search button$")
    public void clickSearchButton(){
        googlePage.clickGoogleSearch();

    }
    @Then("^the results match the criteria$")
    public void validateResult(){
        Assert.assertEquals("Texto que esperamos",googlePage.firstResult());
    }

}
