package com.CarWash.Calculation;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.CarWash.View.ViewText;

public class CheckPayments
{
	public static void checkPayments() throws Exception
	{

		choosePaymentsToSee();

	}

	public static void choosePaymentsToSee()
	{
		ViewText.showPayments();
		CalculationScanner.scanner();
		int number = CalculationScanner.scanner().nextInt();

		try
		{
			GetConnection.getConnection();
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("SELECT Id, cena, data FROM myjnia ORDER BY data DESC LIMIT " + number + " ");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{
				int id = resultSet.getInt("Id");
				Date date = resultSet.getDate("data");
				int cost = resultSet.getInt("cena");
				System.out.println("Id: " + id + " ,data: " + date + " ,cena: " + cost + "zł");
			}
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
