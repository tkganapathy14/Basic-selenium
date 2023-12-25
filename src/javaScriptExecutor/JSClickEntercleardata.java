package javaScriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClickEntercleardata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\tkgan\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	JavascriptExecutor je=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	WebElement element2=driver.findElement(By.xpath("//input[@type='submit']"));
	//WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	WebElement element=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	
	je.executeScript("arguments[0].value='mobile'",element);
	Thread.sleep(4000);
	//je.executeScript("arguments[0].value=' '",element);
	Thread.sleep(4000);
	je.executeScript("arguments[0].click()",element2);
	
	
	}

}
