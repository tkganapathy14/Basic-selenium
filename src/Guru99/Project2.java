package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		WebElement ele=driver.findElement(By.id("product-price-1"));
		System.out.println(ele.getText());
		String Price=ele.getText();
		driver.findElement(By.xpath("//a[text()='Sony Xperia']")).click();
		WebElement ele1=driver.findElement(By.xpath("//span[@class='price']"));
		String ProPrice=ele1.getText();
		System.out.println(ProPrice);
		if(Price.equals(ProPrice))
		{
			System.out.println("Product value in list and details page should be equal ($100.00)");
		}
		else
		{
			System.out.println("Product value in list and details page should be not equal ($100.00)");
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
