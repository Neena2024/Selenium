package Feb22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
driver.findElement(By.id("name")).sendKeys("Neena");
driver.findElement(By.id("alertbtn")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
Thread.sleep(2000);
alert.accept();
driver.quit();

	}

}