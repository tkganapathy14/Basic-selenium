package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartListElement {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("tamil");
	Thread.sleep(5000);
	List <WebElement> allsuggestion=driver.findElements(By.xpath("//span[contains(text(),'tamil')]"));
	Thread.sleep(5000);
	
	for(WebElement suggestion : allsuggestion)
	{
		System.out.println(suggestion.getText());
		
	}
}
}
