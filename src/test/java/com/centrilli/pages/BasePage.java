package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

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

    public void clickSubMenuBtn(String subMenuName) {
        String currentTitle = Driver.getDriver().getTitle();
        WebElement subMenuBtn = Driver.getDriver().findElement(By.xpath("//div[@class='o_sub_menu_content']//span[contains(text(), '" + subMenuName + "')]/.."));
        subMenuBtn.click();

        /* It takes a while for submenu page to load, so this is necessary to not get an error.
        You can't simply check what title is, because it does not always match with button name itself.
        Thus, we check whether it is different from prior to clicking. */
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs(currentTitle)));
    }


    @FindBy(xpath = "//a[@data-menu='120']/span[contains(text(), 'Calendar')]")
    public WebElement calendarModule;

    @FindBy(id = "menu_more_container")
    public WebElement dropdownMenuMore;

}
