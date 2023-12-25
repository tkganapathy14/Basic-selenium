package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeysmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element1=driver.findElement(By.xpath("//input[@value=\"Search\"]"));
		WebElement element2=driver.findElement(By.xpath("//input[@value=\"Search store\"]"));
		Actions actions=new Actions(driver);
	//	actions.moveToElement(element2).click().sendKeys("Ganapathy").perform();
		//actions.click(element2).sendKeys("Ganapathy").perform();
		actions.click().sendKeys(element2, "ganapathy").perform();
	//	actions.moveToElement(element1).click().perform();
		actions.click(element1).perform();

	}

}
