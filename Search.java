package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    WebDriver driver;
    public Search(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='landing_page_header']/div[2]/div[1]/input")
    WebElement searchTag;

    @FindBy(xpath = "//*[@id='landing_page_header']/div[2]/div[1]/button")
    WebElement searchBtn;

    @FindBy(className = "product-country-span")
    WebElement itemName;
    // Action method to perform search
    public void searching(String item) {
        searchTag.sendKeys(item);  // Enter the search term
        searchBtn.click();        // Click the search button
        
    }

}