package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wishlist {

    WebDriver driver;

    public Wishlist(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='landing_page_header_fav']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement wishListBtn;

    @FindBy(xpath = "//div[@id='landing_page_combination_cards']//div[1]//div[1]//div[2]//span[2]//i[1]")
    WebElement  code1like;

    @FindBy(xpath = "//p[normalize-space()='No items in wishlist']")
    WebElement added;

    public void addtoWish(String expectedText){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(code1like));
        code1like.click();
        wishListBtn.click();
        String actualText = added.getText();
        Assert.assertEquals(actualText, expectedText);

    }

}
