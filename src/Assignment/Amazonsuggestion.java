package Assignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Scanner sc=new Scanner(System.in);
		
		driver.get("https://www.amazon.in/");
		String info=sc.next();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(info);
		List<WebElement>allsuggestion=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for(WebElement suggestion: allsuggestion)
		{
			System.out.println(suggestion.getText());
		}
	}

}
