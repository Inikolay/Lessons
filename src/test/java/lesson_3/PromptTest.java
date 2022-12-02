package lesson_3;

import baseTest.WebDriverTest;
import enam_frome_page.AlertButton;
import org.page_obg.AlertsPage;
import org.page_obg.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PromptTest extends WebDriverTest {


    AlertsPage alertsPage;
    @BeforeClass
    public void beforeClass() {
        openUrl("https://the-internet.herokuapp.com");
        alertsPage = new AlertsPage(driver);
    }

    @DataProvider(name = "promptTest")
    Object[] dataProvider(){
        return new Object[][]{
                {true, "Some test text!!!", "You entered: Some test text!!!"},
                {false, "Some test text!!!", "You entered: null"},
                {true, "", "You entered:"},
                {false, "", "You entered: null"}
        };
    }


    @Test(dataProvider = "promptTest")
    public void testPrompt(boolean switcher, String testText, String expectText) {
        new MainPage(driver).clickBtnPronPage("javascript_alerts");
        alertsPage.clickOnButton(AlertButton.PROMPT.getTextOnButton());
        alertsPage.switchToAlertAndGetText(switcher, testText);
        Assert.assertEquals(alertsPage.getResaltText(), expectText);
    }

}
