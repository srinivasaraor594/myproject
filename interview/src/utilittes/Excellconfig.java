package utilittes;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellconfig{
		static String filepath=""; 
		public  String getexcelldata(int sheet, int ro,int colum) throws IOException{
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(sheet);
		Row row=sh.getRow(ro);
		String data=row.getCell(colum).getStringCellValue(); 
		wb.close();
		return data;
	}
}
