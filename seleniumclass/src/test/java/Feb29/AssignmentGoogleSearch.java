package Feb29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@data-ved='0ahUKEwiRt8L7nNSEAxUKIDQIHaFoDVgQ4dUDCB4'])")).click();
//((JavascriptExecutor) driver).executeScript("document.evaluate(\"//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");}
}
}
