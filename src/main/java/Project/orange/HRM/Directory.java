package Project.orange.HRM;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Directory extends TestBaseClass {

	

	public static Properties pr; 
	 
	
	
	//@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-directory-card-description --break-words']")
	//WebElement location; 
	
	
	//Taking the  values  from  My info  
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement myinfo ;
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewJobDetails/empNumber/7']")
	WebElement job;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
    WebElement jtitle;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
    WebElement j1;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	WebElement j2;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[4]")
	WebElement mylocation;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[5]")
	WebElement j3;
	
	
	//Directory module 
	//@FindBy(xpath="//span[text()='Directory']")
	//WebElement dir;
	@FindBy(xpath="//a[@href='/web/index.php/directory/viewDirectory']")
	WebElement dir ;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement Employeename;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement jobtitle;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement location;
	@FindBy(xpath="//button[@type='submit']")
	WebElement search ;
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset ; 
	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card'])[1]")
	WebElement Frame1 ;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-up-fill']")
	WebElement uparrow;
	
	
	//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card']
	@FindBy(xpath="(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card'])[2]")
	WebElement Frame2 ;
	 @FindBy(xpath="(//i[@class='oxd-icon bi-arrow-right'])[2]")
		WebElement rightarrow ;
	//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']
   

public Directory() { 
	PageFactory.initElements(driver, this);
		
}

public void myinfo()
{
	System.out.println("click on my info");
	myinfo.click();
	System.out.println("click on JOB");
	job.click();
	System.out.println("getting the  values of  job title  and  location  ");
	String jt = null ; 
			jt =driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).getAttribute("Value");
	//String title ;
	//title=jt.getAttribute("Value");
	System.out.println("getting the  values of  job title "+ jt);
	
	WebElement lc =driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]"));
	String title1 ;
	title1=lc.getAttribute("Value1");
	String loc =mylocation.getText();
	System.out.println("getting the  values of   location  " +loc);
	

}

public void dropdown() throws InterruptedException 
	
{
	
	
	System.out.println("clicking on directory");	
	dir.click();
	WebElement listbox1 = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	String option = listbox1.getText();
	 System.out.println("p1 ");
	 System.out.println(option); //prints selected option.
      String first =option.substring(0, option.indexOf(" "));
		System.out.println(first); 
		Employeename.sendKeys(first); 
		Thread.sleep(5000);
		Employeename.sendKeys(Keys.ARROW_DOWN);
		Employeename.sendKeys(Keys.ENTER);
		search.click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		uparrow.click();
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//div[@class='oxd-grid-4']"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
        Element.click();*/
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		Frame1.click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Frame2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rightarrow.click();
		
		
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

private Actions Actions(WebDriver driver) {
	// TODO Auto-generated method stub
	return null;
}



}
