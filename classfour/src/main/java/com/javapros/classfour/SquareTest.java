package com.javapros.classfour;

class ObjectSquare {
	private int side;

	public ObjectSquare(int side) {
		super();
		this.side = side;
	}

	int area() {
		int area = side * side;
		System.out.println("Area of the Square::" + area);
		return area;

	}
}

public class SquareTest {

	public static void main(String[] args) {

		ObjectSquare square1 = new ObjectSquare(5);
		int totalArea = square1.area();
		System.out.println("Area::" + totalArea);

	}

}
