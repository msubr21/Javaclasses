package com.javapros.classfive;

class Employee {

	private static String Org = "TCS";
	private int eID;
	private int age;
	private String designation;

	public Employee() {
		super();
	}

	public Employee(int eID, int age, String designation) {
		super();
		this.eID = eID;
		this.age = age;
		this.designation = designation;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", age=" + age + ", designation=" + designation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + eID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (eID != other.eID)
			return false;
		return true;
	}

}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee empMurali = new Employee();
		System.out.println(empMurali.toString());

		Employee empChaithanya = new Employee(2345, 29, "Developer");
		System.out.println();

		Employee empChaithanya1 = new Employee(2345, 29, "Developer");

		if (empChaithanya == empChaithanya1) {
			System.out.println("References equal");
		}

		if (empChaithanya.equals(empChaithanya1)) {
			System.out.println("Values equal");

		}
		System.out.println();

		main();

	}

	public static void main() {
		System.out.println("Overloaded Main");
	}

}
