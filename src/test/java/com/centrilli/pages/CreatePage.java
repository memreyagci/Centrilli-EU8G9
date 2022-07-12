package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {



    public CreatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class=\"o_input_dropdown\"]//input")
    public WebElement modelDropdown;

    @FindBy(xpath = "//a[.=\"Create and Edit...\"]")
    public WebElement createAndEdit;

    @FindBy(xpath = "//input[@placeholder=\"e.g. Model S\"]")
    public WebElement vehicleNameAndModelBox;

    @FindBy(xpath = "//h2//div//div/input")
    public WebElement vehicleBrandBox;

    @FindBy(xpath = "//span[.=\"Save\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]//span[.=\"Create\"]")
    public WebElement createButtonInsideCreate;

    @FindBy(xpath = "//button[@class=\"close\"][1]")
    public WebElement close;

    @FindBy(xpath = "//h2/input")
    public WebElement licensePlateBox;

    @FindBy(xpath = "//a[@data-menu=\"139\"]/span")
    public WebElement vehicleOption;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement lasSaveButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBar;
    //    /html/body/div[1]/div[2]/div[1]/div[1]/div/input                      e para
    //   //div[@class='o_control_panel']//input[@class='o_searchview_input']    e dijarit


    @FindBy(css = "a[data-menu='146'] span")
    public WebElement oemenutextSpan;

    @FindBy(css = "a[data-menu='147']")
    public WebElement oemenuleafLink;


    @FindBy(xpath = "//div//strong[@class=\"o_kanban_record_title\"]")
    public WebElement newElementVerification;

    @FindBy(xpath = "//button[@accesskey=\"a\"]")
    public WebElement newVehicleConfirmation;

    @FindBy(css = "a[data-menu='147'] span")
    public WebElement oemenutextSpan2;
}
