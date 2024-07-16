package New_App_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdata_from_Excel_ForLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement usernamefield = driver.findElement(By.id("Email"));
		WebElement passwordfield = driver.findElement(By.id("Password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		FileInputStream fp = new FileInputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fp);
		XSSFSheet sh = wo.getSheet("testdata");
		int rowcount = sh.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			
			XSSFRow r= sh.getRow(i);
			
			usernamefield.clear();
			usernamefield.sendKeys(r.getCell(0).getStringCellValue());
			Thread.sleep(2000);
			passwordfield.clear();
			passwordfield.sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(2000);
			loginbutton.click();
		}
		
		
		
	}

}
