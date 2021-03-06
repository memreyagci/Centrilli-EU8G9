package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class PointOfSalePage {

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h1/input[@name='name']")
    public WebElement inputBox;

    @FindBy (xpath = "//tr[@class='o_data_row']//td[2]")
    public List<WebElement> operationTypes;

    @FindBy (xpath = "//div[@class='content-group mt16']/div/div/input")
    public WebElement operationTypeBox;

    @FindBy (xpath = "//li/a[.='Search More...']")
    public WebElement searchMore;

    @FindBy (xpath = "//h1/span")
    public WebElement actualPointOfSale;

    @FindBy (xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy (xpath = "//div/button[contains(text(), 'Discard')]")
    public WebElement discardButton;

    @FindBy (xpath = "//button/span[.='Ok']")
    public WebElement warningMessageConfirmation;

    @FindBy (xpath = "//div[@class='o_control_panel']//li[@class='active']")
    public WebElement mainPageHeader;

    @FindBy (xpath = "//a[@name='picking_type_id']")
    public WebElement actualOperationType;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy (xpath = "(//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement pointOfSale;

    public void selectOperationType(String operationType){
        try {
            for (WebElement eachType : operationTypes) {
                if (eachType.getText().equals(operationType)) {
                    eachType.click();
                }
            }
        }catch (RuntimeException e){
            e.getStackTrace();
        }

    }


}
