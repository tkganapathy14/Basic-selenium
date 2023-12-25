package Frameworkcheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaCodedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./report1/reportname.html");
		file.mkdir();
		System.out.println("done");
		file.createNewFile();
		System.out.println("done");

		File f=new File("samp.html");
		f.createNewFile();
		System.out.println("yes");
		
		//java path
		Path p=Paths.get("demo.txt");
		Files.createFile(p);
	}

}
