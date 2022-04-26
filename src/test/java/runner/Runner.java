package runner;

import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        monochrome = true,
        tags = "@Test"
)
public class Runner {
    @AfterAll
    public static void closeBrowser(){
        BasePage.closeBrowser();
    }
}
