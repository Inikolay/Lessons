package org.page_obg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By btnPronPage(String nameButton){
        return By.xpath("//a[@href='/"+nameButton+"']");
    }

    public void clickBtnPronPage(String nameButton){
        driver.findElement(btnPronPage(nameButton)).click();
    }
}