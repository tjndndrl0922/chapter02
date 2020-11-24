package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	/*
	//메소드-겟터 /세터
	//setX() 이름등록
	public void setX(int x) {
		this.x = x;
	}

	//getX() X읽기
	public int getX() {
		return x;
	}
	
	//setY() 이름등록
	public void setY(int y) {
		this.y= y;
	}
	
	//getY() Y읽기
	public int getY() {
		return y;
	}
	*/
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}

}
