package ecommerce.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
@FindBy(id="email")
WebElement eml_Edt;

//@FindBy(id="next")
//WebElement nxt_Btn;

@FindBy(id="pass")
WebElement psw_Edt;

@FindBy(id="u_0_r")
WebElement sgn_Btn;

public void login(String username, String password){
	eml_Edt.sendKeys(username);
	psw_Edt.sendKeys(password);
	sgn_Btn.click();
	
}
}