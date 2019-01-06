package com.javapros.classtwo;

class Triangle {
	int base;
	int height;
	static String triangle;
	static {
		triangle = "Triangle";
	}

	public Triangle() {
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public void calaculateArea() {
		float area = (0.5f) * base * height;
		System.out.println("triangle area:   " +area);

	}

}

public class TriangleTest {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(5, 10);
		triangle.calaculateArea();
	}

}
