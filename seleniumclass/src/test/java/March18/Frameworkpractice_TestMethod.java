package March18;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkpractice_TestMethod  {

	public static void main(String[] args) throws Exception {
		
	
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	AutomationPracticePage_POMmethod d = new AutomationPracticePage_POMmethod(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.enterUsername("abcd");
		Thread.sleep(2000);
		d.enterPwd("def");
		d.clickSignin();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
	
		d.enterUsername("rahulshettyacademy");
		d.enterPwd("learning");
		d.clickSignin();
		
				
	}

}