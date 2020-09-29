package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
    private WebDriver driver;

    public Iframe(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement basicDropDown(){
        return driver.findElement(By.xpath("//a[@class=\"nav-link dropdown-toggle\"]"));
    }
    public WebElement firstNameIframe1() {
        return driver.findElement(By.id("inputFirstName3"));
    }
    public WebElement surNameIframe1() {
        return driver.findElement(By.id("inputSurname3"));
    }
    public WebElement loginIframe2() {
        return driver.findElement(By.id("inputLogin"));
    }
    public WebElement passwordIframe2() {
        return driver.findElement(By.id("inputPassword"));
    }
    public WebElement continentsIframe2() {
        return driver.findElement(By.id("inlineFormCustomSelectPref"));
    }
    public WebElement yearOfExperience1() {
        return driver.findElement(By.id("gridRadios1"));
    }
}
