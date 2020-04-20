package demosite.qa.pagefunction;

import org.openqa.selenium.support.PageFactory;
import demosite.qa.base.TestBase;
import demosite.qa.objectrespo.UserPageOR;

public class UserPageFunc extends TestBase{

	UserPageOR userpage = new UserPageOR();
	
	public UserPageFunc()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddUser() {
		userpage.addUser.click();
	}
	
	public void addUsername(String user, String pwd)
	{
		userpage.username.sendKeys(user);
		userpage.password.sendKeys(pwd);
		userpage.savebtn.click();
	}
}
