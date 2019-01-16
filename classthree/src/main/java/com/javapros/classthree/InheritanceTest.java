package com.javapros.classthree;

class SuperStudent extends Student {
	String ability;

	public SuperStudent(String ability) {
		super();
		this.ability = ability;
	}

	public SuperStudent(int rollNo, String studentName, int age, String spec) {
		super(rollNo, studentName, age, spec, null);

	}

	
	
	public SuperStudent(int rollNo, String studentName, int age, String spec, String university, String ability) {
		super(rollNo, studentName, age, spec, university);
		this.ability = ability;
	}

	void superStudentDetails() {

		System.out.println("RollNo: " + rollNo + "; studentName: " + studentName + "; Age: " + age + "; Specilization: "
				+ spec + "; University: " + university + "; Ability:" + ability);

	}
}

public class InheritanceTest {

	public static void main(String[] args) {

		// just a check when the Variables/fields are Private
		Student student1 = new Student(226, "Chaithanya", 30, "EEE", "SITAMS");
		student1.studentDetails();

		SuperStudent student2 = new SuperStudent(226, "Murali", 30, "EEE", "SITAMS", "");
		student2.superStudentDetails();

		student2.studentDetails();

	}

}
