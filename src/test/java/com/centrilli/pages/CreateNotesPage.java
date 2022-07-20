package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNotesPage {

    public CreateNotesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a/span[contains(text(),'Notes')]")
    public WebElement notesButton;

    @FindBy(xpath = "//div/button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath="//div[@class='o_input_dropdown']/input")
    public WebElement moreOptionDropdown;

    @FindBy(xpath="//a[.='JDBC']")
    public WebElement tagsOptions;

    @FindBy(css = ".o_form_button_save")
    public WebElement saveButton;

    @FindBy(xpath = "//p[text()='Note created']")
    public WebElement elementP;

   /* @FindBy( " ")
    public WebElement

    @FindBy("")
    public WebElement

    @FindBy("")
    public WebElement

    */



}
