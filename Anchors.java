package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anchors {

    WebDriver driver;
    public Anchors(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[1]")
    WebElement RedWine;
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[2]")
    WebElement WhiteWine;
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[3]")
    WebElement RoseWine;
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[4]")
    WebElement SparkleWine;
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[5]")
    WebElement Promotions;
    @FindBy(xpath = "//*[@id='landing_page_navbar']/div[6]")
    WebElement Gifts;

    public void switchRed(){
        RedWine.click();
    }
    public void switchWhite(){
        WhiteWine.click();
    }
    public void switchRose(){
        RoseWine.click();
    }
    public void switchSparkle(){
        SparkleWine.click();
    }
    public void switchPromotions(){
        Promotions.click();
    }
    public void switchGifts(){
        Gifts.click();
    }

}
