package Basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelectorAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.cssSelector("input[id=\"ap_email\"]")).sendKeys("7207792375");
		driver.findElement(By.cssSelector("input[id=\"continue\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"ap_password\"]")).sendKeys("Ganapathy@14");
		driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
		String parentId = driver.getWindowHandle();
		driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Redmi 12C (Matte Black, 4GB RAM, 64GB Storage)')]")).click();
		Set<String> allid = driver.getWindowHandles();
		System.out.println(driver.getWindowHandles());
		for(String cartId:allid)
		{
			driver.switchTo().window(cartId);
			Thread.sleep(3000);
			if(! cartId.equals(parentId))
			{
				
				 WebElement ele = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\" and @name=\"submit.add-to-cart\"]"));
				 JavascriptExecutor js=(JavascriptExecutor) driver;
				 js.executeScript("arguments[0].click();", ele);
				WebElement ele1 = driver.findElement(By.xpath("//input[@class='a-button-input' and @type=\"submit\"]"));
				js.executeScript("arguments[0].click();", ele1);
//				 WebDriverWait wait=new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((("//*[@id='add-to-cart-button'])[1]")))));
//			driver.findElement(By.xpath("(//*[@id='add-to-cart-button'])[1]")).click();
			}
		}
//		driver.findElement(By.partialLinkText("Add to Cart")).click();
//
//		driver.findElement(By.id("submit.add-to-cart-announce")).click();
	}

}
