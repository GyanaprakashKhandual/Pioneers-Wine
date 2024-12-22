package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Blog {

    WebDriver driver;
    JavascriptExecutor jsExecutor;

    
    public Blog(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        jsExecutor = (JavascriptExecutor) driver;
    }

    // Locators for the elements
    @FindBy(xpath = "//*[@id=\"landing_page_blog_and_news_container\"]/div[1]")
    WebElement blogAndNews;

    @FindBy(xpath = "//*[@id=\"landing_page_blog_and_news\"]/div[1]/p[2]")
    WebElement checkTagWB;

    @FindBy(xpath = "//p[normalize-space()='Wine and oysters. A rule just waiting to be broken']")
    WebElement checkTagWO;

    @FindBy(xpath = "//div[@id='landing_page_blog_and_news_container']//div[3]//p[2]")
    WebElement checkTagChamp;

    @FindBy(xpath = "//div[@id='landing_page_blog_and_news_container']//div[4]//p[2]")
    WebElement checkTagChamp2;

    @FindBy(xpath = "//p[normalize-space()='The wines we have on our own table right now']")
    WebElement wineTable;

    // Method to scroll and verify the tag text
    public void WAndB(String expectedTag) {
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(blogAndNews));


        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", blogAndNews);

        // Get the actual text from the tag
        String actualTagText = checkTagWB.getText();

        // Assert that the actual text matches the expected text
        Assert.assertEquals(actualTagText, expectedTag, "The tag does not match the expected value!");

        // Optionally, you can print the values for debugging
        System.out.println("Expected tag: " + expectedTag);
        System.out.println("Actual tag: " + actualTagText);
    }
    public void WNAdO(String expectedTag){
         // Wait for the blogAndNews element to be visible
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(blogAndNews));
 
         // Scroll into view using JavaScript
         jsExecutor.executeScript("arguments[0].scrollIntoView(true);", blogAndNews);
 
         // Get the actual text from the tag
         String actualTagText = checkTagWO.getText();
 
         // Assert that the actual text matches the expected text
         Assert.assertEquals(actualTagText, expectedTag, "The tag does not match the expected value!");
 
         // Optionally, you can print the values for debugging
         System.out.println("Expected tag: " + expectedTag);
         System.out.println("Actual tag: " + actualTagText);
    }
    public void Champ(String expectedTag){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(blogAndNews));

        // Scroll into view using JavaScript
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", blogAndNews);

        // Get the actual text from the tag
        String actualTagText = checkTagChamp.getText();

        // Assert that the actual text matches the expected text
        Assert.assertEquals(actualTagText, expectedTag, "The tag does not match the expected value!");

        // Optionally, you can print the values for debugging
        System.out.println("Expected tag: " + expectedTag);
        System.out.println("Actual tag: " + actualTagText);
    }
    public void Champ2(String expectedTag){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(blogAndNews));

        // Scroll into view using JavaScript
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", blogAndNews);

        // Get the actual text from the tag
        String actualTagText = checkTagChamp2.getText();

        // Assert that the actual text matches the expected text
        Assert.assertEquals(actualTagText, expectedTag, "The tag does not match the expected value!");

        // Optionally, you can print the values for debugging
        System.out.println("Expected tag: " + expectedTag);
        System.out.println("Actual tag: " + actualTagText);
    }
    public void Wines(String expectedTag){
          // Wait for the blogAndNews element to be visible
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.visibilityOf(blogAndNews));
  
          // Scroll into view using JavaScript
          jsExecutor.executeScript("arguments[0].scrollIntoView(true);", blogAndNews);
  
          // Get the actual text from the tag
          String actualTagText = wineTable.getText();
  
          // Assert that the actual text matches the expected text
          Assert.assertEquals(actualTagText, expectedTag, "The tag does not match the expected value!");
  
          // Optionally, you can print the values for debugging
          System.out.println("Expected tag: " + expectedTag);
          System.out.println("Actual tag: " + actualTagText);
    }
}
