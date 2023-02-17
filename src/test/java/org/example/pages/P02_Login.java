package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    public P02_Login (){

        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy (className="ico-login")
   public WebElement loginLink;

    @FindBy (id = "Email")
    public WebElement emailTextBox;

    @FindBy (id = "Password")
    public WebElement passwordTextBox;

    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public WebElement loginbutton;


    @FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    public WebElement myaccounttab;

    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    public  WebElement unsucessfullloginmessage;


}
