package testHomePage;

import homePage.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestSignUp extends SignUp {
    SignUp sp;
    @BeforeMethod
    public void initializeElement() {
        sp = PageFactory.initElements(driver, SignUp.class);
    }
    @Test
    public void test()throws Exception{
        sp.getGetHbo();
        sp.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                //Thread.sleep(3000);
                sp.getEmail();
                sp.getPassword();
                sp.firstName();
                sp.getLastName();
                sp.getZipCode();
                sp.getAgreeToTerms();
                Thread.sleep(3000);
                sp.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test1()throws Exception{
        sp.getGetHbo();
        sp.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                sp.getEmail1();
                sp.getPassword1();
                sp.firstName1();
                sp.getLastName1();
                sp.getZipCode1();
                sp.getAgreeToTerms1();
                Thread.sleep(3000);
                sp.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test2()throws Exception{
        sp.getGetHbo();
        sp.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                sp.getEmail2();
                sp.getPassword2();
                sp.firstName2();
                sp.getLastName2();
                sp.getZipCode2();
                sp.getAgreeToTerms2();
                Thread.sleep(3000);
                sp.getClickOnCreateAccount();
            }
        }
    }

    @Test
    public void test5()throws Exception{
        sp.getGetHbo();
        sp.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                sp.getEmail();
                sp.getPassword();
                sp.firstName();
                sp.getLastName();
                sp.getZipCode();
                sp.getAgreeToTerms();
                //Thread.sleep(3000);
                sleepFor(3);
                sp.getClickOnCreateAccount();
            }
        }
    }


}
