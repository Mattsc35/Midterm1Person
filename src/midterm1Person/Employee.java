package midterm1Person;

public class Employee extends Person {

	private String office;
	private double salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phoneNumber,
			String eMailAddress, String office, double salary, MyDate dateHired) {
		super(name, address, phoneNumber, eMailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee  " + super.getName();
	}

}
