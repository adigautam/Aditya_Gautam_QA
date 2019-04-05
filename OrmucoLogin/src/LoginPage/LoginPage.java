package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author adityagautam
 * This class will store all the locator and methods of login page
 */
public class LoginPage 
{
	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By signin=By.xpath("//button[starts-with(@type,'submit')]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;

	}
	
	public void OrmucoLogin(String userid,String pwd) throws InterruptedException
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signin).click();
		Thread.sleep(300);
	}

}
