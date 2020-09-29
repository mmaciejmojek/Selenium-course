package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autocomplete {
    private WebDriver driver;

    public Autocomplete (WebDriver driver) {
        this.driver = driver;
    }
    public WebElement searchBox(){
        return driver.findElement(By.className("ui-autocomplete-input"));
    }
    public WebElement autocompleteOptions(){
        return driver.findElement(By.id("ui-id-1"));
    }
    public WebElement selectTextFromAutocomplete(){
        return driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[3]"));
    }
}

