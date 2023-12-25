package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.instagram.com/");
WebElement tk1=	driver.findElement(By.xpath("//input[@name=\"username\"]"));
tk1.sendKeys("7207792375");
String ActualUsername=tk1.getAttribute("value");
// System.out.println(ActualUsername);
WebElement tk2=driver.findElement(By.name("password"));
tk2.sendKeys("Ganapathy@97");
String Actualpassword=tk2.getAttribute("value");
WebElement tk3=driver.findElement(By.xpath("//button[@type='submit']"));
tk3.click();



	}

}
