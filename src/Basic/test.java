package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		ChromeDriver a=new ChromeDriver();
		a.get("https://www.google.com");
		//enter text in search textbox
		a.findElement(By.name("q")).sendKeys("youtube");
		
		//click on search button
		a.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
	}

}
