package midterm1Person;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber,
			String eMailAddress, String office, double salary,
			MyDate dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, eMailAddress, office, salary,
				dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty  " + super.getName();
	}
}
