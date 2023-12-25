package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	ChromeDriver a=new ChromeDriver();
	a.get("https://www.facebook.com");
	String expectedTitle="Facebook – log in or sign up";
	String actualtilte=a.getTitle();
	if(expectedTitle.equals(actualtilte))
	{
		System.out.println("test cases passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	System.out.println(a.getCurrentUrl());
	
	System.out.println("******************************");
	System.out.println(a.getPageSource());
	System.out.println("******************************");
	System.out.println(a.getWindowHandle());
	System.out.println("******************************");
	System.out.println(a.getWindowHandles());
	a.manage().window().maximize();
	a.manage().window().fullscreen();
	System.out.println(a.manage().window().getPosition());
	System.out.println(a.manage().window().getSize());
	Thread.sleep(1500);
	Dimension d=new Dimension(200, 500);
	a.manage().window().setSize(d);
	Point p=new Point(200,200);
	Thread.sleep(2000);
	a.manage().window().setPosition(p);
	
	
	}
}
