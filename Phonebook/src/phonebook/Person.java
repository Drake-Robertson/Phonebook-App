package phonebook;

public class Person {

	private String firstName;
	private String fullName;
	private String lastName;
	private String phoneNumber;
	private Address address;

	public Person() {

	}

	public Person(String fullName, String phoneNumber, Address address) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}

	public void getFullName(String fullName) {
		this.fullName = fullName;

	}

	public void addAddress(String street, String city, String state, String zip) {
		Address tempAddress = new Address(street, city, state, zip);
		this.address = tempAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printPerson() {
		System.out.println(fullName + ", " + phoneNumber);
		address.printAddress();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;

	}

	public String getFirstName() {
		String[] info = fullName.split(" ");
		return firstName = info[0];
	}

	public String getLastName() {
		String[] arr = fullName.split(" ");
		return lastName = arr[arr.length - 1];
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void addAddress() {
	}

}