package testHomePage;

import homePage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestSignPage extends SignInPage {
    SignInPage ssp;
    @BeforeMethod
    public void getElements(){ssp= PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void getSignInInfo(){
        ssp.getSignIn();
        ssp.getHboNowSignIn();
        ssp.getHboNSignIn();
        ssp.emailForSignIn();
        ssp.enterPassW();
        ssp.errorMessage();

    }

}
