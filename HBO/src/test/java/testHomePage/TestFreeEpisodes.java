package testHomePage;

import homePage.FreeEpisodes;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestFreeEpisodes extends FreeEpisodes {
    FreeEpisodes fe;
    @BeforeMethod
    public void getFreeEpis(){
        fe= PageFactory.initElements(driver,FreeEpisodes.class); }


    @Test
    public void getFreeEpisode(){
        fe.getFreeEpisodes();
    }
    @Test
    public void getSally4ev(){
        fe.getFreeEpisodes();
        fe.getSally4ever();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        fe.playVid();
    }
    @Test
    public void getWtWord(){
        fe.getFreeEpisodes();
        fe.getpodSAve();
        try {
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }catch (Exception e){
            e.printStackTrace();
        }
        fe.getVideo();
    }
    @Test
    public void getSharpObj(){
        fe.getFreeEpisodes();
        fe.getSharpObject();
        fe.playSharpObj();
    }
    @Test
    public void getRomeVideo(){
        fe.getFreeEpisodes();
        fe.getRome();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        fe.playRomeVideo();
    }
    @Test
    public void getCrashingVideo(){
        fe.getFreeEpisodes();
        fe.getCrashing();
        fe.playCrashingVideo();
    }
    @Test
    public void freeEpisodes(){
        fe.getFreeEpisodes();
        List actual=fe.list();
        List expected=fe.expectedAllEpisodes();
        Assert.assertEquals(actual,expected);
    }
}
