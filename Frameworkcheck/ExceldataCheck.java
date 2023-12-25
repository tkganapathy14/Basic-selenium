package Frameworkcheck;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilities.ExcelUtility;

public class ExceldataCheck {

	@Test(dataProvider = "data",dataProviderClass =ExcelUtility.class)
	public void read(String a,String b)
	{
		System.out.println(a+" "+b);
	}
}
