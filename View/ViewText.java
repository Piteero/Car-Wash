package com.CarWash.View;

public class ViewText
{

	public static void menu()
	{
		System.out.println(				"   *** MENU ***\n[1] Dodaj nowe mycie.\n[2] Usuń mycie.\n[3] Przeglądaj mycia.\n[4] Przeglądaj wpłaty.\n[5] Wyjście z programu");
	}

	public static void exit()
	{
		System.out.println("Poprawne wyjście z programu");
	}

	public static void menuOrExit()
	{
		System.out.println("Wciśnij [P] jeśli chcesz wrócić do menu, lub jakikolwiek przycisk aby wyjść");
	}

	public static void properExit()
	{
		System.out.println("Poprawne wyjście z programu");
	}

	public static void passTypeOfVehicle()
	{
		System.out.println("Podaj typ auta [1-osobowe, 2-dostawcze]: ");
	}

	public static void passWashTypeOptionForPersonalCar()
	{
		System.out.println("Podaj rodzaj mycia auta osobowego [1-podstawowe, 2-rozszerzone, 3-pełne]: ");
	}

	public static void passWashTypeOptionForDeliveryCar()
	{
		System.out.println("Podaj rodzaj mycia auta dostawczego [1-podstawowe, 2-rozszerzone, 3-pełne]: ");
	}

	public static void wrongChoice()
	{
		System.out.println("Niepoprawny wybór");
	}

	public static void passDate()
	{
		System.out.println("Podaj datę [rrrr-mm-dd]: ");
	}

	public static void recordAdded()
	{
		System.out.println("Dodano rekord do bazy");
	}

	public static void recordNotAdded()
	{
		System.out.println("Nie dodano rekordu do bazy\n");
	}

	public static void passWashIdForDelete()
	{
		System.out.println("Podaj numer [id] mycia, które chcesz usunąć: ");
	}

	public static void recordDeleted()
	{
		System.out.println("Usunięto rekord");
	}

	public static void showWashes()
	{
		System.out.println("Wskaż, ile ostatnich myć chcesz przejrzeć: ");
	}

	public static void showPayments()
	{
		System.out.println("Ile ostatnich wpłat chcesz przeglądnąć?: ");
	}

}
