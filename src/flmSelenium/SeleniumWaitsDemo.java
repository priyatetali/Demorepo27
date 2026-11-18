package flmSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Implicit wait
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			
			driver.findElement(By.xpath("//button[text()='Start']")).click();
			
			//Explicit wait
		//	WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//	WebElement status = explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		//	System.out.println("Status message" + status.getText());
			
			//Fluent wait 
			Wait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
			fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
			
			//Static wait
			Thread.sleep(2000);
		}
		finally {
			driver.quit();
		}
		

	}

}
