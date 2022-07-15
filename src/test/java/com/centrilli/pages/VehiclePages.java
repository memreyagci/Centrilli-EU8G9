package com.centrilli.pages;

import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePages {


    public VehiclePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "login")
    public WebElement emailInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[.='Log in']")
    public WebElement loginButton;


    @FindBy(id = "menu_more_container")
    public WebElement moreOptionDropdown;

    @FindBy (css = "a[data-menu='134']")
    public  WebElement fleetOptions;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[3]/li[1]/a/span")
    public  WebElement vehicleModule;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public  WebElement createButton;

    @FindBy (xpath = "//input[@placeholder=\"e.g. Model S\"]")
    public  WebElement inputModelName;

    @FindBy (xpath = "//div[@name='brand_id']/div/input")
    public  WebElement inputMakeName;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public  WebElement saveButton;


    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary'][1]")
    public  WebElement create2Button;

    @FindBy (xpath = "//li[.='Tesla/S']")
    public  WebElement headerDisplay;

    @FindBy (xpath = "//label[.='Make' and contains(@class, 'o_field_invalid')]")
    public WebElement fieldMake;

    @FindBy (xpath = "//div[@class='oe_title']/label[contains(@class, 'o_field_invalid')]")
    public  WebElement fieldModel;

    @FindBy (xpath = "//ul[contains(@class,'ui-autocomplete')]")
    public WebElement modulOptionMenu;


    public void login(){
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    }




