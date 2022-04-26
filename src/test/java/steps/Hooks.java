package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import pages.BasePage;

import java.io.IOException;

public class Hooks extends BasePage {
    public Hooks() {
        super(driver);
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.attach(screenshot, "image/png",testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();}
        }
    }

}
