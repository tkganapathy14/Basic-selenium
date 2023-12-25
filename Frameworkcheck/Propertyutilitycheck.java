package Frameworkcheck;

import genericUtilities.propertyUtility;

public class Propertyutilitycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		propertyUtility utility=new propertyUtility();
		System.out.println(utility.getdatafromPropertyfile("Username"));
	}
}
