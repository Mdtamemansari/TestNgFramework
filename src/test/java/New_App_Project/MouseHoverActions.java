package New_App_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverActions {
	
	@Test (priority = 2)
	public void rightclick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightbtn = driver.findElement(By.xpath("(//span)[1]"));
		Actions act = new Actions(driver);
		act.contextClick(rightbtn).build().perform();
		
	}
	
	@Test (priority = 0)
	public void MoveToElement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightbtn = driver.findElement(By.xpath("(//span)[1]"));
		WebElement copypath = driver.findElement(By.xpath("//Span[contains(text(),'Copy')]"));
		Actions act = new Actions(driver);
		act.contextClick(rightbtn).moveToElement(copypath).click().build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	@Test (priority = 1)
	public void DragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement dragblele = driver.findElement(By.id("draggable"));
		WebElement dropblele = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragblele, dropblele).build().perform();
	}
}
