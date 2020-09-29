package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Progressbar {
    private WebDriver driver;

    public Progressbar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement completeLabel() {
        return driver.findElement(By.className("progress-label"));
    }
}
