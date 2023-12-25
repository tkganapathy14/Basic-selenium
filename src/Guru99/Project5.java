package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project5 {

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
		driver.findElement(By.xpath("//a[text()='TV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Add to Wishlist'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"save_and_share\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emails")).sendKeys("bariksatyaprakash58@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
