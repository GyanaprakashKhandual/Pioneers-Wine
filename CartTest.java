package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.AddToCart;
import Page.setup;

public class CartTest {

    WebDriver driver;
    setup eSetup;
    AddToCart eAddToCart;

    @BeforeClass
    public void setUp() {

        // Initialize WebDriver
        driver = new ChromeDriver();

        // Initialize page objects
        eSetup = new setup(driver);
        eAddToCart = new AddToCart(driver);

        // Open the application
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void confirmAge() {
        // Perform the sign action
        eAddToCart.sign();
    }

    @Test
    public void additemSan(){
        eAddToCart.addSanBla();
    }

    @Test
    public void incItem(){
        eAddToCart.increase("3");
    }

    @Test
    public void decItem(){
        eAddToCart.decrease("3", "1");
    }

    @Test
    public void addAllItem(){
        eAddToCart.addAll();
    }
    @Test
    public void checkOutInformation(){
        eAddToCart.checkOutInform("Gyana prakash", "Khandual", "7606939833", "gyanaprakashkhnadual@gmail.com", "Hello Chris");
    }

    @Test
    public void checkOutDelivery(){
        eAddToCart.checkOutDelv("Gyana prakash", "Khandual", "7606939833", "gyanaprakashkhnadual@gmail.com", "Hello Chris", "Mangalpur", "Bhubaneswar", "Khorda", "Odiasha", "755011");
    }

    @Test
    public void checkoutConfirm(){
        eAddToCart.checkOut("Gyana prakash", "Khandual", "7606939833", "gyanaprakashkhnadual@gmail.com", "Hello Chris", "Mangalpur", "Bhubaneswar", "Khorda", "Odiasha", "755011", "Thank you for your purchase!");
    }

    @Test
    public void checkOutInformation_Valid() {
    eAddToCart.checkOutInform("John", "Doe", "1234567890", "john.doe@example.com", "This is a valid input test.");
    }

    
    @Test
    public void checkOutInformation_BlankName() {
    eAddToCart.checkOutInform("", "Doe", "1234567890", "john.doe@example.com", "Missing first name.");
    }

    @Test
    public void checkOutInformation_BlankEmail() {
    eAddToCart.checkOutInform("John", "Doe", "1234567890", "", "Missing email.");
    }


    @Test
    public void checkOutInformation_InvalidPhone() {
    eAddToCart.checkOutInform("John", "Doe", "123", "john.doe@example.com", "Phone number is too short.");
    }

    @Test
    public void checkOutInformation_InvalidEmail() {
    eAddToCart.checkOutInform("John", "Doe", "1234567890", "invalid-email", "Email format is incorrect.");
    }


    @Test
    public void checkOutInformation_SpecialCharactersName() {
    eAddToCart.checkOutInform("@John!", "Doe$", "1234567890", "john.doe@example.com", "Special characters in name.");
    }

    @Test
    public void checkOutInformation_LongInputs() {
    eAddToCart.checkOutInform(
        "Johnathan".repeat(10),
        "Doe".repeat(10),
        "12345678901234567890",
        "john.doe@example.com".repeat(5),
        "This input tests long strings."
    );
}


    @Test
    public void checkOutConfirm_Valid() {
    eAddToCart.checkOut("John", "Doe", "1234567890", "john.doe@example.com", "Valid confirmation note", "Apt 101", "New York", "NY", "USA", "10001", "Thank you!");
    }


    @Test
    public void checkOutConfirm_BlankConfirmationNote() {
    eAddToCart.checkOut("John", "Doe", "1234567890", "john.doe@example.com", "", "Apt 101", "New York", "NY", "USA", "10001", "");
    }

    @Test
    public void checkOutConfirm_BlankCityAndPostalCode() {
    eAddToCart.checkOut("John", "Doe", "1234567890", "john.doe@example.com", "No city and postal code", "Apt 101", "", "NY", "USA", "", "Thanks!");
    }


    @Test
    public void checkOutConfirm_InvalidState() {
    eAddToCart.checkOut("John", "Doe", "1234567890", "john.doe@example.com", "Invalid state", "Apt 101", "New York", "InvalidState", "USA", "10001", "Thank you!");
    }

    @Test
    public void checkOutConfirm_LongConfirmationMessage() {
    eAddToCart.checkOut(
        "John",
        "Doe",
        "1234567890",
        "john.doe@example.com",
        "This is a very long confirmation note.".repeat(10),
        "Apt 101",
        "New York",
        "NY",
        "USA",
        "10001",
        "Thank you!".repeat(5)
    );
    }
// Valid input
    @Test
    public void checkOutDelivery_Valid() {
    eAddToCart.checkOutDelv("John", "Doe", "1234567890", "john.doe@example.com", "Valid delivery note", "Apt 101", "New York", "NY", "USA", "10001");
    }

// Blank inputs
    @Test
    public void checkOutDelivery_BlankAddress() {
    eAddToCart.checkOutDelv("John", "Doe", "1234567890", "john.doe@example.com", "No address provided", "", "New York", "NY", "USA", "10001");
    }

    @Test
    public void checkOutDelivery_BlankCity() {
    eAddToCart.checkOutDelv("John", "Doe", "1234567890", "john.doe@example.com", "No city provided", "Apt 101", "", "NY", "USA", "10001");
    }

// Out-of-bound inputs
    @Test
    public void checkOutDelivery_InvalidPostalCode() {
    eAddToCart.checkOutDelv("John", "Doe", "1234567890", "john.doe@example.com", "Invalid postal code", "Apt 101", "New York", "NY", "USA", "ABCDE");
    }

    @Test
    public void checkOutDelivery_LongAddress() {
    eAddToCart.checkOutDelv(
        "John",
        "Doe",
        "1234567890",
        "john.doe@example.com",
        "Long delivery note",
        "Apt 101".repeat(10),
        "New York".repeat(5),
        "NY",
        "USA",
        "10001"
    );
    }


}
