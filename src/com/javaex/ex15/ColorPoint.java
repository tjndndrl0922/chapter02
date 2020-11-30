package com.javaex.ex15;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
	}

	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	//메소드 g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//일반 메소드
	public void showInfo() {
		System.out.println("Point:" + x + "," + y + " Color:" + color);
	}

	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}

}
