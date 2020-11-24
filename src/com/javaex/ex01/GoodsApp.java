package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		
		/*
		camera.setName("니콘");
		String cameraName = camera.getName();
		//System.out.println(name);
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice();
		//System.out.println(price);
		//System.out.println("상품이름: "+name + ", 가격: " + price);
		camera.showInfo();
		
		//캡슐화 때문에 사용 불가.
		
		camera.name = "니콘";
		camera.price = 400000;
		
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		
		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();
		/*
		computer.setName("LG그램");
		String computerName = computer.getName();
		//System.out.println(name1);
		
		computer.setPrice(1000000);
		int computerPrice = computer.getPrice();
		//System.out.println(price1);
		//System.out.println("상품이름: "+name1 + ", 가격: " + price1);
		computer.showInfo();
		//캡슐화 때문에 사용 불가
		
		computer.name = "LG그램";
		computer.price = 1000000;
				
		System.out.println(computer.name);
		System.out.println(computer.price);
		*/
		

		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		/*
		cup.setName("머그컵");
		String cupName = cup.getName();
		//System.out.println(name2);
		
		cup.setPrice(2000);
		int cupPrice = cup.getPrice();
		//System.out.println(price2);
		//System.out.println("상품이름: "+name2 +", 가격: " + price2);
		cup.showInfo();
		//캡슐화 때문에 사용 불가
		
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
