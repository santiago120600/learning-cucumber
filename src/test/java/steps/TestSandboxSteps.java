package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandboxPage;

public class TestSandboxSteps{

    TestSandboxPage testSandboxPage = new TestSandboxPage();

    @Given("I navigate to the sandbox page")
    public void i_navigate_to_the_sandbox_page() {
        testSandboxPage.navigate_to_the_sandbox_page();
    }

    @And("select a value from the dropdown")
    public void select_a_value_from_the_dropdown() {
        testSandboxPage.selectByValue("2");
        testSandboxPage.selectById(2);
        testSandboxPage.selectByText("Option 1");
    }
}
