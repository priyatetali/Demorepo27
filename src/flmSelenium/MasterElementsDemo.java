package flmSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import java.time.Duration;

public class MasterElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			driver.get("https://trytestingthis.netlify.app/");
			
			WebElement dropdown = driver.findElement(By.id("option"));
			
			Select selectoption = new Select(dropdown);
			
			//selectoption.selectByVisibleText("Option 3");
			//selectoption.selectByValue("option 2");
			selectoption.selectByIndex(1);

		}
		catch(Exception e){
			System.out.println("Exception block");
		}
		
		driver.quit();
	}

}
