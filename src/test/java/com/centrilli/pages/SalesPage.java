package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {


    public SalesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[contains(text(), 'Sales')]")
    public WebElement Sales_button;
    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement Customer_button;
    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement List_button;
    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement Kanban_Button;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement Create_button;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement Customer_name;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement save_button;
    @FindBy(name="street")
    public WebElement address_text;
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement search_text;
    @FindBy(xpath = "//div[@modifiers='{}']")
    public WebElement search_value;





}