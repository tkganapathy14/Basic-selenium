package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String exptitle="AlertsDemo";
	String ParentId=driver.getWindowHandle();
	Thread.sleep(5000);
	driver.findElement(By.id("newTabsBtn")).click();
	Set<String> AllId=driver.getWindowHandles();
	AllId.remove(ParentId);
	for(String id:AllId)
	{
		driver.switchTo().window(id);
		try {
		if(driver.findElement(By.id("firstName")).isDisplayed()){
		//(driver.getTitle().contains(exptitle)) {
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
		}catch(Exception e)
		{
			driver.close();
		}
	}
	Thread.sleep(4000);
	driver.quit();
	}

}
