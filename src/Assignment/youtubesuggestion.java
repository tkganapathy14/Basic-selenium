package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubesuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("manual");
		//List<WebElement>allsuggest=driver.findElements(By.xpath("//div[contains(text(),'manual')]"));
		List<WebElement>allsuggest=driver.findElements(By.xpath("//div[contains(@class='sbqs_c')]"));
		for(WebElement suggest : allsuggest)
		{
			System.out.println(suggest.getText());
		}
	}

}
