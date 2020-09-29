package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dragable {
    private WebDriver driver;

    public Dragable (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement sourceElement() {
        return driver.findElement(By.id("draggable"));
    }
}
