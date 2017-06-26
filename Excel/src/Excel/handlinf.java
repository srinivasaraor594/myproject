package Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.thoughtworks.selenium.webdriven.Windows;


public class handlinf {

	public static void main(String[] args) throws Exception  {
		//File src = new File("E:\\practice\\New Microsoft Office Excel Worksheet.xlsx");	
	File src =new File("E:\\practice\\srinivas.xlsx");
	FileInputStream fis =new FileInputStream(src);
	
	XSSFWorkbook wb =new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	int rowindex=sheet1.getLastRowNum();
	
	for (int i=0;i<=rowindex;i++)
	{
	String data = sheet1.getRow(i).getCell(1).getStringCellValue();
	
	System.out.println(data);
	}
	wb.close();
	
	}

	
}
