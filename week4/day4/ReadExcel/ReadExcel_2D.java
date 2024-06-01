package week4.day4.ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_2D {
	public  String[][] readData() throws IOException  {

		//To read the excel 
		XSSFWorkbook book = new XSSFWorkbook("./data/createlead.xlsx");
		
		//To get the sheet name
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//To get row count (Numbers of rows)
		int rowcount = sheet.getLastRowNum();
		System.out.println("Rowcount" +rowcount);
		
		//to get the column count (No of column present)
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("col count"+colcount);
		
		//Declaring two D array
		String[][] data = new String[rowcount][colcount];

		//To print the excel data using row number and column count
		for(int i = 1;i<=rowcount;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				System.out.println(data[i-1][j]);
			}
		}
		
		book.close();
		return data;
}

}

