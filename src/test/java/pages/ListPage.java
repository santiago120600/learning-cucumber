package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{

    public ListPage() {
        super(driver);
    }

    private String searchField = "//input[@class='search']";
    private  String searchResults = "name";

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria() throws InterruptedException {
        Thread.sleep(600);
        write(searchField,"Washington");
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList = new ArrayList<String>();
        for (WebElement e: list){
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }

}
