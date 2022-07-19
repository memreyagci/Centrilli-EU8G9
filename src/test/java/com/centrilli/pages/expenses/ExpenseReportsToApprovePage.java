package com.centrilli.pages.expenses;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportsToApprovePage {

    public ExpenseReportsToApprovePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement tdFirstExpenseReport;

    @FindBy(xpath = "//button[normalize-space()= 'Edit']")
    public WebElement btnEdit;

    @FindBy(xpath = "//a[normalize-space()= 'Add an item']")
    public WebElement btnAddAnItem;

    @FindBy(xpath = "//table/thead/tr//input[@type='checkbox']")
    public WebElement checkboxSelectAllExpenseLines;

    @FindBy(xpath = "//button[normalize-space()='Select']")
    public WebElement btnSelect;

    @FindBy(xpath = "//button[normalize-space()='Approve']")
    public WebElement btnApprove;

    @FindBy(xpath = "//div[normalize-space()='You cannot add expense lines of another employee.']")
    public WebElement errMsgExpenseLinesOfAnotherEmployee;

}
