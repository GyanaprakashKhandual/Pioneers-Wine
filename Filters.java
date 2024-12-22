package Page;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Filters {

    WebDriver driver;
    Anchors anchors;

    public Filters(WebDriver driver){
        this.driver = driver;
        this.anchors = new Anchors(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//section[@class='sidebar']//div//div//label[@class='sidebar-label-container'][normalize-space()='All']//span[@class='checkmark']")
    WebElement alltypeBtn;

    @FindBy(xpath = "//label[normalize-space()='White wine']//span[@class='checkmark']")
    WebElement whiteBtn;

    @FindBy(xpath = "//label[normalize-space()='Red wine']//span[@class='checkmark']")
    WebElement redBtn;

    @FindBy(xpath = "//label[normalize-space()='Rose wine']//span[@class='checkmark']")
    WebElement roseBtn;

    @FindBy(xpath = "//label[normalize-space()='Wine sets']//span[@class='checkmark']")
    WebElement winesetBtn;

    @FindBy(xpath = "//div[@class='ml']//label[@class='sidebar-label-container'][normalize-space()='All']//span[@class='checkmark']")
    WebElement allPriceBtn;

    @FindBy(xpath = "//label[normalize-space()='$0 - 50']//span[@class='checkmark']")
    WebElement fifty;

    @FindBy(xpath = "//label[normalize-space()='$50 - 100']//span[@class='checkmark']")
    WebElement hundread;

    @FindBy(xpath = "//label[normalize-space()='$100 - 150']//span[@class='checkmark']")
    WebElement twoHund;

    @FindBy(xpath = "//label[normalize-space()='Over $150']//span[@class='checkmark']")
    WebElement over;

    @FindBy(xpath = "//span[@class='checkmark all']")
    WebElement allCol;

    @FindBy(xpath = "//label[normalize-space()='Sparkling']//span[@class='checkmark']")
    WebElement sparklingCol;

    @FindBy(xpath = "//label[normalize-space()='Red']//span")
    WebElement redCol;

    @FindBy(xpath = "//label[normalize-space()='White']//span")
    WebElement whiteCol;

    @FindBy(xpath = "//p[normalize-space()='Product code : 62']")
    WebElement allProCode;

    @FindBy(xpath = "//p[normalize-space()='Product code : 5']")
    WebElement whiteWineProcode;

    @FindBy(xpath = "//section[@class='card-container']//div[@class='product-card-container']//div[@class='product-top-section']//div//p[@class='product-code'][normalize-space()='Product code : 3']")
    WebElement redWineProcode;

    @FindBy(xpath = "//p[normalize-space()='Product code : 9']")
    WebElement roseWineProcode;

    @FindBy(xpath = "//section[@class='card-container']//div[@class='product-card-container']//div[@class='product-top-section']//div//p[@class='product-code'][normalize-space()='Product code : 4']")
    WebElement winesetProcode;

    

    public void searchAll(String expectedText){
        anchors.switchRed();
        alltypeBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(allProCode));
        String actualText = allProCode.getText();
        Assert.assertEquals(actualText, expectedText);

    }

    public void searchWhite(String expectedText){
        anchors.switchRed();
        whiteBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(whiteWineProcode));
        String actualText = whiteWineProcode.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void searchRed(String expectedText){
        anchors.switchRed();
        redBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(redWineProcode));
        String actualText = redWineProcode.getText();
        Assert.assertEquals(actualText, expectedText);
        
    }

    public void searchRose(String expectedText){
        anchors.switchRed();
        roseBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(roseWineProcode));
        String actualText = roseWineProcode.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void searchSets(String expectedText){
        anchors.switchRed();
        winesetBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(winesetProcode));
        String actualText = winesetProcode.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    








}
