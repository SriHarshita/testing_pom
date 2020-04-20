package demosite.qa.objectrespo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demosite.qa.base.TestBase;

public class UserPageOR extends TestBase{

	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	public WebElement addUser;
	
	@FindBy(name = "username")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "FormsButton2")
	public WebElement savebtn;
	
	public UserPageOR()
	{
		PageFactory.initElements(driver, this);
	}
}
