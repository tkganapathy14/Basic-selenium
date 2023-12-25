package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("(//a[text()=\"My Account\"])[2]")).click();
		driver.findElement(By.name("login[username]")).sendKeys("tkganapathy16@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Ganapathy@97");
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='My Wishlist']")).click();
		
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		//driver.findElement(By.xpath("(//span[text()='Proceed to Checkout'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Proceed to Checkout'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Continue'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Continue'])[3]")).click();
		
		driver.findElement(By.xpath("//label[text()='Check / Money order ']")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();

	}

}
