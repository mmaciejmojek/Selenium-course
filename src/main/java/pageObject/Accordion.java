package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accordion {
    private WebDriver driver;

    public Accordion (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement section1Text(){
        return driver.findElement(By.xpath("//p[contains(text(), \"Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus,\")]"));
    }
    public WebElement section2Btn(){
        return driver.findElement(By.id("ui-id-3"));
    }

    public WebElement section1Btn(){
        return driver.findElement(By.id("ui-id-1"));
    }

    public WebElement section2Text(){
        return driver.findElement(By.id("ui-id-4"));
    }
    public WebElement section3Btn() {
        return driver.findElement(By.id("ui-id-5"));
    }
    public WebElement section3Text() {
        return driver.findElement(By.xpath("//p[contains(text(), \"Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque purus in massa. Aenean in pede.\")]"));

    }
    public WebElement section3ListText() {
        return driver.findElement(By.xpath("//li[contains(text(), \"List item one\")]"));
    }
    public WebElement section4Btn(){
        return driver.findElement(By.id("ui-id-7"));
    }
    public WebElement section4FirstText() {
        return driver.findElement(By.xpath("//p[contains(text(), \"Cras dictum. Pellentesque habitant morbi tristique senectus\")]"));
    }
    public WebElement section4SecondText() {
        return driver.findElement(By.xpath("//p[contains(text(), \"Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus.\")]"));
    }
}
