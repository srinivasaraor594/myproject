package libb;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utility
{
	
//    @Test
//    public static void screenshot() throws Exception
//    {
//    WebDriver driver =new FirefoxDriver();
//    driver.manage().window().maximize();
//    driver.get("https://google.com");
	
public static void screenshot(WebDriver driver,String screenshot) 
    {
	TakesScreenshot sc=(TakesScreenshot)driver;
	
	File source=sc.getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(source, new File("./screen/"+screenshot+".jpg"));
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
		
	}


	}
	



	

