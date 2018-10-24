package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	/*

	Method Name: readCellData
	Return Type: String
	Parameter Type: String and int

	This Method returns the value in the cell


	*/
	
	
	public static String readCellData(String sheetPath, String sheetName, int rowno, int colno) {
		String cell;
		try {
			// Specify the path of file
			File src = new File(sheetPath);

			// load file
			FileInputStream fis = new FileInputStream(src);
			Workbook workbook = WorkbookFactory.create(fis);

			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowno);
			
			 cell = row.getCell(colno).toString();
			 return cell;

		}
			
		catch(NullPointerException e)
		{
			e.printStackTrace();
			Log.info("Cell value in excel is null");
			return "";
			
		}
			

		catch (Exception FileNotFoundException)

		{
			Log.info("Excel sheet not found ");
			return"";
		}

		

	
	}
	
	/*

	Method Name: getLastRowNum
	Return Type: int
	Parameter Type: String 

	This Method returns the last row in the sheet


	*/

	public int getLastRowNum(String sheetPath, String sheetName) {
		int lastrow = 0;
		try {
			// Specify the path of file
			File src = new File("filepath/excelsheetname.xlsx");

			// load file
			FileInputStream fis = new FileInputStream(src);
			Workbook workbook = WorkbookFactory.create(fis);

			Sheet sheet = workbook.getSheet(sheetName);
			lastrow = sheet.getLastRowNum();

		} catch (Exception FileNotFoundException)

		{
			Log.info("Excel sheet not found ");
		}

		return lastrow;

	}
}
