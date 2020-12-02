package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[3];
		Shape r1 = new Ractangle("레드","레드",10,10);
		Shape t1 = new Triangle("블루","블루",5,5);
		Shape c1 = new Circle("엘로우", " 엘로우", 20);
		
		sArray[0] = r1;
		sArray[1] = t1;
		sArray[2] = c1;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			sArray[i].area();
		}
		
		
	}

}
