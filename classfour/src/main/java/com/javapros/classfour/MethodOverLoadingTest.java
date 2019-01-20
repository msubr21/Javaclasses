package com.javapros.classfour;

class MethodOverLoading {

	int add(int a, int b) {

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

		MethodOverLoading methodOverLoading = new MethodOverLoading();
		int sum = methodOverLoading.add(2, 5);
		System.out.println("sum of two digits from main::" + sum);
		
		int sumOfThree = MethodOverLoading.add(2,3,4);
		System.out.println("Sum of three digits:" +sumOfThree);
		
		float SumOfFour = MethodOverLoading.add(2, 3, 4, 2.5f);
		System.out.println("Sum of Four digits:" +SumOfFour);

	}

}
