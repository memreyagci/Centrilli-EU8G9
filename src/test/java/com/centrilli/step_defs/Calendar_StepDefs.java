package com.centrilli.step_defs;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.CalendarPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Calendar_StepDefs {

    String expectedDate = "2022-07-05";
    String expectedEvent = "business lunch";
    String newEvent = "Meeting subject changed";

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    CalendarPage calendarPage = new CalendarPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        loginPage.login();
    }

    @When("user clicks calendar module in navigation bar")
    public void user_clicks_calendar_module_in_navigation_bar() {
        wait.until(ExpectedConditions.visibilityOf(basePage.calendarModule));
        basePage.calendarModule.click();
    }

    @Then("user should be on weekly calendar display")
    public void user_should_be_on_weekly_calendar_display() {
        calendarPage.verifyWeekClicked(calendarPage.weekButton);
    }

    @When("user clicks day button")
    public void user_clicks_day_button() {
        calendarPage.dayButton.click();
    }

    @Then("user should be on daily calendar display")
    public void user_should_be_on_daily_calendar_display() {
        calendarPage.verifyDayClicked(calendarPage.dayButton);
    }

    @When("user clicks week button")
    public void user_clicks_week_button() {
        calendarPage.weekButton.click();
    }

    @When("user clicks month button")
    public void user_clicks_month_button() {
        calendarPage.monthButton.click();
    }

    @Then("user should be on monthly calendar display")
    public void user_should_be_on_monthly_calendar_display() {
        calendarPage.verifyMonthClicked(calendarPage.monthButton);
    }

    @When("user clicks any time box")
    public void user_clicks_any_time_box() {
        calendarPage.monthButton.click();
        calendarPage.selectTimeSlot(expectedDate);
    }
    
    @When("user enters summary of the event")
    public void user_enters_summary_of_the_event() {
        calendarPage.summaryInput.sendKeys(expectedEvent);
    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        calendarPage.createButton.click();
    }

    @Then("user should be able to see the event created")
    public void user_should_be_able_to_see_the_event_created(){
        calendarPage.isCreated(expectedEvent);
    }

    @When("user clicks created event on calendar")
    public void user_clicks_created_event_on_calendar() {
        wait.until(ExpectedConditions.visibilityOf(calendarPage.monthButton));
        calendarPage.monthButton.click();
        calendarPage.selectCreatedEvent(expectedEvent);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user clicks edit button")
    public void user_clicks_edit_button() {
        calendarPage.editButton.click();
    }

    @When("user changes meeting subject")
    public void user_changes_meeting_subject() {
        calendarPage.meetingSubject.clear();
        calendarPage.meetingSubject.sendKeys(newEvent);
    }

    @When("user changes meeting starting date")
    public void user_changes_meeting_starting_date() {
        calendarPage.checkBox.click();
        calendarPage.startingDateInput.click();
        calendarPage.startingDateInput.clear();
        calendarPage.startingDateInput.sendKeys("07/06/2022 13:00:00");
        calendarPage.duration.clear();
        calendarPage.duration.sendKeys("02:00");
    }

    @Then("user should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
        calendarPage.saveButton.click();
        calendarPage.selectCreatedEvent(newEvent);
        calendarPage.deleteButton.click();
        calendarPage.confirmation.click();
    }



}
