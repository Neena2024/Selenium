package March16_FrameworkBasics;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				OrangeHRMLoginPage a= new OrangeHRMLoginPage(driver);
				
				a.sendUname("abcd");
				a.sendPwd("bcd");
				a.clickBtn();
				
			}

	}

