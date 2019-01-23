package testHomePage;

import homePage.SearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchBox extends SearchBox {
    SearchBox sb;
    @BeforeMethod
    public void workOnSearchBox(){
        sb= PageFactory.initElements(driver,SearchBox.class);
    }



    @Test
    public void getResultOfSearchBox()throws InterruptedException{
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchBox();
    }
}
