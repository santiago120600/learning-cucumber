package pages;

public class TablePage extends  BasePage{

    public TablePage() {
        super(driver);
    }

    private  static String tableLocator = "//*[@id='table1']";

    public void navigateToTable() {
        navigateTo("http://the-internet.herokuapp.com/tables");
    }

    public String getTableValue(int row,int column){
        return getValueFromTable(tableLocator,row,column);
    }
}
