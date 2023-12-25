package Frameworkcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		webdriverutility utility=new webdriverutility(driver);
		utility.scrollToAction(200,300);
		Thread.sleep(3000);
		utility.scrollByAction(500,600);
		Thread.sleep(3000);
		WebElement scrollinto = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		utility.scrollintoView(scrollinto, true);
		}

}
