package flmSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		System.out.println("---Gmail info---");
		
		//Using navigate method
	    //Website 1
		driver.navigate().to("https://www.google.com");
		System.out.println("New title: " + driver.getTitle());
		
		//Website 2
		driver.navigate().to("https://www.gmail.com");
		System.out.println("New title: " + driver.getTitle());
		
		//Website 3
		driver.navigate().to("https://www.abhibus.com");
		System.out.println("New title: " + driver.getTitle());
		
		//Back and forward
		driver.navigate().back();
		System.out.println("Back is clicked: " + driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Forward is clicked: " + driver.getTitle());
		
		//Refresh the browser
		driver.navigate().refresh();
		
		System.out.println("Page source length: " + driver.getPageSource().length());
		//System.out.println("Page source is: " + driver.getPageSource());
		
		//To close the browser
		driver.quit();

	}

}
