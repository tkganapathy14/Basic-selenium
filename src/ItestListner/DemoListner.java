package ItestListner;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Itest.class)
public class DemoListner {

	@Test
	public void TestCase()
	{
		System.out.println("this is a test case");
		//assertEquals(false, true);
	}
}
