package org.page_obg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class SecurePage extends BasePage{
    public SecurePage(WebDriver driver) {
        super(driver);
    }

    private By successTooltip(){
        return By.cssSelector(".flash.success");
    }
    private By btnLogOut(){
        return By.xpath("//a[@href='/logout']/i");
    }


    public SecurePage checkSuccessTooltip(String expectedText) {
        driver.findElement(successTooltip()).isDisplayed();
        Assert.assertEquals(driver.findElement(successTooltip()).getText()
                .replace("×", "")
                .trim(), expectedText);
        return this;
    }

    public LoginFormPage logOut(){
        driver.findElement(btnLogOut()).click();
        return new LoginFormPage(this.driver);
    }
}
