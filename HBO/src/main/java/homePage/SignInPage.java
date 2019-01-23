package homePage;

import base.CommonAPI;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage extends CommonAPI {
    @FindBy(xpath = "//span[@class='components/Tooltip--label']")
    WebElement findSignIn;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[1]/div/div/header/div[@class='components/Band--maxWidth']//ul[@class='bands/MainNavigation--rightSlotMiscNavigationItems']//div[@class='components/NavigationChildCards--childCardContainer']/div[1]/div[@class='components/NavigationChildCards--childCardWrapper']/a[@label='Sign In']/span[@class='components/BasicButton--children']")
    WebElement hboNowSignIn;
    @FindBy(xpath = "/html//body[@id='Viewport']/div[@class='default']/div[4]/div/div[7]/div[@class='default']/div[2]/div/span/span[.='Sign In']")
    WebElement findHboSignInNow;
    @FindBy(xpath = "/html//body[@id='Viewport']/div[@class='default']/div[5]/div/div[1]/div[3]/div/input[@class='default']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@class='default' and @type='password']")
    WebElement enterPassword;
    @FindBy(xpath = "//div[@class='default' and @style='width: 338px; height: 34px;']")
    WebElement clickOnSignIn;
    @FindBy(xpath = "//span[text()='The email address or password is incorrect. Please try again.']")
    WebElement errorMessageAppear;


    public WebElement getSignIn(){
        findSignIn.click();
        return findSignIn;
    }
    public WebElement getHboNowSignIn(){
        hboNowSignIn.click();
        return hboNowSignIn;
    }
    public WebElement getHboNSignIn(){
        findHboSignInNow.click();
        return findHboSignInNow;
    }
   public void emailForSignIn(){
       enterEmail.sendKeys("rekhtiar@hotmail.com",Keys.ENTER);
    }
    public void enterPassW(){
        enterPassword.sendKeys("12345678",Keys.ENTER);
    }
    public void clickSignIn(){
        clickOnSignIn.click();
    }
    public void errorMessage(){
        String actual=errorMessageAppear.getText();
        String expected="The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actual,expected);
    }
   }
