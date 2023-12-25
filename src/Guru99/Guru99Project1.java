package Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://live.techpanda.org/index.php/");
		String title="Home page";
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Title of page is Matched");
		}
		else
		{
			System.out.println("Title of page is not Matched");
		}
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		String Page="Mobile";
		if(Page.equals(driver.getTitle()))
		{
		System.out.println("Mobile page is matched");
		}
		else
		{
			System.out.println("Mobile page is Not matched");
		}
		WebElement element=driver.findElement(By.xpath("//select[@title=\"Sort By\"]"));
		Select select=new Select(element);
		select.selectByVisibleText("Name");
		Thread.sleep(4000);
		System.out.println("Is this Multi option : "+select.isMultiple());
		
		driver.quit();
		
	}

}
