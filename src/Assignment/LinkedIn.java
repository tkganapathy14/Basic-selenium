package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.Webelement;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText(" Sign in ")).click();
		//driver.findElement(By.id("email-or-phone")).sendKeys("tkganapathy16@gmail.com");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		WebElement tk1=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		tk1.sendKeys("tkganapathy16@gmail.com");
		WebElement tk2=driver.findElement(By.id("password"));
		tk2.sendKeys("Ganapathy@97");
		WebElement tk3=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		tk3.click();
//		System.out.println(tk1.getAttribute("value"));
//				
	}

}
