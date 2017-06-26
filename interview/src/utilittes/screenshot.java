package utilittes;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class screenshot 
{

	public static void getscreenshot(String filename, WebDriver driver) throws Exception{
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./screenshot/"+filename+".jpg"));

}}
