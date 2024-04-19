package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_TestMethod {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	OrangeHRMLoginPage_POMClass n = new OrangeHRMLoginPage_POMClass(driver);
	n.senduname("Admin");
	n.sendpswd("admin123");
	n.login();
	}

}
