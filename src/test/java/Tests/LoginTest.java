package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set ChromeDriver path (Optional if already set in system PATH)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @Test
    public void testValidLogin() {
        // Click on 'Signup / Login' button
        driver.findElement(By.linkText("Signup / Login")).click();

        // Enter valid email and password
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        emailInput.sendKeys("validemail@example.com");
        passwordInput.sendKeys("validpassword");

        // Click 'Login' button
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        // Verify successful login
        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(logoutLink.isDisplayed(), "Logout link is not visible. Login failed.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
