package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secTime {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\NumberTwo\\testdata\\bookexcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
//		Row row = sheet.getRow(5);
//		Cell cell = row.getCell(1);
//		double numericCellValue = cell.getNumericCellValue();
//		System.out.println(numericCellValue);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++){
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue +"    ");
				
			}
			System.out.println();
				
			}
			
		}
		
		
		
		
		
		
		
	}


