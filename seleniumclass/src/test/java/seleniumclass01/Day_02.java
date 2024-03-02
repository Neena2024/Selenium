package seleniumclass01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_02 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com");
String Title = driver.getTitle();
System.out.println(Title);
String Url = driver.getCurrentUrl();
System.out.println(Url);
String src = driver.getPageSource();
System.out.println(src);
driver.manage().window().maximize();
driver.manage().window().minimize();
Dimension d = new Dimension(500, 200);
driver.manage().window().setSize(d);


Point p = new Point(400,250);
driver.manage().window().setPosition(p);

Dimension d1 = driver.manage().window().getSize();
System.out.println(d1);
Thread.sleep(3000);
driver.close();
	
	}

}