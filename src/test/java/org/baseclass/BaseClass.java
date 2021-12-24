package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	 
	public static WebDriver browserLaunch(String browserName) {
		
		if (browserName=="chrome") {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if (browserName=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if (browserName=="edge") {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		return driver;		
	}
	
	public static  void urlLaunch(String url) {
		driver.get(url);		
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void timeOut(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void btnclick(WebElement e) {
		e.click();
		
	}
	public static String currentUrl() {
		  String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String getTitle() {
		return driver.getTitle();		
	}
	
	public static String getText(WebElement e) {
		return e.getText();
		}
	
	public static String getAttribute(WebElement e,String value) {
		return e.getAttribute(value);
	}
	
	
	public static void moveToElement(WebElement e) {	
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();		
	}	
	
	public static  void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
	a.doubleClick(e).perform();
	}
	
	public static  void rightClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
		}
	public static  void dragDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
		}
	public static void clickHold(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.clickAndHold(source).release(target).perform();
		
	}
	public static void selectMethod(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
    public static String getExcelValue(String fileName,String sheetName,int rowno,int cellno) throws IOException {
		
		File loc=new File("C:\\Users\\PRASANNA\\eclipse-workspace\\MavenTrainingProject\\src\\test\\resources\\Excel\\"+fileName+".xlsx");
		FileInputStream fs=new FileInputStream(loc);
		Workbook wk=new XSSFWorkbook(fs);
		Sheet sheet1 = wk.getSheet(sheetName);
		Row row1 = sheet1.getRow(rowno);
		Cell cell1 = row1.getCell(cellno);
		int cellType = cell1.getCellType();	
		String value=null;
		if(cellType==1) {
			 value = cell1.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(cell1)) {
				Date cellDate = cell1.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
				 value = sdf.format(cellDate);
			}
			
			else {
				double numericValue = cell1.getNumericCellValue();
				long ln= (long) numericValue;
				 value = String.valueOf(ln);
			}		
		}
		return value;
	
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

	
	
		
	
	
	


