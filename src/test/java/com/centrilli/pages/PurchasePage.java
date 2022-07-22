package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
    public PurchasePage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//div[@name='partner_id']//input")
    public WebElement vendorBox;

    @FindBy(xpath = "//a[.='&*&*)_(, ayvkvw fohclc']")
    public WebElement vendorName;

    @FindBy (xpath = "//label[.='Draft Bill']")
    public WebElement draftBillTitle;

    @FindBy (xpath = "//li[.='Vendor Bills']")
    public WebElement vendorBillsTitle;

    @FindBy (xpath = "//a[@name='partner_id']")
    public WebElement newVendorName;

    @FindBy (xpath = "//button[contains(text(), 'Action')]")
    public WebElement actionsDropdown;

    @FindBy (xpath = "//a[contains(text(), 'Delete')]")
    public WebElement deleteButton;

    @FindBy (xpath = "//span[.='Ok']")
    public WebElement okButton;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement vendorCount;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement save;

    @FindBy (xpath = "//input[@name='reference']")
    public WebElement vendorReferance;


}