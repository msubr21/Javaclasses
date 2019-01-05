package com.javapros.classone;

public class Operators {

	public static void main(String[] args) {
		/**
		 * This is declaring and printing Arithmatic Operators
		 */
		int x = 2 * 3 + 5 / 10 + 3;
		System.out.println("the value of x is:" + x);

		/**
		 * This is to check the float value of the above expression
		 */
		float y = 2 * 3 + 5 / 10 + 3;
		System.out.println("the floating value of expression y is:" + y);
		/**
		 * checking the accuracy to decimals
		 */
		double z = 2 * (3 + 5) / 10 + 3;
		System.out.println("The precise value of the expression is:" + z);
		/**
		 * This is checking the Relational operators
		 */
		int p = 3;
		if (p != 3) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}
		if (p == 3 || p != 3) {
			System.out.println("Validated logical OR operator");
		}
		if (p == 3 && p != 3) {
			System.out.println("Dummy condition");
		} else {
			System.out.println("logical AND validated");
		}
		int k;
		k = 0;
		
		//System.out.println("value of K is:" + k + "	It's increment is:" + ++k);
		k++;
		System.out.println("The changed value of k is:" + k);
		System.out.println("test commit");

	}

}
