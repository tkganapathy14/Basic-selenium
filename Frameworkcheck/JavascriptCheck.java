package Frameworkcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import genericUtilities.webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("Log in"));
	//new method/approach object creation
		webdriverutility utility=new webdriverutility(driver);
		utility.clickonElement(element);
		
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		utility.enteringvalue(searchbox, "selenium");
	//old method object creation
//		webdriverutility utility=new webdriverutility();
//		utility.clickonElement(driver,element);
		utility.explicitlywait(10).until(ExpectedConditions.visibilityOfElementLocated((By.name("q"))));
		WebElement email = driver.findElement(By.id("Email"));
		utility.ActionReference().click(email).sendKeys("Ganapathy").perform();
		
		
	}

}
