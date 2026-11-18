package flmSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelDataDrivenLogin {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\SSS COMPUTERS\\eclipse-workspace\\ Selenium_Demo\\LoginTestData.xlsx";
		
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			for(int i=1; i<=6; i++) {
				
				String UserName = sheet.getRow(i).getCell(0).getStringCellValue();
				String Password = sheet.getRow(i).getCell(1).getStringCellValue();
				
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				driver.findElement(By.id("username")).sendKeys(UserName);
				driver.findElement(By.id("password")).sendKeys(Password);
				driver.findElement(By.id("submit")).click();
				
				WebElement Message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
				
				if(Message.getText().contains("Logged In Successfully")) {
					System.out.println("Test case is passed");
				}
				else {
					System.out.println("Test case is failed");
				}
			}
			
			
		}
		catch (IOException e) {
			e.printStackTrace();		}
	}

}
