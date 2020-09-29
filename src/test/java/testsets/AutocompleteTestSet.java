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
import pageObject.Autocomplete;

import java.util.List;

public class AutocompleteTestSet {
    private WebDriver driver;
    Autocomplete autocomplete;

    String availableAutocompeteOptions;


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/autocomplete.php";
        driver.get(baseUrl);
        autocomplete = new Autocomplete(driver);

    }
    @AfterClass
    public void closeAll() {
    driver.quit();

    }

    @Test(priority = 1)
    public void autocompleteTest() {
        autocomplete.searchBox().sendKeys("a");
        availableAutocompeteOptions = autocomplete.autocompleteOptions().getText();
        System.out.println(availableAutocompeteOptions);

        autocomplete.selectTextFromAutocomplete().click();

        Assert.assertEquals(autocomplete.searchBox().getAttribute("value"), "antal");
    }
}


