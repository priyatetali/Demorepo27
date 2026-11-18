package flmSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try
		{
			driver.get("https://jqueryui.com/datepicker/");
			driver.switchTo().frame(0);
			
	//	    15/August/2026
			
			String targetDay = "15";
			String Month = "August";
			String Year = "2027";
			
			driver.findElement(By.id("datepicker")).click();
			
			while(true) {
			String CurrentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String CurrentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			if (CurrentMonth.equals(Month) && CurrentYear.equals(Year) ) {
				System.out.println("Success");
				break;
			}
		    driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			}
			
			List <WebElement> allDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			for(WebElement day : allDays) {
				if(day.getText().equals(targetDay)) {
					day.click();
					break;
				}
			}
		}
		
		
		finally {
			driver.close();
		}

	}

}
