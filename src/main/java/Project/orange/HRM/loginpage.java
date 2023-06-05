package Project.orange.HRM;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginpage extends TestBaseClass {


		public static Properties pr; 
	 
		@FindBy(xpath="//div/input[@name='username']")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submitBtn;
	
	public loginpage() { 
		PageFactory.initElements(driver, this);
		
		
	}
	

 @Test
	public Dashboard  loginpage(String un, String pass )  {
	 username.sendKeys(un);
	 password.sendKeys(pass);
	 submitBtn.click();
	 return new Dashboard();
	
		
		
}
 @Test
	public Directory  loginpage1(String un, String pass )  {
	 username.sendKeys(un);
	 password.sendKeys(pass);
	 submitBtn.click();
	 return new Directory();
	
		
		
}

}
	