package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Silde;
import Page.setup;

public class SlideTest {

    WebDriver driver;
    setup eSetup;
    Silde eSilde;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eSilde = new Silde(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");

    }

    @Test
    public void loadImg1(){
        eSilde.slideF();
    }

    @Test
    public void loadImg2(){
        eSilde.slideS();
    }

    @Test
    public void loadImg3(){
        eSilde.slideT();
    }

    @Test 
    public void loadImg4(){
        eSilde.slideFo();
    }

    @Test 
    public void loadImg5(){
        eSilde.slideFi();
    }

    @Test 
    public void loadImg6(){
        eSilde.slideSi();
    }

    @Test 
    public void loadImg7(){
        eSilde.slideSe();
    }








}
