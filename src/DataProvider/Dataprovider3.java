package DataProvider;

import org.testng.annotations.DataProvider;

public class Dataprovider3 {

	@DataProvider(name="login")
	public String[][] dataprovider()
	{
		String data [][]=new String[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="admin321";
		return data;
	}
	
}
