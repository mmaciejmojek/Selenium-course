package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.ModalDialog;
import pageObject.Progressbar;

public class ProgressbarTestSet {

    private WebDriver driver;
    ModalDialog modalDialog;
    Progressbar progressbar;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/progressbar.php";
        driver.get(baseUrl);
        modalDialog = new ModalDialog(driver);
        progressbar = new Progressbar(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }

    @Test(priority = 1)
    public void progressbarTestSet() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.className("progress-label"), "Complete!"));
    }
}
