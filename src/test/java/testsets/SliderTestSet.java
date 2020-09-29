package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Slider;

import java.util.concurrent.TimeUnit;

public class SliderTestSet {
    private WebDriver driver;
    Slider slider;
    Actions actions;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/slider.php";
        driver.get(baseUrl);
        slider = new Slider(driver);
        actions = new Actions(driver);
    }
        @AfterClass
        public void closeAll() {
        driver.quit();
    }
    @Test(priority = 1)
    public void selectableWidget() {
        actions.dragAndDropBy(slider.moveSlider(), 5    , 0).build().perform();
        Assert.assertEquals(slider.moveSlider().getText(), "50");
        actions.dragAndDropBy(slider.moveSlider(), 315    , 0).build().perform();
        Assert.assertEquals(slider.moveSlider().getText(), "80");
        actions.dragAndDropBy(slider.moveSlider(), 330    , 0).build().perform();
        Assert.assertEquals(slider.moveSlider().getText(), "80");
        actions.dragAndDropBy(slider.moveSlider(), -330    , 0).build().perform();
        Assert.assertEquals(slider.moveSlider().getText(), "20");
        actions.dragAndDropBy(slider.moveSlider(), -550    , 0).build().perform();
        Assert.assertEquals(slider.moveSlider().getText(), "0");
    }
}