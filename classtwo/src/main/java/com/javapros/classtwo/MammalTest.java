package com.javapros.classtwo;

class Mammal {

	String name;
	int age;
	String gender;
	String foodhabit;
	String mammarygland;
	String hairandfur;
	static String category;
	static {
		category = "Mammal";
	}

	//Default constructor
	public Mammal() {
	}
	//constructor with selected fields for creating instance
	public Mammal(String name, int age, String gender, String foodhabit) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.foodhabit = foodhabit;
	}

		
	public Mammal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void printMammalDetails() {
		//String namex = "Gomathi";
		//name = namex;
		System.out.println("Name::	" + name +";Age::	" +age  +";	Gender::	" +gender +";	foodhabit::	" +foodhabit +"  "+category);

	}
}

public class MammalTest {

	public static void main(String[] args) {
		Mammal cow = new Mammal();
		cow.name = "Gomathi";
		Mammal dog = new Mammal("Jimmy",5, "Male","Non-Veg");
		Mammal human = new Mammal("Rajni",65,"Male");
		cow.printMammalDetails();
		dog.printMammalDetails();
		human.printMammalDetails();

	}

}
