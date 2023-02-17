package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_Login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {


    P03_homePage homePage = new P03_homePage();
  //  P02_Login login = new P02_Login();

  /*  @Given("user go to login page")
    public void user_go_to_login_page() {
        login.loginLink.click();
        System.out.println("user click on login button");
    }

   */
  @Given("user go to home page")
  public void userGoToHomePage() {
      SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/"));

    softAssert.assertAll();

  }

    @Then("user select euro currency")
    public void userSelectEuroCurrency() {
        // select currency list
        Select select = new Select(homePage.currencyDropdown);
        select.selectByVisibleText("Euro");

    }


    @Then("all item prices changed to euro")
    public void allItemPricesChangedToEuro() {
        List<WebElement> itemsPrices = homePage.itemprices;
        for (WebElement itemPrice : itemsPrices) {
            Assert.assertTrue(itemPrice.getText().contains("€"));


        }
    }
}
