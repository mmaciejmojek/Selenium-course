package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectable {
    private WebDriver driver;

    public Selectable(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement item1(){
        return driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
    }
    public WebElement item3(){
        return driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
    }
    public WebElement item4(){
        return driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
    }
    public  WebElement selectFeedback(){
        return driver.findElement(By.id("feedback"));
    }
}
