package Page;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='landing_page_header_cart']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement cartBtn;

    @FindBy(xpath = "//span[@class='chakra-switch__thumb css-7roig']")
    WebElement toogleAgeBtn;

    @FindBy(xpath = "//header[@id='landing_page_header']//div[1]//div[1]//div[5]//span[2]")
    WebElement sanBlaAdd;

    @FindBy(xpath = "//*[@id=\"landing_page_header\"]/div[3]/div[4]/div/div/div[1]/div[1]/div[2]/i")
    WebElement delItem;

    @FindBy(xpath = "//*[@id=\"landing_page_header\"]/div[3]/div[4]/div/div/div[2]/div[2]/div[1]/i[1]")
    WebElement incItem;

    @FindBy(xpath = "//div[normalize-space()='3']")
    WebElement quantity;

    @FindBy(xpath = "//div[normalize-space()='1']")
    WebElement quantAfter;

    @FindBy(xpath = "//*[@id=\"landing_page_header\"]/div[3]/div[4]/div/div/div[2]/div[2]/div[1]/i[2]")
    WebElement decItem;

    @FindBy(className = "product-cart-button")
    List<WebElement> addItemBtn;

    @FindBy(xpath = "//button[@type='button']")
    WebElement checkoutBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/form/div/div[2]/div[1]/input")
    WebElement firstN;

    @FindBy(xpath = "//body//div[@id='root']//div[@class='checkout-info']//div//div//div//div[2]//input[1]")
    WebElement lastN;

    @FindBy(xpath = "//input[@type='number']")
    WebElement mob;

    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(xpath = "//div[@class='checkout-info']//div[5]//input[1]")
    WebElement msg;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement cont;

    @FindBy(xpath = "//body/div[@id='root']/div[@class='checkout']/div/div[@class='checkout-info']/div/form[@class='checkout-form']/div/div/input[1]")
    WebElement curAd;

    @FindBy(xpath = "//div[@class='checkout-info']//div//div[2]//div[1]//input[1]")
    WebElement city;

    @FindBy(xpath = "//div[@class='checkout-info']//div//div[2]//div[2]//input[1]")
    WebElement district;

    @FindBy(xpath = "//div[@class='checkout']//div//div[3]//div[1]//input[1]")
    WebElement state;

    @FindBy(xpath = "//div[3]//div[2]//input[1]")
    WebElement pin;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement checkoutBtn2;

    @FindBy(xpath = "//div[@class='checkout-info']//label[1]//span[1]")
    WebElement radioPayment;

    @FindBy(xpath = "//label[2]//span[1]")
    WebElement radioRecipt;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement checkout3;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement confirmOrderBtn;

    @FindBy(xpath = "//h2[normalize-space()='Thank you for your purchase!']")
    WebElement confirmation;

    private void openCartAndToggleAge() {
        cartBtn.click();
        toogleAgeBtn.click();
        Assert.assertTrue("Toggle button is not enabled.", toogleAgeBtn.isEnabled());
    }

    public void sign() {
        openCartAndToggleAge();
    }

    public void addSanBla() {
        openCartAndToggleAge();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(sanBlaAdd));
        sanBlaAdd.click();
        delItem.click();
    }

    public void increase(String expectedText) {
        openCartAndToggleAge();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(sanBlaAdd));
        sanBlaAdd.click();
        incItem.click();
        incItem.click();
        Assert.assertEquals("Quantity does not match.", expectedText, quantity.getText());
        delItem.click();
    }

    public void decrease(String expectedTextF, String expectedTextS) {
        openCartAndToggleAge();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(sanBlaAdd));
        sanBlaAdd.click();
        incItem.click();
        incItem.click();
        Assert.assertEquals("First quantity does not match.", expectedTextF, quantity.getText());
        decItem.click();
        decItem.click();
        Assert.assertEquals("Second quantity does not match.", expectedTextS, quantAfter.getText());
        delItem.click();
    }

    public void addAll() {
        openCartAndToggleAge();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(addItemBtn));
        for (WebElement btn : addItemBtn) {
            btn.click();
        }
    }

    public void checkOutInform(String firstName, String lastName, String mobNo, String emailId, String message){
        cartBtn.click();
        toogleAgeBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(sanBlaAdd));
        sanBlaAdd.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfAllElements(checkoutBtn));
        checkoutBtn.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait4.until(ExpectedConditions.visibilityOfAllElements(firstN));
        firstN.click();
        firstN.sendKeys(firstName);
        lastN.click();
        lastN.sendKeys(lastName);
        mob.click();
        mob.sendKeys(mobNo);
        email.click();
        email.sendKeys(emailId);
        msg.click();
        msg.sendKeys(message);
        cont.click();
    }
    public void checkOutDelv(String firstName, String lastName, String mobNo, String emailId, String message, String currentAdd, String cityName, String disName, String stateName, String pincode){
        cartBtn.click();
        toogleAgeBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(sanBlaAdd));
        sanBlaAdd.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfAllElements(checkoutBtn));
        checkoutBtn.click();
        firstN.click();
        firstN.sendKeys(firstName);
        lastN.click();
        lastN.sendKeys(lastName);
        mob.click();
        mob.sendKeys(mobNo);
        email.click();
        email.sendKeys(emailId);
        msg.click();
        msg.sendKeys(message);
        cont.click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(ExpectedConditions.visibilityOfAllElements(curAd));
        curAd.click();
        curAd.sendKeys(currentAdd);
        city.click();
        city.sendKeys(cityName);
        district.click();
        district.sendKeys(disName);
        pin.sendKeys(pincode);
        checkoutBtn2.click();
    }
    public void checkOut(String firstName, String lastName, String mobNo, String emailId, String message, String currentAdd, String cityName, String disName, String stateName, String pincode, String expectedText){
        cartBtn.click();
        toogleAgeBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(sanBlaAdd));
        sanBlaAdd.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfAllElements(checkoutBtn));
        checkoutBtn.click();
        firstN.click();
        firstN.sendKeys(firstName);
        lastN.click();
        lastN.sendKeys(lastName);
        mob.click();
        mob.sendKeys(mobNo);
        email.click();
        email.sendKeys(emailId);
        msg.click();
        msg.sendKeys(message);
        cont.click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(ExpectedConditions.visibilityOfAllElements(curAd));
        curAd.click();
        curAd.sendKeys(currentAdd);
        city.click();
        city.sendKeys(cityName);
        district.click();
        district.sendKeys(disName);
        pin.sendKeys(pincode);
        checkoutBtn2.click();
        radioPayment.click();
        radioRecipt.click();
        checkout3.click();
        confirmOrderBtn.click();
        String actualTagText = confirmation.getText();
        Assert.assertEquals(expectedText, actualTagText);

    }
}
