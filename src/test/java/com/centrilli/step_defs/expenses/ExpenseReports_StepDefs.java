package com.centrilli.step_defs.expenses;

import com.centrilli.pages.expenses.ExpenseReportsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExpenseReports_StepDefs {
    ExpenseReportsPage expenseReportsPage = new ExpenseReportsPage();


    @When("user fills in Expense Report Summary field")
    public void user_fills_in_expense_report_summary_field() {
        expenseReportsPage.inputExpenseReportSummary.sendKeys("Test Summary Title");
    }

    @When("user selects an employee")
    public void user_selects_an_employee() {
        expenseReportsPage.dropdownInputEmployee.click();
        expenseReportsPage.dropdownItemFirstEmployee.click();
    }

    @Then("'Expense Report created' message appears")
    public void message_appears() {
        Assert.assertTrue(expenseReportsPage.textExpenseReportCreated.isDisplayed());
    }

    @Then("{string} {string} error message is displayed")
    public void error_message_is_displayed(String expectedErrMsgTitle, String expectedErrMsgContent) {
        String expectedErrMsg = expectedErrMsgTitle + " " + expectedErrMsgContent;
        Assert.assertEquals(expectedErrMsg, expenseReportsPage.getErrMsg());
    }

}
