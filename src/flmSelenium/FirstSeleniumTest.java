package flmSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open google through Chrome browser
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    
	    //Open gmail through Firefox
	    WebDriver driver2 = new FirefoxDriver();
	    driver2.get("https://www.gmail.com");
	    driver2.manage().window().maximize();
	    
	   //Getting the page title
	  	String gmailTitle = driver.getTitle();
	  	System.out.println("Page Title: " + gmailTitle);
	  		
	  	//Capture the current URL
	  	String currentURL = driver.getCurrentUrl();
	  	System.out.println("Current URL: " + currentURL);


	}

}
