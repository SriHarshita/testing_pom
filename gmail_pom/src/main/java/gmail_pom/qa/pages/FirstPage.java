package gmail_pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gmail_pom.qa.base.TestBase;

public class FirstPage extends TestBase  {

	//Pagefactory OR
	@FindBy(id = "identifierId")
	WebElement user;
	
	@FindBy(className = "CwaK9")
	WebElement nextbtn;
	
	@FindBy(xpath = "//*[@id=\"headingText\"]/span")
	WebElement heading;
	
	public FirstPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateFirstPage()
	{
		return driver.getTitle();
	}
	
	public void login(String usrn) {
		user.sendKeys(usrn);
		
	}
	
	public SecondPage nextbtn() {
		nextbtn.click();
		return new SecondPage();
	}
}
