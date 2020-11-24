package com.javaex.ex01;

public class Goods {
	
	//필드
	private String name;
	private int price;
	/*
	//생성자
	//메소드-겟터/세터
	
	//메소드-일반
	//setName() 이름 등록
	public void setName(String name) {
		this.name = name; //"니콘" "LG그램" "머그컵"
	}
	
	//getName() 이름 읽기
	public String getName() {
		return name;
	}
	
	//setPrice() 가격등록
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getPrice() 가격읽기	
	public int getPrice() {
		return price;
	}
	*/

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : "+ name + ", 가격  : "+price);
	}

}
