package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Droppable;

public class DroppableTestSet {
    private WebDriver driver;
    Actions action;
    Droppable droppable;


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        action = new Actions(driver);
        droppable = new Droppable(driver);
        String baseUrl = "http://seleniumui.moderntester.pl/droppable.php";
        driver.get(baseUrl);

    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }
    @Test(priority = 1)
    public void droppableTest() {
        Action dragAndDrop = action.dragAndDrop(droppable.draggableElement(), droppable.droppElement()).build();
        dragAndDrop.perform();
        Assert.assertEquals(droppable.dropElementText().getText(), "Dropped!");
    }
}
