package libb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers 
{
//	public static String driver;
//public class Browser {
public static WebDriver driver;
public  static WebDriver browsers(String browser)
{
			
			if (constants.browser.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(constants.browser.equals("ie"))
		{
			System.setProperty("webdriver.internetexplore.driver","C:\\selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if (constants.browser.equals("firefoxe"))
		{
			driver =new FirefoxDriver();
		}
			return driver;
		}}
	
