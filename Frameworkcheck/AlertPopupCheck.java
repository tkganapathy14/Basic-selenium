package Frameworkcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.reporters.jq.Main;

import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupCheck {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement alert = driver.findElement(By.id("alertBox"));
		alert.click();
		webdriverutility utility=new webdriverutility(driver);
		utility.returnAlertreference().accept();
		driver.findElement(By.id("confirmBox")).click();
		utility.returnAlertreference().accept();

	}
}
