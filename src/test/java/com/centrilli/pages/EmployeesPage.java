package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeesPage extends BasePage {

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public WebElement getSearchedEmployee(String employeeName) {
        return Driver.getDriver().findElement(By.xpath("//span[.=\"" + employeeName + "\"]"));
    }

    public boolean isSearchedEmployeeFound(String employeeName) {
        WebElement searchedEmployee = getSearchedEmployee(employeeName);

        try {
            wait.until(ExpectedConditions.visibilityOf(searchedEmployee));
        } catch (TimeoutException t) {
            return false;
        }

        return true;
    }


    @FindBy(css = "[data-menu = '157']")
    public WebElement btnNavigationEmployees;

    @FindBy(css = "[data-view-type = 'kanban']")
    public WebElement btnSwitchKanbanView;

    @FindBy(css = "[data-view-type = 'list']")
    public WebElement btnSwitchListView;

    @FindBy(xpath = "//li[text()='New']")
    public WebElement textNewEmployee;

    @FindBy(xpath = "//div[contains(@class, 'o_kanban_view')]")
    public WebElement kanbanViewEmployees;

    @FindBy(xpath = "//table[contains(@class, 'o_list_view')]")
    public WebElement listViewEmployees;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement btnSave;

    @FindBy(xpath = "//p[text()='Employee created']")
    public WebElement textEmployeeCreated;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement inputSearchBox;

    @FindBy(xpath = "//div[@class='oe_title']/*/input[contains(@class, 'o_field_invalid')]")
    public WebElement inputNameWithInvalidHighlight;

}