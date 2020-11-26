package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		System.out.println(Goods.totalCount);
		System.out.println(camera.toString());

		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();

		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		
		System.out.println(cup.getTotalCount());

		
	}

}
