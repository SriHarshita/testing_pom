package demosite.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demosite.qa.base.TestBase;
import demosite.qa.pagefunction.LoginPageFunc;

public class LoginPageTest extends TestBase{

	LoginPageFunc loginpage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginpage = new LoginPageFunc();
	}
	
	@Test
	public void verifyLoginPage()
	{
		loginpage.clickLogin();
		String url = driver.getTitle();
		Assert.assertEquals(url, "Login example page to test the PHP MySQL online system");
	}
	
	@Test
	public void validLogin()
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.print("login successfully");
	}
}

