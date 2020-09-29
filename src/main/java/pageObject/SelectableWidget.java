package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SelectableWidget {
    private WebDriver driver;

    public SelectableWidget(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement speedSelect(){
        return driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[2]"));
    }

    public List<WebElement> speedSelectList(){
        return driver.findElements(By.id("speed-menu"));
    }
    public WebElement fileSelect() {
        return driver.findElement(By.id("files-button"));
    }
    public WebElement someUnknownFileText(){
        return driver.findElement(By.xpath("//div[contains(text(), \"Some unknown file\")]"));
    }
    public WebElement filesMenu(){
        return driver.findElement(By.id("files-menu"));
    }

    public  WebElement numberBtn(){
        return driver.findElement(By.id("number-button"));
    }
    public WebElement indexNumber8(){
        return driver.findElement(By.id("ui-id-17"));
    }
    public WebElement selectTitleBtn(){
        return driver.findElement(By.xpath("//*[@id=\"salutation-button\"]/span[2]"));
    }
    public List<WebElement> selectTitleList(){
        return driver.findElements(By.xpath("//*[@id=\"salutation-menu\"]"));
    }
}
