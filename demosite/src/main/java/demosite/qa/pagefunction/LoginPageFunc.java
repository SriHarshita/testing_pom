package demosite.qa.pagefunction;

import org.openqa.selenium.support.PageFactory;

import demosite.qa.base.TestBase;
import demosite.qa.objectrespo.loginPageOR;

public class LoginPageFunc extends TestBase{
 
	loginPageOR loginpage = new loginPageOR();
	
	public LoginPageFunc()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin()
	{
		loginpage.loginbtn.click();
	}
	
	public void login(String user,String pwd)
	{
		loginpage.username.sendKeys(user);
		loginpage.password.sendKeys(pwd);
		loginpage.submitbtn.click();
	}
}
