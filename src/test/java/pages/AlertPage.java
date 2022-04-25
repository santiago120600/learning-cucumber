package pages;

import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage{
    public AlertPage() {
        super(driver);
    }
    private static String alertBtn = "//button[contains(text(),'Click for JS Alert')]";
    private static String alerPrompttBtn = "//button[contains(text(),'Click for JS Prompt')]";


    public void navigateToSite() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickButton() {
        clickElement(alerPrompttBtn);
    }

    public void dismissAlert(){
        promptAlert("hola");
    }
}
