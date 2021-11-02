package phonebook;

import java.util.Scanner;

public class Continue {
	
	public static boolean option(boolean flag) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to try again?");
		System.out.println("\n Yes = 1, No = 0");
		boolean exit = true;
		int choice = sc.nextInt();

		if (choice != 0) {
			exit = true;

		} else {
			exit = false;

		}
		return exit;
	}
	

}
