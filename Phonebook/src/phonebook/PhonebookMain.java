package phonebook;

import java.util.*;

public class PhonebookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Service s1 = new Service();

		Person newPerson = new Person();

		Address a1 = new Address("Shop Pl.", "Jackson", "TN", "38562");
		Person p1 = new Person("Martin Short", "9852367154", a1);

		s1.addPerson(p1);

		Address a2 = new Address("3421 Forest Ln.", "Orlando", "FL", "58743");
		Person p2 = new Person("Amy Keny", "9853214568", a2);
		s1.addPerson(p2);

		Address a3 = new Address("1780 Goldsboro Dr.", "Norfolk", "VA", "98745");
		Person p3 = new Person("Carl Henry Lester Reed", "7524625821", a3);
		s1.addPerson(p3);

		int choice = 0;

		do {

			choice = mainMenu();
			switch (choice) {

			case 1:
				System.out.println("------------------Displaying Contacts------------------\n");
				s1.sortPhonebook();
				s1.printphonebook();
				break;

			case 2:
				// add new entry
				System.out.println("Please enter your new info as shown in the following: ");
				System.out.println("ex: Harry James Potter, 6724016820, 445 Scheelys Knob Ln., Eurica, CO, 51097");
				String newEntryInput = sc.nextLine(); // user enters long string w/commas,,,,
				String[] splitInputArray; // need to break down user input to workable array
				splitInputArray = newEntryInput.split(",");
				String wholeName = splitInputArray[0]; //
				String phoneNumber = splitInputArray[1];
				String street = splitInputArray[2]; //
				String city = splitInputArray[3];
				String state = splitInputArray[4];
				String zip = splitInputArray[5];
				newPerson = new Person(wholeName, phoneNumber, new Address(street, city, state, zip));
				s1.addPerson(newPerson);
				System.out.println("Entry Accepted");
				newPerson.printPerson();
				break;
			case 3:
				Person deletePerson = new Person();
				System.out.println("To delete a record, enter a phone number to search using the following format ");
				String numberToDelete = sc.nextLine();
				s1.searchByPhone(numberToDelete);
				s1.deleteEntry(numberToDelete);
				System.out.println("Item deleted");
				System.out.println("--------------------------------------------------------------------------------");
				break;

			case 4:
				System.out.println("Enter a full name to search: ");
				wholeName = sc.nextLine();
				s1.searchFullName(wholeName);
				break;
			case 5:
				System.out.println("Enter a first name to search: ");
				String firstName = sc.nextLine();
				s1.searchFirstName(firstName);
				break;
			case 6:
				System.out.println("Enter a last name to search: ");
				String lastName = sc.nextLine();
				s1.searchLastName(lastName);
				break;

			case 7:
				System.out.println("Enter a telephone number to search by:");
				phoneNumber = sc.nextLine(); // already used this variable in case 1, is this a problem??
				s1.searchByPhone(phoneNumber);
				break;

			case 8:
				System.out.println("Please enter a city or state: ");
				String cityOrState = sc.nextLine();
				s1.searchCityOrState(cityOrState);
				break;

			case 9:
				s1.printphonebook();
				System.out.println("To update a record, enter a phone number to search: ");
				phoneNumber = sc.nextLine();
				s1.searchByPhone(phoneNumber);

				System.out.println(
						"If this number is correct, please add your updates. Be sure to include the entire listing, eg:");
				System.out.println("full name, phone number, street, city, state, zipcode");
				s1.updateByPhone(phoneNumber);

				newEntryInput = sc.nextLine();
				splitInputArray = newEntryInput.split(",");
				wholeName = splitInputArray[0];
				street = splitInputArray[2];
				city = splitInputArray[3];
				state = splitInputArray[4];
				zip = splitInputArray[5];
				int listingToUpdate = 0;
				Person updatedPerson = new Person(wholeName, phoneNumber, new Address(street, city, state, zip));
				s1.phoneBook[listingToUpdate] = updatedPerson;
				System.out.println("\nSUCCESS! The following entry has been updated.\n");
				updatedPerson.printPerson();
				break;

			case 10:
				System.out.println("Thank you!");
				System.exit(0);
				break;
			default:
				System.out.println("Something went wrong. Please try again.");
				break;
			}

		} while (choice != 10);
	}

	public static int mainMenu() {
		Scanner in = new Scanner(System.in);

		System.out.println("+++++++++++++++++++++MAIN MENU++++++++++++++++++++++");
		System.out.println();
		System.out.println("1: Display existing contacts. ");
		System.out.println("2: Add a new contact.");
		System.out.println("3: Delete a contact. ");
		System.out.println("4: Search contacts by Full Name.");
		System.out.println("5: Search contacts by First Name.");
		System.out.println("6: Search contacts by Last Name. ");
		System.out.println("7: Search contacts by phone number.");
		System.out.println("8: Search contacts by city or state.");
		System.out.println("9: Update contact by entering phone number.");
		System.out.println("10: To Exit");

		int choice = in.nextInt();
		System.out.println();
		return choice;
	}

}
