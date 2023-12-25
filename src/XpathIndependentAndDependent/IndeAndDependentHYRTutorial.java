package XpathIndependentAndDependent;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeAndDependentHYRTutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> allelements=driver.findElements(By.xpath("//a[text()='Click']"));
		System.out.println(allelements.size());
		Thread.sleep(5000);

		for(WebElement element:allelements) {
			element.click();
		}

		Thread.sleep(5000);

		driver.quit();
	}

}
