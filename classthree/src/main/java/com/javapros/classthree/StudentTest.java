package com.javapros.classthree;

class Student {

	protected int rollNo;
	protected String studentName;
	protected int age;
	protected String spec;
	protected String university;

	// Default constructor
	public Student() {
	}

	// constructor
	public Student(int rollNo, String studentName, int age, String spec, String university) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.age = age;
		this.spec = spec;
		this.university = university;
	}

	// Method
	void studentDetails() {

		System.out.println("RollNo: " + rollNo + "; studentName: " + studentName + "; Age: " + age + "; Specilization: "
				+ spec + "; University: " + university);

	}

}

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(226, "Murali", 30, "EEE", "SITAMS");
		student1.studentDetails();

	}

}
