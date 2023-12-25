package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tkgan\\OneDrive\\Desktop\\selenium app\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.tripodeal.com/hotels");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.name("destination")).sendKeys("Bangalore");
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Kashmir")).click();
	}

}
