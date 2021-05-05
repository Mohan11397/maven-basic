package org.base;

public class LoginPage extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		
		PageObjectModel l = new PageObjectModel();
		
		fillTheText(l.getUsername().get(0), "mohan");
		
		driver.navigate().refresh();
		
		fillTheText(l.getUsername().get(0), "flyrez");
		
		fillTheText(l.getPassword().get(0), "12345");
		
		
	}
	
}
