package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.WindowsTabs;

public class WindowsTabsTestSet {
    private WebDriver driver;
    WindowsTabs windowsTabs;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/#";
        driver.get(baseUrl);
        windowsTabs = new WindowsTabs(driver);
    }
    @Test(priority = 2)
    public void windowsTabsTest(){

        windowsTabs.getBasicDropDown().click();

        windowsTabs.windowsTabBtn().click();

        windowsTabs.newBrowserWindowBtn().click();
    }///Dokonczyc po skoceniu test z tabela
}
