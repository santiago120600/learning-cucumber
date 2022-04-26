package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ListPage;

import java.util.List;

public class ListSteps {
    ListPage listPage = new ListPage();

    @Given("I navigate to the list page")
    public void i_navigate_to_the_list_page() {
        listPage.navigateToListPage();
    }

    @When("I search the list")
    public void i_search_the_list() throws InterruptedException {
        listPage.enterSearchCriteria();
    }

    @Then("I can find the text in the list")
    public void i_can_find_the_text_in_the_list() {
        List<String> list = listPage.getAllSearchResults();
        boolean containsText = list.contains("Seattle, Washington");
        Assert.assertTrue("The list do not contains the text given",containsText);
    }
}
