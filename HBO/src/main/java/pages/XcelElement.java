package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.util.List;
//import reporting.TestLogger;

public class XcelElement extends CommonAPI {
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public static WebElement getXcelElement;
    public void getXcelElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getXcelElement.click();
    }
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
    public static WebElement searchBox;
    public void putSearchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("searchItems");

    }
}



