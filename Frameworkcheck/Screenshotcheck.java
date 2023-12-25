package Frameworkcheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtilities.TakesScreenshotUtility;
import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotcheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshotUtility utility=new TakesScreenshotUtility(driver);
		utility.capturingscreenshot();
		//webdriverutility utility class
		webdriverutility utility1=new webdriverutility(driver);
		utility1.captureshots();
		utility.capturess("sample");
		utility.capturescreenshot("gana");
		
	}

}
