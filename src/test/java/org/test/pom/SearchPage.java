package org.test.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	
	public SearchPage() {
		PageFactory.initElements(driver, SearchPage.class);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement textSearch;
	

	public WebElement getTextSearch() {
		return textSearch;
	}
	
	
	

}
