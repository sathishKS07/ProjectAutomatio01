package org.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenRead {
	
	public static void main(String[] args) throws IOException {
		
		// 1) file location
		File loc=new File("C:\\Users\\PRASANNA\\eclipse-workspace\\MavenTrainingProject\\src\\test\\resources\\Excel\\FaceBookLogin.xlsx");
		//File input stream
		FileInputStream fs=new FileInputStream(loc);
		Workbook wk=new XSSFWorkbook(fs);
		Sheet sheet1 = wk.getSheet("Login");
		
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(2);
		System.out.println(cell1);
		
		int cellType = cell1.getCellType();
		System.out.println(cellType);
		
		if(cellType==1) {
			String svalue = cell1.getStringCellValue();
			System.out.println(svalue);	
		}
		else {
			if(DateUtil.isCellDateFormatted(cell1)) {
				Date cellDate = cell1.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
				String format = sdf.format(cellDate);
				System.out.println(format);
			}
			
			else {
				double numericValue = cell1.getNumericCellValue();
				long ln= (long) numericValue;
				
				System.out.println(String.valueOf(ln));
			}
				
				
				
				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    Cell cell2 = row1.getCell(1);
//    System.out.println(cell2);
//    Cell cell3 = row1.getCell(2);
//	System.out.println(cell3);
//    Cell cell4 = row1.getCell(3);
//    System.out.println(cell4);
//    
//    System.out.println();
//	Row row2 = sheet1.getRow(1);
//	Cell cell20 = row2.getCell(0);
//	System.out.println(cell20);
//    Cell cell21 = row2.getCell(1);
//    System.out.println(cell21);
//    Cell cell22 = row2.getCell(2);
//	System.out.println(cell22);
//    Cell cell23 = row2.getCell(3);
//    System.out.println(cell23);
//    System.out.println();
//    
//    int rowcounts = sheet1.getPhysicalNumberOfRows();
//    System.out.println(rowcounts);
//   int cellcounts = row1.getPhysicalNumberOfCells();
//   System.out.println(cellcounts);
//  
//       for (int i = 0; i < 5; i++) { 
//	   Row r = sheet1.getRow(i);
//	   for (int j = 0; j < 4; j++) {
//		   Cell c = r.getCell(j);  
//		 System.out.println( c );  
//	}
//	   System.out.println();
	   
	}


