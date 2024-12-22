package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Subscription;
import Page.setup;

public class SubscripTest {

    WebDriver driver;
    setup eSetup;
    Subscription eSubscription;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eSubscription = new Subscription(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void confirmVisibility(){
        eSubscription.subscripVisible("Wine Subscription");
    }

    @Test
    public void confirmFunction(){
        eSubscription.btnFunction("https://pay-pal-pioneers-068.vercel.app/subscription");
    }
}
