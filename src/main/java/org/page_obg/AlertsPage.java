package org.page_obg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    private By alertsBtn(String nameButton){
        return By.xpath("//button[contains(text(),'" + nameButton + "')]");
    }

    private By textResalt(){
        return By.cssSelector("#result");
    }

    public void clickOnButton(String button) {
        driver.findElement(alertsBtn(button)).click();
    }

    public String switchToAlertAndGetText(boolean confirm, String... massage) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (massage.length > 0) {
            alert.sendKeys(massage[0]);
        }
        if (confirm) {
            alert.accept();
        } else {
            alert.dismiss();
        }
        return alertText;
    }


    public String getResaltText() {
        return driver.findElement(textResalt()).getText();
    }
}
