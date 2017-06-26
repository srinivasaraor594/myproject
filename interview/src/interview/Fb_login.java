package interview;

import org.testng.annotations.Test;
import Repository.loginpage;
import utilittes.Breowserconfig;


public class Fb_login extends Breowserconfig {

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
