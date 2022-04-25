package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TablePage;

public class TableSteps{
    TablePage tablePage = new TablePage();

    @Given("I navigate to the static table")
    public void i_navigate_to_the_static_table() {
        tablePage.navigateToTable();
    }

    @Then("I can return the value I wanted")
    public void i_can_return_the_value_i_wanted() {
        System.out.println(tablePage.getTableValue(1,1));
    }
}
