package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//import sun.jvm.hotspot.debugger.Page;


    public class TestMainPage extends MainPage {
    MainPage page;
    @BeforeMethod
    public void getInformation(){
        page= PageFactory.initElements(driver, MainPage.class);
    }


    @Test
    public void checkMovies(){
        page.getMovies();
    }
    @Test
    public void checkSpecials(){ page.getSpecials();
    }
    @Test
    public void logoTab()throws InterruptedException{
        boolean logo=page.logotest();
        Assert.assertEquals(logo,true);
    }
    @Test
     public void searchIcon(){ page.findSearchIcon();
    }
     @Test
     public void searchBox(){page.findSearchBx();
    }
    @Test
    public void getText() throws InterruptedException{
        page.findSearchIcon();
        page.findSearchBx();
        String actual=page.searchItem();
        String expected="Dean";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void kids(){page.getKids();
    }
    @Test
    public void findepisodes(){page.getEpisodes();
    }
    @Test
    public void schedule(){page.getSchedule();
    }
    @Test
    public void signIn(){page.getSignInFunction();
    }
    @Test
    public void getHBo(){page.getHboFunction();
    }
    @Test
    public void MovieTitle() { page.getMovieTitle();
    }
    @Test
    public void getFacebook()throws IOException {page.findFaceBook();
    }
    @Test
    public void dropDownHandle()throws InterruptedException{page.getAllMovies();
    }
    @Test
    public void getTwitter(){page.getTwitterForHbo();
    }
    @Test
    public void getInstogram(){page.getInstogramFHbo();
    }
    @Test
    public void getAbout(){page.getAbout();
    }
    @Test
    public void getWaytoGet(){page.getWayToGet();
    }
    @Test
    public void getHelpForHbo(){page.getHelp();
    }
    @Test
    public void getShopping(){page.getShop();
    }
    @Test
    public void getCareerFrHbo(){page.getCareer();
    }
    @Test
    public void getHboInspire(){page.getInspire();
    }
    @Test
    public void getPrivatePolicy(){page.getPrivatePolicy();
    }
    @Test
    public void getTermsInHbo(){page.getTerms();
    }
    @Test
    public void getAdChoices(){page.getAdChoice();
    }
    @Test
    public void showImage()throws InterruptedException{page.imageVarification();
    }
    @Test
    public void playVideo()throws InterruptedException{page.setPlayVideo();
    }
    @Test
    public void getTitle()throws InterruptedException{
        page.getBexitTitle();
    }
    @Test
    public void getAllMovOrder()throws InterruptedException{
        page.getAllMoviesByOrder();
    }
    @Test
    public void getWebElementList(){
        page.webElementItems();
    }
    @Test
    public void getSportsUrl(){
        page.getUrlOfSports();
    }
    @Test
    public void getAssert(){
        List actual=page.webElementItems();
        List expected=page.webElementList();
        Assert.assertEquals(actual,expected);
    }

}
