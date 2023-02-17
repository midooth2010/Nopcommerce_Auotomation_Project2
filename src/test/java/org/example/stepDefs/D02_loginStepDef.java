package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_Login login = new P02_Login();

   @Given("user go to login page")
    public void user_go_to_login_page(){
       login.loginLink.click();
       System.out.println("user click on login button");
   }


    @When("user enter email {string} and {string}")
    public void userEnterEmailAnd(String email, String password) {
        login.emailTextBox.sendKeys(email);
        login.passwordTextBox.sendKeys(password);
    }


    @And("user click on login button")
    public void userClickOnLoginButton() {
    login.loginbutton.click();
    }

    @Then("user shall login sucessfully")
    public void userShallLoginSucessfully() {
        SoftAssert soft = new SoftAssert();
        //validate the current URLlike  expected
        String actualUrl = Hooks.driver.getCurrentUrl();
        String expetedUrl = "https://demo.nopcommerce.com/";
        soft.assertEquals(actualUrl,expetedUrl);

        // validate that account tab is found and displayed
        String MyAccountActualtab = login.myaccounttab.getText();
        String expectedAcountTab = "My account";
        soft.assertEquals(MyAccountActualtab,expectedAcountTab);

        soft.assertAll();
    }

    @Then("user couldnt login to the system")
    public void userCouldntLoginToTheSystem() {
       SoftAssert soft = new SoftAssert();
        String actualerror = login.unsucessfullloginmessage.getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String MsgColor = login.unsucessfullloginmessage.getCssValue("color");

        soft.assertEquals(MsgColor,"rgba(228, 67, 75, 1)");
        System.out.println("Color = " + MsgColor);
        soft.assertEquals(actualerror,expectedResult);
    soft.assertAll();
    }
}
