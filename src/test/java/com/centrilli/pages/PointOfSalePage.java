package com.centrilli.pages;

import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PointOfSalePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@href='/web#menu_id=496&action=676']")
    public WebElement pointOfSale;

    @FindBy (xpath = "//div/button[contains(text(), 'Create')]")
    public WebElement createButton;

    @FindBy (xpath = "//h1/input[@name='name']")
    public WebElement inputBox;

    @FindBy (xpath = "//tr[@class='o_data_row']//td[2]")
    public List<WebElement> operationTypes;

    @FindBy (xpath = "//div[@class='content-group mt16']/div/div/input")
    public WebElement operationTypeBox;

    @FindBy (xpath = "//li/a[.='Search More...']")
    public WebElement searchMore;

    @FindBy (xpath = "//div/button[contains(text(), 'Save')]")
    public WebElement saveButton;

    @FindBy (xpath = "//h1/span")
    public WebElement actualPointOfSale;

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
