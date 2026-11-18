package flmSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class CheckboxRadioDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Radio Buttons
		
		WebElement Option1 = driver.findElement(By.id("vfb-7-1"));
		WebElement Option2 = driver.findElement(By.id("vfb-7-2"));
		WebElement Option3 = driver.findElement(By.id("vfb-7-3"));
		
		Option2.click();
		
		System.out.println("Option1 staus: " + Option1.isSelected());
		System.out.println("Option2 staus: " + Option2.isSelected());
		System.out.println("Option3 staus: " + Option3.isSelected());
		
		//Check boxes
		
	    WebElement Checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement Checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
				
		Checkbox1.click();
		Checkbox2.click();
		Checkbox3.click();
				
		System.out.println("Checkbox1 staus: " + Checkbox1.isSelected());
		System.out.println("Checkbox2 staus: " + Checkbox2.isSelected());
		System.out.println("Checkbox3 staus: " + Checkbox3.isSelected());
		
		if(Checkbox3.isSelected()) {
			Checkbox3.click();
		}
		
		if(Checkbox2.isSelected()) {
			Checkbox2.click();
		}
		
		//Status after un-selecting
		System.out.println("Checkbox1 staus: " + Checkbox1.isSelected());
		System.out.println("Checkbox2 staus: " + Checkbox2.isSelected());
		System.out.println("Checkbox3 staus: " + Checkbox3.isSelected());
		
		driver.quit();
		
		
		

	}

}
