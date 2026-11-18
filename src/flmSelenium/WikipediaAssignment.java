package flmSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class WikipediaAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		search.sendKeys("Selenium");
		
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		WebElement searchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		searchButton.click();
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Page title: " + driver.getTitle());
		
		driver.quit();

	}
}
