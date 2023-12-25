package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//driver.switchTo().frame("notification-frame-1730609b7");
		driver.switchTo().frame("notification-frame-b8a69227");
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"close\"]"))).click();
	//	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		Thread.sleep(3000);
		new Actions(driver).click().perform();
		Thread.sleep(2000);
		//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-cy='departureDate']"))).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Sep 20 2023']")).click();
		driver.quit();
	}

}
