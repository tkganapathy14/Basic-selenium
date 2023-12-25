package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;

public class LoginPage {

	public LoginPage(WebDriver  driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Log in")
	private WebElement element;
	public WebElement getElement()
	{
		return element;
	}
	@FindBy(id="Email")
	private WebElement email;
	public WebElement getElement1() {
		return	email;		
	}
	@FindBy(id="Password")
	private WebElement pword;
	public WebElement getElement2() {
		return pword;
	}
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginpage;
	public WebElement getElement3(){
		return loginpage;
	}
}
