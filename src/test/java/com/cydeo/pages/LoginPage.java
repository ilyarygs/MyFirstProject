package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_calendar\"]/a")
    public WebElement calendarButton;

    @FindBy(xpath = "//*[@id=\"top_menu_id_calendar_menu_company_calendar\"]/a")
    public WebElement companyCalendar;


}
