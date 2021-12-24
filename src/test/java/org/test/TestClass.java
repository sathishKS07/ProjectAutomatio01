package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestClass extends BaseClass  {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		timeOut(10);
		maximize();
		Robot r=new Robot();
	//Login
		
		WebElement textuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendKeys(textuser, "8056702086");
		WebElement textpass = driver.findElement(By.xpath("//input[@type='password']"));
		sendKeys(textpass, "sathish07");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnclick(btnlogin);
		
   //Search
		WebElement textSearch = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(textSearch, "mi smart watch for men");	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
   //Product Select
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement productSelect = driver.findElement(By.xpath("//div[text()='RACRO AZU-mi-A1 smart watch for men-94982 Smartwatch']"));
		 Thread.sleep(5000);
		btnclick(productSelect);
		
  //PlaceOrder	
		Set<String> windoesnum = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windoesnum);
		driver.switchTo().window(li.get(1));
		WebElement textpin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		textpin.clear();
		sendKeys(textpin, "606207");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement btnadd = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		btnclick(btnadd);
//		WebElement btnRemove1 = driver.findElement(By.xpath("(//div[text()='Remove'])[1]"));
//		btnclick(btnRemove1);
//		WebElement btnRemove2 = driver.findElement(By.xpath("(//div[text()='Remove'])[1]"));
//		btnclick(btnRemove2);
		WebElement btnplace = driver.findElement(By.xpath("//span[text()='Place Order']"));
		btnclick(btnplace);
//		WebElement textlogin = driver.findElement(By.xpath("//input[@type='text']"));
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		sendKeys(textlogin, "8056702086");
//		WebElement btnlogin2 = driver.findElement(By.xpath("//button[@type='submit']"));
//		btnclick(btnlogin2);
//		
	//Payment
		WebElement btndeliver = driver.findElement(By.xpath("//button[text()='Deliver Here']"));
		btnclick(btndeliver);
		WebElement btnContinue = driver.findElement(By.xpath("//button[text()='CONTINUE']"));
		btnclick(btnContinue);
		WebElement btnReturn = driver.findElement(By.xpath("//a[text()='Returns Policy']"));
		js.executeScript("arguments[0].scrollIntoView(true)", btnReturn);
		Thread.sleep(8000);
		WebElement btnradio = driver.findElement(By.xpath("(//span[text()='Credit / Debit / ATM Card']"));
		js.executeScript("arguments[0].scrollIntoView(false)", btnradio);
        btnclick(btnradio);
		WebElement enterCard = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(enterCard, "123456789123456");	
		
		WebElement selectMonth = driver.findElement(By.name("month"));
		Select sm=new Select(selectMonth);
		sm.selectByIndex(3);
		WebElement selectYear = driver.findElement(By.name("year"));
		Select sy=new Select(selectYear);
		sy.selectByIndex(6);
//		WebElement enterCvv = driver.findElement(By.name("cvv"));
//		sendKeys(enterCvv, "231");
//		WebElement btncont = driver.findElement(By.xpath("//button[text()='Continue']"));
//		btnclick(btnContinue);
		
	}		
}
