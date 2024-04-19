package March16_FrameworkBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1 {

class Demo4 {

	public void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DefiningConstructor d1 = new DefiningConstructor(driver);
		d1.sendUsername("Neena");      
	}

}
	}


