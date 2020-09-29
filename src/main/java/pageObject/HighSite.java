package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighSite {
    private WebDriver driver;

    public HighSite(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement submitBtn() {
        return driver.findElement(By.id("scroll-button"));
    }

    public WebElement widgetBtn () {
        return driver.findElement(By.cssSelector("\"input[id=\"scroll-button\"]\""));
    }
}