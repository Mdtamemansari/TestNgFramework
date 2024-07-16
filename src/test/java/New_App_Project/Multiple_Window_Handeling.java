package New_App_Project;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_Window_Handeling {
	
	@Test
	public void parentwindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindowid = driver.getWindowHandle();
		System.out.println("window id is :" +parentwindowid);
	}
	
	@Test
	public void Getmultiple_Window_ids() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> multiplewindowids = driver.getWindowHandles();
		for (String id : multiplewindowids) {
			System.out.println("window id is:" +id);
			
		}
	}
	
	@Test
	public void execute_multiple_window_hendling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindowid = driver.getWindowHandle();
		System.out.println("Parent_Window_id_is: " +parentwindowid);
		
		driver.findElement(By.id("name")).sendKeys("Ansari");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> multipleWindowIds =  driver.getWindowHandles();
		
		for (String ids : multipleWindowIds) {
			if (!ids.equals(multipleWindowIds)) {
				driver.switchTo().window(ids);
				Thread.sleep(2000);
				WebElement firstnamefield = driver.findElement(By.id("firstName"));
				firstnamefield.clear();
				firstnamefield.sendKeys("mohammed");
				
			}
			
		}
		
	}

}
