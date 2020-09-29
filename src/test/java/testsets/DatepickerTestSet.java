package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Datepicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatepickerTestSet {
    private WebDriver driver;
    Datepicker datepicker;




    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/datepicker.php";
        driver.get(baseUrl);
        datepicker = new Datepicker(driver);

    }

    @Test(priority = 1)
    public void datePick() throws InterruptedException {
        datepicker.dateBox().click();

/*        datepicker.dateBox().sendKeys("30/10/2018");
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "30/10/2018");

        datepicker.dateBox().clear();
        datepicker.dateBox().sendKeys("25/09/2018");
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "25/09/2018");

        datepicker.dateBox().clear();
        datepicker.dateBox().sendKeys("25/09/2018");
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "25/09/2018");
*/

        WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
        List <WebElement> rows = dateWidget.findElements(By.tagName("tr"));
        List <WebElement> columns = dateWidget.findElements(By.tagName("td"));
        WebElement date = driver.findElement(By.className("ui-datepicker-title"));
        WebElement month = driver.findElement(By.className("ui-datepicker-month"));

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span"));
        String abc;

        while (month.getText() == "June") {
            if (month.getText() == "June"){
            driver.findElement(By.linkText("11")).click();
        }else {

                btn.click();
            }
        }
/*
      for (int i = 0; i <= 12; i++) {
            if (month.getText() == "August") {
                Thread.sleep(3000);
                driver.findElement(By.linkText("11")).click();
            } else {
                Thread.sleep(3000);
                btn.click();
            }
        }
*/



/*        datepicker.dateBox().sendKeys("01/01/2018");
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "01/01/2018");

        datepicker.dateBox().clear();
        datepicker.dateBox().sendKeys("01/02/2018");
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "01/02/2018");

        datepicker.dateBox().clear();
        datepicker.dateBox().click();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        datepicker.dateBox().sendKeys(dateFormat.format(date));
        Assert.assertEquals(datepicker.dateBox().getAttribute("value"), "08/09/2020");
*/
        // Poprawic. Daty powinny byc wybierane w rozny sosob

}
}
