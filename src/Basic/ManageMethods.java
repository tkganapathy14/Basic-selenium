package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		ChromeDriver a=new ChromeDriver();
		a.get("https://www.instagram.com");
		System.out.println(a.getTitle());
		System.out.println(a.getCurrentUrl());
		System.out.println(a.getPageSource());
		System.out.println(a.getWindowHandle());
		System.out.println(a.getWindowHandles());
		a.manage().window().maximize();
		a.manage().window().fullscreen();
	System.out.println(a.manage().window().getPosition());
		Thread.sleep(1500);
		System.out.println(a.manage().window().getSize());
		Dimension d=new Dimension(200,500);
		a.manage().window().setSize(d);
		Point point=new Point(200,200);
		Thread.sleep(2000);
		a.manage().window().setPosition(point);
		
	
	}

}
