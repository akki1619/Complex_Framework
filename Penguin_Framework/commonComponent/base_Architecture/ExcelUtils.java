package base_Architecture;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {

	private static Sheet ExcelWSheet;

	private static Workbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;


//The excel sheet should always have equal no of columns for every row
public static  Object[][]  getTestData(String fileName,String sheetName) {
	
	
	FileInputStream file = null;
	try {
		file = new FileInputStream(fileName);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		ExcelWBook = WorkbookFactory.create(file);
	} catch (InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	ExcelWSheet = ExcelWBook.getSheet(sheetName);
	Object[][] data = new Object[ExcelWSheet.getPhysicalNumberOfRows()][ExcelWSheet.getRow(0).getLastCellNum()];
	
	for (int initialRowIndex = 0; initialRowIndex < ExcelWSheet.getPhysicalNumberOfRows(); initialRowIndex++) {
		
		//System.out.println(ExcelWSheet.getPhysicalNumberOfRows() + "--------" +
		//		ExcelWSheet.getRow(initialRowIndex).getLastCellNum());
		
		for (int initialColIndex = 0; initialColIndex < ExcelWSheet.getRow(initialRowIndex).getLastCellNum(); initialColIndex++) {
			data[initialRowIndex][initialColIndex] = ExcelWSheet.getRow(initialRowIndex).getCell(initialColIndex).toString();
			 System.out.println("This"+data[initialRowIndex][initialColIndex]);
		}
	}
	//System.out.println(data);
	return data;
}


	
	
	
	
	
	
	
	
	
	
}

















