package JDBC_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Driver;

public class Mysql_Read {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver=new Driver();
		//connecting database
		Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/qspiders","root","root");
		java.sql.Statement statement = connection.createStatement();
		//read data from database
		ResultSet result = statement.executeQuery("select * from batchdata");
		while(result.next())
		{
			System.out.println(result.getString(2));
		}
		//closing connection
		connection.close();
	}

}
