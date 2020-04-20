package gmail_pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gmail_pom.qa.base.TestBase;

public class SecondPage extends TestBase{

	//PageFactory OR
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[1]/div/div[2]/div")
	WebElement headLine;
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(className = "RveJvd snByac")
	WebElement nxt;
	
	public SecondPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Function
//	public String verifyHeader() {
//		return headLine.getText();
//	}
	
	public void pwdEntire(String p) {
		pwd.sendKeys(p);
	}
	
	public void nextBttn() {
		nxt.click();
	}
}
