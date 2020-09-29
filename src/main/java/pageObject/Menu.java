package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
    private WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement menuMusic(){
        return driver.findElement(By.id("ui-id-9"));
    }
    public WebElement menuJazz (){
        return driver.findElement(By.id("ui-id-13"));
    }
    public WebElement menuModern() {
        return driver.findElement(By.id("ui-id-16"));
    }
}
