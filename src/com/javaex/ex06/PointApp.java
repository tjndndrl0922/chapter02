package com.javaex.ex06;

public class PointApp {
	
	public static void main(String[] args) {
	
	Point p1 = new Point();
	p1.setX(3);
	p1.setY(6);
	p1.draw();
	
	Point p2 = new Point(1,2);
	System.out.println(p1.toString());
	
	Point p3 = new Point(100,100);
	p3.draw(true);
	p3.draw(false);
	
	}

}
