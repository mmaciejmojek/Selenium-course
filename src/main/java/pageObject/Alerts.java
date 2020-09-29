package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {
    private WebDriver driver;

    public Alerts(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement simpeAlertBtn() {
        return driver.findElement(By.xpath("//button[@id=\"simple-alert\"]"));
    }

    public WebElement simpleAlertBtnText() {
        return driver.findElement(By.id("simple-alert-label"));
    }

    public WebElement promptPopUpBtn() {
        return driver.findElement(By.id("prompt-alert"));
    }

    public WebElement promptAlertBoxText() {
        return driver.findElement(By.id("prompt-label"));
    }

    public WebElement confirmAlertBoxBtn() {
        return driver.findElement(By.id("confirm-alert"));
    }

    public WebElement getConfirmAlertBoxBtnText() {
        return driver.findElement(By.id("confirm-label"));
    }

    public WebElement delayedAlertBtn() {
        return driver.findElement(By.id("delayed-alert"));
    }

    public WebElement delayedAlertBtnText() {
        return driver.findElement(By.id("delayed-alert-label"));
    }
}