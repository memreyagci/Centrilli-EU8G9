package com.centrilli.step_defs.expenses;

import com.centrilli.pages.expenses.ExpenseReportsToApprovePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExpenseReportsToApprove_StepDefs {

    ExpenseReportsToApprovePage expenseReportsToApprovePage = new ExpenseReportsToApprovePage();

    @When("user clicks on an Expense Report")
    public void user_clicks_on_an_expense_report() {
        expenseReportsToApprovePage.tdFirstExpenseReport.click();
    }

    @When("user clicks Add an item button in Expense Lines")
    public void user_clicks_add_an_item_button_in_expense_lines() {
        expenseReportsToApprovePage.btnAddAnItem.click();
    }

    @When("user checks select all checkbox in Add: Expense Lines")
    public void user_checks_select_all_checkbox_in_add_expense_lines() {
        expenseReportsToApprovePage.checkboxSelectAllExpenseLines.click();
    }

    @Then("{string} error message is displayed")
    public void error_message_is_displayed(String errMsg) {
        Assert.assertEquals(errMsg, expenseReportsToApprovePage.errMsgExpenseLinesOfAnotherEmployee.getText());
    }

}
