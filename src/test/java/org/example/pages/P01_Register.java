package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {

    public P01_Register (){

        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(css = "a[href=\"/register?returnUrl=%2F\"]")
    public WebElement RegisterLink;

    @FindBy (id = "gender-male")
    public WebElement Male;

    @FindBy(id= "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy (name="DateOfBirthDay")
    public WebElement dayList;
    @FindBy (name = "DateOfBirthMonth")
    public WebElement monthsList;
    @FindBy (name = "DateOfBirthYear")
    public WebElement yearList;

    @FindBy (id = "Email")
    public WebElement Email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy (id = "register-button")
    public WebElement clickOnregister;

    @FindBy (className = "result")
    public WebElement registerSucessMessage;


    // another Method to Find element in POM pattern
   /*
    public WebElement Registerlink(){

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    */
}
