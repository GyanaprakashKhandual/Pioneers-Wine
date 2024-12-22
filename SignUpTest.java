package Script;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.SignUp;
import Page.setup;

public class SignUpTest {

    static WebDriver driver;
    static setup eSetup;
    static SignUp eSignUp;

    @BeforeClass
    public static void setUp() {
       
        driver = new ChromeDriver();
        eSetup = new setup(driver);
        eSignUp = new SignUp(driver);
        eSetup.openApp("https://pay-pal-pioneers-068.vercel.app/");
    }

    @Test
    public void testSignUpValid() {
        eSignUp.register("Gyana Prakash Khandual", "gyanaprakashkhnadual@gmail.com", "CHRIS@123", "User", "Register");
    }

    @Test
    public void testLoginvalid(){
        eSignUp.Login("gyanaprakashkhnadual@gmail.com", "ChRIS@123", "Login", "Gyana prakash Khandual");
    }

        // 10 Test Cases for Registration
        @Test
        public void testSignUpValid1() {
            eSignUp.register("John Doe", "john.doe@example.com", "Password@123", "User", "Register");
        }
    
        @Test
        public void testSignUpValid2() {
            eSignUp.register("Jane Smith", "jane.smith@example.com", "Secure@456", "User", "Register");
        }
    
        @Test
        public void testSignUpValid3() {
            eSignUp.register("Michael Scott", "michael.scott@dundermifflin.com", "Dunder@123", "Admin", "Register");
        }
    
        @Test
        public void testSignUpValid4() {
            eSignUp.register("Dwight Schrute", "dwight@beets.com", "Beets@Farm123", "User", "Register");
        }
    
        @Test
        public void testSignUpValid5() {
            eSignUp.register("Jim Halpert", "jim.halpert@pranks.com", "Pam@456", "User", "Register");
        }
    
        @Test
        public void testSignUpValid6() {
            eSignUp.register("Pam Beesly", "pam.beeslyart.com", "Art@1234", "Admin", "Register");
        }
    
        @Test
        public void testSignUpValid7() {
            eSignUp.register("Stanley Hudson", "stanley@crossword.com", "Pretzel@789", "User", "Register");
        }
    
        @Test
        public void testSignUpValid8() {
            eSignUp.register("Angela Martin", "angela@cats.com", "Sprinkles@123", "Admin", "Register");
        }
    
        @Test
        public void testSignUpValid9() {
            eSignUp.register("Kevin Malone", "kevin@chili.com", "Chili@321", "User", "Register");
        }
    
        @Test
        public void testSignUpValid10() {
            eSignUp.register("Oscar Martinez", "oscar@accounting.com", "Numbers@123", "Admin", "Register");
        }
    
        // 10 Test Cases for Login
        @Test
        public void testLoginValid1() {
            eSignUp.Login("john.doe@example.com", "Password@123", "Login", "John Doe");
        }
    
        @Test
        public void testLoginValid2() {
            eSignUp.Login("jane.smith@example.com", "Secure@456", "Login", "Jane Smith");
        }
    
        @Test
        public void testLoginValid3() {
            eSignUp.Login("michael.scott@dundermifflin.com", "Dunder@123", "Login", "Michael Scott");
        }
    
        @Test
        public void testLoginValid4() {
            eSignUp.Login("dwight@beets.com", "Beets@Farm123", "Login", "Dwight Schrute");
        }
    
        @Test
        public void testLoginValid5() {
            eSignUp.Login("jim.halpert@pranks.com", "Pam@456", "Login", "Jim Halpert");
        }
    
        @Test
        public void testLoginValid6() {
            eSignUp.Login("pam.beesly@art.com", "Art@1234", "Login", "Pam Beesly");
        }
    
        @Test
        public void testLoginValid7() {
            eSignUp.Login("stanley@crossword.com", "Pretzel@789", "Login", "Stanley Hudson");
        }
    
        @Test
        public void testLoginValid8() {
            eSignUp.Login("angela@cats.com", "Sprinkles@123", "Login", "Angela Martin");
        }
    
        @Test
        public void testLoginValid9() {
            eSignUp.Login("kevinchili.com", "Chili@321", "Login", "Kevin Malone");
        }
    
        @Test
        public void testLoginValid10() {
            eSignUp.Login("oscar@accounting.com", "Numbers@123", "Login", "Oscar Martinez");
        }

        @Test
        public void testLogoutvalid(){
            eSignUp.logOut("gyanaprakashkhnadual@gmail.com", "CHRIS@123");
        }
}
