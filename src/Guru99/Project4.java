package Guru99;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(2000);
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.xpath("(//a[text()='Add to Compare'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Add to Compare'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"Compare\"]")).click();
		Thread.sleep(4000);
		Set<String> allId = driver.getWindowHandles();
	//	allId.remove(parentid);
		for(String Id:allId) {
			System.out.println(Id);
			driver.switchTo().window(Id);
		}
		driver.close();
	}

}
