package baseTest;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.driver.Browsers;
import org.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class WebDriverTest {

    protected WebDriver driver = null;

    @BeforeSuite
    public void setUpBrowser(){
//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();

        driver = WebDriverFactory.initDriver();
        driver.manage().window().maximize();
    }


    @AfterSuite
    public void closeDriver(){
        if (driver !=null){
            driver.quit();
        }
    }

    public void openUrl(String url){
        driver.navigate().to(url);
    }
}
