package com.javaex.ex20;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원-면색:" + super.getFillColor() + "\t원-라인색:" + super.getLineColor() + "\t반지름:"+radius);
	}
	
	public double area() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}

}
