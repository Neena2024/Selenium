package March10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Feb20.ActionsClass_ScrollTo;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//div[text()='Currency']")).click();
//driver.findElement(By.xpath("//div[text()='EUR']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
//driver.findElement(By.xpath("//div[text()='Adult']/../../div[2]//div[3]")).click();
driver.findElement(By.xpath("//div[text()='From']")).click();
driver.findElement(By.xpath("//div[text()='BLR']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[text()='To']")).click();  already active element is on To
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='COK']")).click();
driver.findElement(By.xpath("(//div[text()='19'])[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
	}
}
