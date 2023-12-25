package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.Webelement;

public class AmazonScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tkgan\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		je.executeScript("arguments[0].scrollIntoView(false)",element);
		Thread.sleep(4000);
		System.out.println(je.executeScript("return document.body.scrollWidth"));
		System.out.println(je.executeScript("return document.body.scrollHeight"));
		
	}

}
