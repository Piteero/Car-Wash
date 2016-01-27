package com.CarWash.Calculation;

import com.CarWash.View.ViewText;

public class Repeat
{
	public static void repeat() throws Exception
	{
		chooseActionAfterExecuteOperation();
	}

	public static void chooseActionAfterExecuteOperation() throws Exception
	{
		
			
			CalculationScanner.scanner();
			System.out.println();
			ViewText.menu();
			int letter = CalculationScanner.scanner().nextInt();
			if (letter==1||letter==2||letter==3||letter==4||letter==5)
			{
				System.out.println();
				switch (letter)
				{
				case 1:
					AddNewWash.addNewWash();
					Repeat.repeat();
					break;
				case 2:
					DeleteWash.deleteWash();
					Repeat.repeat();
					break;
				case 3:
					Browse.browse();
					Repeat.repeat();
					break;
				case 4:
					CheckPayments.checkPayments();
					Repeat.repeat();
					break;
				case 5:
					ViewText.exit();
					break;
				}
			} 
//			else
//			{
//				ViewText.properExit();
//			}
			
			CalculationScanner.scanner().close();

		
	}
}
