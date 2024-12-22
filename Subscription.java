package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Subscription {

    WebDriver driver;
    public Subscription(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='landing_page_wine_subscription_title']")
    WebElement subscripTag;

    @FindBy(xpath = "//p[@class='landing_page_wine_subscription_link']")
    WebElement subscripBtn;

    public void subscripVisible(String expectedText){
        String actualText = subscripTag.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void btnFunction(String expectedText){
        subscripBtn.click();
        String allOk = driver.getCurrentUrl();
        Assert.assertEquals(allOk, expectedText);
    }
}
