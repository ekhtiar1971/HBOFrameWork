package testHomePage;

import homePage.FindSports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFindSports extends FindSports {
    FindSports fs;
    @BeforeMethod
    public void sports(){fs= PageFactory.initElements(driver,FindSports.class);
    }

    @Test
    public void getSportsOption(){
        fs.getSports();
        fs.getStudentAthlete();
        fs.getCareer();
    }
    @Test
    public void getAboutTapia(){
        fs.getSports();
        fs.getAllSports();
        fs.getTapia();
    }
    @Test
    public void get7DaysIn(){
        fs.getSports();
        fs.getAllSports();
        fs.get7DaysInHell();
    }
    @Test
    public void getBRuth(){
        fs.getSports();
        fs.getAllSports();
        fs.getBabeRuth();
    }

}
