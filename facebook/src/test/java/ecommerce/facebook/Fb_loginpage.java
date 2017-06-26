package ecommerce.facebook;

import org.testng.annotations.Test;

import ecommerce.facebook.Breowserconfig;



public class Fb_loginpage extends Breowserconfig {

	@Test( groups={"smoke","regression"})

	public void Verify_Validlogin() {
		loginpage lp = new loginpage(driver);
		lp.login("srinivasaraor594@gmail.com", "8500991792");
	}

	@Test(priority=2)
	public void InValidlogin()  {
		loginpage lp = new loginpage(driver);
		lp.login("srinivasaraor59", "8500991792");
	}

	
	
	
}
