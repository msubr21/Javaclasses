package com.javapros.classfour;

class MethodOverLoading {

	// int a;
	// int b;
	// int c;
	// int d;
	// float e;

	static int add(int a, int b) {

		int c = a + b;
		return c;

	}
	
	static int add(int a, int b, int c) {
		
		int d = a+b+c;
		return d;
	}
	
	static float add(int a, int b, int c, float d) {
		float e = a+b+c+d;
		return e;
	}

}

public class MethodOverLoadingTest {

	public static void main(String[] args) {

		int sum = MethodOverLoading.add(2, 5);
		System.out.println("sum of two digits from main::" + sum);
		
		int sumOfThree = MethodOverLoading.add(2,3,4);
		System.out.println("Sum of three digits:" +sumOfThree);
		
		float SumOfFour = MethodOverLoading.add(2, 3, 4, (float) 2.5);
		System.out.println("Sum of Four digits:" +SumOfFour);

	}

}
