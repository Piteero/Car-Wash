package com.CarWash.Calculation;

import java.sql.PreparedStatement;

import com.CarWash.View.ViewText;

public class AddNewWash
{

	public static void addNewWash() throws Exception
	{
		addNewWashAndSaveInTheDatabase();

	}

	public static void addNewWashAndSaveInTheDatabase()
	{
		int cost = 0;
		String typeOfVehicleString = "";
		String typeOfWashString = "";
		final int[] WASH_OPTION = { 10, 15, 20, 12, 17, 25 };
		ViewText.passTypeOfVehicle();
		CalculationScanner.scanner();
		int typeOfVehicle = CalculationScanner.scanner().nextInt();
		if (typeOfVehicle == 1)
		{
			ViewText.passWashTypeOptionForPersonalCar();
			int typeOfWash = CalculationScanner.scanner().nextInt();
			if (typeOfWash == 1)
			{
				cost = WASH_OPTION[0];
				typeOfWashString = "podstawowe";
			} else if (typeOfWash == 2)
			{
				cost = WASH_OPTION[1];
				typeOfWashString = "rozszerzone";
			} else if (typeOfWash == 3)
			{
				cost = WASH_OPTION[2];
				typeOfWashString = "pelne";
			}
			typeOfVehicleString = "osobowe";

		} else if (typeOfVehicle == 2)
		{
			ViewText.passWashTypeOptionForDeliveryCar();
			int typeOfWash = CalculationScanner.scanner().nextInt();
			if (typeOfWash == 1)
			{
				cost = WASH_OPTION[3];
				typeOfWashString = "podstawowe";
			} else if (typeOfWash == 2)
			{
				cost = WASH_OPTION[4];
				typeOfWashString = "rozszerzone";
			} else if (typeOfWash == 3)
			{
				cost = WASH_OPTION[5];
				typeOfWashString = "pelne";
			}
			typeOfVehicleString = "dostawcze";
		} else
		{
			ViewText.wrongChoice();
		}
		ViewText.passDate();
		String date = CalculationScanner.scanner().next();

		try
		{
			GetConnection.getConnection();
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("INSERT INTO myjnia VALUES (NULL, '" + typeOfVehicleString + "', '"
							+ typeOfWashString + "', '" + cost + "', '" + date + "')");
			preparedStatement.executeUpdate();
			ViewText.recordAdded();
			preparedStatement.close();
		} catch (Exception e)
		{
			ViewText.recordNotAdded();
			System.out.println(e.getMessage());
		}
	}
}
