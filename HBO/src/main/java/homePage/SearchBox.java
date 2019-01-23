package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchBox extends CommonAPI {

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    WebElement findSearchbar;

    public void getSearchBox()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findSearchbar.click();
        Thread.sleep(3000);
        typeOnElementNEnter("//input[@type='text']","MOVIES");
        clearField("//input[@type='text']");
        navigateBack();
        typeOnElementNEnter("//input[@type='text']","SPORS");
        clearField("//input[@type='text']");
        navigateBack();
    }

    }


