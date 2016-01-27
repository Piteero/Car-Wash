package com.CarWash.Calculation;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.CarWash.View.ViewText;

public class Browse
{
	public static void browse() throws Exception
	{

		chooseWashesToSee();
	}

	public static void chooseWashesToSee()
	{
		ViewText.showWashes();
		CalculationScanner.scanner();
		int number = CalculationScanner.scanner().nextInt();

		try
		{
			GetConnection.getConnection();
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("SELECT * FROM myjnia ORDER BY data DESC LIMIT " + number + " ");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{
				int id = resultSet.getInt("Id");
				String type = resultSet.getString("typauta");
				String kind = resultSet.getString("rodzajmycia");
				int cost = resultSet.getInt("cena");
				Date date = resultSet.getDate("data");
				System.out.println("Id płatności: " + id + " ,typ auta: " + type + " ,rodzaj mycia: " + kind
						+ " ,cena: " + cost + "zł ,data: " + date);
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
