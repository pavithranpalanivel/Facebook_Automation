package Browserlaunch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {

	
	//public void loginPage() {
	//	PageFactory.initElements(driver, this);
	//}
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@CacheLookup
	@FindBys({@FindBy(id="email") ,@FindBy(xpath="//input[@id='email']")})
	private WebElement txtuser; 
	
	@CacheLookup
	@FindAll({@FindBy(id="pass") ,@FindBy(xpath="//input[@name='pass']")})
	private WebElement txtpass;
	 
	@CacheLookup
	@FindBy(name="login")
	private WebElement btn;
  
	public WebElement gettxtuser() {
		return txtuser;
	}
	
	public WebElement gettxtpass() {
		return txtpass;
	}
	
	public WebElement getbtn() {
		return btn;
		
	}
}
