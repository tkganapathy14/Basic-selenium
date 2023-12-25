package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstock {//implicit wait
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
driver.get("https://shoppersstack.com/");
driver.findElement(By.id("loginBtn")).click();
WebElement tk1=driver.findElement(By.id("Email"));
tk1.sendKeys("tkganapathy16@gmail.com");
WebElement tk2=driver.findElement(By.id("Password"));
tk2.sendKeys("Ganapathy@97");
driver.findElement(By.id("Login")).click();
}
}
