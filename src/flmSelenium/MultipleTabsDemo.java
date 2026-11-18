package flmSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class MultipleTabsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Opening tab1---");
		driver.get("https://google.com");
		String firstHandle = driver.getWindowHandle();
		
		System.out.println("Opening tab2---");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://wikipedia.com");
		String secondHandle = driver.getWindowHandle();
		
		System.out.println("Opening tab3---");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");

		
		//To switch to first tab
		driver.switchTo().window(firstHandle);
		driver.switchTo().window(secondHandle);
		
		
		//To close one tab
		driver.close();
		
		//To completely close the browser
		driver.quit();

	}

}
