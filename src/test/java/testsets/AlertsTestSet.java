package testsets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Alerts;

import java.util.concurrent.TimeUnit;


public class AlertsTestSet {
    private WebDriver driver;
    Alerts alerts;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/alerts.php";
        driver.get(baseUrl);
        alerts = new Alerts(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();
    }
    @Test (priority = 1)
    public void simpleAlertPopUp(){
        alerts.simpeAlertBtn().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(alerts.simpleAlertBtnText().getText(), "OK button pressed");
    }
    @Test (priority = 2)
    public void promptAlertBox()  {
        alerts.promptPopUpBtn().click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello Lord Vader! How are you today?");
        alert.accept();
        Assert.assertEquals(alerts.promptAlertBoxText().getText(), "Hello Lord Vader! How are you today?");
    }
    @Test (priority = 3)
    public void confirmAlertBox(){
        alerts.confirmAlertBoxBtn().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(alerts.getConfirmAlertBoxBtnText().getText(), "You pressed OK!");
        alerts.confirmAlertBoxBtn().click();
        alert.dismiss();
        Assert.assertEquals(alerts.getConfirmAlertBoxBtnText().getText(), "You pressed Cancel!");
    }
    @Test (priority = 4)
    public void delayedAlert() throws InterruptedException {
        alerts.delayedAlertBtn().click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(alerts.delayedAlertBtnText().getText(),"OK button pressed" );
    }
}
