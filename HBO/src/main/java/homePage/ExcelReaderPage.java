package homePage;

import base.CommonAPI;
import helper.ExcelReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[1]/div/div//div[@class='bands/MainNavigation--stickyTopBar']/div[@class='bands/MainNavigation--middleSlot']/div[@class='bands/MainNavigation--middleSlotContentContainer']/div[@class='bands/MainNavigation--middleSlotContent']/div[@class='bands/MainNavigation--searchIcon']")
    public static WebElement searchIcon;
    @FindBy(xpath = "//input[@ type='text']")
    public static WebElement searchBox;
    @FindBy(xpath = "//span[@class='components/Search--submitIcon']")
    public static  WebElement enterKey;


    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("/Users/shahnazpervin/Desktop/ekhtiar/Robin(HBO)/WebAutomationHBO2019/HBO/DataFile/HboXcell.xlsx");
        int rowcount = excelReader.getRowCount(0);
        searchIcon.click();

        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0,i,0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            searchBox.clear();
            Thread.sleep(500);
        }
    }
}
