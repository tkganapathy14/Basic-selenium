package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Webelement.Webelement;

public class DemowebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String ExpTitle="Demo Web Shop";
		String ExpEmail="tkganapathy16@gmail.com";
		
		String ExpPword="7207792375";
		driver.findElement(By.linkText("Log in")).click();
		WebElement tk1=driver.findElement(By.xpath("//input[@id='Email']"));
		tk1.sendKeys("tkganapathy16@gmail.com");
		String ActualEmail=tk1.getAttribute("value");
		WebElement tk2=driver.findElement(By.id("Password"));
		tk2.sendKeys("7207792375");
		String ActualPword=tk2.getAttribute("value");
		WebElement tk3=driver.findElement(By.name("RememberMe"));
		System.out.println(tk3.isSelected());
		tk3.click();
		System.out.println(tk3.isSelected());
		if(ExpEmail.equals(ActualEmail) && ExpPword.equals(ActualPword))
		{
			driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
			System.out.println("Login Successful...");
		}
		else
		{
			System.out.println("***Invalid Credentials***");
		}
		
		
		
	}

}
