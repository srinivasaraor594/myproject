package testcasescreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import libb.Excelldata;

import libb.Utility;
import libb.constants;


public class Trailscreenshot  {
	
	 Excelldata excel;
	 WebDriver driver;
	@Test
	    public void screenshot() throws Exception
	    {
	    //  excel=new Excelldata(consatntsss.excelpath);
	     //driver=consatntsss.getbrowser();
	    //driver.manage().window().maximize();
	    
	    
	
	   driver = new FirefoxDriver();
       driver.get("https://google.com");	  
       Utility.screenshot(driver, "abc"); 
//	    driver.findElement(By.id(Excelldata.getData(0, 1, 0))).sendKeys(Excelldata.getData(0, 1, 1));
//	    Thread.sleep(7000);
       driver.get(constants.url);
	    driver.quit();
	    
	    }

}
