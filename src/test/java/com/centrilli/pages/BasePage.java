package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickNavBarBtn(String btnStr) {
        WebElement navBarBtn = Driver.getDriver().findElement(By.xpath("//nav//span[contains(text(), '" + btnStr + "')]/.."));

        // If navBarBtn is not displayed, it's in More menu because of reasons related to screen size, then it needs to be clicked first.
        if (navBarBtn.isDisplayed()) {
            navBarBtn.click();
        } else {
            this.dropdownMenuMore.click();
            navBarBtn.click();
        }
    }


    @FindBy(xpath = "//a[@data-menu='120']/span[contains(text(), 'Calendar')]")
    public WebElement calendarModule;

    @FindBy(id = "menu_more_container")
    public WebElement dropdownMenuMore;

}
