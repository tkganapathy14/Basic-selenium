package Frameworkcheck;

import java.time.LocalDateTime;

public class DatatimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time = LocalDateTime.now().toString();
		System.out.println(time);
		String update = time.replace(":","-");
		System.out.println(update);
		
		//get Directory
		String directory = System.getProperty("user.dir");
		System.out.println(directory);
	}

}
