package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {

		//배열만들기
		Shape[] sArray = new Shape[2];

		//사각형 만들기
		Shape r01 = new Ractangle("빨강", "빨강", 10, 10);
		
		//원 만들기
		Shape c01 = new Circle("파랑", "파랑", 20);

		//배열에 주소값 대입
		sArray[0] = r01;
		sArray[1] = c01;
		
		
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		/*
		//문제발생
		Shape s = new Shape("빨강","검정");
		s.draw();
		*/
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}
	
}
