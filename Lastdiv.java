package Page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Lastdiv {

    WebDriver driver;
    JavascriptExecutor jsExecutor;

    public Lastdiv(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        jsExecutor = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//p[normalize-space()='CATALOG']")
    WebElement lastDiv;

    @FindBy(xpath = "//input[@placeholder='example@gmail.com']")
    WebElement newsEmailInput;


    public void visibleLastDiv(String expectedText){

        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastDiv);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(lastDiv));
        String actualText = lastDiv.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void newsletterFunction(String email, String expectedUrl){

        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastDiv);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(lastDiv));
        newsEmailInput.sendKeys(email);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
