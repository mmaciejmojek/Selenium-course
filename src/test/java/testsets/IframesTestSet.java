package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Iframe;

public class IframesTestSet {
    private WebDriver driver;
    Iframe iframe;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/iframes.php";
        driver.get(baseUrl);
        iframe = new Iframe(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();

    }
    @Test(priority = 1)
    public void iFrameTest()   {


        driver.switchTo().frame("iframe1");

        iframe.firstNameIframe1().sendKeys("Maciek");
        iframe.surNameIframe1().sendKeys("Mojek");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframe2");
        iframe.loginIframe2().sendKeys("Test login");
        iframe.passwordIframe2().sendKeys("abcde");
        iframe.continentsIframe2().click();
        Select selectContinentsIframe2 = new Select(iframe.continentsIframe2());
        selectContinentsIframe2.selectByVisibleText("Europe");
        iframe.passwordIframe2().click();
        iframe.yearOfExperience1().click();


        driver.switchTo().defaultContent();
        iframe.basicDropDown().click();
    }
}
