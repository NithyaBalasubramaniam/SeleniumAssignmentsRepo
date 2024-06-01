package week4.day4.ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_MyPractice {
	
	public static void main(String[] args) throws IOException {
	
	//to read excel
	XSSFWorkbook book = new  XSSFWorkbook("./data/Book1.xlsx");
	
    XSSFSheet sheet = book.getSheet("horse");
    int lastRowNum = sheet.getLastRowNum();
	System.out.println(lastRowNum);
	
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	System.out.println(lastCellNum);
	
	for(int i =1;i<=lastRowNum;i++)
	{
		for(int j=0;j<lastCellNum;j++)
		{
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);

		}
	}

	book.close();
	}

}
