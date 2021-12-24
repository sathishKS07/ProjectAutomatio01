package org.test;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.test.pom.LoginPage;

public class TestClass2 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		
		LoginPage l=new LoginPage();
		sendKeys(l.getTextuser(),getExcelValue("FaceBookLogin", "Login", 1, 0));
		sendKeys(l.getTextpass(),getExcelValue("FaceBookLogin", "Login", 1, 2));
		btnclick(l.getBtnlogin());
		System.out.println();
	}

}
