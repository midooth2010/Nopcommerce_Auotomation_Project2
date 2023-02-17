package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    String subCategory;
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();


    @When("user hover on category and click on subgaegory")
    public void userHoverOnCategoryAndClickOnSubgaegory() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(homePage.electronicsMainCategories).
                moveToElement(homePage.electronicsMainCategories).build().perform();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(homePage.electronicsMainCategories));
        subCategory = homePage.cellPhoneSubcategories.getText().toLowerCase().trim();
        System.out.println("***************" + subCategory + "*********************");
        actions.moveToElement(homePage.electronicsMainCategories)
                .moveToElement(homePage.cellPhoneSubcategories).click().build().perform();

    }

    @Then("user should be navigate to page contains this subcategory")
    public void userShouldBeNavigateToPageContainsThisSubcategory() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("cell-phones"));
        softAssert.assertTrue(homePage.subCategoryPageTitle.getText().contains("Cell phones"),"Cell phones");
        softAssert.assertTrue(homePage.subCategoryPageTitle.getText()
                .toLowerCase().equals(subCategory));
        softAssert.assertAll();
    }
}
