package gmail_pom.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import gmail_pom.qa.base.TestBase;
import gmail_pom.qa.pages.FirstPage;
import gmail_pom.qa.pages.SecondPage;

public class SecondPageTest extends TestBase{

	SecondPage secondpage;
	FirstPage firstpage;
	public SecondPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		firstpage = new FirstPage();
		firstpage.login(prop.getProperty("username"));
		secondpage = firstpage.nextbtn();
	}
	
//	@Test(priority=1)
//	public void verifyHeaderLine() {
//		String headl = secondpage.verifyHeader();
//		Assert.assertEquals(headl, "harshitasilla@gmail.com");
//	}
	
	@Test(priority=1)
	public void secondPagePwd() {
		secondpage.pwdEntire(prop.getProperty("password"));
		Assert.assertEquals(prop.getProperty("password"), "sriharshi12");
	}
	
	@Test(priority=2)
	public void nxtBtn() { 
		secondpage.nextBttn();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
