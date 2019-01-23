package datatest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.SearchUsingGS;
import reporting.TestLogger;
import java.io.IOException;

public class GoogleSheetTest extends SearchUsingGS {
    SearchUsingGS searchUsingGS;
    @BeforeMethod
    public void initialization() {
        searchUsingGS = PageFactory.initElements(driver, SearchUsingGS.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoolgleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sendSpreadSheetIdAndRange("1f_Q0KK88_vOOYPiybA1Qw3_B_PCdNPXjtiTKnQGqYL8", "Sheet1!A2:A2");
    }
}



