package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkBookTest {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File exFile = new File("./ExcelFiles/testExcel.xlsx"); 
		//		System.out.println(exFile.exists());
		FileInputStream readFile = new FileInputStream(exFile);
		XSSFWorkbook workBook = new XSSFWorkbook(readFile);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		int rowNo=	sheet.getPhysicalNumberOfRows();
		int rowNoL = sheet.getLastRowNum();
		System.out.println(rowNo);
		System.out.println(rowNoL);

		int cellNo = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNo);
		for(int i=1;i<=rowNoL;i++) {
			for(int j=0;j<cellNo;j++) {
				System.out.print("["+sheet.getRow(i).getCell(j).getStringCellValue()+"]"+" ");
			}
			System.out.println();
		}

		Object [][] data = new Object[rowNoL][cellNo];
		DataFormatter df = new DataFormatter();
		for(int i=0;i<rowNoL;i++) {
			for(int j=0;j<cellNo;j++) {
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		
		System.out.println("data values");
		for (Object[] objects : data) {
			System.out.println(objects);
		}
		workBook.close();
		readFile.close();
//		return data;
	}

}
