package Feb28;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_OrangeHRM_BookAFreeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		driver.manage().window().maximize();
		Set<String> whs = driver.getWindowHandles();
		for (String child: whs)
		{
		driver.switchTo().window(child);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("OrangeHRM HR Software | OrangeHRM"))
		{
			driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			driver.findElement(By.name("FullName")).sendKeys("Neena Varghese");
			driver.findElement(By.name("Email")).sendKeys("neenaannmary11@gmail.com");
			driver.findElement(By.id("Form_getForm_Contact")).sendKeys("4165004356");
	
		}
	
		}
}
	}
			
	
	

