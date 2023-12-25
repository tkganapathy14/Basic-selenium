package Datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tkgan\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(5000);
	driver.switchTo().frame("notification-frame-~197139432");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='close']")));
	driver.findElement(By.xpath("//a[@class='close']")).click();
	WebElement ele = driver.findElement(By.xpath("//input[@id='departure']"));
	ele.click();
	
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click()",ele);
	}

}
