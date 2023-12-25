	package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput;

public class Webdrivermethods {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
			System.out.println(driver.getWindowHandle());
			System.out.println(driver.getWindowHandles());
	
		//Manage methods
		
			driver.manage().window().fullscreen();
			System.out.println(driver.manage().window().getPosition());
			System.out.println(driver.manage().window().getSize());
			Dimension d=new Dimension(600,400);
			driver.manage().window().setSize(d);
			Point p=new Point(400, 500);
			driver.manage().window().setPosition(p);
		//Navigate Methods
			driver.navigate().to("https://www.instagram.com");
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
			
		}
	}
