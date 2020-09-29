package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Dragable;

public class DragableTestSet {
    private WebDriver driver;
    Actions moveElement;
    Dragable dragable;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/draggable.php";
        driver.get(baseUrl);
        moveElement = new Actions(driver);
        dragable = new Dragable(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }

    @Test(priority = 1)
    public void dragableTest() throws InterruptedException {

        WebElement sourceElement = driver.findElement(By.id("draggable"));

        moveElement.dragAndDropBy(dragable.sourceElement(), 1157, -200).build().perform();
        Thread.sleep(1000);

        moveElement.dragAndDropBy(dragable.sourceElement(),0,600).build().perform();
        Thread.sleep(1000);

        moveElement.dragAndDropBy(dragable.sourceElement(),-700,-350).build().perform();
        Thread.sleep(1000);

        moveElement.dragAndDropBy(dragable.sourceElement(),-670,340).build().perform();
        Thread.sleep(1000);
    }
}
