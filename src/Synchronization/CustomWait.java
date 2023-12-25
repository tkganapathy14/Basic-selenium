package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		int i;
		for(i=1;i<100;i++);
		{
			try
			{
				driver.findElement(By.name("username")).sendKeys("Ganapathy");
				
			}
			
			catch(Exception e)
			{
				System.out.println(i);
			}
			
			
		}
	}

}
