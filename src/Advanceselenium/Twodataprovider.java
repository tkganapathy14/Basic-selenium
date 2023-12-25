package Advanceselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Twodataprovider {

	@DataProvider(name="demo")
	public Object[][] datap()
	{
		Object [][]obj= {{"name","value"},{"place","phone"}};
		return obj;
	}
	@Test(dataProvider = "demo")
	public void testscripts(String name,String val)
	{
		System.out.println(name);
		System.out.println(val);
	}
}
