package testsets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Selectable;

public class SelectablesTestset {
    private WebDriver driver;
    Actions actions;
    Selectable selectable;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/selectable.php";
        driver.get(baseUrl);
        selectable = new Selectable(driver);
        actions = new Actions(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }

    @Test(priority = 1)
    public void selectableTest() {
        actions.keyDown(Keys.CONTROL).click(selectable.item1()).click(selectable.item3()).click(selectable.item4()).keyUp(Keys.CONTROL).build().perform();
        Assert.assertEquals(selectable.selectFeedback().getText(), "You've selected: #1 #3 #4.");
    }
}
