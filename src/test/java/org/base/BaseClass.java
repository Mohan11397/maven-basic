package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class BaseClass {

	public static WebDriver driver;
	
	public static Select s;
	public static TakesScreenshot tk;
	public static void launchBrowser(String Browser) {
		
		if(Browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Maven\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if (Browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Maven\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else {
			
			System.setProperty("webdriver.ie.driver", "C:\\eclipse\\Maven\\driver\\IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();
			
			
		}
		
	}
	
	public static void launchUrl(String Url) {
	
	    	driver.get(Url);
	    	
	    	driver.manage().window().maximize();
	    	
		}


	public static void getTheTitle() {
		
	    	String title = driver.getTitle();
	    	
	    	System.out.println(title);

		}
	    
	public static void getTheCurrentUrl() {
		
	    	String currentUrl = driver.getCurrentUrl();
	    	
	    	System.out.println(currentUrl);

		}
	    
	public static void fillTheText(WebElement e, String value) {
			
	    	e.sendKeys(value);
	    	
		}
	    
	public static void clickTheButton(WebElement w) {
			
	    	w.click();

		}
	
	public static void selectTheValue(WebElement e,String value) {
		
	s= new Select(e);
	s.selectByValue(value);
		

	}

	public static void screen() throws IOException {
		tk=(TakesScreenshot) driver;
		File tem = tk.getScreenshotAs(OutputType.FILE);
		File per= new File("./screen/screenshot"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(tem, per);

	}
		
		
	
	
}
