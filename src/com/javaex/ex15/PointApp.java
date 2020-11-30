package com.javaex.ex15;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		System.out.println(p.toString());
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.showInfo();
	}

}
