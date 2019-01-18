package homePage;

import base.CommonAPI;
import base.CommonAPI;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class NewItemStuff extends CommonAPI {
    @FindBy(xpath = "//span[text()='Get It Today']")
    WebElement findGetItToday;
    @FindBy(how = How.XPATH ,using= "//div[text()='STAFF PICK']")
    WebElement findStaffpick;
    @FindBy(how = How.XPATH,using = "//div[text()='Capturing the Friedmans']")
    WebElement crimeReport;
    @FindBy(how = How.ID,using = "twitter-logo")
    WebElement logoVarification;


    public void setFindGetItToday(){
        findGetItToday.click();
    }
    public void getStaffPick(){
        String st=findStaffpick.getText();
        System.out.println(st);
    }
    public void getCrimeReport(){
        findStaffpick.click();
       String st=findStaffpick.getText();
    }
    public String logoVarify()throws InterruptedException{
        System.out.println("show logo display status " + logoVarification.isDisplayed());
        Thread.sleep(3);
        String location="Display logo location"+logoVarification.getLocation();
        System.out.println("Display logo location"+logoVarification.getLocation());
        return location;
    }
}
