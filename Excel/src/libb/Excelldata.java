
package libb;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelldata
{
	static XSSFWorkbook wb;
	static XSSFSheet sheet1;
	
	public  Excelldata(String excelpath) 
	{
		try {
			File src =new File(excelpath);
			FileInputStream fis =new FileInputStream(src);
			 wb =new XSSFWorkbook(fis);
    }
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
	public static String getData(int sheetnum,int row,int column)
	{  
		sheet1 = wb.getSheetAt(sheetnum);
	String Data	= sheet1.getRow(row).getCell(column).getStringCellValue();
	
		
		return Data;
	}
//public static void main(String[] args)
//{
//	 Excelldata excel=new Excelldata("E:\\practice\\srinivas.xlsx");
//     System.out.println(excel.getData(0, 1, 1));
//	}
}


//file frc=new file(filepath);
//fileinputstream fis =new fileinputstream(frc);
//xssfworkbook wb=new xssfworkwook(fis);
//xssfsheet sheet1=wb.getsheet();
//string data=sheet1.getRow(0).getCell(0).getStringCellValue();


