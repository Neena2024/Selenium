package Feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb14_sample9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample9.html");
driver.findElement(By.xpath("//input[1][@value='bhanu']")).clear();
Thread.sleep(2000);
//driver.findElement(By.linkText("Link")).click();
driver.findElement(By.xpath("//input[@id='A5']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='A6']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='OK']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.close();
	}

}
