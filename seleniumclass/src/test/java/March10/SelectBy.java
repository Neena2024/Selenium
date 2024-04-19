package March10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample15.html");
		WebElement dropdown = driver.findElement(By.id("A1"));
		Select select = new Select(dropdown);
		Thread.sleep(2000);
		select.selectByIndex(1);  //selecting by index 
		Thread.sleep(2000);
		select.selectByVisibleText("Chennai"); //selecting by visible text
	Thread.sleep(2000);
	select.selectByValue("d"); //selecting by value
	}

}
