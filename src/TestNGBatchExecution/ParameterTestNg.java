package TestNGBatchExecution;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNg {

	@Parameters({"xyz","abc"})
	@Test
	public void demo(@Optional("this is demo")String value,@Optional("this is optional") String g)
	{
		System.out.println(value);
		System.out.println(g);
	}
	@Parameters("name")
	@Test
	public void demo1(@Optional("this is name")String name)
	{
		System.out.println(name);
	}
}
