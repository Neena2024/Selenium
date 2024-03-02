package Feb26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingNewTabwithExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Free')]")).click();
		Set<String> whs = driver.getWindowHandles();
       for (String window : whs) 
       {
		driver.switchTo().window(window);
		String title1 = driver.getTitle();
		System.out.println(title1);
		if (title1.equals("RS Academy"))
		{
			driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
			driver.close();
		} 
       }
	}
}
		
		
