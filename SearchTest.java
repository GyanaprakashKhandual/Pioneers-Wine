package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Search;  
import Page.setup;

public class SearchTest {  
    WebDriver driver;
    Search eSearch; 
    setup eSetup;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();  
        eSearch = new Search(driver); 
        eSetup = new setup(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }
    

    @Test
    public void search() {
        eSearch.searching("Red");

    }

    @Test 
    public void searchWhite(){
        eSearch.searching("White");
    }

    @Test
    public void searchRose(){
        eSearch.searching("Rose");
    }

    @Test
    public void searchSparkling(){
        eSearch.searching("Sparkling");
    }

    @Test
    public void searchPromotions(){
        eSearch.searching("Promotions");
    }
    
    @Test 
    public void searchGifts(){
        eSearch.searching("Set&Gifts");
    }
}

