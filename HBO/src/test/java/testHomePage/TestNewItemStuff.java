package testHomePage;

import homePage.NewItemStuff;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestNewItemStuff extends NewItemStuff {
    NewItemStuff fp;
    @BeforeMethod
    public void findElements(){fp= PageFactory.initElements(driver, NewItemStuff.class); }


    @Test(priority = 1)
    public void getItTodayItem(){
        fp.setFindGetItToday();
    }
    @Test(priority = 2)
    public void staffPick(){
        fp.getStaffPick();
    }
    @Test(priority = 3)
    public void getCrReport(){
        fp.getCrimeReport();
    }
    @Test(priority = 4)
        public void getLogoVarification()throws InterruptedException{
        fp.logoVarify(); }
    }
