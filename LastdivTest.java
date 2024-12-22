package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Lastdiv;
import Page.setup;

public class LastdivTest {

    WebDriver driver;
    setup eSetup;
    Lastdiv eLastdiv;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eLastdiv = new Lastdiv(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void checkLatDiv(){
        eLastdiv.visibleLastDiv("CATALOG");
    }

    @Test 
    public void newslettercheck(){
        eLastdiv.newsletterFunction("gyanaprakashkhnadual@gmail.com", "https://pay-pal-pioneers-068.vercel.app/news");
    }
}
