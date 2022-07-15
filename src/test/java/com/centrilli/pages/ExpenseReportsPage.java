package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportsPage {

    public ExpenseReportsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='hr_expense.menu_hr_expense_sheet_my_reports']")
    WebElement btnExpenseReports;

    @FindBy(xpath = "//button[contains(text(), 'Create')]")
    WebElement btnCreate;

    @FindBy(xpath = "//input[@placeholder='e.g. Trip to NY']")
    WebElement inputExpenseReportSummary;

    @FindBy(xpath = "//div[@name='employee_id']//span[@class='o_dropdown_button']")
    WebElement dropdownBtnEmployee;

    @FindBy(xpath = "//p[text()='Expense Report created']")
    WebElement textExpenseReportCreated;

    @FindBy(xpath = "//li[@class='ui-menu-item'][1]")
    WebElement firstEmployeeItem;

}
