package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;


public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("project.url"));
        loginPage.inputEmailAddress.sendKeys(ConfigurationReader.getProperty("posmanager.email"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("posmanager.password"));
        loginPage.btnLogIn.click();

    }
}
