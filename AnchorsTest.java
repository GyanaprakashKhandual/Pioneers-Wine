package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Anchors;
import Page.setup;

public class AnchorsTest {

    WebDriver driver;
    Anchors eAnchors;
    setup eSetup;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        eAnchors = new Anchors(driver);
        eSetup = new setup(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }
    @Test
    public void loadRed(){
        eAnchors.switchRed();
    }
    @Test
    public void loadWhite(){
        eAnchors.switchWhite();
    }
    @Test
    public void loadRose(){
        eAnchors.switchRose();
    }
    @Test
    public void loadSparkle(){
        eAnchors.switchSparkle();
    }
    @Test 
    public void loadPromotions(){
        eAnchors.switchPromotions();
    }
    @Test
    public void loadGifts(){
        eAnchors.switchGifts();
    }
    
}
