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

    @When("I search {string} in the list")
    public void i_search_the_list(String state) throws InterruptedException {
        listPage.enterSearchCriteria(state);
    }

    @Then("I can find {string} in the list")
    public void  i_can_find_the_text_in_the_list(String city) {
        List<String> list = listPage.getAllSearchResults();
        boolean containsText = list.contains(city);
        Assert.assertTrue("The list do not contains the text given",containsText);
    }

}
