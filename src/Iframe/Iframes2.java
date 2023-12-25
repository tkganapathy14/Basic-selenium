package Iframe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Webelement.Webelement;

public class Iframes2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.switchTo().frame("frm3");	
	Thread.sleep(2000);
	JavascriptExecutor je=(JavascriptExecutor) driver;
	je.executeScript("window.scrollBy(0,200)");
	je.executeScript("window.scrollBy(0,500)");
	
	driver.switchTo().frame("frm2");
	
	driver.findElement(By.id("email")).sendKeys("tkganapathy16@gmail.com");
	Thread.sleep(6000);
	
	driver.switchTo().parentFrame().switchTo().frame("frm1");
	//driver.findElement(By.xpath("//a[@class=\"bmc-btn\"]")).click();
	WebElement dropdown=driver.findElement(By.id("course"));
	Select sel=new Select(dropdown);
	sel.selectByValue("java");
	WebElement multi=driver.findElement(By.id("ide"));
	Select mul=new Select(multi);
	mul.selectByValue("ec");
	mul.selectByValue("ij");
	mul.selectByValue("vs");
	List<WebElement> allsuggest=mul.getAllSelectedOptions();
	for(WebElement sug:allsuggest)
	{
		System.out.println(sug.getText());
	}
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).sendKeys("hello");
}
}
