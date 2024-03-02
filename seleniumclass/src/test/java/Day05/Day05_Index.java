package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample3.html");
driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Neena");
Thread.sleep(2000);
driver.close();

	}

}
