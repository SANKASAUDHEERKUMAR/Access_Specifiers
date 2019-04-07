package Selenium_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_sheet {
	public static void main(String args[]) throws Exception{
		FileInputStream fis=new FileInputStream("C:\\Users\\SUDHEERKUMAR\\Desktop\\testing excel.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet sheet= WB.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(2));
		
		XSSFCell cell=sheet.getRow(3).getCell(2);
		cell.setCellValue("52522");
		fis.close();
		FileOutputStream fout=new FileOutputStream("C:\\Users\\SUDHEERKUMAR\\Desktop\\testing excel.xlsx");
		WB.write(fout);
		System.out.println(cell.getStringCellValue());
		fout.close();		
	}
}
