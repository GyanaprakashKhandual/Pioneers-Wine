package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AllImg {

    WebDriver driver;
    WebDriverWait wait;

    public AllImg(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Use Duration.ofSeconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='landing_page_what_would_you_like']//div[1]//p[1]//img[1]")
    WebElement ImgWhite;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/p[1]/img[1]")
    WebElement ImgRed;

    @FindBy(xpath = "//div[@id='landing_page_what_would_you_like']//div[3]//p[1]//img[1]")
    WebElement ImgRose;
    @FindBy(xpath = "//div[@id='landing_page_what_would_you_like']//div[4]//p[1]//img[1]")
    WebElement ImgSparkle;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/section/div[62]/div/div[1]/p[2]")
    WebElement checkTag;

    public void clickImg1(String expectedTag) {
        // Wait until the image is clickable
        wait.until(ExpectedConditions.elementToBeClickable(ImgWhite));
        ImgWhite.click();

        // Wait until the tag element is visible
        wait.until(ExpectedConditions.visibilityOf(checkTag));

        // Validate the tag text
        String actualTagText = checkTag.getText();
        Assert.assertEquals(actualTagText, expectedTag, "The tag text does not match the expected value.");
    }

    public void clickImg2(String expectedTag){
        wait.until(ExpectedConditions.elementToBeClickable(ImgWhite));
        ImgRed.click();
        wait.until(ExpectedConditions.visibilityOf(checkTag));
        String actualTagText = checkTag.getText();
        Assert.assertEquals(actualTagText, expectedTag, "This tag Text does not match to the expected value");
    }

    public void clickImg3(String expectedTag){
        wait.until(ExpectedConditions.elementToBeClickable(ImgRose));
        ImgRose.click();
        wait.until(ExpectedConditions.visibilityOf(checkTag));
        String actualTagText = checkTag.getText();
        Assert.assertEquals(actualTagText, expectedTag, "This tag Text does not match to the expected value");
    }

    public void clickImg4(String expectedTag){
        wait.until(ExpectedConditions.elementToBeClickable(ImgSparkle));
        ImgSparkle.click();
        wait.until(ExpectedConditions.visibilityOf(checkTag));
        String actualTagText = checkTag.getText();
        Assert.assertEquals(actualTagText, expectedTag, "This tag Text does not match to the expected value");
    }
}
