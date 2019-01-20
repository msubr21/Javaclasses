package com.javapros.classfive;

public class AutoBoxingTest {


	public static void main(String[] args) {
		byte bVal = 120;
		Byte abBResult = bVal;
		System.out.println("Autoboxing byte Value::" + abBResult);

		short sVal = 2;
		Short abSResult = sVal;
		System.out.println("Autoboxing short Value::" + abSResult);

		int iVal = -10000000;
		Integer result = iVal;
		System.out.println("AutoBoxing int result::" + result);

		float fVal = 2.5f;
		Float floatResult = fVal;
		System.out.println("AutoBoxing float Result::" + floatResult);

		long lVal = 564798275;
		Long abLResult = lVal;
		System.out.println("Autoboxing long Value::" + abLResult);

		double dVal = 564798275;
		Double abDResult = dVal;
		System.out.println("Autoboxing double Value::" + abDResult);

		char cVal = 'c';
		Character abCResult = cVal;
		System.out.println("Autobxing char Value::" + abCResult);

		boolean booleanVal = true;
		Boolean abBoResult = booleanVal;
		System.out.println("Autobxing boolean Value::" + abBoResult);

		Byte wBVal = 100;
		byte wBResult = wBVal;
		System.out.println("Unboxing Byte result::" + wBResult);

		Short wSVal = 32767;
		short wSResult = wSVal;
		System.out.println("Unboxing Short result::" + wSResult);

		Integer wVal = 10;
		int wresult = wVal;
		System.out.println("Unboxing Integer result::" + wresult);

		Float wFVal = 2.509f;
		float wFresult = wFVal;
		System.out.println("Unboxing Float result::" + wFresult);

		Long wLVal = 59475579874598247L;
		long wLresult = wLVal;
		System.out.println("Unboxing Long result::" + wLresult);

		// Exploring methods on wrapper classes

		int comparedResult = wVal.compareTo(10);
		System.out.println("compared Result" + comparedResult);

		boolean bResult = wVal.equals(10);
		System.out.println("Equals Result check::" + bResult);

		float fResult = wVal.floatValue();
		System.out.println("Float Value of Integer::" + fResult);

		int leadZeros = Integer.numberOfLeadingZeros(2000);
		System.out.println("Result::" + leadZeros);

		Integer.compare(2, 3);
		System.out.println("compare" + Integer.compare(2, 3));

		System.out.println(Integer.reverse(10)); // Need to understand this
		
		//wBVal.byteValue();
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(wBVal.hashCode());
		
		
		// Integer.SIZE

	}

}
