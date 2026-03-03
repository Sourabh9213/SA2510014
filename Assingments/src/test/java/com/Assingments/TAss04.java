package com.Assingments;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TAss04 {

	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("LDetails");
	int rowCount = 1;
	XSSFRow row;
	XSSFRow Header = sheet.createRow(0);

	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		return new Object[][] { 
						{"admin","admin123","Not Run"},
						{"sourabh","sourabh123"," Run"},
						{"saba","saba123","Not Run"}, 
						{"sachin","sachin23"," Run"},
						{"akshay","akshay123","Not Run"} };
	}

	@Test(dataProvider = "LoginData")
	public void CreateExcel(String UN, String PS, String RE) throws IOException {
		
		row = sheet.createRow(rowCount);
		
		if (rowCount == 1) {
			Header.createCell(0).setCellValue("User_Name");
			Header.createCell(1).setCellValue("Password");
			Header.createCell(2).setCellValue("Result");
		}
		row.createCell(0).setCellValue(UN);
		row.createCell(1).setCellValue(PS);
		row.createCell(2).setCellValue(RE);
		System.out.println(UN + " " + PS + " " + RE + " ");

		rowCount++;

		if (rowCount == 6) {
			FileOutputStream out = new FileOutputStream("D:/class/SA2510014/Module (3) WebDriver/files/LoginData.xlsx");
			workbook.write(out);
			out.close();
			workbook.close();

		}

	}

}