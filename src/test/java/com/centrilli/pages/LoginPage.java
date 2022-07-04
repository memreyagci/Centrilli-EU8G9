package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "login")
    public WebElement inputEmailAddress;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(css = ".btn-primary")
    public WebElement buttonLogin;

    @FindBy(css = ".btn-link")
    public WebElement resetPassword;
}
