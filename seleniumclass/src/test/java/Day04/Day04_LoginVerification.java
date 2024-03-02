package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_LoginVerification {

	public static void main(String[] args) throws InterruptedException {
		// Login verification of a page
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	//enter username
	driver.findElement(By.name("username")).sendKeys("admin");
	//enter password
	driver.findElement(By.name("password")).sendKeys("admin123");
	//click on login button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String expectedString="dashboard";
	
	driver.getCurrentUrl();
	

	}

}
