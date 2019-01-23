package pages;
import base.CommonAPI;
import datasource.DatabaseOperation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static datasource.DatabaseOperation.getItemValue;

public class SearchPageForSQLDB {
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public static WebElement searchButton;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
    public static WebElement searchInputWebElement;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[2]/span")
    public static WebElement submitButtonWebElement;


    public void findSearchButton(){
        searchButton.click();
    }
    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        findSearchButton();
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException  {
        DatabaseOperation databaseOperation = new DatabaseOperation();
       // List<String> list = databaseOperation.getItemsListFromDB();
        List<String>list=DatabaseOperation.getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            System.out.println(list.get(i));
            //submitSearchButton();
            CommonAPI.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
            clearInput();
        }
    }
}



