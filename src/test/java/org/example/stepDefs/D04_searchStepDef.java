package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
   SoftAssert softAssert = new SoftAssert();

    @When("User search with product name {string} in search field")
    public void userSearchWithProductNameInSearchField(String name) {

        //search.searchField.click();
        search.searchField.sendKeys(name);

    }


    @When("user search with product {string} in search field")
    public void userSearchWithProductInSearchField(String sku) {
       // search.searchField.click();
        search.searchField.sendKeys(sku);

    }

    @Then("User click search button")
    public void userClickSearchButton() {
        search.searchbutton.click();

    }


    @Then("search result displayed with its product {string}")
    public void searchResultDisplayedWithItsProduct(String name) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = search.searchResult;
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));

        }
        softAssert.assertAll();
    }


    @Then("search result displayed related to the product sku {string}")
    public void searchResultDisplayedRelatedToTheProductSku(String sku) {
        search.searchResult.get(0).click();
        Assert.assertTrue(search.productSku.getText().contains(sku));
        softAssert.assertAll();
    }
}
