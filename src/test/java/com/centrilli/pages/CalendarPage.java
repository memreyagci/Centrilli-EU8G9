package com.centrilli.pages;

import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CalendarPage extends BasePage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekButton;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//div[@class='form-group']//input[@class='o_input']")
    public WebElement summaryInput;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//button/span[.='Edit']")
    public WebElement editButton;

    @FindBy(id = "o_field_input_43")
    public WebElement meetingSubject;

    @FindBy(id = "o_field_input_54")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@name='start_datetime']")
    public WebElement startingDateInput;

    @FindBy(xpath = "//input[@name='duration']")
    public WebElement duration;

    @FindBy(xpath = "//button/span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button/span[.='Ok']")
    public WebElement confirmation;

    @FindBy(xpath = "//td[4]//div[@class='o_field_name o_field_type_char']")
    public WebElement existingEvent;

    public void verifyDayClicked(WebElement day) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(day, "Day"))) {
            System.out.println("User is on daily display");
            Assert.assertTrue(dayButton.isDisplayed());
        } else {
            throw new RuntimeException("User is not on daily calendar display");
        }
    }

    public void verifyWeekClicked(WebElement week) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(week, "Week"))) {
            System.out.println("User is on weekly display");
            Assert.assertTrue(weekButton.isDisplayed());
        } else {
            throw new RuntimeException("User is not on weekly calendar display");
        }
    }

    public void verifyMonthClicked(WebElement month) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(month, "Month"))) {
            System.out.println("User is on monthly display");
            Assert.assertTrue(monthButton.isDisplayed());
        } else {
            throw new RuntimeException("User is not on monthly calendar display");
        }
    }

    public void selectDate(String day){

        try{
            WebElement timeBox = Driver.getDriver().findElement(By.xpath("//tbody/tr/td[@data-date='" + day + "']"));
            BrowserUtils.sleep(2);
            timeBox.click();
        }catch (Exception e){
            existingEvent.click();
            deleteButton.click();
            confirmation.click();
            WebElement timeBox = Driver.getDriver().findElement(By.xpath("//tbody/tr/td[@data-date='" + day + "']"));
            BrowserUtils.sleep(2);
            timeBox.click();
        }

    }

    public void verifyEventCreated(String day){
        WebElement timeBox = Driver.getDriver().findElement(By.xpath("//table/tbody/tr/td[@data-date='"+day+"']"));
        wait.until(ExpectedConditions.elementToBeClickable(timeBox));
        Assert.assertTrue(timeBox.isDisplayed());
    }

    public void selectEvent(String eventName){
        WebElement event = Driver.getDriver().findElement(By.xpath("//div[contains(text(), '" + eventName + "')]"));
        wait.until(ExpectedConditions.elementToBeClickable(event));
        event.click();
    }

    public String getDate(){

        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM");
        Date date = new Date();

        return formatter.format(date)+"-05";
    }

}