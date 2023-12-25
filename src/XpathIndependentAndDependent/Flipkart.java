package XpathIndependentAndDependent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/television-store?otracker=nmenu_sub_TVs%20and%20Appliances_0_Televisions&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Television");
		//WebElement element=driver.findElement(By.xpath("//a[text()='SONY 138.8 cm (55 inch) Ultra HD (4K) LED Smart Google TV']"
			//	+ "/../..//div[text()='₹55,990']"));
		driver.findElement(By.xpath("//a[text()='SONY 138.8 cm (55 inch) Ultra HD (4K) LED Smart Google TV']")).findElement(By.xpath("//div[text()='₹55,990']")).click();
		//element.click();

	}

}
