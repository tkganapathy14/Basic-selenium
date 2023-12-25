package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
WebElement searchbutton=driver.findElement(By.id("small-searchterms"));
searchbutton.sendKeys("Hello");
//searchbutton.clear();

	}

}
