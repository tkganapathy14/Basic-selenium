package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("start-maximized");
		option.addArguments("--headless");
		option.addArguments("--incognito");
		System.out.println("headless started");
		
		WebDriver driver=new ChromeDriver(option);
		System.out.println("browser launched");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		System.out.println("im in Ajio");
		
	}

}
