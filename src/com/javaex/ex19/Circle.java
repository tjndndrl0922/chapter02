package com.javaex.ex19;

public class Circle {

	// 필드
	private String fillColor;
	private String lineColor;
	private int radius;

	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {

		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("원-면색:" + fillColor + "\t원-선색:" + lineColor + "\t반지름:"+radius);
	}

	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	

}
