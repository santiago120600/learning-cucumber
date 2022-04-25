package pages;

public class TestSandboxPage extends BasePage{
    private String dropdown = "//*[@id='dropdown']";
    public TestSandboxPage() {
        super(driver);
    }

    public void navigate_to_the_sandbox_page() {
        navigateTo("http://the-internet.herokuapp.com/dropdown");
    }

    public void selectByValue(String category) {
        selectFromDropdownByValue(dropdown,category);
    }

    public void selectById(int value){
        selectFromDropdownByIndex(dropdown,value);
    }
    public void selectByText(String value){
        selectFromDropdownByText(dropdown,value);
    }

}
