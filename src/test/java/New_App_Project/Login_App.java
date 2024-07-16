package New_App_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_App {
	@Test 
	public void Loginwith_Validdata() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.clear();
		usernamefield.sendKeys("student");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.clear();
		passwordfield.sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
	}
	
	@Test
	public void Loginwith_Invaliddata() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement usernamefield = driver.findElement(By.id("username"));
		usernamefield.clear();
		usernamefield.sendKeys("Admin");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.clear();
		passwordfield.sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
	}
	
	@Test
	public void Test_Alerts() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
