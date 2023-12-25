package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

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
		WebElement element=driver.findElement(By.xpath("//h3[text()='My account']"));
		je.executeScript("arguments[0].scrollIntoView(true)",element);
		System.out.println(je.executeScript("return window.location.href"));
		System.out.println(je.executeScript("return document.title"));
		System.out.println(je.executeScript("return document.body.scrollHeight"));
		System.out.println(je.executeScript("return document.body.scrollWidth"));
		
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
