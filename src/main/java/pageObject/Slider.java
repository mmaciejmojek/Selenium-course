package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slider {
    private WebDriver driver;

    public Slider(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement sliderItem() {
        return driver.findElement(By.xpath("//*[@id=\"custom-handle\"]"));
    }

    public WebElement slider50Percent() {
        return driver.findElement(By.xpath("//*[@id=\"custom-handle\"]"));
    }
    public WebElement moveSlider() {
        return driver.findElement(By.id("slider"));
    }
}
