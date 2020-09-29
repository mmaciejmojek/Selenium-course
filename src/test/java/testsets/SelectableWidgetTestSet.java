package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.SelectableWidget;
import java.util.Random;


public class SelectableWidgetTestSet {
    private WebDriver driver;
    SelectableWidget selectableWidget;
    Actions actions;
    int speedListSize;
    int randomSpeed;
    int titleListSize;
    int randomTitle;



    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/selectmenu.php";
        driver.get(baseUrl);
        selectableWidget = new SelectableWidget(driver);
        actions = new Actions(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }

    @Test(priority = 1)
    public void selectableWidget() {


        selectableWidget.speedSelect().click();
        speedListSize = selectableWidget.speedSelectList().size();

        Random random = new Random();
        randomSpeed = random.nextInt(speedListSize);
        selectableWidget.speedSelectList().get(randomSpeed).click();

        selectableWidget.fileSelect().click();
        selectableWidget.someUnknownFileText().click();

        selectableWidget.numberBtn().click();
        selectableWidget.indexNumber8().click();

        selectableWidget.selectTitleBtn().click();
        titleListSize = selectableWidget.selectTitleList().size();
        randomTitle = random.nextInt(titleListSize);
        selectableWidget.selectTitleList().get(randomTitle).click();

        //Nie do konca dobrze
    }
}


