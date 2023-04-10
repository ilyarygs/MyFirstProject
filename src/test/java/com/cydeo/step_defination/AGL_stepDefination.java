package com.cydeo.step_defination;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AGL_stepDefination {

    LoginPage loginPage = new LoginPage();

    @Given("User is already with {string} and {string} logged in and on Activity Stream page")
    public void user_is_already_with_and_logged_in_and_on_activity_stream_page(String string, String string2) {

        Driver.getDriver().get("https://qa.agileprocrm.com/auth/?backurl=%2Fstream%2F");

        loginPage.inputUsername.sendKeys(string);
        loginPage.inputPassword.sendKeys(string2);
        loginPage.loginButton.click();

    }

    @When("User clicks Calendar tab")
    public void user_clicks_tab() {
        loginPage.calendarButton.click();
    }

    @Then("User should be able to see title is {string}")
    public void user_should_be_able_to_see_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    //============================================


    @When("User clicks Company Calendar tab")
    public void user_clicks_company_calendar_tab() {
        loginPage.companyCalendar.click();
    }
    @Then("User should be able to display {string} window")
    public void user_should_be_able_to_display_company_calendar_window(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


}
