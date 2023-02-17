package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // Declar web driver object on the class level
    public static WebDriver driver;
    @Before
    public static void  openBrowser()
    {
        // Bridge between your code and browser using webdriver Manager Dependency
        WebDriverManager.chromedriver().setup();

        // create new Object from Chrome Driver
        driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // open URL
        driver.navigate().to("https://demo.nopcommerce.com/  ");
        System.out.println("open Browser");
    }

    @After
    public static void quiteDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        System.out.println("quite driver");
    }
}
