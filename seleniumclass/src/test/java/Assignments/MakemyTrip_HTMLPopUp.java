package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip_HTMLPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
WebElement framele = driver.findElement(By.xpath("//iframe[@name='notification-frame-~251439651']"));
driver.switchTo().frame(framele);
Thread.sleep(2000);
driver.findElement(By.cssSelector("a.close")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='From']")).click();
driver.findElement(By.xpath("//div[text()='HYD']")).click();
driver.findElement(By.xpath("//span[text()='To']")).click();
driver.findElement(By.xpath("//div[text()='BOM']")).click();
driver.findElement(By.xpath("//div[text()='April 2024']/../..//p[text()='5']")).click();
driver.findElement(By.xpath("//a[text()='Search']")).click();
	}

}
