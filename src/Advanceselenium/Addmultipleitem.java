package Advanceselenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Addmultipleitem {

	public static WebDriver  driver;

	public static void switchtochild(String Exptitle,String parentid,Set<String> set) {
		set.remove(parentid);
		for(String id:set)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(Exptitle))
			{
				driver.findElement(By.id("add-cart-button-id")).click();
			}
		}
	}
	public static void cartpage(List<WebElement>cart)
	{
		for(WebElement ele:cart)
		{
			//String price = ele.getText();
			String price = ele.getAttribute("innerText");
			System.out.println(price);
			String cartprice = price.substring(4);
			int itemprice=Integer.parseInt(cartprice);
			if(itemprice>300)
			{
				WebElement pri = driver.findElement(By.xpath("//select[@data-catalogid='637625548913']"));
				Select select=new Select(pri);
				select.selectByVisibleText("3");
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		String Parentid = driver.getWindowHandle();
		//1st product 
		driver.findElement(By.xpath("//div[contains(text(),'Veirdo - Green Cotton Regular Fit')]")).click();
		switchtochild("Buy Veirdo - Green Cotton Regular Fit", Parentid,driver.getWindowHandles());	
		driver.switchTo().window(Parentid);
		//2nd product
		driver.findElement(By.xpath("//div[contains(text(),'Bhawna Collection Loard Shiv')]")).click();
		switchtochild("Buy Bhawna Collection Loard Shiv Trishul", Parentid,driver.getWindowHandles());	
		driver.switchTo().window(Parentid);
		//3rd product
		driver.findElement(By.xpath("//div[contains(text(),'Stay Healthy - Foot Protector')]")).click();
		switchtochild("Buy Stay Healthy - Foot Protector", Parentid,driver.getWindowHandles());	
		driver.switchTo().window(Parentid);
		//4th product
		driver.findElement(By.xpath("//div[contains(text(),'Bentag kitchenware Vegetable')]")).click();
		switchtochild("Buy Bentag kitchenware Vegetable", Parentid,driver.getWindowHandles());	
		driver.switchTo().window(Parentid);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='cartInner']")).click();
		List<WebElement> cart = driver.findElements(By.xpath("//span[@class='item-price']"));
		cartpage(cart);
	}

}
