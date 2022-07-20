package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("User is logged in")
    public void user_is_logged_in() {
        loginPage.login();
    }

    @When("user is logged in as {string}")
    public void user_is_logged_in_as(String user) throws Exception {
        loginPage.login(user);
    }

}
