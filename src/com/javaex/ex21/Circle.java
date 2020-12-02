package com.javaex.ex21;

public class Circle extends Shape{

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void draw() {
		System.out.println("원-색:"+super.getFillColor()+"     원-라인:"+super.getLineColor()+"     반지름:"+radius);
	}
	
	public void area() {
		System.out.println("원의 넓이:"+radius*radius*3.14);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
				+ "]";
	}
	
	

	
	
}
