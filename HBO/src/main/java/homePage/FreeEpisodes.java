package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;

import java.util.ArrayList;
import java.util.List;

public class FreeEpisodes extends CommonAPI {
    @FindBy(linkText = "FREE EPISODES")
    WebElement findFreeEpisodes;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[7]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[1]/div//div[@class='components/CardText--body']/a[@target='_self']/div[@class='components/CardText--title']")
    WebElement Sally4ever;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement playVideo;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[7]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[2]/div//div[@class='components/CardText--body']/a[@target='_self']/div[@class='components/CardText--title']")
    WebElement SaveAmerica;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement playVideo2;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[7]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[3]/div//div[@class='components/CardText--body']/a[@target='_self']/div[@class='components/CardText--title']")
    WebElement SharpObject;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement playSharpObject;
    @FindBy(xpath = "/html/body/main[@class='wrapperMain']/div[10]/div/div//div[@class='modules/cards/BasicCard--tabletContainer']/section[@class='modules/PromotionalCard--carouselContainer']//div[@class='components/Carousel--container']/div[3]/div//div[@class='components/CardText--body']/a[@target='_self']/div[@class='components/CardText--title']")
    WebElement Rome;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement playRome;
    @FindBy(xpath = "/html/body/main/div[13]/div/div//div[@class='components/MovieGrid--container']/div[6]//p[@class='modules/cards/CatalogCard--title']")
    WebElement Crashing;
    @FindBy(xpath = "//div[@class='__player-placeholder-play-button']")
    WebElement playCrashing;



    public WebElement getFreeEpisodes(){
        findFreeEpisodes.click();
        return findFreeEpisodes;
    }
    public WebElement getSally4ever(){
        Sally4ever.click();
        return Sally4ever;
    }
    public WebElement playVid(){
      playVideo.click();
      return playVideo;
    }
    public WebElement getpodSAve(){
        SaveAmerica.click();
        return SaveAmerica;
    }
    public WebElement getVideo(){
       playVideo2.click();
       return playVideo2;
    }
    public void getSharpObject(){
        SharpObject.click();
    }
    public void playSharpObj(){
        playSharpObject.click();
    }
    public void getRome(){
        Rome.click();
    }
    public void playRomeVideo(){
        playRome.click();
    }
    public void getCrashing(){
        Crashing.click();
    }
    public void playCrashingVideo(){
        playCrashing.click();
    }
    public List list(){
        List<WebElement> webelement=new ArrayList<>();
        webelement.add(Sally4ever);
        webelement.add(SaveAmerica);
        webelement.add(SharpObject);
        webelement.add(Rome);
        webelement.add(Crashing);

        List<String> test=new ArrayList<>();
        for(int i=0;i<webelement.size();i++){
            test.add(webelement.get(i).getText());
            System.out.println(webelement.get(i).getText());
        }
        return test;
    }
    public List expectedAllEpisodes(){
        List<String> listOfEpisodes=new ArrayList<>();
        listOfEpisodes.add("Sally4Ever");
        listOfEpisodes.add("Pod Save America");
        listOfEpisodes.add("Sharp Objects");
        listOfEpisodes.add("Rome");
        listOfEpisodes.add("Crashing");
        return listOfEpisodes;
    }

}
