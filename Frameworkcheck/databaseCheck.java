package Frameworkcheck;

import java.util.ArrayList;

import genericUtilities.databaseUtility;

public class databaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		databaseUtility utility=new databaseUtility();
		utility.Establishconnection();
		ArrayList data = utility.ReadindDataFromDatabase("select * from batchdata","Name");
	System.out.println("data from database: "+data);
//		for(Object obj:data)
//		{
//			System.out.println(data);
//		}
//		utility.closingConnection();
	}

}
