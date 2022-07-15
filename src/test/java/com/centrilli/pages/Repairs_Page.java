package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Repairs_Page {
    public Repairs_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='oe_menu_leaf']//span[contains(text(), 'Repairs')]")
    public WebElement repair_button;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement create_button;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement list_button;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement list_grafic;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement Kanban_button;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_mobile o_kanban_ungrouped']")
    public WebElement kanban_grafic;

}
