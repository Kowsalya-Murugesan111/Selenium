//package com.atmecs.FrameworkTask.utils;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//
//public class ReadExcel {
//	private static XSSFWorkbook workbook;
//	private static XSSFSheet sheet;
//	private static XSSFRow row;
//	private static XSSFCell cell;
//
//	FileInputStream file=null;
//String path=null;
//	/**
//	 * The constructor takes file path as the parameter, reads the file and initializes the workbook
//	 * @param filePath               
//	 * @throws IOException 
//	 */
//
////constructor
//	public ReadExcel() throws IOException {
//           FileInputStream file= new FileInputStream("\\testdata\\kanokart.xlsx");
//	        workbook = new XSSFWorkbook(file);
//			sheet = workbook.getSheet("cart");
//				}
//	
//	
//	public static String getData(int sheetindex, int rowNum, int cellNum) {
//		//String sh=workbook.getSheetName(sheetindex);
//		sheet = workbook.getSheet("cart");
//		row=sheet.getRow(rowNum);
//		cell=row.getCell(cellNum);
//		System.out.println(cell.getStringCellValue());
//		return(cell.getStringCellValue());
//		
//}
//	public   int totalRowsinSheet(int sheetindex) {
//		int rowCount = workbook.getSheetAt(sheetindex).getLastRowNum();
//		return rowCount;
//	
//	}
//	
//	public int totalColsinSheet(int sheetindex, int rowCount) {
//
//		int colCount = workbook.getSheetAt(sheetindex).getRow(rowCount).getLastCellNum();
//		return colCount;
//	}
//	
//
//	
//}



package com.atmecs.FrameworkTask.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * The class reads the excel file and returns the value of a particular location.
 * @author Amrut Dash
 *
 */

public class ReadExcel {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	/**
	 * The constructor takes file path as the parameter, reads the file and initializes the workbook
	 * @param filePath               
	 */
	public ReadExcel(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * method takes parameter as
	 * @param index
	 * @param rowNum
	 * @param cellNum
	 * @return the data at that location
	 */
	public static String getData(int index, int rowNum, int cellNum) {
		
		sheet = workbook.getSheetAt(index);
		String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	}
	public   int totalRowsinSheet(int sheet) {
		int rowCount = workbook.getSheetAt(sheet).getLastRowNum();
		return rowCount;
	}
	
	public int totalColsinSheet(int sheetIndex,int rowCount) {
		int colCount = workbook.getSheetAt(sheetIndex).getRow(rowCount).getLastCellNum();
		return colCount;
	}
}
