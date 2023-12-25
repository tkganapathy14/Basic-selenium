package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemositeSelectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement element=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select select=new Select(element);
		System.out.println(select.isMultiple());//single selection
		select.selectByValue("Google");
		WebElement element1=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		Select select1=new Select(element1);
		select1.selectByVisibleText("Avatar");
		//multi select dropdown
		WebElement element2=driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Select select2=new Select(element2);
		select2.selectByValue("burger");
		select2.selectByVisibleText("Donut");
		select2.selectByIndex(3);
		select2.selectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());

		System.out.println("multi all selected options");
		List<WebElement>opti= select2.getAllSelectedOptions();
		for(WebElement op:opti)
		{
			System.out.println(op.getText());
		}

		// deselect Multiple option
		select2.deselectByIndex(1);
		select2.deselectByValue("bonda");
		select2.deselectByVisibleText("Pizza");
		select2.deselectAll();
		List<WebElement>options= select2.getOptions();
		System.out.println("multi select options");
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
			//System.out.println(opt.getAttribute("value"));
		}

	}

}
