package Basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static  void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		ChromeDriver a=new ChromeDriver();
		a.get("https://www.Facebook.com");
		Thread.sleep(2000);
	//a.navigate().to("https://www.instagram.com");
		URL url=new URL("https://www.instagram.com");	//import URL ctrl+shift+o=select java.net.URL
		a.navigate().to(url);
	//	a.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		a.navigate().back();
		
		Thread.sleep(2000);
		a.navigate().forward();
		
		Thread.sleep(2000);
		a.navigate().refresh();
		//a.close();
		a.quit();
		
		
		
	}

}
