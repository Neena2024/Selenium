package Feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_using_Index {

	public static void main(String[] args) throws InterruptedException {
// Assignment_OrangeHRM_BookAFreeDemo
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Hello");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Stay signed out']"));
		System.out.println(ele.getText());
	    Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='About']")).click();
		driver.close();
	}

}
