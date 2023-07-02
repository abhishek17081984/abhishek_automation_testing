package com.DataDriven1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data_driven1 {
	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException {
		String[][] data=null;
		
		//to get a filepath
		String filepath="C:\\abhi1\\abhishek_poi.xlsx";
		
		//to make a file
		File file=new File(filepath);
		
		//to open execl file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//to get a particular sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//to get a no of row
		
		int n_row=sheet.getPhysicalNumberOfRows();
		System.out.println("total number of row are:"+n_row);
		
		//to set no row using jagged arry
		data=new String[n_row][];
		for (int i = 0; i < data.length; i++) {
			//to select a particular row
		    Row row=sheet.getRow(i);
		    
		    
		    
			int n_col=row.getPhysicalNumberOfCells();
			
			//set no of col for row
			data[i]=new String[n_col];
			for (int j = 0; j < data[i].length; j++) {
				
				//to select a particular col
				Cell cell=row.getCell(j);
				
				//to set cell to string
				
				cell.setCellType(CellType.STRING);
				
				
				//to get data from a particular cell
				data[i][j]=cell.getStringCellValue();
				
		
				}
				
				
				
				
			}
			
			
		
		return data;
		
		
	}
	
	WebDriver driver=null;
	@Test
public void test() throws InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
String[][] data=readExcel();

for (int i = 0; i < data.length; i++) {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	
	
	driver.findElement(By.name("firstName")).sendKeys(data[i][0]);
	Thread.sleep(2000);
	
	driver.findElement(By.name("lastName")).sendKeys(data[i][1]);
	Thread.sleep(2000);
	
	
	driver.findElement(By.name("phone")).sendKeys(data[i][2]);
	Thread.sleep(2000);
	
	driver.findElement(By.id("userName")).sendKeys(data[i][3]);
	Thread.sleep(2000);
	
	
	driver.close();
	
}		
		
}
}