package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Snapdeal {
	public static WebDriver driver;
	public static void switchtochild(String expectedtitle,String parentid,Set<String>allid)
	{
		allid.remove(parentid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedtitle))
			{
				driver.findElement(By.id("add-cart-button-id")).click();
				break;
			}
		}
	}
	public static void backtowindow(String parentid)
	{
		driver.switchTo().window(parentid);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		String Parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(text(),'Bhawna Collection Loard Shiv Trishul')]")).click();
		switchtochild("Buy Bhawna Collection Loard Shiv",Parentid,driver.getWindowHandles());
		Thread.sleep(3000);

		backtowindow(Parentid);
		driver.findElement(By.xpath("//div[contains(text(),'Veirdo - Green Cotton Regular Fit')]")).click();
		switchtochild("Buy Veirdo - Green Cotton Regular",driver.getWindowHandle(),driver.getWindowHandles());
		driver.findElement(By.id("add-cart-button-id")).click();
		backtowindow(Parentid);
		driver.findElement(By.xpath("//div[contains(text(),'Stay Healthy - Foot Protector (Free Size)')]")).click();
		switchtochild("Buy Stay Healthy - Foot Protector",driver.getWindowHandle(),driver.getWindowHandles());
		driver.findElement(By.id("add-cart-button-id")).click();
		backtowindow(Parentid);
		driver.findElement(By.xpath("//div[contains(text(),'Bentag kitchenware Vegetable')]")).click();
		switchtochild("Buy Bentag kitchenware Vegetable",driver.getWindowHandle(),driver.getWindowHandles());
		driver.findElement(By.id("add-cart-button-id")).click();
		backtowindow(Parentid);
		driver.findElement(By.xpath("//div[contains(text(),'David Miller White Dial')]")).click();
		switchtochild("Buy David Miller White Dial Tan",driver.getWindowHandle(),driver.getWindowHandles());
		driver.findElement(By.id("add-cart-button-id")).click();
		backtowindow(Parentid);
		
		
	}

}
