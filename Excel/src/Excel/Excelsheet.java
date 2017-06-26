package Excel;




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelsheet {

	
	public static void main(String[] args) throws IOException  {
		
		//File src = new File("E:\\practice\\data.xlsx");		File src = new File("E:\\practice\\srinivas.xlsx"); 
	FileInputStream fis = new FileInputStream("E:\\practice\\data.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("Sheet1");
	String data = sheet.getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
	
//sheet.createRow(3).createCell(3).setCellValue("pass");
//sheet.createRow(3).createCell(4).setCellValue("fail");
	wb.close();
	}


}
