package gmail_pom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import gmail_pom.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\sriharshita.silla\\eclipse-workspace\\gmail_pom\\src\\main\\java\\gmail_pom\\qa\\config\\config.properties");
			prop.load(ip);
			  
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("ie"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriharshita.silla\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
