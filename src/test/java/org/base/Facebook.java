package org.base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass {
	
public static void main(String[] args) throws Exception {
		
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		getTheTitle();
		getTheCurrentUrl();
		
//		WebElement click = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
//		clickTheButton(click);
		
		Thread.sleep(2000);
		
//	WebElement newaccount = driver.findElement(By.name("birthday_day"));
		
//		selectTheValue(newaccount, "11");
		

	
		screen();
		
		
		
		
		
		
	//	WebElement user = driver.findElement(By.id("email"));
	//	fillTheText(user, "mohan");
		
	
		
	}



}
	

