package MicroEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","./selenium app/msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.in/");
	}

}
