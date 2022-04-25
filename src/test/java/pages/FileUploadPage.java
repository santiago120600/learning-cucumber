package pages;


public class FileUploadPage extends BasePage{
    public FileUploadPage() {
        super(driver);
    }

    private static String fileInput = "//*[@id='file-upload']";
    private static String filePath = "C:\\Users\\santi\\Pictures\\277253636_513647600208985_3208975158974945117_n.jpg";

    public void navigateToSite(){
        navigateTo("http://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(){
        uploadFile(fileInput,filePath);
    }
}
