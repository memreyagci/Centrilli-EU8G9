package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_CustomerPage {

    public CRM_CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a[data-menu='272'] span")
    public WebElement customersModule;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createOption;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerNameInput;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//p[.='Contact created']")
    public WebElement contactCreatedMessage;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listViewOption;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement listView;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanViewOption;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']")
    public WebElement kanbanView;

    @FindBy(xpath = "//div[.='The record has been modified, your changes will be discarded. Do you want to proceed?']")
    public WebElement warningMessage;

    @FindBy(xpath = "//*[@id=\"modal_319\"]/div/div/div[3]/button[1]/span")
    public WebElement okButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][1]" )
    public WebElement selectFirstResult;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement deleteButton;

    public boolean SearchedCustomer(String customerName) {

        try {
            Driver.getDriver().findElement(By.xpath("//span[.=\"" + customerName + "\"]"));
            return true;
        }catch (NoSuchElementException e){
            return false;

        }
    }


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]")
    public WebElement selectCustomer;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAddress;

    @FindBy(xpath = "//div[.='Are you sure you want to delete this record ?']")
    public WebElement confirmationMessage;
}

