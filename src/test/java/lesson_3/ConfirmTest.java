package lesson_3;

import baseTest.WebDriverTest;
import enam_frome_page.AlertButton;
import org.page_obg.AlertsPage;
import org.page_obg.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConfirmTest extends WebDriverTest {

    AlertsPage alertsPage;
    @BeforeMethod
    public void beforeMethod() {
        openUrl("https://the-internet.herokuapp.com");
        alertsPage = new AlertsPage(driver);
    }

    @DataProvider(name = "TestParam")
    Object[] dataProvider(){
        return new Object[][]{
                {true, "You clicked: Ok"} ,
                {false, "You clicked: Cancel"}
        };
    }

    @Test(dataProvider = "TestParam")
    public void alertTest(boolean switcher, String expectedText) {
        new MainPage(driver).clickBtnPronPage("javascript_alerts");
        alertsPage.clickOnButton(AlertButton.CONFIRM.getTextOnButton());
        Assert.assertEquals(alertsPage.switchToAlertAndGetText(switcher), "I am a JS Confirm");
    }
}
