package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.AllImg;
import Page.setup;

public class AllImgTest {

    WebDriver driver;
    setup eSetup;
    AllImg eAllImg;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eAllImg = new AllImg(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void confirmImg1(){
        eAllImg.clickImg1("Product code : 62");
    }
    @Test
    public void confirmImg2(){
        eAllImg.clickImg2("Product code : 62");
    }
    @Test 
    public void confirmImg3(){
        eAllImg.clickImg3("Product code : 62");
    }
    @Test
    public void confirmImg4(){
        eAllImg.clickImg4("Product code : 62");
    }
}
