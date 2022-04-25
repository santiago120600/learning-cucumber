package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FileUploadPage;

public class FileUploadSteps {
    FileUploadPage fileUploadPage = new FileUploadPage();

    @Given("I navigate to the website")
    public void i_navigate_to_the_website() {
        fileUploadPage.navigateToSite();
    }

    @Then("I upload a file")
    public void i_upload_a_file() {
        fileUploadPage.uploadFile();
    }
}
