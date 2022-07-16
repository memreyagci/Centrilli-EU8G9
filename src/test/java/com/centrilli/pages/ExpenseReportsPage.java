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
    public WebElement btnExpenseReports;

    @FindBy(xpath = "//button[contains(text(), 'Create')]")
    public WebElement btnCreate;

    @FindBy(xpath = "//button[contains(text(), 'Save')]")
    public WebElement btnSave;

    @FindBy(xpath = "//input[@placeholder='e.g. Trip to NY']")
    public WebElement inputExpenseReportSummary;

    @FindBy(xpath = "//div[@name='employee_id']//input")
    public WebElement dropdownInputEmployee;

    @FindBy(xpath = "//p[text()='Expense Report created']")
    public WebElement textExpenseReportCreated;

    @FindBy(xpath = "//li[@class='ui-menu-item'][1]")
    public WebElement dropdownItemFirstEmployee;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    private WebElement divErrMsgTitle;

    @FindBy(xpath = "//div[@class='o_notification_content']/ul/li[1]")
    private WebElement liItemInvalidField;


    public String getErrMsg() {
        return divErrMsgTitle.getText().trim() + " " + liItemInvalidField.getText().trim();
    }

}
