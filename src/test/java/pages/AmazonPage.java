package pages;

public class AmazonPage extends BasePage{
    private static String searchInput = "//input[@name='field-keywords']";
    private static String searchBtn = "//input[@id='nav-search-submit-button']";
    private static String addToCartBtn = "//input[@id='add-to-cart-button']";
    private static String addedMsgText = "//*[contains(text(),'Agregado al carrito')]";
    private static String thirdElement = "//div[@data-component-type='s-search-result'][3]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";

    public AmazonPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com");
    }

    public void searchItem(String item) {
        write(searchInput,item);
        clickElement(searchBtn);
    }

    public void goToPage(Integer pageNumber) {
        clickLinkWithText(pageNumber.toString());
    }

    public void selectThirdItem() {
        clickElement(thirdElement);
    }

    public String addItemToCart() {
        clickElement(addToCartBtn);
        return textFromElement(addedMsgText);
    }
}
