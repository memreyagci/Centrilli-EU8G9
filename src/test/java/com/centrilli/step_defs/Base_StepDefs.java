package com.centrilli.step_defs;

import com.centrilli.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Base_StepDefs {
    BasePage basePage = new BasePage();

    @Given("user is in {string} module")
    public void user_is_in_module(String navBarBtnText) {
        basePage.clickNavBarBtn(navBarBtnText);
    }

    @When("user is in {string} submenu")
    public void user_is_in_subpage(String subMenuName) {
        basePage.clickSubMenuBtn(subMenuName);
    }

}
