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

import java.util.concurrent.TimeUnit;


public class CalendarPage extends BasePage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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

    public void verifyDayClicked(WebElement day) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(day, "Day"))) {
            System.out.println("User is on daily display");
        } else {
            throw new RuntimeException("User is not on daily calendar display");
        }
    }

    public void verifyWeekClicked(WebElement week) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(week, "Week"))) {
            System.out.println("User is on weekly display");
        } else {
            throw new RuntimeException("User is not on weekly calendar display");
        }
    }

    public void verifyMonthClicked(WebElement month) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        if (wait.until(ExpectedConditions.textToBePresentInElement(month, "Month"))) {
            System.out.println("User is on monthly display");
        } else {
            throw new RuntimeException("User is not on monthly calendar display");
        }
    }

    public void selectTimeSlot(String expectedDate) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

        String beforeXpath = "//div[@class='fc-day-grid fc-unselectable']/div[";
        String afterXpath = "]/div[@class='fc-bg']/table/tbody/tr/td[";

        boolean b = false;

        for (int rowNum = 1; rowNum < 7; rowNum++) {
            for (int colNum = 2; colNum <= 8; colNum++) {

                String date = Driver.getDriver().findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getAttribute("data-date");
                if (date.equals(expectedDate)) {
                    //BrowserUtils.sleep(2);
                    WebElement slot = Driver.getDriver().findElement(By.xpath("//div[@class='fc-day-grid fc-unselectable']/div[" + rowNum + "]/div[@class='fc-bg']/table/tbody/tr/td[@data-date='" + expectedDate + "']"));
                    wait.until(ExpectedConditions.visibilityOf(slot));
                    slot.click();
                    b = true;
                    break;
                }
            }

            if (b) {
                break;
            }
        }


    }

    public void isCreated(String expectedEvent) {

        String beforeXpath = "//table/tbody/tr/td/div/div/div[";
        String afterXpath = "]/div[2]/table/tbody/tr/td[";

        boolean b = false;

        for (int rowNum = 1; rowNum < 7; rowNum++) {
            for (int colNum = 2; colNum <= 8; colNum++) {

                try {
                    Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                    String eventText = Driver.getDriver().findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a//div[@class='o_field_name o_field_type_char']")).getText();
                    if (eventText.equals(expectedEvent)) {
                        WebElement actualEvent = Driver.getDriver().findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a//div[@class='o_field_name o_field_type_char']"));
                        System.out.println("Event found");
                        Assert.assertEquals("No such event found", expectedEvent, actualEvent.getText());
                        b = true;
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (b) {
                break;
            }

        }
    }

    public void selectCreatedEvent(String expectedEvent) {

        String beforeXpath = "//table/tbody/tr/td/div/div/div[";
        String afterXpath = "]/div[2]/table/tbody/tr/td[";

        boolean b = false;

        for (int rowNum = 1; rowNum < 7; rowNum++) {
            for (int colNum = 2; colNum <= 8; colNum++) {

                try {
                    Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                    String eventText = Driver.getDriver().findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a//div[@class='o_field_name o_field_type_char']")).getText();
                    if (eventText.equals(expectedEvent)) {
                        WebElement actualEvent = Driver.getDriver().findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a//div[@class='o_field_name o_field_type_char']"));
                        actualEvent.click();
                        System.out.println("Event found");
                        b = true;
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (b) {
                break;
            }
        }

    }

}