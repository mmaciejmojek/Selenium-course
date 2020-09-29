package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker {
    private WebDriver driver;

    public Datepicker(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement dateBox() {
        return driver.findElement(By.id("datepicker"));
    }
    public WebElement isToday() {
        return driver.findElement(By.cssSelector("/html/body/div[1]/table/tbody/tr[2]/td[3]/a"));
    }
}
