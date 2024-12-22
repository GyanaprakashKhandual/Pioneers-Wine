package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Blog;
import Page.setup;

public class BlogTest {

    WebDriver driver;
    setup eSetup;
    Blog eBlog;

    @BeforeClass
    public void set(){
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eBlog = new Blog(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }
    @Test
    public void checkBandW(){
        eBlog.WAndB("Enjoy a fun new way to get to know wine");
    }
    @Test
    public void checkBandO(){
        eBlog.WNAdO("Wine and oysters. A rule just waiting to be broken");
    }
    @Test
    public void checkChamp(){
        eBlog.Champ("A brief history of champagne");
    }
    @Test
    public void checkChamp2(){
        eBlog.Champ2("A brief history of champagne");
    }
    @Test
    public void checkWineTable(){
        eBlog.Wines("The wines we have on our own table right now");
    }
    
}
