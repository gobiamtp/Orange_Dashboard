package Project.orange.HRM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DirTest extends TestBaseClass {

	loginpage login;
	Directory dir;
	
	public DirTest() { 
		
		super();
		}
	
		@BeforeMethod
		
	public void setUp(){
		initialization();
		login = new loginpage();
		dir=login.loginpage1(pr.getProperty("username"), pr.getProperty("password"));
		
	}
		@Test
		public void DP() 
		{
	      dir.dropdown();
		 
		}
		@AfterMethod
		public void close_browser(){
			driver.quit();
		}

}
