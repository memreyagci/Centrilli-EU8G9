package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {

    public ExpensesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
