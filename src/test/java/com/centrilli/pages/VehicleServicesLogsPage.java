package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServicesLogsPage {

    public VehicleServicesLogsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "menu_more_container")
    public WebElement moreOptionDropdown;

    @FindBy(css = "a[data-menu='134']")
    public WebElement fleetOption;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[6]/a" )
    public WebElement vehicleServicesLogs;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement textVehicleServicesLogs;

    @FindBy(css = ".o_list_button_add")
    public WebElement createButton;

    @FindBy(xpath = "//div[@name='vehicle_id']/div/input")
    public WebElement vehicleDropdown;

    @FindBy(xpath = "//a[.='Audi/A1/']")
    public WebElement vehicleSelection;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[2]")
    public WebElement verificationText;

    @FindBy(xpath = "//div[@name='vehicle_id' and contains(@class, 'o_field_invalid')]")
    public WebElement inputNameWithInvalidHighlight;







    
    
}
