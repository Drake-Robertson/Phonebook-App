package phonebook;

//import java.util.InputMismatchException;

public class Service {

	Person[] phoneBook = new Person[0];

	public void printphonebook() {
		for (int i = 0; i < phoneBook.length; i++) {
			phoneBook[i].printPerson();
		}
	}

	public void addPerson(Person newPerson) {

		Person temp[] = new Person[phoneBook.length + 1];

		for (int i = 0; i < phoneBook.length; i++) {
			temp[i] = phoneBook[i];
		}
		temp[temp.length - 1] = newPerson;

		phoneBook = temp;
	}

	public void deleteEntry(String numberToDelete) {

		Person temp[] = new Person[phoneBook.length - 1];
		int k = 0;

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getPhoneNumber().equals(numberToDelete)) {
				continue;
			}
			temp[k++] = phoneBook[i];
		}
		phoneBook = temp;
	}

	public void searchFullName(String fullName) {

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getFullName().toLowerCase().equals(fullName.toLowerCase())) {
				phoneBook[i].printPerson();
			}
		}
	}

	public void searchFirstName(String firstName) {

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getFirstName().toLowerCase().equals(firstName.toLowerCase())) {
				phoneBook[i].printPerson();
			}
		}
	}

	public void searchLastName(String lastName) {

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				phoneBook[i].printPerson();
			}
		}
	}

	public void searchByPhone(String phoneNumber) {

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getPhoneNumber().equals(phoneNumber)) {
				phoneBook[i].printPerson();
			}
		}
	}

	public int updateByPhone(String phoneNumber) {

		int listingToUpdate = 0;
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getPhoneNumber().equals(phoneNumber)) {
				listingToUpdate = i;
			}
		}
		return listingToUpdate;
	}

	public void searchCityOrState(String cityOrState) {

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].getAddress().getCity().equals(cityOrState)
					|| (phoneBook[i].getAddress().getState().equals(cityOrState))) {
				phoneBook[i].printPerson();

			}
		}
	}

	public void sortPhonebook() {

		for (int i = 0; i < phoneBook.length; i++) {
			for (int j = i + 1; j < phoneBook.length; j++) {
				if (phoneBook[i].getLastName().compareTo(phoneBook[j].getLastName()) > 0) {
					Person temp = phoneBook[i];
					phoneBook[i] = phoneBook[j];
					phoneBook[j] = temp;

				}
			}
		}
	}

}