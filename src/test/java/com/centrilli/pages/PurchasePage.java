package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
    public PurchasePage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//div[@name='partner_id']//input")
    public WebElement vendorBox;




    @FindBy (xpath = "//label[.='Draft Bill']")
    public WebElement draftBillTitle;

    @FindBy (xpath = "//li[.='Vendor Bills']")
    public WebElement vendorBillsTitle;

    @FindBy (xpath = "//a[@name='partner_id']")
    public WebElement vendorName;


    }

