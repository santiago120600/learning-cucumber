package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com/");
    }
}
