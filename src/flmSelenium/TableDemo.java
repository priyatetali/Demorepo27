package flmSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/th"));
		for(WebElement header:headers) {
			System.out.print(header.getText() + " | ");
		}
				
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		System.out.println("---Reading values from TABLE---");
		
		for(int i=1; i<rows.size(); i++) {
			List <WebElement> cols = driver.findElements(By.tagName("td"));
			
			for(WebElement col : cols) {
				System.out.print(col.getText() + "|");
				System.out.println();
			}
			
			File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("SS25072026.png");
			FileUtils.copyFile(screenshotfile, destinationfile);
			
			System.out.println("Screenshot is successful");
			
			driver.close();		}
		
		
	}

}
