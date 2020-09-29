package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsTabs {

    private WebDriver driver;

    public WindowsTabs(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBasicDropDown(){
        return driver.findElement(By.xpath("//a[@class=\"nav-link dropdown-toggle\"]"));
    }
    public WebElement windowsTabBtn() {
        return driver.findElement(By.id("windows-tabs-item"));
    }
    public WebElement newBrowserWindowBtn(){
        return driver.findElement(By.id("newBrowserWindow"));
    }
}
