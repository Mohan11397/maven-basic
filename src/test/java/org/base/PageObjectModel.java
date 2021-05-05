package org.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends BaseClass {

	public PageObjectModel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@name='pass']")})  private List<WebElement> Username; //or
	@FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@name='pass']")}) private List <WebElement> password;
//	@FindBy(id="email") private WebElement Username;
//	@FindBy(xpath="//input[@name='pass']") private WebElement password;
	


	public List<WebElement> getUsername() {
		return Username;
	}


	public List <WebElement> getPassword() {
		return password;
	}
}
