package testHomePage;

import homePage.MouseOverHandle;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMouseOverHandle extends MouseOverHandle {
    MouseOverHandle mo;
    @BeforeMethod
    public void getInformation(){mo=PageFactory.initElements(driver,MouseOverHandle.class);}


    @Test
    public void testMouseOver()throws InterruptedException{
        mo.mouseOverForSports();

    }
}
