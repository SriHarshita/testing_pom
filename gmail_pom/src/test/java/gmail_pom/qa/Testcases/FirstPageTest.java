package gmail_pom.qa.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import gmail_pom.qa.base.TestBase;
import gmail_pom.qa.pages.FirstPage;
import gmail_pom.qa.pages.SecondPage;

public class FirstPageTest extends TestBase{

	FirstPage firstpage;
	SecondPage secondpage;
	//it is used to call the parent class constructor
	public FirstPageTest() {
		super();
	}
	@BeforeTest
	public void setUp() {
		initialization();
		firstpage = new FirstPage();
	}
	
	@Test(priority=1)
	public void firstPageTitleTest() {
		String title = firstpage.validateFirstPage();
		Assert.assertEquals(title,"Gmail");
	}
	
	@Test(priority=2)
	public void firstpageUsernameTest() {
		firstpage.login(prop.getProperty("username"));
		Assert.assertEquals(prop.getProperty("username"), "harshitasilla@gmail.com");
	}
	
	@Test(priority=3)
	public void nextPage() {
		secondpage = firstpage.nextbtn();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

