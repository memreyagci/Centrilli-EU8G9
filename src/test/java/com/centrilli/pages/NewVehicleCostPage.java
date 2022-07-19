package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewVehicleCostPage {
    public NewVehicleCostPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "menu_more_container")
    public WebElement moreOptionDropdown;

    @FindBy(css = "a[data-menu='134']")
    public WebElement fleetOption;


    @FindBy(xpath = "//a/span[contains(text(),'Vehicle Costs')]" )        //(xpath = "//a/span[contains(text(),'Vehicle Costs')]")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[3]/a")
    public WebElement textVehicleCost;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@name='vehicle_id']/div/input")           //xpath = "//div[@name='vehicle_id']/div/input
    public WebElement vehicleDropdown;

    @FindBy(xpath = "//a[.='Audi/A3/-*-*']")
    public WebElement vehicleSelection;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//li[.='Audi/A3/-*-*']")
    public WebElement newVehicleCostTitle;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement errorMessage;


}




















