package com.javaex.ex08;

public class MathApp {
	
	public static void main(String[] args) {
		
		Math myMath = new Math();
		
		int sum01 = myMath.plus(3, 5);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(4.5,5.1);
		System.out.println(sum02);
	}

}
