package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println("URL of Application is : "+driver.getCurrentUrl());
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		String ExpectedTitle="Amazon Sign In";
		String Actualtitle=driver.getTitle();
		//validating Title of page
		if(ExpectedTitle.equals(Actualtitle))
		{
			System.out.println("Title of Page is : "+driver.getTitle());
		}
		else
		{
			System.out.println("Title of Page is Incorrect ");
		}
		String ExpUsername="7207792375";
		String ExpPassword="Ganapathy97";
		
		WebElement tk2= driver.findElement(By.id("ap_email"));
		tk2.sendKeys("7207792375");
		String ActualUsername=tk2.getAttribute("value");
		//System.out.println(tk2.getAttribute("value"));
		//System.out.println("username"+tk2.getAttribute("value"));
		driver.findElement(By.id("continue")).click();
		WebElement tk3= driver.findElement(By.id("ap_password"));
		tk3.sendKeys("Ganapathy97");
		String ActualPassword=tk3.getAttribute("value");
		//System.out.println(tk3.getAttribute("value"));
		
		// checking remember me check box
		WebElement tk1=driver.findElement(By.name("rememberMe"));
		System.out.println("Is clicked Remember me check box : "+tk1.isSelected());
		tk1.click();
		System.out.println("Is clicked Remember me check box : "+tk1.isSelected());
	
		// validating Username and password
		if(ExpUsername.equals(ActualUsername)&& ExpPassword.equals(ActualPassword))
		{
			driver.findElement(By.id("signInSubmit")).click();
			System.out.println("Login Successful...");
			System.out.println("Welcome to Amazon Home page");
		}
		else
		{
			System.out.println("Invalid Credentials");
			driver.quit();
			
		}		
	}
}
