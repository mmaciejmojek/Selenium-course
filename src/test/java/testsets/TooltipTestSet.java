package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Tooltip;

public class TooltipTestSet {
    private WebDriver driver;
    Tooltip tooltip;
    String printTooltipText;


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/tooltip.php";
        driver.get(baseUrl);
        tooltip = new Tooltip(driver);

    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }
    @Test(priority = 1)
    public void tooltipTest() {

        printTooltipText = tooltip.tooltipMessage().getAttribute("title");
        System.out.println(printTooltipText);
    }
}
