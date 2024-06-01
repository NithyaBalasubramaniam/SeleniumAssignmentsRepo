package week4.day4.ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExccel {
	public static void main(String[] args) throws IOException  {

		//To read the excel 
		XSSFWorkbook book = new XSSFWorkbook("./data/createlead.xlsx");
		
		//To get the sheet name
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//To get row count (Numbers of rows)
		int rowcount = sheet.getLastRowNum();
		System.out.println("Rowcount" +rowcount);
		
		//To get the 
		int phy = sheet.getPhysicalNumberOfRows();
		System.out.println("physical row"+phy);
		
		//to get the column count (No of column present)
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("col count"+colcount);
		
		//To print the excel data using row number and column count
		for(int i = 0;i<=rowcount;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		
		book.close();
	}

}

