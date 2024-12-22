package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Silde {

    WebDriver driver;
    WebDriverWait wait;

    public Silde(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait for up to 10 seconds
    }

    @FindBy(xpath = "//*[@id=\"landing_page_hero_carausal\"]/button[2]")
    WebElement forwardBtn;

    @FindBy(xpath = "//*[@id=\"landing_page_hero_carausal\"]/button[1]")
    WebElement backwardBtn;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[1]/img")
    WebElement slide1;

    @FindBy(xpath = "//img[@alt='Slide 2']")
    WebElement slide2;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[3]/img")
    WebElement slide3;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[4]/img")
    WebElement slide4;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[5]/img")
    WebElement slide5;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[6]/img")
    WebElement slide6;

    @FindBy(xpath = "//*[@id='landing_page_hero_carausal']/div/div[7]/img")
    WebElement slide7;

    // Method to assert visibility with explicit wait
    private void assertImageIsVisible(WebElement image, String message) {
        wait.until(ExpectedConditions.visibilityOf(image));
        Assert.assertTrue(image.isDisplayed(), message);
    }

    public void slideF() {
        assertImageIsVisible(slide1, "Slide 1 is not visible");
    }

    public void slideS() {
        forwardBtn.click();
        assertImageIsVisible(slide2, "Slide 2 is not visible");

        backwardBtn.click();
        assertImageIsVisible(slide1, "Slide 1 is not visible");

        forwardBtn.click();
        assertImageIsVisible(slide2, "Slide 2 is not visible");
    }

    public void slideT() {
        forwardBtn.click();
        forwardBtn.click();
        assertImageIsVisible(slide3, "Slide 3 is not visible");
    }

    public void slideFo() {
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        assertImageIsVisible(slide4, "Slide 4 is not visible");
    }

    public void slideFi() {
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        assertImageIsVisible(slide5, "Slide 5 is not visible");
    }

    public void slideSi() {
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        assertImageIsVisible(slide6, "Slide 6 is not visible");
    }

    public void slideSe() {
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        forwardBtn.click();
        assertImageIsVisible(slide7, "Slide 7 is not visible");

        backwardBtn.click();
        assertImageIsVisible(slide6, "Slide 6 is not visible after going backward");
    }
}
