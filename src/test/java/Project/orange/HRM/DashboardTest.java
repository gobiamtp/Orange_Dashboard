package Project.orange.HRM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest extends TestBaseClass {

	loginpage login;
	Dashboard dashboard;
	Directory dir;
	
	public DashboardTest() { 
		super();
		}
	
		@BeforeMethod
		
	public void setUp(){
		initialization();
		login = new loginpage();		
	 dashboard=login.loginpage(pr.getProperty("username"), pr.getProperty("password"));
		
	}
	@Test
		public void Dash_Frame1()
		{
			dashboard.Time_At_Work();
		}
		@Test
		public void help()
		{
			dashboard.helpicon();
		}
		@Test
		public void Profilepage()
		{
			dashboard.profiledd();
		}
		
		@Test
		public void MyActionsFrame()
		{
			dashboard.Myaction();
			
		} 
		
		@Test
		public void quicklaunch()
		{
			dashboard.quicklaunch();
			
		}
		@Test
		public  void  Bottommenu()
		{
			dashboard.bottom();
		}
		
		@AfterMethod
		public void closebrowser()
		{
			driver.quit();
		}
		
		
		}
