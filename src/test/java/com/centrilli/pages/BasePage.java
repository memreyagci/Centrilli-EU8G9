package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickNavBarBtn(String btnStr) {
        String titleBeforeClick = Driver.getDriver().getTitle();
        WebElement navBarBtn = Driver.getDriver().findElement(By.xpath("//nav//span[contains(text(), '" + btnStr + "')]/.."));

        // If navBarBtn is not displayed, it's in More menu because of reasons related to screen size, then it needs to be clicked first.
        if (navBarBtn.isDisplayed()) {
            navBarBtn.click();
        } else {
            this.dropdownMenuMore.click();
            navBarBtn.click();
        }

        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs(titleBeforeClick)));
    }

    public void clickSubMenuBtn(String subMenuName) {
        String subMenuContentXpath = "//div[@class='o_main_content']";
        String contentBeforeClick = Driver.getDriver().findElement(By.xpath(subMenuContentXpath)).getAttribute( "innerHTML");

        WebElement subMenuBtn = Driver.getDriver().findElement(By.xpath("//div[@class='o_sub_menu_content']//span[normalize-space()='" + subMenuName + "']/.."));
        subMenuBtn.click();

        /* It takes a while for submenu page to load, so this is necessary to not get an error.
        Title doesn't always change, so checking it will not work in every case.
        Instead, it is checking whether innerHTML of submenu content has changed. */
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(subMenuContentXpath), "innerHTML", contentBeforeClick)));
    }


    //Update the cases as you find the eligible buttons
    public void clickButton(String btnName) throws Exception {
        switch (btnName) {
            case "Approve":
            case "Cancel":
            case "Create":
            case "Discard":
            case "Edit":
            case "Save":
            case "Select":
                WebElement button = Driver.getDriver().findElement(By.xpath("//button[normalize-space()='" + btnName + "']"));
                button.click();
                break;

            default:
                throw new Exception("Unknown button");
        }

    }

    @FindBy(xpath = "//a[@data-menu='120']/span[contains(text(), 'Calendar')]")
    public WebElement calendarModule;

    @FindBy(id = "menu_more_container")
    public WebElement dropdownMenuMore;


    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;

}
