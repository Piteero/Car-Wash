package com.CarWash.Calculation;

import java.sql.PreparedStatement;

import com.CarWash.View.ViewText;

public class DeleteWash
{
	public static void deleteWash() throws Exception
	{

		chooseWashToDelete();
	}

	public static void chooseWashToDelete()
	{
		ViewText.passWashIdForDelete();
		CalculationScanner.scanner();
		int number = CalculationScanner.scanner().nextInt();

		try
		{
			GetConnection.getConnection();
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("DELETE FROM myjnia WHERE Id='" + number + "'");
			preparedStatement.executeUpdate();
			ViewText.recordDeleted();
			preparedStatement.close();
		} catch (Exception e)
		{
			ViewText.recordNotAdded();
			System.out.println(e.getMessage());
		}
	}
}
