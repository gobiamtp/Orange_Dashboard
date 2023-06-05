package Project.orange.HRM;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Directory extends TestBaseClass {

	private static final SearchContext driver = null;

	public static Properties pr; 
	 
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement Employeename;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement job ;
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dire ;
	
	@FindBy(xpath="//a[@href='/web/index.php/directory/viewDirectory']")
	WebElement dire1 ;
		
  @FindBy(xpath="((//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement dd1 ;
  @FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	WebElement ddclick ;
  @FindBy(xpath="(//div[@class='oxd-select-dropdown--positon-bottom']")
	WebElement dd ;
  @FindBy(xpath="(//div[text()='-- Select --'])[1]")
	WebElement dd2 ;
  @FindBy(xpath="//i[@class='oxd-icon bi-stopwatch']")
	WebElement time_icon;
  
 
	

public Directory() { 
	PageFactory.initElements(driver, this);
		
}

public void dropdown() 
	
{
	System.out.println("clicking on directory");
	time_icon.click(); 
	System.out.println("returing to  dashboard  screen");
	
	dire.click(); 
	
	WebElement listbox1 = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	String option = listbox1.getText();
	 System.out.println("p1 ");
	 System.out.println(option); //prints selected option.
      String first =option.substring(0, option.indexOf(" "));
		System.out.println(first); 
		Employeename.sendKeys(first); 
		//WebElement clickable = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		//new Actions(driver).clickAndHold(clickable).click();
		Employeename.sendKeys(Keys.ARROW_DOWN);
		Employeename.sendKeys(Keys.ENTER);
		
		/*
		 * List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div"));
	    System.out.println(allOptions.size());
	     
	             
	             
	    for(int i = 0; i<=allOptions.size(); i++) {
	         
	         
	        if(allOptions.get(i).getText().contains("IT Manager")) {
	             System.out.println("List ");
	             System.out.println(allOptions.get(i).getText());
	            allOptions.get(i).click();
	           
	            
	            break;
	        }
	    }
		
		 */
     
	

	
	
	
	List<WebElement> allOptions = driver.findElements((By) job);
    System.out.println(allOptions.size());
     
             
             
    for(int i = 0; i<=allOptions.size()-1; i++) {
         
         
        if(allOptions.get(i).getText().contains("IT Manager")) {
             System.out.println("List ");
             System.out.println(allOptions.get(i));
            allOptions.get(i).click();
            break;
             
        }    }

	
}



}
