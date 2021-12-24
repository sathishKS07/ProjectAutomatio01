package org.test.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement textuser;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement textpass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnlogin;
	
	
	public WebElement getTextuser() {
		return textuser;
	}
	public WebElement getTextpass() {
		return textpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	

}
