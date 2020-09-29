package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Menu;

import java.util.concurrent.TimeUnit;

public class MenuTestSet {
    private WebDriver driver;
    Actions actions;
    Menu menu;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/menu-item.php";
        driver.get(baseUrl);
        menu = new Menu(driver);
        actions = new Actions(driver);


    }
    @AfterClass
    public void closeAll() {
    driver.quit();

    }

    @Test(priority = 1)
    public void MenuTest()   {
        menu.menuMusic().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        menu.menuJazz().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        menu.menuModern().click();
    }
}
