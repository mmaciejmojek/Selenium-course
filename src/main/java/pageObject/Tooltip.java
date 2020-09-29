package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tooltip {
    private WebDriver driver;

    public Tooltip(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement tooltipMessage() {
        return driver.findElement(By.id("age"));
    }
}
