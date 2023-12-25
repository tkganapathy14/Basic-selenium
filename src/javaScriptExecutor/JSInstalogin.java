package javaScriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSInstalogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/");
	JavascriptExecutor je=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	WebElement element1=driver.findElement(By.xpath("//input[@name='username']"));
	WebElement element2=driver.findElement(By.xpath("//input[@name='password']"));
	WebElement element3=driver.findElement(By.xpath("//button[@type='submit']"));
	je.executeScript("arguments[0].value='7207792375'",element1);
	Thread.sleep(4000);
	je.executeScript("arguments[0].value='Ganapathy@97'",element2);
	Thread.sleep(5000);
	je.executeScript("arguments[0].click()",element3);
	}

}
