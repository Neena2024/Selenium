package Feb22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutor_popUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click(); //from right click menu click on Copy button
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert(); //To manage alert pop up in the web page
		alert.accept(); //To accept the alert pop-up
		//alert.dismiss();  This will dismiss the pop-up. If there is only one option both accept and dismiss will work
	}
	}


