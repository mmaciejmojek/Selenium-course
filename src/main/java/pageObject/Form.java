package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form {
    private WebDriver driver;

    public Form(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement basicDropDown(){
        return driver.findElement(By.xpath("//a[@class=\"nav-link dropdown-toggle\"]"));
    }
    public WebElement dropItemForm(){
        return driver.findElement(By.id("form-item"));
    }
    public WebElement inputFirstName() {
        return driver.findElement(By.id("inputFirstName3"));
    }
    public WebElement inputLastName(){
        return driver.findElement(By.id("inputLastName3"));
    }
    public WebElement imputEmail() {
        return driver.findElement(By.id("inputEmail3"));
    }
    public WebElement maleRadioBtn() {
        return driver.findElement(By.id("gridRadiosMale"));
    }
    public WebElement inputAge() {
        return driver.findElement(By.id("inputAge3"));
    }
    public WebElement experienceRadioBtn() {
        return driver.findElement(By.id("gridRadios3"));
    }
    public WebElement automationTesterCheckBox() {
        return driver.findElement(By.id("gridCheckAutomationTester"));
    }
    public WebElement selectContinentsList() {
        return driver.findElement(By.id("selectContinents"));
    }
    public WebElement seleniumCommandsLis() {
        return driver.findElement(By.xpath("//option[@value=\"switch-commands\"]"));
    }
    public WebElement waitCommandsList() {
        return driver.findElement(By.xpath("//option[@value=\"wait-commands\"]"));
    }
    public WebElement browseBtn() {
        return driver.findElement(By.xpath("//input[@class=\"custom-file-input\"]"));
    }
    public WebElement signInButton() {
        return driver.findElement(By.xpath("//div/button[@class=\"btn btn-primary\"]"));
    }
    public WebElement signInButtonText() {
        return driver.findElement(By.id("validator-message"));
    }
}
