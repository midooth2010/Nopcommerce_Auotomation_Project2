package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register   register = new P01_Register();

    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.RegisterLink.click();

        System.out.println("user click on  Registration button");
    }

    @When("user enter gender type")
    public void userEnterGenderType() {
    register.Male.click();
    }

    @And("user enter {string} and {string}")
    public void userEnterAnd(String firstName, String lastName) {
        register.firstName.sendKeys(firstName);
        register.lastName.sendKeys(lastName);
    }

    @And("user enter Date of birth")
    public void userEnterDateOfBirth() {
        //select the Day
        Select selectDay = new Select(register.dayList);
        selectDay.selectByValue("12");
        // select month
        Select selectMonth = new Select(register.monthsList);
        selectMonth.selectByValue("6");
        // Select Year
        Select selectYear = new Select(register.yearList);
        selectYear.selectByValue("1988");

    }


    @And("user enter {string} email" )
    public void userEnter(String email) {
        register.Email.sendKeys(email);
    }


    @And("user enter {string} password and Confirm password")
    public void userEnterPasswordAndConfirmfPassword(String arg0) {
        register.password.sendKeys(arg0);
        register.confirmPassword.sendKeys(arg0);

    }

    @And("user Click on Register button")
    public void userClickOnRegisterButton() {
    register.clickOnregister.click();
    }

    @Then("account is created sucessfully")
    public void accountIsCreatedSucessfully() {
        SoftAssert soft = new SoftAssert();
        // get text verified after registeration completed
        soft.assertTrue(register.registerSucessMessage.getText().contains("Your registration completed"));

        // get value of CSS Color is green #4cb17c
        String actualColor = register.registerSucessMessage.getCssValue("color");
        System.out.println(Color.fromString(actualColor).asHex());
       soft.assertEquals( Color.fromString(actualColor).asHex(),"#4cb17c");

        soft.assertAll();
    }
}
