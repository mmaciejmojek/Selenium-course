package testsets;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Accordion;
import java.util.concurrent.TimeUnit;

public class AccordionTestSet {
    private WebDriver driver;
    Accordion accordion;
    Actions actions;


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/accordion.php";
        driver.get(baseUrl);
        accordion = new Accordion(driver);
        actions = new Actions(driver);

    }
    @AfterClass


    @Test(priority = 1)
    public void AccordinTest()  {
        System.out.println(accordion.section1Text().getText());

        actions.click(accordion.section2Btn()).build().perform();
        System.out.println(accordion.section2Text().getText());

        actions.click(accordion.section3Btn()).build().perform();
        System.out.println(accordion.section3Text().getText());
        System.out.println(accordion.section3ListText().getText());

        actions.click(accordion.section4Btn()).build().perform();
        System.out.println(accordion.section4FirstText().getText());
        System.out.println(accordion.section4SecondText().getText());
/*
        accordion.section2Btn().click();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        System.out.println(accordion.section2Text().getText());

        accordion.section3Btn().click();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        System.out.println(accordion.section3Text().getText());
        System.out.println(accordion.section3ListText().getText());

        accordion.section4Btn().click();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        System.out.println(accordion.section4FirstText().getText());
        System.out.println(accordion.section4SecondText().getText());
*/
        // nie dziala, poprawic
    }
}
