package JDBC_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Parameterised_mysql {

	public static void ReadingdataDB(String DbName,String query,String columnName) throws SQLException
	{
		Driver dbdriver=new Driver();
		Connection connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/"+DbName,"root","root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(columnName));
		}
	}
	public static void main(String[] args) throws SQLException {
		ReadingdataDB("qspiders","select * from batchdata where Name like'S%'","ContactNumber");
		ReadingdataDB("qspiders","select * from batchdata","Name");
		ReadingdataDB("qspiders","select * from batchdata where srNo=4","ContactNumber");


	}

}
