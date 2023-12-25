package javaScriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSFaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	JavascriptExecutor je=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	WebElement element1=driver.findElement(By.name("email"));
	WebElement element2=driver.findElement(By.name("pass"));
	WebElement element3=driver.findElement(By.name("login"));
	je.executeScript("arguments[0].value='7207792375'",element1);
	Thread.sleep(4000);
	je.executeScript("arguments[0].value='16011997'",element2);
	Thread.sleep(4000);
	
	je.executeScript("arguments[0].click()",element3);
	
	
	}

}
