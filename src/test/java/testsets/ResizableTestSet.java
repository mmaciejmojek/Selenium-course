package testsets;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResizableTestSet {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/#";
        driver.get(baseUrl);
        Dimension dimension = new Dimension(500, 500);
        driver.manage().window().setSize(dimension);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();

    }
    @Test(priority = 1)
    public void resizableTest() {
        Dimension resizeRight = new Dimension(510, 500);
        driver.manage().window().setSize(resizeRight);

        Dimension resizeBottom = new Dimension(510, 510);
        driver.manage().window().setSize(resizeBottom);

        Dimension resizeRightBottom = new Dimension(520, 520);
        driver.manage().window().setSize(resizeRightBottom);


    }
}
