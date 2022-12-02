package lesson_2;

import baseTest.WebDriverTest;
import org.testng.annotations.Test;

public class MyFirstTest  extends WebDriverTest {


    @Test
    public void firstTest(){
        openUrl("https://www.google.com.ua/?hl=ru");
    }
}
