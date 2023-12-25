package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptTitleURLpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		System.out.println(je.executeScript("return window.location.href"));

		System.out.println(je.executeScript("return document.title"));
		System.out.println(je.executeScript("return document.body.scrollHeight"));
		System.out.println(je.executeScript("return document.body.scrollWidth"));
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
	}

}
