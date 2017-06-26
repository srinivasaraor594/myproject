package ecommerce.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Breowserconfig {
	public  WebDriver driver;
@BeforeMethod
	public void getbrowser() throws Exception {
		if (permentdata.browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (permentdata.browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (permentdata.browser.equals("ie")) {
			System.setProperty("webdriver.internetexplore.driver", "C:\\selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(permentdata.url);
	}

@AfterMethod
public void after_method(ITestResult result) throws Exception
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		screenshot.getscreenshot(result.getName(), driver);
	}
	driver.close();
}
































}
