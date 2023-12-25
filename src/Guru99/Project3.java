package Guru99;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		//driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		//	driver.findElement(By.xpath("//a[@title=\"Sony Xperia\"]/../..//span[text()='Add to Cart']"));
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(4000);
		String str=driver.findElement(By.xpath("//input[@type=\"text\"]")).getText();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		String reqQty=driver.findElement(By.xpath("//p[@class=\"item-msg error\"]")).getText();
		System.out.println(reqQty);
		String msgQty = ("* The requested quantity for \"Sony Xperia\" is not available.");
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		String NoitemStr="You have no items in your shopping cart.";
		String NoitemMsg=driver.findElement(By.xpath("//p[contains(text(),'You have no')]")).getText();
		System.out.println(NoitemMsg);
	}

}
