package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindSports extends CommonAPI {
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a")
    WebElement findSportsOption;
    @FindBy(linkText = "Student Athlete")
    WebElement findStudentAthlete;
    @FindBy(xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[4]/div/div[1]/div/a/div")
    WebElement findCareerAdvice;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div[3]/div/div/div/ul/li[2]/div/a")
    WebElement findAllSports;
    @FindBy(xpath = "/html/body/main/div[3]/div/div/div[1]/div[2]/div/div[31]/div[2]/p[1]")
    WebElement findTapia;
    @FindBy(xpath = "//p[text()='7 Days in Hell']")
    WebElement find7DaysInHell;
    @FindBy(xpath = "//p[text()='Babe Ruth']")
    WebElement findBabaRuth;


    public void getSports(){
        findSportsOption.click();
    }
    public void getStudentAthlete(){
        findStudentAthlete.click();
    }
    public void getCareer() {
        findCareerAdvice.click();
    }
    public void getAllSports(){
        findAllSports.click();
    }
    public void getTapia(){
        findTapia.click();
    }
    public void get7DaysInHell(){
        find7DaysInHell.click();
    }
    public void getBabeRuth(){
        findBabaRuth.click();
    }

}

