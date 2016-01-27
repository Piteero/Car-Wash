package com.CarWash.Calculation;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection
{

	public static Connection getConnection() throws Exception
	{

		return getConnectionToTheDatabase();

	}

	public static Connection getConnectionToTheDatabase() throws Exception
	{
		try
		{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://mysql6.superhost.pl:3306/sh201912_myjnia";
			String username = "sh201912_prac";
			String password = "myjnia123";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e)
		{
			System.out.println(e);
		}

		return null;
	}

	public static void main(String[] args) throws Exception
	{

		GetConnection.getConnection();

	}

}
