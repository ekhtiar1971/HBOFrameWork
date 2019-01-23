package homePage;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class MainPage extends CommonAPI {
    @FindBy(linkText = "MOVIES")
    public static WebElement findMovies;
    @FindBy(linkText = "SERIES")
    public static WebElement findSeries;
    @FindBy(linkText = "SPECIALS")
    public static WebElement findSpecials;
    @FindBy(css= ".bands\\/MainNavigation--topBar [d='M57\\.715\\,80\\.628H36\\.174V49\\.859H22\\.192v30\\.769H0\\.079L0\\,1\\.327h22\\.192v29\\.499h13\\.982V1\\.327h21\\.541V80\\.628z M156\\.412\\,81c22\\.212-0\\.009\\,40\\.287-18\\.464\\,40\\.282-40\\.679C196\\.69\\,17\\.637\\,178\\.624\\,0\\.017\\,156\\.412\\,0 c-22\\.186-0\\.016-33\\.522\\,16\\.315-36\\.323\\,22\\.907c0\\.026-9\\.895-9\\.727-21\\.576-21\\.136-21\\.588H62\\.197V80\\.6l34\\.269\\,0\\.012 c13\\.817\\,0\\,23\\.648-11\\.972\\,23\\.666-22\\.238C123\\.286\\,64\\.835\\,134\\.226\\,81\\.008\\,156\\.412\\,81z M93\\.595\\,48\\.741 c3\\.171\\,0\\,5\\.669\\,3\\.132\\,5\\.669\\,6\\.699c0\\,3\\.568-2\\.498\\,6\\.699-5\\.669\\,6\\.699h-10\\.9V48\\.741H93\\.595z M93\\.635\\,18\\.971 c3\\.171\\,0\\,5\\.669\\,3\\.131\\,5\\.669\\,6\\.699c0\\,3\\.568-2\\.498\\,6\\.7-5\\.669\\,6\\.7H82\\.734V18\\.971H93\\.635z M108\\.143\\,40\\.337 c2\\.497-0\\.317\\,6\\.66-3\\.171\\,8\\.127-4\\.995c-0\\.516\\,2\\.26-0\\.555\\,8\\.8\\,0\\.047\\,11\\.06C114\\.644\\,43\\.826\\,110\\.68\\,40\\.654\\,108\\.143\\,40\\.337z M136\\.244\\,40\\.337c0-11\\.146\\,9\\.035-20\\.182\\,20\\.181-20\\.182c11\\.146\\,0\\,20\\.182\\,9\\.036\\,20\\.182\\,20\\.182c0\\,11\\.147-9\\.036\\,20\\.182-20\\.182\\,20\\.182 C145\\.279\\,60\\.519\\,136\\.244\\,51\\.484\\,136\\.244\\,40\\.337z M156\\.425\\,56\\.202c8\\.762\\,0\\,15\\.865-7\\.102\\,15\\.865-15\\.865 c0-8\\.762-7\\.103-15\\.865-15\\.865-15\\.865c-8\\.762\\,0-15\\.865\\,7\\.103-15\\.865\\,15\\.865C140\\.56\\,49\\.1\\,147\\.663\\,56\\.202\\,156\\.425\\,56\\.202z']")
    public static WebElement findlogo;
    @FindBy(xpath ="//a[@href='/sports']")
    public static WebElement sports;
    @FindBy(xpath = "//div[@class='bands/MainNavigation--searchIcon']")
    public static WebElement searchIcon;
    @FindBy(xpath = "//input[@ type='text']")
    public static WebElement searchBox;
    @FindBy(xpath = "//span[@class='bands/SearchResults--highlightFeatured']")
    public static WebElement getTextElements;
    @FindBy(linkText = "KIDS")
    public static WebElement findKids;
    @FindBy(linkText = "FREE EPISODES")
    public static WebElement findFreeEpisodes;
    @FindBy(linkText = "SCHEDULE")
    public static WebElement findSchedule;
    @FindBy(xpath = "//span[@class='components/Tooltip--label']")
    public static WebElement signInOption;
    @FindBy(xpath = "//span[text()='Get HBO']")
    public static WebElement getHbo;
    @FindBy(id="facebook-logo")
    public static WebElement facebookInFollowHBO;
    @FindBy(id = "email")
    public static WebElement enterEmailInLogin;
    @FindBy(id="pass")
    public static WebElement enterPassword;
    @FindBy(id="loginbutton")
    public static WebElement clickOnlogin;
    @FindBy(linkText  ="ALL MOVIES")
    public static WebElement allMovie;
    @FindBy(id ="twitter-logo")
    WebElement twitterForHbo;
    @FindBy(css = "[viewBox='0 0 20 20']")
    WebElement findInstogram;
    @FindBy(linkText = "ABOUT")
    WebElement about;
    @FindBy(linkText = "WAYS TO GET")
    WebElement findWayToGet;
    @FindBy(linkText = "HELP")
    WebElement findHelp;
    @FindBy(xpath = "//a[@target='_blank']")
    WebElement findShop;
    @FindBy(linkText = "CAREERS")
    public static WebElement findCareer;
    @FindBy(linkText = "HBO INSPIRES")
    WebElement findInspire;
    @FindBy(xpath = "//a[text()='Privacy Policy']")
    WebElement findPrivacyPolicy;
    @FindBy(xpath = "//a[text()='Terms']")
    WebElement findTerms;
    @FindBy(xpath = "//a[text()='Ad Choices']")
    WebElement findAdChoice;
    @FindBy(xpath ="/html/body/main/div[6]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[4]/div/a[@href='/last-week-tonight-with-john-oliver']/img[@src='/content/dam/hbodata/series/last-week-tonight-with-john-oliver/key-art/last-week-tonight-s5-ka-1920.jpg/_jcr_content/renditions/cq5dam.web.1200.675.jpeg']" )
    WebElement findImage;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[6]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[1]/div//div[@class='components/CardText--body']/a[@href='/movies/brexit']/div[@class='components/CardText--title']")
    WebElement playVideo;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement findPlayVideo;
    @FindBy(xpath = "2 Dope Queens")
    WebElement findUrl;
    @FindBy(linkText = "MOVIES")
    WebElement findTheMovies;
    @FindBy(linkText= "ALL MOVIES")
    WebElement allMovies;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[2]/div/div//div[@class='components/FilterBar--full']/span[@class='components/FilterBar--sortIcon']/img[@alt='Sort Icon']")
    WebElement findMenu;
    @FindBy(xpath = "//li[@data-bi-interactive='FilterBar / sort / Z–A']")
    WebElement findZToA;


    public void getMovies(){
        findMovies.click();
    }
    public void getSeries(){
        findSeries.click();
    }
    public void getSpecials(){ findSpecials.click();
    }
    public boolean logotest(){
        boolean logo=findlogo.isDisplayed();
        return logo; }
    public void searchSports(){
        sports.click();
        driver.close();}
    public void findSearchIcon(){
        searchIcon.click();
    }
    public void findSearchBx(){
        searchBox.sendKeys("Dean",Keys.ENTER);
    }
    public  String searchItem(){
        String text=getTextElements.getText();
        return text;
    }
    public void getKids(){
        findKids.click();
    }
    public void getEpisodes(){
        findFreeEpisodes.click();
    }
    public void getSchedule(){
        findSchedule.click();
    }
    public void getSignInFunction(){
        signInOption.click();
    }
    public void getHboFunction(){
        getHbo.click();
    }
    public  String getMovieTitle(){
        findMovies.click();
        String movieTitle=driver.getTitle();
        System.out.println("Movies page title is :  " +movieTitle);
        String actual=driver.getTitle();
        String expected="HBO Original Movies & Films: watch Online | HBO Official Site";
        Assert.assertEquals(actual,expected);
        return movieTitle;
    }
    public void findFaceBook(){facebookInFollowHBO.click();
        enterEmailInLogin.sendKeys("rekhtiar@yahoo.com",Keys.ENTER);
        enterPassword.sendKeys("4297541",Keys.ENTER);
        clickOnlogin.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }
    public void getAllMovies()throws InterruptedException{
        findMovies.click();
        allMovie.click();
        Actions action=new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//img[@alt='Sort Icon']")))
                .moveToElement(driver.findElement(By.xpath("//li[@class='components/FilterBar--unselectedItem']")))
                .build()
                .perform(); }
    public void getTwitterForHbo(){
        twitterForHbo.click();
    }
    public void getInstogramFHbo(){
        findInstogram.click();
    }
    public void getAbout(){
        about.click();
    }
    public void getWayToGet(){
        findWayToGet.click();
    }
    public void getHelp(){
        findHelp.click();
    }
    public void getShop(){
        findShop.click();
    }
    public void getCareer(){
        findCareer.click();
    }
    public void getInspire(){
        findInspire.click();
    }
    public void getPrivatePolicy(){
        findPrivacyPolicy.click();
    }
    public void getTerms(){
        findTerms.click();
    }
    public void getAdChoice(){
        findAdChoice.click();
    }
    public String imageVarification()throws InterruptedException{
        System.out.println("Show image display :" +findImage.isDisplayed());
        sleepFor(3);
        String location="Show image location :" +findImage.getLocation();
        System.out.println("Show image location "+findImage.getLocation());
        return location; }
    public void setPlayVideo()throws InterruptedException{playVideo.click();
        findPlayVideo.click();
        sleepFor(10);
    }
    public String getBexitTitle()throws InterruptedException{
        String title=driver.getTitle();
        System.out.println("Brexit title :"+title);
        String actual=driver.getTitle();
        String expected="HBO: Home to Groundbreaking Series, Movies, Comedies & Documentaries";
        Assert.assertEquals(actual,expected);
        return title;
    }
    public void getAllMoviesByOrder()throws InterruptedException{
        findTheMovies.click();
        allMovies.click();
        Thread.sleep(5);
        findMenu.click();
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@data-bi-interactive='FilterBar / sort / Z–A']")))
                .build()
                .perform();
    }
    public List webElementItems(){
        List<WebElement> webElemets=new ArrayList<>();
        webElemets.add(findMovies);
        webElemets.add(findSeries);
        webElemets.add(findSpecials);
        webElemets.add(sports);
        webElemets.add(findKids);
        webElemets.add(findFreeEpisodes);
        webElemets.add(getHbo);
        webElemets.add(findSchedule);

        List<String>list=new ArrayList<>();
        for(int i=0; i<webElemets.size(); i++){
            list.add(webElemets.get(i).getText());
        }
            System.out.println(list);
            return list;
    }
    public List webElementList(){
        List<String> expectedWebElItem=new ArrayList<>();
       expectedWebElItem.add("MOVIES");
       expectedWebElItem.add("SERIES");
       expectedWebElItem.add("SPECIALS");
       expectedWebElItem.add("SPORTS");
       expectedWebElItem.add("KIDS");
       expectedWebElItem.add("FREE EPISODES");
       expectedWebElItem.add("GET HBO");
       expectedWebElItem.add("SCHEDULE");
       return expectedWebElItem;
    }
    public String getUrlOfSports(){
        sports.click();
        String st=driver.getCurrentUrl();
        System.out.println(st);
        return st;
    }
}

