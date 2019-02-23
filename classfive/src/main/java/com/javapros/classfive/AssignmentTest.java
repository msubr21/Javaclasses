package com.javapros.classfive;

public class AssignmentTest {

	public static void main(String[] args) {

		String string1 = "Chaithanya";
		String string2 = "Kumar";
		System.out.println("String1 before adding String2:" + string1);
		System.out.println("String2 before adding String1:" + string2);

		string1 = string1 + string2;
		System.out.println("String1 after concat:" + string1);
		System.out.println("Length of string1:" + string1.length());
		System.out.println("Length of String2:" + string2.length());
		System.out.println("Differnce:" + (string1.length() - string2.length()));
		string2 = string1.substring(0, string1.length() - string2.length());
		System.out.println("String2 after swap:" + string2);
		string1 = string1.substring(string2.length());
		System.out.println("String1 after swap:" + string1);

		// Different index methods

		String sampleString = "hello hello java world, welcome...!";
		System.out.println("Length of String:" + sampleString.length());
		System.out.println("Substring starting the indices12,21:" + sampleString.substring(12, 22));
		System.out.println(sampleString.charAt(12));
		System.out.println(sampleString.concat("Murali"));
		System.out.println(sampleString.replaceAll(sampleString, "Murali"));
		System.out.println(sampleString.toUpperCase());
		System.out.println(sampleString.trim());
		System.out.println(sampleString.contains("hello"));

		// Comparing two strings

		/* using equals */

		String a = "murali";
		String b = "murali";
		String c = "murali";
		String d = "Chaithu";

		if (a == b) {
			System.out.println("both the strings are same");
		} else {
			System.out.println("Strings are unequal");

		}

		if (c == d) {
			System.out.println("both the strings are same");
		} else {
			System.out.println("Strings are unequal");

		}

		/* using equalsIgnore */

		if (a.contentEquals(b)) {
			System.out.println("both the strings are same");
		} else {
			System.out.println("Strings are unequal");

		}

		if (c.contentEquals(d)) {
			System.out.println("both the strings are same");
		} else {
			System.out.println("Strings are unequal");

		}

		/* compare */

		/* Reverse two strings */

		String input = "abcde";
		String output = "";
		System.out.println(input.length());

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}

		System.out.println(output);

		/* using String Buffer */
		/* append some other string and check for reference */

		String newInput = "abcde";
		StringBuilder newInput1 = new StringBuilder();
		newInput1.append(newInput);
		newInput1 = newInput1.reverse();
		System.out.println("Using String Builder:" + newInput1);
		
		/*Remove zeros from string*/
		
		String input1 = 00001234;
		System.out.println(input1.);

	}

}
