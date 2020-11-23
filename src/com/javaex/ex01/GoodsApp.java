package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		String name = camera.getName();
		System.out.println(name);
		
		camera.setPrice(400000);
		int price = camera.getPrice();
		System.out.println(price);
		
		//캡슐화 때문에 사용 불가.
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/

		Goods computer = new Goods();
		computer.setName("LG그램");
		String name1 = computer.getName();
		System.out.println(name1);
		
		computer.setPrice(1000000);
		int price1 = computer.getPrice();
		System.out.println(price1);
		
		//캡슐화 때문에 사용 불가
		/*
		computer.name = "LG그램";
		computer.price = 1000000;
				
		System.out.println(computer.name);
		System.out.println(computer.price);
		*/
		

		Goods cup = new Goods();
		cup.setName("머그컵");
		String name2 = cup.getName();
		System.out.println(name2);
		
		cup.setPrice(2000);
		int price2 = cup.getPrice();
		System.out.println(price2);
	
		//캡슐화 때문에 사용 불가
		/*
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		
		
	}

}
