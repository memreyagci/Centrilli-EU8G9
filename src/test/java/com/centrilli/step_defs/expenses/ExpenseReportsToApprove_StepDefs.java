package com.centrilli.step_defs.expenses;

import com.centrilli.pages.expenses.ExpenseReportsToApprovePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExpenseReportsToApprove_StepDefs {

    ExpenseReportsToApprovePage expenseReportsToApprovePage = new ExpenseReportsToApprovePage();

    @When("user edits an Expense Report")
    public void user_edits_an_expense_report() {
        expenseReportsToApprovePage.tdFirstExpenseReport.click();
        expenseReportsToApprovePage.clickButton("Edit");
    }

    @When("user adds items to Expense Lines")
    public void user_adds_items_to_expense_lines() {
        expenseReportsToApprovePage.btnAddAnItem.click();
        expenseReportsToApprovePage.checkboxSelectAllExpenseLines.click();
        expenseReportsToApprovePage.clickButton("Select");
    }

    @Then("{string} error message is displayed")
    public void error_message_is_displayed(String errMsg) {
        Assert.assertEquals(errMsg, expenseReportsToApprovePage.errMsgExpenseLinesOfAnotherEmployee.getText());
    }

}
