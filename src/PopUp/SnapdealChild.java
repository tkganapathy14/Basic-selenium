package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Bhawna Collection Loard Shiv Trishul')]")).click();
		String parentid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Buy Bhawna Collection Loard Shiv Trishul"))
			{
				driver.findElement(By.id("add-cart-button-id")).click();
			}
		}
	}

}
