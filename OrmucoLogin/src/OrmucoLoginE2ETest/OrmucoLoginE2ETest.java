package OrmucoLoginE2ETest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

/**
 * @author adityagautam
 */
public class OrmucoLoginE2ETest 
{

public WebDriver driver;
		@BeforeTest
		
		@Parameters("browsername")
		public void OrmucoBrowser(String browsername)
		{
			if(browsername.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "/Users/adityagautam/Desktop/Ormuco/geckodriver");
				setDriver(new FirefoxDriver());
			}
			else if(browsername.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/adityagautam/Desktop/Ormuco/chromedriver");
				setDriver(new ChromeDriver());
			}
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}

		public WebDriver getDriver() {
			return driver;
		}

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
	@Test
	public void Login() throws InterruptedException
	{
		driver.get("https://uat.ormuco.com/login");
		
		LoginPage login=new LoginPage(driver);
		
		login.OrmucoLogin("admin@ormuco.com", "demo123");
		
		if(driver.getPageSource().contains("The user or password is incorrect."))
		{
			System.out.println("The functionality is working good and the Test Case is Passed");
		}
		else {
			System.out.println("The functionality is not working good and the Test Case is Failed");
		}
		//driver.quit();
	}
	@AfterTest
	public void sessionclose()
	{
		driver.quit();
	}
}