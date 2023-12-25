package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.Webelement;

public class AmazonListElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		Thread.sleep(4000);
		List<WebElement>allsuggestion=driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
		Thread.sleep(4000);
			
		for(WebElement suggestion: allsuggestion)
		{
			System.out.println(suggestion.getText());
		}
	}

}
