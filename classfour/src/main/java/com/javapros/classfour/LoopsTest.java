package com.javapros.classfour;

class Loop {

}

public class LoopsTest {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		int j = 1;
		do {
			System.out.println(j);
			++j;
		} while (j <= 5);

		for (int k = 1; k <= 10; k++) {
			
			for(int m = 1; m<=10; m++) {
				
				System.out.println(k+"*"+m+"="+k*m);
				//System.out.println();
			}
			
			System.out.println();

		}

		int week = 5;
		String day;

		switch (week) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid day";
			break;
		}
		System.out.println(day);
	}

}
