import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
    
	WebDriver driver;
	
	@Test(groups = {"smoke", "Regression"})
	public void GogleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement Searchbar = driver.findElement(By.name("q"));
		Searchbar.sendKeys("Selenium info");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
