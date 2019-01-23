package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignUp extends CommonAPI {

    @FindBy(xpath = "//span[text()='Get HBO']")
    WebElement findGetHBO;
    @FindBy(linkText= "START YOUR FREE TRIAL")
    WebElement startYourFreeTrial;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/input")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[2]/input")
    WebElement password;
    @FindBy(xpath = "//body[@id='Viewport']/div[@class='default']/div[2]/div[2]/div[2]/div/div[2]/div[7]/div[1]/input[@class='default']")
    WebElement entFName;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[9]/div[1]/input")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[11]/div[1]/input")
    public WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[12]/div[1]/div")
    public WebElement agreeToTerms;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div")
    public WebElement clickOnCreateAccount;


        public void getGetHbo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        findGetHBO.click();}
        public void getStartYourFreeTrial () {
            startYourFreeTrial.click();
        }
        public void getEmail () {
            email.sendKeys("rekhtiar@hotmail.com");
        }
        public void getPassword () {
            password.sendKeys("Ab345678");
        }
        public void firstName(){
            entFName.sendKeys("tahsan");
        }
        public void getLastName() { lastName.sendKeys("Ekhtiar"); }
        public void getZipCode() { zipCode.sendKeys("11104"); }
        public void getAgreeToTerms() { agreeToTerms.click(); }
        public void getClickOnCreateAccount() { clickOnCreateAccount.click(); }

        public void getGetHbo1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        findGetHBO.click();}
        public void getStartYourFreeTrial1 () {
        startYourFreeTrial.click(); }
        public void getEmail1 () {
        email.sendKeys("tahsan7112@gmail.com"); }
        public void getPassword1 () {
        password.sendKeys("8765323aB"); }
        public void firstName1(){
        entFName.sendKeys("tasneem"); }
        public void getLastName1() { lastName.sendKeys("Ekhtiar"); }
        public void getZipCode1() { zipCode.sendKeys("14324"); }
        public void getAgreeToTerms1() { agreeToTerms.click(); }
        public void getClickOnCreateAccount1() { clickOnCreateAccount.click(); }

        public void getGetHbo2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        findGetHBO.click();}
        public void getStartYourFreeTrial2 () {
        startYourFreeTrial.click(); }
        public void getEmail2 () {
        email.sendKeys("rinumagura81@gmailk.com"); }
        public void getPassword2() {
        password.sendKeys("65453Sd321"); }
        public void firstName2(){
        entFName.sendKeys("sajib"); }
        public void getLastName2() { lastName.sendKeys("atiar"); }
        public void getZipCode2() { zipCode.sendKeys("11464"); }
        public void getAgreeToTerms2() { agreeToTerms.click(); }
        public void getClickOnCreateAccount2() { clickOnCreateAccount.click(); }
    }


