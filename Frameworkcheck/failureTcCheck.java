package Frameworkcheck;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import genericUtilities.TakesScreenshotUtility;
import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class failureTcCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	//	driver.findElement(By.id("small-searchterms")).sendKeys("selenium");
		driver.findElement(By.id("Email")).sendKeys("ganapathy");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		webdriverutility utili=new webdriverutility(driver);
		utili.returnAlertreference().accept();
		SoftAssert Assert=new SoftAssert();
		Assert.assertTrue(false);
		TakesScreenshotUtility utility=new TakesScreenshotUtility(driver);
		utility.capturescreenshot("DemewebShop");
	}


}
