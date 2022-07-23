package com.centrilli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingProductPage extends BasePage{

    @FindBy(xpath = "//a[@data-menu='514']")
    public WebElement incomingProduct;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    public WebElement btnCreateIncomingProduct;

    @FindBy(xpath = "//div[@name='location_id']/div/input")
    public WebElement dropDownSourceLocation;

    @FindBy(xpath = "//a[.='Partner Locations/Customers']")
    public WebElement partnerLocationsCustomers;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/table[1]/tbody/tr[3]/td[2]/div/div") //div[@class='o_input_dropdown']/input[@id='o_field_input_715']
    public WebElement dropDownDestinationLocation;
    //*[@id="ui-id-58"]/a
    @FindBy(xpath = "//ul[2]//a[.='Partner Locations/Customers/European Customers']") //li[@id='ui-id-26']
    public WebElement partnerLocationsCustomersEuropeanCustomers;

    @FindBy(xpath = "//table[2]//div[@name='product_id']//input")
    public WebElement dropDownProduct;

    @FindBy(xpath = "//li/a[.='[2875] test']")
    public WebElement testProduct;

    @FindBy(xpath = "//div/button[contains(text(), 'Save')]")
    public WebElement saveBtnIncoming;

    @FindBy(xpath = "//ol/li[.='2875: Customers>European Customers']")
    public WebElement createdProductVerification;

    @FindBy(xpath = "//div/button[contains(text(), 'Discard')]")
    public WebElement discardBtnIncoming;

    @FindBy(xpath = "//button[contains(@aria-label, 'kanban')]")
    public WebElement kanbanBtnIncoming;

    @FindBy(xpath = "//button[contains(@aria-label, 'list')]")
    public WebElement listBtnIncoming;

    @FindBy(xpath = "//ol//li[.='Incoming  Products']")
    public WebElement incomingProductVerification;

    @FindBy(xpath = "(//div/button[@data-toggle='dropdown'])[3]")
    public WebElement actionbtnIncoming;

    @FindBy(xpath = "//ul/li/a[@data-section='other']")
    public WebElement deletebtnIncoming;

















}
