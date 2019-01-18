package testHomePage;

import homePage.FreeEpisodes;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFreeEpisodes extends FreeEpisodes {
    FreeEpisodes fe;
    @BeforeMethod
    public void getFreeEpis(){
        fe= PageFactory.initElements(driver,FreeEpisodes.class); }


    @Test
    public void getFreeEpisode(){
        fe.getFreeEpisodes();

    }


}
