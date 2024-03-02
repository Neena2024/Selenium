package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
//driver.get("file:///C:\\Users\\ivane\\Downloads\\SELENIUM\\Sample1.html");
//driver.findElement(By.cssSelector("a[id='a1']")).click();
driver.get("file:///C:\\Users\\ivane\\Downloads\\SELENIUM\\Sample.html");
driver.findElement(By.cssSelector("a[href='http://www.fb.com']")).click();
	}

}
