package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class setup {
    WebDriver driver;

    
    public setup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openApp(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
}
