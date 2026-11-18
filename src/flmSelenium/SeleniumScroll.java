package flmSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			driver.get("https://jqueryui.com/droppable/");
			
			//scroll the page
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)");
			//bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			Thread.sleep(5000);
			
			WebElement frame = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(frame);
			
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement destination = driver.findElement(By.id("droppable"));
			
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, destination).perform();
			
			Thread.sleep(5000);
		}
		
		finally {
			driver.quit();
		}
		
	}

}
