package Advanceselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataproviderdemo {

	@DataProvider(name = "demodata")
	public Object[] dataprovider()
	{
		Object []obj= {"name","value"};
		return obj;
	}
	@Test(dataProvider = "demodata")
	public void testcase(String val)
	{
		System.out.println(val);
	}
	
}
