package testsets;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.HighSite;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class HighSiteTestSet {

    private WebDriver driver;
    HighSite highSite;
    Actions actions;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/high-site.php";
        driver.get(baseUrl);
        highSite = new HighSite(driver);
        actions = new Actions(driver);
    }

    @AfterClass
    public void closeAll() {
        driver.quit();
    }

    @Test(priority = 1)
    public void highSiteTest() throws IOException {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,2000)");
        js.executeScript("arguments[0].scrollIntoView();", highSite.submitBtn());

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:/Users/mojek/IdeaProjects/screen.png"));
    }
}
