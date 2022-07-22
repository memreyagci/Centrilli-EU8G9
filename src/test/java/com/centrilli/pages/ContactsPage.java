package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {


    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div/button[@accesskey=\"c\"]")
    public WebElement createButton;


    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement enterName;

    @FindBy(xpath = "//div[@class=\"o_cp_buttons\"]/div/button[@accesskey=\"c\"]")
    public WebElement createContactbutton;

    @FindBy(xpath = "//td/input[@name=\"name\"]")
    public WebElement enterName2;

    @FindBy(xpath = "//div[@class=\"modal-footer\"]/button[.=\"Save  & Close\"]")
    public WebElement saveNcloseButton;

    @FindBy(xpath = "//div[@class=\"o_form_buttons_edit\"]/button[@class=\"btn btn-primary btn-sm o_form_button_save\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-default o_form_button_cancel\"]/span[.=\"Discard\"]")
    public WebElement discardButton;


    @FindBy(xpath = "//div/div[@class=\"o_kanban_view o_res_partner_kanban o_kanban_ungrouped\"]")
    public WebElement kanbanVerification;

    @FindBy(xpath = "//button[@accesskey=\"l\"]")
    public WebElement listViewButton;

    @FindBy(xpath = "//button[@accesskey=\"k\"]")
    public WebElement kanbanButton;

    @FindBy(xpath = "//table/thead/tr/th[@class=\"o_column_sortable\" and .=\"Name\"]")
    public WebElement listViewVerification;


    @FindBy(xpath = "//div[@class=\"o_form_buttons_edit\"]/button[@accesskey=\"j\"]")
    public WebElement discardButton2;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]/span")
    public WebElement okButton;

    @FindBy(xpath = "//div[@class=\"o_cp_searchview\"]/div[@class=\"o_searchview\"]")
    public WebElement searchBar;


    @FindBy(xpath = "//div/div[@class=\"o_kanban_view o_res_partner_kanban o_kanban_ungrouped\"]/div")
    public WebElement oldContact;

    @FindBy(xpath = "//div[@class=\"o_form_buttons_view\"]/button[@accesskey=\"a\"]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class=\"btn-group o_dropdown\"][3]/button")
    public WebElement actionButton;

    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//a[@data-index=\"0\" and @ data-section=\"other\"]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class=\"modal-footer\"]/button[@class=\"btn btn-sm btn-primary\"]")
    public WebElement confirmDeletion;

}
