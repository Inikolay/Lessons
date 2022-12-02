package lesson_2;

import baseTest.WebDriverTest;
import org.page_obg.LoginFormPage;
import org.page_obg.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTest extends WebDriverTest {

    LoginFormPage loginFormPage;
    MainPage mainPage;
    String userName = "tomsmith";
    String userPassword = "SuperSecretPassword!";
    String expectedText = "You logged into a secure area!";

    @BeforeClass
    public void beforeClass() {
        openUrl("https://the-internet.herokuapp.com/");
        mainPage = new MainPage(driver);
        loginFormPage = new LoginFormPage(driver);
    }

    @Test
    public void successLogInTest() {
        mainPage.clickBtnPronPage("login");
        loginFormPage.login(userName, userPassword);

    }

}
