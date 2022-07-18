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

    @FindBy(xpath = "//input[@class=\"o_input ui-autocomplete-input\"]")
    public WebElement repair_product2;

    @FindBy(xpath = "//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content\"]/li[2]/a")
    public WebElement repair_product;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save_button;

    @FindBy(xpath = "//div[@class='o_thread_message_content']//p[contains(text(), 'Repair Order created')]")
    public WebElement repair_saved_message;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discard_button;

    @FindBy(xpath = "//table[@class=\"o_list_view table table-condensed table-striped o_list_view_ungrouped\"]/tbody/tr/td[3]")
    public WebElement product_item;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm o_form_button_edit\"]")
    public WebElement edit_button_repair;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    public WebElement product_item_radio;

    @FindBy(xpath = "//html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement action_button;

    @FindBy(xpath = "//a[@data-index=\"1\"]")
    public WebElement delete_button;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]")
    public WebElement delete_ok_button;

}
