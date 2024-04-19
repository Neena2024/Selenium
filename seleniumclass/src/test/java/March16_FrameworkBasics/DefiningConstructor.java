package March16_FrameworkBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DefiningConstructor {

		private WebElement ele;  //int i

		public DefiningConstructor(WebDriver driver)
		{
			this.ele=driver.findElement(By.name("username"));
		}

		public void sendUsername(String uname) {

			ele.sendKeys(uname); // hardcoded values

		}

}
