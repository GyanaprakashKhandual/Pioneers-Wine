package Script;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Wishlist;
import Page.setup;

public class WishTest {


    WebDriver driver;
    setup eSetup;
    Wishlist eWishlist;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eWishlist = new Wishlist(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void addToWishlist(){
        eWishlist.addtoWish("Item added to the cart");
    }

    
}

