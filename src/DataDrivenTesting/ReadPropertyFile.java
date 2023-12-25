package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./Test data DDT/data.properties");
		Properties property = new Properties();
		property.load(fis);
		String value = property.getProperty("url");
		System.out.println(value);
		System.out.println(property.getProperty("un"));
		System.out.println(property.getProperty("pwd"));
		System.out.println(property.getProperty("mobile"));
		System.out.println(property.getProperty("gmail"));
	}

}
