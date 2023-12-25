package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.webelement1;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	JavascriptExecutor je=(JavascriptExecutor) driver;
	
	WebElement element1=driver.findElement(By.id("twotabsearchtextbox"));
	WebElement element2=driver.findElement(By.id("nav-search-submit-button"));
	je.executeScript("arguments[0].value='mobile'",element1);
	Thread.sleep(4000);
	je.executeScript("arguments[0].value=''",element1);
	je.executeScript("arguments[0].click()",element2);
	Thread.sleep(5000);
	je.executeScript("history.go()");
	System.out.println(je.executeScript("return document.title"));
	System.out.println(je.executeScript("return window.location.href"));
	
	
	}

}
