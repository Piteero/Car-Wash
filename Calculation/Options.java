package com.CarWash.Calculation;

import com.CarWash.View.ViewText;

public class Options
{
	public static void options() throws Exception
	{
		chooseMenuOption();
	}
	
	public static void chooseMenuOption()
	{
		
		try
		{
			ViewText.menu();
			CalculationScanner.scanner();
			int number = CalculationScanner.scanner().nextInt();
			switch (number)
			{
			case 1:
				AddNewWash.addNewWash();
				break;
			case 2:
				DeleteWash.deleteWash();
				break;
			case 3:
				Browse.browse();
				break;
			case 4:
				CheckPayments.checkPayments();
				break;
			case 5:
				ViewText.exit();
				break;
			}

		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
