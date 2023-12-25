package Assignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Scanner s=new Scanner(System.in);
		driver.get("https://www.google.com/");
		
		String info=s.next();
		driver.findElement(By.name("q")).sendKeys(info);
		List<WebElement> allsuggestion=driver.findElements(By.xpath("//span[contains(text(),'"+info+"')]"));
		
		for(WebElement suggestion:allsuggestion)
		{
			System.out.println(suggestion.getText());
		}
	}

}
