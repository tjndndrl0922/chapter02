package com.javaex.ex04;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(100000);
		computer.showInfo();
		
		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		
		
		
		
	}

}
