package com.javapros.classtwo;

class Student {
	String studentName;
	int rollNo;
	String spec;
	int age;
	static String schoolName;

	static {
		schoolName = "SITAMS";
	}

	public Student() {
	}

	public Student(String studentName, int rollNo, String spec, int age) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.spec = spec;
		this.age = age;
	}

	public Student(String studentName, int rollNo, int age) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.age = age;
	}

	void studentDetails() {

		System.out.println(
				"StudentName:  " + studentName + "RollNo::" + rollNo + "Specilization::	" + spec + "Age::	" + age);
	}

}

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Murali", 26, "EEE", 30);
		Student student2 = new Student("Chaithu", 26, "CSC", 29);
		student1.studentDetails();
		student2.studentDetails();
		
		float average = (student1.age+student2.age)/2f;
		System.out.println("Average Student Age   =" +average);

	}

}
