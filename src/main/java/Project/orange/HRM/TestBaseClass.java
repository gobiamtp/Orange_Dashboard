package Project.orange.HRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class TestBaseClass {

	public static WebDriver driver;
	public static Properties pr;   
	
		public TestBaseClass(){
			try {
		FileInputStream fs = new FileInputStream("D:\\Automation_training\\orange.HRM\\src\\main\\java\\com\\util\\properites\\data.properties");
		pr = new Properties();
		pr.load(fs);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//String browserName = pr.getProperty("browser");		
		public static  void initialization() 
		{
		ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
			System.out.println("Launching  Chrome  browser ");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			;
			System.out.println("driver:::::" +driver);
			driver.get(pr.getProperty("url"));
			
			
		
			
			
}			

	


}