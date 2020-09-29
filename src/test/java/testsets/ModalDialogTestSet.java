package testsets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.ModalDialog;

public class ModalDialogTestSet {

    private WebDriver driver;
    ModalDialog modalDialog;


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mojek\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        String baseUrl = "http://seleniumui.moderntester.pl/modal-dialog.php";
        driver.get(baseUrl);
        modalDialog = new ModalDialog(driver);
    }
        @AfterClass
        public void closeAll() {
            driver.quit();
    }

    @Test(priority = 1)
    public void modalDialogTest() {
        modalDialog.createNewUserBtn().click();

        modalDialog.nameField().clear();
        modalDialog.nameField().sendKeys("Maciek");

        modalDialog.emailField().clear();
        modalDialog.emailField().sendKeys("123@abc.pl");

        modalDialog.passwordField().clear();
        modalDialog.passwordField().sendKeys("abcdefgh");

        modalDialog.createAnAccountBtn().click();

        Assert.assertEquals(modalDialog.existingUsersTableName().getText(),"Maciek" );
        Assert.assertEquals(modalDialog.existingUsersTableEmail().getText(), "123@abc.pl");
        Assert.assertEquals(modalDialog.existingUsersTablePassword().getText(), "abcdefgh");
    }
}