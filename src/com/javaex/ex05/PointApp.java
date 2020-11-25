package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(4);
		p1.setY(5);
		p1.draw();
		
		Point p2 = new Point(8,2);
		p2.draw();
		
		Point p3 = new Point(2,2);
		p3.draw();
		
		Point p4 = new Point(1);
		p4.setY(6);
		p4.draw();
		
		
	}
}
