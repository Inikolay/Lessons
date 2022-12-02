package org.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver initDriver(Browsers browsers) {
        switch (browsers) {
            case EDGE: {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
        }
        return null;
    }

    public static WebDriver initDriver() {
        String browserName = System.getProperty("BrowserName", "chrome");
        try {
            return initDriver(Browsers.valueOf(browserName.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.err.println("Такого браузенра нет!");
            System.exit(-1);
        }
        return null;
    }
}
