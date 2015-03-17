package midterm1Person;

public class Student extends Person {
	private final String status;


	public Student(String name, String address, String phoneNumber,
			String eMailAddress, String status) {
		super(name, address, phoneNumber, eMailAddress);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Student " + super.getName();
	}

}
