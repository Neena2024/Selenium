package Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07_DependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//td[contains(text(),'pdfrun')]/..//td[5]")).click();

	}

}
