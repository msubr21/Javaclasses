package com.javapros.classfour;

class MinMax {
	int x;
	int y;

	public MinMax(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int minDetails() {

		return (x < y) ? x : y;

	}

	public int maxDetails() {
		return (x > y) ? x : y;
	}

}

public class MinMaxTest {

	public static void main(String[] args) {

		MinMax minMax = new MinMax(3, 1);
		int minValue = minMax.minDetails();
		System.out.println("Min Value:" + minValue);
		int maxValue = minMax.maxDetails();
		System.out.println("MaxValue: " + maxValue);

	}
	
	//use if else and try

}
