package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	//메소드-겟터 /세터
	//setPointX() 이름등록
	public void setPointX(int px) {
		x =px;
	}

	//getPoint() X읽기
	public int getPointX() {
		return x;
	}
	
	//setPointY() 이름등록
	public void setPointY(int py) {
		y= py;
	}
	
	//getPointY() Y읽기
	public int getPointY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}

}
