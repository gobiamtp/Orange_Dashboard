package Project.orange.HRM;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard extends TestBaseClass {
	
	//Profile 
	

	@FindBy(xpath="//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")
	WebElement closeabout; 
		
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement Profile_dropdown; 
	
	@FindBy(linkText="About")
	WebElement About; 
	
	@FindBy(linkText="Support")
	WebElement support; 
	
	@FindBy(linkText="Change Password")
	WebElement Cpass; 
	
	@FindBy(linkText="Logout")
	WebElement lout; 	
	
	//Side menu  

	@FindBy(xpath="//button[@class='oxd-icon-button oxd-main-menu-button']")
	WebElement larrow;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-right']")
	WebElement rarrow;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashboard;
//	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
    //WebElement dashboard;
	
	//Dashboard frame 
	
	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[1]")
	WebElement dash_frame1;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[2]")
	WebElement MyActionFrame;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[3]")
	WebElement dash_frame3;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[4]")
	WebElement dash_frame4;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[5]")
	WebElement dash_frame5;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[6]")
	WebElement dash_frame6;
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[7]")
	WebElement dash_frame7;
	@FindBy(xpath="(//p[text()='Time at Work']")
	WebElement time;
	@FindBy(xpath="//i[@class='oxd-icon bi-stopwatch']")
	WebElement time_icon;
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--warn orangehrm-report-icon']")
	WebElement timesheetapprove;
  @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
  WebElement profilename;
  @FindBy(xpath="//span[text()='Directory']")
	WebElement dire ;
  @FindBy(xpath="//i[@class='oxd-icon bi-question-lg']")
	WebElement helpicon ;
    //My action  
  @FindBy(xpath="(//div[@class='orangehrm-todo-list-item'])[1]")
	WebElement Leaverequest ;
  @FindBy(xpath="(//div[@class='orangehrm-todo-list-item'])[2]")
 	WebElement TimeApproval ;
  @FindBy(xpath="(//div[@class='orangehrm-todo-list-item'])[3]")
 	WebElement Pending ;
  @FindBy(xpath="(//div[@class='orangehrm-todo-list-item'])[4]")
 	WebElement Candiate ;
 
  //Quicklaunch 
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[1]")
	WebElement assleave ;
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[2]")
	WebElement llist ;
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[3]")
	WebElement timesheet ;
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[4]")
	WebElement applyleave;
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[5]")
	WebElement myleave ;
  @FindBy(xpath="(//button[@class='oxd-icon-button orangehrm-quick-launch-icon'])[6]")
	WebElement mytimesheet ;
  //Bottom menu  
  @FindBy(linkText="OrangeHRM, Inc")
	WebElement Bmenu; 
  
  
  
  
  
  
	public Dashboard() { 
		PageFactory.initElements(driver, this);
	}
		
	public void Time_At_Work ()
	{
		time_icon.click(); 
		System.out.println("returing to  dashboard  screen");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dire.click(); 
		//Select listbox = new Select(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")));
							
		}
	public void helpicon()
	{  
		helpicon.click();
	}
	
public void profiledd() 
	
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Profile_dropdown.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About")));
		System.out.println("About clicked ");
		About.click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")));
		System.out.println("About closed clicked ");
		closeabout.click();
		Profile_dropdown.click();
		System.out.println("suport linked clicked  ");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Support")));
		support.click();
		System.out.println("Change password  clicked ");
		Profile_dropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change Password")));
		Cpass.click();	
		System.out.println("Logout clicked ");
		Profile_dropdown.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))); 
		lout.click();
	}
	
		
	public void Myaction()
	{
		if(Leaverequest==null)
		{
			System.out.println("No Element found  ");
		}
		else 
		{
			Leaverequest.click();
			System.out.println("Returing  to  Dashboard   ");
			dashboard.click();
			
		}
		if(TimeApproval==null)
		{
			System.out.println("No Element found  ");
		}
		else 
		{
			Leaverequest.click();
			System.out.println("Returing  to  Dashboard   ");
			dashboard.click();			
		}
		if(Pending==null)
		{
			System.out.println("No Element found  ");
		}
		else 
		{
			Leaverequest.click();
			System.out.println("Returing  to  Dashboard   ");
			dashboard.click();			
		}
		if(Candiate==null)
		{
			System.out.println("No Element found  ");
		}
		else 
		{
			Leaverequest.click();
			System.out.println("Returing  to  Dashboard   ");
			dashboard.click();			
		}
		
		
	}
	public void quicklaunch()
	{
		assleave.click();
		System.out.println("Clicked on assigned  Leave  ");
		dashboard.click();	
		
		llist.click();
		System.out.println("Clicked on Leavelist");
		
		dashboard.click();	
		System.out.println("Clicked on timesheet");
		timesheet.click();
		dashboard.click();	
		System.out.println("Clicked on apply leave");
		applyleave.click();
		dashboard.click();	
		System.out.println("Clicked on my leave");
		myleave.click();
		dashboard.click();	
		System.out.println("Clicked on My time sheet  leave");
		mytimesheet.click();
		dashboard.click(); 
		
	}
	 
	public void bottom()
	{
		Bmenu.click();
		System.out.println("Bottom meuclicked ");
	}
	
	
	}
	
	
	
	



