package Frameworkcheck;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchtoWindowCheck {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 (Starlight, 128 GB)')]")).click();
		webdriverutility utility=new webdriverutility(driver);
		Set<String> allid = driver.getWindowHandles();
		utility.switchtowindow(allid,"APPLE iPhone 14 ( 128 GB Storage ) ",parentid);
		utility.switchbacktomainwindow(parentid);
	}

}
