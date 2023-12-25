package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollTo(0,200)");
		Thread.sleep(4000);
		je.executeScript("window.scrollTo(0,0)");
		Thread.sleep(4000);
		je.executeScript("window.scrollTo(0,500)");
		Thread.sleep(4000);
	
	
	}

}
