package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeEpisodes extends CommonAPI {
    @FindBy(linkText = "FREE EPISODES")
    WebElement findFreeEpisodes;



    public void getFreeEpisodes(){
        findFreeEpisodes.click();
    }

}
