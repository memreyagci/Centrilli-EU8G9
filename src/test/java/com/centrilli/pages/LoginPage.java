package com.centrilli.pages;

import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("project.url"));
        inputEmailAddress.sendKeys(ConfigurationReader.getProperty("posmanager.email"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("posmanager.password"));
        btnLogIn.click();

        // Needed to wait for Inbox page to load after login, otherwise it directs to it later on, thus doesn't end up on desired page
        wait.until(ExpectedConditions.titleContains("#Inbox"));
    }

    public void login(String user) throws Exception {
        if (user.equalsIgnoreCase("posmanager") || user.equalsIgnoreCase("salesmanager")) {
            Driver.getDriver().get(ConfigurationReader.getProperty("project.url"));

            inputEmailAddress.sendKeys(ConfigurationReader.getProperty(user + ".email"));
            inputPassword.sendKeys(ConfigurationReader.getProperty(user + ".password"));
            btnLogIn.click();

            // Needed to wait for Inbox page to load after login, otherwise it directs to it later on, thus doesn't end up on desired page
            wait.until(ExpectedConditions.titleContains("#Inbox"));
        } else {
            throw new Exception("Invalid centrilli user: " + user);
        }
    }



    @FindBy(id = "login")
    public WebElement inputEmailAddress;

    @FindBy(id = "password")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement btnLogIn;

    @FindBy(css = ".btn-link")
    public WebElement btnResetPassword;

}
