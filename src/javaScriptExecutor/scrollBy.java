package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		je.executeScript("window.scrollBy(0,500)");
	
	}

}
