package March16_FrameworkBasics;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class OrangeHRMLoginPage {
		
		 //declaration
		private WebElement uname;
		private WebElement pwd;
		private WebElement lgnBtn;
		
		//Initialization
		
		public OrangeHRMLoginPage(WebDriver driver)
		{
			this.uname=driver.findElement(By.name("username"));
			this.pwd=driver.findElement(By.name("password"));
			this.lgnBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		}
		
		public void sendUname(String username)
		{
			uname.sendKeys(username);
		}
		public void sendPwd(String password)
		{
			pwd.sendKeys(password);
		}
		
		public void clickBtn()
		{
			lgnBtn.click();
		}
		

	}


