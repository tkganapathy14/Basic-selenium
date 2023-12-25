package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonACtionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement element=driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		WebElement serachbox=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement dclick=driver.findElement(By.xpath("//div[contains(text(),'Connect with Us')]"));
		WebElement RClick=driver.findElement(By.id("nav-search-submit-button"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(4000);
		//actions.moveToElement(serachbox).click().sendKeys("Mobile").perform();
		actions.click(serachbox).sendKeys(serachbox, "mobile").perform();
		Thread.sleep(4000);
		//actions.moveToElement(dclick).doubleClick().perform();
		actions.doubleClick(dclick).perform();
		Thread.sleep(4000);
		//actions.moveToElement(RClick).contextClick().perform();
		actions.contextClick(RClick).perform();
		Thread.sleep(4000);
		driver.quit();	
		
	}

}
