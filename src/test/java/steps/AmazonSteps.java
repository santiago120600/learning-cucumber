package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonSteps {
    AmazonPage amazonPage = new AmazonPage();

    @Given("the user navigates to www.amazon.com")
    public  void navigateToAmazon(){
        amazonPage.navigateToAmazon();
    }

    @And("Searches for {string}")
    public  void searchItem(String item){
        amazonPage.searchItem(item);
    }

    @And("navigates to the second page")
    public  void navigateToSecondPage(){
        amazonPage.goToPage(2);
    }

    @And("selects the third item")
    public  void selectThirdItem(){
        amazonPage.selectThirdItem();
    }

    @Then("the user is able to add it to the cart")
    public  void addItemToCart(){
        Assert.assertEquals("Agregado al carrito",amazonPage.addItemToCart());
    }
}
