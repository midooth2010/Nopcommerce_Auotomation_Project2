package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {

    public P03_homePage(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy (id ="customerCurrency")
    public WebElement currencyDropdown;

    @FindBy (xpath ="//option[@value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]" )
    public WebElement dollarCurrency;

    @FindBy (xpath = "//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")
    public WebElement euroCurrency;

    @FindBy (className = "prices")
    public List<WebElement> itemprices;
//-----------------------------------------------------------
    // Feature 04
    @FindBy (id = "small-searchterms")
   public WebElement searchField;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement searchbutton;

    @FindBy (className = "item-box")
     public List <WebElement> searchResult;

    @FindBy (xpath = "//*[@class=\"sku\"]/span[2]")
    public WebElement productSku;
    //----------------------
    // categoried
    @FindBy (xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
   public WebElement electronicsMainCategories;

    @FindBy (xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a")
    public WebElement cellPhoneSubcategories;

    @FindBy (xpath = "//*[@class='page-title']")
    public WebElement subCategoryPageTitle;
    //--------------SLIDERS--------------

    @FindBy (xpath = "//*[@class='nivoSlider']/a[1]")
    public WebElement firstSlider;

    @FindBy (xpath = "//*[@class='nivoSlider']/a[2]")
    public WebElement secondSlider;





}
