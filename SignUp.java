package Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUp {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public SignUp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='landing_page_header_login_dropdown_parent']//*[name()='svg']")
    WebElement profile;

    @FindBy(xpath = "//p[normalize-space()='Sign Up']")
    WebElement signup;

    @FindBy(xpath = "//h1[@class='chakra-heading css-10z5u58']")
    WebElement registerTag;

    @FindBy(xpath = "//input[@id='field-:r0:']")
    WebElement regName;

    @FindBy(xpath = "//input[@id='field-:r1:']")
    WebElement regEmail;

    @FindBy(xpath = "//input[@id='field-:r2:']")
    WebElement regPassword;

    @FindBy(xpath = "//select[@id='field-:r3:']")
    WebElement regRoleSe;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement regSubmitBtn;

    @FindBy(xpath = "//p[normalize-space()='Log In']")
    WebElement LoginBtn;

    @FindBy(xpath = "//h1[@class='chakra-heading css-10z5u58']")
    WebElement confirmLog;

    @FindBy(xpath = "//input[@id='field-:rc:']")
    WebElement logEmail;

    @FindBy(xpath = "//input[@id='field-:rd:']")
    WebElement logPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement logConfirmBtn;

    @FindBy(xpath = "//div[contains(text(),'Gyana Prakash Khandual')]")
    WebElement proName;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    WebElement signOut;

    // Registration method with explicit waits
    public void register(String name, String email, String password, String role, String expectedText) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
            wait.until(ExpectedConditions.elementToBeClickable(signup)).click();

            String actualText = wait.until(ExpectedConditions.visibilityOf(registerTag)).getText();
            Assert.assertEquals(actualText, expectedText, "Registration header mismatch!");

            regName.sendKeys(name);
            regEmail.sendKeys(email);
            regPassword.sendKeys(password);

            Select roles = new Select(regRoleSe);
            roles.selectByVisibleText(role);

            regSubmitBtn.click();
        } catch (Exception e) {
            System.out.println("Error during registration: " + e.getMessage());
        }
    }

    // Login method with explicit waits
    public void Login(String email, String password, String expectedText, String expectedName) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
            wait.until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();

            String actualText = wait.until(ExpectedConditions.visibilityOf(confirmLog)).getText();
            Assert.assertEquals(actualText, expectedText, "Login header mismatch!");

            logEmail.sendKeys(email);
            logPassword.sendKeys(password);
            logConfirmBtn.click();

            String actualName = wait.until(ExpectedConditions.visibilityOf(proName)).getText();
            Assert.assertEquals(actualName, expectedName, "Logged-in username mismatch!");

            System.out.println("You are in our system. Have fun!");
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
        }
    }

    public void logOut(String email, String password){
        profile.click();
        LoginBtn.click();
        logEmail.sendKeys(email);
        logPassword.sendKeys(password);
        logConfirmBtn.click();
        proName.click();
        signOut.click();
    }
}
