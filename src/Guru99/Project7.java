package Guru99;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project7 {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//a[text()='My Orders']")).click();
		driver.findElement(By.xpath("//a[text()='View Order']")).click();
		String Actualorder=driver.findElement(By.xpath("//div[@class=\"page-title title-buttons\"]")).getText();
		String Exporder="Order #100019983 - Pending";
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		if(Exporder.equals(Actualorder)) {
			System.out.println("Previously created order is displayed");
		}
		else
		{
			System.out.println("Previously created order is not displayed");
		}
		driver.findElement(By.linkText("Print Order")).click();
		Set<String> allid=driver.getWindowHandles();
		System.out.println(allid);
		allid.remove(parentId);
		for(String childid:allid)
		{
		driver.switchTo().window(childid);
		System.out.println(childid);
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//span[text()='Close Window']")).click();
			Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
	}

}
