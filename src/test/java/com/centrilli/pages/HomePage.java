package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li/a[.=\"More \"]/b[@class=\"caret\"]")
    public WebElement moreElement;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=134&action=\" and @data-menu=\"134\"]")
    public WebElement fleetOption;

    @FindBy(xpath = "//div//div//div//button[@accesskey=\"c\"]")
    public WebElement verifyCreatePage;

}
