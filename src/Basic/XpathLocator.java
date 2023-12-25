package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {//Absolute method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("7207792375");
		driver.findElement(By.name("password")).sendKeys("Ganapathy@97");
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div[1]/div[3]/button/div")).click();
		//driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	//driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div/div/div/section/main/div/div/div[1]/div[2]/form/div/div[3]/button//div/\r\n")).click();
	driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div[1]/div[3]/button/div[1]")).click();		
	}

}
//html/body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div[1]/div[3]/button/div[1]
//html/body/div[2]/div/div/div[2]/div/div/div/div/section/main/div/div/div[1]/div[2]/form/div/div[3]/button//div/
//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a
//html/body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div[1]/div[3]/button/div