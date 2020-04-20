package demosite.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demosite.qa.base.TestBase;
import demosite.qa.pagefunction.UserPageFunc;

public class UserPageTest extends TestBase{

	UserPageFunc userFunc;
	public UserPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		userFunc = new UserPageFunc();
	}
	
	@Test(priority =1)
	public void clickaddusr()
	{
		userFunc.clickAddUser();
		String addus = driver.getTitle();
		Assert.assertEquals(addus, "Add a user - FREE PHP code and SQL");
	}
	
	@Test(priority =2)
	public void validData() {
		userFunc.addUsername(prop.getProperty("username"), prop.getProperty("password"));
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://thedemosite.co.uk/savedata.php");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
