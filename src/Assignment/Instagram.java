package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	String Expuname="7207792375";
	String Exppword="Ganapathy@97";
	String ExpTitle="Instagram";
	System.out.println("URL of the page : "+driver.getCurrentUrl());
//	System.out.println("Title of Page is : "+driver.getTitle());
	if(ExpTitle.equals(driver.getTitle()))
		{
		System.out.println("Title of page : "+driver.getTitle()+" is Passed");
		}
	else
	{
		System.out.println("Title of page is Failed");
	}
	
	WebElement tk1=	driver.findElement(By.xpath("//input[@name=\"username\"]"));
		tk1.sendKeys("7207792375");
	String ActualUsername=tk1.getAttribute("value");
		// System.out.println(ActualUsername);
		WebElement tk2=driver.findElement(By.name("password"));
		tk2.sendKeys("Ganapathy@97");
	String Actualpassword=tk2.getAttribute("value");
		// System.out.println(Actualpassword);
	if(Expuname.equals(ActualUsername)&& Exppword.equals(Actualpassword))
	{
		WebElement tk3=driver.findElement(By.xpath("//button[@type='submit']"));
		tk3.click();
		System.out.println("Login successful...");
	}
	else
	{
		System.out.println("***Invalid Credentials***");
		driver.quit();
	}
		
		
	}

}
