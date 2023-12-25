package Frameworkcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectUtilityCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement element = driver.findElement(By.id("course"));
		webdriverutility utility=new webdriverutility(driver);
		utility.handlingDropdown(element, "Dot Net");
		Thread.sleep(2000);
		utility.handlingDropdown(element, "3");
		Thread.sleep(2000);
		utility.handlingDropdown(element, "js");
	}

}
