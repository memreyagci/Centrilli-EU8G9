package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleFuelLogsPage {

    public VehicleFuelLogsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "menu_more_container")
    public WebElement dropDownMore;

    @FindBy(xpath = "//a[@data-menu=134]")
    public WebElement fleetModule;

    @FindBy(xpath = "//a[@data-menu=147]")
    public WebElement vehiclesFuelLogsOption;

   //@FindBy(xpath = "//button[@accesskey='c']")
    @FindBy(css = ".o_list_button_add")
    public WebElement btnCreate;
    @FindBy(xpath = "//div[@name='vehicle_id']/div/input")
    public WebElement dropDownVehicle;

    @FindBy(xpath = "//a[.='Audi/A3/-*-*']")
    public WebElement selectedVehicle;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement btnSave;

    @FindBy(xpath = "//a[@name='vehicle_id']")
    public WebElement createdVehicleText;

    @FindBy(xpath = "//div[contains(@class, 'o_notification_manager')]")
    public WebElement errorMessage;












}
