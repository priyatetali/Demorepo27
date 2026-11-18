package flmSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			driver.manage().window().maximize();
			
			driver.get("https://demoblaze.com/index.html");
			
			driver.findElement(By.id("login2")).click();
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
			
			driver.findElement(By.id("loginusername")).sendKeys("Priya_T");
			driver.findElement(By.id("loginpassword")).sendKeys("E2eDemo");
			
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6"))).click();
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart"))).click();
			
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			driver.findElement(By.id("cartur")).click();
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.id("name")).sendKeys("FLM demo");
			driver.findElement(By.id("country")).sendKeys("India");
			driver.findElement(By.id("city")).sendKeys("Hyderabad");
			driver.findElement(By.id("card")).sendKeys("Visa");
			driver.findElement(By.id("month")).sendKeys("June");
			driver.findElement(By.id("year")).sendKeys("2026");
			
			driver.findElement(By.xpath("//button[text()='Purchase']")).click();
			
			Thread.sleep(5000);
		}
		
		finally {
			driver.quit();
		}

	}

}
