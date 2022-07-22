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

    @FindBy(xpath = "//button[@aria-label='kanban'] ")
    public WebElement kanbanButton;

    @FindBy (xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(css=".o_form_button_cancel")
    public WebElement discardButton;

    @FindBy(xpath = "//button/span[.='Ok']")
    public WebElement warningMessageConfirmation;

    @FindBy(xpath = "(//td[.='New'])[1]")
    public WebElement note;

    @FindBy(xpath = "//div/button[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement textBox;

    @FindBy(xpath = "//div[@class='o_readonly']/p")
    public WebElement textMessage;

    @FindBy(xpath = "//button[contains(text(), 'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//a[contains(text(), 'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement okButton;








}
