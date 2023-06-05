package Project.orange.HRM;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends TestBaseClass {

	Dashboard dash;
	loginpage login;
	
	
	public LoginTest() { 
		super();
		}
	
	
	
	
		@BeforeMethod
		
	public void setUp(){
		initialization();
		login = new loginpage();
		
	}
	@Test(priority=1)
	public  void loginTest(){
		
		dash = login.loginpage(pr.getProperty("username"), pr.getProperty("password"));
	}
	
	@AfterMethod
	public void close_browser(){
		driver.quit();
	}
	
	
}


