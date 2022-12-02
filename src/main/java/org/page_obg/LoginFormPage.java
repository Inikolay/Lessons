package org.page_obg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {
    public LoginFormPage(WebDriver driver) {
        super(driver);
    }

    private By userName() {
        return By.xpath("//input[@name='username']");
    }

    private By userPassword() {
        return By.xpath("//input[@name='password']");
    }

    private By btnLogIn() {
        return By.xpath("//button[@type='submit']");
    }

    private By errorTooltip() {
        return By.cssSelector(".flash.error");
    }

    public LoginFormPage writeUserName(String userName) {
        driver.findElement(userName()).sendKeys(userName);
        return this;
    }

    private By successTooltip() {
        return By.cssSelector(".flash.success");
    }


    public LoginFormPage writeUserPassword(String userPassword) {
        driver.findElement(userPassword()).sendKeys(userPassword);
        return this;
    }

    public SecurePage login(String userName, String userPassword) {
        writeUserName(userName)
                .writeUserPassword(userPassword)
                .driver.findElement(btnLogIn()).click();
        return new SecurePage(this.driver);

    }

    public String getMessageFromTooltip(boolean success) {
        if (success) {
            return driver.findElement(successTooltip()).getText();
        } else {
            return driver.findElement(errorTooltip()).getText();
        }
    }
}
