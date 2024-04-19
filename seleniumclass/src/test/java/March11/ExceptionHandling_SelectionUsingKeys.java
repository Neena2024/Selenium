package March11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling_SelectionUsingKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement framele=null;
WebDriver driver = new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
//WebElement framele = driver.findElement(By.xpath("//iframe[@name='notification-frame-~251439651']"));
//driver.switchTo().frame(framele);
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("a.close")).click();
//Thread.sleep(2000);
//driver.switchTo().defaultContent();
//Thread.sleep(2000);   
try {   //for html inconsistent pop up
	framele= driver.findElement(By.xpath("//iframe[@name='notification-frame-~251439651']"));
	driver.switchTo().frame(framele);

	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a.close")).click();
	Thread.sleep(2000);
} catch (Exception e) {
	// Handle the case where the notification frame is not found
} finally {
	// Switch back to the default content outside the try-catch block
	driver.switchTo().defaultContent();
}

Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='From']")).click();
Thread.sleep(2000);

WebElement frombutton = driver.findElement(By.xpath("//input[@placeholder='From']"));
frombutton.sendKeys("ben");
Thread.sleep(2000);
frombutton.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
frombutton.sendKeys(Keys.ENTER);
	}
}


