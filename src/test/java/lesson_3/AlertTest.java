package lesson_3;

import baseTest.WebDriverTest;
import enam_frome_page.AlertButton;
import org.page_obg.AlertsPage;
import org.page_obg.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AlertTest extends WebDriverTest {

    AlertsPage alertsPage;
    @BeforeClass
    public void beforeClass() {
        openUrl("https://the-internet.herokuapp.com");
        alertsPage = new AlertsPage(driver);
    }

    @Test
    public void alertTest() {
       new MainPage(driver).clickBtnPronPage("javascript_alerts");
       alertsPage.clickOnButton(AlertButton.ALERT.getTextOnButton());
       Assert.assertEquals(alertsPage.switchToAlertAndGetText(true), "I am a JS Alert");
       Assert.assertEquals(alertsPage.getResaltText(), "You successfully clicked an alert");
    }
}
