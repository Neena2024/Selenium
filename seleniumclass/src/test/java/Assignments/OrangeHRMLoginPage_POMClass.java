package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage_POMClass {
@FindBy (name="username")
private WebElement uname;
@FindBy(name="password")
private WebElement pswd;
@FindBy(xpath = "//button[@type='submit']")
private WebElement login;

public OrangeHRMLoginPage_POMClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void senduname (String username)  	//actions and method creation
{
uname.sendKeys(username);
}
public void sendpswd (String password)
{
pswd.sendKeys(password);
}
public void login()
{
login.click();
}
}
