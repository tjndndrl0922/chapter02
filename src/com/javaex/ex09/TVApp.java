package com.javaex.ex09;

public class TVApp {
	
	public static void main(String[] args) {
		
		TV tv = new TV(7,20,true);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volum(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		
		
		
		
	}

}
