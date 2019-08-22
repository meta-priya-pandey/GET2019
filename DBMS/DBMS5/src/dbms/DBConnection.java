package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Priya Pandey
 * DBConnection class creates a connection and load the mysql driver
 *
 */
public class DBConnection
{
	static Connection connection;

	/**
	 * @return the connection reference
	 * method to create connection reference
	 */
	public static Connection getDBConnection()
	{
		try
		{

			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException occured");
			e.printStackTrace();
		}
		try
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost/storefrontdb", "root", "root");
			return connection;
		}
		catch (SQLException e)
		{
			System.out.println("SQLException occured");
			e.printStackTrace();
		}

		return null;
	}
}