package com.centrilli.step_defs;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.SalesPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.centrilli.pages.LoginPage;
import com.centrilli.pages.SalesPage;
import com.centrilli.utilities.Driver;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesDefinition {
    SalesPage sales = new SalesPage();
    LoginPage login = new LoginPage();
    @Given("user is on the home page and on customer option")
    public void userIsOnTheHomePageAndOnCustomerOption() throws InterruptedException {
        login.login();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(sales.Sales_button));
        sales.Sales_button.click();
        sales.Customer_button.click();
    }

    @When("User click's List button")
    public void userClickSListButton() {
        boolean sales_b = BrowserUtils.isClickable(sales.List_button);
        Assert.assertTrue(sales_b);
    }

    @And("User click's Kanban button")
    public void userClickSKanbanButton() {
        boolean sales_k = BrowserUtils.isClickable(sales.Kanban_Button);
        Assert.assertTrue(sales_k);
    }

    @Then("User click's Create button")
    public void userClickSCreateButton() {
        boolean sales_c = BrowserUtils.isClickable(sales.Create_button);
        Assert.assertTrue(sales_c);
    }

    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//

    @When("User clicks Create button")
    public void userClicksCreateButton() {
        sales.Create_button.click();
    }

    @And("User enter name")
    public void userEnterSName() {

        sales.Customer_name.sendKeys("FD_Sprint3");
    }

    @And("User enter address")
    public void userEnterSAddress() {
        sales.address_text.sendKeys("Warsaw");
    }

    @And("User click's save")
    public void userClickSSave() {
        sales.save_button.click();
    }

    @Then("User should see name and address on the title of the page")
    public void userShouldSeeNameAndAddressOnTheTitleOfThePage() throws InterruptedException {
        Thread.sleep(5000);
        String Excepted_Title = "FD_Sprint3 - Warsaw";
        String Actual_Title = Driver.getDriver().getTitle();
        Assert.assertEquals(Excepted_Title,Actual_Title);
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//


    @And("User enter created name on text")
    public void userEnterCreatedNameOnText() {
        sales.search_text.sendKeys("FD_sprint3"+Keys.ENTER);
    }
    @Then("User sees the searched value")
    public void userSeesTheSearchedValue() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(sales.search_value.isDisplayed());
    }


}
