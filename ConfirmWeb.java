package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.setup;

public class ConfirmWeb {

    WebDriver driver;
    setup eSetup;

    @BeforeClass
    public void set(){

        driver = new ChromeDriver();
        eSetup = new setup(driver);
    }

    @Test
    public void confirm(){
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }






}
