package March18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticePage_POMmethod {   //Page Object Model Class POM
	
	//POM 
	
	String name; 
	
	@FindBy(name="username")                     // Declaration using Findby Annotation
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pword;
	
	@FindBy(xpath="//input[@id='signInBtn']")
	private WebElement signin;
	
	

	public AutomationPracticePage_POMmethod(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);   //
		
	}
	public void enterUsername(String username)
	{
		
		uname.sendKeys(username);		
	}
	public void enterPwd(String password )
	{
		
		pword.sendKeys(password);		
	}
	public void clickSignin()
	{
		
		signin.click();	
	}	
}
	
	
	
	
//	private WebElement uname;     
//	private WebElement pword;
//	private WebElement signin;
//	//admin checkbox
	//usercheckbox
	//I agree checkbox
	
//	public AutomationPracticePage_POMmethod(WebDriver driver)
//	{
//	   this.uname=driver.findElement(By.name("username"));
//	   this.pword=driver.findElement(By.name("password"));
//	   this.signin=driver.findElement(By.name("signin"));
//		
//	}