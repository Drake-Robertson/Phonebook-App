package phonebook;

public class Phone {
	
	private long phoneNumber;
	
	
	
public Phone() {
	
}

	

	public Phone(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

	public void printPhoneNumber() {
		System.out.println("\nPhone Number: " + formatPhone(phoneNumber));
	}

	public String formatPhone(long phone) {
		String newPhone = Long.toString(phone);
		String formattedPhone = "(" + newPhone.substring(0, 3) + ") " + newPhone.substring(3, 6) + "-"
				+ newPhone.substring(6);

		return formattedPhone;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}