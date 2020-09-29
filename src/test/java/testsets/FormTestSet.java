package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Form;

public class FormTestSet {
    private WebDriver driver;
    Form form;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/form.php";
        driver.get(baseUrl);
        form = new Form(driver);
    }
    @AfterClass
    public void closeAll() {
        driver.quit();

    }
    @Test(priority = 1)
    public void form() {
        form.basicDropDown().click();

        form.dropItemForm().click();

        form.inputFirstName().sendKeys("Maciek");
        form.inputLastName().sendKeys("Mojek");
        form.imputEmail().sendKeys("abcd@wp.pl");

        form.maleRadioBtn().click();

        form.inputAge().sendKeys("29");

        form.experienceRadioBtn().click();
        form.automationTesterCheckBox().click();
        form.selectContinentsList().click();

        Select selectCountry = new Select(form.selectContinentsList());

        selectCountry.selectByVisibleText("Europe");

        form.selectContinentsList().click();
        form.seleniumCommandsLis().click();
        form.waitCommandsList().click();

        form.browseBtn().sendKeys("C:\\Users\\mojek\\Desktop\\CV\\Bez\\4B214CE6.tmp");

        form.signInButton().click();

        Assert.assertEquals(form.signInButtonText().getText(), "Form send with success");
    }
}
