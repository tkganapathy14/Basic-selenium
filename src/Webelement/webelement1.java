package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@value='Search store']")).submit();
		WebElement element=driver.findElement(By.linkText("Log in"));
		System.out.println("the text is : "+element.getText());
		System.out.println("the tag name of login is: "+element.getTagName());
		
		
		WebElement ele=driver.findElement(By.id("small-searchterms"));
		System.out.println(ele.getAttribute("value"));//search store
		ele.sendKeys("this is ganapathy");
		System.out.println(ele.getAttribute("value"));//this is ganapathy
		
		System.out.println(ele.getLocation().x);
		System.out.println(ele.getLocation().y);
		System.out.println("******************");
		System.out.println(ele.getSize().height);
		System.out.println(ele.getSize().width);
		System.out.println("******************");
		System.out.println(ele.getRect().x);
		System.out.println(ele.getRect().y);
		System.out.println(ele.getRect().width);
		System.out.println(ele.getRect().height);
		
		
		
	}

}
