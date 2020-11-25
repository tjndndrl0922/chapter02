package com.javaex.ex08;

//메소드 오버로드 예제

public class Math {
	//필드 - 꼭있어야 되는건 아님 --> 생략
	
	//생성자 - 무조건 하나는 있어야 함. 안써도 디폴트 값으로 하나 가지고 있음.
	//public Math() {} 기본적인 생성자 ----> 생략
	
	//메소드 -getter, setter
		
	//메소드 - 일반 메소드
	public int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public double plus(double a, double b) {
		double sum = a+b;
		return sum;
		
	}
}
