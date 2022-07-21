package com.centrilli.step_defs;

import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewContact_StepDefs {



    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User is logged in as PosManager")
    public void userIsLoggedInAsPosManager() {

    }

    @And("User is in {string} module")
    public void userIsInModule(String arg0) {

    }



}
