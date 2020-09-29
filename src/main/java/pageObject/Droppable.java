package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Droppable {
    private WebDriver driver;

    public Droppable(WebDriver driver) {
        this.driver = driver;
    }
        public WebElement draggableElement(){
            return driver.findElement(By.id("draggable"));
        }
        public WebElement droppElement() {
            return driver.findElement(By.id("droppable"));
        }
        public WebElement dropElementText() {
            return driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        }





}
