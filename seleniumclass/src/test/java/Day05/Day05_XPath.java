package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:\\\\Users\\\\ivane\\\\Downloads\\\\SELENIUM\\\\Sample.html");
driver.findElement(By.xpath("/html/body/a[3]")).click();
driver.close();
}

}
