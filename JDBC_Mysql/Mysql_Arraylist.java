package JDBC_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

public class Mysql_Arraylist {

	
	public static ArrayList Readdata(String DbName,String query,String columnName) throws SQLException {
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/"+DbName,"root","root");
		Statement statement=connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		ArrayList list=new ArrayList();
		while(result.next())
		{
			list.add(result.getString(columnName));
		}
		connection.close();
		return list;
	}
	public static void main(String[] args) throws SQLException {
	System.out.println(Readdata("qspiders","select * from batchdata","Name"));
	}

}
