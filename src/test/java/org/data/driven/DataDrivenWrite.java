package org.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {
	
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\PRASANNA\\eclipse-workspace\\MavenTrainingProject\\src\\test\\resources\\Excel\\EmployeeInformation.xlsx");
		FileInputStream fi=new FileInputStream(loc);
		Workbook wk=new XSSFWorkbook(fi);
		Sheet sheet = wk.getSheet("EmpDetail");
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.createCell(2);
		cell1.setCellValue("SAthish07");
//		int a=10;
//		for (int i = 2; i < 6; i++) {
//			Row row = sheet.createRow(i);
//			for (int j = 0; j < 4; j++) {
//				
//				Cell createCell = row.createCell(j);
//				createCell.setCellValue(a=a+01);
//				
//			}
//			
//		}
		
		String cellData1 = cell1.getStringCellValue();
		if(cellData1.equals("SAthish07")) {
			cell1.setCellValue("satks007");
		}
		
		
		FileOutputStream fo=new FileOutputStream(loc);
		wk.write(fo);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
