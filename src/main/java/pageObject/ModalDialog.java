package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalDialog {
    private WebDriver driver;

    public ModalDialog(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement createNewUserBtn() {
        return driver.findElement(By.id("create-user"));
    }
    public WebElement nameField(){
        return driver.findElement(By.xpath("//*[@id=\"name\"]"));
    }
    public WebElement emailField(){
        return driver.findElement(By.xpath("//*[@id=\"email\"]"));
    }
    public WebElement passwordField(){
        return driver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public WebElement createAnAccountBtn(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/button[1]"));
    }
    public WebElement existingUsersTable(){
        return driver.findElement(By.xpath("//*[@id=\"users\"]/tbody"));
    }
    public WebElement existingUsersTableName(){
        return driver.findElement(By.xpath("//*[@id=\"users\"]/tbody/tr[2]/td[1]"));
    }
    public WebElement existingUsersTableEmail(){
        return driver.findElement(By.xpath("//*[@id=\"users\"]/tbody/tr[2]/td[2]"));
    }
    public WebElement existingUsersTablePassword(){
        return driver.findElement(By.xpath("//*[@id=\"users\"]/tbody/tr[2]/td[3]"));
    }
}

