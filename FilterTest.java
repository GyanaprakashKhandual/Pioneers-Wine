package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.Filters;
import Page.setup;

public class FilterTest {

    WebDriver driver;
    setup eSetup;
    Filters eFilters;

    @org.testng.annotations.BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eFilters = new Filters(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");

    }

    @org.testng.annotations.Test
    public void setToAll(){
        eFilters.searchAll("Product code : 62");
    }

    @Test
    public void setToWhite(){
        eFilters.searchWhite("Product code : 5");
    }

    @Test
    public void setToRose(){
        eFilters.searchRose("Product code : 9");
    }

    @Test
    public void setToRed(){
        eFilters.searchRed("Product code : 3");
    }

    @Test
    public void setToSets(){
        eFilters.searchSets("Product code : 4");
    }
    


}
