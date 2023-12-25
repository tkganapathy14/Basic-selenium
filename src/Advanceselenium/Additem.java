package Advanceselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.webelement1;

public class Additem {

	public static WebDriver driver;
	public static void Switchchild(String exptitle,String parentid,Set<String> allid)
	{
		allid.remove(parentid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(exptitle))
			{
				driver.findElement(By.id("add-cart-button-id")).click();
				break;
			}
		}		
	}
	public static void readprice(WebElement elementprice) {
		String price = elementprice.getText();
		System.out.println(price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(text(),'Veirdo - Green Cotton Regular')]")).click();
		Switchchild("Buy Veirdo - Green Cotton Regular",parent,driver.getWindowHandles());
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//div[@class='cartInner']")).click();
		 String cartprice = driver.findElement(By.xpath("//span[@class='item-price']")).getText();
//		readprice(cartprice);
		 System.out.println(cartprice);
	}

}
