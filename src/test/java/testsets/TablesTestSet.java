package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class TablesTestSet {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/#";
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void form() {
        WebElement table = driver.findElement(By.className("table"));
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        int rows_count = rows_table.size();
        System.out.println(rows_count);

        //Get number of rows In table.
        int Row_count = driver.findElements(By.tagName("tr")).size();
        System.out.println("Number Of Rows = "+Row_count);

        //Get number of columns In table.
        int Col_count = driver.findElements(By.tagName("th")).size();
        System.out.println("Number Of Columns = "+Col_count);

        System.out.println(table.getText());
        if (table.getText() == "Switzerland"){
            System.out.println(table.getText());
        }
        //DOKONCZYC
        }
    }

