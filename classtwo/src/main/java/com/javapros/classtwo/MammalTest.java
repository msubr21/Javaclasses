package com.javapros.classtwo;

class Mammal {

	private String name;
	private final int age;
	private String gender;
	private String foodhabit;
	private String mammarygland;
	private String hairandfur;
	private final static String category = "Mammal";

	public Mammal(String name, int age, String gender, String foodhabit, String mammarygland, String hairandfur) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.foodhabit = foodhabit;
		this.mammarygland = mammarygland;
		this.hairandfur = hairandfur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	//public void setAge(int age) {
	//	this.age = age;
	//}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFoodhabit() {
		return foodhabit;
	}

	public void setFoodhabit(String foodhabit) {
		this.foodhabit = foodhabit;
	}

	public String getMammarygland() {
		return mammarygland;
	}

	public void setMammarygland(String mammarygland) {
		this.mammarygland = mammarygland;
	}

	public String getHairandfur() {
		return hairandfur;
	}

	public void setHairandfur(String hairandfur) {
		this.hairandfur = hairandfur;
	}

	void printMammalDetails() {
		// String namex = "Gomathi";
		// name = namex;
		System.out.println("Name::	" + name + ";Age::	" + age + ";	Gender::	" + gender + ";	foodhabit::	"
				+ foodhabit + "  " + category);

	}
}

public class MammalTest {

	public static void main(String[] args) {
		Mammal cow = new Mammal("Goms", 10, "Female", "Veg", "Yes", "Yes");
		cow.getAge();
		System.out.println("Age:: "+cow.getAge());
		//cow.setAge(20);
		System.out.println("New Age:: "+cow.getAge());
		cow.printMammalDetails();
		}

}
