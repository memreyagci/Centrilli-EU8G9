package com.centrilli.step_defs.expenses;

import com.centrilli.pages.expenses.ExpenseReportsPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpenseReports_StepDefs {
    ExpenseReportsPage expenseReportsPage = new ExpenseReportsPage();


    @When("user creates an employee by filling in {string}")
    public void user_creates_an_employee_by_filling_in(String fieldName) {
        expenseReportsPage.clickButton("Create");

        if(fieldName.equalsIgnoreCase("Employee")) {
            expenseReportsPage.dropdownInputEmployee.click();
            expenseReportsPage.dropdownItemFirstEmployee.click();
        } else if(fieldName.equalsIgnoreCase("Expense Report Summary")) {
            expenseReportsPage.inputExpenseReportSummary.sendKeys("Test Summary Title");
        }

        expenseReportsPage.clickButton("Save");
    }

    @When("user creates an Expense Report")
    public void user_creates_an_expense_report() {
        expenseReportsPage.clickButton("Create");
        expenseReportsPage.inputExpenseReportSummary.sendKeys("Test Summary Title");
        expenseReportsPage.dropdownInputEmployee.click();
        expenseReportsPage.dropdownItemFirstEmployee.click();
        expenseReportsPage.clickButton("Save");
    }

    @Then("'Expense Report created' message appears")
    public void message_appears() {
        Assert.assertTrue(expenseReportsPage.textExpenseReportCreated.isDisplayed());
    }

    @Then("{string} {string} error message is displayed")
    public void error_message_is_displayed(String expectedErrMsgTitle, String expectedErrMsgContent) {
        String expectedErrMsg = expectedErrMsgTitle + " " + expectedErrMsgContent;

        new WebDriverWait(Driver.getDriver(), 30)
                .until(ExpectedConditions.visibilityOf(expenseReportsPage.divErrMsgTitle));
        Assert.assertEquals(expectedErrMsg, expenseReportsPage.getErrMsg());
    }

}
