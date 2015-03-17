package midterm1Person;

public class Person {
	// A person has a name, address, phone number, and email address.

	private String name;
	private String address;
	private String phoneNumber;
	private String eMailAddress;

	private Person() {
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
		this.eMailAddress = "";
	}

	public Person(String name, String address, String phoneNumber,
			String eMailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMailAddress = eMailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	@Override
	public String toString() {
		return "Person  " + getName();
	}
}
