package New_App_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
	@Test
	public void test_Iframes() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.tagName("p"));
		System.out.println(ele.getText());
	}

}
