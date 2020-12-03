package com.javaex.ex22;

public class Triangle extends Shape implements Drawable{

	private int width;
	private int height;

	public Triangle() {
		super();

	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("삼각형-색:"+super.getFillColor()+"     삼각형-라인:"+super.getLineColor()+"     삼각형 세로:"+height+"     삼각형 가로:"+width);
	}
	
	public double area() {
		return width*height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}

	
	

}
