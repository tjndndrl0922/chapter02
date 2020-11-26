package com.javaex.ex11;

public class MymathApp {

	public static void main(String[] argrs) {

		int sum = Mymath.plus(5, 6);
		System.out.println(sum);

		double sum01 = Mymath.plus(487.14, 561.88);
		System.out.println(sum01);
		
		int sum02 = minus(100,10);
	}
	
	//메소드
	public static int minus(int a,int b) {
		return a-b;
	}
	
	

}
