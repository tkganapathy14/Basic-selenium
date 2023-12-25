package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multibrowserpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle=driver.getWindowHandle();
		System.out.println("parent id : "+parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println("all window id's : "+handles);
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("ganapathy");
				System.out.println(driver.getWindowHandle());
			}
		}
		
	//	WebElement win = driver.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]"));
//		WebElement tab = driver.findElement(By.id("newTabBtn"));
//		Actions actions=new Actions(driver);
//		actions.click(tab);
	}

}
