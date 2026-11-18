import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class AssertionsDemo {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
    public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void testDashboardUI() {
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		
		//Assert stmts
		Assert.assertEquals(actualURL, expectedURL, "Login failed - URL mismatch ");
	}
	
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	

}
